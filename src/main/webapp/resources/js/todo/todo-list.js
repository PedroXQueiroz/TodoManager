//TodoList class
var TodoList = function(containerId){
    this._init = function(){
        this._container = document.getElementById(containerId);
        
        var cardTemplateHtml = document.getElementById("todo-card-template").innerHTML;
        this._cardTemplate = Handlebars.compile(cardTemplateHtml);

        this._clean();
        this._populate();
    }

    this._clean = function(){
        this._container.innerHTML = "";
    }

    this._populate = function(){
        
        var todosRequest = new Request(CONSTANTS.todosUrl);        

        var that = this;
        
        fetch(todosRequest)
        .then(response => response.json())
        .then(todos => {
            for(let todo of todos){
                
            	let currentTodoCard = this._cardTemplate(todo);
                let currentTodoCardElement = document.createElement('div');
                currentTodoCardElement.innerHTML = currentTodoCard; 
                
                let editTodoButton = currentTodoCardElement.querySelector(".edit-todo");
                editTodoButton.onclick = function(){
                	document.location.pathname = "TodoManager/todo/edit/" + todo.id;
                }
                 
                let deleteTodoButton = currentTodoCardElement.querySelector(".remove-todo");
                deleteTodoButton.onclick = function(){
                	let deleteTodoRequest = new Request(CONSTANTS.todosUrl + todo.id, {method:'DELETE'});
                	
                	fetch(deleteTodoRequest)
                	.then(() => {
                		that._clean();
                		that._populate();
                	});
                }
                
                this._container.appendChild(currentTodoCardElement);
            }
        });
    }
    
    this._init();
}

function initTodoList(){
	//Starting todo list page
	var todoList = new TodoList('todo-list-container');
	
	var addTodoButton = document.getElementById("add-todo-btn");
	addTodoButton.onclick = function(){
		document.location.pathname = "TodoManager/todo/new"
	}
}

initTodoList();
