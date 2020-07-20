var f = function(){
	console.log("这是一个自动执行的函数"+argument[0]);
}();

function f2() {
	console.log("这也是一个自动执行的函数"+argument[0]);
}(f2)

(function f3() {
	console.log("这也是第三个自动执行的函数"+argument[0]);
}(f3))

(function f4() {
	console.log("这也是第三个自动执行的函数"+argument[0]);
})()

function f5() {
	
}
