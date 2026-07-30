package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.ExportedBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.navigationbar.VNavigationBar;
import p153l.aqq;
import p153l.bnl0;
import p153l.bqq;
import p153l.erq;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.nae0;
import p153l.uqb0;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class ExportedBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public static Map<Integer, Map<String, String>> f55386a = new HashMap();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80904c(aqq aqqVar, VNavigationBar vNavigationBar, String str, String str2) {
        if (aqqVar.mo99542b()) {
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
        aqqVar.mo99541a().setTag(ycc0.f198423J0, new Object());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80905d(aqq aqqVar, VNavigationBar vNavigationBar) {
        if (aqqVar.mo99542b()) {
            return;
        }
        vNavigationBar.setVisibility(8);
        if (aqqVar.mo99543c().getSupportActionBar() != null) {
            aqqVar.mo99543c().getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m80906e(@NonNull Intent intent, @NonNull String str) {
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

    @lkq(key = "exportedCloseWebview", uiThread = true)
    public void exportedCloseWebview(@NonNull aqq aqqVar) {
        aqqVar.mo99543c().m68056e2();
    }

    @lkq(key = "exportedGetCityInfo")
    public String exportedGetCityInfo(@NonNull aqq aqqVar) {
        if (!uqb0.f180397c0.signedIn_()) {
            return "";
        }
        Location locationM80048q = uqb0.f180370E.m80048q();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", (NullChecker.m82486a(uqb0.f180397c0.queryMe()) && NullChecker.m82486a(uqb0.f180397c0.queryMe().location) && NullChecker.m82486a(uqb0.f180397c0.queryMe().location.region)) ? uqb0.f180397c0.queryMe().location.region.city : "");
            Double dValueOf = null;
            jSONObject.put("longitude", locationM80048q == null ? null : Double.valueOf(locationM80048q.m80016x()));
            if (locationM80048q != null) {
                dValueOf = Double.valueOf(locationM80048q.m80014u());
            }
            jSONObject.put("latitude", dValueOf);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @lkq(key = "exportedGetSystemInfo")
    public synchronized String exportedGetSystemInfo(@NonNull aqq aqqVar) {
        if (aqqVar.mo99541a() == null) {
            return "";
        }
        WebViewX webViewXM99545e = aqqVar.mo99541a();
        String strValueOf = String.valueOf(bnl0.m105594z0(aqqVar.mo99543c()));
        String strValueOf2 = String.valueOf(bnl0.m105590x0(aqqVar.mo99543c()));
        int widthX = webViewXM99545e.getWidthX();
        int heightX = webViewXM99545e.getHeightX();
        String str = uqb0.f180413s;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screenWidth", strValueOf);
            jSONObject.put("screenHeight", strValueOf2);
            jSONObject.put("h5Width", String.valueOf(widthX));
            jSONObject.put("h5Height", String.valueOf(heightX));
            int[] iArr = new int[2];
            webViewXM99545e.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int iM105511F0 = bnl0.m105511F0() + i2;
            String str2 = String.format("(%s,%s)", Integer.valueOf(i), Integer.valueOf(iM105511F0));
            int i3 = widthX + i;
            String str3 = String.format("(%s,%s)", Integer.valueOf(i3), Integer.valueOf(iM105511F0));
            int i4 = i2 + heightX;
            String str4 = String.format("(%s,%s)", Integer.valueOf(i), Integer.valueOf(i4));
            String str5 = String.format("(%s,%s)", Integer.valueOf(i3), Integer.valueOf(i4));
            jSONObject.put("h5LeftTopPos", str2);
            jSONObject.put("h5RightTopPos", str3);
            jSONObject.put("h5LeftBottomPos", str4);
            jSONObject.put("h5RightBottomPos", str5);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            if (NullChecker.m82486a(null)) {
                throw null;
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @lkq(key = "exportedGetUserPublicId")
    public synchronized String exportedGetUserPublicId(@NonNull aqq aqqVar) {
        if (!uqb0.f180397c0.signedIn_()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (NullChecker.m82486a(uqb0.f180397c0.queryMe())) {
                jSONObject.put("userPublicId", uqb0.f180397c0.queryMe().publicId);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @lkq(key = "exportedNavigationBarHidde")
    public void exportedNavigationBarHidden(@NonNull final aqq aqqVar) {
        final VNavigationBar vNavigationBarM80907f = m80907f(aqqVar);
        if (NullChecker.m82486a(vNavigationBarM80907f)) {
            l51.m152893M(new Runnable() { // from class: l.cqf
                @Override // java.lang.Runnable
                public final void run() {
                    ExportedBridgeImplementation.m80905d(aqqVar, vNavigationBarM80907f);
                }
            });
        }
    }

    @lkq(key = "exportedOpenWebview", uiThread = true)
    public void exportedOpenWebview(@NonNull aqq aqqVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("http")) {
            Intent intentM81347a2 = WebViewAct.m81347a2(aqqVar.mo99543c(), str2, str);
            m80906e(intentM81347a2, str);
            aqqVar.mo99543c().startActivity(intentM81347a2);
        } else if (!erq.m122256a(str)) {
            nae0.m162083m(aqqVar.mo99543c(), Uri.parse(str));
        } else {
            try {
                erq.m122258c(aqqVar.mo99543c(), str);
            } catch (Exception unused) {
            }
        }
    }

    @lkq(key = "exportedSetNavigationBar", uiThread = true)
    public void exportedSetNavigationBar(@NonNull final aqq aqqVar, final String str, final String str2) {
        final VNavigationBar vNavigationBarM80907f = m80907f(aqqVar);
        if (NullChecker.m82486a(vNavigationBarM80907f)) {
            l51.m152893M(new Runnable() { // from class: l.dqf
                @Override // java.lang.Runnable
                public final void run() {
                    ExportedBridgeImplementation.m80904c(aqqVar, vNavigationBarM80907f, str, str2);
                }
            });
        }
    }

    @lkq(key = "exportedSubscribe")
    public synchronized void exportedSubscribe(@NonNull aqq aqqVar, String str, String str2) {
        try {
            if (aqqVar.mo99541a() != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Integer numValueOf = Integer.valueOf(aqqVar.mo99541a().hashCode());
                Map<String, String> map = f55386a.get(numValueOf);
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(str2, str);
                f55386a.put(numValueOf, map);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @lkq(key = "exportedUnsubscribe")
    public synchronized void exportedUnsubscribe(@NonNull aqq aqqVar, String str) {
        if (!TextUtils.isEmpty(str) && aqqVar.mo99541a() != null) {
            Map<String, String> map = f55386a.get(Integer.valueOf(aqqVar.mo99541a().hashCode()));
            if (NullChecker.m82486a(map) && !TextUtils.isEmpty(map.get(str))) {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public VNavigationBar m80907f(@NonNull bqq bqqVar) {
        if ((bqqVar.mo99543c() instanceof WebViewAct) && (bqqVar.mo99543c() instanceof WebViewAct)) {
            return (VNavigationBar) bqqVar.mo99543c().findViewById(ycc0.f198442Y);
        }
        return null;
    }
}
