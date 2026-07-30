package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.HomeTabModuleId;
import com.xiaomi.push.EnumC14937n;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.bvq0;
import p153l.etq0;
import p153l.ktq0;
import p153l.l4r0;
import p153l.m6r0;
import p153l.mtq0;
import p153l.ouq0;
import p153l.q4r0;
import p153l.u3r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.q */
/* JADX INFO: loaded from: classes2.dex */
public class C15023q {

    /* JADX INFO: renamed from: a */
    private static C15022p f63944a;

    /* JADX INFO: renamed from: a */
    private static a f63945a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.q$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo87538a();
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
    public static synchronized C15022p m87937a(Context context, String str, String str2, String str3) {
        String strSubstring;
        PackageInfo packageInfo;
        boolean z;
        ktq0 ktq0VarM160038n;
        ?? r4;
        ?? r5;
        try {
            TreeMap treeMap = new TreeMap();
            treeMap.put("devid", u3r0.m194400h(context, false));
            C15022p c15022p = f63944a;
            if (c15022p == null || TextUtils.isEmpty(c15022p.f63938a)) {
                strSubstring = null;
            } else {
                treeMap.put("uuid", f63944a.f63938a);
                int iLastIndexOf = f63944a.f63938a.lastIndexOf("/");
                if (iLastIndexOf != -1) {
                    strSubstring = f63944a.f63938a.substring(iLastIndexOf + 1);
                } else {
                    strSubstring = null;
                }
            }
            etq0.m122490c(context).m122492e(treeMap);
            String str4 = m87945a(context) ? "1000271" : str2;
            String str5 = m87945a(context) ? "420100086271" : str3;
            String str6 = m87945a(context) ? "com.xiaomi.xmsf" : str;
            treeMap.put("appid", str4);
            treeMap.put("apptoken", str5);
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str6, 16384);
            } catch (Exception e) {
                ouq0.m169397q(e);
                packageInfo = null;
            }
            treeMap.put("appversion", packageInfo != null ? String.valueOf(packageInfo.versionCode) : "0");
            treeMap.put("sdkversion", Integer.toString(50909));
            treeMap.put("packagename", str6);
            treeMap.put("model", q4r0.m175256a());
            treeMap.put(HomeTabModuleId.board, Build.BOARD);
            if (!l4r0.m152835t()) {
                String strM194412t = u3r0.m194412t(context);
                String str7 = TextUtils.isEmpty(strM194412t) ? "" : "" + bvq0.m106588b(strM194412t);
                String strM194416x = u3r0.m194416x(context);
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(strM194416x)) {
                    str7 = str7 + Constants.SEPARATOR_COMMA + strM194416x;
                }
                if (!TextUtils.isEmpty(str7)) {
                    treeMap.put("imei_md5", str7);
                }
            }
            treeMap.put("os", Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL);
            int iM194395c = u3r0.m194395c();
            if (iM194395c >= 0) {
                treeMap.put("space_id", Integer.toString(iM194395c));
            }
            treeMap.put("brand", Build.BRAND + "");
            treeMap.put("ram", u3r0.m194397e());
            treeMap.put("rom", u3r0.m194407o());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : treeMap.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e2) {
                    ouq0.m169378B("failed to add data in json format: k=" + ((String) entry.getKey()) + ",v=" + ((String) entry.getValue()) + ". " + e2);
                }
            }
            String strM87740a = C14999av.m87740a(jSONObject.toString());
            TreeMap treeMap2 = new TreeMap();
            treeMap2.put("requestData", strM87740a);
            treeMap2.put("keyPairVer", "1");
            if (m87935a(context) >= 2 || TextUtils.isEmpty(strM87740a)) {
                z = false;
            } else {
                ouq0.m169393m("r.data = " + strM87740a);
                z = true;
            }
            String strM87939a = m87939a(context, z);
            if (TextUtils.isEmpty(strM87939a)) {
                return null;
            }
            if (z) {
                treeMap = treeMap2;
            }
            try {
                ktq0VarM160038n = mtq0.m160038n(context, strM87939a, treeMap);
            } catch (IOException e3) {
                ouq0.m169378B("device registration request failed. " + e3);
                ktq0VarM160038n = null;
            }
            if (ktq0VarM160038n == null || ktq0VarM160038n.f128728a != 200) {
                r4 = z;
            } else {
                String strM151394a = ktq0VarM160038n.m151394a();
                if (TextUtils.isEmpty(strM151394a)) {
                    r4 = z;
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strM151394a);
                        r5 = jSONObject2.getInt("code");
                        try {
                            if (r5 == 0) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                                String string = jSONObject3.getString("ssecurity");
                                String string2 = jSONObject3.getString("token");
                                String string3 = jSONObject3.getString("userId");
                                if (TextUtils.isEmpty(strSubstring)) {
                                    strSubstring = "an" + bvq0.m106587a(6);
                                }
                                C15022p c15022p2 = new C15022p(string3 + "@xiaomi.com/" + strSubstring, string2, string, str4, str5, str6, m6r0.m157261a());
                                m87943a(context, c15022p2);
                                f63944a = c15022p2;
                                m87942a(context, 0);
                                ouq0.m169393m("device registration is successful. " + string3);
                                return c15022p2;
                            }
                            r4 = z;
                            C15027t.m87959a(context, jSONObject2.getInt("code"), jSONObject2.optString("description"));
                            ouq0.m169393m("device registration resp: " + strM151394a);
                        } catch (JSONException e4) {
                            e = e4;
                            ouq0.m169378B("failed to parse respone json data. " + e);
                            r4 = r5;
                        } catch (Throwable th) {
                            th = th;
                            ouq0.m169378B("unknow throwable. " + th);
                            r4 = r5;
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        r5 = z;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = z;
                    }
                    ouq0.m169378B("failed to parse respone json data. " + e);
                    r4 = r5;
                }
            }
            if (r4 != 0 && mtq0.m160046v(context)) {
                m87942a(context, m87935a(context) + 1);
            }
            ouq0.m169393m("fail to register push account. meet error.");
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C15022p m87936a(Context context) {
        try {
            C15022p c15022p = f63944a;
            if (c15022p != null) {
                return c15022p;
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
            if (!TextUtils.isEmpty(string7) && u3r0.m194405m(string7)) {
                string7 = u3r0.m194418z(context);
                sharedPreferences.edit().putString("device_id", string7).commit();
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            String strM194418z = u3r0.m194418z(context);
            if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(strM194418z) && !TextUtils.isEmpty(string7) && !string7.equals(strM194418z)) {
                ouq0.m169393m("read_phone_state permission changes.");
            }
            C15022p c15022p2 = new C15022p(string, string2, string3, string4, string5, string6, i);
            f63944a = c15022p2;
            return c15022p2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m87939a(Context context, boolean z) {
        String strM87778a = C15004b.m87775a(context).m87778a();
        String str = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (m6r0.m157264d()) {
            return "http://10.38.162.35:9085".concat(str);
        }
        if (EnumC14937n.China.name().equals(strM87778a)) {
            return "https://cn.register.xmpush.xiaomi.com".concat(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87945a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* JADX INFO: renamed from: a */
    private static void m87942a(Context context, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putInt("enc_req_fail_count", i);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    private static int m87935a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m87943a(Context context, C15022p c15022p) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putString("uuid", c15022p.f63938a);
        editorEdit.putString("security", c15022p.f63940c);
        editorEdit.putString("token", c15022p.f63939b);
        editorEdit.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c15022p.f63941d);
        editorEdit.putString("package_name", c15022p.f63943f);
        editorEdit.putString("app_token", c15022p.f63942e);
        editorEdit.putString("device_id", u3r0.m194418z(context));
        editorEdit.putInt("env_type", c15022p.f63937a);
        editorEdit.commit();
        m87940a();
    }

    /* JADX INFO: renamed from: a */
    public static void m87941a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f63944a = null;
        m87940a();
    }

    /* JADX INFO: renamed from: a */
    public static void m87944a(a aVar) {
        f63945a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m87940a() {
        a aVar = f63945a;
        if (aVar != null) {
            aVar.mo87538a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m87938a(Context context) {
        C15022p c15022pM87936a = m87936a(context);
        if (c15022pM87936a == null || TextUtils.isEmpty(c15022pM87936a.f63938a)) {
            return null;
        }
        String[] strArrSplit = c15022pM87936a.f63938a.split("@");
        if (strArrSplit.length > 0) {
            return strArrSplit[0];
        }
        return null;
    }
}
