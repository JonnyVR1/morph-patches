package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.navigationbar.VNavigationBar;
import p149l.boq;
import p149l.coq;
import p149l.e51;
import p149l.ef2;
import p149l.epq;
import p149l.j2e0;
import p149l.liq;
import p149l.qib0;
import p149l.s4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ExportedBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public static Map<Integer, Map<String, String>> f54538a = new HashMap();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79721c(boq boqVar, VNavigationBar vNavigationBar, String str, String str2) {
        if (boqVar.mo102960b()) {
            return;
        }
        int color = 0;
        vNavigationBar.setVisibility(0);
        vNavigationBar.setTitle(str);
        try {
            if (!str2.equalsIgnoreCase("transparent")) {
                if (!str2.startsWith("#")) {
                    str2 = "#".concat(str2);
                }
                color = Color.parseColor(str2);
            }
            vNavigationBar.setBackgroundColor(color);
        } catch (Exception unused) {
        }
        boqVar.mo102959a().setTag(s4c0.f162302J0, new Object());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79722d(boq boqVar, VNavigationBar vNavigationBar) {
        if (boqVar.mo102960b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
        if (boqVar.mo102961c().getSupportActionBar() != null) {
            boqVar.mo102961c().getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m79723e(@NonNull Intent intent, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Uri uri = Uri.parse(str);
            boolean zEquals = "1".equals(uri.getQueryParameter("hideNavigationBar"));
            boolean zEquals2 = "1".equals(uri.getQueryParameter("skipLoading"));
            String queryParameter = uri.getQueryParameter("webviewColor");
            String queryParameter2 = uri.getQueryParameter("notchColor");
            boolean zEquals3 = "1".equals(uri.getQueryParameter("hideNotch"));
            boolean zEquals4 = "1".equals(uri.getQueryParameter("AD_WebView"));
            intent.putExtra("hideNavigationBar", zEquals);
            intent.putExtra("skipLoading", zEquals2);
            intent.putExtra("webviewColor", queryParameter);
            intent.putExtra("notchColor", queryParameter2);
            intent.putExtra("hideNotch", zEquals3);
            intent.putExtra("AD_WebView", zEquals4);
            intent.putExtra("is_mt_pay", true);
        } catch (Exception unused) {
        }
    }

    @liq(key = "exportedCloseWebview", uiThread = true)
    public void exportedCloseWebview(@NonNull boq boqVar) {
        boqVar.mo102961c().m66873d2();
    }

    @liq(key = "exportedGetCityInfo")
    public String exportedGetCityInfo(@NonNull boq boqVar) {
        if (!qib0.f154714c0.signedIn_()) {
            return "";
        }
        Location locationM78865q = qib0.f154687E.m78865q();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", (NullChecker.m81303a(qib0.f154714c0.queryMe()) && NullChecker.m81303a(qib0.f154714c0.queryMe().location) && NullChecker.m81303a(qib0.f154714c0.queryMe().location.region)) ? qib0.f154714c0.queryMe().location.region.city : "");
            Double dValueOf = null;
            jSONObject.put("longitude", locationM78865q == null ? null : Double.valueOf(locationM78865q.m78833x()));
            if (locationM78865q != null) {
                dValueOf = Double.valueOf(locationM78865q.m78831u());
            }
            jSONObject.put("latitude", dValueOf);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @liq(key = "exportedGetSystemInfo")
    public synchronized String exportedGetSystemInfo(@NonNull boq boqVar) {
        if (boqVar.mo102959a() == null) {
            return "";
        }
        WebViewX webViewXM102963e = boqVar.mo102959a();
        String strValueOf = String.valueOf(xdl0.m208414z0(boqVar.mo102961c()));
        String strValueOf2 = String.valueOf(xdl0.m208410x0(boqVar.mo102961c()));
        int widthX = webViewXM102963e.getWidthX();
        int heightX = webViewXM102963e.getHeightX();
        String str = qib0.f154730s;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screenWidth", strValueOf);
            jSONObject.put("screenHeight", strValueOf2);
            jSONObject.put("h5Width", String.valueOf(widthX));
            jSONObject.put("h5Height", String.valueOf(heightX));
            int[] iArr = new int[2];
            webViewXM102963e.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int iM208331F0 = xdl0.m208331F0() + i2;
            String str2 = String.format("(%s,%s)", Integer.valueOf(i), Integer.valueOf(iM208331F0));
            int i3 = widthX + i;
            String str3 = String.format("(%s,%s)", Integer.valueOf(i3), Integer.valueOf(iM208331F0));
            int i4 = i2 + heightX;
            String str4 = String.format("(%s,%s)", Integer.valueOf(i), Integer.valueOf(i4));
            String str5 = String.format("(%s,%s)", Integer.valueOf(i3), Integer.valueOf(i4));
            jSONObject.put("h5LeftTopPos", str2);
            jSONObject.put("h5RightTopPos", str3);
            jSONObject.put("h5LeftBottomPos", str4);
            jSONObject.put("h5RightBottomPos", str5);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            if (NullChecker.m81303a(null)) {
                throw null;
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @liq(key = "exportedGetUserPublicId")
    public synchronized String exportedGetUserPublicId(@NonNull boq boqVar) {
        if (!qib0.f154714c0.signedIn_()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (NullChecker.m81303a(qib0.f154714c0.queryMe())) {
                jSONObject.put("userPublicId", qib0.f154714c0.queryMe().publicId);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @liq(key = "exportedNavigationBarHidde")
    public void exportedNavigationBarHidden(@NonNull final boq boqVar) {
        final VNavigationBar vNavigationBarM79724f = m79724f(boqVar);
        if (NullChecker.m81303a(vNavigationBarM79724f)) {
            e51.m114748M(new Runnable() { // from class: l.vof
                @Override // java.lang.Runnable
                public final void run() {
                    ExportedBridgeImplementation.m79722d(boqVar, vNavigationBarM79724f);
                }
            });
        }
    }

    @liq(key = "exportedOpenWebview", uiThread = true)
    public void exportedOpenWebview(@NonNull boq boqVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("http")) {
            Intent intentM80164Z1 = WebViewAct.m80164Z1(boqVar.mo102961c(), str2, str);
            m79723e(intentM80164Z1, str);
            boqVar.mo102961c().startActivity(intentM80164Z1);
        } else if (!epq.m117670a(str)) {
            j2e0.m139446m(boqVar.mo102961c(), Uri.parse(str));
        } else {
            try {
                epq.m117672c(boqVar.mo102961c(), str);
            } catch (Exception unused) {
            }
        }
    }

    @liq(key = "exportedSetNavigationBar", uiThread = true)
    public void exportedSetNavigationBar(@NonNull final boq boqVar, final String str, final String str2) {
        final VNavigationBar vNavigationBarM79724f = m79724f(boqVar);
        if (NullChecker.m81303a(vNavigationBarM79724f)) {
            e51.m114748M(new Runnable() { // from class: l.wof
                @Override // java.lang.Runnable
                public final void run() {
                    ExportedBridgeImplementation.m79721c(boqVar, vNavigationBarM79724f, str, str2);
                }
            });
        }
    }

    @liq(key = "exportedSubscribe")
    public synchronized void exportedSubscribe(@NonNull boq boqVar, String str, String str2) {
        try {
            if (boqVar.mo102959a() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Integer numValueOf = Integer.valueOf(boqVar.mo102959a().hashCode());
                Map<String, String> map = f54538a.get(numValueOf);
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(str2, str);
                f54538a.put(numValueOf, map);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(key = "exportedUnsubscribe")
    public synchronized void exportedUnsubscribe(@NonNull boq boqVar, String str) {
        if (!TextUtils.isEmpty(str) && boqVar.mo102959a() != null) {
            Map<String, String> map = f54538a.get(Integer.valueOf(boqVar.mo102959a().hashCode()));
            if (NullChecker.m81303a(map) && !TextUtils.isEmpty(map.get(str))) {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public VNavigationBar m79724f(@NonNull coq coqVar) {
        if ((coqVar.mo102961c() instanceof WebViewAct) && (coqVar.mo102961c() instanceof WebViewAct)) {
            return (VNavigationBar) coqVar.mo102961c().findViewById(s4c0.f162321Y);
        }
        return null;
    }
}
