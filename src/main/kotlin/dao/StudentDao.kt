package dao

import model.Student

class StudentDao : Dao<Student, String> {
    private var students = arrayListOf<Student>().apply {
        add(Student("Ahlun bin Fulan", "12345", "Biologi", "4IA01", "Universitas Riau"))
        add(Student("Who bin Ahlun", "12346", "Kimia", "4IA02", "Universitas Indonesia"))
        add(Student("Monkey D Luffy", "12347", "Fisika", "4IA03", "Universitas Gajah Mada"))
    }


    override fun getData(): List<Student> {
        return students
    }

    override fun addData(item: Student) {
        students.add(item)
    }

    override fun deleteData(uniqueID: String) {
        /*
        OLD IMPLEMENTATION
        for(student in students){
            if(student.nim == uniqueID){
                students.remove(student)
            }
        }
        */
        students.remove(students.find { student ->
            student.nim == uniqueID
        })
    }

}