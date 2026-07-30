package p153l;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import com.google.android.gms.ads.internal.util.C2098b;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;

/* JADX INFO: loaded from: classes6.dex */
public final class vit0 extends WebChromeClient {
    private final wit0 zza;

    public vit0(wit0 wit0Var) {
        this.zza = wit0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof wit0)) {
            return webView.getContext();
        }
        wit0 wit0Var = (wit0) webView;
        Activity activityZzi = wit0Var.zzi();
        return activityZzi != null ? activityZzi : wit0Var.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof wit0)) {
            dct0.m115298g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC2096b binderC2096bZzL = ((wit0) webView).zzL();
        if (binderC2096bZzL == null) {
            dct0.m115298g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            binderC2096bZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = uit0.f179147a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            dct0.m115295d(str);
        } else if (i == 2) {
            dct0.m115298g(str);
        } else if (i == 3 || i == 4 || i != 5) {
            dct0.m115297f(str);
        } else {
            dct0.m115293b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.mo13755o() != null) {
            webView2.setWebViewClient(this.zza.mo13755o());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072L, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } else {
            if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            wit0 wit0Var = this.zza;
            bxy0.m106934r();
            if (C2098b.m12363b0(wit0Var.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z = true;
            } else {
                wit0 wit0Var2 = this.zza;
                bxy0.m106934r();
                if (C2098b.m12363b0(wit0Var2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = true;
                } else {
                    z = false;
                }
            }
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC2096b binderC2096bZzL = this.zza.zzL();
        if (binderC2096bZzL == null) {
            dct0.m115298g("Could not get ad overlay when hiding custom view.");
        } else {
            binderC2096bZzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), BLiveVoiceSingTogehterState.confirm, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        BinderC2096b binderC2096bZzL = this.zza.zzL();
        if (binderC2096bZzL == null) {
            dct0.m115298g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            binderC2096bZzL.m12327r8(view, customViewCallback);
            binderC2096bZzL.m12325p8(i);
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        w9s0 w9s0VarZzd;
        try {
            wit0 wit0Var = this.zza;
            if (wit0Var != null && wit0Var.zzN() != null && this.zza.zzN().zzd() != null && (w9s0VarZzd = this.zza.zzN().zzd()) != null && !w9s0VarZzd.m205627c()) {
                w9s0VarZzd.m205626b("window." + str + "('" + str3 + "')");
                return false;
            }
            bxy0.m106934r();
            AlertDialog.Builder builderM12371j = C2098b.m12371j(context);
            builderM12371j.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderM12371j.setView(linearLayout).setPositiveButton(R.string.ok, new tit0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new sit0(jsPromptResult)).setOnCancelListener(new rit0(jsPromptResult)).create().show();
            } else {
                builderM12371j.setMessage(str3).setPositiveButton(R.string.ok, new qit0(jsResult)).setNegativeButton(R.string.cancel, new pit0(jsResult)).setOnCancelListener(new oit0(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e) {
            dct0.m115299h("Fail to display Dialog.", e);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
