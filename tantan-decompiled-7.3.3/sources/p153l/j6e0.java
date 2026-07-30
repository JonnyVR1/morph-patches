package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.MomentFeedPushArgs;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class j6e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = abe0Var.m96744g() != null ? abe0Var.m96744g().replaceFirst("/", "") : null;
        if (!TextUtils.isEmpty(abe0Var.m96744g())) {
            String str = abe0Var.m96743f().get(Oauth2AccessToken.KEY_UID);
            String str2 = abe0Var.m96743f().get(BaseSei.MID);
            String str3 = abe0Var.m96743f().get(SchemeKey.web);
            abe0Var.m96743f().get("pushtype");
            String str4 = abe0Var.m96743f().get("intent");
            if (!TextUtils.isEmpty(strReplaceFirst)) {
                if (!TextUtils.isEmpty(str)) {
                    CoreModule.m30932N().coreMomentLatest(str);
                }
                if (!TextUtils.isEmpty(str4)) {
                    strReplaceFirst = strReplaceFirst + "_" + str4;
                }
                MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
                momentFeedPushArgsNew_.uid = str;
                momentFeedPushArgsNew_.mid = str2;
                momentFeedPushArgsNew_.path = strReplaceFirst;
                momentFeedPushArgsNew_.schemeParamMap = abe0Var.m96743f();
                CoreModule.f18264c.f20381e0.f88991A0.m137019l(momentFeedPushArgsNew_);
            }
            if (TextUtils.equals(abe0Var.m96743f().get("jumpType"), "directly")) {
                return CoreModule.m30932N().argsToPhotoAlbumFeedAct(abe0Var.m96739b(), str, "p_vote_user", -1, null, 2);
            }
            if ("1".equals(str3)) {
                return CoreModule.m30932N().argsToMomentDetailAct(abe0Var.m96739b(), BLiveOperationClickAction.scheme, str2, str);
            }
        }
        return xwa.m213323r(abe0Var.m96739b());
    }
}
