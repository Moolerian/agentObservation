package util;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;
import org.hibernate.SessionFactory;

import java.util.Date;

public class App {

    private static SessionFactory factory;

    public static void main(String[] args) {

//        factory = new Configuration().configure().buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        User user = new User();
//        user.setUserName("userName");
//        user.setPassword("123456");
//        user.setRegisterDate(new Date());
//
//        Integer save = (Integer) session.save(user);
//
//        transaction.commit();
//
//
//        List<User> result = (List<User>) session.createQuery("from User ").list();
//
//        for (User u : result) {
//            System.out.println(u.getRegisterDate());
//        }
//
//        System.out.println(save);


        PersianCalendar persianCalendar1 = new PersianCalendar(new Date());

        System.out.println("Year:" + persianCalendar1.get(Calendar.YEAR));
        System.out.println("Month:" + (persianCalendar1.get(Calendar.MONTH) + 1)); // 0-11
        System.out.println("Day:" + persianCalendar1.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour:" + persianCalendar1.get(Calendar.HOUR_OF_DAY)); // HOUR_OF_DAY:
        // 0-23,
        // HOUR:0-11
        System.out.println("Minute:" + persianCalendar1.get(Calendar.MINUTE));
        System.out.println("Second:" + persianCalendar1.get(Calendar.SECOND));
    }
}
