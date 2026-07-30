package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class fpy implements toy {

    /* JADX INFO: renamed from: a */
    public d30 f98751a;

    /* JADX INFO: renamed from: b */
    public boolean f98752b = true;

    public fpy(d30 d30Var) {
        this.f98751a = d30Var;
    }

    @Override // p149l.toy
    /* JADX INFO: renamed from: a */
    public boolean mo122682a() {
        if (NullChecker.m81303a(this.f98751a)) {
            this.f98751a.call();
        }
        return this.f98752b;
    }
}
