package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzavj;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.connect.common.Constants;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w2i0 {

    /* JADX INFO: renamed from: a */
    public final Context f186901a;

    /* JADX INFO: renamed from: b */
    public final WebView f186902b;

    /* JADX INFO: renamed from: c */
    public final v2s0 f186903c;

    /* JADX INFO: renamed from: d */
    public final s7w0 f186904d;

    /* JADX INFO: renamed from: e */
    public final int f186905e;

    /* JADX INFO: renamed from: f */
    public final cxu0 f186906f;

    /* JADX INFO: renamed from: g */
    public final boolean f186907g;

    /* JADX INFO: renamed from: h */
    public final xvw0 f186908h = oct0.f146737e;

    /* JADX INFO: renamed from: i */
    public final yew0 f186909i;

    public w2i0(WebView webView, v2s0 v2s0Var, cxu0 cxu0Var, yew0 yew0Var, s7w0 s7w0Var) {
        this.f186902b = webView;
        Context context = webView.getContext();
        this.f186901a = context;
        this.f186903c = v2s0Var;
        this.f186906f = cxu0Var;
        sgs0.m185829a(context);
        this.f186905e = ((Integer) jas0.m144075c().m176505a(sgs0.f168445q9)).intValue();
        this.f186907g = ((Boolean) jas0.m144075c().m176505a(sgs0.f168458r9)).booleanValue();
        this.f186909i = yew0Var;
        this.f186904d = s7w0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m204577b(Bundle bundle, yvb0 yvb0Var) {
        CookieManager cookieManagerMo109050a = bxy0.m106935s().mo109050a(this.f186901a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerMo109050a != null ? cookieManagerMo109050a.acceptThirdPartyCookies(this.f186902b) : false);
        xvb0.m213213a(this.f186901a, AdFormat.BANNER, new s70.C19999a().m179961b(AdMobAdapter.class, bundle).m184941i(), yvb0Var);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m204578c(String str) {
        s7w0 s7w0Var;
        Uri uriM199145a = Uri.parse(str);
        try {
            uriM199145a = (!((Boolean) jas0.m144075c().m176505a(sgs0.f168460rb)).booleanValue() || (s7w0Var = this.f186904d) == null) ? this.f186903c.m199145a(uriM199145a, this.f186901a, this.f186902b, null) : s7w0Var.m185039a(uriM199145a, this.f186901a, this.f186902b, null);
        } catch (zzavj e) {
            dct0.m115294c("Failed to append the click signal to URL: ", e);
            bxy0.m106933q().m120275w(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.f186909i.m215479c(uriM199145a.toString(), null);
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
            String strMo165756c = this.f186903c.m199147c().mo165756c(this.f186901a, str, this.f186902b);
            if (this.f186907g) {
                qyv0.m178752c(this.f186906f, null, "csg", new Pair("clat", String.valueOf(bxy0.m106918b().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strMo165756c;
        } catch (RuntimeException e) {
            dct0.m115296e("Exception getting click signals. ", e);
            bxy0.m106933q().m120275w(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            dct0.m115295d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) oct0.f146733a.mo155969R(new Callable() { // from class: l.xur0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f196316a.getClickSignals(str);
                }
            }).get(Math.min(i, this.f186905e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            dct0.m115296e("Exception getting click signals with timeout. ", e);
            bxy0.m106933q().m120275w(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? Constants.VIA_REPORT_TYPE_START_GROUP : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        bxy0.m106934r();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final kxr0 kxr0Var = new kxr0(this, string);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168483t9)).booleanValue()) {
            this.f186908h.execute(new Runnable() { // from class: l.awr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73786a.m204577b(bundle, kxr0Var);
                }
            });
            return string;
        }
        xvb0.m213213a(this.f186901a, AdFormat.BANNER, new s70.C19999a().m179961b(AdMobAdapter.class, bundle).m184941i(), kxr0Var);
        return string;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
            String strMo165761h = this.f186903c.m199147c().mo165761h(this.f186901a, this.f186902b, null);
            if (this.f186907g) {
                qyv0.m178752c(this.f186906f, null, "vsg", new Pair("vlat", String.valueOf(bxy0.m106918b().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strMo165761h;
        } catch (RuntimeException e) {
            dct0.m115296e("Exception getting view signals. ", e);
            bxy0.m106933q().m120275w(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            dct0.m115295d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) oct0.f146733a.mo155969R(new Callable() { // from class: l.csr0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f83484a.getViewSignals();
                }
            }).get(Math.min(i, this.f186905e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            dct0.m115296e("Exception getting view signals with timeout. ", e);
            bxy0.m106933q().m120275w(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? Constants.VIA_REPORT_TYPE_START_GROUP : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168507v9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        oct0.f146733a.execute(new Runnable() { // from class: l.ntr0
            @Override // java.lang.Runnable
            public final void run() {
                this.f143630a.m204578c(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt(BaseSei.f14624X);
            int i3 = jSONObject.getInt(BaseSei.f14625Y);
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i = 1;
                if (i5 != 1) {
                    i = 2;
                    if (i5 != 2) {
                        i = 3;
                        if (i5 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            this.f186903c.m199148d(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            dct0.m115296e("Failed to parse the touch string. ", e);
            bxy0.m106933q().m120275w(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
