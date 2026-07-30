package p149l;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class flg {

    /* JADX INFO: renamed from: a */
    public static zpd0 f98160a = new zpd0("last_show_unread_activities_tips_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static tpd0 f98161b = new tpd0("show_unread_activities_tips_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: c */
    public static zpd0 f98162c = new zpd0("last_show_all_read_activities_tips_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public static tpd0 f98163d = new tpd0("show_all_read_activities_tips_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: e */
    public static zpd0 f98164e = new zpd0("last_show_all_read_activities_dialog_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public static tpd0 f98165f = new tpd0("show_all_read_activities_dialog_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: g */
    public static zpd0 f98166g = new zpd0("last_auto_clear_unread_activities_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public static zpd0 f98167h = new zpd0("last_ignore_all_read_activities_dialog_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: i */
    public static zpd0 f98168i = new zpd0("last_upgrades_all_read_activities_dialog_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public static tpd0 f98169j = new tpd0("show_upgrades_all_read_activities_dialog_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: k */
    public static String f98170k = "e_all_read_remind_popup";

    /* JADX INFO: renamed from: a */
    public static void m121976a() {
        f98164e.put(Long.valueOf(mqi0.m155944o()));
        f98165f.put(2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m121977b(int i) {
        if (nkg.m159898p()) {
            long jLongValue = f98168i.get().longValue();
            long jLongValue2 = f98164e.get().longValue();
            int iIntValue = f98165f.get().intValue();
            long jLongValue3 = f98162c.get().longValue();
            int iIntValue2 = f98163d.get().intValue();
            if (!a5i.m95037m(jLongValue2)) {
                f98165f.put(0);
            }
            if (i < m121982g() || iIntValue2 < 3) {
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
                f98164e.put(Long.valueOf(mqi0.m155944o()));
                f98165f.put(1);
                return true;
            }
            if (!a5i.m95037m(jLongValue2)) {
                f98164e.put(Long.valueOf(mqi0.m155944o()));
                f98165f.put(1);
                return true;
            }
            if (iIntValue < 2) {
                f98164e.put(Long.valueOf(mqi0.m155944o()));
                f98165f.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m121978c(int i, int i2) {
        int iIntValue;
        if (i2 <= 0 || i < m121983h("unreadnoticenumber")) {
            return false;
        }
        long jLongValue = f98167h.get().longValue();
        long jLongValue2 = f98168i.get().longValue();
        if (!a5i.m95037m(jLongValue2)) {
            f98169j.put(0);
        }
        if ((jLongValue2 > 0 && DateUtils.isToday(jLongValue2)) || (iIntValue = f98169j.get().intValue()) >= m121983h("unreadguidepopshownumber")) {
            return false;
        }
        if (jLongValue > 0 && !DateUtils.isToday(jLongValue)) {
            f98168i.put(Long.valueOf(mqi0.m155944o()));
            f98169j.put(Integer.valueOf(iIntValue + 1));
            return true;
        }
        User userMe_ = FeedModule.m60222H().me_();
        if (!NullChecker.m81303a(userMe_) || !userMe_.isFemale()) {
            return false;
        }
        f98168i.put(Long.valueOf(mqi0.m155944o()));
        f98169j.put(Integer.valueOf(iIntValue + 1));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m121979d(int i) {
        if (nkg.m159898p()) {
            long jLongValue = f98162c.get().longValue();
            int iIntValue = f98163d.get().intValue();
            if (i < m121982g()) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue <= 0) {
                f98162c.put(Long.valueOf(mqi0.m155944o()));
                f98163d.put(1);
                return true;
            }
            if (!a5i.m95037m(jLongValue)) {
                f98162c.put(Long.valueOf(mqi0.m155944o()));
                f98163d.put(1);
                return true;
            }
            if (iIntValue < 3) {
                f98162c.put(Long.valueOf(mqi0.m155944o()));
                f98163d.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m121980e(int i) {
        if (nkg.m159898p()) {
            long jLongValue = f98160a.get().longValue();
            int iIntValue = f98161b.get().intValue();
            if (i < m121982g()) {
                return false;
            }
            if (jLongValue > 0 && DateUtils.isToday(jLongValue)) {
                return false;
            }
            if (jLongValue <= 0) {
                f98160a.put(Long.valueOf(mqi0.m155944o()));
                f98161b.put(1);
                return true;
            }
            if (!a5i.m95037m(jLongValue)) {
                f98160a.put(Long.valueOf(mqi0.m155944o()));
                f98161b.put(1);
                return true;
            }
            if (iIntValue < 3) {
                f98160a.put(Long.valueOf(mqi0.m155944o()));
                f98161b.put(Integer.valueOf(iIntValue + 1));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m121981f() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_unread_notes");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).getBoolean("autoClearSwitch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m121982g() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_unread_notes");
            if (TextUtils.isEmpty(strM79302F)) {
                return 100;
            }
            return new JSONObject(strM79302F).getInt("unreadNotes");
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m121983h(String str) {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_unread_notes");
            if (!TextUtils.isEmpty(strM79302F)) {
                return new JSONObject(strM79302F).getInt(str);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.equals(str, "unreadnoticenumber")) {
            return 50;
        }
        return TextUtils.equals(str, "unreadguidepopshownumber") ? 3 : 100;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m121984i() {
        int iIntValue = f98165f.get().intValue();
        long jLongValue = f98166g.get().longValue();
        if (iIntValue != 2 || !a5i.m95037m(f98164e.get().longValue()) || !m121981f()) {
            return false;
        }
        if (jLongValue > 0 && a5i.m95037m(jLongValue)) {
            return false;
        }
        f98166g.put(Long.valueOf(mqi0.m155944o()));
        return true;
    }
}
