class Subway(val line: String) {

    fun willBeLate(): Boolean {
        if (line == "G") {
            println("brooklyn tech, let's gooo!")
            return false
        } else {
            println("the train ahead has a sick passenger")
            return true
        }
    }

    fun stop(location: String, next: String) {
        println("this is $location, next stop $next")
    }
}
