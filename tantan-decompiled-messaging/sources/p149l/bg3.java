package p149l;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class bg3<V> {

    /* JADX INFO: renamed from: a */
    public final int f75396a;

    /* JADX INFO: renamed from: b */
    public final int f75397b;

    /* JADX INFO: renamed from: c */
    public final Queue f75398c;

    /* JADX INFO: renamed from: d */
    public final boolean f75399d;

    /* JADX INFO: renamed from: e */
    public int f75400e;

    public bg3(int i, int i2, int i3, boolean z) {
        rf80.m179118i(i > 0);
        rf80.m179118i(i2 >= 0);
        rf80.m179118i(i3 >= 0);
        this.f75396a = i;
        this.f75397b = i2;
        this.f75398c = new LinkedList();
        this.f75400e = i3;
        this.f75399d = z;
    }

    /* JADX INFO: renamed from: a */
    public void mo101622a(V v2) {
        this.f75398c.add(v2);
    }

    /* JADX INFO: renamed from: b */
    public void m101623b() {
        rf80.m179118i(this.f75400e > 0);
        this.f75400e--;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public V m101624c() {
        V vMo101628g = mo101628g();
        if (vMo101628g != null) {
            this.f75400e++;
        }
        return vMo101628g;
    }

    /* JADX INFO: renamed from: d */
    public int m101625d() {
        return this.f75398c.size();
    }

    /* JADX INFO: renamed from: e */
    public void m101626e() {
        this.f75400e++;
    }

    /* JADX INFO: renamed from: f */
    public boolean m101627f() {
        return this.f75400e + m101625d() > this.f75397b;
    }

    /* JADX INFO: renamed from: g */
    public V mo101628g() {
        return (V) this.f75398c.poll();
    }

    /* JADX INFO: renamed from: h */
    public void m101629h(V v2) {
        rf80.m179116g(v2);
        boolean z = this.f75399d;
        int i = this.f75400e;
        if (z) {
            rf80.m179118i(i > 0);
            this.f75400e--;
            mo101622a(v2);
        } else if (i <= 0) {
            tsf.m190544j("BUCKET", "Tried to release value %s from an empty bucket!", v2);
        } else {
            this.f75400e = i - 1;
            mo101622a(v2);
        }
    }
}
