package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;

/* JADX INFO: loaded from: classes9.dex */
public class h6e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (CoreModule.m30933P().m143412i().mo180421X()) {
            super.mo95798a(abe0Var, z20Var);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Intent intentM48584a2 = MarryInfoAuditStatusAct.m48584a2(abe0Var.m96739b(), "mode_switching");
        MarryInfoAuditStatusAct.m48585d2(intentM48584a2);
        return intentM48584a2;
    }
}
