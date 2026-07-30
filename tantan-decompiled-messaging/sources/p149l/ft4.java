package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class ft4 {

    /* JADX INFO: renamed from: b */
    public static volatile ft4 f99139b;

    /* JADX INFO: renamed from: c */
    public static final String f99140c;

    /* JADX INFO: renamed from: a */
    public tpd0 f99141a = new tpd0("chat_assistant_profile_dlg_continues_reject_" + CoreModule.m29931H().userId(), 0);

    static {
        f99140c = juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant/index.html?speed=true&_bid=1004095&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant/index.html?speed=true&_bid=1004095&hideNavigationBar=1&hideNotch=1";
    }

    /* JADX INFO: renamed from: b */
    public static ft4 m123008b() {
        if (f99139b == null) {
            synchronized (ft4.class) {
                try {
                    if (f99139b == null) {
                        f99139b = new ft4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f99139b;
    }

    /* JADX INFO: renamed from: a */
    public int m123009a() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public String m123010c(User user, User user2) {
        Profile profile;
        ArrayList arrayList = new ArrayList();
        if (user2 == null || (profile = user2.profile) == null || vwb.m200296J(profile.answers)) {
            return "";
        }
        HashMap map = new HashMap();
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile) && !vwb.m200296J(user.profile.answers)) {
            Iterator<Answer> it = user.profile.answers.iterator();
            while (it.hasNext()) {
                String str = it.next().question;
                map.put(str, str);
            }
        }
        for (Answer answer : user2.profile.answers) {
            if (!map.containsKey(answer.question)) {
                arrayList.add(answer.question);
            }
        }
        return et4.m117971a(Constants.SEPARATOR_COMMA, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public void m123011d(Act act) {
        m123012e(act, "");
    }

    /* JADX INFO: renamed from: e */
    public void m123012e(Act act, String str) {
        String str2 = f99140c;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "&top=" + str;
        }
        act.startActivity(MkWebViewAct.m80240e2(act, "", str2, true, true, false, true, null));
    }

    /* JADX INFO: renamed from: f */
    public boolean m123013f(Conversation conversation) {
        return m123014g() && NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.chatAssistantQuestion) && conversation.additional.chatAssistantQuestion.isReply;
    }

    /* JADX INFO: renamed from: g */
    public boolean m123014g() {
        CoreModule.f17545c.f19639e0.m169527p9();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m123015h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m123016i(String str) {
        return m123014g() && !TextUtils.isEmpty(str) && this.f99141a.get().intValue() < m123009a();
    }

    /* JADX INFO: renamed from: j */
    public void m123017j(boolean z) {
        tpd0 tpd0Var = this.f99141a;
        if (z) {
            tpd0Var.clear();
        } else {
            tpd0Var.m189988a(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m123018k(Act act, String str) {
        Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(act, "", f99140c + "&scene=profile&ids=" + str + "#/popups");
        intentM80228X1.putExtra("hideNavigationBar", true);
        intentM80228X1.putExtra("skipLoading", true);
        intentM80228X1.putExtra("transparent_status_bar", true);
        intentM80228X1.putExtra("webviewColor", "transparent");
        intentM80228X1.putExtra("hideNotch", true);
        act.startActivity(intentM80228X1);
    }
}
