<template>
  <div class="app-container">
    <iframe width="100%" frameborder="0" scrolling="auto" :src="url"></iframe>
  </div>
</template>

<script>
import {admin} from '@/api/constant'

export default {
  name: "admin",
  data() {
    return {
      url: admin
    }
  }
}
</script>

<style scoped>
  iframe {
    min-height: 600px;
  }
</style>
