package com.clevertap.android.sdk.inapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Build;
import android.util.TypedValue;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p149l.gw3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 12\u00020\u0001:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0014\u0010,\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010&¨\u00062"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "", "widthDp", "heightDp", "widthPercentage", "heightPercentage", "", Constants.INAPP_ASPECT_RATIO, "<init>", "(Landroid/content/Context;IIIID)V", "(Landroid/content/Context;IIII)V", "dp", "h", "(I)I", Constants.INAPP_DATA_TAG, "()I", "c", "f", "b", "e", "a", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", RXScreenCaptureService.KEY_INDEX, "()V", "Ll/gw3;", "webInterface", "setJavaScriptInterface", "(Ll/gw3;)V", "", Constants.INAPP_JS_ENABLED, "g", "(Z)V", "Landroid/content/Context;", "I", "D", "Landroid/graphics/Point;", "Landroid/graphics/Point;", "dim", "Z", "isFullscreen", "()Z", "setFullscreen", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SuppressLint({"ViewConstructor"})
public final class CTInAppWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int widthDp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int heightDp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int widthPercentage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int heightPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double aspectRatio;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Point dim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isFullscreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ResourceType"})
    public CTInAppWebView(@NotNull Context context, int i, int i2, int i3, int i4, double d) {
        super(context);
        context.getClass();
        this.context = context;
        this.widthDp = i;
        this.heightDp = i2;
        this.widthPercentage = i3;
        this.heightPercentage = i4;
        this.aspectRatio = d;
        this.dim = new Point();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        getSettings().setTextZoom(100);
        setId(188293);
    }

    @Px
    /* JADX INFO: renamed from: a */
    private final int m6207a() {
        return (int) ((getResources().getDisplayMetrics().heightPixels * this.heightPercentage) / 100.0f);
    }

    @Px
    @RequiresApi(api = 30)
    /* JADX INFO: renamed from: b */
    private final int m6208b() {
        int iHeight;
        Object systemService = this.context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return m6207a();
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        if (this.isFullscreen) {
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            insetsIgnoringVisibility.getClass();
            iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
        }
        return (int) ((iHeight * this.heightPercentage) / 100.0f);
    }

    @Px
    /* JADX INFO: renamed from: c */
    private final int m6209c() {
        return Build.VERSION.SDK_INT >= 30 ? m6208b() : m6207a();
    }

    @Px
    /* JADX INFO: renamed from: d */
    private final int m6210d() {
        return Build.VERSION.SDK_INT >= 30 ? m6212f() : m6211e();
    }

    @Px
    /* JADX INFO: renamed from: e */
    private final int m6211e() {
        return (int) ((getResources().getDisplayMetrics().widthPixels * this.widthPercentage) / 100.0f);
    }

    @Px
    @RequiresApi(api = 30)
    /* JADX INFO: renamed from: f */
    private final int m6212f() {
        int iWidth;
        Object systemService = this.context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return m6211e();
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        if (this.isFullscreen) {
            iWidth = currentWindowMetrics.getBounds().width();
        } else {
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            insetsIgnoringVisibility.getClass();
            iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
        }
        return (int) ((iWidth * this.widthPercentage) / 100.0f);
    }

    @Px
    /* JADX INFO: renamed from: h */
    private final int m6213h(int dp) {
        return (int) TypedValue.applyDimension(1, dp, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: g */
    public final void m6214g(boolean isJsEnabled) {
        removeAllViews();
        destroyDrawingCache();
        loadUrl("about:blank");
        if (isJsEnabled) {
            removeJavascriptInterface(Constants.CLEVERTAP_LOG_TAG);
        }
        clearHistory();
        destroy();
    }

    /* JADX INFO: renamed from: i */
    public final void m6215i() {
        int iM6209c;
        int i = this.widthDp;
        int iM6213h = i > 0 ? m6213h(i) : m6210d();
        int i2 = this.heightDp;
        if (i2 > 0) {
            iM6209c = m6213h(i2);
        } else {
            double d = this.aspectRatio;
            iM6209c = (d != -1.0d && d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? (int) (((double) iM6213h) / d) : m6209c();
        }
        Point point = this.dim;
        point.x = iM6213h;
        point.y = iM6209c;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        m6215i();
        Point point = this.dim;
        setMeasuredDimension(point.x, point.y);
    }

    public final void setFullscreen(boolean z) {
        this.isFullscreen = z;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void setJavaScriptInterface(@NotNull gw3 webInterface) {
        webInterface.getClass();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        addJavascriptInterface(webInterface, Constants.CLEVERTAP_LOG_TAG);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ResourceType"})
    public CTInAppWebView(@NotNull Context context, int i, int i2, int i3, int i4) {
        this(context, i, i2, i3, i4, -1.0d);
        context.getClass();
    }
}
