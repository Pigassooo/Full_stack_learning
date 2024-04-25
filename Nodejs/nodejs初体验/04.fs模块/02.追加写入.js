const fs = require('fs')

// fs.appendFile(file, data[, options], callback)

fs.appendFile('./names.txt', '\r\nHi, Pig', err => {
    // err 写入失败：错误对象  写入成功：null
    if (err) {
        console.log('fail');
        return
    }
    console.log('success')
})

// fs.appendFileSync()