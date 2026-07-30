package p149l;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tq0 {

    /* JADX INFO: renamed from: a */
    public final nq0 f171535a;

    /* JADX INFO: renamed from: b */
    public fa5<Bitmap> f171536b;

    /* JADX INFO: renamed from: c */
    public List<fa5<Bitmap>> f171537c;

    /* JADX INFO: renamed from: d */
    public int f171538d;

    /* JADX INFO: renamed from: e */
    public String f171539e;

    public tq0(nq0 nq0Var) {
        this.f171535a = nq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public sq0 m190068a() {
        try {
            return new sq0(this);
        } finally {
            fa5.m120154v(this.f171536b);
            this.f171536b = null;
            fa5.m120153u(this.f171537c);
            this.f171537c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public p23 m190069b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<fa5<Bitmap>> m190070c() {
        return fa5.m120151n(this.f171537c);
    }

    /* JADX INFO: renamed from: d */
    public int m190071d() {
        return this.f171538d;
    }

    /* JADX INFO: renamed from: e */
    public nq0 m190072e() {
        return this.f171535a;
    }

    /* JADX INFO: renamed from: f */
    public fa5<Bitmap> m190073f() {
        return fa5.m120152t(this.f171536b);
    }

    /* JADX INFO: renamed from: g */
    public String m190074g() {
        return this.f171539e;
    }

    /* JADX INFO: renamed from: i */
    public tq0 m190076i(List<fa5<Bitmap>> list) {
        this.f171537c = fa5.m120151n(list);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public tq0 m190077j(int i) {
        this.f171538d = i;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public tq0 m190078k(fa5<Bitmap> fa5Var) {
        this.f171536b = fa5.m120152t(fa5Var);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public tq0 m190079l(String str) {
        this.f171539e = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public tq0 m190075h(p23 p23Var) {
        return this;
    }
}
