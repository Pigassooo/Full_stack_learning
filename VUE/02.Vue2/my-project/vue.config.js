const { defineConfig } = require('@vue/cli-service')
const { Linter } = require('eslint')
module.exports = defineConfig({
  transpileDependencies: true
})

module.exports = {
    lintOnSave: false // 关闭语法检查
}