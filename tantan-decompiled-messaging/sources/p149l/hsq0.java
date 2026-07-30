package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.connect.common.Constants;
import com.xiaomi.mipush.sdk.C14719c;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.mipush.sdk.EnumC14720d;
import com.xiaomi.mipush.sdk.EnumC14725q;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.service.C14837ah;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class hsq0 {

    /* JADX INFO: renamed from: l.hsq0$a */
    public static class RunnableC17385a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f109342a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f109343b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ EnumC14720d f109344c;

        public RunnableC17385a(String str, Context context, EnumC14720d enumC14720d) {
            this.f109342a = str;
            this.f109343b = context;
            this.f109344c = enumC14720d;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strSubstring;
            if (TextUtils.isEmpty(this.f109342a)) {
                return;
            }
            String[] strArrSplit = this.f109342a.split("~");
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
                ilq0.m137040m("ASSEMBLE_PUSH : receive incorrect token");
                return;
            }
            ilq0.m137040m("ASSEMBLE_PUSH : receive correct token");
            hsq0.m132802p(this.f109343b, this.f109344c, strSubstring);
            hsq0.m132792f(this.f109343b);
        }
    }

    /* JADX INFO: renamed from: l.hsq0$b */
    public static /* synthetic */ class C17386b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f109345a;

        static {
            int[] iArr = new int[EnumC14720d.values().length];
            f109345a = iArr;
            try {
                iArr[EnumC14720d.ASSEMBLE_PUSH_HUAWEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f109345a[EnumC14720d.ASSEMBLE_PUSH_FCM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f109345a[EnumC14720d.ASSEMBLE_PUSH_COS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f109345a[EnumC14720d.ASSEMBLE_PUSH_FTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m132787a() {
        Integer num = (Integer) ikq0.m136883f("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public static String m132788b(Context context, EnumC14720d enumC14720d) {
        return m132789c(context, enumC14720d, false);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m132789c(Context context, EnumC14720d enumC14720d, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        if (z) {
            String string = sharedPreferences.getString("syncingToken", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String strM132790d = m132790d(enumC14720d);
        if (TextUtils.isEmpty(strM132790d)) {
            return "";
        }
        return sharedPreferences.getString(strM132790d, "");
    }

    /* JADX INFO: renamed from: d */
    public static String m132790d(EnumC14720d enumC14720d) {
        int i = C17386b.f109345a[enumC14720d.ordinal()];
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
    public static HashMap<String, String> m132791e(Context context, EnumC14720d enumC14720d) {
        HashMap<String, String> map = new HashMap<>();
        int i = C17386b.f109345a[enumC14720d.ordinal()];
        String string = null;
        ApplicationInfo applicationInfo = null;
        if (i == 1) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e) {
                ilq0.m137025B(e.toString());
            }
            string = new qwq0.C19600a(":", "~").m176895a("brand", EnumC14725q.HUAWEI.name()).m176895a("token", m132789c(context, enumC14720d, true)).m176895a("package_name", context.getPackageName()).m176895a(Constants.JumpUrlConstants.URL_KEY_APPID, Integer.valueOf(applicationInfo != null ? applicationInfo.metaData.getInt("com.huawei.hms.client.appid") : -1)).toString();
        } else if (i == 2) {
            qwq0.C19600a c19600aM176895a = new qwq0.C19600a(":", "~").m176895a("brand", EnumC14725q.FCM.name()).m176895a("token", m132789c(context, enumC14720d, false)).m176895a("package_name", context.getPackageName());
            int iM132787a = m132787a();
            if (iM132787a != 0) {
                c19600aM176895a.m176895a(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(iM132787a));
            } else {
                c19600aM176895a.m176895a(WBConstants.AUTH_PARAMS_VERSION, 50909);
            }
            string = c19600aM176895a.toString();
        } else if (i == 3) {
            string = new qwq0.C19600a(":", "~").m176895a("brand", EnumC14725q.OPPO.name()).m176895a("token", m132789c(context, enumC14720d, true)).m176895a("package_name", context.getPackageName()).toString();
        } else if (i == 4) {
            qwq0.C19600a c19600aM176895a2 = new qwq0.C19600a(":", "~").m176895a("brand", EnumC14725q.VIVO.name()).m176895a("token", m132789c(context, enumC14720d, true)).m176895a("package_name", context.getPackageName());
            int iM132787a2 = m132787a();
            if (iM132787a2 != 0) {
                c19600aM176895a2.m176895a(WBConstants.AUTH_PARAMS_VERSION, Integer.valueOf(iM132787a2));
            }
            string = c19600aM176895a2.toString();
        }
        map.put("RegInfo", string);
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static void m132792f(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        String strM132790d = m132790d(EnumC14720d.ASSEMBLE_PUSH_HUAWEI);
        String strM132790d2 = m132790d(EnumC14720d.ASSEMBLE_PUSH_FCM);
        if (TextUtils.isEmpty(sharedPreferences.getString(strM132790d, "")) || !TextUtils.isEmpty(sharedPreferences.getString(strM132790d2, ""))) {
            return;
        }
        C14722f.m85402h(context).m85429p(2, strM132790d);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m132793g(Context context, EnumC14720d enumC14720d) {
        if (otq0.m165965b(enumC14720d) != null) {
            return C14837ah.m86477a(context).m86489a(otq0.m165965b(enumC14720d).m85646a(), true);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m132794h(EnumC14720d enumC14720d) {
        return enumC14720d == EnumC14720d.ASSEMBLE_PUSH_FTOS || enumC14720d == EnumC14720d.ASSEMBLE_PUSH_FCM;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m132795i(C14763hb c14763hb, EnumC14720d enumC14720d) {
        if (c14763hb == null || c14763hb.m85906a() == null || c14763hb.m85906a().m85729a() == null) {
            return false;
        }
        return (enumC14720d == EnumC14720d.ASSEMBLE_PUSH_FCM ? FirebaseMessaging.INSTANCE_ID_SCOPE : "").equalsIgnoreCase(c14763hb.m85906a().m85729a().get("assemble_push_type"));
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m132796j(Context context, C14763hb c14763hb, EnumC14720d enumC14720d) {
        if (m132795i(c14763hb, enumC14720d)) {
            return tlq0.m189624c(m132788b(context, enumC14720d));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static String m132797k(EnumC14720d enumC14720d) {
        return m132790d(enumC14720d) + "_version";
    }

    /* JADX INFO: renamed from: l */
    public static void m132798l(Context context) {
        xqq0.m210593c(context).register();
    }

    /* JADX INFO: renamed from: m */
    public static void m132799m(Context context, EnumC14720d enumC14720d, String str) {
        njq0.m159772f(context).m159773g(new RunnableC17385a(str, context, enumC14720d));
    }

    /* JADX INFO: renamed from: n */
    public static void m132800n(Context context) {
        xqq0.m210593c(context).unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static synchronized void m132802p(Context context, EnumC14720d enumC14720d, String str) {
        String strM132790d = m132790d(enumC14720d);
        if (TextUtils.isEmpty(strM132790d)) {
            ilq0.m137040m("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit();
        editorEdit.putString(strM132790d, str).putString("last_check_token", C14719c.m85328c(context).m85344q());
        if (m132794h(enumC14720d)) {
            editorEdit.putInt(m132797k(enumC14720d), m132787a());
        }
        editorEdit.putString("syncingToken", "");
        hwq0.m133262a(editorEdit);
        ilq0.m137040m("ASSEMBLE_PUSH : update sp file success!  " + str);
    }
}
