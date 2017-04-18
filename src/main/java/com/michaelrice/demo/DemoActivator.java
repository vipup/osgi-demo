package com.michaelrice.demo;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Manifest;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DemoActivator implements BundleActivator {
	private static int counter =0;  
	
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("STARTING DEMO: hello V 1.0.9-SNAPSHOT  #5#"+(counter++)+", world @[" +bundleContext+"]");
        Enumeration<URL> resources = getClass().getClassLoader()
        		  .getResources("META-INF/MANIFEST.MF");
        		while (resources.hasMoreElements()) {
        		    try {
        		      Manifest manifest = new Manifest(resources.nextElement().openStream());
        		      // check that this is your manifest and do what you need or get the next one
        		      System.out.println(manifest.getEntries().toString());
        		    } catch (IOException E) {
        		      // handle
        		    }
        		}        
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("STOPPING DEMO +++" + bundleContext +"+++");
    }

}
