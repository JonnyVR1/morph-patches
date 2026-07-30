package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ActionData;
import com.p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.tantanapp.common.utils.NullChecker;
import l.f30;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l1e0 extends kxd0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("option");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = w2e0Var.m26160f().get("userid");
        Activity activityD = xdl0.D(w2e0Var.m26156b());
        Activity activity = Act.foreground_() == null ? null : (Activity) Act.foreground_().a.get();
        str.getClass();
        switch (str) {
            case "like":
                if ((activity instanceof SuggestersAct) && !TextUtils.isEmpty(str2)) {
                    ((SuggestersAct) activity).a2(true);
                }
                return null;
            case "dislike":
                if ((activity instanceof SuggestersAct) && !TextUtils.isEmpty(str2)) {
                    ((SuggestersAct) activity).a2(false);
                }
                return null;
            case "newpage":
                ActionData actionData = (ActionData) CoreModule.f1534c.f3652m0.f3386b0.e();
                if (NullChecker.a(actionData) && !vwb.J(actionData.pageFormat.cardPatterns)) {
                    SuggestersAct.b2(activityD, actionData.pageFormat);
                }
                return null;
            default:
                return null;
        }
    }
}
