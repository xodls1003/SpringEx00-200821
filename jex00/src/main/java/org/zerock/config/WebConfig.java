package org.zerock.config;
import javax.servlet.ServletConfig;

import org.springframework.web.servlet.support.
AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.ServletRegistration;

public class WebConfig extends 
AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic
			registration) {
		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
	}
	
	

}
