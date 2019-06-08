<template>
  <div class="app-container">
    <iframe width="100%" frameborder="0" scrolling="auto" :src="url"></iframe>
  </div>
</template>

<script>
import {hystrix} from '@/api/constant'

export default {
  name: "hystrix",
  data() {
    return {
      url: hystrix
    }
  }
}
</script>

<style scoped>
  iframe {
    min-height: 600px;
  }
</style>
