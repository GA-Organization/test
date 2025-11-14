public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    } 

    public User getUserHibernate(org.hibernate.Session session, String data) {
    
      org.hibernate.Query query = session.createQuery(
                "FROM students where fname = " + data);  // Sensitive
      // ...
    }
}
