package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class uvr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final long f178557i;

    public uvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, long j, int i, int i2) {
        super(vur0Var, "hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", zpr0Var, i, 25);
        this.f178557i = j;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f161372f.invoke(null, null)).longValue();
        synchronized (this.f161371e) {
            try {
                this.f161371e.m219789u0(jLongValue);
                long j = this.f178557i;
                if (j != 0) {
                    this.f161371e.m219751N(jLongValue - j);
                    this.f161371e.m219752O(this.f178557i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
