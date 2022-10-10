package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		//Data access kodlarý
		//business kodlarý(sana özel ürün getirmeyi saðlar)
		//yardýmcý katman API 
		//UI masaüstü uygulamalar olabilir
		
		Product product1= new Product(1,"Iphone Xr",10000);
		
		ProductManager productManager = new ProductManager(new HibernateProductDao());
		productManager.add(product1);
		

		
	}

}
