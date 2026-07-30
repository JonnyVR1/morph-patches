package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class nwr0 extends rwr0 {
    public nwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "CYcH4LBpiH+KaEScKuk48/IbmIORuaeHTHx2iwUA0vRWrbIkTWIgIbVYJ8eozDwX", "AtCF0F/Ugi3KOt6zYtgfLSsd+8KzXVTsnhwfj9NoYBY=", zpr0Var, i, 48);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        this.f161371e.m219765b0(3);
        boolean zBooleanValue = ((Boolean) this.f161372f.invoke(null, this.f161368b.m200101b())).booleanValue();
        synchronized (this.f161371e) {
            zpr0 zpr0Var = this.f161371e;
            try {
                if (zBooleanValue) {
                    zpr0Var.m219765b0(2);
                } else {
                    zpr0Var.m219765b0(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
