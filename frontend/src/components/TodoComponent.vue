
<template>
  <div class="container">
    <div class="task">
      <div class="title">
        <h1> To Do List </h1>
      </div>
      <div class="form">
        <input type="text"
               v-model="newTask"
               placeholder="Nouvelle Tache"
        />
        <button @click="addTask">
          <i class="fa-solid fa-plus"></i>
        </button>
      </div>
      <div class="taskItems">
        <ul>
          <TodoItem
              v-for="(task) in todoList"
              :key="task.id"
          >
          </TodoItem>
        </ul>
      </div>
      <div class="clearBtls">
        <button></button>
        <button></button>
      </div>
      <div class="pendingTodolist">
        <span>
          Pending to do list:
        </span>
      </div>
    </div>
  </div>

</template>

<script>
import TodoItem from "@/components/TodoItem.vue";

export default {
  name:"TodoComponent",
  components:{
    TodoItem
  },
  data(){
    return{
      newTask:"",
      todoList:[]
    };
  },
  methods:{
    addTask(){
      this.todoList.push(this.newTask)
    }
  }

}
</script>


<style scoped>

</style>