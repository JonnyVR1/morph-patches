package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.survey.SurveyAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class a1e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str;
        if (NullChecker.m81303a(w2e0Var.m201098f())) {
            str = w2e0Var.m201098f().get("sid");
            if (TextUtils.isEmpty(str)) {
                return;
            }
        } else {
            str = "";
        }
        zvf0.m220396r("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
        Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
        if (NullChecker.m81303a(activityM208326D)) {
            activityM208326D.startActivity(SurveyAct.m55826V1(activityM208326D, str));
            activityM208326D.overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
