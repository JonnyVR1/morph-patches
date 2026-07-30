package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.survey.SurveyAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class e9e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String str;
        if (NullChecker.m82486a(abe0Var.m96743f())) {
            str = abe0Var.m96743f().get("sid");
            if (TextUtils.isEmpty(str)) {
                return;
            }
        } else {
            str = "";
        }
        i4g0.m138520r("e_assistant_send_feedback", OMSDialogPositon.p_chat_view);
        Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
        if (NullChecker.m82486a(activityM105506D)) {
            activityM105506D.startActivity(SurveyAct.m57009X1(activityM105506D, str));
            activityM105506D.overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
