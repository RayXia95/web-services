
package com.revature.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-04-11T10:46:05.066-04:00
 * Generated source version: 3.1.6
 * 
 */
public final class HeroGreeting_HeroGreetingAlphaPort_Client {

    private static final QName SERVICE_NAME = new QName("http://soap.revature.com/", "HeroGreetingService");

    private HeroGreeting_HeroGreetingAlphaPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HeroGreetingService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HeroGreetingService ss = new HeroGreetingService(wsdlURL, SERVICE_NAME);
        HeroGreeting port = ss.getHeroGreetingAlphaPort();  
        
        {
        System.out.println("Invoking getMessage...");
        java.lang.String _getMessage_arg0 = "";
        java.lang.String _getMessage__return = port.getMessage(_getMessage_arg0);
        System.out.println("getMessage.result=" + _getMessage__return);


        }

        System.exit(0);
    }

}
