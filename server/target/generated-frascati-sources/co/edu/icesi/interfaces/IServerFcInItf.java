/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServerInterfaceClassGenerator
 * on: Thu May 30 17:27:43 COT 2019
 */

package co.edu.icesi.interfaces;


public class IServerFcInItf
extends org.ow2.frascati.tinfi.TinfiComponentInterface<co.edu.icesi.interfaces.IServer>
implements co.edu.icesi.interfaces.IServer {

  public IServerFcInItf()  {
  }

  public IServerFcInItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public int[][] rotate(final java.awt.Point arg0,final java.awt.Point arg1) throws java.rmi.RemoteException  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    int[][] ret = impl.rotate(arg0,arg1);
    return ret;
  }

}
