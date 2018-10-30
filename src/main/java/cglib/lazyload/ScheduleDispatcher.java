package cglib.lazyload;

import net.sf.cglib.proxy.Dispatcher;

import java.util.Calendar;

public class ScheduleDispatcher implements Dispatcher {

    @Override
    public Object loadObject() throws Exception {
        System.out.println("before Dispatcher init...you can query from db...");
        Schedule schedule = new Schedule();
        schedule.setCourseName("Math");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,4,1);
        schedule.setCourseTime(calendar.getTime());
        System.out.println("after Dispatcher init...");
        return schedule;
    }
}