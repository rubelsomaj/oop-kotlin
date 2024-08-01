package inner

class outer {
    var name:String ="rubel tumar mone lhub tention"
    inner class Inner{
        fun display(){
            println(name)
        }
    }
}
fun main(){
    val out = outer()
   val  inner = out.Inner()
    inner.display()
}