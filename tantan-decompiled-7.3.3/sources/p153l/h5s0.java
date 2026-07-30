package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class h5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final u3s0 f107972i;

    public h5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, u3s0 u3s0Var) {
        super(b4s0Var, "ouo6/s5NPxZlxezvpiuAYZ73R/AsqpZljIGTfLgJpzrsB+84nXU0ZzhmetmfkBrN", "5BsC37pqFx3Fp5Qtv0y+RSU8LVttAMXjX8aFccLrzxg=", fzr0Var, i, 94);
        this.f107972i = u3s0Var;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.f192523f.invoke(null, this.f107972i.m194419a())).intValue();
        synchronized (this.f192522e) {
            this.f192522e.m128298Z(qzr0.m178826a(iIntValue));
        }
    }
}
