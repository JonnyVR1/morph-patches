package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ActionData;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class p9e0 extends o5e0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get(Option.TYPE);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = abe0Var.m96743f().get(UserId.TYPE);
        Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        str.getClass();
        switch (str) {
            case "like":
                if ((activity instanceof SuggestersAct) && !TextUtils.isEmpty(str2)) {
                    ((SuggestersAct) activity).m44781b2(true);
                }
                return null;
            case "dislike":
                if ((activity instanceof SuggestersAct) && !TextUtils.isEmpty(str2)) {
                    ((SuggestersAct) activity).m44781b2(false);
                }
                return null;
            case "newpage":
                ActionData actionDataM222761e = CoreModule.f18264c.f20405m0.f20139b0.m222761e();
                if (NullChecker.m82486a(actionDataM222761e) && !jyb.m147479J(actionDataM222761e.pageFormat.cardPatterns)) {
                    SuggestersAct.m44778c2(activityM105506D, actionDataM222761e.pageFormat);
                }
                return null;
            default:
                return null;
        }
    }
}
