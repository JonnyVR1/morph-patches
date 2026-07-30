package p153l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzavj;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class aqs0 {

    /* JADX INFO: renamed from: a */
    public static final bqs0 f72852a = new bqs0() { // from class: l.oos0
        @Override // p153l.bqs0
        /* JADX INFO: renamed from: a */
        public final void mo12917a(Object obj, Map map) {
            ckt0 ckt0Var = (ckt0) obj;
            bqs0 bqs0Var = aqs0.f72852a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                dct0.m115298g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            HashMap map2 = new HashMap();
            PackageManager packageManager = ckt0Var.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(com.meituan.robust.Constants.PACKNAME_END, 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                d2v0.m113737k("/canOpenURLs;" + str2 + com.meituan.robust.Constants.PACKNAME_END + boolValueOf);
            }
            ((kts0) ckt0Var).mo13728Z("openableURLs", map2);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final bqs0 f72853b = new bqs0() { // from class: l.qos0
        @Override // p153l.bqs0
        /* JADX INFO: renamed from: a */
        public final void mo12917a(Object obj, Map map) {
            ckt0 ckt0Var = (ckt0) obj;
            bqs0 bqs0Var = aqs0.f72852a;
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168275d8)).booleanValue()) {
                dct0.m115298g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                dct0.m115298g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(ckt0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            d2v0.m113737k("/canOpenApp;" + str + com.meituan.robust.Constants.PACKNAME_END + boolValueOf);
            ((kts0) ckt0Var).mo13728Z("openableApp", map2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final bqs0 f72854c = new bqs0() { // from class: l.tos0
        @Override // p153l.bqs0
        /* JADX INFO: renamed from: a */
        public final void mo12917a(Object obj, Map map) {
            aqs0.m99555b((ckt0) obj, map);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final bqs0 f72855d = new ips0();

    /* JADX INFO: renamed from: e */
    public static final bqs0 f72856e = new jps0();

    /* JADX INFO: renamed from: f */
    public static final bqs0 f72857f = new bqs0() { // from class: l.uos0
        @Override // p153l.bqs0
        /* JADX INFO: renamed from: a */
        public final void mo12917a(Object obj, Map map) {
            ckt0 ckt0Var = (ckt0) obj;
            bqs0 bqs0Var = aqs0.f72852a;
            String str = (String) map.get("u");
            if (str == null) {
                dct0.m115298g("URL missing from httpTrack GMSG.");
            } else {
                new s6t0(ckt0Var.getContext(), ((jkt0) ckt0Var).zzn().zza, str).mo96667b();
            }
        }
    };

    /* JADX INFO: renamed from: g */
    public static final bqs0 f72858g = new kps0();

    /* JADX INFO: renamed from: h */
    public static final bqs0 f72859h = new vps0();

    /* JADX INFO: renamed from: i */
    public static final bqs0 f72860i = new bqs0() { // from class: l.sos0
        @Override // p153l.bqs0
        /* JADX INFO: renamed from: a */
        public final void mo12917a(Object obj, Map map) {
            ikt0 ikt0Var = (ikt0) obj;
            bqs0 bqs0Var = aqs0.f72852a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                v2s0 v2s0VarMo13757p = ikt0Var.mo13757p();
                if (v2s0VarMo13757p != null) {
                    v2s0VarMo13757p.m199147c().mo165755b(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                dct0.m115298g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* JADX INFO: renamed from: j */
    public static final bqs0 f72861j = new wps0();

    /* JADX INFO: renamed from: k */
    public static final bqs0 f72862k = new xps0();

    /* JADX INFO: renamed from: l */
    public static final bqs0 f72863l = new igt0();

    /* JADX INFO: renamed from: m */
    public static final bqs0 f72864m = new jgt0();

    /* JADX INFO: renamed from: n */
    public static final bqs0 f72865n = new bos0();

    /* JADX INFO: renamed from: o */
    public static final qqs0 f72866o = new qqs0();

    /* JADX INFO: renamed from: p */
    public static final bqs0 f72867p = new yps0();

    /* JADX INFO: renamed from: q */
    public static final bqs0 f72868q = new zps0();

    /* JADX INFO: renamed from: r */
    public static final bqs0 f72869r = new vos0();

    /* JADX INFO: renamed from: s */
    public static final bqs0 f72870s = new wos0();

    /* JADX INFO: renamed from: t */
    public static final bqs0 f72871t = new xos0();

    /* JADX INFO: renamed from: u */
    public static final bqs0 f72872u = new yos0();

    /* JADX INFO: renamed from: v */
    public static final bqs0 f72873v = new zos0();

    /* JADX INFO: renamed from: w */
    public static final bqs0 f72874w = new aps0();

    /* JADX INFO: renamed from: x */
    public static final bqs0 f72875x = new bps0();

    /* JADX INFO: renamed from: y */
    public static final bqs0 f72876y = new cps0();

    /* JADX INFO: renamed from: z */
    public static final bqs0 f72877z = new dps0();

    /* JADX INFO: renamed from: A */
    public static final bqs0 f72849A = new eps0();

    /* JADX INFO: renamed from: B */
    public static final bqs0 f72850B = new gps0();

    /* JADX INFO: renamed from: C */
    public static final bqs0 f72851C = new hps0();

    /* JADX INFO: renamed from: a */
    public static hpr m99554a(wit0 wit0Var, String str) {
        Uri uriM199145a = Uri.parse(str);
        try {
            v2s0 v2s0VarMo13757p = wit0Var.mo13757p();
            s7w0 s7w0VarMo13739f = wit0Var.mo13739f();
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168460rb)).booleanValue() || s7w0VarMo13739f == null) {
                if (v2s0VarMo13757p != null && v2s0VarMo13757p.m199150f(uriM199145a)) {
                    uriM199145a = v2s0VarMo13757p.m199145a(uriM199145a, wit0Var.getContext(), wit0Var.zzF(), wit0Var.zzi());
                }
            } else if (v2s0VarMo13757p != null && v2s0VarMo13757p.m199150f(uriM199145a)) {
                uriM199145a = s7w0VarMo13739f.m185039a(uriM199145a, wit0Var.getContext(), wit0Var.zzF(), wit0Var.zzi());
            }
        } catch (zzavj unused) {
            dct0.m115298g("Unable to append parameter to URL: ".concat(str));
        }
        final String strM195118b = u9t0.m195118b(uriM199145a, wit0Var.getContext());
        long jLongValue = ((Long) xis0.f194498e.m149974e()).longValue();
        if (jLongValue <= 0 || jLongValue > 240304702) {
            return pvw0.m173981h(strM195118b);
        }
        gvw0 gvw0VarM132580C = gvw0.m132580C(wit0Var.mo13722T());
        los0 los0Var = new eow0() { // from class: l.los0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                bqs0 bqs0Var = aqs0.f72852a;
                if (!((Boolean) xis0.f194504k.m149974e()).booleanValue()) {
                    return "failure_click_attok";
                }
                bxy0.m106933q().m120275w(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        xvw0 xvw0Var = oct0.f146738f;
        return pvw0.m173978e(pvw0.m173986m(pvw0.m173978e(gvw0VarM132580C, Throwable.class, los0Var, xvw0Var), new eow0() { // from class: l.mos0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                bqs0 bqs0Var = aqs0.f72852a;
                String strReplace = strM195118b;
                if (str2 == null) {
                    return strReplace;
                }
                if (((Boolean) xis0.f194499f.m149974e()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return strReplace;
                }
                String str3 = (String) xis0.f194494a.m149974e();
                String str4 = (String) xis0.f194495b.m149974e();
                if (!TextUtils.isEmpty(str3)) {
                    strReplace = strReplace.replace(str3, str2);
                }
                if (TextUtils.isEmpty(str4)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str4)) ? uri.buildUpon().appendQueryParameter(str4, str2).toString() : strReplace;
            }
        }, xvw0Var), Throwable.class, new eow0() { // from class: l.nos0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                bqs0 bqs0Var = aqs0.f72852a;
                if (((Boolean) xis0.f194504k.m149974e()).booleanValue()) {
                    bxy0.m106933q().m120275w(th, "prepareClickUrl.attestation2");
                }
                return strM195118b;
            }
        }, xvw0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m99555b(ckt0 ckt0Var, Map map) {
        Intent uri;
        PackageManager packageManager = ckt0Var.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString(RXScreenCaptureService.KEY_INDEX);
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                dct0.m115296e("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e2) {
                            bxy0.m106933q().m120275w(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e3) {
                            dct0.m115296e("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        dct0.m115296e("Error parsing the intent data.", e4);
                    }
                }
                ((kts0) ckt0Var).mo13759q("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((kts0) ckt0Var).mo13759q("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((kts0) ckt0Var).mo13759q("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m99556c(Map map, ggu0 ggu0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168381la)).booleanValue() && map.containsKey(Constants.INAPP_NOTIF_SHOW_CLOSE) && ((String) map.get(Constants.INAPP_NOTIF_SHOW_CLOSE)).equals("1") && ggu0Var != null) {
            ggu0Var.zzs();
        }
    }
}
