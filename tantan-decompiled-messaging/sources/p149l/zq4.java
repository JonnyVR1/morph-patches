package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class zq4 {
    /* JADX INFO: renamed from: a */
    public static ChallengeMsg m219844a(ChallengeMsgList challengeMsgList, Message message) {
        Iterator<ChallengeMsg> it = challengeMsgList.msgData.iterator();
        ChallengeMsg next = null;
        while (it.hasNext()) {
            next = it.next();
            if (message.isMe() && TextUtils.equals(CoreModule.m29931H().userId(), next.f20359id)) {
                break;
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: b */
    public static String m219845b() {
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static void m219846c(Act act, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(m219845b())) {
            str = m219845b();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = !TextUtils.isEmpty(str2) && CoreModule.f17545c.f19639e0.m169524oa(str2).onlineMatchLocked();
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
        act.startActivity(MkWebViewAct.m80237b2(act, "真相测试", sb.toString(), true));
    }
}
