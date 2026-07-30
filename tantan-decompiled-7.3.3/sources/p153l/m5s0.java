package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class m5s0 extends x5s0 {
    public m5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "PyZj3I+LGZvAhJ9n3OQrlENydgM2JwW0T6dRxf3as8iTDiIpqvAE/3692CSblz+3", "8lD2ezwwsI93agi51tjtw1sdZVRU2vHPSc7HynOlFDE=", fzr0Var, i, 73);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.f192523f.invoke(null, this.f192519b.m102517b())).booleanValue();
            fzr0 fzr0Var = this.f192522e;
            int i = 1;
            if (true == zBooleanValue) {
                i = 2;
            }
            fzr0Var.m128299a0(i);
        } catch (InvocationTargetException unused) {
            this.f192522e.m128299a0(3);
        }
    }
}
