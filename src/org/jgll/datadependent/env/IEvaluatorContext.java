package org.jgll.datadependent.env;

public interface IEvaluatorContext {
	
	public Environment getEnvironment();
	
	public void setEnvironment(Environment env);
	
	public Environment getEmptyEnvironment();
	
	
	/**
	 * 
	 * Operations on environment
	 * 
	 */
	public void popEnvironment();
	
	public void pushEnvironment();
	
	public void declareVariable(String name, Object value);
	
	public void declareVariables(String[] names, Object[] values);
	
	public void storeVariable(String name, Object value);
	
	public Object lookupVariable(String name);

}
