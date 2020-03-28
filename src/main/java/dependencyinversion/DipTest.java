package dependencyinversion;

public class DipTest {
    public static void main(String[] args) {
        //=======v1========
//        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();

        //========v2=======
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());

        //======v3=======
//        Tom tom = new Tom(new JavaCourse());
//        tom.study();

        //=======v4======
        Tom tom = new Tom();
        tom.setiCourse(new JavaCourse());
        tom.study();
    }


}
