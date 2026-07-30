package p149l;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class leg0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    public final l6g0 f127683a;

    public leg0(l6g0 l6g0Var) {
        super(l6g0Var, null);
        this.f127683a = l6g0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iM132337a;
        int iM132337a2;
        l6g0 l6g0Var = this.f127683a;
        int i = l6g0Var.f126639s;
        l6g0 l6g0Var2 = ((leg0) obj).f127683a;
        int i2 = l6g0Var2.f126639s;
        if (i == i2) {
            iM132337a = l6g0Var.f126621a;
            iM132337a2 = l6g0Var2.f126621a;
        } else {
            iM132337a = hpg0.m132337a(i2);
            iM132337a2 = hpg0.m132337a(i);
        }
        return iM132337a - iM132337a2;
    }
}
