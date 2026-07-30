package p007l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import l.mqi0;
import l.tpd0;
import l.zpd0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class flg {

    /* JADX INFO: renamed from: a */
    public static zpd0 f8127a = new zpd0("last_show_unread_activities_tips_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static tpd0 f8128b = new tpd0("show_unread_activities_tips_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: c */
    public static zpd0 f8129c = new zpd0("last_show_all_read_activities_tips_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public static tpd0 f8130d = new tpd0("show_all_read_activities_tips_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: e */
    public static zpd0 f8131e = new zpd0("last_show_all_read_activities_dialog_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public static tpd0 f8132f = new tpd0("show_all_read_activities_dialog_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: g */
    public static zpd0 f8133g = new zpd0("last_auto_clear_unread_activities_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public static zpd0 f8134h = new zpd0("last_ignore_all_read_activities_dialog_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: i */
    public static zpd0 f8135i = new zpd0("last_upgrades_all_read_activities_dialog_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public static tpd0 f8136j = new tpd0("show_upgrades_all_read_activities_dialog_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: k */
    public static String f8137k = "e_all_read_remind_popup";

    /* JADX INFO: renamed from: a */
    public static void m10119a() {
        f8131e.put(Long.valueOf(mqi0.o()));
        f8132f.put(2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10120b(int i) {
        if (nkg.m12257p()) {
            long jLongValue = ((Long) f8135i.get()).longValue();
            long jLongValue2 = ((Long) f8131e.get()).longValue();
            int iIntValue = ((Integer) f8132f.get()).intValue();
            long jLongValue3 = ((Long) f8129c.get()).longValue();
            int iIntValue2 = ((Integer) f8130d.get()).intValue();
            if (!a5i.m8413m(jLongValue2)) {
                f8132f.put(0);
            }
            if (i < m10125g() || iIntValue2 < 3) {
                return false;
            }
            if (jLongValue3 > 0 && DateUtils.isToday(jLongValue3)) {
                return false;
            }
            if (jLongValue2 > 0 && DateUtils.isToday(jLongValue2)) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue2 <= 0) {
                f8131e.put(Long.valueOf(mqi0.o()));
                f8132f.put(1);
                return true;
            }
            if (!a5i.m8413m(jLongValue2)) {
                f8131e.put(Long.valueOf(mqi0.o()));
                f8132f.put(1);
                return true;
            }
            if (iIntValue < 2) {
                f8131e.put(Long.valueOf(mqi0.o()));
                f8132f.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10121c(int i, int i2) {
        int iIntValue;
        if (i2 <= 0 || i < m10126h("unreadnoticenumber")) {
            return false;
        }
        long jLongValue = ((Long) f8134h.get()).longValue();
        long jLongValue2 = ((Long) f8135i.get()).longValue();
        if (!a5i.m8413m(jLongValue2)) {
            f8136j.put(0);
        }
        if ((jLongValue2 > 0 && DateUtils.isToday(jLongValue2)) || (iIntValue = ((Integer) f8136j.get()).intValue()) >= m10126h("unreadguidepopshownumber")) {
            return false;
        }
        if (jLongValue > 0 && !DateUtils.isToday(jLongValue)) {
            f8135i.put(Long.valueOf(mqi0.o()));
            f8136j.put(Integer.valueOf(iIntValue + 1));
            return true;
        }
        User userMe_ = FeedModule.m1140H().me_();
        if (!NullChecker.a(userMe_) || !userMe_.isFemale()) {
            return false;
        }
        f8135i.put(Long.valueOf(mqi0.o()));
        f8136j.put(Integer.valueOf(iIntValue + 1));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10122d(int i) {
        if (nkg.m12257p()) {
            long jLongValue = ((Long) f8129c.get()).longValue();
            int iIntValue = ((Integer) f8130d.get()).intValue();
            if (i < m10125g()) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue <= 0) {
                f8129c.put(Long.valueOf(mqi0.o()));
                f8130d.put(1);
                return true;
            }
            if (!a5i.m8413m(jLongValue)) {
                f8129c.put(Long.valueOf(mqi0.o()));
                f8130d.put(1);
                return true;
            }
            if (iIntValue < 3) {
                f8129c.put(Long.valueOf(mqi0.o()));
                f8130d.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10123e(int i) {
        if (nkg.m12257p()) {
            long jLongValue = ((Long) f8127a.get()).longValue();
            int iIntValue = ((Integer) f8128b.get()).intValue();
            if (i < m10125g()) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue <= 0) {
                f8127a.put(Long.valueOf(mqi0.o()));
                f8128b.put(1);
                return true;
            }
            if (!a5i.m8413m(jLongValue)) {
                f8127a.put(Long.valueOf(mqi0.o()));
                f8128b.put(1);
                return true;
            }
            if (iIntValue < 3) {
                f8127a.put(Long.valueOf(mqi0.o()));
                f8128b.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10124f() {
        try {
            String strF = RemoteConfig.x().F("moment_unread_notes");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).getBoolean("autoClearSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m10125g() {
        try {
            String strF = RemoteConfig.x().F("moment_unread_notes");
            if (TextUtils.isEmpty(strF)) {
                return 100;
            }
            return new JSONObject(strF).getInt("unreadNotes");
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m10126h(String str) {
        try {
            String strF = RemoteConfig.x().F("moment_unread_notes");
            if (!TextUtils.isEmpty(strF)) {
                return new JSONObject(strF).getInt(str);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.equals(str, "unreadnoticenumber")) {
            return 50;
        }
        return TextUtils.equals(str, "unreadguidepopshownumber") ? 3 : 100;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m10127i() {
        int iIntValue = ((Integer) f8132f.get()).intValue();
        long jLongValue = ((Long) f8133g.get()).longValue();
        if (iIntValue != 2 || !a5i.m8413m(((Long) f8131e.get()).longValue()) || !m10124f()) {
            return false;
        }
        if (jLongValue > 0 && a5i.m8413m(jLongValue)) {
            return false;
        }
        f8133g.put(Long.valueOf(mqi0.o()));
        return true;
    }
}
