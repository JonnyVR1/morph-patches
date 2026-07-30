package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class yr4 {
    /* JADX INFO: renamed from: a */
    public static ChallengeMsg m217155a(ChallengeMsgList challengeMsgList, Message message) {
        Iterator<ChallengeMsg> it = challengeMsgList.msgData.iterator();
        ChallengeMsg next = null;
        while (it.hasNext()) {
            next = it.next();
            if (message.isMe() && TextUtils.equals(CoreModule.m30929H().userId(), next.f21101id)) {
                break;
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: b */
    public static String m217156b() {
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static void m217157c(Act act, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(m217156b())) {
            str = m217156b();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = !TextUtils.isEmpty(str2) && CoreModule.f18264c.f20381e0.m116597oa(str2).onlineMatchLocked();
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
        act.startActivity(MkWebViewAct.m81420c2(act, "真相测试", sb.toString(), true));
    }
}
