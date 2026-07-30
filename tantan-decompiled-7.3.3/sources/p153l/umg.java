package p153l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class umg {

    /* JADX INFO: renamed from: a */
    public static byd0 f179622a = new byd0("last_show_unread_activities_tips_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static vxd0 f179623b = new vxd0("show_unread_activities_tips_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: c */
    public static byd0 f179624c = new byd0("last_show_all_read_activities_tips_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public static vxd0 f179625d = new vxd0("show_all_read_activities_tips_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: e */
    public static byd0 f179626e = new byd0("last_show_all_read_activities_dialog_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public static vxd0 f179627f = new vxd0("show_all_read_activities_dialog_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: g */
    public static byd0 f179628g = new byd0("last_auto_clear_unread_activities_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public static byd0 f179629h = new byd0("last_ignore_all_read_activities_dialog_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: i */
    public static byd0 f179630i = new byd0("last_upgrades_all_read_activities_dialog_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public static vxd0 f179631j = new vxd0("show_upgrades_all_read_activities_dialog_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: k */
    public static String f179632k = "e_all_read_remind_popup";

    /* JADX INFO: renamed from: a */
    public static void m196664a() {
        f179626e.put(Long.valueOf(pzi0.m174454o()));
        f179627f.put(2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m196665b(int i) {
        if (cmg.m111227p()) {
            long jLongValue = f179630i.get().longValue();
            long jLongValue2 = f179626e.get().longValue();
            int iIntValue = f179627f.get().intValue();
            long jLongValue3 = f179624c.get().longValue();
            int iIntValue2 = f179625d.get().intValue();
            if (!p6i.m170904m(jLongValue2)) {
                f179627f.put(0);
            }
            if (i < m196670g() || iIntValue2 < 3) {
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
                f179626e.put(Long.valueOf(pzi0.m174454o()));
                f179627f.put(1);
                return true;
            }
            if (!p6i.m170904m(jLongValue2)) {
                f179626e.put(Long.valueOf(pzi0.m174454o()));
                f179627f.put(1);
                return true;
            }
            if (iIntValue < 2) {
                f179626e.put(Long.valueOf(pzi0.m174454o()));
                f179627f.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m196666c(int i, int i2) {
        int iIntValue;
        if (i2 <= 0 || i < m196671h("unreadnoticenumber")) {
            return false;
        }
        long jLongValue = f179629h.get().longValue();
        long jLongValue2 = f179630i.get().longValue();
        if (!p6i.m170904m(jLongValue2)) {
            f179631j.put(0);
        }
        if ((jLongValue2 > 0 && DateUtils.isToday(jLongValue2)) || (iIntValue = f179631j.get().intValue()) >= m196671h("unreadguidepopshownumber")) {
            return false;
        }
        if (jLongValue > 0 && !DateUtils.isToday(jLongValue)) {
            f179630i.put(Long.valueOf(pzi0.m174454o()));
            f179631j.put(Integer.valueOf(iIntValue + 1));
            return true;
        }
        User userMe_ = FeedModule.m61406H().me_();
        if (!NullChecker.m82486a(userMe_) || !userMe_.isFemale()) {
            return false;
        }
        f179630i.put(Long.valueOf(pzi0.m174454o()));
        f179631j.put(Integer.valueOf(iIntValue + 1));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m196667d(int i) {
        if (cmg.m111227p()) {
            long jLongValue = f179624c.get().longValue();
            int iIntValue = f179625d.get().intValue();
            if (i < m196670g()) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue <= 0) {
                f179624c.put(Long.valueOf(pzi0.m174454o()));
                f179625d.put(1);
                return true;
            }
            if (!p6i.m170904m(jLongValue)) {
                f179624c.put(Long.valueOf(pzi0.m174454o()));
                f179625d.put(1);
                return true;
            }
            if (iIntValue < 3) {
                f179624c.put(Long.valueOf(pzi0.m174454o()));
                f179625d.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m196668e(int i) {
        if (cmg.m111227p()) {
            long jLongValue = f179622a.get().longValue();
            int iIntValue = f179623b.get().intValue();
            if (i < m196670g()) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue <= 0) {
                f179622a.put(Long.valueOf(pzi0.m174454o()));
                f179623b.put(1);
                return true;
            }
            if (!p6i.m170904m(jLongValue)) {
                f179622a.put(Long.valueOf(pzi0.m174454o()));
                f179623b.put(1);
                return true;
            }
            if (iIntValue < 3) {
                f179622a.put(Long.valueOf(pzi0.m174454o()));
                f179623b.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m196669f() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_unread_notes");
            if (TextUtils.isEmpty(strM80485F)) {
                return false;
            }
            return new JSONObject(strM80485F).getBoolean("autoClearSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m196670g() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_unread_notes");
            if (TextUtils.isEmpty(strM80485F)) {
                return 100;
            }
            return new JSONObject(strM80485F).getInt("unreadNotes");
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m196671h(String str) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_unread_notes");
            if (!TextUtils.isEmpty(strM80485F)) {
                return new JSONObject(strM80485F).getInt(str);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.equals(str, "unreadnoticenumber")) {
            return 50;
        }
        return TextUtils.equals(str, "unreadguidepopshownumber") ? 3 : 100;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m196672i() {
        int iIntValue = f179627f.get().intValue();
        long jLongValue = f179628g.get().longValue();
        if (iIntValue != 2 || !p6i.m170904m(f179626e.get().longValue()) || !m196669f()) {
            return false;
        }
        if (jLongValue > 0 && p6i.m170904m(jLongValue)) {
            return false;
        }
        f179628g.put(Long.valueOf(pzi0.m174454o()));
        return true;
    }
}
