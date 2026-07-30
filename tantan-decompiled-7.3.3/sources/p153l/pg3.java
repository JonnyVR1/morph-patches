package p153l;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class pg3<V> {

    /* JADX INFO: renamed from: a */
    public final int f152227a;

    /* JADX INFO: renamed from: b */
    public final int f152228b;

    /* JADX INFO: renamed from: c */
    public final Queue f152229c;

    /* JADX INFO: renamed from: d */
    public final boolean f152230d;

    /* JADX INFO: renamed from: e */
    public int f152231e;

    public pg3(int i, int i2, int i3, boolean z) {
        wn80.m207184i(i > 0);
        wn80.m207184i(i2 >= 0);
        wn80.m207184i(i3 >= 0);
        this.f152227a = i;
        this.f152228b = i2;
        this.f152229c = new LinkedList();
        this.f152231e = i3;
        this.f152230d = z;
    }

    /* JADX INFO: renamed from: a */
    public void mo157351a(V v2) {
        this.f152229c.add(v2);
    }

    /* JADX INFO: renamed from: b */
    public void m172213b() {
        wn80.m207184i(this.f152231e > 0);
        this.f152231e--;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public V m172214c() {
        V vMo157352g = mo157352g();
        if (vMo157352g != null) {
            this.f152231e++;
        }
        return vMo157352g;
    }

    /* JADX INFO: renamed from: d */
    public int m172215d() {
        return this.f152229c.size();
    }

    /* JADX INFO: renamed from: e */
    public void m172216e() {
        this.f152231e++;
    }

    /* JADX INFO: renamed from: f */
    public boolean m172217f() {
        return this.f152231e + m172215d() > this.f152228b;
    }

    /* JADX INFO: renamed from: g */
    public V mo157352g() {
        return (V) this.f152229c.poll();
    }

    /* JADX INFO: renamed from: h */
    public void m172218h(V v2) {
        wn80.m207182g(v2);
        boolean z = this.f152230d;
        int i = this.f152231e;
        if (z) {
            wn80.m207184i(i > 0);
            this.f152231e--;
            mo157351a(v2);
        } else if (i <= 0) {
            huf.m137182j("BUCKET", "Tried to release value %s from an empty bucket!", v2);
        } else {
            this.f152231e = i - 1;
            mo157351a(v2);
        }
    }
}
