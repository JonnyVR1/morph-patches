package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.C14719c;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14839aj;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class exq0 {

    /* JADX INFO: renamed from: l.exq0$a */
    public static class RunnableC16719a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f93683a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f93684b;

        public RunnableC16719a(Context context, boolean z) {
            this.f93683a = context;
            this.f93684b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ilq0.m137040m("do sync info");
            C14766he c14766he = new C14766he(C14839aj.m86495a(), false);
            C14719c c14719cM85328c = C14719c.m85328c(this.f93683a);
            c14766he.m85960c(EnumC14750gp.SyncInfo.f62110a);
            c14766he.m85956b(c14719cM85328c.m85331d());
            c14766he.m85964d(this.f93683a.getPackageName());
            HashMap map = new HashMap();
            c14766he.f62382a = map;
            Context context = this.f93683a;
            ovq0.m166206c(map, "app_version", C14739g.m85588h(context, context.getPackageName()));
            Map<String, String> map2 = c14766he.f62382a;
            Context context2 = this.f93683a;
            ovq0.m166206c(map2, "app_version_code", Integer.toString(C14739g.m85582b(context2, context2.getPackageName())));
            ovq0.m166206c(c14766he.f62382a, "push_sdk_vn", "5_9_9-C");
            ovq0.m166206c(c14766he.f62382a, "push_sdk_vc", Integer.toString(50909));
            ovq0.m166206c(c14766he.f62382a, "token", c14719cM85328c.m85340m());
            if (!fvq0.m123366t()) {
                String strM198839b = vlq0.m198839b(ouq0.m166111t(this.f93683a));
                String strM166115x = ouq0.m166115x(this.f93683a);
                if (!TextUtils.isEmpty(strM166115x)) {
                    strM198839b = strM198839b + Constants.SEPARATOR_COMMA + strM166115x;
                }
                if (!TextUtils.isEmpty(strM198839b)) {
                    ovq0.m166206c(c14766he.f62382a, "imei_md5", strM198839b);
                }
            }
            yjq0.m215084c(this.f93683a).m215086e(c14766he.f62382a);
            ovq0.m166206c(c14766he.f62382a, "reg_id", c14719cM85328c.m85344q());
            ovq0.m166206c(c14766he.f62382a, "reg_secret", c14719cM85328c.m85346t());
            ovq0.m166206c(c14766he.f62382a, "accept_time", MiPushClient.getAcceptTime(this.f93683a).replace(Constants.SEPARATOR_COMMA, "-"));
            boolean z = this.f93684b;
            Map<String, String> map3 = c14766he.f62382a;
            if (z) {
                ovq0.m166206c(map3, "aliases_md5", exq0.m118700f(MiPushClient.getAllAlias(this.f93683a)));
                ovq0.m166206c(c14766he.f62382a, "topics_md5", exq0.m118700f(MiPushClient.getAllTopic(this.f93683a)));
                ovq0.m166206c(c14766he.f62382a, "accounts_md5", exq0.m118700f(MiPushClient.getAllUserAccount(this.f93683a)));
            } else {
                ovq0.m166206c(map3, "aliases", exq0.m118701g(MiPushClient.getAllAlias(this.f93683a)));
                ovq0.m166206c(c14766he.f62382a, "topics", exq0.m118701g(MiPushClient.getAllTopic(this.f93683a)));
                ovq0.m166206c(c14766he.f62382a, "user_accounts", exq0.m118701g(MiPushClient.getAllUserAccount(this.f93683a)));
            }
            C14722f.m85402h(this.f93683a).m85437y(c14766he, EnumC14740gf.Notification, false, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m118696b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long j = sharedPreferences.getLong("last_sync_info", -1L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jM86481a = C14837ah.m86477a(context).m86481a(EnumC14745gk.SyncInfoFrequency.m85646a(), 1209600);
        if (j == -1) {
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        } else if (Math.abs(jCurrentTimeMillis - j) > jM86481a) {
            m118698d(context, true);
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m118697c(Context context, C14766he c14766he) {
        ilq0.m137040m("need to update local info with: " + c14766he.m85949a());
        String str = c14766he.m85949a().get("accept_time");
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length == 2) {
                MiPushClient.addAcceptTime(context, strArrSplit[0], strArrSplit[1]);
                if ("00:00".equals(strArrSplit[0]) && "00:00".equals(strArrSplit[1])) {
                    C14719c.m85328c(context).m85337j(true);
                } else {
                    C14719c.m85328c(context).m85337j(false);
                }
            }
        }
        String str2 = c14766he.m85949a().get("aliases");
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(Constants.SEPARATOR_COMMA)) {
                    MiPushClient.addAlias(context, str3);
                }
            }
        }
        String str4 = c14766he.m85949a().get("topics");
        if (str4 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(Constants.SEPARATOR_COMMA)) {
                    MiPushClient.addTopic(context, str5);
                }
            }
        }
        String str6 = c14766he.m85949a().get("user_accounts");
        if (str6 != null) {
            MiPushClient.removeAllAccounts(context);
            if ("".equals(str6)) {
                return;
            }
            for (String str7 : str6.split(Constants.SEPARATOR_COMMA)) {
                MiPushClient.addAccount(context, str7);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m118698d(Context context, boolean z) {
        njq0.m159772f(context).m159773g(new RunnableC16719a(context, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static String m118700f(List<String> list) {
        String strM198839b = vlq0.m198839b(m118701g(list));
        return (TextUtils.isEmpty(strM198839b) || strM198839b.length() <= 4) ? "" : strM198839b.substring(0, 4).toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static String m118701g(List<String> list) {
        String strConcat = "";
        if (kxq0.m147805a(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(strConcat)) {
                strConcat = strConcat.concat(Constants.SEPARATOR_COMMA);
            }
            strConcat = strConcat + str;
        }
        return strConcat;
    }
}
