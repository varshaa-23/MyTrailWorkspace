package com.framework.testng.api.base;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryEngine implements IRetryAnalyzer,IAnnotationTransformer,ITestListener {//ITestListener--not used in ou project just for interview.
	 
    private int count = 0;
    private static int maxTry = 0;
 
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                     
            if (count < maxTry) {                            
                count++;                                     
                iTestResult.setStatus(ITestResult.FAILURE);  
                return true;                                
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);  
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);      
        }
        return false;
    }
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
    	    annotation.setRetryAnalyzer(com.framework.testng.api.base.RetryEngine.class);
    	  }
 
}
