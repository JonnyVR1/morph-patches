package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes9.dex */
public class t2e0 extends o5e0 {

    /* JADX INFO: renamed from: a */
    public SchemeKey f171752a;

    public t2e0(SchemeKey schemeKey) {
        this.f171752a = schemeKey;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (uqb0.f180396b0.f170326c.mo68476yn() && !fss.m127254q(v5k0.m199903o(abe0Var.m96739b()), this.f171752a.toString(), abe0Var, z20Var)) {
            q5k0.m175372I().mo175432e(this.f171752a, abe0Var, z20Var);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Intent intentM127250m = fss.m127250m(this.f171752a, abe0Var, z20Var);
        return intentM127250m != null ? intentM127250m : q5k0.m175372I().mo175434f(this.f171752a, abe0Var, z20Var);
    }
}
