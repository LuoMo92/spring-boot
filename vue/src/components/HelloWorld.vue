<template>
  <div class="hello">
    <el-form>
        <el-form-item label="用户名">
            <el-input></el-input>
        </el-form-item>
      <el-form-item label="密码">
        <el-input></el-input>
      </el-form-item>
      <el-button>登录</el-button>
    </el-form>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
