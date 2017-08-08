package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.party.entity.Users;
public class testHbernate {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	@Before
	public void testSchemaExport(){
		//�������ö���
				Configuration config=new Configuration().configure();
				//��������ע�����
				ServiceRegistry serviceR=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
				//�����Ự��������
				sessionFactory=config.buildSessionFactory(serviceR);
				//�Ự����
				session=sessionFactory.openSession();
				//��������
				transaction=session.beginTransaction();
		
	}
	
	@Test
	public void saveStu() {
		Users u=new Users("15240629","12345","zhou","yinianji","��������",1);
		session.save(u);
	}
	
	@After
	public void destroy(){
		transaction.commit();//�ύ����
		session.close();     //�رջỰ
		sessionFactory.close(); //�رչ���
	}

}
