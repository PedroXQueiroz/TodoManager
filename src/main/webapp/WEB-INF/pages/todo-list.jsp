<script id="todo-card-template" type="text/x-handlebars-template">
    <div class="demo-card-wide mdl-card mdl-shadow--2dp todo-card">
        <div class="mdl-card__title todo-title">
            <h2 class="mdl-card__title-text">{{name}}</h2>
            <span class="todo-date">{{deadline}}</span>
        </div>

        <div class="mdl-card__supporting-text">
            {{description}}
        </div>

		<div class="mdl-card__actions mdl-card--border">
            <div class="done-painel">
                <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="done-{{id}}">
                    <input type="checkbox" id="done-{{id}}" class="mdl-checkbox__input">
                    <span class="mdl-checkbox__label">Pronto</span>
                </label>
            </div>

            <div class="edition-painel">
                <button class="mdl-button mdl-js-button mdl-button--icon mdl-button--colored edit-todo">
                    <i class="material-icons">edit</i>
                </button>

                <button class="mdl-button mdl-js-button mdl-button--icon mdl-button--colored remove-todo">
                    <i class="material-icons">close</i>
                </button>
            </div>
        </div>
    </div>
</script>

<div id="todo-list-container" class="grid-container">
</div>

<div class="todo-list-footer">
	<button id="add-todo-btn" class="add-todo-button mdl-button mdl-js-button mdl-button--fab mdl-button--colored">
	    <i class="material-icons">add</i>
	</button>
</div>

<script src="/TodoManager/resources/js/todo/todo-list.js"></script>
<link rel="stylesheet" href="/TodoManager/resources/content/css/todo-list.css"/>
