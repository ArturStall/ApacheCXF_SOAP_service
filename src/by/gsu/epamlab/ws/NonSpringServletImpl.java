package by.gsu.epamlab.ws;

import javax.servlet.ServletConfig;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

public class NonSpringServletImpl extends CXFNonSpringServlet{
	
	private static final long serialVersionUID = 1L;	

	@Override
    public void loadBus(ServletConfig servletConfig){
        super.loadBus(servletConfig);
        ServerFactoryBean factory = new ServerFactoryBean();
        factory.setBus(bus);
        factory.setServiceClass(ConverterImpl.class);
        factory.setAddress("/ConverterService");
        factory.create();
    }
	
}