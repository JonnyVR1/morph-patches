package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.survey.SurveyAct;
import com.tantanapp.common.utils.NullChecker;
import l.f30;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a1e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str;
        if (NullChecker.a(w2e0Var.m26160f())) {
            str = w2e0Var.m26160f().get("sid");
            if (TextUtils.isEmpty(str)) {
                return;
            }
        } else {
            str = "";
        }
        zvf0.r("e_assistant_send_feedback", "p_chat_view");
        Activity activityD = xdl0.D(w2e0Var.m26156b());
        if (NullChecker.a(activityD)) {
            activityD.startActivity(SurveyAct.m9224V1(activityD, str));
            activityD.overridePendingTransition(rzb0.f20953y, rzb0.f20945q);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
