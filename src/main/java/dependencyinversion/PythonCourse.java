package dependencyinversion;

public class PythonCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Tom正在学习Python课程");
    }
}
