package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ro0 {

    /* JADX INFO: renamed from: b */
    public int f164142b = -1;

    /* JADX INFO: renamed from: a */
    public List<qo0> f164141a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m182352a() {
        if (jyb.m147479J(this.f164141a)) {
            return;
        }
        int i = this.f164142b + 1;
        this.f164142b = i;
        this.f164142b = i % this.f164141a.size();
    }

    /* JADX INFO: renamed from: b */
    public void m182353b() {
        this.f164142b = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m182354c() {
        return this.f164142b >= 0 && !jyb.m147479J(this.f164141a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m182355d() {
        return this.f164142b == this.f164141a.size() - 1;
    }

    /* JADX INFO: renamed from: e */
    public qo0 m182356e() {
        int i = this.f164142b;
        if (i < 0 || i >= this.f164141a.size()) {
            return null;
        }
        return this.f164141a.get(this.f164142b);
    }

    /* JADX INFO: renamed from: f */
    public long m182357f() {
        int i = this.f164142b;
        if (i < 0 || i >= this.f164141a.size()) {
            return -1L;
        }
        return this.f164141a.get(this.f164142b).f158679c;
    }
}
