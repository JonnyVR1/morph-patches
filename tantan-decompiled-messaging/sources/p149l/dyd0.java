package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;

/* JADX INFO: loaded from: classes9.dex */
public class dyd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (CoreModule.m29935P().m94658i().mo158329X()) {
            super.mo94421a(w2e0Var, f30Var);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Intent intentM47401Z1 = MarryInfoAuditStatusAct.m47401Z1(w2e0Var.m201094b(), "mode_switching");
        MarryInfoAuditStatusAct.m47402c2(intentM47401Z1);
        return intentM47401Z1;
    }
}
