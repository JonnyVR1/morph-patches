package p003l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fpy implements toy {

    /* JADX INFO: renamed from: a */
    public d30 f3667a;

    /* JADX INFO: renamed from: b */
    public boolean f3668b = true;

    public fpy(d30 d30Var) {
        this.f3667a = d30Var;
    }

    @Override // p003l.toy
    /* JADX INFO: renamed from: a */
    public boolean mo4390a() {
        if (NullChecker.a(this.f3667a)) {
            this.f3667a.call();
        }
        return this.f3668b;
    }
}
