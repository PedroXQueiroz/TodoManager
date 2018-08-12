<script id="todo-card-template" type="text/x-handlebars-template">
    <div class="demo-card-wide mdl-card mdl-shadow--2dp">
        <div class="mdl-card__title">
            <h2 class="mdl-card__title-text">{{name}}</h2>
        </div>
        <div class="mdl-card__supporting-text">
            {{description}}
        </div>

        <!-- <div class="mdl-card__actions mdl-card--border">
            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
            Get Started
            </a>
        </div> -->
        <!-- <div class="mdl-card__menu">
            <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
            <i class="material-icons">share</i>
            </button>
        </div> -->
    </div>
</script>

<div id="todo-list-container" class="grid-container">
</div>

<button id="add-todo-btn" class="add-todo-button mdl-button mdl-js-button mdl-button--fab mdl-button--colored">
    <i class="material-icons">add</i>
</button>

<script src="/TodoManager/resources/js/todo/todo-list.js"></script>
<link rel="stylesheet" href="/TodoManager/resources/content/css/todo-list.css"/>
