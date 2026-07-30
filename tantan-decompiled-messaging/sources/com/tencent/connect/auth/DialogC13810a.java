package com.tencent.connect.auth;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.core.glcore.util.ErrorCode;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.connect.avatar.C13820a;
import com.tencent.connect.common.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.open.C14349a;
import com.tencent.open.log.SLog;
import com.tencent.open.p105b.C14366h;
import com.tencent.open.p106c.C14370c;
import com.tencent.open.p106c.C14371d;
import com.tencent.open.utils.C14396n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.web.C14399a;
import com.tencent.open.web.security.C14401b;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.connect.auth.a */
/* JADX INFO: loaded from: classes13.dex */
public class DialogC13810a extends Dialog {

    /* JADX INFO: renamed from: a */
    private String f57072a;

    /* JADX INFO: renamed from: b */
    private b f57073b;

    /* JADX INFO: renamed from: c */
    private IUiListener f57074c;

    /* JADX INFO: renamed from: d */
    private Handler f57075d;

    /* JADX INFO: renamed from: e */
    private FrameLayout f57076e;

    /* JADX INFO: renamed from: f */
    private LinearLayout f57077f;

    /* JADX INFO: renamed from: g */
    private FrameLayout f57078g;

    /* JADX INFO: renamed from: h */
    private ProgressBar f57079h;

    /* JADX INFO: renamed from: i */
    private String f57080i;

    /* JADX INFO: renamed from: j */
    private C14371d f57081j;

    /* JADX INFO: renamed from: k */
    private Context f57082k;

    /* JADX INFO: renamed from: l */
    private C14401b f57083l;

    /* JADX INFO: renamed from: m */
    private boolean f57084m;

    /* JADX INFO: renamed from: n */
    private int f57085n;

    /* JADX INFO: renamed from: o */
    private String f57086o;

    /* JADX INFO: renamed from: p */
    private String f57087p;

    /* JADX INFO: renamed from: q */
    private long f57088q;

    /* JADX INFO: renamed from: r */
    private long f57089r;

