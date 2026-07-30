package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.HomeTabModuleId;
import com.xiaomi.push.EnumC14789n;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ekq0;
import p149l.fvq0;
import p149l.gkq0;
import p149l.gxq0;
import p149l.ilq0;
import p149l.kvq0;
import p149l.ouq0;
import p149l.vlq0;
import p149l.yjq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.q */
/* JADX INFO: loaded from: classes2.dex */
public class C14875q {

    /* JADX INFO: renamed from: a */
    private static C14874p f63097a;

    /* JADX INFO: renamed from: a */
    private static a f63098a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.q$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo86367a();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0316  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: a */
    public static synchronized C14874p m86766a(Context context, String str, String str2, String str3) {
        String strSubstring;
        PackageInfo packageInfo;
        boolean z;
        ekq0 ekq0VarM126685n;
        ?? r4;
        ?? r5;
        try {
            TreeMap treeMap = new TreeMap();
            treeMap.put("devid", ouq0.m166099h(context, false));
            C14874p c14874p = f63097a;
            if (c14874p == null || TextUtils.isEmpty(c14874p.f63091a)) {
                strSubstring = null;
            } else {
                treeMap.put("uuid", f63097a.f63091a);
                int iLastIndexOf = f63097a.f63091a.lastIndexOf("/");
                if (iLastIndexOf != -1) {
                    strSubstring = f63097a.f63091a.substring(iLastIndexOf + 1);
                } else {
                    strSubstring = null;
                }
            }
            yjq0.m215084c(context).m215086e(treeMap);
            String str4 = m86774a(context) ? "1000271" : str2;
            String str5 = m86774a(context) ? "420100086271" : str3;
            String str6 = m86774a(context) ? "com.xiaomi.xmsf" : str;
            treeMap.put("appid", str4);
            treeMap.put("apptoken", str5);
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str6, 16384);
            } catch (Exception e) {
                ilq0.m137044q(e);
                packageInfo = null;
            }
            treeMap.put("appversion", packageInfo != null ? String.valueOf(packageInfo.versionCode) : "0");
            treeMap.put("sdkversion", Integer.toString(50909));
            treeMap.put("packagename", str6);
            treeMap.put("model", kvq0.m147391a());
            treeMap.put(HomeTabModuleId.board, Build.BOARD);
            if (!fvq0.m123366t()) {
                String strM166111t = ouq0.m166111t(context);
                String str7 = TextUtils.isEmpty(strM166111t) ? "" : "" + vlq0.m198839b(strM166111t);
                String strM166115x = ouq0.m166115x(context);
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(strM166115x)) {
                    str7 = str7 + Constants.SEPARATOR_COMMA + strM166115x;
                }
                if (!TextUtils.isEmpty(str7)) {
                    treeMap.put("imei_md5", str7);
                }
            }
            treeMap.put("os", Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL);
            int iM166094c = ouq0.m166094c();
            if (iM166094c >= 0) {
                treeMap.put("space_id", Integer.toString(iM166094c));
            }
            treeMap.put("brand", Build.BRAND + "");
            treeMap.put("ram", ouq0.m166096e());
            treeMap.put("rom", ouq0.m166106o());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : treeMap.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e2) {
                    ilq0.m137025B("failed to add data in json format: k=" + ((String) entry.getKey()) + ",v=" + ((String) entry.getValue()) + ". " + e2);
                }
            }
            String strM86569a = C14851av.m86569a(jSONObject.toString());
            TreeMap treeMap2 = new TreeMap();
            treeMap2.put("requestData", strM86569a);
            treeMap2.put("keyPairVer", "1");
            if (m86764a(context) >= 2 || TextUtils.isEmpty(strM86569a)) {
                z = false;
            } else {
                ilq0.m137040m("r.data = " + strM86569a);
                z = true;
            }
            String strM86768a = m86768a(context, z);
            if (TextUtils.isEmpty(strM86768a)) {
                return null;
            }
            if (z) {
                treeMap = treeMap2;
            }
            try {
                ekq0VarM126685n = gkq0.m126685n(context, strM86768a, treeMap);
            } catch (IOException e3) {
                ilq0.m137025B("device registration request failed. " + e3);
                ekq0VarM126685n = null;
            }
            if (ekq0VarM126685n == null || ekq0VarM126685n.f92003a != 200) {
                r4 = z;
            } else {
                String strM116991a = ekq0VarM126685n.m116991a();
                if (TextUtils.isEmpty(strM116991a)) {
                    r4 = z;
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strM116991a);
                        r5 = jSONObject2.getInt("code");
                        try {
                            if (r5 == 0) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                                String string = jSONObject3.getString("ssecurity");
                                String string2 = jSONObject3.getString("token");
                                String string3 = jSONObject3.getString("userId");
                                if (TextUtils.isEmpty(strSubstring)) {
                                    strSubstring = "an" + vlq0.m198838a(6);
                                }
                                C14874p c14874p2 = new C14874p(string3 + "@xiaomi.com/" + strSubstring, string2, string, str4, str5, str6, gxq0.m128639a());
                                m86772a(context, c14874p2);
                                f63097a = c14874p2;
                                m86771a(context, 0);
                                ilq0.m137040m("device registration is successful. " + string3);
                                return c14874p2;
                            }
                            r4 = z;
                            C14879t.m86788a(context, jSONObject2.getInt("code"), jSONObject2.optString("description"));
                            ilq0.m137040m("device registration resp: " + strM116991a);
                        } catch (JSONException e4) {
                            e = e4;
                            ilq0.m137025B("failed to parse respone json data. " + e);
                            r4 = r5;
                        } catch (Throwable th) {
                            th = th;
                            ilq0.m137025B("unknow throwable. " + th);
                            r4 = r5;
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        r5 = z;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = z;
                    }
                    ilq0.m137025B("failed to parse respone json data. " + e);
                    r4 = r5;
                }
            }
            if (r4 != 0 && gkq0.m126693v(context)) {
                m86771a(context, m86764a(context) + 1);
            }
            ilq0.m137040m("fail to register push account. meet error.");
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14874p m86765a(Context context) {
        try {
            C14874p c14874p = f63097a;
            if (c14874p != null) {
                return c14874p;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString("uuid", null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString("security", null);
            String string4 = sharedPreferences.getString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString("package_name", null);
            String string7 = sharedPreferences.getString("device_id", null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (!TextUtils.isEmpty(string7) && ouq0.m166104m(string7)) {
                string7 = ouq0.m166117z(context);
                sharedPreferences.edit().putString("device_id", string7).commit();
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            String strM166117z = ouq0.m166117z(context);
            if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(strM166117z) && !TextUtils.isEmpty(string7) && !string7.equals(strM166117z)) {
                ilq0.m137040m("read_phone_state permission changes.");
            }
            C14874p c14874p2 = new C14874p(string, string2, string3, string4, string5, string6, i);
            f63097a = c14874p2;
            return c14874p2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m86768a(Context context, boolean z) {
        String strM86607a = C14856b.m86604a(context).m86607a();
        String str = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (gxq0.m128642d()) {
            return "http://10.38.162.35:9085".concat(str);
        }
        if (EnumC14789n.China.name().equals(strM86607a)) {
            return "https://cn.register.xmpush.xiaomi.com".concat(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86774a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* JADX INFO: renamed from: a */
    private static void m86771a(Context context, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putInt("enc_req_fail_count", i);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    private static int m86764a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m86772a(Context context, C14874p c14874p) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putString("uuid", c14874p.f63091a);
        editorEdit.putString("security", c14874p.f63093c);
        editorEdit.putString("token", c14874p.f63092b);
        editorEdit.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c14874p.f63094d);
        editorEdit.putString("package_name", c14874p.f63096f);
        editorEdit.putString("app_token", c14874p.f63095e);
        editorEdit.putString("device_id", ouq0.m166117z(context));
        editorEdit.putInt("env_type", c14874p.f63090a);
        editorEdit.commit();
        m86769a();
    }

    /* JADX INFO: renamed from: a */
    public static void m86770a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f63097a = null;
        m86769a();
    }

    /* JADX INFO: renamed from: a */
    public static void m86773a(a aVar) {
        f63098a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m86769a() {
        a aVar = f63098a;
        if (aVar != null) {
            aVar.mo86367a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m86767a(Context context) {
        C14874p c14874pM86765a = m86765a(context);
        if (c14874pM86765a == null || TextUtils.isEmpty(c14874pM86765a.f63091a)) {
            return null;
        }
        String[] strArrSplit = c14874pM86765a.f63091a.split("@");
        if (strArrSplit.length > 0) {
            return strArrSplit[0];
        }
        return null;
    }
}
