package simpleresponsibility.simple;

public class Course {
    public void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println("不能快进");
        }else {
            System.out.println("可任意来回播放");
        }
    }
}
