package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.MomentFeedPushArgs;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fyd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = w2e0Var.m26161g() != null ? w2e0Var.m26161g().replaceFirst("/", "") : null;
        if (!TextUtils.isEmpty(w2e0Var.m26161g())) {
            String str = w2e0Var.m26160f().get("uid");
            String str2 = w2e0Var.m26160f().get("mid");
            String str3 = w2e0Var.m26160f().get("web");
            w2e0Var.m26160f().get("pushtype");
            String str4 = w2e0Var.m26160f().get("intent");
            if (!TextUtils.isEmpty(strReplaceFirst)) {
                if (!TextUtils.isEmpty(str)) {
                    CoreModule.m1853N().coreMomentLatest(str);
                }
                if (!TextUtils.isEmpty(str4)) {
                    strReplaceFirst = strReplaceFirst + "_" + str4;
                }
                MomentFeedPushArgs momentFeedPushArgsNew_ = MomentFeedPushArgs.new_();
                momentFeedPushArgsNew_.uid = str;
                momentFeedPushArgsNew_.mid = str2;
                momentFeedPushArgsNew_.path = strReplaceFirst;
                momentFeedPushArgsNew_.schemeParamMap = w2e0Var.m26160f();
                CoreModule.f1534c.f3628e0.f18746A0.onNext(momentFeedPushArgsNew_);
            }
            if (TextUtils.equals(w2e0Var.m26160f().get("jumpType"), "directly")) {
                return CoreModule.m1853N().argsToPhotoAlbumFeedAct(w2e0Var.m26156b(), str, "p_vote_user", -1, (String) null, 2);
            }
            if ("1".equals(str3)) {
                return CoreModule.m1853N().argsToMomentDetailAct(w2e0Var.m26156b(), "scheme", str2, str);
            }
        }
        return lva.m19039r(w2e0Var.m26156b());
    }
}
