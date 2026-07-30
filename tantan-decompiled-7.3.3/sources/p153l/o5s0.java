package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class o5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final boolean f145109i;

    public o5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", fzr0Var, i, 61);
        this.f145109i = b4s0Var.m102531s();
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f192523f.invoke(null, this.f192519b.m102517b(), Boolean.valueOf(this.f145109i))).longValue();
        synchronized (this.f192522e) {
            this.f192522e.m128323u(jLongValue);
        }
    }
}
