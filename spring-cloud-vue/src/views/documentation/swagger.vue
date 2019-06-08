<template>
  <div class="app-container">
    <iframe width="100%" frameborder="0" scrolling="auto" :src="url"></iframe>
  </div>
</template>

<script>
import {swagger} from '@/api/constant'

export default {
  name: "swagger",
  data() {
    return {
      url: swagger
    }
  }
}
</script>

<style scoped>
  iframe {
    min-height: 600px;
  }
</style>
