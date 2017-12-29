/**
 * Created by umesh on 26/11/17.
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Controller {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("spring.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
     Test t=   (Test)factory.getBean("studentbean");
    }
}
