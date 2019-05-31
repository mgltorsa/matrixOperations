package co.edu.icesi.interfaces;


import org.osoa.sca.annotations.Service;

@Service
public interface IBalancer{

	public void register(String protocol, String ip, int port, String service) throws IllegalArgumentException;

	public String getMultiplicationService(String service) throws IllegalArgumentException;

	public void notify(String ip);


}
