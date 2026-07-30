package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.marry.audit.MarryInfoAuditStatusAct;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dyd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (CoreModule.m1854P().m11713i().m19837X()) {
            super.mo11681a(w2e0Var, f30Var);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Intent intentZ1 = MarryInfoAuditStatusAct.Z1(w2e0Var.m26156b(), "mode_switching");
        MarryInfoAuditStatusAct.c2(intentZ1);
        return intentZ1;
    }
}
