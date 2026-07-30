package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class lvr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public static volatile Long f130191i;

    /* JADX INFO: renamed from: j */
    public static final Object f130192j = new Object();

    public lvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", zpr0Var, i, 44);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (f130191i == null) {
            synchronized (f130192j) {
                try {
                    if (f130191i == null) {
                        f130191i = (Long) this.f161372f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f161371e) {
            this.f161371e.m219779p0(f130191i.longValue());
        }
    }
}
