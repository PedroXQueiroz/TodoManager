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

        fetch(todosRequest)
        .then(response => response.json())
        .then(todos => {
            for(todo of todos){
                var currentTodoCard = this._cardTemplate(todo);
                this._container.innerHTML += currentTodoCard;
            }
        });
    }
    
    this._addTodoList = function(todoData){
    	
    	var currentCard = this._cardTemplate(todoData);
    	
    	this._container.innerHTML += currentCard;
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