    /* JADX INFO: renamed from: s */
    private HashMap<String, Runnable> f57090s;

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$a */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SLog.m84313v("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            DialogC13810a.this.f57078g.setVisibility(8);
            if (DialogC13810a.this.f57081j != null) {
                DialogC13810a.this.f57081j.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DialogC13810a.this.f57075d.removeCallbacks((Runnable) DialogC13810a.this.f57090s.remove(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.m84313v("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            DialogC13810a.this.f57078g.setVisibility(0);
            DialogC13810a.this.f57088q = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(DialogC13810a.this.f57086o)) {
                DialogC13810a.this.f57075d.removeCallbacks((Runnable) DialogC13810a.this.f57090s.remove(DialogC13810a.this.f57086o));
            }
            DialogC13810a.this.f57086o = str;
            DialogC13810a dialogC13810a = DialogC13810a.this;
            d dVar = dialogC13810a.new d(dialogC13810a.f57086o);
            DialogC13810a.this.f57090s.put(str, dVar);
            DialogC13810a.this.f57075d.postDelayed(dVar, 120000L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            SLog.m84309i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
            boolean zM84488b = C14396n.m84488b(DialogC13810a.this.f57082k);
            DialogC13810a dialogC13810a = DialogC13810a.this;
            if (!zM84488b) {
                dialogC13810a.f57073b.onError(new UiError(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, "当前网络不可用，请稍后重试！", str2));
                DialogC13810a.this.dismiss();
                return;
            }
            if (dialogC13810a.f57086o.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
                DialogC13810a.this.f57073b.onError(new UiError(i, str, str2));
                DialogC13810a.this.dismiss();
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - DialogC13810a.this.f57088q;
            if (DialogC13810a.this.f57085n < 1 && jElapsedRealtime < DialogC13810a.this.f57089r) {
                DialogC13810a.m82055m(DialogC13810a.this);
                DialogC13810a.this.f57075d.postDelayed(new Runnable() { // from class: com.tencent.connect.auth.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DialogC13810a.this.f57081j != null) {
                            DialogC13810a.this.f57081j.loadUrl(DialogC13810a.this.f57086o);
                        }
                    }
                }, 500L);
            } else if (DialogC13810a.this.f57081j != null) {
                DialogC13810a.this.f57081j.loadUrl(DialogC13810a.this.m82030a());
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                SLog.m84307e("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            } catch (Throwable unused) {
                SLog.m84307e("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.m84313v("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject jSONObjectM84492c = C14396n.m84492c(str);
                DialogC13810a dialogC13810a = DialogC13810a.this;
                dialogC13810a.f57084m = dialogC13810a.m82047e();
                if (!DialogC13810a.this.f57084m) {
                    if (jSONObjectM84492c.optString("fail_cb", null) != null) {
                        DialogC13810a.this.m82059a(jSONObjectM84492c.optString("fail_cb"), "");
                    } else if (jSONObjectM84492c.optInt("fall_to_wv") == 1) {
                        DialogC13810a dialogC13810a2 = DialogC13810a.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(DialogC13810a.this.f57072a);
                        sb.append(DialogC13810a.this.f57072a.indexOf("?") > -1 ? "&" : "?");
                        dialogC13810a2.f57072a = sb.toString();
                        DialogC13810a.this.f57072a = DialogC13810a.this.f57072a + "browser_error=1";
                        if (DialogC13810a.this.f57081j != null) {
                            DialogC13810a.this.f57081j.loadUrl(DialogC13810a.this.f57072a);
                        }
                    } else {
                        String strOptString = jSONObjectM84492c.optString("redir", null);
                        if (strOptString != null && DialogC13810a.this.f57081j != null) {
                            DialogC13810a.this.f57081j.loadUrl(strOptString);
                        }
                    }
                }
                return true;
            }
            if (str.startsWith("auth://tauth.qq.com/")) {
                DialogC13810a.this.f57073b.onComplete(C14396n.m84492c(str));
                DialogC13810a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                DialogC13810a.this.f57073b.onCancel();
                DialogC13810a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                DialogC13810a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.DOWNLOAD_URI) || str.endsWith(ShareConstants.PATCH_SUFFIX)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                    intent.addFlags(268435456);
                    DialogC13810a.this.f57082k.startActivity(intent);
                } catch (Exception e) {
                    SLog.m84308e("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                }
                return true;
            }
            if (!str.startsWith("auth://progress")) {
                if (str.startsWith("auth://onLoginSubmit")) {
                    try {
                        List<String> pathSegments = Uri.parse(str).getPathSegments();
                        if (!pathSegments.isEmpty()) {
                            DialogC13810a.this.f57087p = pathSegments.get(0);
                        }
                    } catch (Exception unused) {
                    }
                    return true;
                }
                if (DialogC13810a.this.f57083l.mo84242a(DialogC13810a.this.f57081j, str)) {
                    return true;
                }
                SLog.m84309i("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            }
            try {
                List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                if (pathSegments2.isEmpty()) {
                    return true;
                }
                int iIntValue = Integer.valueOf(pathSegments2.get(0)).intValue();
                if (iIntValue == 0) {
                    DialogC13810a.this.f57078g.setVisibility(8);
                    if (DialogC13810a.this.f57081j != null) {
                        DialogC13810a.this.f57081j.setVisibility(0);
                    }
                } else if (iIntValue == 1) {
                    DialogC13810a.this.f57078g.setVisibility(0);
                }
            } catch (Exception unused2) {
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$c */
    public class c extends Handler {

        /* JADX INFO: renamed from: b */
        private b f57103b;

        public c(b bVar, Looper looper) {
            super(looper);
            this.f57103b = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.f57103b.m82061a((String) message.obj);
            } else if (i == 2) {
                this.f57103b.onCancel();
            } else {
                if (i != 3) {
                    return;
                }
                DialogC13810a.m82038b(DialogC13810a.this.f57082k, (String) message.obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        String f57104a;

        public d(String str) {
            this.f57104a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SLog.m84313v("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.f57104a + " | mRetryUrl: " + DialogC13810a.this.f57086o);
            if (this.f57104a.equals(DialogC13810a.this.f57086o)) {
                DialogC13810a.this.f57073b.onError(new UiError(ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, "请求页面超时，请稍后重试！", DialogC13810a.this.f57086o));
                DialogC13810a.this.dismiss();
            }
        }
    }

    public DialogC13810a(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f57084m = false;
        this.f57088q = 0L;
        this.f57089r = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        this.f57082k = context;
        this.f57072a = str2;
        this.f57073b = new b(str, str2, qQToken.getAppId(), iUiListener);
        this.f57075d = new c(this.f57073b, context.getMainLooper());
        this.f57074c = iUiListener;
        this.f57080i = str;
        this.f57083l = new C14401b();
        getWindow().setSoftInputMode(32);
    }

    /* JADX INFO: renamed from: a */
    private void m82034a(ViewGroup viewGroup) {
        ImageView imageView = new ImageView(this.f57082k);
        int iM82128a = C13820a.m82128a(this.f57082k, 15.6f);
        int iM82128a2 = C13820a.m82128a(this.f57082k, 25.2f);
        int iM82128a3 = C13820a.m82128a(this.f57082k, 10.0f);
        int i = iM82128a3 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM82128a + i, iM82128a2 + i);
        layoutParams.leftMargin = iM82128a3;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(iM82128a3, iM82128a3, iM82128a3, iM82128a3);
        imageView.setImageDrawable(C14396n.m84461a("h5_qr_back.png", this.f57082k));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.connect.auth.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC13810a.this.dismiss();
                if (DialogC13810a.this.f57084m || DialogC13810a.this.f57073b == null) {
                    return;
                }
                DialogC13810a.this.f57073b.onCancel();
            }
        });
        viewGroup.addView(imageView);
    }

    /* JADX INFO: renamed from: b */
    private void m82037b() {
        try {
            m82041c();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C14371d c14371d = new C14371d(this.f57082k);
            this.f57081j = c14371d;
            c14371d.setLayerType(1, null);
            this.f57081j.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C14370c c14370c = new C14370c(this.f57082k);
            c14370c.setLayoutParams(layoutParams);
            c14370c.addView(this.f57081j);
            FrameLayout frameLayout = new FrameLayout(this.f57082k);
            this.f57076e = frameLayout;
            frameLayout.addView(c14370c);
            this.f57076e.setBackgroundColor(-1);
            this.f57076e.addView(this.f57078g);
            String string = C14396n.m84484b(this.f57072a).getString("style");
            if (string != null && "qr".equals(string)) {
                m82034a(this.f57076e);
            }
            setContentView(this.f57076e);
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.AuthDialog", "onCreateView exception", th);
            C14349a.m84209a(this, this.f57075d);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m82041c() {
        TextView textView;
        this.f57079h = new ProgressBar(this.f57082k);
        this.f57079h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f57077f = new LinearLayout(this.f57082k);
        if (this.f57080i.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.f57082k);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f57077f.setLayoutParams(layoutParams2);
        this.f57077f.addView(this.f57079h);
        if (textView != null) {
            this.f57077f.addView(textView);
        }
        this.f57078g = new FrameLayout(this.f57082k);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f57078g.setLayoutParams(layoutParams3);
        this.f57078g.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f57078g.addView(this.f57077f);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: d */
    private void m82045d() {
        C14371d c14371d = this.f57081j;
        if (c14371d != null) {
            c14371d.setVerticalScrollBarEnabled(false);
            this.f57081j.setHorizontalScrollBarEnabled(false);
            this.f57081j.setWebViewClient(new a());
            this.f57081j.setWebChromeClient(new WebChromeClient());
            this.f57081j.clearFormData();
            this.f57081j.clearSslPreferences();
            this.f57081j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.connect.auth.a.2
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    return true;
                }
            });
            this.f57081j.setOnTouchListener(new View.OnTouchListener() { // from class: com.tencent.connect.auth.a.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if ((action != 0 && action != 1) || view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            WebSettings settings = this.f57081j.getSettings();
            C14399a.m84519a(this.f57081j);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f57082k.getDir("databases", 0).getPath());
            settings.setDomStorageEnabled(true);
            SLog.m84313v("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f57072a);
            String str = this.f57072a;
            this.f57086o = str;
            this.f57081j.loadUrl(str);
            this.f57081j.setVisibility(4);
            this.f57083l.m84240a(new SecureJsInterface(), "SecureJsInterface");
            SecureJsInterface.isPWDEdit = false;
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.connect.auth.a.4
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    try {
                        if (JniInterface.isJniOk) {
                            JniInterface.clearAllPWD();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public boolean m82047e() {
        C13811b c13811bM82062a = C13811b.m82062a();
        String strM82065c = c13811bM82062a.m82065c();
        C13811b.a aVar = new C13811b.a();
        aVar.f57111a = this.f57074c;
        aVar.f57112b = this;
        aVar.f57113c = strM82065c;
        String strM82064a = c13811bM82062a.m82064a(aVar);
        String str = this.f57072a;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleM84484b = C14396n.m84484b(this.f57072a);
        bundleM84484b.putString("token_key", strM82065c);
        bundleM84484b.putString("serial", strM82064a);
        bundleM84484b.putString("browser", "1");
        String str2 = strSubstring + "?" + HttpUtils.encodeUrl(bundleM84484b);
        this.f57072a = str2;
        return C14396n.m84478a(this.f57082k, str2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m82055m(DialogC13810a dialogC13810a) {
        int i = dialogC13810a.f57085n;
        dialogC13810a.f57085n = i + 1;
        return i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f57090s.clear();
        this.f57075d.removeCallbacksAndMessages(null);
        try {
            Context context = this.f57082k;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                SLog.m84309i("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        C14371d c14371d = this.f57081j;
        if (c14371d != null) {
            c14371d.destroy();
            this.f57081j = null;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.f57084m) {
            this.f57073b.onCancel();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C14349a.m84210a(getWindow());
        m82037b();
        m82045d();
        this.f57090s = new HashMap<>();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$b */
    public class b extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        String f57097a;

        /* JADX INFO: renamed from: b */
        String f57098b;

        /* JADX INFO: renamed from: d */
        private String f57100d;

        /* JADX INFO: renamed from: e */
        private IUiListener f57101e;

        public b(String str, String str2, String str3, IUiListener iUiListener) {
            this.f57100d = str;
            this.f57097a = str2;
            this.f57098b = str3;
            this.f57101e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m82061a(String str) {
            try {
                onComplete(C14396n.m84495d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f57101e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f57101e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C14366h.m84276a().m84280a(this.f57100d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f57097a, false);
            IUiListener iUiListener = this.f57101e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f57101e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f57097a;
            } else {
                str = this.f57097a;
            }
            String str2 = str;
            C14366h.m84276a().m84280a(this.f57100d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            DialogC13810a.this.m82032a(str2);
            IUiListener iUiListener = this.f57101e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f57101e = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m82032a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f57087p) && this.f57087p.length() >= 4) {
            String str2 = this.f57087p;
            String strSubstring = str2.substring(str2.length() - 4);
            sb.append("_u_");
            sb.append(strSubstring);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m82030a() {
        String str = this.f57072a;
        String strConcat = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?".concat(str.substring(str.indexOf("?") + 1));
        SLog.m84309i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return strConcat;
    }

    /* JADX INFO: renamed from: a */
    public void m82059a(String str, String str2) {
        if (this.f57081j != null) {
            this.f57081j.loadUrl("javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m82038b(Context context, String str) {
        try {
            JSONObject jSONObjectM84495d = C14396n.m84495d(str);
            int i = jSONObjectM84495d.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectM84495d.getString("msg"), i).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
