package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.facebook.AccessToken;
import com.facebook.AsyncTaskC1591d;
import com.facebook.C1577c;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.common.R$string;
import com.facebook.internal.WebDialog;
import com.facebook.login.LoginTargetApp;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p149l.ark0;
import p149l.b2s;
import p149l.due0;
import p149l.fje0;
import p149l.j8c0;
import p149l.jfd0;
import p149l.lsb;
import p149l.qkq0;
import p149l.r3c0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 n2\u00020\u0001:\u0005@BCLRB\u0019\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB?\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u001aH\u0014¢\u0006\u0004\b'\u0010\u001cJ\u000f\u0010(\u001a\u00020\u001aH\u0014¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010)\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u0004H\u0004¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u001a¢\u0006\u0004\b8\u0010\u001cJ\u0019\u0010:\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b:\u00101J\u0019\u0010=\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010;H\u0004¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR$\u0010I\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010P\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010`\u001a\b\u0018\u00010]R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R$\u0010e\u001a\u00020#2\u0006\u0010K\u001a\u00020#8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010bR$\u0010j\u001a\u00020#2\u0006\u0010K\u001a\u00020#8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bh\u0010b\u001a\u0004\bi\u0010dR\u0018\u0010m\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006o"}, m87232d2 = {"Lcom/facebook/internal/WebDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "", "url", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", IntlMarketToken.theme, "(Landroid/content/Context;Ljava/lang/String;I)V", "action", "Landroid/os/Bundle;", "parameters", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "Lcom/facebook/internal/WebDialog$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/LoginTargetApp;Lcom/facebook/internal/WebDialog$d;)V", "screenSize", "", "density", "noPaddingSize", "maxPaddingSize", "q", "(IFII)I", "", "o", "()V", "margin", b2s.C_ZONE, "(I)V", "keyCode", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", SysnotifListener.ACTION_DISMISS, "onStart", "onStop", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/view/WindowManager$LayoutParams;", CommandMessage.PARAMS, "onWindowAttributesChanged", "(Landroid/view/WindowManager$LayoutParams;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "expectedRedirectUrl", "A", "(Ljava/lang/String;)V", "urlString", "w", "(Ljava/lang/String;)Landroid/os/Bundle;", BaseSei.f13930X, "values", BaseSei.f13932Z, "", "error", BaseSei.f13931Y, "(Ljava/lang/Throwable;)V", "cancel", "a", "Ljava/lang/String;", "b", "c", "Lcom/facebook/internal/WebDialog$d;", "getOnCompleteListener", "()Lcom/facebook/internal/WebDialog$d;", "B", "(Lcom/facebook/internal/WebDialog$d;)V", "onCompleteListener", "Landroid/webkit/WebView;", "<set-?>", Constants.INAPP_DATA_TAG, "Landroid/webkit/WebView;", "r", "()Landroid/webkit/WebView;", "webView", "Landroid/app/ProgressDialog;", "e", "Landroid/app/ProgressDialog;", "spinner", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "crossImageView", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "contentFrameLayout", "Lcom/facebook/internal/WebDialog$e;", "h", "Lcom/facebook/internal/WebDialog$e;", "uploadTask", RXScreenCaptureService.KEY_INDEX, "Z", Constants.KEY_T, "()Z", "isListenerCalled", "j", "isDetached", "k", "u", "isPageFinished", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/WindowManager$LayoutParams;", "windowParams", "Companion", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public class WebDialog extends Dialog {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final int f6618m = j8c0.f116708a;

    /* JADX INFO: renamed from: n */
    public static volatile int f6619n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String expectedRedirectUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1650d onCompleteListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public WebView webView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ProgressDialog spinner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ImageView crossImageView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public FrameLayout contentFrameLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public AsyncTaskC1651e uploadTask;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isListenerCalled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isDetached;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isPageFinished;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public WindowManager.LayoutParams windowParams;

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010!\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010'\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0014\u0010,\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0014\u0010-\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010$R\u0018\u0010.\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001d¨\u00061"}, m87232d2 = {"Lcom/facebook/internal/WebDialog$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "", "action", "Landroid/os/Bundle;", "parameters", "", IntlMarketToken.theme, "Lcom/facebook/internal/WebDialog$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/internal/WebDialog;", "c", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/internal/WebDialog$d;)Lcom/facebook/internal/WebDialog;", "Lcom/facebook/login/LoginTargetApp;", "targetApp", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILcom/facebook/login/LoginTargetApp;Lcom/facebook/internal/WebDialog$d;)Lcom/facebook/internal/WebDialog;", "a", "()I", "e", "(I)V", "API_EC_DIALOG_CANCEL", "I", "BACKGROUND_GRAY", "DEFAULT_THEME", "", "DISABLE_SSL_CHECK_FOR_TESTING", "Z", "DISPLAY_TOUCH", "Ljava/lang/String;", "LOG_TAG", "MAX_PADDING_SCREEN_HEIGHT", "MAX_PADDING_SCREEN_WIDTH", "", "MIN_SCALE_FACTOR", "D", "NO_PADDING_SCREEN_HEIGHT", "NO_PADDING_SCREEN_WIDTH", "PLATFORM_DIALOG_PATH_REGEX", "initCallback", "Ljava/lang/Object;", "webDialogTheme", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final int m8743a() {
            ark0.m98523l();
            return WebDialog.f6619n;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m8744b(@Nullable Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && WebDialog.f6619n == 0) {
                    m8747e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final WebDialog m8745c(@NotNull Context context, @Nullable String action, @Nullable Bundle parameters, int theme, @Nullable InterfaceC1650d listener) {
            context.getClass();
            WebDialog.m8721s(context);
            return new WebDialog(context, action, parameters, theme, LoginTargetApp.FACEBOOK, listener, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final WebDialog m8746d(@NotNull Context context, @Nullable String action, @Nullable Bundle parameters, int theme, @NotNull LoginTargetApp targetApp, @Nullable InterfaceC1650d listener) {
            context.getClass();
            targetApp.getClass();
            WebDialog.m8721s(context);
            return new WebDialog(context, action, parameters, theme, targetApp, listener, null);
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final void m8747e(int theme) {
            if (theme == 0) {
                theme = WebDialog.f6618m;
            }
            WebDialog.f6619n = theme;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$c */
    @Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m87232d2 = {"Lcom/facebook/internal/WebDialog$c;", "Landroid/webkit/WebViewClient;", "<init>", "(Lcom/facebook/internal/WebDialog;)V", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "url", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "", "errorCode", "description", "failingUrl", "", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public final class C1649c extends WebViewClient {
        final /* synthetic */ WebDialog this$0;

        public C1649c(WebDialog webDialog) {
            webDialog.getClass();
            this.this$0 = webDialog;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NotNull WebView view, @NotNull String url) {
            ProgressDialog progressDialog;
            view.getClass();
            url.getClass();
            super.onPageFinished(view, url);
            if (!this.this$0.isDetached && (progressDialog = this.this$0.spinner) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.this$0.contentFrameLayout;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webView = this.this$0.getWebView();
            if (webView != null) {
                webView.setVisibility(0);
            }
            ImageView imageView = this.this$0.crossImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.this$0.isPageFinished = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NotNull WebView view, @NotNull String url, @Nullable Bitmap favicon) {
            ProgressDialog progressDialog;
            view.getClass();
            url.getClass();
            C1657e c1657e = C1657e.INSTANCE;
            C1657e.m8844j0("FacebookSDK.WebDialog", Intrinsics.m87496l("Webview loading URL: ", url));
            super.onPageStarted(view, url, favicon);
            if (this.this$0.isDetached || (progressDialog = this.this$0.spinner) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NotNull WebView view, int errorCode, @NotNull String description, @NotNull String failingUrl) {
            view.getClass();
            description.getClass();
            failingUrl.getClass();
            super.onReceivedError(view, errorCode, description, failingUrl);
            this.this$0.m8733y(new FacebookDialogException(description, errorCode, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
            view.getClass();
            handler.getClass();
            error.getClass();
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.this$0.m8733y(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
            int i;
            view.getClass();
            url.getClass();
            C1657e c1657e = C1657e.INSTANCE;
            C1657e.m8844j0("FacebookSDK.WebDialog", Intrinsics.m87496l("Redirect URL: ", url));
            Uri uri = Uri.parse(url);
            boolean z = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            if (!C15386d.m93483J(url, this.this$0.expectedRedirectUrl, false, 2, null)) {
                if (C15386d.m93483J(url, "fbconnect://cancel", false, 2, null)) {
                    this.this$0.cancel();
                    return true;
                }
                if (!z && !StringsKt.m93412P(url, "touch", false, 2, null)) {
                    try {
                        this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle bundleMo8731w = this.this$0.mo8731w(url);
            String string = bundleMo8731w.getString("error");
            if (string == null) {
                string = bundleMo8731w.getString("error_type");
            }
            String string2 = bundleMo8731w.getString("error_msg");
            if (string2 == null) {
                string2 = bundleMo8731w.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleMo8731w.getString("error_description");
            }
            String string3 = bundleMo8731w.getString(StateEvent.Name.ERROR_CODE);
            if (string3 == null || C1657e.m8832c0(string3)) {
                i = -1;
            } else {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
            }
            if (C1657e.m8832c0(string) && C1657e.m8832c0(string2) && i == -1) {
                this.this$0.m8734z(bundleMo8731w);
            } else if ((string == null || !(Intrinsics.m87488d(string, "access_denied") || Intrinsics.m87488d(string, "OAuthAccessDeniedException"))) && i != 4201) {
                this.this$0.m8733y(new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
            } else {
                this.this$0.cancel();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$d */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/internal/WebDialog$d;", "", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "", "a", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public interface InterfaceC1650d {
        /* JADX INFO: renamed from: a */
        void mo8748a(@Nullable Bundle values, @Nullable FacebookException error);
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$e */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003\"\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R$\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00150\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Lcom/facebook/internal/WebDialog$e;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "", "action", "Landroid/os/Bundle;", "parameters", "<init>", "(Lcom/facebook/internal/WebDialog;Ljava/lang/String;Landroid/os/Bundle;)V", "p0", "b", "([Ljava/lang/Void;)[Ljava/lang/String;", "results", "", Constants.INAPP_DATA_TAG, "([Ljava/lang/String;)V", "a", "Ljava/lang/String;", "Landroid/os/Bundle;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "c", "[Ljava/lang/Exception;", "exceptions", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public final class AsyncTaskC1651e extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Bundle parameters;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public Exception[] exceptions;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ WebDialog f6642d;

        public AsyncTaskC1651e(@NotNull WebDialog webDialog, @NotNull String str, Bundle bundle) {
            webDialog.getClass();
            str.getClass();
            bundle.getClass();
            this.f6642d = webDialog;
            this.action = str;
            this.parameters = bundle;
            this.exceptions = new Exception[0];
        }

        /* JADX INFO: renamed from: c */
        public static final void m8750c(String[] strArr, int i, AsyncTaskC1651e asyncTaskC1651e, CountDownLatch countDownLatch, GraphResponse graphResponse) {
            strArr.getClass();
            asyncTaskC1651e.getClass();
            countDownLatch.getClass();
            graphResponse.getClass();
            try {
                FacebookRequestError error = graphResponse.getError();
                String str = "Error staging photo.";
                if (error != null) {
                    String strM7496c = error.m7496c();
                    if (strM7496c != null) {
                        str = strM7496c;
                    }
                    throw new FacebookGraphResponseException(graphResponse, str);
                }
                JSONObject graphObject = graphResponse.getGraphObject();
                if (graphObject == null) {
                    throw new FacebookException("Error staging photo.");
                }
                String strOptString = graphObject.optString("uri");
                if (strOptString == null) {
                    throw new FacebookException("Error staging photo.");
                }
                strArr[i] = strOptString;
                countDownLatch.countDown();
            } catch (Exception e) {
                asyncTaskC1651e.exceptions[i] = e;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public String[] m8751b(@NotNull Void... p0) {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                if (lsb.m151554d(this)) {
                    return null;
                }
                try {
                    p0.getClass();
                    String[] stringArray = this.parameters.getStringArray("media");
                    if (stringArray == null) {
                        return null;
                    }
                    final String[] strArr = new String[stringArray.length];
                    this.exceptions = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    AccessToken accessTokenM7436e = AccessToken.INSTANCE.m7436e();
                    try {
                        int length = stringArray.length - 1;
                        if (length >= 0) {
                            final int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (isCancelled()) {
                                    Iterator it = concurrentLinkedQueue.iterator();
                                    while (it.hasNext()) {
                                        ((AsyncTaskC1591d) it.next()).cancel(true);
                                    }
                                    return null;
                                }
                                Uri uri = Uri.parse(stringArray[i]);
                                if (C1657e.m8835e0(uri)) {
                                    strArr[i] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    GraphRequest.InterfaceC1516b interfaceC1516b = new GraphRequest.InterfaceC1516b() { // from class: l.yhp0
                                        @Override // com.facebook.GraphRequest.InterfaceC1516b
                                        /* JADX INFO: renamed from: a */
                                        public final void mo7548a(GraphResponse graphResponse) {
                                            WebDialog.AsyncTaskC1651e.m8750c(strArr, i, this, countDownLatch, graphResponse);
                                        }
                                    };
                                    due0 due0Var = due0.INSTANCE;
                                    uri.getClass();
                                    concurrentLinkedQueue.add(due0.m113685a(accessTokenM7436e, uri, interfaceC1516b).m7526k());
                                }
                                if (i2 <= length) {
                                    i = i2;
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((AsyncTaskC1591d) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    lsb.m151552b(th, this);
                    return null;
                }
            } catch (Throwable th2) {
                lsb.m151552b(th2, this);
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m8752d(@Nullable String[] results) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                if (lsb.m151554d(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = this.f6642d.spinner;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    Exception[] excArr = this.exceptions;
                    int length = excArr.length;
                    int i = 0;
                    while (i < length) {
                        Exception exc = excArr[i];
                        i++;
                        if (exc != null) {
                            this.f6642d.m8733y(exc);
                            return;
                        }
                    }
                    if (results == null) {
                        this.f6642d.m8733y(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List listAsList = ArraysKt.asList(results);
                    if (listAsList.contains(null)) {
                        this.f6642d.m8733y(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    C1657e c1657e = C1657e.INSTANCE;
                    C1657e.m8855p0(this.parameters, "media", new JSONArray((Collection) listAsList));
                    this.f6642d.url = C1657e.m8838g(fje0.m121581b(), C1577c.m8059x() + "/dialog/" + this.action, this.parameters).toString();
                    ImageView imageView = this.f6642d.crossImageView;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this.f6642d.m8725C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    lsb.m151552b(th, this);
                }
            } catch (Throwable th2) {
                lsb.m151552b(th2, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String[]] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                if (lsb.m151554d(this)) {
                    return null;
                }
                try {
                    this = m8751b(voidArr);
                    return this;
                } catch (Throwable th) {
                    lsb.m151552b(th, this);
                    return null;
                }
            } catch (Throwable th2) {
                lsb.m151552b(th2, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                if (lsb.m151554d(this)) {
                    return;
                }
                try {
                    m8752d(strArr);
                } catch (Throwable th) {
                    lsb.m151552b(th, this);
                }
            } catch (Throwable th2) {
                lsb.m151552b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$f */
    @Metadata(m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
    public /* synthetic */ class C1652f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6643a;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            f6643a = iArr;
        }
    }

    public WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, InterfaceC1650d interfaceC1650d) {
        Uri uriM8838g;
        super(context, i == 0 ? INSTANCE.m8743a() : i);
        this.expectedRedirectUrl = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = C1657e.m8825W(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.expectedRedirectUrl = str2;
        bundle.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, str2);
        bundle.putString(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "touch");
        bundle.putString("client_id", C1577c.m8048m());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{C1577c.m8024C()}, 1)));
        this.onCompleteListener = interfaceC1650d;
        if (Intrinsics.m87488d(str, "share") && bundle.containsKey("media")) {
            this.uploadTask = new AsyncTaskC1651e(this, str, bundle);
            return;
        }
        if (C1652f.f6643a[loginTargetApp.ordinal()] == 1) {
            uriM8838g = C1657e.m8838g(fje0.m121590k(), "oauth/authorize", bundle);
        } else {
            uriM8838g = C1657e.m8838g(fje0.m121581b(), C1577c.m8059x() + "/dialog/" + ((Object) str), bundle);
        }
        this.url = uriM8838g.toString();
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m8705D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static final void m8720p(WebDialog webDialog, View view) {
        webDialog.getClass();
        webDialog.cancel();
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m8721s(@Nullable Context context) {
        INSTANCE.m8744b(context);
    }

    /* JADX INFO: renamed from: v */
    public static final void m8722v(WebDialog webDialog, DialogInterface dialogInterface) {
        webDialog.getClass();
        webDialog.cancel();
    }

    /* JADX INFO: renamed from: A */
    public final void m8723A(@NotNull String expectedRedirectUrl) {
        expectedRedirectUrl.getClass();
        this.expectedRedirectUrl = expectedRedirectUrl;
    }

    /* JADX INFO: renamed from: B */
    public final void m8724B(@Nullable InterfaceC1650d interfaceC1650d) {
        this.onCompleteListener = interfaceC1650d;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: C */
    public final void m8725C(int margin) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        final Context context = getContext();
        WebView webView = new WebView(context) { // from class: com.facebook.internal.WebDialog$setUpWebView$1
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean hasWindowFocus) {
                try {
                    super.onWindowFocusChanged(hasWindowFocus);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.webView = webView;
        webView.setVerticalScrollBarEnabled(false);
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setWebViewClient(new C1649c(this));
        }
        WebView webView4 = this.webView;
        WebSettings settings = webView4 == null ? null : webView4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.webView;
        if (webView5 != null) {
            String str = this.url;
            if (str == null) {
                qkq0.m175383a("Required value was null.");
                return;
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.webView;
        WebSettings settings2 = webView8 == null ? null : webView8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.webView;
        WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView10 = this.webView;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: l.vhp0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return WebDialog.m8705D(view, motionEvent);
                }
            });
        }
        linearLayout.setPadding(margin, margin, margin, margin);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        m8733y(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public final void m8726o() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.xhp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebDialog.m8720p(this.f192902a, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(r3c0.f157521b);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.isDetached = false;
        C1657e c1657e = C1657e.INSTANCE;
        Context context = getContext();
        context.getClass();
        if (C1657e.m8851n0(context) && (layoutParams = this.windowParams) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                C1657e.m8844j0("FacebookSDK.WebDialog", Intrinsics.m87496l("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R$string.f6255d));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.whp0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    WebDialog.m8722v(this.f186460a, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        m8732x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        m8726o();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView == null) {
                qkq0.m175383a("Required value was null.");
                return;
            }
            m8725C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            qkq0.m175383a("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        event.getClass();
        if (keyCode == 4) {
            WebView webView = this.webView;
            if (webView != null) {
                if (Intrinsics.m87488d(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.webView;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        AsyncTaskC1651e asyncTaskC1651e = this.uploadTask;
        if (asyncTaskC1651e != null) {
            if ((asyncTaskC1651e == null ? null : asyncTaskC1651e.getStatus()) == AsyncTask.Status.PENDING) {
                AsyncTaskC1651e asyncTaskC1651e2 = this.uploadTask;
                if (asyncTaskC1651e2 != null) {
                    asyncTaskC1651e2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        m8732x();
    }

    @Override // android.app.Dialog
    public void onStop() {
        AsyncTaskC1651e asyncTaskC1651e = this.uploadTask;
        if (asyncTaskC1651e != null) {
            asyncTaskC1651e.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(@NotNull WindowManager.LayoutParams params) {
        params.getClass();
        if (params.token == null) {
            this.windowParams = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX INFO: renamed from: q */
    public final int m8727q(int screenSize, float density, int noPaddingSize, int maxPaddingSize) {
        double d;
        int i = (int) (screenSize / density);
        if (i <= noPaddingSize) {
            d = 1.0d;
        } else {
            d = i >= maxPaddingSize ? 0.5d : ((((double) (maxPaddingSize - i)) / ((double) (maxPaddingSize - noPaddingSize))) * 0.5d) + 0.5d;
        }
        return (int) (((double) screenSize) * d);
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsListenerCalled() {
        return this.isListenerCalled;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsPageFinished() {
        return this.isPageFinished;
    }

    @VisibleForTesting(otherwise = 4)
    @NotNull
    /* JADX INFO: renamed from: w */
    public Bundle mo8731w(@Nullable String urlString) {
        Uri uri = Uri.parse(urlString);
        C1657e c1657e = C1657e.INSTANCE;
        Bundle bundleM8853o0 = C1657e.m8853o0(uri.getQuery());
        bundleM8853o0.putAll(C1657e.m8853o0(uri.getFragment()));
        return bundleM8853o0;
    }

    /* JADX INFO: renamed from: x */
    public final void m8732x() {
        Object systemService = getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (systemService == null) {
            jfd0.m141176a("null cannot be cast to non-null type android.view.WindowManager");
            return;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(m8727q(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(m8727q(i, displayMetrics.density, 800, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(iMin, iMin2);
    }

    /* JADX INFO: renamed from: y */
    public final void m8733y(@Nullable Throwable error) {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        FacebookException facebookException = error instanceof FacebookException ? (FacebookException) error : new FacebookException(error);
        InterfaceC1650d interfaceC1650d = this.onCompleteListener;
        if (interfaceC1650d != null) {
            interfaceC1650d.mo8748a(null, facebookException);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final void m8734z(@Nullable Bundle values) {
        InterfaceC1650d interfaceC1650d = this.onCompleteListener;
        if (interfaceC1650d == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        if (interfaceC1650d != null) {
            interfaceC1650d.mo8748a(values, null);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: com.facebook.internal.WebDialog$a */
    @Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\tR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R$\u0010 \u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006*"}, m87232d2 = {"Lcom/facebook/internal/WebDialog$a;", "", "Landroid/content/Context;", "context", "", "action", "Landroid/os/Bundle;", "parameters", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "applicationId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/facebook/internal/WebDialog$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "h", "(Lcom/facebook/internal/WebDialog$d;)Lcom/facebook/internal/WebDialog$a;", "Lcom/facebook/internal/WebDialog;", "a", "()Lcom/facebook/internal/WebDialog;", "", "b", "<set-?>", "Landroid/content/Context;", Constants.INAPP_DATA_TAG, "()Landroid/content/Context;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "", "I", "g", "()I", IntlMarketToken.theme, "e", "Lcom/facebook/internal/WebDialog$d;", "()Lcom/facebook/internal/WebDialog$d;", "f", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "Lcom/facebook/AccessToken;", "Lcom/facebook/AccessToken;", "accessToken", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public static class C1647a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String applicationId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int theme;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public InterfaceC1650d listener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public Bundle parameters;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public AccessToken accessToken;

        public C1647a(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
            context.getClass();
            str.getClass();
            AccessToken.Companion companion = AccessToken.INSTANCE;
            this.accessToken = companion.m7436e();
            if (!companion.m7438g()) {
                String strM8817J = C1657e.m8817J(context);
                if (strM8817J == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.applicationId = strM8817J;
            }
            m8736b(context, str, bundle);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public WebDialog mo8735a() {
            AccessToken accessToken = this.accessToken;
            Bundle bundle = this.parameters;
            if (accessToken != null) {
                if (bundle != null) {
                    bundle.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, accessToken == null ? null : accessToken.getApplicationId());
                }
                Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.accessToken;
                    bundle2.putString("access_token", accessToken2 == null ? null : accessToken2.getToken());
                }
            } else if (bundle != null) {
                bundle.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, this.applicationId);
            }
            Companion companion = WebDialog.INSTANCE;
            Context context = this.context;
            if (context != null) {
                return companion.m8745c(context, this.action, this.parameters, this.theme, this.listener);
            }
            qkq0.m175383a("Required value was null.");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final void m8736b(Context context, String action, Bundle parameters) {
            this.context = context;
            this.action = action;
            if (parameters != null) {
                this.parameters = parameters;
            } else {
                this.parameters = new Bundle();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC1650d getListener() {
            return this.listener;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Bundle getParameters() {
            return this.parameters;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getTheme() {
            return this.theme;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C1647a m8742h(@Nullable InterfaceC1650d listener) {
            this.listener = listener;
            return this;
        }

        public C1647a(@NotNull Context context, @Nullable String str, @NotNull String str2, @Nullable Bundle bundle) {
            context.getClass();
            str2.getClass();
            this.applicationId = ark0.m98522k(str == null ? C1657e.m8817J(context) : str, "applicationId");
            m8736b(context, str2, bundle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebDialog(@NotNull Context context, @NotNull String str) {
        this(context, str, INSTANCE.m8743a());
        context.getClass();
        str.getClass();
    }

    public WebDialog(Context context, String str, int i) {
        super(context, i == 0 ? INSTANCE.m8743a() : i);
        this.expectedRedirectUrl = "fbconnect://success";
        this.url = str;
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, InterfaceC1650d interfaceC1650d, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, interfaceC1650d);
    }
}
