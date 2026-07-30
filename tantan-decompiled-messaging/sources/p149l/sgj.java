package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class sgj {

    /* JADX INFO: renamed from: a */
    public static boolean f164422a = false;

    /* JADX INFO: renamed from: b */
    public static List<Integer> f164423b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static int f164424c = 0;

    /* JADX INFO: renamed from: d */
    public static long f164425d = 0;

    /* JADX INFO: renamed from: e */
    public static long f164426e = 0;

    /* JADX INFO: renamed from: f */
    public static long f164427f = 0;

    /* JADX INFO: renamed from: g */
    public static int f164428g = 0;

    /* JADX INFO: renamed from: h */
    public static boolean f164429h = false;

    /* JADX INFO: renamed from: i */
    public static tpd0 f164430i;

    /* JADX INFO: renamed from: j */
    public static hpd0 f164431j;

    /* JADX INFO: renamed from: k */
    public static hpd0 f164432k;

    /* JADX INFO: renamed from: l */
    public static hpd0 f164433l;

    /* JADX INFO: renamed from: m */
    public static tpd0 f164434m;

    /* JADX INFO: renamed from: n */
    public static zpd0 f164435n;

    /* JADX INFO: renamed from: o */
    public static vqd0 f164436o;

    /* JADX INFO: renamed from: a */
    public static void m184088a(String str) {
        if (!NullChecker.m81303a(f164430i)) {
            f164430i = new tpd0("follow_streamer_count_" + str, 0);
        }
        if (!NullChecker.m81303a(f164431j)) {
            f164431j = new hpd0("1st_enter_live_room_" + str, Boolean.FALSE);
        }
        if (!NullChecker.m81303a(f164432k)) {
            f164432k = new hpd0("1st_send_message_" + str, Boolean.FALSE);
        }
        if (!NullChecker.m81303a(f164433l)) {
            f164433l = new hpd0("1st_give_gift_" + str, Boolean.FALSE);
        }
        if (!NullChecker.m81303a(f164434m)) {
            f164434m = new tpd0("give_gift_count_" + str, 0);
        }
        if (!NullChecker.m81303a(f164435n)) {
            f164435n = new zpd0("leaderboard_time_" + str, 0L);
        }
        if (NullChecker.m81303a(f164436o)) {
            return;
        }
        f164436o = new vqd0("leaderboard_sets_" + str, new HashSet());
    }

    /* JADX INFO: renamed from: b */
    public static void m184089b() {
        if (NullChecker.m81303a(f164430i)) {
            f164430i.clear();
            f164430i = null;
        }
        if (NullChecker.m81303a(f164431j)) {
            f164431j.clear();
            f164431j = null;
        }
        if (NullChecker.m81303a(f164432k)) {
            f164432k.clear();
            f164432k = null;
        }
        if (NullChecker.m81303a(f164433l)) {
            f164433l.clear();
            f164433l = null;
        }
        if (NullChecker.m81303a(f164434m)) {
            f164434m = null;
        }
        if (NullChecker.m81303a(f164435n)) {
            f164435n = null;
        }
        if (NullChecker.m81303a(f164436o)) {
            f164436o = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m184090c() {
        if (NullChecker.m81303a(f164431j) && !f164431j.get().booleanValue()) {
            qib0.m174815e1("view_1st_streamer", new Object[0]);
            f164431j.put(Boolean.TRUE);
        }
        int i = f164424c + 1;
        f164424c = i;
        if (i == 3) {
            qib0.m174815e1("view3streamers", new Object[0]);
        }
        if (f164424c == 5) {
            qib0.m174815e1("view5streamers", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m184091d() {
        if (NullChecker.m81303a(f164430i)) {
            tpd0 tpd0Var = f164430i;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            if (f164430i.get().intValue() == 3) {
                qib0.m174815e1("follow3streamers", new Object[0]);
            }
            if (f164430i.get().intValue() == 5) {
                qib0.m174815e1("follow5streamers", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m184092e() {
        if (NullChecker.m81303a(f164433l) && !f164433l.get().booleanValue()) {
            qib0.m174815e1("give_1st_gift", new Object[0]);
            f164433l.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m184093f() {
        tpd0 tpd0Var = f164434m;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        Integer num = f164434m.get();
        if (num.intValue() == 5) {
            qib0.m174815e1("send_5_gifts", new Object[0]);
        } else if (num.intValue() == 10) {
            qib0.m174815e1("send_10_gifts", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m184094g(double d) {
        qib0.m174815e1("send_gift", "coinsNum", String.valueOf(d));
        if (d >= 99.0d) {
            qib0.m174815e1("send_medium_gift", "coinsNum", String.valueOf(d));
        }
        if (d >= 999.0d) {
            qib0.m174815e1("send_big_gift", "coinsNum", String.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m184095h(String str, String str2, long j, long j2) {
        if (!mqi0.m155930E(f164435n.get().longValue(), 10800)) {
            f164435n.put(Long.valueOf(mqi0.m155944o()));
            f164436o.put(new HashSet());
        }
        HashSet<String> hashSet = f164436o.get();
        if (j <= 10 && j2 >= 1000) {
            String string = TextUtils.concat(str, str2, "top_chart10").toString();
            if (!hashSet.contains(string)) {
                hashSet.add(string);
                f164436o.put(hashSet);
                qib0.m174815e1("top_chart10", new Object[0]);
            }
        }
        if (j > 3 || j2 < 1000) {
            return;
        }
        String string2 = TextUtils.concat(str, str2, "top_chart3").toString();
        if (hashSet.contains(string2)) {
            return;
        }
        hashSet.add(string2);
        f164436o.put(hashSet);
        qib0.m174815e1("top_chart3", new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public static void m184096i() {
        if (f164429h) {
            return;
        }
        qib0.m174815e1("view_more_streamers", new Object[0]);
        f164429h = true;
    }

    /* JADX INFO: renamed from: j */
    public static void m184097j() {
        if (NullChecker.m81303a(f164432k) && !f164432k.get().booleanValue()) {
            qib0.m174815e1("send_1st_message_on_live", new Object[0]);
            f164432k.put(Boolean.TRUE);
        }
        int i = f164428g + 1;
        f164428g = i;
        if (i == 10) {
            qib0.m174815e1("send10messages", new Object[0]);
        }
        if (f164428g == 20) {
            qib0.m174815e1("send20messages", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m184098k() {
        qib0.m174815e1("live_square_nearby", new Object[0]);
    }

    /* JADX INFO: renamed from: l */
    public static void m184099l() {
        qib0.m174815e1("live_square_recommend", new Object[0]);
    }

    /* JADX INFO: renamed from: m */
    public static void m184100m(int i) {
        if (!f164422a) {
            qib0.m174815e1("tantancoin_purchase_complete", new Object[0]);
            f164422a = true;
        }
        if (i != 210) {
            if (i != 420) {
                if (i != 756) {
                    if (i == 3626 && !f164423b.contains(Integer.valueOf(i))) {
                        qib0.m174815e1("3626_tantancoin_purchase_complete", new Object[0]);
                    }
                } else if (!f164423b.contains(Integer.valueOf(i))) {
                    qib0.m174815e1("756_tantancoin_purchase_complete", new Object[0]);
                }
            } else if (!f164423b.contains(Integer.valueOf(i))) {
                qib0.m174815e1("420_tantancoin_purchase_complete", new Object[0]);
            }
        } else if (!f164423b.contains(Integer.valueOf(i))) {
            qib0.m174815e1("210_tantancoin_purchase_complete", new Object[0]);
        }
        f164423b.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public static void m184101n(boolean z) {
        if (f164425d <= 900000) {
            if (!z) {
                f164426e = mqi0.m155944o();
                return;
            }
            long jM155944o = mqi0.m155944o();
            f164427f = jM155944o;
            long j = f164425d + (jM155944o - f164426e);
            f164425d = j;
            if (j > 900000) {
                qib0.m174815e1("view_more_than_15mins", new Object[0]);
            }
        }
    }
}
