package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class ayh {

    /* JADX INFO: renamed from: a */
    public x20 f73966a;

    /* JADX INFO: renamed from: b */
    public boolean f73967b;

    /* JADX INFO: renamed from: c */
    public ayh f73968c;

    public ayh(boolean z, x20 x20Var) {
        this.f73966a = x20Var;
        this.f73967b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m100874a() {
        if (this.f73967b) {
            this.f73966a.call();
        } else if (NullChecker.m82486a(this.f73968c)) {
            this.f73968c.m100874a();
        }
    }

    /* JADX INFO: renamed from: b */
    public ayh m100875b(ayh ayhVar) {
        this.f73968c = ayhVar;
        return ayhVar;
    }
}
