/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServiceReferenceClassGenerator
 * on: Sat Jun 01 17:42:07 COT 2019
 */

package co.edu.icesi.interfaces;


public class IServerFcSR
extends org.ow2.frascati.tinfi.oasis.ServiceReferenceImpl<co.edu.icesi.interfaces.IServer>
implements co.edu.icesi.interfaces.IServer {

  public IServerFcSR(Class<co.edu.icesi.interfaces.IServer> businessInterface,co.edu.icesi.interfaces.IServer service)  {
    super(businessInterface,service);
  }

  public co.edu.icesi.interfaces.IServer getService()  {
    return this;
  }

  public void recieve(final java.lang.String arg0,final java.lang.String arg1,final double arg2)  {
    service.recieve(arg0,arg1,arg2);
  }

}
