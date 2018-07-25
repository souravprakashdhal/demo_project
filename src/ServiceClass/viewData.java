package ServiceClass;

import java.util.Iterator;
import java.util.List;

import POJO.Employee;
import ServiceClass.StoreData;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;  


public class viewData {

	public static void main(String[] args) 
	{
		Session session = StoreData.openConnection();
		if(session != null)
		System.out.println("Session got acitve");
		Transaction t = session.beginTransaction();
		String hql="from Employee";
		Query query = session.createQuery(hql);
		//Query query=session.
		List<Employee> list = query.list();
		for(Employee  emp : list)
		{
			System.out.println(emp.getID()+" "+emp.getName()+" "+emp.getDept());
		}

	}

}
