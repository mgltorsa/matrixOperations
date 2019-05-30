/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.InterceptorClassGenerator
 * on: Thu May 30 17:27:43 COT 2019
 */

package co.edu.icesi.interfaces;


public class IServerInterceptorSCAIntent
extends org.ow2.frascati.tinfi.TinfiComponentInterceptor<co.edu.icesi.interfaces.IServer>
implements co.edu.icesi.interfaces.IServer,org.objectweb.fractal.julia.Interceptor {

  private static java.lang.reflect.Method[] METHODS;
  public IServerInterceptorSCAIntent()  {
  }

  private IServerInterceptorSCAIntent(Object obj)  {
    setFcItfDelegate(obj);
  }

  public void initFcController(org.objectweb.fractal.julia.InitializationContext ic) throws org.objectweb.fractal.api.factory.InstantiationException  {
    super.initFcController(ic);
    initIntentHandlersMap(METHODS);
  }

  public Object clone()  {
    IServerInterceptorSCAIntent clone = new IServerInterceptorSCAIntent(getFcItfDelegate());
    initFcClone(clone);
    clone.initIntentHandlersMap(METHODS);
    return clone;
  }

  public int[][] rotate(final java.awt.Point arg0,final java.awt.Point arg1) throws java.rmi.RemoteException  {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[0]);
    try {
      if( handlers.size() == 0 ) {
        int[][] ret = impl.rotate(arg0,arg1);
        return ret;
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<co.edu.icesi.interfaces.IServer> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[0],(Object)arg0,(Object)arg1);
    int[][] ret = (int[][]) ijp.proceed();
    return ret;
      }
    }
    catch( Throwable t ) {
      if( t instanceof java.rmi.RemoteException ) {
        throw (java.rmi.RemoteException) t;
      }
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
  }

  static  {
    try {
      METHODS = new java.lang.reflect.Method[]{
        co.edu.icesi.interfaces.IServer.class.getMethod("rotate",java.awt.Point.class,java.awt.Point.class),
      };
    }
    catch( NoSuchMethodException e ) {
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(e);
    }
  }

}
