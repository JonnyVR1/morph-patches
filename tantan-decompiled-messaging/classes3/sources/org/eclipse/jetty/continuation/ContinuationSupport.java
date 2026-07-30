package org.eclipse.jetty.continuation;

import java.lang.reflect.Constructor;
import l.aag0;
import l.bke0;
import l.fke0;
import l.gke0;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
            if (bke0.class.getMethod("startAsync", null) != null) {
                constructor2 = ContinuationSupport.class.getClassLoader().loadClass("org.eclipse.jetty.continuation.Servlet3Continuation").asSubclass(Continuation.class).getConstructor(bke0.class);
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
                constructor = ContinuationSupport.class.getClassLoader().loadClass("org.eclipse.jetty.continuation.Jetty6Continuation").asSubclass(Continuation.class).getConstructor(bke0.class, clsLoadClass);
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
    public static Continuation getContinuation(bke0 bke0Var) {
        Continuation continuationNewInstance;
        Continuation continuation = (Continuation) bke0Var.getAttribute(Continuation.ATTRIBUTE);
        if (continuation != null) {
            return continuation;
        }
        while (bke0Var instanceof fke0) {
            bke0Var = ((fke0) bke0Var).getRequest();
        }
        if (__servlet3) {
            try {
                Continuation continuationNewInstance2 = __newServlet3Continuation.newInstance(bke0Var);
                bke0Var.setAttribute(Continuation.ATTRIBUTE, continuationNewInstance2);
                return continuationNewInstance2;
            } catch (Exception e) {
                aag0.a(e);
                return null;
            }
        }
        if (!__jetty6) {
            qkq0.a("!(Jetty || Servlet 3.0 || ContinuationFilter)");
            return null;
        }
        Object attribute = bke0Var.getAttribute("org.mortbay.jetty.ajax.Continuation");
        if (attribute != null) {
            try {
                Class<?> cls = __waitingContinuation;
                if (cls == null || cls.isInstance(attribute)) {
                    continuationNewInstance = new FauxContinuation(bke0Var);
                } else {
                    continuationNewInstance = __newJetty6Continuation.newInstance(bke0Var, attribute);
                }
            } catch (Exception e2) {
                aag0.a(e2);
                return null;
            }
        } else {
            continuationNewInstance = new FauxContinuation(bke0Var);
        }
        bke0Var.setAttribute(Continuation.ATTRIBUTE, continuationNewInstance);
        return continuationNewInstance;
    }

    @Deprecated
    public static Continuation getContinuation(bke0 bke0Var, gke0 gke0Var) {
        return getContinuation(bke0Var);
    }
}
