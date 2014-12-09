package com.diversesoft.productmenu;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diversesoft.productmenu.dao.IProductDAO;
import com.diversesoft.productmenu.dao.ProductImpl;
/**
 * Handles requests for the application home page.
 */
@RestController
public class SRRESTController{
	
    private IProductDAO dao; 
	
    public SRRESTController() {
		dao = new ProductImpl();
	}
    
	public SRRESTController(ProductImpl dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	@RequestMapping("/listmenu")
    public List<Product> GetProducts(@RequestParam(value="id", defaultValue="-1") int id) {
    	if(id>=0)
    	{	
    		return this.dao.GetProducts(id);
    	}
    	else
    		return null;
    }
	
    
}
