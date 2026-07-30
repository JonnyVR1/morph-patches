package p153l;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq0 {

    /* JADX INFO: renamed from: a */
    public final jq0 f148526a;

    /* JADX INFO: renamed from: b */
    public final int f148527b;

    /* JADX INFO: renamed from: c */
    public String f148528c;

    /* JADX INFO: renamed from: d */
    public fb5<Bitmap> f148529d;

    /* JADX INFO: renamed from: e */
    public List<fb5<Bitmap>> f148530e;

    public oq0(pq0 pq0Var) {
        this.f148526a = (jq0) wn80.m207182g(pq0Var.m173275e());
        this.f148527b = pq0Var.m173274d();
        this.f148529d = pq0Var.m173276f();
        this.f148530e = pq0Var.m173273c();
        pq0Var.m173272b();
        this.f148528c = pq0Var.m173277g();
    }

    /* JADX INFO: renamed from: b */
    public static oq0 m168778b(jq0 jq0Var) {
        return new oq0(jq0Var);
    }

    /* JADX INFO: renamed from: f */
    public static pq0 m168779f(jq0 jq0Var) {
        return new pq0(jq0Var);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m168780a() {
        fb5.m124874v(this.f148529d);
        this.f148529d = null;
        fb5.m124873u(this.f148530e);
        this.f148530e = null;
    }

    /* JADX INFO: renamed from: c */
    public f33 m168781c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public jq0 m168782d() {
        return this.f148526a;
    }

    /* JADX INFO: renamed from: e */
    public String m168783e() {
        return this.f148528c;
    }

    public oq0(jq0 jq0Var) {
        this.f148526a = (jq0) wn80.m207182g(jq0Var);
        this.f148527b = 0;
    }
}
