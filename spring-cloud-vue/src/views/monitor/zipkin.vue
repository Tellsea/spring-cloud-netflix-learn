<template>
  <div class="app-container">
    <iframe width="100%" frameborder="0" scrolling="auto" :src="url"></iframe>
  </div>
</template>

<script>
import {zipkin} from '@/api/constant'

export default {
  name: "zipkin",
  data() {
    return {
      url: zipkin
    }
  }
}
</script>

<style scoped>
  iframe {
    min-height: 600px;
  }
</style>
