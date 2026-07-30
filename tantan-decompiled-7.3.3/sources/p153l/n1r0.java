package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.connect.common.Constants;
import com.xiaomi.mipush.sdk.C14867c;
import com.xiaomi.mipush.sdk.C14870f;
import com.xiaomi.mipush.sdk.EnumC14868d;
import com.xiaomi.mipush.sdk.EnumC14873q;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.service.C14985ah;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class n1r0 {

    /* JADX INFO: renamed from: l.n1r0$a */
    public static class RunnableC18762a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f139786a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f139787b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ EnumC14868d f139788c;

        public RunnableC18762a(String str, Context context, EnumC14868d enumC14868d) {
            this.f139786a = str;
            this.f139787b = context;
            this.f139788c = enumC14868d;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strSubstring;
            if (TextUtils.isEmpty(this.f139786a)) {
                return;
            }
            String[] strArrSplit = this.f139786a.split("~");
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strSubstring = "";
                    break;
                }
                String str = strArrSplit[i];
                if (!TextUtils.isEmpty(str) && str.startsWith("token:")) {
                    strSubstring = str.substring(str.indexOf(":") + 1);
                    break;
                }
                i++;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                ouq0.m169393m("ASSEMBLE_PUSH : receive incorrect token");
                return;
            }
            ouq0.m169393m("ASSEMBLE_PUSH : receive correct token");
            n1r0.m161144p(this.f139787b, this.f139788c, strSubstring);
            n1r0.m161134f(this.f139787b);
        }
    }

    /* JADX INFO: renamed from: l.n1r0$b */
    public static /* synthetic */ class C18763b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f139789a;

        static {
            int[] iArr = new int[EnumC14868d.values().length];
            f139789a = iArr;
            try {
                iArr[EnumC14868d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f139789a[EnumC14868d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f139789a[EnumC14868d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f139789a[EnumC14868d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m161129a() {
        Integer num = (Integer) otq0.m169168f("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public static String m161130b(Context context, EnumC14868d enumC14868d) {
        return m161131c(context, enumC14868d, false);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m161131c(Context context, EnumC14868d enumC14868d, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        if (z) {
            String string = sharedPreferences.getString("syncingToken", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String strM161132d = m161132d(enumC14868d);
        if (TextUtils.isEmpty(strM161132d)) {
            return "";
        }
        return sharedPreferences.getString(strM161132d, "");
    }

    /* JADX INFO: renamed from: d */
    public static String m161132d(EnumC14868d enumC14868d) {
        int i = C18763b.f139789a[enumC14868d.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token_v2";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    /* JADX INFO: renamed from: e */
    public static HashMap<String, String> m161133e(Context context, EnumC14868d enumC14868d) {
        HashMap<String, String> map = new HashMap<>();
        int i = C18763b.f139789a[enumC14868d.ordinal()];
        String string = null;
        ApplicationInfo applicationInfo = null;
        if (i == 1) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e) {
                ouq0.m169378B(e.toString());
            }
            string = new w5r0.C21029a(":", "~").m204987a("brand", EnumC14873q.HUAWEI.name()).m204987a("token", m161131c(context, enumC14868d, true)).m204987a("package_name", context.getPackageName()).m204987a(Constants.JumpUrlConstants.URL_KEY_APPID, Integer.valueOf(applicationInfo != null ? applicationInfo.metaData.getInt("com.huawei.hms.client.appid") : -1)).toString();
        } else if (i == 2) {
            w5r0.C21029a c21029aM204987a = new w5r0.C21029a(":", "~").m204987a("brand", EnumC14873q.FCM.name()).m204987a("token", m161131c(context, enumC14868d, false)).m204987a("package_name", context.getPackageName());
            int iM161129a = m161129a();
            if (iM161129a != 0) {
                c21029aM204987a.m204987a(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(iM161129a));
            } else {
                c21029aM204987a.m204987a(WBConstants.AUTH_PARAMS_VERSION, 50909);
            }
            string = c21029aM204987a.toString();
        } else if (i == 3) {
            string = new w5r0.C21029a(":", "~").m204987a("brand", EnumC14873q.OPPO.name()).m204987a("token", m161131c(context, enumC14868d, true)).m204987a("package_name", context.getPackageName()).toString();
        } else if (i == 4) {
            w5r0.C21029a c21029aM204987a2 = new w5r0.C21029a(":", "~").m204987a("brand", EnumC14873q.VIVO.name()).m204987a("token", m161131c(context, enumC14868d, true)).m204987a("package_name", context.getPackageName());
            int iM161129a2 = m161129a();
            if (iM161129a2 != 0) {
                c21029aM204987a2.m204987a(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(iM161129a2));
            }
            string = c21029aM204987a2.toString();
        }
        map.put("RegInfo", string);
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static void m161134f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        String strM161132d = m161132d(EnumC14868d.ASSEMBLE_PUSH_HUAWEI);
        String strM161132d2 = m161132d(EnumC14868d.ASSEMBLE_PUSH_FCM);
        if (TextUtils.isEmpty(sharedPreferences.getString(strM161132d, "")) || !TextUtils.isEmpty(sharedPreferences.getString(strM161132d2, ""))) {
            return;
        }
        C14870f.m86573h(context).m86600p(2, strM161132d);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m161135g(Context context, EnumC14868d enumC14868d) {
        if (u2r0.m194297b(enumC14868d) != null) {
            return C14985ah.m87648a(context).m87660a(u2r0.m194297b(enumC14868d).m86817a(), true);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m161136h(EnumC14868d enumC14868d) {
        return enumC14868d == EnumC14868d.ASSEMBLE_PUSH_FTOS || enumC14868d == EnumC14868d.ASSEMBLE_PUSH_FCM;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m161137i(C14911hb c14911hb, EnumC14868d enumC14868d) {
        if (c14911hb == null || c14911hb.m87077a() == null || c14911hb.m87077a().m86900a() == null) {
            return false;
        }
        return (enumC14868d == EnumC14868d.ASSEMBLE_PUSH_FCM ? FirebaseMessaging.INSTANCE_ID_SCOPE : "").equalsIgnoreCase(c14911hb.m87077a().m86900a().get("assemble_push_type"));
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m161138j(Context context, C14911hb c14911hb, EnumC14868d enumC14868d) {
        if (m161137i(c14911hb, enumC14868d)) {
            return zuq0.m221702c(m161130b(context, enumC14868d));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static String m161139k(EnumC14868d enumC14868d) {
        return m161132d(enumC14868d) + "_version";
    }

    /* JADX INFO: renamed from: l */
    public static void m161140l(Context context) {
        d0r0.m113425c(context).register();
    }

    /* JADX INFO: renamed from: m */
    public static void m161141m(Context context, EnumC14868d enumC14868d, String str) {
        tsq0.m192627f(context).m192628g(new RunnableC18762a(str, context, enumC14868d));
    }

    /* JADX INFO: renamed from: n */
    public static void m161142n(Context context) {
        d0r0.m113425c(context).unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static synchronized void m161144p(Context context, EnumC14868d enumC14868d, String str) {
        String strM161132d = m161132d(enumC14868d);
        if (TextUtils.isEmpty(strM161132d)) {
            ouq0.m169393m("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit();
        editorEdit.putString(strM161132d, str).putString("last_check_token", C14867c.m86499c(context).m86515q());
        if (m161136h(enumC14868d)) {
            editorEdit.putInt(m161139k(enumC14868d), m161129a());
        }
        editorEdit.putString("syncingToken", "");
        n5r0.m161732a(editorEdit);
        ouq0.m169393m("ASSEMBLE_PUSH : update sp file success!  " + str);
    }
}
