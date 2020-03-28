package principle.openclose;

public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"java架构",118000D);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID：" + discountCourse.getID() +
                            "\n课程标题：《" + discountCourse.getName() +"》" +
                            "\n原价："+ discountCourse.getPrice() +
                            "\n售价：" + discountCourse.getDisCountPrice());
    }
}
