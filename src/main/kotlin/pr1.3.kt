fun main() {
    print("Student Enrolment: ")
    var enr: Long = readLine()!!.toLong()
    print("Student Name: ")
    var name: String = readLine()!!.toString()
    print("Student Branch: ")
    var branch: String = readLine()!!.toString()
    print("Student Class: ")
    var class_name: String = readLine()!!.toString()
    print("Student Batch: ")
    var batch: String = readLine()!!.toString()
    print("Student Collage Name: ")
    var collage_name: String = readLine()!!.toString()
    print("Student uni Name: ")
    var uni_name: String = readLine()!!.toString()
    print("Student Age: ")
    var age: Int = readLine()!!.toInt()
    println("=================================")
    println("Enrolment: $enr")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $class_name")
    println("Batch: $batch")
    println("Collage Name: $collage_name")
    println("Uni Name: $uni_name")
    println("Age: $age")
}