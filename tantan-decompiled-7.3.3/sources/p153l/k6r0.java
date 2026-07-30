package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.C14867c;
import com.xiaomi.mipush.sdk.C14870f;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C14987aj;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k6r0 {

    /* JADX INFO: renamed from: l.k6r0$a */
    public static class RunnableC18111a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f124201a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f124202b;

        public RunnableC18111a(Context context, boolean z) {
            this.f124201a = context;
            this.f124202b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ouq0.m169393m("do sync info");
            C14914he c14914he = new C14914he(C14987aj.m87666a(), false);
            C14867c c14867cM86499c = C14867c.m86499c(this.f124201a);
            c14914he.m87131c(EnumC14898gp.SyncInfo.f62957a);
            c14914he.m87127b(c14867cM86499c.m86502d());
            c14914he.m87135d(this.f124201a.getPackageName());
            HashMap map = new HashMap();
            c14914he.f63229a = map;
            Context context = this.f124201a;
            u4r0.m194497c(map, "app_version", C14887g.m86759h(context, context.getPackageName()));
            Map<String, String> map2 = c14914he.f63229a;
            Context context2 = this.f124201a;
            u4r0.m194497c(map2, "app_version_code", Integer.toString(C14887g.m86753b(context2, context2.getPackageName())));
            u4r0.m194497c(c14914he.f63229a, "push_sdk_vn", "5_9_9-C");
            u4r0.m194497c(c14914he.f63229a, "push_sdk_vc", Integer.toString(50909));
            u4r0.m194497c(c14914he.f63229a, "token", c14867cM86499c.m86511m());
            if (!l4r0.m152835t()) {
                String strM106588b = bvq0.m106588b(u3r0.m194412t(this.f124201a));
                String strM194416x = u3r0.m194416x(this.f124201a);
                if (!TextUtils.isEmpty(strM194416x)) {
                    strM106588b = strM106588b + Constants.SEPARATOR_COMMA + strM194416x;
                }
                if (!TextUtils.isEmpty(strM106588b)) {
                    u4r0.m194497c(c14914he.f63229a, "imei_md5", strM106588b);
                }
            }
            etq0.m122490c(this.f124201a).m122492e(c14914he.f63229a);
            u4r0.m194497c(c14914he.f63229a, "reg_id", c14867cM86499c.m86515q());
            u4r0.m194497c(c14914he.f63229a, "reg_secret", c14867cM86499c.m86517t());
            u4r0.m194497c(c14914he.f63229a, "accept_time", MiPushClient.getAcceptTime(this.f124201a).replace(Constants.SEPARATOR_COMMA, "-"));
            boolean z = this.f124202b;
            Map<String, String> map3 = c14914he.f63229a;
            if (z) {
                u4r0.m194497c(map3, "aliases_md5", k6r0.m148566f(MiPushClient.getAllAlias(this.f124201a)));
                u4r0.m194497c(c14914he.f63229a, "topics_md5", k6r0.m148566f(MiPushClient.getAllTopic(this.f124201a)));
                u4r0.m194497c(c14914he.f63229a, "accounts_md5", k6r0.m148566f(MiPushClient.getAllUserAccount(this.f124201a)));
            } else {
                u4r0.m194497c(map3, "aliases", k6r0.m148567g(MiPushClient.getAllAlias(this.f124201a)));
                u4r0.m194497c(c14914he.f63229a, "topics", k6r0.m148567g(MiPushClient.getAllTopic(this.f124201a)));
                u4r0.m194497c(c14914he.f63229a, "user_accounts", k6r0.m148567g(MiPushClient.getAllUserAccount(this.f124201a)));
            }
            C14870f.m86573h(this.f124201a).m86608y(c14914he, EnumC14888gf.Notification, false, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m148562b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long j = sharedPreferences.getLong("last_sync_info", -1L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jM87652a = C14985ah.m87648a(context).m87652a(EnumC14893gk.SyncInfoFrequency.m86817a(), 1209600);
        if (j == -1) {
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        } else if (Math.abs(jCurrentTimeMillis - j) > jM87652a) {
            m148564d(context, true);
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m148563c(Context context, C14914he c14914he) {
        ouq0.m169393m("need to update local info with: " + c14914he.m87120a());
        String str = c14914he.m87120a().get("accept_time");
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length == 2) {
                MiPushClient.addAcceptTime(context, strArrSplit[0], strArrSplit[1]);
                if ("00:00".equals(strArrSplit[0]) && "00:00".equals(strArrSplit[1])) {
                    C14867c.m86499c(context).m86508j(true);
                } else {
                    C14867c.m86499c(context).m86508j(false);
                }
            }
        }
        String str2 = c14914he.m87120a().get("aliases");
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(Constants.SEPARATOR_COMMA)) {
                    MiPushClient.addAlias(context, str3);
                }
            }
        }
        String str4 = c14914he.m87120a().get("topics");
        if (str4 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(Constants.SEPARATOR_COMMA)) {
                    MiPushClient.addTopic(context, str5);
                }
            }
        }
        String str6 = c14914he.m87120a().get("user_accounts");
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
    public static void m148564d(Context context, boolean z) {
        tsq0.m192627f(context).m192628g(new RunnableC18111a(context, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static String m148566f(List<String> list) {
        String strM106588b = bvq0.m106588b(m148567g(list));
        return (TextUtils.isEmpty(strM106588b) || strM106588b.length() <= 4) ? "" : strM106588b.substring(0, 4).toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static String m148567g(List<String> list) {
        String strConcat = "";
        if (q6r0.m175606a(list)) {
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
