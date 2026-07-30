package com.p000p1.mobile.putong.p004ui.sign;

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
import com.p000p1.mobile.putong.p004ui.sign.TencentSignActivity;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.b50;
import l.e16;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.v0c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.d2i0;
import p009l.yep0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J#\u0010!\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0003J)\u0010$\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-R\u001c\u00101\u001a\b\u0018\u00010.R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010A\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u0015\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\u0018\u0010H\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "e2", "initSubscription", "Landroid/os/Bundle;", "savedInstanceState", "preCreateView", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "i2", "Landroid/webkit/WebView;", "view", "url", "", "k2", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "h2", "g2", "trtc", "l2", "(Z)V", "c2", "(I)V", "n2", "permission", "b2", "(Ljava/lang/String;)I", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$b;", "c", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$b;", "webChromeClient", "d", "Landroid/webkit/WebView;", "getMWebView", "()Landroid/webkit/WebView;", "setMWebView", "(Landroid/webkit/WebView;)V", "mWebView", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "e", "Landroid/webkit/ValueCallback;", "getUploadMessage", "()Landroid/webkit/ValueCallback;", "setUploadMessage", "(Landroid/webkit/ValueCallback;)V", "uploadMessage", "f", "d2", "m2", "uploadMessageAboveL", "g", "Ljava/lang/String;", "curUrl", "Landroid/app/AlertDialog;", "h", "Landroid/app/AlertDialog;", "dialog", "Companion", "a", "b", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class TencentSignActivity extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public C0539b webChromeClient;

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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "title", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "", "PERMISSION_QUEST_TRTC_CAMERA_VERIFY", "I", "PERMISSION_QUEST_OLD_CAMERA_VERIFY", "REQUEST_PERMISSION_STORAGE", "FILE_CHOOSER_RESULT_CODE", "RECORD_VIDEO_REQUEST_CODE", "EXTRA_TITLE", "Ljava/lang/String;", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m10368a(@NotNull Context context, @NotNull String url, @NotNull String title) {
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
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010&\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u000b2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103¨\u00064"}, d2 = {"Lcom/p1/mobile/putong/ui/sign/TencentSignActivity$b;", "Landroid/webkit/WebChromeClient;", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;", "activity", "<init>", "(Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;)V", "Landroid/content/Context;", "context", "", "openFileInput", "(Landroid/content/Context;)V", "Landroid/webkit/WebView;", "view", "", "url", "message", "defaultValue", "Landroid/webkit/JsPromptResult;", "result", "", "onJsPrompt", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z", "Landroid/webkit/JsResult;", "onJsConfirm", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "enterTrtcFaceVerify", "()V", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "enterOldModeFaceVerify", "()Z", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Lcom/p1/mobile/putong/ui/sign/TencentSignActivity;", "Landroid/webkit/PermissionRequest;", "Landroid/webkit/WebView;", "acceptType", "Ljava/lang/String;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SuppressLint({"WebViewUseError"})
    public final class C0539b extends WebChromeClient {

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

        public C0539b(TencentSignActivity tencentSignActivity) {
            this.activity = tencentSignActivity;
        }

        private final void openFileInput(Context context) {
            TencentSignActivity tencentSignActivity;
            if (e16.a(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                PutongAct putongAct = this.activity;
                if (putongAct != null) {
                    b50.u(putongAct, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
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
            return yep0.m25326a().m25330e(this.webView, TencentSignActivity.this.m10360d2(), this.activity, this.fileChooserParams);
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
                tencentSignActivity.m10365l2(true);
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            webView.getClass();
            filePathCallback.getClass();
            fileChooserParams.getClass();
            this.webView = webView;
            TencentSignActivity.this.m10366m2(filePathCallback);
            this.fileChooserParams = fileChooserParams;
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            acceptTypes.getClass();
            boolean z = false;
            for (String str : acceptTypes) {
                str.getClass();
                if (StringsKt.P(str, "video", false, 2, (Object) null)) {
                    z = true;
                }
            }
            if (z) {
                TencentSignActivity.this.m10365l2(false);
                return true;
            }
            Context context = webView.getContext();
            context.getClass();
            openFileInput(context);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.sign.TencentSignActivity$c */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/p1/mobile/putong/ui/sign/TencentSignActivity$c", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "webView", "webResourceRequest", "Landroid/webkit/WebResourceError;", "webResourceError", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SuppressLint({"WebViewUseError"})
    public static final class C0540c extends WebViewClient {
        public C0540c() {
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
            return TencentSignActivity.this.m10364k2(view, (request == null || (url = request.getUrl()) == null) ? null : url.toString());
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static void m10352V1(TencentSignActivity tencentSignActivity, c cVar) {
        AlertDialog alertDialog;
        if (Intrinsics.d(cVar, c.i)) {
            WebView webView = tencentSignActivity.mWebView;
            if (webView != null) {
                webView.onResume();
                return;
            }
            return;
        }
        if (Intrinsics.d(cVar, c.j)) {
            WebView webView2 = tencentSignActivity.mWebView;
            if (webView2 != null) {
                webView2.onPause();
                return;
            }
            return;
        }
        if (Intrinsics.d(cVar, c.k)) {
            WebView webView3 = tencentSignActivity.mWebView;
            if (webView3 != null) {
                webView3.stopLoading();
                return;
            }
            return;
        }
        if (Intrinsics.d(cVar, c.m)) {
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

    /* JADX INFO: renamed from: X1 */
    public static void m10353X1(TencentSignActivity tencentSignActivity, DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = tencentSignActivity.dialog;
        if (alertDialog2 != null && alertDialog2.isShowing() && (alertDialog = tencentSignActivity.dialog) != null) {
            alertDialog.dismiss();
        }
        tencentSignActivity.dialog = null;
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m10354Y1(TencentSignActivity tencentSignActivity, int i, DialogInterface dialogInterface, int i2) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = tencentSignActivity.dialog;
        if (alertDialog2 != null && alertDialog2.isShowing() && (alertDialog = tencentSignActivity.dialog) != null) {
            alertDialog.dismiss();
        }
        tencentSignActivity.dialog = null;
        tencentSignActivity.m10359c2(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: e2 */
    private final void m10357e2() {
        yep0.m25326a().m25331f(this.mWebView, this);
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.setWebViewClient(new C0540c());
        }
        C0539b c0539b = new C0539b(this);
        this.webChromeClient = c0539b;
        WebView webView2 = this.mWebView;
        if (webView2 != null) {
            webView2.setWebChromeClient(c0539b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public final int m10358b2(String permission) {
        return e16.a(this, permission);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final void m10359c2(int requestCode) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getApplicationContext().getPackageName(), null));
        if (getPackageManager().resolveActivity(intent, 0) != null) {
            startActivityForResult(intent, requestCode);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d2 */
    public final ValueCallback<Uri[]> m10360d2() {
        return this.uploadMessageAboveL;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: g2 */
    public final void m10361g2(int requestCode, int resultCode, Intent intent) {
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

    /* JADX INFO: renamed from: h2 */
    public final void m10362h2() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public final void m10363i2() {
        WebView webView;
        String stringExtra = getIntent().getStringExtra("url");
        this.curUrl = stringExtra;
        if (stringExtra == null || (webView = this.mWebView) == null) {
            return;
        }
        webView.loadUrl(stringExtra);
    }

    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ghi0
            public final void call(Object obj) {
                TencentSignActivity.m10352V1(this.f13573a, (c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public final boolean m10364k2(WebView view, String url) {
        if (url == null) {
            return false;
        }
        Uri uri = Uri.parse(url);
        uri.getClass();
        uri.getScheme();
        if (StringsKt.P(url, "m.tantanapp.com", false, 2, (Object) null) || StringsKt.P(url, "m.staging2.p1staff.com", false, 2, (Object) null)) {
            Intent intentM10498Z1 = WebViewAct.m10498Z1(this, getTitle().toString(), url);
            d2i0.m12946R(intentM10498Z1, url);
            startActivity(intentM10498Z1);
            finish();
            return true;
        }
        if (!Intrinsics.d(uri.getScheme(), "http") && !Intrinsics.d(uri.getScheme(), "https")) {
            return false;
        }
        if (view != null) {
            view.loadUrl(url);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final void m10365l2(boolean trtc) {
        if (m10358b2("android.permission.CAMERA") != 0) {
            if (trtc) {
                b50.u(this, new String[]{"android.permission.CAMERA"}, 12);
                return;
            } else {
                b50.u(this, new String[]{"android.permission.CAMERA"}, 11);
                return;
            }
        }
        C0539b c0539b = this.webChromeClient;
        if (trtc) {
            if (c0539b != null) {
                c0539b.enterTrtcFaceVerify();
            }
        } else if (c0539b != null) {
            c0539b.enterOldModeFaceVerify();
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10366m2(@Nullable ValueCallback<Uri[]> valueCallback) {
        this.uploadMessageAboveL = valueCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final void m10367n2(final int requestCode) {
        this.dialog = new AlertDialog.Builder(this).setTitle("权限申请提示").setMessage("请前往设置->应用->权限中打开相关权限，否则功能无法正常运行！").setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: l.hhi0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TencentSignActivity.m10354Y1(this.f14088a, requestCode, dialogInterface, i);
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() { // from class: l.ihi0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TencentSignActivity.m10353X1(this.f14639a, dialogInterface, i);
            }
        }).setCancelable(false).show();
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1 || data == null || data.getData() == null) {
            m10362h2();
            return;
        }
        if (requestCode == 11) {
            m10365l2(false);
            return;
        }
        if (requestCode == 12) {
            m10365l2(true);
            return;
        }
        if (requestCode == 17) {
            yep0.m25326a().m25328c(requestCode, resultCode, data);
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
            m10361g2(requestCode, resultCode, data);
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

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m10363i2();
    }

    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        m10362h2();
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 11) {
            if (grantResults.length == 0) {
                return;
            }
            if (grantResults[0] != 0) {
                m10367n2(11);
                lsi0.j("因拒绝授予权限，请5秒后再试");
                return;
            } else {
                C0539b c0539b = this.webChromeClient;
                if (c0539b != null) {
                    c0539b.enterOldModeFaceVerify();
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
            m10367n2(12);
            lsi0.j("因拒绝授予权限，请5秒后再试");
        } else {
            C0539b c0539b2 = this.webChromeClient;
            if (c0539b2 != null) {
                c0539b2.enterTrtcFaceVerify();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int i = xdl0.e;
        setContentView(webView, new ViewGroup.LayoutParams(i, i));
        setStatusBarColorResId(v0c0.p);
        setLightStatusBar(16);
        m10357e2();
        m10363i2();
    }
}
