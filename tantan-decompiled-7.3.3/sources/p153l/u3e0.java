package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.p058ui.filter.FilterVerificationUserMsgDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class u3e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (mo95799c(abe0Var, z20Var) != null) {
            super.mo95798a(abe0Var, z20Var);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", "");
        Map<String, String> mapM96743f = abe0Var.m96743f();
        Intent intentM213320o = null;
        if (!TextUtils.isEmpty(strReplaceFirst) && "greeting".equals(strReplaceFirst)) {
            String str = mapM96743f.get("userId");
            String str2 = mapM96743f.get("channel");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Greeting greetingNew_ = Greeting.new_();
                greetingNew_.otherUser = str;
                greetingNew_.f21143id = str;
                greetingNew_.actorUserId = CoreModule.m30929H().userId();
                greetingNew_.channel = Channel.get(str2);
                C8523d.a aVar = new C8523d.a(greetingNew_, "card");
                Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
                if (activityM105506D != null && (activityM105506D instanceof Act)) {
                    C8523d.m47075a((Act) activityM105506D, aVar);
                }
                return null;
            }
        } else if (TextUtils.equals("receive_message_setting", strReplaceFirst)) {
            if (abe0Var.m96739b() instanceof Act) {
                new FilterVerificationUserMsgDlg((Act) abe0Var.m96739b(), FilterVerificationUserMsgDlg.FilterFrom.MSG_DEEPLINK).show();
            }
            return null;
        }
        String str3 = abe0Var.m96743f().get(Oauth2AccessToken.KEY_UID);
        if (CoreModule.m30929H().signedIn_() && !TextUtils.isEmpty(str3)) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str3);
            if (NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default")) {
                abe0Var.m96743f().get("pushtype");
                intentM213320o = xwa.m213320o(abe0Var.m96739b(), str3, 1, Boolean.parseBoolean(abe0Var.m96743f().get("showKeyboard")));
            }
        }
        return intentM213320o == null ? xwa.m213310e(abe0Var.m96739b()) : intentM213320o;
    }
}
