package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class eu4 {

    /* JADX INFO: renamed from: b */
    public static volatile eu4 f95839b;

    /* JADX INFO: renamed from: c */
    public static final String f95840c;

    /* JADX INFO: renamed from: a */
    public vxd0 f95841a = new vxd0("chat_assistant_profile_dlg_continues_reject_" + CoreModule.m30929H().userId(), 0);

    static {
        f95840c = zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant/index.html?speed=true&_bid=1004095&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant/index.html?speed=true&_bid=1004095&hideNavigationBar=1&hideNotch=1";
    }

    /* JADX INFO: renamed from: b */
    public static eu4 m122523b() {
        if (f95839b == null) {
            synchronized (eu4.class) {
                try {
                    if (f95839b == null) {
                        f95839b = new eu4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f95839b;
    }

    /* JADX INFO: renamed from: a */
    public int m122524a() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public String m122525c(User user, User user2) {
        Profile profile;
        ArrayList arrayList = new ArrayList();
        if (user2 == null || (profile = user2.profile) == null || jyb.m147479J(profile.answers)) {
            return "";
        }
        HashMap map = new HashMap();
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.profile) && !jyb.m147479J(user.profile.answers)) {
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
        return du4.m118067a(Constants.SEPARATOR_COMMA, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public void m122526d(Act act) {
        m122527e(act, "");
    }

    /* JADX INFO: renamed from: e */
    public void m122527e(Act act, String str) {
        String str2 = f95840c;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "&top=" + str;
        }
        act.startActivity(MkWebViewAct.m81423g2(act, "", str2, true, true, false, true, null));
    }

    /* JADX INFO: renamed from: f */
    public boolean m122528f(Conversation conversation) {
        return m122529g() && NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.chatAssistantQuestion) && conversation.additional.chatAssistantQuestion.isReply;
    }

    /* JADX INFO: renamed from: g */
    public boolean m122529g() {
        CoreModule.f18264c.f20381e0.m116600p9();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m122530h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m122531i(String str) {
        return m122529g() && !TextUtils.isEmpty(str) && this.f95841a.get().intValue() < m122524a();
    }

    /* JADX INFO: renamed from: j */
    public void m122532j(boolean z) {
        vxd0 vxd0Var = this.f95841a;
        if (z) {
            vxd0Var.clear();
        } else {
            vxd0Var.m203841a(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m122533k(Act act, String str) {
        Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(act, "", f95840c + "&scene=profile&ids=" + str + "#/popups");
        intentM81411Y1.putExtra("hideNavigationBar", true);
        intentM81411Y1.putExtra("skipLoading", true);
        intentM81411Y1.putExtra("transparent_status_bar", true);
        intentM81411Y1.putExtra("webviewColor", "transparent");
        intentM81411Y1.putExtra("hideNotch", true);
        act.startActivity(intentM81411Y1);
    }
}
