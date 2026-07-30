package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class gwr0 extends rwr0 {
    public gwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "PyZj3I+LGZvAhJ9n3OQrlENydgM2JwW0T6dRxf3as8iTDiIpqvAE/3692CSblz+3", "8lD2ezwwsI93agi51tjtw1sdZVRU2vHPSc7HynOlFDE=", zpr0Var, i, 73);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.f161372f.invoke(null, this.f161368b.m200101b())).booleanValue();
            zpr0 zpr0Var = this.f161371e;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            zpr0Var.m219764a0(i);
        } catch (InvocationTargetException unused) {
            this.f161371e.m219764a0(3);
        }
    }
}
