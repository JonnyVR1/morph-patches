package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ActionData;
import com.p046p1.mobile.putong.core.data.Option;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class l1e0 extends kxd0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get(Option.TYPE);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = w2e0Var.m201098f().get(UserId.TYPE);
        Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        str.getClass();
        switch (str) {
            case "like":
                if ((activity instanceof SuggestersAct) && !TextUtils.isEmpty(str2)) {
                    ((SuggestersAct) activity).m43595a2(true);
                }
                return null;
            case "dislike":
                if ((activity instanceof SuggestersAct) && !TextUtils.isEmpty(str2)) {
                    ((SuggestersAct) activity).m43595a2(false);
                }
                return null;
            case "newpage":
                ActionData actionDataM221515e = CoreModule.f17545c.f19663m0.f19397b0.m221515e();
                if (NullChecker.m81303a(actionDataM221515e) && !vwb.m200296J(actionDataM221515e.pageFormat.cardPatterns)) {
                    SuggestersAct.m43592b2(activityM208326D, actionDataM221515e.pageFormat);
                }
                return null;
            default:
                return null;
        }
    }
}
