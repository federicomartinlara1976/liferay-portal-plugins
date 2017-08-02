package net.bounceme.chronos.liferay.portlet.carrusel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = CarruselBean.NAME)
@RequestScoped
public class CarruselBean {
	public static final String NAME = "carruselBean";

	public String[] getCars() {
		return new String[] {"car1.jpg","car2.jpg","car3.jpg"};
	}
}
