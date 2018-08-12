/**
 * 
 */

var TodoForm = function(){
	
	var form = document.getElementById("todo-form");
	
	this._nameInput = form.querySelector("#name");
	this._deadlineInput = form.querySelector("#deadline");
	this._descriptionInput = form.querySelector("#description");
	
	var that = this;
	
	this._onCreateTodo = function($event){
		var name = that._nameInput.value;
		var deadline = that._nameInput.deadline;
		var description = that._descriptionInput.value
		
		var requestBody = {
				"name": name,
				"deadline": deadline,
				"description": description
		};
		
		var requestOptions = {
				method:'POST',
				body: JSON.stringify(requestBody),
				headers: {'Content-Type': 'application/json'}
		};
		
		var createTodoRequest = new Request(CONSTANTS.todosUrl, requestOptions);
		
		fetch(createTodoRequest)
		.then(response => response.json())
		.then(newTodo => {
			document.location.pathname = "/TodoManager/home"
		})
	}
		
	this._createButton = document.getElementById("create-todo-button");
	this._createButton.onclick = this._onCreateTodo;
}

function initTodoForm(){
	var form  = new TodoForm();
}

initTodoForm();