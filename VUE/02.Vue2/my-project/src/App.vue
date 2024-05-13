<template>
<div id="root">
    <div class="todo-container">
        <div class="todo-wrap">
        <MyHeader :addTodo="addTodo"/>
        <MyList :todos="todos"/>
        <MyFooter/>
        </div>
    </div>
</div>
</template>

<script>

import MyHeader from './components/MyHeader';
import MyFooter from './components/MyFooter';
import MyList from './components/MyList';


export default {
    name: 'App',

    components: {
        MyHeader,
        MyFooter,
        MyList
    },
    data(){
        return{
            todos:[
                {id:'001', text: "Learn Vue.js", done: false},
                {id:'002', text: "Learn Node.js", done: true},
                {id:'003', text: "Learn React.js", done: false},
            ]
        }
    },

    methods:{
        addTodo(todoObj){
            this.todos.unshift(todoObj);
        }
    }

}
</script>

<style>
    /*base*/
    body {
    background: #fff;
    }

    .btn {
    display: inline-block;
    padding: 4px 12px;
    margin-bottom: 0;
    font-size: 14px;
    line-height: 20px;
    text-align: center;
    vertical-align: middle;
    cursor: pointer;
    box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05);
    border-radius: 4px;
    }

    .btn-danger {
    color: #fff;
    background-color: #da4f49;
    border: 1px solid #bd362f;
    }

    .btn-danger:hover {
    color: #fff;
    background-color: #bd362f;
    }

    .btn:focus {
    outline: none;
    }

    .todo-container {
    width: 600px;
    margin: 0 auto;
    }
    .todo-container .todo-wrap {
    padding: 10px;
    border: 1px solid #ddd;
    border-radius: 5px;
    }
</style>