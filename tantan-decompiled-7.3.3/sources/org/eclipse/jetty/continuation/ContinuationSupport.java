package org.eclipse.jetty.continuation;

import java.lang.reflect.Constructor;
import p153l.gse0;
import p153l.iig0;
import p153l.kse0;
import p153l.lse0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class ContinuationSupport {
    static final boolean __jetty6;
    static final Constructor<? extends Continuation> __newJetty6Continuation;
    static final Constructor<? extends Continuation> __newServlet3Continuation;
    static final boolean __servlet3;
    static final Class<?> __waitingContinuation;

    static {
        Constructor<? extends Continuation> constructor;
        boolean z;
        Constructor<? extends Continuation> constructor2;
        boolean z2 = true;
        try {
            if (gse0.class.getMethod("startAsync", null) != null) {
                constructor2 = ContinuationSupport.class.getClassLoader().loadClass("org.eclipse.jetty.continuation.Servlet3Continuation").asSubclass(Continuation.class).getConstructor(gse0.class);
                z = true;
            } else {
                z = false;
                constructor2 = null;
            }
            __servlet3 = z;
            __newServlet3Continuation = constructor2;
        } catch (Exception unused) {
            __servlet3 = false;
            __newServlet3Continuation = null;
        } catch (Throwable th) {
            __servlet3 = false;
            __newServlet3Continuation = null;
            throw th;
        }
        try {
            Class<?> clsLoadClass = ContinuationSupport.class.getClassLoader().loadClass("org.mortbay.util.ajax.Continuation");
            if (clsLoadClass != null) {
                constructor = ContinuationSupport.class.getClassLoader().loadClass("org.eclipse.jetty.continuation.Jetty6Continuation").asSubclass(Continuation.class).getConstructor(gse0.class, clsLoadClass);
            } else {
                z2 = false;
                constructor = null;
            }
            __jetty6 = z2;
            __newJetty6Continuation = constructor;
        } catch (Exception unused2) {
            __jetty6 = false;
            __newJetty6Continuation = null;
        } catch (Throwable th2) {
            __jetty6 = false;
            __newJetty6Continuation = null;
            throw th2;
        }
        try {
            __waitingContinuation = ContinuationSupport.class.getClassLoader().loadClass("org.mortbay.util.ajax.WaitingContinuation");
        } catch (Exception unused3) {
            __waitingContinuation = null;
        } catch (Throwable th3) {
            __waitingContinuation = null;
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:19:0x003c, B:21:0x0040, B:24:0x0047, B:28:0x005b, B:27:0x0056), top: B:36:0x003c }] */
    public static Continuation getContinuation(gse0 gse0Var) {
        Continuation continuationNewInstance;
        Continuation continuation = (Continuation) gse0Var.getAttribute(Continuation.ATTRIBUTE);
        if (continuation != null) {
            return continuation;
        }
        while (gse0Var instanceof kse0) {
            gse0Var = ((kse0) gse0Var).getRequest();
        }
        if (__servlet3) {
            try {
                Continuation continuationNewInstance2 = __newServlet3Continuation.newInstance(gse0Var);
                gse0Var.setAttribute(Continuation.ATTRIBUTE, continuationNewInstance2);
                return continuationNewInstance2;
            } catch (Exception e) {
                iig0.m140070a(e);
                return null;
            }
        }
        if (!__jetty6) {
            wtq0.m207906a("!(Jetty || Servlet 3.0 || ContinuationFilter)");
            return null;
        }
        Object attribute = gse0Var.getAttribute("org.mortbay.jetty.ajax.Continuation");
        if (attribute != null) {
            try {
                Class<?> cls = __waitingContinuation;
                if (cls == null || cls.isInstance(attribute)) {
                    continuationNewInstance = new FauxContinuation(gse0Var);
                } else {
                    continuationNewInstance = __newJetty6Continuation.newInstance(gse0Var, attribute);
                }
            } catch (Exception e2) {
                iig0.m140070a(e2);
                return null;
            }
        } else {
            continuationNewInstance = new FauxContinuation(gse0Var);
        }
        gse0Var.setAttribute(Continuation.ATTRIBUTE, continuationNewInstance);
        return continuationNewInstance;
    }

    @Deprecated
    public static Continuation getContinuation(gse0 gse0Var, lse0 lse0Var) {
        return getContinuation(gse0Var);
    }
}
