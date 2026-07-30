package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.AtChatGuides;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class orh {

    /* JADX INFO: renamed from: a */
    public static zpd0 f11566a = new zpd0("last_at_chat_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static tpd0 f11567b = new tpd0("at_chat_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: b */
    public static boolean m12746b() {
        if (nkg.m12273x()) {
            long jLongValue = ((Long) f11566a.get()).longValue();
            int iIntValue = ((Integer) f11567b.get()).intValue();
            if (jLongValue <= 0 || !a5i.m8412l(jLongValue, mqi0.o())) {
                return true;
            }
            if (a5i.m8412l(jLongValue, mqi0.o()) && iIntValue < m12748d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<NotifyUsers> m12747c() {
        ArrayList<NotifyUsers> arrayList = new ArrayList<>();
        if (nkg.m12273x()) {
            Iterator<String> it = FeedModule.f316d.f14984j0.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(FeedModule.f316d.m16537R7(it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m12748d() {
        try {
            String strF = RemoteConfig.x().F("chatgpt_config");
            if (TextUtils.isEmpty(strF)) {
                return 3;
            }
            return new JSONObject(strF).getInt("questionnumber");
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m12749e(final String str) {
        if (!nkg.m12273x()) {
            return "";
        }
        AtChatGuides atChatGuides = (AtChatGuides) vwb.r((ArrayList) FeedModule.f316d.m16537R7(User.ID_WISDOM_STAR).guides, new w9j() { // from class: l.nrh
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((AtChatGuides) obj).title, str));
            }
        });
        return atChatGuides.questions.get(new Random().nextInt(atChatGuides.questions.size()));
    }

    /* JADX INFO: renamed from: f */
    public static NotifyUsers m12750f(TopicMoment topicMoment) {
        if (!nkg.m12273x()) {
            return null;
        }
        Iterator<String> it = FeedModule.f316d.f14984j0.keySet().iterator();
        while (it.hasNext()) {
            NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(it.next());
            if (TextUtils.equals(notifyUsersM16537R7.topic.f285id, topicMoment.f708id)) {
                return notifyUsersM16537R7;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m12751g() {
        NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(User.ID_WISDOM_STAR);
        return NullChecker.a(notifyUsersM16537R7) ? notifyUsersM16537R7.name : "";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12752h(NotifyUsers notifyUsers) {
        return !User.isWisdomStar(notifyUsers.userId) || m12746b();
    }

    /* JADX INFO: renamed from: i */
    public static void m12753i() {
        long jLongValue = ((Long) f11566a.get()).longValue();
        int iIntValue = ((Integer) f11567b.get()).intValue();
        if (jLongValue <= 0) {
            f11566a.put(Long.valueOf(mqi0.o()));
            f11567b.put(1);
        }
        if (!a5i.m8412l(jLongValue, mqi0.o())) {
            f11566a.put(Long.valueOf(mqi0.o()));
            f11567b.put(1);
        }
        if (!a5i.m8412l(jLongValue, mqi0.o()) || iIntValue >= m12748d()) {
            return;
        }
        f11566a.put(Long.valueOf(mqi0.o()));
        f11567b.put(Integer.valueOf(iIntValue + 1));
    }
}
