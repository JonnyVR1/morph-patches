package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class a5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final long f68641i;

    public a5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, long j, int i, int i2) {
        super(b4s0Var, "hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", fzr0Var, i, 25);
        this.f68641i = j;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f192523f.invoke(null, null)).longValue();
        synchronized (this.f192522e) {
            try {
                this.f192522e.m128324u0(jLongValue);
                long j = this.f68641i;
                if (j != 0) {
                    this.f192522e.m128286N(jLongValue - j);
                    this.f192522e.m128287O(this.f68641i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
