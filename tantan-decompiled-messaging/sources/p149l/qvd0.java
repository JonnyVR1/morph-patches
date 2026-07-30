package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.p053ui.filter.FilterVerificationUserMsgDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class qvd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (mo94422c(w2e0Var, f30Var) != null) {
            super.mo94421a(w2e0Var, f30Var);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m201099g()) ? "" : w2e0Var.m201099g().replaceFirst("/", "");
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        Intent intentM151859o = null;
        if (!TextUtils.isEmpty(strReplaceFirst) && "greeting".equals(strReplaceFirst)) {
            String str = mapM201098f.get("userId");
            String str2 = mapM201098f.get("channel");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Greeting greetingNew_ = Greeting.new_();
                greetingNew_.otherUser = str;
                greetingNew_.f20401id = str;
                greetingNew_.actorUserId = CoreModule.m29931H().userId();
                greetingNew_.channel = Channel.get(str2);
                C8360d.a aVar = new C8360d.a(greetingNew_, "card");
                Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
                if (activityM208326D != null && (activityM208326D instanceof Act)) {
                    C8360d.m45892a((Act) activityM208326D, aVar);
                }
                return null;
            }
        } else if (TextUtils.equals("receive_message_setting", strReplaceFirst)) {
            if (w2e0Var.m201094b() instanceof Act) {
                new FilterVerificationUserMsgDlg((Act) w2e0Var.m201094b(), FilterVerificationUserMsgDlg.FilterFrom.MSG_DEEPLINK).show();
            }
            return null;
        }
        String str3 = w2e0Var.m201098f().get(Oauth2AccessToken.KEY_UID);
        if (CoreModule.m29931H().signedIn_() && !TextUtils.isEmpty(str3)) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str3);
            if (NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "default")) {
                w2e0Var.m201098f().get("pushtype");
                intentM151859o = lva.m151859o(w2e0Var.m201094b(), str3, 1, Boolean.parseBoolean(w2e0Var.m201098f().get("showKeyboard")));
            }
        }
        return intentM151859o == null ? lva.m151849e(w2e0Var.m201094b()) : intentM151859o;
    }
}
