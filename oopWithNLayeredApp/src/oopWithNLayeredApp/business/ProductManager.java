package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}


	public void add(Product product) throws Exception {
		//i� kurallar�
		if(product.getUnitPrice()<10) {
			throw new Exception("�r�n fiyat� 10dan k�c�k olamaz");
		}
		
		productDao.add(product);
	}

}
