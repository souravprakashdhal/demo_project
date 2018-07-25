package ServiceClass;  
  
import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

import POJO.Employee;
  
public class StoreData 
{  
public static void main(String[] args) 
{  
      
    Session session= openConnection();
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    //e1.setId(115);  
    //e1.setId(32);
    e1.setName("sura");
    e1.setDept("CSE");
    
      
    session.save(e1);//persisting the object
    
      
    t.commit();//transaction is committed  
    
    
    session.close();  
    System.out.println("successfully saved");  
    
      
}  

public static Session openConnection()
{
	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	return session;
}


}  