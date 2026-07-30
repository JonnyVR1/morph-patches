package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class t5s0 extends x5s0 {
    public t5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "CYcH4LBpiH+KaEScKuk48/IbmIORuaeHTHx2iwUA0vRWrbIkTWIgIbVYJ8eozDwX", "AtCF0F/Ugi3KOt6zYtgfLSsd+8KzXVTsnhwfj9NoYBY=", fzr0Var, i, 48);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        this.f192522e.m128300b0(3);
        boolean zBooleanValue = ((Boolean) this.f192523f.invoke(null, this.f192519b.m102517b())).booleanValue();
        synchronized (this.f192522e) {
            fzr0 fzr0Var = this.f192522e;
            try {
                if (zBooleanValue) {
                    fzr0Var.m128300b0(2);
                } else {
                    fzr0Var.m128300b0(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
