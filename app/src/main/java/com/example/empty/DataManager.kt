package com.example.empty

class DataManager {
    val courses= hashMapOf<String, courseinfo>()
    val notes= arrayListOf<noteInfo>()
    private fun initCourses(){
        var course=courseinfo("android Id ","android title")
        courses.set(course.courseId,course)
        var note=noteInfo(course,"title again","text")
    }

}