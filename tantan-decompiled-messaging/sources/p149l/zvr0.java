package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class zvr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public static volatile Long f205058i;

    /* JADX INFO: renamed from: j */
    public static final Object f205059j = new Object();

    public zvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", zpr0Var, i, 22);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (f205058i == null) {
            synchronized (f205059j) {
                try {
                    if (f205058i == null) {
                        f205058i = (Long) this.f161372f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f161371e) {
            this.f161371e.m219799z0(f205058i.longValue());
        }
    }
}
