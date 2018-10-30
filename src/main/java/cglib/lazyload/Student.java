package cglib.lazyload;

import net.sf.cglib.proxy.Enhancer;

public class Student {

    private int id;

    private String name;

    /**
     * 英语课时间表
     */
    private Schedule EnglishSchedule;

    /**
     * 数学课时间表
     */
    private Schedule MathSchedule;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.EnglishSchedule = createEnglishSchedule();
        this.MathSchedule = createMathSchedule();
    }

    private Schedule createEnglishSchedule() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Schedule.class);
        enhancer.setCallback(new ScheduleLazyLoader());
        return (Schedule) enhancer.create();
    }

    private Schedule createMathSchedule() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Schedule.class);
        enhancer.setCallback(new ScheduleDispatcher());
        return (Schedule) enhancer.create();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schedule getEnglishSchedule() {
        return EnglishSchedule;
    }

    public void setEnglishSchedule(Schedule englishSchedule) {
        EnglishSchedule = englishSchedule;
    }

    public Schedule getMathSchedule() {
        return MathSchedule;
    }

    public void setMathSchedule(Schedule mathSchedule) {
        MathSchedule = mathSchedule;
    }
}