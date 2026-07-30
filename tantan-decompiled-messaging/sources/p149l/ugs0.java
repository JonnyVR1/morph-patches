package p149l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzavj;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ugs0 {

    /* JADX INFO: renamed from: a */
    public static final vgs0 f176425a = new vgs0() { // from class: l.ifs0
        @Override // p149l.vgs0
        /* JADX INFO: renamed from: a */
        public final void mo12863a(Object obj, Map map) {
            wat0 wat0Var = (wat0) obj;
            vgs0 vgs0Var = ugs0.f176425a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                x2t0.m206869g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            HashMap map2 = new HashMap();
            PackageManager packageManager = wat0Var.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(com.meituan.robust.Constants.PACKNAME_END, 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                xsu0.m210834k("/canOpenURLs;" + str2 + com.meituan.robust.Constants.PACKNAME_END + boolValueOf);
            }
            ((eks0) wat0Var).mo13674Z("openableURLs", map2);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final vgs0 f176426b = new vgs0() { // from class: l.kfs0
        @Override // p149l.vgs0
        /* JADX INFO: renamed from: a */
        public final void mo12863a(Object obj, Map map) {
            wat0 wat0Var = (wat0) obj;
            vgs0 vgs0Var = ugs0.f176425a;
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132204d8)).booleanValue()) {
                x2t0.m206869g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                x2t0.m206869g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(wat0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            xsu0.m210834k("/canOpenApp;" + str + com.meituan.robust.Constants.PACKNAME_END + boolValueOf);
            ((eks0) wat0Var).mo13674Z("openableApp", map2);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final vgs0 f176427c = new vgs0() { // from class: l.nfs0
        @Override // p149l.vgs0
        /* JADX INFO: renamed from: a */
        public final void mo12863a(Object obj, Map map) {
            ugs0.m193573b((wat0) obj, map);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final vgs0 f176428d = new cgs0();

    /* JADX INFO: renamed from: e */
    public static final vgs0 f176429e = new dgs0();

    /* JADX INFO: renamed from: f */
    public static final vgs0 f176430f = new vgs0() { // from class: l.ofs0
        @Override // p149l.vgs0
        /* JADX INFO: renamed from: a */
        public final void mo12863a(Object obj, Map map) {
            wat0 wat0Var = (wat0) obj;
            vgs0 vgs0Var = ugs0.f176425a;
            String str = (String) map.get("u");
            if (str == null) {
                x2t0.m206869g("URL missing from httpTrack GMSG.");
            } else {
                new mxs0(wat0Var.getContext(), ((dbt0) wat0Var).zzn().zza, str).mo124731b();
            }
        }
    };

    /* JADX INFO: renamed from: g */
    public static final vgs0 f176431g = new egs0();

    /* JADX INFO: renamed from: h */
    public static final vgs0 f176432h = new pgs0();

    /* JADX INFO: renamed from: i */
    public static final vgs0 f176433i = new vgs0() { // from class: l.mfs0
        @Override // p149l.vgs0
        /* JADX INFO: renamed from: a */
        public final void mo12863a(Object obj, Map map) {
            cbt0 cbt0Var = (cbt0) obj;
            vgs0 vgs0Var = ugs0.f176425a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                ptr0 ptr0VarMo13703p = cbt0Var.mo13703p();
                if (ptr0VarMo13703p != null) {
                    ptr0VarMo13703p.m171378c().mo136905b(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                x2t0.m206869g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* JADX INFO: renamed from: j */
    public static final vgs0 f176434j = new qgs0();

    /* JADX INFO: renamed from: k */
    public static final vgs0 f176435k = new rgs0();

    /* JADX INFO: renamed from: l */
    public static final vgs0 f176436l = new c7t0();

    /* JADX INFO: renamed from: m */
    public static final vgs0 f176437m = new d7t0();

    /* JADX INFO: renamed from: n */
    public static final vgs0 f176438n = new ves0();

    /* JADX INFO: renamed from: o */
    public static final khs0 f176439o = new khs0();

    /* JADX INFO: renamed from: p */
    public static final vgs0 f176440p = new sgs0();

    /* JADX INFO: renamed from: q */
    public static final vgs0 f176441q = new tgs0();

    /* JADX INFO: renamed from: r */
    public static final vgs0 f176442r = new pfs0();

    /* JADX INFO: renamed from: s */
    public static final vgs0 f176443s = new qfs0();

    /* JADX INFO: renamed from: t */
    public static final vgs0 f176444t = new rfs0();

    /* JADX INFO: renamed from: u */
    public static final vgs0 f176445u = new sfs0();

    /* JADX INFO: renamed from: v */
    public static final vgs0 f176446v = new tfs0();

    /* JADX INFO: renamed from: w */
    public static final vgs0 f176447w = new ufs0();

    /* JADX INFO: renamed from: x */
    public static final vgs0 f176448x = new vfs0();

    /* JADX INFO: renamed from: y */
    public static final vgs0 f176449y = new wfs0();

    /* JADX INFO: renamed from: z */
    public static final vgs0 f176450z = new xfs0();

    /* JADX INFO: renamed from: A */
    public static final vgs0 f176422A = new yfs0();

    /* JADX INFO: renamed from: B */
    public static final vgs0 f176423B = new ags0();

    /* JADX INFO: renamed from: C */
    public static final vgs0 f176424C = new bgs0();

    /* JADX INFO: renamed from: a */
    public static gnr m193572a(q9t0 q9t0Var, String str) {
        Uri uriM171376a = Uri.parse(str);
        try {
            ptr0 ptr0VarMo13703p = q9t0Var.mo13703p();
            myv0 myv0VarMo13685f = q9t0Var.mo13685f();
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132389rb)).booleanValue() || myv0VarMo13685f == null) {
                if (ptr0VarMo13703p != null && ptr0VarMo13703p.m171381f(uriM171376a)) {
                    uriM171376a = ptr0VarMo13703p.m171376a(uriM171376a, q9t0Var.getContext(), q9t0Var.zzF(), q9t0Var.zzi());
                }
            } else if (ptr0VarMo13703p != null && ptr0VarMo13703p.m171381f(uriM171376a)) {
                uriM171376a = myv0VarMo13685f.m157092a(uriM171376a, q9t0Var.getContext(), q9t0Var.zzF(), q9t0Var.zzi());
            }
        } catch (zzavj unused) {
            x2t0.m206869g("Unable to append parameter to URL: ".concat(str));
        }
        final String strM162168b = o0t0.m162168b(uriM171376a, q9t0Var.getContext());
        long jLongValue = ((Long) r9s0.f158433e.m115379e()).longValue();
        if (jLongValue <= 0 || jLongValue > 240304702) {
            return jmw0.m142235h(strM162168b);
        }
        amw0 amw0VarM97696C = amw0.m97696C(q9t0Var.mo13668T());
        ffs0 ffs0Var = new yew0() { // from class: l.ffs0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                vgs0 vgs0Var = ugs0.f176425a;
                if (!((Boolean) r9s0.f158439k.m115379e()).booleanValue()) {
                    return "failure_click_attok";
                }
                vny0.m199079q().m212290w(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        rmw0 rmw0Var = i3t0.f111377f;
        return jmw0.m142232e(jmw0.m142240m(jmw0.m142232e(amw0VarM97696C, Throwable.class, ffs0Var, rmw0Var), new yew0() { // from class: l.gfs0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                vgs0 vgs0Var = ugs0.f176425a;
                String strReplace = strM162168b;
                if (str2 == null) {
                    return strReplace;
                }
                if (((Boolean) r9s0.f158434f.m115379e()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i = 0; i < 3; i++) {
                        if (!host.endsWith(strArr[i])) {
                        }
                    }
                    return strReplace;
                }
                String str3 = (String) r9s0.f158429a.m115379e();
                String str4 = (String) r9s0.f158430b.m115379e();
                if (!TextUtils.isEmpty(str3)) {
                    strReplace = strReplace.replace(str3, str2);
                }
                if (TextUtils.isEmpty(str4)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str4)) ? uri.buildUpon().appendQueryParameter(str4, str2).toString() : strReplace;
            }
        }, rmw0Var), Throwable.class, new yew0() { // from class: l.hfs0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                vgs0 vgs0Var = ugs0.f176425a;
                if (((Boolean) r9s0.f158439k.m115379e()).booleanValue()) {
                    vny0.m199079q().m212290w(th, "prepareClickUrl.attestation2");
                }
                return strM162168b;
            }
        }, rmw0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m193573b(wat0 wat0Var, Map map) {
        Intent uri;
        PackageManager packageManager = wat0Var.getContext().getPackageManager();
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
                                x2t0.m206867e("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
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
                            vny0.m199079q().m212290w(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e3) {
                            x2t0.m206867e("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        x2t0.m206867e("Error parsing the intent data.", e4);
                    }
                }
                ((eks0) wat0Var).mo13705q("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((eks0) wat0Var).mo13705q("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((eks0) wat0Var).mo13705q("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m193574c(Map map, a7u0 a7u0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132310la)).booleanValue() && map.containsKey(Constants.INAPP_NOTIF_SHOW_CLOSE) && ((String) map.get(Constants.INAPP_NOTIF_SHOW_CLOSE)).equals("1") && a7u0Var != null) {
            a7u0Var.zzs();
        }
    }
}
