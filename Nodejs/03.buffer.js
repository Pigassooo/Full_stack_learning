// 01.alloc
let buf = Buffer.alloc(10)
console.log(buf);

// 02.allocUnsafe
let buf_2 = Buffer.allocUnsafe(10)
console.log(buf_2);

// 03.from
let buf_3 = Buffer.from('hello')
console.log(buf_3)

let buf_4 = Buffer.from([105, 103, 108, 127, 117])
console.log(buf_4)

// 字符串转换
console.log(buf_4.toString());

// []
console.log(buf_3[0].toString(2)); // 01101000
buf_3[0] = 95
console.log(buf_3.toString());

// 溢出
buf_3[0] = 361 // 8进制最大可以存储10进制的255
console.log(buf_3); // 舍弃高位数字 0001 0110 1001 => 0110 1001
