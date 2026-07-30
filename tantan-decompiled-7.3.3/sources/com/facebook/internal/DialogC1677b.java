package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.DialogC1677b;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.xe20;
import p153l.xi3;

/* JADX INFO: renamed from: com.facebook.internal.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Lcom/facebook/internal/b;", "Lcom/facebook/internal/WebDialog;", "Landroid/content/Context;", "context", "", "url", "expectedRedirectUrl", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "w", "(Ljava/lang/String;)Landroid/os/Bundle;", "", "cancel", "()V", "", "o", "Z", "waitingForDialogToClose", "Companion", "a", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class DialogC1677b extends WebDialog {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    public static final String f6689p = DialogC1677b.class.getName();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean waitingForDialogToClose;

    /* JADX INFO: renamed from: com.facebook.internal.b$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/facebook/internal/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "expectedRedirectUrl", "Lcom/facebook/internal/b;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/b;", "", "OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS", "I", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final DialogC1677b m8817a(@NotNull Context context, @NotNull String url, @NotNull String expectedRedirectUrl) {
            context.getClass();
            url.getClass();
            expectedRedirectUrl.getClass();
            WebDialog.m8775s(context);
            return new DialogC1677b(context, url, expectedRedirectUrl, null);
        }

        public Companion() {
        }
    }

    public DialogC1677b(Context context, String str, String str2) {
        super(context, str);
        m8777A(str2);
    }

    /* JADX INFO: renamed from: F */
    public static final void m8816F(DialogC1677b dialogC1677b) {
        dialogC1677b.getClass();
        super.cancel();
    }

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webView = getWebView();
        if (!getIsPageFinished() || getIsListenerCalled() || webView == null || !webView.isShown()) {
            super.cancel();
        } else {
            if (this.waitingForDialogToClose) {
                return;
            }
            this.waitingForDialogToClose = true;
            webView.loadUrl(Intrinsics.m88385l("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l.fxf
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC1677b.m8816F(this.f101259a);
                }
            }, 1500L);
        }
    }

    @Override // com.facebook.internal.WebDialog
    @NotNull
    /* JADX INFO: renamed from: w */
    public Bundle mo8785w(@Nullable String url) {
        Uri uri = Uri.parse(url);
        C1680e c1680e = C1680e.INSTANCE;
        Bundle bundleM8907o0 = C1680e.m8907o0(uri.getQuery());
        String string = bundleM8907o0.getString("bridge_args");
        bundleM8907o0.remove("bridge_args");
        if (!C1680e.m8886c0(string)) {
            try {
                bundleM8907o0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", xi3.m211093a(new JSONObject(string)));
            } catch (JSONException e) {
                C1680e c1680e2 = C1680e.INSTANCE;
                C1680e.m8900k0(f6689p, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = bundleM8907o0.getString("method_results");
        bundleM8907o0.remove("method_results");
        if (!C1680e.m8886c0(string2)) {
            try {
                bundleM8907o0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", xi3.m211093a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C1680e c1680e3 = C1680e.INSTANCE;
                C1680e.m8900k0(f6689p, "Unable to parse bridge_args JSON", e2);
            }
        }
        bundleM8907o0.remove(WBConstants.AUTH_PARAMS_VERSION);
        bundleM8907o0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", xe20.m210529u());
        return bundleM8907o0;
    }

    public /* synthetic */ DialogC1677b(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }
}
