package ServiceClass;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.Transaction;

public class UpdateData {

	
	public static void main(String[] args) 
	{
	  Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	  SessionFactory sf = cfg.buildSessionFactory();
	  Session session=sf.openSession();  
        
	  Transaction t=session.beginTransaction();
	  String hql = "update emp set name='dhal' where id=20";
	    Query query = session.createSQLQuery(hql);
	    int rows= query.executeUpdate();
	    System.out.println(rows+" rows affected");
	    t.commit();
	    session.close();
	    sf.close();
	    
	}

}
