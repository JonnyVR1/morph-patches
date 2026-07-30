package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class ewr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public static volatile String f93537i;

    /* JADX INFO: renamed from: j */
    public static final Object f93538j = new Object();

    public ewr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", zpr0Var, i, 1);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        this.f161371e.m219782r("E");
        if (f93537i == null) {
            synchronized (f93538j) {
                try {
                    if (f93537i == null) {
                        f93537i = (String) this.f161372f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f161371e) {
            this.f161371e.m219782r(f93537i);
        }
    }
}
