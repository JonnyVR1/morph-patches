package p153l;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class pq0 {

    /* JADX INFO: renamed from: a */
    public final jq0 f153611a;

    /* JADX INFO: renamed from: b */
    public fb5<Bitmap> f153612b;

    /* JADX INFO: renamed from: c */
    public List<fb5<Bitmap>> f153613c;

    /* JADX INFO: renamed from: d */
    public int f153614d;

    /* JADX INFO: renamed from: e */
    public String f153615e;

    public pq0(jq0 jq0Var) {
        this.f153611a = jq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public oq0 m173271a() {
        try {
            return new oq0(this);
        } finally {
            fb5.m124874v(this.f153612b);
            this.f153612b = null;
            fb5.m124873u(this.f153613c);
            this.f153613c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public f33 m173272b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public List<fb5<Bitmap>> m173273c() {
        return fb5.m124871n(this.f153613c);
    }

    /* JADX INFO: renamed from: d */
    public int m173274d() {
        return this.f153614d;
    }

    /* JADX INFO: renamed from: e */
    public jq0 m173275e() {
        return this.f153611a;
    }

    /* JADX INFO: renamed from: f */
    public fb5<Bitmap> m173276f() {
        return fb5.m124872t(this.f153612b);
    }

    /* JADX INFO: renamed from: g */
    public String m173277g() {
        return this.f153615e;
    }

    /* JADX INFO: renamed from: i */
    public pq0 m173279i(List<fb5<Bitmap>> list) {
        this.f153613c = fb5.m124871n(list);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public pq0 m173280j(int i) {
        this.f153614d = i;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public pq0 m173281k(fb5<Bitmap> fb5Var) {
        this.f153612b = fb5.m124872t(fb5Var);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public pq0 m173282l(String str) {
        this.f153615e = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public pq0 m173278h(f33 f33Var) {
        return this;
    }
}
