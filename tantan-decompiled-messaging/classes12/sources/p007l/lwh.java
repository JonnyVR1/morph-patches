package p007l;

import com.tantanapp.common.utils.NullChecker;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lwh {

    /* JADX INFO: renamed from: a */
    public d30 f10147a;

    /* JADX INFO: renamed from: b */
    public boolean f10148b;

    /* JADX INFO: renamed from: c */
    public lwh f10149c;

    public lwh(boolean z, d30 d30Var) {
        this.f10147a = d30Var;
        this.f10148b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m11711a() {
        if (this.f10148b) {
            this.f10147a.call();
        } else if (NullChecker.a(this.f10149c)) {
            this.f10149c.m11711a();
        }
    }

    /* JADX INFO: renamed from: b */
    public lwh m11712b(lwh lwhVar) {
        this.f10149c = lwhVar;
        return lwhVar;
    }
}
