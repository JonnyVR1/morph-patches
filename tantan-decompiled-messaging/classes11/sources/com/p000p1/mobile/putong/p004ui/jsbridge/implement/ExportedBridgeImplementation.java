package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.location.Location;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.e51;
import l.j2e0;
import l.qib0;
import l.s4c0;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.boq;
import p009l.coq;
import p009l.ef2;
import p009l.epq;
import p009l.liq;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExportedBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public static Map<Integer, Map<String, String>> f8144a = new HashMap();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10043c(boq boqVar, VNavigationBar vNavigationBar, String str, String str2) {
        if (boqVar.mo12183b()) {
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
        boqVar.mo12182a().setTag(s4c0.J0, new Object());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10044d(boq boqVar, VNavigationBar vNavigationBar) {
        if (boqVar.mo12183b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
        if (boqVar.mo12184c().getSupportActionBar() != null) {
            boqVar.mo12184c().getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m10045e(@NonNull Intent intent, @NonNull String str) {
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
        boqVar.mo12184c().finish();
    }

    @liq(key = "exportedGetCityInfo")
    public String exportedGetCityInfo(@NonNull boq boqVar) {
        if (!qib0.c0.signedIn_()) {
            return "";
        }
        Location locationM9160q = qib0.E.m9160q();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", (NullChecker.a(qib0.c0.queryMe()) && NullChecker.a(qib0.c0.queryMe().location) && NullChecker.a(qib0.c0.queryMe().location.region)) ? qib0.c0.queryMe().location.region.city : "");
            Double dValueOf = null;
            jSONObject.put("longitude", locationM9160q == null ? null : Double.valueOf(locationM9160q.m9128x()));
            if (locationM9160q != null) {
                dValueOf = Double.valueOf(locationM9160q.m9126u());
            }
            jSONObject.put("latitude", dValueOf);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @liq(key = "exportedGetSystemInfo")
    public synchronized String exportedGetSystemInfo(@NonNull boq boqVar) {
        if (boqVar.mo12182a() == null) {
            return "";
        }
        WebViewX webViewXMo12182a = boqVar.mo12182a();
        String strValueOf = String.valueOf(xdl0.z0(boqVar.mo12184c()));
        String strValueOf2 = String.valueOf(xdl0.x0(boqVar.mo12184c()));
        int widthX = webViewXMo12182a.getWidthX();
        int heightX = webViewXMo12182a.getHeightX();
        String str = qib0.s;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screenWidth", strValueOf);
            jSONObject.put("screenHeight", strValueOf2);
            jSONObject.put("h5Width", String.valueOf(widthX));
            jSONObject.put("h5Height", String.valueOf(heightX));
            int[] iArr = new int[2];
            webViewXMo12182a.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int iF0 = xdl0.F0() + i2;
            String str2 = String.format("(%s,%s)", Integer.valueOf(i), Integer.valueOf(iF0));
            int i3 = widthX + i;
            String str3 = String.format("(%s,%s)", Integer.valueOf(i3), Integer.valueOf(iF0));
            int i4 = i2 + heightX;
            String str4 = String.format("(%s,%s)", Integer.valueOf(i), Integer.valueOf(i4));
            String str5 = String.format("(%s,%s)", Integer.valueOf(i3), Integer.valueOf(i4));
            jSONObject.put("h5LeftTopPos", str2);
            jSONObject.put("h5RightTopPos", str3);
            jSONObject.put("h5LeftBottomPos", str4);
            jSONObject.put("h5RightBottomPos", str5);
            jSONObject.put("appVersion", str);
            if (NullChecker.a((Object) null)) {
                throw null;
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @liq(key = "exportedGetUserPublicId")
    public synchronized String exportedGetUserPublicId(@NonNull boq boqVar) {
        if (!qib0.c0.signedIn_()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (NullChecker.a(qib0.c0.queryMe())) {
                jSONObject.put("userPublicId", qib0.c0.queryMe().publicId);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @liq(key = "exportedNavigationBarHidde")
    public void exportedNavigationBarHidden(@NonNull final boq boqVar) {
        final VNavigationBar vNavigationBarM10046f = m10046f(boqVar);
        if (NullChecker.a(vNavigationBarM10046f)) {
            e51.M(new Runnable() { // from class: l.vof
                @Override // java.lang.Runnable
                public final void run() {
                    ExportedBridgeImplementation.m10044d(boqVar, vNavigationBarM10046f);
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
            Intent intentM10498Z1 = WebViewAct.m10498Z1(boqVar.mo12184c(), str2, str);
            m10045e(intentM10498Z1, str);
            boqVar.mo12184c().startActivity(intentM10498Z1);
        } else if (!epq.m14090a(str)) {
            j2e0.m(boqVar.mo12184c(), Uri.parse(str));
        } else {
            try {
                epq.m14092c(boqVar.mo12184c(), str);
            } catch (Exception unused) {
            }
        }
    }

    @liq(key = "exportedSetNavigationBar", uiThread = true)
    public void exportedSetNavigationBar(@NonNull final boq boqVar, final String str, final String str2) {
        final VNavigationBar vNavigationBarM10046f = m10046f(boqVar);
        if (NullChecker.a(vNavigationBarM10046f)) {
            e51.M(new Runnable() { // from class: l.wof
                @Override // java.lang.Runnable
                public final void run() {
                    ExportedBridgeImplementation.m10043c(boqVar, vNavigationBarM10046f, str, str2);
                }
            });
        }
    }

    @liq(key = "exportedSubscribe")
    public synchronized void exportedSubscribe(@NonNull boq boqVar, String str, String str2) {
        try {
            if (boqVar.mo12182a() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Integer numValueOf = Integer.valueOf(boqVar.mo12182a().hashCode());
                Map<String, String> map = f8144a.get(numValueOf);
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(str2, str);
                f8144a.put(numValueOf, map);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @liq(key = "exportedUnsubscribe")
    public synchronized void exportedUnsubscribe(@NonNull boq boqVar, String str) {
        if (!TextUtils.isEmpty(str) && boqVar.mo12182a() != null) {
            Map<String, String> map = f8144a.get(Integer.valueOf(boqVar.mo12182a().hashCode()));
            if (NullChecker.a(map) && !TextUtils.isEmpty(map.get(str))) {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public VNavigationBar m10046f(@NonNull coq coqVar) {
        if ((coqVar.mo12184c() instanceof WebViewAct) && (coqVar.mo12184c() instanceof WebViewAct)) {
            return coqVar.mo12184c().findViewById(s4c0.Y);
        }
        return null;
    }
}
