package p149l;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class sq0 {

    /* JADX INFO: renamed from: a */
    public final nq0 f165902a;

    /* JADX INFO: renamed from: b */
    public final int f165903b;

    /* JADX INFO: renamed from: c */
    public String f165904c;

    /* JADX INFO: renamed from: d */
    public fa5<Bitmap> f165905d;

    /* JADX INFO: renamed from: e */
    public List<fa5<Bitmap>> f165906e;

    public sq0(tq0 tq0Var) {
        this.f165902a = (nq0) rf80.m179116g(tq0Var.m190072e());
        this.f165903b = tq0Var.m190071d();
        this.f165905d = tq0Var.m190073f();
        this.f165906e = tq0Var.m190070c();
        tq0Var.m190069b();
        this.f165904c = tq0Var.m190074g();
    }

    /* JADX INFO: renamed from: b */
    public static sq0 m185425b(nq0 nq0Var) {
        return new sq0(nq0Var);
    }

    /* JADX INFO: renamed from: f */
    public static tq0 m185426f(nq0 nq0Var) {
        return new tq0(nq0Var);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m185427a() {
        fa5.m120154v(this.f165905d);
        this.f165905d = null;
        fa5.m120153u(this.f165906e);
        this.f165906e = null;
    }

    /* JADX INFO: renamed from: c */
    public p23 m185428c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public nq0 m185429d() {
        return this.f165902a;
    }

    /* JADX INFO: renamed from: e */
    public String m185430e() {
        return this.f165904c;
    }

    public sq0(nq0 nq0Var) {
        this.f165902a = (nq0) rf80.m179116g(nq0Var);
        this.f165903b = 0;
    }
}
