package dependencyinversion;

public class Tom {
    //======v1=======
//    public void studyJavaCourse(){
//        System.out.println("Tom正在学习Java课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Tom正在学习Python课程");
//    }

    //======v2=======
//    public void study(ICourse iCourse){
//        iCourse.study();
//    }

    //=======v3=====
//    private ICourse iCourse;
//
//    public Tom(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void study(){
//        iCourse.study();
//    }

    //======v4======
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }
}
