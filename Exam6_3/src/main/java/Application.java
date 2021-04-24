import entities.Person;
import entities.Medicine;
import entities.Virus;
import org.hibernate.Session;
import util.HibernateUtil;

public class Application {
    public static void main(String[] args) {
        Virus Covid = Virus.builder().name("COVID19").build();
        Virus Influenza = Virus.builder().name("Influenza").build();
        Virus Bronchitis  = Virus.builder().name("Bronchitis ").build();

        Person Tom = Person.builder().name("Tom").virus(Covid).build();
        Person Kate = Person.builder().name("Kate").virus(Influenza).build();
        Person Sam = Person.builder().name("Sam").virus(Covid).build();
        Person Nick = Person.builder().name("Nick").virus(Covid).build();

        Medicine medicine = Medicine.builder().name("panacea").virus(Covid).build();
        Virus migraine  = Virus.builder().name("migraine").medicine(medicine).build();

        saveOrUpdate(Tom);
        saveOrUpdate(Kate);
        saveOrUpdate(Sam);
        saveOrUpdate(Nick);
        saveOrUpdate(Covid);
        saveOrUpdate(medicine);
        saveOrUpdate(Influenza);
        saveOrUpdate(Bronchitis);
        saveOrUpdate(migraine);
    }
    public static <T> T saveOrUpdate(T entity) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Запись создана/обновлена успешно");
        return entity;
    }
}

