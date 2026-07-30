package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class iwr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final boolean f115295i;

    public iwr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", zpr0Var, i, 61);
        this.f115295i = vur0Var.m200115s();
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f161372f.invoke(null, this.f161368b.m200101b(), Boolean.valueOf(this.f115295i))).longValue();
        synchronized (this.f161371e) {
            this.f161371e.m219788u(jLongValue);
        }
    }
}
