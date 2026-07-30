package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class mjj {

    /* JADX INFO: renamed from: a */
    public static boolean f137083a = false;

    /* JADX INFO: renamed from: b */
    public static List<Integer> f137084b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static int f137085c = 0;

    /* JADX INFO: renamed from: d */
    public static long f137086d = 0;

    /* JADX INFO: renamed from: e */
    public static long f137087e = 0;

    /* JADX INFO: renamed from: f */
    public static long f137088f = 0;

    /* JADX INFO: renamed from: g */
    public static int f137089g = 0;

    /* JADX INFO: renamed from: h */
    public static boolean f137090h = false;

    /* JADX INFO: renamed from: i */
    public static vxd0 f137091i;

    /* JADX INFO: renamed from: j */
    public static jxd0 f137092j;

    /* JADX INFO: renamed from: k */
    public static jxd0 f137093k;

    /* JADX INFO: renamed from: l */
    public static jxd0 f137094l;

    /* JADX INFO: renamed from: m */
    public static vxd0 f137095m;

    /* JADX INFO: renamed from: n */
    public static byd0 f137096n;

    /* JADX INFO: renamed from: o */
    public static xyd0 f137097o;

    /* JADX INFO: renamed from: a */
    public static void m158572a(String str) {
        if (!NullChecker.m82486a(f137091i)) {
            f137091i = new vxd0("follow_streamer_count_" + str, 0);
        }
        if (!NullChecker.m82486a(f137092j)) {
            f137092j = new jxd0("1st_enter_live_room_" + str, Boolean.FALSE);
        }
        if (!NullChecker.m82486a(f137093k)) {
            f137093k = new jxd0("1st_send_message_" + str, Boolean.FALSE);
        }
        if (!NullChecker.m82486a(f137094l)) {
            f137094l = new jxd0("1st_give_gift_" + str, Boolean.FALSE);
        }
        if (!NullChecker.m82486a(f137095m)) {
            f137095m = new vxd0("give_gift_count_" + str, 0);
        }
        if (!NullChecker.m82486a(f137096n)) {
            f137096n = new byd0("leaderboard_time_" + str, 0L);
        }
        if (NullChecker.m82486a(f137097o)) {
            return;
        }
        f137097o = new xyd0("leaderboard_sets_" + str, new HashSet());
    }

    /* JADX INFO: renamed from: b */
    public static void m158573b() {
        if (NullChecker.m82486a(f137091i)) {
            f137091i.clear();
            f137091i = null;
        }
        if (NullChecker.m82486a(f137092j)) {
            f137092j.clear();
            f137092j = null;
        }
        if (NullChecker.m82486a(f137093k)) {
            f137093k.clear();
            f137093k = null;
        }
        if (NullChecker.m82486a(f137094l)) {
            f137094l.clear();
            f137094l = null;
        }
        if (NullChecker.m82486a(f137095m)) {
            f137095m = null;
        }
        if (NullChecker.m82486a(f137096n)) {
            f137096n = null;
        }
        if (NullChecker.m82486a(f137097o)) {
            f137097o = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m158574c() {
        if (NullChecker.m82486a(f137092j) && !f137092j.get().booleanValue()) {
            uqb0.m197269e1("view_1st_streamer", new Object[0]);
            f137092j.put(Boolean.TRUE);
        }
        int i = f137085c + 1;
        f137085c = i;
        if (i == 3) {
            uqb0.m197269e1("view3streamers", new Object[0]);
        }
        if (f137085c == 5) {
            uqb0.m197269e1("view5streamers", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m158575d() {
        if (NullChecker.m82486a(f137091i)) {
            vxd0 vxd0Var = f137091i;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            if (f137091i.get().intValue() == 3) {
                uqb0.m197269e1("follow3streamers", new Object[0]);
            }
            if (f137091i.get().intValue() == 5) {
                uqb0.m197269e1("follow5streamers", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m158576e() {
        if (NullChecker.m82486a(f137094l) && !f137094l.get().booleanValue()) {
            uqb0.m197269e1("give_1st_gift", new Object[0]);
            f137094l.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m158577f() {
        vxd0 vxd0Var = f137095m;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        Integer num = f137095m.get();
        if (num.intValue() == 5) {
            uqb0.m197269e1("send_5_gifts", new Object[0]);
        } else if (num.intValue() == 10) {
            uqb0.m197269e1("send_10_gifts", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m158578g(double d) {
        uqb0.m197269e1("send_gift", "coinsNum", String.valueOf(d));
        if (d >= 99.0d) {
            uqb0.m197269e1("send_medium_gift", "coinsNum", String.valueOf(d));
        }
        if (d >= 999.0d) {
            uqb0.m197269e1("send_big_gift", "coinsNum", String.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m158579h(String str, String str2, long j, long j2) {
        if (!pzi0.m174440E(f137096n.get().longValue(), 10800)) {
            f137096n.put(Long.valueOf(pzi0.m174454o()));
            f137097o.put(new HashSet());
        }
        HashSet<String> hashSet = f137097o.get();
        if (j <= 10 && j2 >= 1000) {
            String string = TextUtils.concat(str, str2, "top_chart10").toString();
            if (!hashSet.contains(string)) {
                hashSet.add(string);
                f137097o.put(hashSet);
                uqb0.m197269e1("top_chart10", new Object[0]);
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
        f137097o.put(hashSet);
        uqb0.m197269e1("top_chart3", new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public static void m158580i() {
        if (f137090h) {
            return;
        }
        uqb0.m197269e1("view_more_streamers", new Object[0]);
        f137090h = true;
    }

    /* JADX INFO: renamed from: j */
    public static void m158581j() {
        if (NullChecker.m82486a(f137093k) && !f137093k.get().booleanValue()) {
            uqb0.m197269e1("send_1st_message_on_live", new Object[0]);
            f137093k.put(Boolean.TRUE);
        }
        int i = f137089g + 1;
        f137089g = i;
        if (i == 10) {
            uqb0.m197269e1("send10messages", new Object[0]);
        }
        if (f137089g == 20) {
            uqb0.m197269e1("send20messages", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m158582k() {
        uqb0.m197269e1("live_square_nearby", new Object[0]);
    }

    /* JADX INFO: renamed from: l */
    public static void m158583l() {
        uqb0.m197269e1("live_square_recommend", new Object[0]);
    }

    /* JADX INFO: renamed from: m */
    public static void m158584m(int i) {
        if (!f137083a) {
            uqb0.m197269e1("tantancoin_purchase_complete", new Object[0]);
            f137083a = true;
        }
        if (i != 210) {
            if (i != 420) {
                if (i != 756) {
                    if (i == 3626 && !f137084b.contains(Integer.valueOf(i))) {
                        uqb0.m197269e1("3626_tantancoin_purchase_complete", new Object[0]);
                    }
                } else if (!f137084b.contains(Integer.valueOf(i))) {
                    uqb0.m197269e1("756_tantancoin_purchase_complete", new Object[0]);
                }
            } else if (!f137084b.contains(Integer.valueOf(i))) {
                uqb0.m197269e1("420_tantancoin_purchase_complete", new Object[0]);
            }
        } else if (!f137084b.contains(Integer.valueOf(i))) {
            uqb0.m197269e1("210_tantancoin_purchase_complete", new Object[0]);
        }
        f137084b.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public static void m158585n(boolean z) {
        if (f137086d <= 900000) {
            if (!z) {
                f137087e = pzi0.m174454o();
                return;
            }
            long jM174454o = pzi0.m174454o();
            f137088f = jM174454o;
            long j = f137086d + (jM174454o - f137087e);
            f137086d = j;
            if (j > 900000) {
                uqb0.m197269e1("view_more_than_15mins", new Object[0]);
            }
        }
    }
}
