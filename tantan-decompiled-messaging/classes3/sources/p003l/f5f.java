package p003l;

import java.util.HashSet;
import java.util.List;
import l.aag0;
import p014rx.exceptions.CompositeException;
import p014rx.exceptions.OnCompletedFailedException;
import p014rx.exceptions.OnErrorFailedException;
import p014rx.exceptions.OnErrorNotImplementedException;
import p014rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class f5f {
    /* JADX INFO: renamed from: a */
    public static void m3960a(Throwable th, Throwable th2) {
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
    public static Throwable m3961b(Throwable th) {
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
    public static RuntimeException m3962c(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: d */
    public static void m3963d(List<? extends Throwable> list) {
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
        aag0.a(th);
    }

    /* JADX INFO: renamed from: e */
    public static void m3964e(Throwable th) {
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
    public static void m3965f(Throwable th, m250<?> m250Var) {
        m3964e(th);
        m250Var.onError(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m3966g(Throwable th, m250<?> m250Var, Object obj) {
        m3964e(th);
        m250Var.onError(OnErrorThrowable.addValueAsLastCause(th, obj));
    }
}
