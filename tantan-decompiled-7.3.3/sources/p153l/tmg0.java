package p153l;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class tmg0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    public final teg0 f174928a;

    public tmg0(teg0 teg0Var) {
        super(teg0Var, null);
        this.f174928a = teg0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iM174221a;
        int iM174221a2;
        teg0 teg0Var = this.f174928a;
        int i = teg0Var.f173837s;
        teg0 teg0Var2 = ((tmg0) obj).f174928a;
        int i2 = teg0Var2.f173837s;
        if (i == i2) {
            iM174221a = teg0Var.f173819a;
            iM174221a2 = teg0Var2.f173819a;
        } else {
            iM174221a = pxg0.m174221a(i2);
            iM174221a2 = pxg0.m174221a(i);
        }
        return iM174221a - iM174221a2;
    }
}
