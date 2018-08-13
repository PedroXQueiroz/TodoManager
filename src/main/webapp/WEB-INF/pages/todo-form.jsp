<div class="form-container" >
	
	<div class="mdl-card mdl-shadow--2dp" id="todo-form">
	
		<div class="mdl-card__title">
            <h2 class="mdl-card__title-text">Nova Tarefa</h2>
        </div>
        
        <div class="mdl-card__supporting-text">
		  	
		  	<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="text" id="name">
			    <label class="mdl-textfield__label" for="name">Nome</label>
			  </div>
		  			  	
		  	<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="date" id="deadline">
			    <label class="mdl-textfield__label" for="deadline">Feito até:</label>
			  </div>
					  	
		  	<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <textarea class="mdl-textfield__input" type="text" id="description"></textarea>
			    <label class="mdl-textfield__label" for="description">Descrição</label>
			  </div>
		  	
		  	<div class="bottom-area">
		  		<button class="mdl-button mdl-js-button mdl-button--raised" id="create-todo-button" type="button"> Adicionar </button>	
		  	</div>
        </div>
  	</div>
  	
</div>

<script src="/TodoManager/resources/js/todo/todo-form.js"></script>
<link rel="stylesheet" href="/TodoManager/resources/content/css/todo-form.css"/>