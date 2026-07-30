package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class f5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public static volatile Long f97337i;

    /* JADX INFO: renamed from: j */
    public static final Object f97338j = new Object();

    public f5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", fzr0Var, i, 22);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (f97337i == null) {
            synchronized (f97338j) {
                try {
                    if (f97337i == null) {
                        f97337i = (Long) this.f192523f.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f192522e) {
            this.f192522e.m128334z0(f97337i.longValue());
        }
    }
}
