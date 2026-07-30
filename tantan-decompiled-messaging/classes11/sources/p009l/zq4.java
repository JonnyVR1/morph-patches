package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.Message;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zq4 {
    /* JADX INFO: renamed from: a */
    public static ChallengeMsg m25919a(ChallengeMsgList challengeMsgList, Message message) {
        challengeMsg = null;
        for (ChallengeMsg challengeMsg : challengeMsgList.msgData) {
            if (message.isMe() && TextUtils.equals(CoreModule.H().userId(), challengeMsg.id)) {
                break;
            }
        }
        return challengeMsg;
    }

    /* JADX INFO: renamed from: b */
    public static String m25920b() {
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static void m25921c(Act act, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(m25920b())) {
            str = m25920b();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = !TextUtils.isEmpty(str2) && CoreModule.c.e0.oa(str2).onlineMatchLocked();
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("?")) {
            sb.append("otherUserId=");
            sb.append(str2);
            sb.append("&questionTypeId=&questionLibId=&source=");
            sb.append(str3);
            sb.append("&shouldBlur=");
            sb.append(z);
        } else {
            if (!str.contains("otherUserId")) {
                sb.append("&otherUserId=");
                sb.append(str2);
            }
            if (!str.contains("questionTypeId")) {
                sb.append("&questionTypeId=");
            }
            if (!str.contains("questionLibId")) {
                sb.append("&questionLibId=");
            }
            if (!str.contains("source")) {
                sb.append("&source=");
                sb.append(str3);
            }
            sb.append("&shouldBlur=");
            sb.append(z);
        }
        act.startActivity(MkWebViewAct.m10584b2(act, "真相测试", sb.toString(), true));
    }
}
