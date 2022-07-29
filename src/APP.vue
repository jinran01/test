<template>
    <div>123{{msg}}</div>
    <button @click="sub">-</button>
    <input v-model="num" type="text" >
    <button @click="add">+</button>
    <button>添加</button>
</template>

<script>
// import Index from "../public/index.html";
const data ={
    msg:123444333,
    num:10,
}
export default {
    name: "APP",
    data(){
        return data
    },
    methods:{
        sub(){
            this.num--
        },
        add(){
            this.num++
        }
    }
}
</script>

<style scoped>

</style>