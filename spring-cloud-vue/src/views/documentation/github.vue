<template>
  <div class="app-container documentation-container">
    <a
      class="document-btn"
      target="_blank"
      href="https://github.com/Tellsea/spring-cloud-templete/"
    >Github 参考文档</a>
    <a
      class="document-btn"
      target="_blank"
      href="https://github.com/Tellsea/spring-cloud-templete/"
    >源码地址</a>
    <dropdown-menu :items="articleList" style="float:left;margin-left:50px;" title="更多项目" />
  </div>
</template>

<script>
import DropdownMenu from '@/components/Share/DropdownMenu'

export default {
  name: 'Github',
  components: { DropdownMenu },
  data() {
    return {
      articleList: [
        { title: 'SSM 脚手架实战', href: 'https://github.com/Tellsea/ssm/' },
        { title: 'Spring Boot 框架整合', href: 'https://github.com/Tellsea/springboot-learn/' },
      ]
    }
  }
}
</script>

<style lang="scss" scoped>
  .documentation-container {
    margin: 50px;
    .document-btn {
      float: left;
      margin-left: 50px;
      display: block;
      cursor: pointer;
      background: black;
      color: white;
      height: 60px;
      width: 200px;
      line-height: 60px;
      font-size: 20px;
      text-align: center;
    }
  }
</style>
