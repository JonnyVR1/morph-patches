package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.MomentFeedPushArgs;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class fyd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = w2e0Var.m201099g() != null ? w2e0Var.m201099g().replaceFirst("/", "") : null;
        if (!TextUtils.isEmpty(w2e0Var.m201099g())) {
            String str = w2e0Var.m201098f().get(Oauth2AccessToken.KEY_UID);
            String str2 = w2e0Var.m201098f().get(BaseSei.MID);
            String str3 = w2e0Var.m201098f().get(SchemeKey.web);
            w2e0Var.m201098f().get("pushtype");
            String str4 = w2e0Var.m201098f().get("intent");
            if (!TextUtils.isEmpty(strReplaceFirst)) {
                if (!TextUtils.isEmpty(str)) {
                    CoreModule.m29934N().coreMomentLatest(str);
                }
                if (!TextUtils.isEmpty(str4)) {
                    strReplaceFirst = strReplaceFirst + "_" + str4;
                }
                MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
                momentFeedPushArgsNew_.uid = str;
                momentFeedPushArgsNew_.mid = str2;
                momentFeedPushArgsNew_.path = strReplaceFirst;
                momentFeedPushArgsNew_.schemeParamMap = w2e0Var.m201098f();
                CoreModule.f17545c.f19639e0.f149134A0.m132487l(momentFeedPushArgsNew_);
            }
            if (TextUtils.equals(w2e0Var.m201098f().get("jumpType"), "directly")) {
                return CoreModule.m29934N().argsToPhotoAlbumFeedAct(w2e0Var.m201094b(), str, "p_vote_user", -1, null, 2);
            }
            if ("1".equals(str3)) {
                return CoreModule.m29934N().argsToMomentDetailAct(w2e0Var.m201094b(), BLiveOperationClickAction.scheme, str2, str);
            }
        }
        return lva.m151862r(w2e0Var.m201094b());
    }
}
