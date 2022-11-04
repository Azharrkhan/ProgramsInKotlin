fun main1(){
    routineOne()
    routineTwo()
}

fun routineOne(){
    println("Routine one is started")
    Thread.sleep(3000)
    println("Routine one is completed")
}

fun routineTwo(){
    println("Routine two is started")
    Thread.sleep(2000)
    println("Routine two is completed")
}