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
		//创建配置对象
				Configuration config=new Configuration().configure();
				//创建服务注册对象
				ServiceRegistry serviceR=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
				//创建会话工厂对象
				sessionFactory=config.buildSessionFactory(serviceR);
				//会话对象
				session=sessionFactory.openSession();
				//开启事务
				transaction=session.beginTransaction();
		
	}
	
	@Test
	public void saveStu() {
		Users u=new Users("15240629","12345","zhou","yinianji","积极分子",1);
		session.save(u);
	}
	
	@After
	public void destroy(){
		transaction.commit();//提交事务
		session.close();     //关闭会话
		sessionFactory.close(); //关闭工厂
	}

}
