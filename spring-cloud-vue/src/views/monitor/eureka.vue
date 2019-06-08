<template>
  <div class="app-container">
    <iframe width="100%" frameborder="0" scrolling="auto" :src="url"></iframe>
  </div>
</template>

<script>
import {eureka} from '@/api/constant'

export default {
  name: "eureka",
  data() {
    return {
      url: eureka
    }
  }
}
</script>

<style scoped>
  iframe {
    min-height: 600px;
  }
</style>
