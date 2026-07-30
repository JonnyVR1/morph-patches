package com.hellogroup.p036mk.business.p038ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.p036mk.business.base.activity.BaseMkActivity;
import com.hellogroup.p036mk.business.configcontrol.FepConfigControlHelper;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.hellogroup.p036mk.core.safety.MKUrlNotSafeException;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.a6k0;
import p153l.bfe0;
import p153l.d8g0;
import p153l.flw;
import p153l.fwd0;
import p153l.glw;
import p153l.hm3;
import p153l.i8g0;
import p153l.jqh0;
import p153l.jzv;
import p153l.kf3;
import p153l.lf3;
import p153l.lv0;
import p153l.p7m;
import p153l.q4g0;
import p153l.q4k0;
import p153l.sjw;
import p153l.t1j0;
import p153l.x310;
import p153l.x40;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/NormalWebViewActivity;", "Lcom/hellogroup/mk/business/base/activity/BaseMkActivity;", "<init>", "()V", "", "j1", "Ll/p7m;", "itConfig", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "newUrl", "", "k1", "(Ll/p7m;Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/net/Uri;", "newUri", "h1", "(Landroid/net/Uri;)V", "currentUrl", "f1", "(Ljava/lang/String;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "keyCode", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Ll/x40;", "e", "Ll/x40;", "binding", "f", "Ljava/lang/String;", "url", "g", "title", "Lcom/hellogroup/mk/business/ui/NormalWebViewActivity$b;", "h", "Lcom/hellogroup/mk/business/ui/NormalWebViewActivity$b;", "mmBridge", "Companion", "a", "b", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class NormalWebViewActivity extends BaseMkActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    private static Function4<? super Context, ? super WebView, ? super flw, ? super JSONObject, Unit> f12275i;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private x40 binding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String url;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C3557b mmBridge;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$c */
    @Metadata(m88120d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"com/hellogroup/mk/business/ui/NormalWebViewActivity$c", "Landroid/webkit/WebViewClient;", "", "url", "", "processUrlScheme", "(Ljava/lang/String;)Z", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Landroid/webkit/WebResourceRequest;", SocialConstants.TYPE_REQUEST, "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3558c extends WebViewClient {
        public C3558c() {
        }

        private final boolean processUrlScheme(String url) {
            Uri uri = Uri.parse(url);
            uri.getClass();
            if (i8g0.m139001c(uri.getScheme()) || C15493d.m94381x(uri.getScheme(), "http", true) || C15493d.m94381x(uri.getScheme(), "https", true) || C15493d.m94381x(uri.getScheme(), "ftp", true)) {
                return false;
            }
            if (!NormalWebViewActivity.this.isDestroyed()) {
                jzv.m147732e("NormalWebViewActivity", "intercept -> " + url);
                try {
                    NormalWebViewActivity.this.startActivity(new Intent("android.intent.action.VIEW", uri));
                } catch (Exception e) {
                    jzv.m147730c("NormalWebViewActivity", "", e);
                }
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView view, @Nullable String url) {
            super.onPageFinished(view, url);
            MKCoreLogManager.m18427e().m18459v(NormalWebViewActivity.this.url, url, "0");
            C3557b c3557b = NormalWebViewActivity.this.mmBridge;
            if (c3557b != null) {
                c3557b.m18204f(url);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
            view.getClass();
            detail.getClass();
            return true;
        }

        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
            if (fwd0.m127760c(String.valueOf(request != null ? request.getUrl() : null))) {
                return super.shouldInterceptRequest(view, request);
            }
            return null;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
            q4k0 q4k0VarM171157a;
            Uri url;
            String string = (request == null || (url = request.getUrl()) == null) ? null : url.toString();
            p7m p7mVarM186323l = sjw.m186323l();
            if ((p7mVarM186323l != null && (((q4k0VarM171157a = p7mVarM186323l.m171157a()) != null && q4k0VarM171157a.mo18186o(view, string)) || NormalWebViewActivity.this.m18196k1(p7mVarM186323l, view, d8g0.m114836a(string)))) || !fwd0.m127760c(string)) {
                return true;
            }
            if (string == null) {
                return false;
            }
            if (!processUrlScheme(string) && view != null) {
                view.loadUrl(string);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$d */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/hellogroup/mk/business/ui/NormalWebViewActivity$d", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "receivedTitle", "", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3559d extends WebChromeClient {
        public C3559d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(@Nullable WebView view, @Nullable String receivedTitle) {
            super.onReceivedTitle(view, receivedTitle);
            String str = NormalWebViewActivity.this.title;
            if (str == null || str.length() == 0) {
                TextView textView = NormalWebViewActivity.m18187V0(NormalWebViewActivity.this).f192320b;
                textView.getClass();
                if (receivedTitle == null) {
                    receivedTitle = "";
                }
                textView.setText(receivedTitle);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class ViewOnClickListenerC3560e implements View.OnClickListener {
        public ViewOnClickListenerC3560e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean zCanGoBack = NormalWebViewActivity.m18187V0(NormalWebViewActivity.this).f192324f.canGoBack();
            NormalWebViewActivity normalWebViewActivity = NormalWebViewActivity.this;
            if (!zCanGoBack) {
                normalWebViewActivity.finish();
                return;
            }
            ImageView imageView = NormalWebViewActivity.m18187V0(normalWebViewActivity).f192322d;
            imageView.getClass();
            imageView.setVisibility(0);
            NormalWebViewActivity.m18187V0(NormalWebViewActivity.this).f192324f.goBack();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$f */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class ViewOnClickListenerC3561f implements View.OnClickListener {
        public ViewOnClickListenerC3561f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NormalWebViewActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ x40 m18187V0(NormalWebViewActivity normalWebViewActivity) {
        x40 x40Var = normalWebViewActivity.binding;
        if (x40Var == null) {
            Intrinsics.m88391r("binding");
        }
        return x40Var;
    }

    /* JADX INFO: renamed from: f1 */
    private final boolean m18193f1(String currentUrl) {
        if (currentUrl == null || TextUtils.isEmpty(currentUrl)) {
            return false;
        }
        try {
            return glw.m130713j(currentUrl);
        } catch (Exception e) {
            jzv.m147730c("NormalWebViewActivity", "", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h1 */
    private final void m18194h1(Uri newUri) {
        if (Intrinsics.m88377d("1", newUri.getQueryParameter("_mk_close"))) {
            finish();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: j1 */
    private final void m18195j1() {
        Uri uri;
        C3559d c3559d = new C3559d();
        C3558c c3558c = new C3558c();
        x40 x40Var = this.binding;
        if (x40Var == null) {
            Intrinsics.m88391r("binding");
        }
        WebView webView = x40Var.f192324f;
        webView.getClass();
        webView.setWebChromeClient(c3559d);
        x40 x40Var2 = this.binding;
        if (x40Var2 == null) {
            Intrinsics.m88391r("binding");
        }
        WebView webView2 = x40Var2.f192324f;
        webView2.getClass();
        webView2.setWebViewClient(c3558c);
        x40 x40Var3 = this.binding;
        if (x40Var3 == null) {
            Intrinsics.m88391r("binding");
        }
        WebSettings settings = x40Var3.f192324f.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setLoadWithOverviewMode(false);
        settings.setAllowFileAccess(true);
        settings.setGeolocationEnabled(true);
        File dir = getDir("webdata", 0);
        dir.getClass();
        settings.setDatabasePath(dir.getPath());
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setMixedContentMode(0);
        x40 x40Var4 = this.binding;
        if (x40Var4 == null) {
            Intrinsics.m88391r("binding");
        }
        WebView webView3 = x40Var4.f192324f;
        webView3.getClass();
        webView3.setHorizontalScrollBarEnabled(false);
        if (sjw.isInit) {
            boolean zM18025f = FepConfigControlHelper.m18025f();
            String str = this.url;
            if (!zM18025f) {
                settings.setUserAgentString(sjw.m186321j(str));
            } else if (str != null) {
                if (str != null) {
                    try {
                        uri = Uri.parse(str);
                        uri.getClass();
                    } catch (Exception e) {
                        jzv.m147730c("NormalWebViewActivity", "", e);
                    }
                } else {
                    uri = null;
                }
                if (uri != null && Intrinsics.m88377d("1", a6k0.INSTANCE.m96338d(uri, "_mkua"))) {
                    settings.setUserAgentString(settings.getUserAgentString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + sjw.m186321j(this.url));
                }
            }
        }
        jqh0.m146583c(settings);
        settings.setMixedContentMode(0);
        x40 x40Var5 = this.binding;
        if (x40Var5 == null) {
            Intrinsics.m88391r("binding");
        }
        x40Var5.f192324f.setLayerType(2, null);
        String str2 = this.url;
        if (str2 != null) {
            if (m18193f1(str2) || FepConfigControlHelper.m18025f()) {
                x40 x40Var6 = this.binding;
                if (x40Var6 == null) {
                    Intrinsics.m88391r("binding");
                }
                C3557b c3557b = new C3557b(this, x40Var6);
                this.mmBridge = c3557b;
                c3557b.m18204f(str2);
                x40 x40Var7 = this.binding;
                if (x40Var7 == null) {
                    Intrinsics.m88391r("binding");
                }
                WebView webView4 = x40Var7.f192324f;
                C3557b c3557b2 = this.mmBridge;
                if (c3557b2 == null) {
                    Intrinsics.m88386m();
                }
                webView4.addJavascriptInterface(c3557b2, "aobj");
            }
            x40 x40Var8 = this.binding;
            if (x40Var8 == null) {
                Intrinsics.m88391r("binding");
            }
            x40Var8.f192324f.loadUrl(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public final boolean m18196k1(p7m itConfig, WebView view, String newUrl) {
        Context context;
        if (C15493d.m94374J(newUrl, "https://", false, 2, null) || C15493d.m94374J(newUrl, "http://", false, 2, null)) {
            Uri uri = Uri.parse(newUrl);
            uri.getClass();
            if (d8g0.m114836a(uri.getQueryParameter("_bid")).length() == 0) {
                return false;
            }
            String strM114836a = d8g0.m114836a(uri.getQueryParameter("_mk_target"));
            if (strM114836a.length() == 0) {
                return false;
            }
            String host = uri.getHost();
            Boolean boolM171158c = itConfig.m171158c(newUrl);
            if (boolM171158c == null) {
                if (!bfe0.m103890e(host)) {
                    return false;
                }
            } else if (!boolM171158c.booleanValue()) {
                return false;
            }
            if (itConfig.mo121920b(view, newUrl, strM114836a)) {
                m18194h1(uri);
                return true;
            }
            String str = Intrinsics.m88377d(strM114836a, "1") ? strM114836a : null;
            if (str != null) {
                if (view != null && (context = view.getContext()) != null) {
                    hm3.Companion.m135822d(hm3.INSTANCE, context, view, Integer.parseInt(str), newUrl, null, null, 48, null);
                }
                m18194h1(uri);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        q4g0.m175218f(getWindow());
        x40 x40VarM209294c = x40.m209294c(getLayoutInflater());
        x40VarM209294c.getClass();
        this.binding = x40VarM209294c;
        if (x40VarM209294c == null) {
            Intrinsics.m88391r("binding");
        }
        setContentView(x40VarM209294c.m209296b());
        this.url = getIntent().getStringExtra("param_start_url");
        this.title = getIntent().getStringExtra("param_title");
        x40 x40Var = this.binding;
        if (x40Var == null) {
            Intrinsics.m88391r("binding");
        }
        x40Var.f192321c.setOnClickListener(new ViewOnClickListenerC3560e());
        x40 x40Var2 = this.binding;
        if (x40Var2 == null) {
            Intrinsics.m88391r("binding");
        }
        x40Var2.f192322d.setOnClickListener(new ViewOnClickListenerC3561f());
        String str = this.title;
        if (str != null) {
            x40 x40Var3 = this.binding;
            if (x40Var3 == null) {
                Intrinsics.m88391r("binding");
            }
            TextView textView = x40Var3.f192320b;
            textView.getClass();
            textView.setText(str);
        }
        m18195j1();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        x40 x40Var = this.binding;
        if (x40Var == null) {
            Intrinsics.m88391r("binding");
        }
        if (!x40Var.f192324f.canGoBack() || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        x40 x40Var2 = this.binding;
        if (x40Var2 == null) {
            Intrinsics.m88391r("binding");
        }
        ImageView imageView = x40Var2.f192322d;
        imageView.getClass();
        imageView.setVisibility(0);
        x40 x40Var3 = this.binding;
        if (x40Var3 == null) {
            Intrinsics.m88391r("binding");
        }
        x40Var3.f192324f.goBack();
        return true;
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR8\u0010\u0012\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/NormalWebViewActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "title", "", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Lkotlin/Function4;", "Landroid/webkit/WebView;", "Ll/flw;", "Lorg/json/JSONObject;", "globalOpenUrlCallback", "Lkotlin/jvm/functions/Function4;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m18197b(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.m18198a(context, str, str2);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: a */
        public final void m18198a(@NotNull Context context, @Nullable String url, @Nullable String title) {
            context.getClass();
            if (url != null) {
                Intent intent = new Intent(context, (Class<?>) NormalWebViewActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                }
                intent.putExtra("param_start_url", url);
                if (title != null) {
                    intent.putExtra("param_title", title);
                }
                context.startActivity(intent);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$b */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001d\u0010\u0014J\u0019\u0010\u001e\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001e\u0010\u0014R\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/NormalWebViewActivity$b;", "", "Landroid/app/Activity;", "activity", "Ll/x40;", "binding", "<init>", "(Landroid/app/Activity;Ll/x40;)V", "", FirebaseAnalytics.Param.METHOD, Constants.KEY_KEY, "value", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "()Z", "url", "f", "(Ljava/lang/String;)V", "closeWindow", "()V", "json", "dismissToolbar", "openUrl", "openUrlPage", CommandMessage.PARAMS, "openUrlByTarget", "showMessage", "sendSMS", "Ljava/lang/String;", "lastUrl", "b", "Landroid/app/Activity;", "()Landroid/app/Activity;", "c", "Ll/x40;", "()Ll/x40;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3557b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private String lastUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Activity activity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final x40 binding;

        /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$b$a */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ kf3 f12284b;

            public a(kf3 kf3Var) {
                this.f12284b = kf3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kf3 kf3Var = this.f12284b;
                WebView webView = C3557b.this.getBinding().f192324f;
                kf3Var.m149363l(webView != null ? webView.getUrl() : null);
            }
        }

        /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$b$b */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class b implements Runnable {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ JSONObject f12286b;

            public b(JSONObject jSONObject) {
                this.f12286b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Function4 function4 = NormalWebViewActivity.f12275i;
                if (function4 != null) {
                    Activity activity = C3557b.this.getActivity();
                    WebView webView = C3557b.this.getBinding().f192324f;
                    webView.getClass();
                    if (((Unit) function4.invoke(activity, webView, null, this.f12286b)) != null) {
                        return;
                    }
                }
                hm3.Companion companion = hm3.INSTANCE;
                Activity activity2 = C3557b.this.getActivity();
                WebView webView2 = C3557b.this.getBinding().f192324f;
                webView2.getClass();
                companion.m135823a(activity2, webView2, null, this.f12286b);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.NormalWebViewActivity$b$c */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f12287a;

            public c(String str) {
                this.f12287a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t1j0.m188917m(this.f12287a);
            }
        }

        public C3557b(@NotNull Activity activity, @NotNull x40 x40Var) {
            activity.getClass();
            x40Var.getClass();
            this.activity = activity;
            this.binding = x40Var;
        }

        /* JADX INFO: renamed from: a */
        private final boolean m18199a() {
            if (!FepConfigControlHelper.m18025f()) {
                return true;
            }
            try {
                String str = this.lastUrl;
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                bfe0.m103889d(str);
                return true;
            } catch (MKUrlNotSafeException e) {
                jzv.m147730c("NormalWebViewActivity", "", e);
                jzv.m147729b("NormalWebViewActivity", "dangerous url alert, " + e.getMessage());
                return false;
            } catch (Exception e2) {
                jzv.m147730c("NormalWebViewActivity", "", e2);
                return false;
            }
        }

        /* JADX INFO: renamed from: d */
        private final void m18200d(String method, String key, Object value) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (key != null) {
                    jSONObject.put(key, value != null ? value.toString() : null);
                }
                kf3 kf3Var = new kf3("aobj", method, jSONObject);
                this.binding.f192324f.post(new a(kf3Var));
                if (lf3.m153969a()) {
                    lf3.m153970b(kf3Var);
                }
            } catch (Exception e) {
                jzv.m147730c("NormalWebViewActivity", "", e);
            }
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m18201e(C3557b c3557b, String str, String str2, Object obj, int i, Object obj2) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            c3557b.m18200d(str, str2, obj);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final x40 getBinding() {
            return this.binding;
        }

        @JavascriptInterface
        public final void closeWindow() {
            m18201e(this, "closeWindow", null, null, 6, null);
            if (m18199a()) {
                this.activity.finish();
            }
        }

        @JavascriptInterface
        public final void dismissToolbar() {
            m18201e(this, "dismissToolbar", null, null, 6, null);
            if (m18199a()) {
                ConstraintLayout constraintLayout = this.binding.f192323e;
                constraintLayout.getClass();
                constraintLayout.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m18204f(@Nullable String url) {
            if (URLUtil.isHttpUrl(url) || URLUtil.isHttpsUrl(url)) {
                this.lastUrl = url;
            }
        }

        @JavascriptInterface
        public final void openUrl(@Nullable String url) {
            m18200d("openUrl", "url", url);
            if (m18199a()) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.putExtra("com.android.browser.application_id", lv0.m155973c());
                this.activity.startActivity(intent);
            }
        }

        @JavascriptInterface
        public final void openUrlByTarget(@Nullable String params) {
            m18200d("openUrlByTarget", CommandMessage.PARAMS, params);
            if (m18199a()) {
                try {
                    if (params == null) {
                        params = "";
                    }
                    x310.m209186d(new b(new JSONObject(params)));
                } catch (Exception unused) {
                }
            }
        }

        @JavascriptInterface
        public final void openUrlPage(@Nullable String url) {
            m18200d("openUrlPage", "url", url);
            if (m18199a() && url != null) {
                Companion.m18197b(NormalWebViewActivity.INSTANCE, this.activity, url, null, 4, null);
            }
        }

        @JavascriptInterface
        public final void sendSMS(@Nullable String json) {
            m18200d("sendSMS", "json", json);
            if (m18199a()) {
                try {
                    JSONObject jSONObject = new JSONObject(json);
                    String string = jSONObject.getString("phoneNumber");
                    string.getClass();
                    String string2 = jSONObject.getString("text");
                    string2.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("smsto:" + string));
                    intent.putExtra("sms_body", string2);
                    try {
                        this.activity.startActivity(intent);
                    } catch (Exception unused) {
                        t1j0.m188917m("该设备不支持短信息功能,请使用其他手机发送短信");
                    }
                } catch (JSONException unused2) {
                }
            }
        }

        @JavascriptInterface
        public final void showMessage(@Nullable String json) {
            m18200d("showMessage", "json", json);
            if (m18199a()) {
                try {
                    String strOptString = new JSONObject(json).optString("message");
                    strOptString.getClass();
                    if (i8g0.m139001c(strOptString)) {
                        return;
                    }
                    x310.m209186d(new c(strOptString));
                } catch (JSONException unused) {
                }
            }
        }

        @JavascriptInterface
        public final void closeWindow(@Nullable String json) {
            m18200d("closeWindow", "json", json);
            if (m18199a()) {
                this.activity.finish();
            }
        }
    }
}
