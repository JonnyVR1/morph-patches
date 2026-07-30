package p149l;

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
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import com.google.android.gms.ads.internal.util.C2075b;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;

/* JADX INFO: loaded from: classes6.dex */
public final class p9t0 extends WebChromeClient {
    private final q9t0 zza;

    public p9t0(q9t0 q9t0Var) {
        this.zza = q9t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof q9t0)) {
            return webView.getContext();
        }
        q9t0 q9t0Var = (q9t0) webView;
        Activity activityZzi = q9t0Var.zzi();
        return activityZzi != null ? activityZzi : q9t0Var.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof q9t0)) {
            x2t0.m206869g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC2073b binderC2073bZzL = ((q9t0) webView).zzL();
        if (binderC2073bZzL == null) {
            x2t0.m206869g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            binderC2073bZzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = o9t0.f142744a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            x2t0.m206866d(str);
        } else if (i == 2) {
            x2t0.m206869g(str);
        } else if (i == 3 || i == 4 || i != 5) {
            x2t0.m206868f(str);
        } else {
            x2t0.m206864b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.mo13701o() != null) {
            webView2.setWebViewClient(this.zza.mo13701o());
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
            q9t0 q9t0Var = this.zza;
            vny0.m199080r();
            if (C2075b.m12309b0(q9t0Var.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z = true;
            } else {
                q9t0 q9t0Var2 = this.zza;
                vny0.m199080r();
                if (C2075b.m12309b0(q9t0Var2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
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
        BinderC2073b binderC2073bZzL = this.zza.zzL();
        if (binderC2073bZzL == null) {
            x2t0.m206869g("Could not get ad overlay when hiding custom view.");
        } else {
            binderC2073bZzL.zzg();
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
        BinderC2073b binderC2073bZzL = this.zza.zzL();
        if (binderC2073bZzL == null) {
            x2t0.m206869g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            binderC2073bZzL.m12273r8(view, customViewCallback);
            binderC2073bZzL.m12271p8(i);
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        q0s0 q0s0VarZzd;
        try {
            q9t0 q9t0Var = this.zza;
            if (q9t0Var != null && q9t0Var.zzN() != null && this.zza.zzN().zzd() != null && (q0s0VarZzd = this.zza.zzN().zzd()) != null && !q0s0VarZzd.m172358c()) {
                q0s0VarZzd.m172357b("window." + str + "('" + str3 + "')");
                return false;
            }
            vny0.m199080r();
            AlertDialog.Builder builderM12317j = C2075b.m12317j(context);
            builderM12317j.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderM12317j.setView(linearLayout).setPositiveButton(R.string.ok, new n9t0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new m9t0(jsPromptResult)).setOnCancelListener(new l9t0(jsPromptResult)).create().show();
            } else {
                builderM12317j.setMessage(str3).setPositiveButton(R.string.ok, new k9t0(jsResult)).setNegativeButton(R.string.cancel, new j9t0(jsResult)).setOnCancelListener(new i9t0(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e) {
            x2t0.m206870h("Fail to display Dialog.", e);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
