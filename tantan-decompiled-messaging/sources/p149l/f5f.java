package p149l;

import java.util.HashSet;
import java.util.List;
import p133rx.exceptions.CompositeException;
import p133rx.exceptions.OnCompletedFailedException;
import p133rx.exceptions.OnErrorFailedException;
import p133rx.exceptions.OnErrorNotImplementedException;
import p133rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class f5f {
    /* JADX INFO: renamed from: a */
    public static void m119487a(Throwable th, Throwable th2) {
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
    public static Throwable m119488b(Throwable th) {
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
    public static RuntimeException m119489c(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: d */
    public static void m119490d(List<? extends Throwable> list) {
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
        aag0.m95543a(th);
    }

    /* JADX INFO: renamed from: e */
    public static void m119491e(Throwable th) {
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
    public static void m119492f(Throwable th, m250<?> m250Var) {
        m119491e(th);
        m250Var.onError(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m119493g(Throwable th, m250<?> m250Var, Object obj) {
        m119491e(th);
        m250Var.onError(OnErrorThrowable.addValueAsLastCause(th, obj));
    }
}
