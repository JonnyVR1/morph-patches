package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class bwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final our0 f77704i;

    public bwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, our0 our0Var) {
        super(vur0Var, "ouo6/s5NPxZlxezvpiuAYZ73R/AsqpZljIGTfLgJpzrsB+84nXU0ZzhmetmfkBrN", "5BsC37pqFx3Fp5Qtv0y+RSU8LVttAMXjX8aFccLrzxg=", zpr0Var, i, 94);
        this.f77704i = our0Var;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.f161372f.invoke(null, this.f77704i.m166128a())).intValue();
        synchronized (this.f161371e) {
            this.f161371e.m219763Z(kqr0.m146957a(iIntValue));
        }
    }
}
