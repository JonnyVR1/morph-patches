package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.ui.filter.FilterVerificationUserMsgDlg;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.f30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qvd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (mo11682c(w2e0Var, f30Var) != null) {
            super.mo11681a(w2e0Var, f30Var);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m26161g()) ? "" : w2e0Var.m26161g().replaceFirst("/", "");
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        Intent intentM19036o = null;
        if (!TextUtils.isEmpty(strReplaceFirst) && "greeting".equals(strReplaceFirst)) {
            String str = mapM26160f.get("userId");
            String str2 = mapM26160f.get("channel");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Greeting greetingNew_ = Greeting.new_();
                greetingNew_.otherUser = str;
                greetingNew_.id = str;
                greetingNew_.actorUserId = CoreModule.m1850H().userId();
                greetingNew_.channel = Channel.get(str2);
                d.a aVar = new d.a(greetingNew_, "card");
                Act actD = xdl0.D(w2e0Var.m26156b());
                if (actD != null && (actD instanceof Act)) {
                    d.a(actD, aVar);
                }
                return null;
            }
        } else if (TextUtils.equals("receive_message_setting", strReplaceFirst)) {
            if (w2e0Var.m26156b() instanceof Act) {
                new FilterVerificationUserMsgDlg(w2e0Var.m26156b(), FilterVerificationUserMsgDlg.FilterFrom.MSG_DEEPLINK).show();
            }
            return null;
        }
        String str3 = w2e0Var.m26160f().get("uid");
        if (CoreModule.m1850H().signedIn_() && !TextUtils.isEmpty(str3)) {
            Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(str3);
            if (NullChecker.a(conversationM4786Xe) && TEnum.equals(conversationM4786Xe.status, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
                w2e0Var.m26160f().get("pushtype");
                intentM19036o = lva.m19036o(w2e0Var.m26156b(), str3, 1, Boolean.parseBoolean(w2e0Var.m26160f().get("showKeyboard")));
            }
        }
        return intentM19036o == null ? lva.m19026e(w2e0Var.m26156b()) : intentM19036o;
    }
}
