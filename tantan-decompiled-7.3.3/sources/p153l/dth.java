package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.AtChatGuides;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class dth {

    /* JADX INFO: renamed from: a */
    public static byd0 f90590a = new byd0("last_at_chat_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static vxd0 f90591b = new vxd0("at_chat_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: b */
    public static boolean m117871b() {
        if (cmg.m111243x()) {
            long jLongValue = f90590a.get().longValue();
            int iIntValue = f90591b.get().intValue();
            if (jLongValue <= 0 || !p6i.m170903l(jLongValue, pzi0.m174454o())) {
                return true;
            }
            if (p6i.m170903l(jLongValue, pzi0.m174454o()) && iIntValue < m117873d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<NotifyUsers> m117872c() {
        ArrayList<NotifyUsers> arrayList = new ArrayList<>();
        if (cmg.m111243x()) {
            Iterator<String> it = FeedModule.f39703d.f121359j0.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(FeedModule.f39703d.m145597R7(it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m117873d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("chatgpt_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return 3;
            }
            return new JSONObject(strM80485F).getInt("questionnumber");
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m117874e(final String str) {
        if (!cmg.m111243x()) {
            return "";
        }
        AtChatGuides atChatGuides = (AtChatGuides) jyb.m147529r((ArrayList) FeedModule.f39703d.m145597R7(User.ID_WISDOM_STAR).guides, new qcj() { // from class: l.cth
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((AtChatGuides) obj).title, str));
            }
        });
        return atChatGuides.questions.get(new Random().nextInt(atChatGuides.questions.size()));
    }

    /* JADX INFO: renamed from: f */
    public static NotifyUsers m117875f(TopicMoment topicMoment) {
        if (!cmg.m111243x()) {
            return null;
        }
        Iterator<String> it = FeedModule.f39703d.f121359j0.keySet().iterator();
        while (it.hasNext()) {
            NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(it.next());
            if (TextUtils.equals(notifyUsersM145597R7.topic.f39672id, topicMoment.f40095id)) {
                return notifyUsersM145597R7;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m117876g() {
        NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(User.ID_WISDOM_STAR);
        return NullChecker.m82486a(notifyUsersM145597R7) ? notifyUsersM145597R7.name : "";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m117877h(NotifyUsers notifyUsers) {
        return !User.isWisdomStar(notifyUsers.userId) || m117871b();
    }

    /* JADX INFO: renamed from: i */
    public static void m117878i() {
        long jLongValue = f90590a.get().longValue();
        int iIntValue = f90591b.get().intValue();
        if (jLongValue <= 0) {
            f90590a.put(Long.valueOf(pzi0.m174454o()));
            f90591b.put(1);
        }
        if (!p6i.m170903l(jLongValue, pzi0.m174454o())) {
            f90590a.put(Long.valueOf(pzi0.m174454o()));
            f90591b.put(1);
        }
        if (!p6i.m170903l(jLongValue, pzi0.m174454o()) || iIntValue >= m117873d()) {
            return;
        }
        f90590a.put(Long.valueOf(pzi0.m174454o()));
        f90591b.put(Integer.valueOf(iIntValue + 1));
    }
}
