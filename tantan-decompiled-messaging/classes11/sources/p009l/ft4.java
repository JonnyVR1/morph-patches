package p009l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkDlgWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l.tpd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ft4 {

    /* JADX INFO: renamed from: b */
    public static volatile ft4 f13158b;

    /* JADX INFO: renamed from: c */
    public static final String f13159c;

    /* JADX INFO: renamed from: a */
    public tpd0 f13160a = new tpd0("chat_assistant_profile_dlg_continues_reject_" + CoreModule.H().userId(), 0);

    static {
        f13159c = juk.m17221e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant/index.html?speed=true&_bid=1004095&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/chat-assistant/index.html?speed=true&_bid=1004095&hideNavigationBar=1&hideNotch=1";
    }

    /* JADX INFO: renamed from: b */
    public static ft4 m14580b() {
        if (f13158b == null) {
            synchronized (ft4.class) {
                try {
                    if (f13158b == null) {
                        f13158b = new ft4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13158b;
    }

    /* JADX INFO: renamed from: a */
    public int m14581a() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public String m14582c(User user, User user2) {
        Profile profile;
        ArrayList arrayList = new ArrayList();
        if (user2 == null || (profile = user2.profile) == null || vwb.J(profile.answers)) {
            return "";
        }
        HashMap map = new HashMap();
        if (NullChecker.a(user) && NullChecker.a(user.profile) && !vwb.J(user.profile.answers)) {
            Iterator it = user.profile.answers.iterator();
            while (it.hasNext()) {
                String str = ((Answer) it.next()).question;
                map.put(str, str);
            }
        }
        for (Answer answer : user2.profile.answers) {
            if (!map.containsKey(answer.question)) {
                arrayList.add(answer.question);
            }
        }
        return et4.m14104a(",", arrayList);
    }

    /* JADX INFO: renamed from: d */
    public void m14583d(Act act) {
        m14584e(act, "");
    }

    /* JADX INFO: renamed from: e */
    public void m14584e(Act act, String str) {
        String str2 = f13159c;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "&top=" + str;
        }
        act.startActivity(MkWebViewAct.m10587e2(act, "", str2, true, true, false, true, null));
    }

    /* JADX INFO: renamed from: f */
    public boolean m14585f(Conversation conversation) {
        return m14586g() && NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.chatAssistantQuestion) && conversation.additional.chatAssistantQuestion.isReply;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14586g() {
        CoreModule.c.e0.p9();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14587h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14588i(String str) {
        return m14586g() && !TextUtils.isEmpty(str) && ((Integer) this.f13160a.get()).intValue() < m14581a();
    }

    /* JADX INFO: renamed from: j */
    public void m14589j(boolean z) {
        tpd0 tpd0Var = this.f13160a;
        if (z) {
            tpd0Var.clear();
        } else {
            tpd0Var.a(1);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14590k(Act act, String str) {
        Intent intentM10570X1 = MkDlgWebViewAct.m10570X1(act, "", f13159c + "&scene=profile&ids=" + str + "#/popups");
        intentM10570X1.putExtra("hideNavigationBar", true);
        intentM10570X1.putExtra("skipLoading", true);
        intentM10570X1.putExtra("transparent_status_bar", true);
        intentM10570X1.putExtra("webviewColor", "transparent");
        intentM10570X1.putExtra("hideNotch", true);
        act.startActivity(intentM10570X1);
    }
}
