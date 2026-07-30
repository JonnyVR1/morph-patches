package p149l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class tas0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f169183a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f169184b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f169185c = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static ras0 m187779a() {
        return (ras0) f169183a.get();
    }

    /* JADX INFO: renamed from: b */
    public static sas0 m187780b() {
        return (sas0) f169184b.get();
    }

    /* JADX INFO: renamed from: c */
    public static void m187781c(ras0 ras0Var) {
        f169183a.set(ras0Var);
    }
}
