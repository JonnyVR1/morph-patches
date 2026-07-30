package p137rx.internal.util;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.exceptions.CompositeException;
import p153l.m31;

/* JADX INFO: loaded from: classes3.dex */
public enum ExceptionsUtils {
    ;

    private static final Throwable TERMINATED = new Throwable("Terminated");

    public static boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable compositeException;
        do {
            th2 = atomicReference.get();
            if (th2 == TERMINATED) {
                return false;
            }
            if (th2 == null) {
                compositeException = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                arrayList.add(th);
                compositeException = new CompositeException(arrayList);
            } else {
                compositeException = new CompositeException(th2, th);
            }
        } while (!m31.m156916a(atomicReference, th2, compositeException));
        return true;
    }

    public static boolean isTerminated(AtomicReference<Throwable> atomicReference) {
        return isTerminated(atomicReference.get());
    }

    public static Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = TERMINATED;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static boolean isTerminated(Throwable th) {
        return th == TERMINATED;
    }
}
