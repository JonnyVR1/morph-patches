package com.p051p1.mobile.putong.p070ui.sign;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p051p1.mobile.putong.p070ui.sign.TencentSignActivity;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tencent.open.SocialConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.b9c0;
import p153l.bnl0;
import p153l.cop0;
import p153l.j26;
import p153l.lhl;
import p153l.mai0;
import p153l.o1j0;
import p153l.psd0;
import p153l.v40;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J#\u0010!\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0003J)\u0010$\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-R\u001c\u00101\u001a\b\u0018\u00010.R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010A\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u0015\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\u0018\u0010H\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006P"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "g2", "initSubscription", "Landroid/os/Bundle;", "savedInstanceState", "preCreateView", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", Permissions.TYPE, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "k2", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "url", "", "l2", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "i2", "h2", "trtc", "m2", "(Z)V", "d2", "(I)V", "o2", "permission", "c2", "(Ljava/lang/String;)I", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$b;", "c", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$b;", "webChromeClient", Constants.INAPP_DATA_TAG, "Landroid/webkit/WebView;", "getMWebView", "()Landroid/webkit/WebView;", "setMWebView", "(Landroid/webkit/WebView;)V", "mWebView", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "e", "Landroid/webkit/ValueCallback;", "getUploadMessage", "()Landroid/webkit/ValueCallback;", "setUploadMessage", "(Landroid/webkit/ValueCallback;)V", "uploadMessage", "f", "e2", "n2", "uploadMessageAboveL", "g", "Ljava/lang/String;", "curUrl", "Landroid/app/AlertDialog;", "h", "Landroid/app/AlertDialog;", OMSTemplateType.dialog, "Companion", "a", "b", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TencentSignActivity extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public C13300b webChromeClient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public WebView mWebView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ValueCallback<Uri> uploadMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ValueCallback<Uri[]> uploadMessageAboveL;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String curUrl = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public AlertDialog dialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.sign.TencentSignActivity$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "title", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "", "PERMISSION_QUEST_TRTC_CAMERA_VERIFY", "I", "PERMISSION_QUEST_OLD_CAMERA_VERIFY", "REQUEST_PERMISSION_STORAGE", "FILE_CHOOSER_RESULT_CODE", "RECORD_VIDEO_REQUEST_CODE", "EXTRA_TITLE", "Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m81222a(@NotNull Context context, @NotNull String url, @NotNull String title) {
            context.getClass();
            url.getClass();
            title.getClass();
            Intent intent = new Intent(context, (Class<?>) TencentSignActivity.class);
            intent.putExtra("url", url);
            intent.putExtra("title", title);
            return intent;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.sign.TencentSignActivity$b */
    @Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010&\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000b2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103¨\u00064"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$b;", "Landroid/webkit/WebChromeClient;", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;", "activity", "<init>", "(Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;)V", "Landroid/content/Context;", "context", "", "openFileInput", "(Landroid/content/Context;)V", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "url", "message", "defaultValue", "Landroid/webkit/JsPromptResult;", LovePlanetStage.result, "", "onJsPrompt", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z", "Landroid/webkit/JsResult;", "onJsConfirm", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "Landroid/webkit/PermissionRequest;", SocialConstants.TYPE_REQUEST, "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "enterTrtcFaceVerify", "()V", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "enterOldModeFaceVerify", "()Z", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;", "Landroid/webkit/PermissionRequest;", "Landroid/webkit/WebView;", "acceptType", "Ljava/lang/String;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SuppressLint({"WebViewUseError"})
    public final class C13300b extends WebChromeClient {

        @Nullable
        private String acceptType;

        @Nullable
        private final TencentSignActivity activity;

        @Nullable
        private WebChromeClient.FileChooserParams fileChooserParams;

        @Nullable
        private PermissionRequest request;

        @Nullable
        private WebView webView;

        public C13300b(TencentSignActivity tencentSignActivity) {
            this.activity = tencentSignActivity;
        }

        private final void openFileInput(Context context) {
            TencentSignActivity tencentSignActivity;
            if (j26.m143188a(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                TencentSignActivity tencentSignActivity2 = this.activity;
                if (tencentSignActivity2 != null) {
                    v40.m199644u(tencentSignActivity2, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
                    return;
                }
                return;
            }
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            if (intent.resolveActivity(context.getPackageManager()) == null || (tencentSignActivity = this.activity) == null) {
                return;
            }
            tencentSignActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 10000);
        }

        public final boolean enterOldModeFaceVerify() {
            return cop0.m111675a().m111679e(this.webView, TencentSignActivity.this.m81214e2(), this.activity, this.fileChooserParams);
        }

        public final void enterTrtcFaceVerify() {
            WebView webView;
            WebView webView2;
            PermissionRequest permissionRequest = this.request;
            Uri origin = permissionRequest != null ? permissionRequest.getOrigin() : null;
            PermissionRequest permissionRequest2 = this.request;
            if (origin != null) {
                if (permissionRequest2 != null) {
                    permissionRequest2.grant(permissionRequest2 != null ? permissionRequest2.getResources() : null);
                }
                PermissionRequest permissionRequest3 = this.request;
                if (permissionRequest3 != null) {
                    permissionRequest3.getOrigin();
                    return;
                }
                return;
            }
            if (permissionRequest2 != null || (webView = this.webView) == null || !webView.canGoBack() || (webView2 = this.webView) == null) {
                return;
            }
            webView2.goBack();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(@NotNull WebView view, @NotNull String url, @NotNull String message, @NotNull JsResult result) {
            view.getClass();
            url.getClass();
            message.getClass();
            result.getClass();
            result.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(@NotNull WebView view, @NotNull String url, @NotNull String message, @NotNull String defaultValue, @NotNull JsPromptResult result) {
            view.getClass();
            url.getClass();
            message.getClass();
            defaultValue.getClass();
            result.getClass();
            return super.onJsPrompt(view, url, message, defaultValue, result);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(@NotNull PermissionRequest request) {
            request.getClass();
            this.request = request;
            TencentSignActivity tencentSignActivity = this.activity;
            if (tencentSignActivity != null) {
                tencentSignActivity.m81219m2(true);
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            webView.getClass();
            filePathCallback.getClass();
            fileChooserParams.getClass();
            this.webView = webView;
            TencentSignActivity.this.m81220n2(filePathCallback);
            this.fileChooserParams = fileChooserParams;
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            acceptTypes.getClass();
            boolean z = false;
            for (String str : acceptTypes) {
                str.getClass();
                if (StringsKt.m94303P(str, "video", false, 2, null)) {
                    z = true;
                }
            }
            if (z) {
                TencentSignActivity.this.m81219m2(false);
                return true;
            }
            Context context = webView.getContext();
            context.getClass();
            openFileInput(context);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.sign.TencentSignActivity$c */
    @Metadata(m88120d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"com/p1/mobile/putong/ui/sign/TencentSignActivity$c", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "Landroid/webkit/WebResourceRequest;", SocialConstants.TYPE_REQUEST, "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "webView", "webResourceRequest", "Landroid/webkit/WebResourceError;", "webResourceError", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SuppressLint({"WebViewUseError"})
    public static final class C13301c extends WebViewClient {
        public C13301c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            Objects.toString(webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Uri url;
            return TencentSignActivity.this.m81218l2(view, (request == null || (url = request.getUrl()) == null) ? null : url.toString());
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static void m81206X1(TencentSignActivity tencentSignActivity, C4470c c4470c) {
        AlertDialog alertDialog;
        if (Intrinsics.m88377d(c4470c, C4470c.f16267i)) {
            WebView webView = tencentSignActivity.mWebView;
            if (webView != null) {
                webView.onResume();
                return;
            }
            return;
        }
        if (Intrinsics.m88377d(c4470c, C4470c.f16268j)) {
            WebView webView2 = tencentSignActivity.mWebView;
            if (webView2 != null) {
                webView2.onPause();
                return;
            }
            return;
        }
        if (Intrinsics.m88377d(c4470c, C4470c.f16269k)) {
            WebView webView3 = tencentSignActivity.mWebView;
            if (webView3 != null) {
                webView3.stopLoading();
                return;
            }
            return;
        }
        if (Intrinsics.m88377d(c4470c, C4470c.f16271m)) {
            try {
                WebView webView4 = tencentSignActivity.mWebView;
                if (webView4 != null) {
                    webView4.removeAllViews();
                }
                WebView webView5 = tencentSignActivity.mWebView;
                if (webView5 != null) {
                    webView5.destroy();
                }
            } catch (Exception unused) {
            }
            AlertDialog alertDialog2 = tencentSignActivity.dialog;
            if (alertDialog2 != null && alertDialog2.isShowing() && (alertDialog = tencentSignActivity.dialog) != null) {
                alertDialog.dismiss();
            }
            tencentSignActivity.dialog = null;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m81207Y1(TencentSignActivity tencentSignActivity, DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = tencentSignActivity.dialog;
        if (alertDialog2 != null && alertDialog2.isShowing() && (alertDialog = tencentSignActivity.dialog) != null) {
            alertDialog.dismiss();
        }
        tencentSignActivity.dialog = null;
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m81208Z1(TencentSignActivity tencentSignActivity, int i, DialogInterface dialogInterface, int i2) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = tencentSignActivity.dialog;
        if (alertDialog2 != null && alertDialog2.isShowing() && (alertDialog = tencentSignActivity.dialog) != null) {
            alertDialog.dismiss();
        }
        tencentSignActivity.dialog = null;
        tencentSignActivity.m81213d2(i);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: g2 */
    private final void m81211g2() {
        cop0.m111675a().m111680f(this.mWebView, this);
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.setWebViewClient(new C13301c());
        }
        C13300b c13300b = new C13300b(this);
        this.webChromeClient = c13300b;
        WebView webView2 = this.mWebView;
        if (webView2 != null) {
            webView2.setWebChromeClient(c13300b);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final int m81212c2(String permission) {
        return j26.m143188a(this, permission);
    }

    /* JADX INFO: renamed from: d2 */
    public final void m81213d2(int requestCode) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getApplicationContext().getPackageName(), null));
        if (getPackageManager().resolveActivity(intent, 0) != null) {
            startActivityForResult(intent, requestCode);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e2 */
    public final ValueCallback<Uri[]> m81214e2() {
        return this.uploadMessageAboveL;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: h2 */
    public final void m81215h2(int requestCode, int resultCode, Intent intent) {
        Uri[] uriArr;
        if (this.uploadMessageAboveL == null) {
            return;
        }
        if (resultCode != -1 || intent == null) {
            uriArr = null;
        } else {
            String dataString = intent.getDataString();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                uriArr = new Uri[itemCount];
                for (int i = 0; i < itemCount; i++) {
                    Uri uri = clipData.getItemAt(i).getUri();
                    uri.getClass();
                    uriArr[i] = uri;
                }
            } else {
                uriArr = null;
            }
            if (dataString != null) {
                Uri uri2 = Uri.parse(dataString);
                uri2.getClass();
                uriArr = new Uri[]{uri2};
            }
        }
        ValueCallback<Uri[]> valueCallback = this.uploadMessageAboveL;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
        }
        this.uploadMessageAboveL = null;
    }

    /* JADX INFO: renamed from: i2 */
    public final void m81216i2() {
        ValueCallback<Uri> valueCallback = this.uploadMessage;
        if (valueCallback == null && this.uploadMessageAboveL == null) {
            return;
        }
        if (valueCallback != null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            this.uploadMessage = null;
        }
        ValueCallback<Uri[]> valueCallback2 = this.uploadMessageAboveL;
        if (valueCallback2 != null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            this.uploadMessageAboveL = null;
        }
        ValueCallback<Uri[]> valueCallback3 = this.uploadMessageAboveL;
        if (valueCallback3 != null) {
            if (valueCallback3 != null) {
                valueCallback3.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(-1, null));
            }
            this.uploadMessageAboveL = null;
        } else {
            ValueCallback<Uri> valueCallback4 = this.uploadMessage;
            if (valueCallback4 != null) {
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(null);
                }
                this.uploadMessage = null;
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.gqi0
            @Override // p153l.y20
            public final void call(Object obj) {
                TencentSignActivity.m81206X1(this.f105684a, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final void m81217k2() {
        WebView webView;
        String stringExtra = getIntent().getStringExtra("url");
        this.curUrl = stringExtra;
        if (stringExtra == null || (webView = this.mWebView) == null) {
            return;
        }
        webView.loadUrl(stringExtra);
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m81218l2(WebView view, String url) {
        if (url == null) {
            return false;
        }
        Uri uri = Uri.parse(url);
        uri.getClass();
        uri.getScheme();
        if (StringsKt.m94303P(url, "m.tantanapp.com", false, 2, null) || StringsKt.m94303P(url, lhl.INSTANCE.m154222o("m.tantanapp.com"), false, 2, null) || StringsKt.m94303P(url, "m.staging2.p1staff.com", false, 2, null)) {
            Intent intentM81347a2 = WebViewAct.m81347a2(this, getTitle().toString(), url);
            mai0.m157686a0(intentM81347a2, url);
            startActivity(intentM81347a2);
            m68056e2();
            return true;
        }
        if (!Intrinsics.m88377d(uri.getScheme(), "http") && !Intrinsics.m88377d(uri.getScheme(), "https")) {
            return false;
        }
        if (view != null) {
            view.loadUrl(url);
        }
        return true;
    }

    /* JADX INFO: renamed from: m2 */
    public final void m81219m2(boolean trtc) {
        if (m81212c2("android.permission.CAMERA") != 0) {
            if (trtc) {
                v40.m199644u(this, new String[]{"android.permission.CAMERA"}, 12);
                return;
            } else {
                v40.m199644u(this, new String[]{"android.permission.CAMERA"}, 11);
                return;
            }
        }
        C13300b c13300b = this.webChromeClient;
        if (trtc) {
            if (c13300b != null) {
                c13300b.enterTrtcFaceVerify();
            }
        } else if (c13300b != null) {
            c13300b.enterOldModeFaceVerify();
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m81220n2(@Nullable ValueCallback<Uri[]> valueCallback) {
        this.uploadMessageAboveL = valueCallback;
    }

    /* JADX INFO: renamed from: o2 */
    public final void m81221o2(final int requestCode) {
        this.dialog = new AlertDialog.Builder(this).setTitle("权限申请提示").setMessage("请前往设置->应用->权限中打开相关权限，否则功能无法正常运行！").setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: l.hqi0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TencentSignActivity.m81208Z1(this.f111129a, requestCode, dialogInterface, i);
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: l.iqi0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TencentSignActivity.m81207Y1(this.f116418a, dialogInterface, i);
            }
        }).setCancelable(false).show();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1 || data == null || data.getData() == null) {
            m81216i2();
            return;
        }
        if (requestCode == 11) {
            m81219m2(false);
            return;
        }
        if (requestCode == 12) {
            m81219m2(true);
            return;
        }
        if (requestCode == 17) {
            cop0.m111675a().m111677c(requestCode, resultCode, data);
            return;
        }
        if (requestCode == 2002) {
            Uri data2 = data.getData();
            Uri[] uriArr = data2 != null ? new Uri[]{data2} : null;
            ValueCallback<Uri[]> valueCallback = this.uploadMessageAboveL;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                return;
            }
            return;
        }
        if (requestCode != 10000) {
            return;
        }
        if (this.uploadMessage == null && this.uploadMessageAboveL == null) {
            return;
        }
        Uri data3 = resultCode != -1 ? null : data.getData();
        if (this.uploadMessageAboveL != null) {
            m81215h2(requestCode, resultCode, data);
            return;
        }
        ValueCallback<Uri> valueCallback2 = this.uploadMessage;
        if (valueCallback2 != null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(data3);
            }
            this.uploadMessage = null;
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m81217k2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m81216i2();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 11) {
            if (grantResults.length == 0) {
                return;
            }
            if (grantResults[0] != 0) {
                m81221o2(11);
                o1j0.m165636j("因拒绝授予权限，请5秒后再试");
                return;
            } else {
                C13300b c13300b = this.webChromeClient;
                if (c13300b != null) {
                    c13300b.enterOldModeFaceVerify();
                    return;
                }
                return;
            }
        }
        if (requestCode != 12) {
            return;
        }
        if (grantResults.length == 0) {
            return;
        }
        if (grantResults[0] != 0) {
            m81221o2(12);
            o1j0.m165636j("因拒绝授予权限，请5秒后再试");
        } else {
            C13300b c13300b2 = this.webChromeClient;
            if (c13300b2 != null) {
                c13300b2.enterTrtcFaceVerify();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    @SuppressLint({"WebViewUseError"})
    public void preCreateView(@Nullable Bundle savedInstanceState) {
        this.mWebView = new WebView(this);
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "合同签署";
        }
        setTitle(stringExtra, false);
        setSwipeBackEnable(false);
        WebView webView = this.mWebView;
        int i = bnl0.f77544e;
        setContentView(webView, new ViewGroup.LayoutParams(i, i));
        setStatusBarColorResId(b9c0.f75570p);
        setLightStatusBar(16);
        m81211g2();
        m81217k2();
    }
}
