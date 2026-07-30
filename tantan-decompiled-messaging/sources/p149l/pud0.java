package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes13.dex */
public class pud0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public SchemeKey f151269a;

    public pud0(SchemeKey schemeKey) {
        this.f151269a = schemeKey;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (qib0.f154713b0.f139232c.mo67293yn() && !eqs.m117789q(rwj0.m181416o(w2e0Var.m201094b()), this.f151269a.toString(), w2e0Var, f30Var)) {
            mwj0.m156660I().mo156716e(this.f151269a, w2e0Var, f30Var);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Intent intentM117785m = eqs.m117785m(this.f151269a, w2e0Var, f30Var);
        return intentM117785m != null ? intentM117785m : mwj0.m156660I().mo156718f(this.f151269a, w2e0Var, f30Var);
    }
}
