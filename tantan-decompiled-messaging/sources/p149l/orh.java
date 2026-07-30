package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.AtChatGuides;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class orh {

    /* JADX INFO: renamed from: a */
    public static zpd0 f145277a = new zpd0("last_at_chat_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static tpd0 f145278b = new tpd0("at_chat_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: b */
    public static boolean m165569b() {
        if (nkg.m159914x()) {
            long jLongValue = f145277a.get().longValue();
            int iIntValue = f145278b.get().intValue();
            if (jLongValue <= 0 || !a5i.m95036l(jLongValue, mqi0.m155944o())) {
                return true;
            }
            if (a5i.m95036l(jLongValue, mqi0.m155944o()) && iIntValue < m165571d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<NotifyUsers> m165570c() {
        ArrayList<NotifyUsers> arrayList = new ArrayList<>();
        if (nkg.m159914x()) {
            Iterator<String> it = FeedModule.f38855d.f193049j0.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(FeedModule.f38855d.m209356R7(it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static int m165571d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("chatgpt_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 3;
            }
            return new JSONObject(strM79302F).getInt("questionnumber");
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m165572e(final String str) {
        if (!nkg.m159914x()) {
            return "";
        }
        AtChatGuides atChatGuides = (AtChatGuides) vwb.m200346r((ArrayList) FeedModule.f38855d.m209356R7(User.ID_WISDOM_STAR).guides, new w9j() { // from class: l.nrh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((AtChatGuides) obj).title, str));
            }
        });
        return atChatGuides.questions.get(new Random().nextInt(atChatGuides.questions.size()));
    }

    /* JADX INFO: renamed from: f */
    public static NotifyUsers m165573f(TopicMoment topicMoment) {
        if (!nkg.m159914x()) {
            return null;
        }
        Iterator<String> it = FeedModule.f38855d.f193049j0.keySet().iterator();
        while (it.hasNext()) {
            NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(it.next());
            if (TextUtils.equals(notifyUsersM209356R7.topic.f38824id, topicMoment.f39247id)) {
                return notifyUsersM209356R7;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m165574g() {
        NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(User.ID_WISDOM_STAR);
        return NullChecker.m81303a(notifyUsersM209356R7) ? notifyUsersM209356R7.name : "";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m165575h(NotifyUsers notifyUsers) {
        return !User.isWisdomStar(notifyUsers.userId) || m165569b();
    }

    /* JADX INFO: renamed from: i */
    public static void m165576i() {
        long jLongValue = f145277a.get().longValue();
        int iIntValue = f145278b.get().intValue();
        if (jLongValue <= 0) {
            f145277a.put(Long.valueOf(mqi0.m155944o()));
            f145278b.put(1);
        }
        if (!a5i.m95036l(jLongValue, mqi0.m155944o())) {
            f145277a.put(Long.valueOf(mqi0.m155944o()));
            f145278b.put(1);
        }
        if (!a5i.m95036l(jLongValue, mqi0.m155944o()) || iIntValue >= m165571d()) {
            return;
        }
        f145277a.put(Long.valueOf(mqi0.m155944o()));
        f145278b.put(Integer.valueOf(iIntValue + 1));
    }
}
