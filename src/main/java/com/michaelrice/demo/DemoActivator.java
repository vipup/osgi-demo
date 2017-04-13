package com.michaelrice.demo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DemoActivator implements BundleActivator {
	private static int counter =0;  
	
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("STARTING DEMO 1.0.5+1..: hello#"+(counter++)+", world @[" +bundleContext+"]");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("STOPPING DEMO +++" + bundleContext +"+++");
    }

}
