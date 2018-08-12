/**
 * 
 */

var TodoForm = function(id){
	
	var form = document.getElementById("todo-form");
	
	this._currentTodoId = 0;
	
	this._nameInput = form.querySelector("#name");
	this._deadlineInput = form.querySelector("#deadline");
	this._descriptionInput = form.querySelector("#description");
	
	var that = this;
	
	this._populateForm = function(id){
		var getTodoRequest = new Request(CONSTANTS.todosUrl + id)
		
		fetch(getTodoRequest)
		.then(response => response.json())
		.then(todo => {
			that._nameInput.value = todo.name;
			that._deadlineInput.value = moment(todo.deadline, "DD/MM/YYYY").format("YYYY-MM-DD");
			that._descriptionInput.value = todo.description;
			that._currentTodoId = todo.id;
		});
	}
	
	this._onCreateTodo = function($event){
		var name = that._nameInput.value;
		var deadline = that._deadlineInput.value;
		var description = that._descriptionInput.value
		
		var requestBody = {
				"name": name,
				"deadline": deadline,
				"description": description
		};
		
		var requestOptions = {				
				body: JSON.stringify(requestBody),
				headers: {'Content-Type': 'application/json'}
		};

		if(id){
			requestOptions.method = 'PUT';
			requestBody.id = id;
		}else{
			requestOptions.method = 'POST';
		}
		
		requestOptions.body = JSON.stringify(requestBody); 
		
		var createTodoRequest = new Request(CONSTANTS.todosUrl, requestOptions);
		
		fetch(createTodoRequest)
		.then(response => response.json())
		.then(newTodo => {
			document.location.pathname = "/TodoManager/home"
		})
	}
		
	this._createButton = document.getElementById("create-todo-button");
	this._createButton.onclick = this._onCreateTodo;
	
	if(id){
		this._populateForm(id);
	}
	
	
}

function initTodoForm(){
	
	var editRouteRegex = '(TodoManager\/todo\/edit\/[0-9]+)';
	
	var isEditing = document.location.pathname.match(editRouteRegex);
	
	if(isEditing){
		
		var pathParts = document.location.pathname.split('/');
		var id = pathParts[pathParts.length -1]
		
		var form = new TodoForm(id);
	}else{		
		var form  = new TodoForm();
	}
	
}

initTodoForm();