package p153l;

import java.util.HashSet;
import java.util.List;
import p137rx.exceptions.CompositeException;
import p137rx.exceptions.OnCompletedFailedException;
import p137rx.exceptions.OnErrorFailedException;
import p137rx.exceptions.OnErrorNotImplementedException;
import p137rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class j6f {
    /* JADX INFO: renamed from: a */
    public static void m143659a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (hashSet.contains(th.getCause())) {
                    break;
                }
                hashSet.add(th.getCause());
                i = i2;
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static Throwable m143660b(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    /* JADX INFO: renamed from: c */
    public static RuntimeException m143661c(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: d */
    public static void m143662d(List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new CompositeException(list);
        }
        Throwable th = list.get(0);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        iig0.m140070a(th);
    }

    /* JADX INFO: renamed from: e */
    public static void m143663e(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        }
        if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        }
        if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        }
        if (th instanceof StackOverflowError) {
            throw ((StackOverflowError) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m143664f(Throwable th, bb50<?> bb50Var) {
        m143663e(th);
        bb50Var.onError(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m143665g(Throwable th, bb50<?> bb50Var, Object obj) {
        m143663e(th);
        bb50Var.onError(OnErrorThrowable.addValueAsLastCause(th, obj));
    }
}
