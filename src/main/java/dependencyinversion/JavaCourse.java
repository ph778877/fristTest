package dependencyinversion;

public class JavaCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("Tom正在学习Java课程");
    }
}
