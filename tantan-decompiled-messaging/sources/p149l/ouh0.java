package p149l;

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
public final class ouh0 {

    /* JADX INFO: renamed from: a */
    public final Context f145697a;

    /* JADX INFO: renamed from: b */
    public final WebView f145698b;

    /* JADX INFO: renamed from: c */
    public final ptr0 f145699c;

    /* JADX INFO: renamed from: d */
    public final myv0 f145700d;

    /* JADX INFO: renamed from: e */
    public final int f145701e;

    /* JADX INFO: renamed from: f */
    public final wnu0 f145702f;

    /* JADX INFO: renamed from: g */
    public final boolean f145703g;

    /* JADX INFO: renamed from: h */
    public final rmw0 f145704h = i3t0.f111376e;

    /* JADX INFO: renamed from: i */
    public final s5w0 f145705i;

    public ouh0(WebView webView, ptr0 ptr0Var, wnu0 wnu0Var, s5w0 s5w0Var, myv0 myv0Var) {
        this.f145698b = webView;
        Context context = webView.getContext();
        this.f145697a = context;
        this.f145699c = ptr0Var;
        this.f145702f = wnu0Var;
        m7s0.m153417a(context);
        this.f145701e = ((Integer) d1s0.m109677c().m144697a(m7s0.f132374q9)).intValue();
        this.f145703g = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132387r9)).booleanValue();
        this.f145705i = s5w0Var;
        this.f145700d = myv0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m166070b(Bundle bundle, unb0 unb0Var) {
        CookieManager cookieManagerMo112967a = vny0.m199081s().mo112967a(this.f145697a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerMo112967a != null ? cookieManagerMo112967a.acceptThirdPartyCookies(this.f145698b) : false);
        tnb0.m189769a(this.f145697a, AdFormat.BANNER, new w70.C20817a().m191883b(AdMobAdapter.class, bundle).m201999i(), unb0Var);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m166071c(String str) {
        myv0 myv0Var;
        Uri uriM171376a = Uri.parse(str);
        try {
            uriM171376a = (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132389rb)).booleanValue() || (myv0Var = this.f145700d) == null) ? this.f145699c.m171376a(uriM171376a, this.f145697a, this.f145698b, null) : myv0Var.m157092a(uriM171376a, this.f145697a, this.f145698b, null);
        } catch (zzavj e) {
            x2t0.m206865c("Failed to append the click signal to URL: ", e);
            vny0.m199079q().m212290w(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.f145705i.m182382c(uriM171376a.toString(), null);
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
            String strMo136906c = this.f145699c.m171378c().mo136906c(this.f145697a, str, this.f145698b);
            if (this.f145703g) {
                kpv0.m146889c(this.f145702f, null, "csg", new Pair("clat", String.valueOf(vny0.m199064b().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strMo136906c;
        } catch (RuntimeException e) {
            x2t0.m206867e("Exception getting click signals. ", e);
            vny0.m199079q().m212290w(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            x2t0.m206866d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) i3t0.f111372a.mo122102R(new Callable() { // from class: l.rlr0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f159998a.getClickSignals(str);
                }
            }).get(Math.min(i, this.f145701e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            x2t0.m206867e("Exception getting click signals with timeout. ", e);
            vny0.m199079q().m212290w(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? Constants.VIA_REPORT_TYPE_START_GROUP : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        vny0.m199080r();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final eor0 eor0Var = new eor0(this, string);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132412t9)).booleanValue()) {
            this.f145704h.execute(new Runnable() { // from class: l.umr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177295a.m166070b(bundle, eor0Var);
                }
            });
            return string;
        }
        tnb0.m189769a(this.f145697a, AdFormat.BANNER, new w70.C20817a().m191883b(AdMobAdapter.class, bundle).m201999i(), eor0Var);
        return string;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
            String strMo136911h = this.f145699c.m171378c().mo136911h(this.f145697a, this.f145698b, null);
            if (this.f145703g) {
                kpv0.m146889c(this.f145702f, null, "vsg", new Pair("vlat", String.valueOf(vny0.m199064b().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strMo136911h;
        } catch (RuntimeException e) {
            x2t0.m206867e("Exception getting view signals. ", e);
            vny0.m199079q().m212290w(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            x2t0.m206866d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) i3t0.f111372a.mo122102R(new Callable() { // from class: l.wir0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f186565a.getViewSignals();
                }
            }).get(Math.min(i, this.f145701e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            x2t0.m206867e("Exception getting view signals with timeout. ", e);
            vny0.m199079q().m212290w(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? Constants.VIA_REPORT_TYPE_START_GROUP : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132436v9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        i3t0.f111372a.execute(new Runnable() { // from class: l.hkr0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108263a.m166071c(str);
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
            int i2 = jSONObject.getInt(BaseSei.f13930X);
            int i3 = jSONObject.getInt(BaseSei.f13931Y);
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
            this.f145699c.m171379d(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            x2t0.m206867e("Failed to parse the touch string. ", e);
            vny0.m199079q().m212290w(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
