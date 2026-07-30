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
import com.tencent.connect.avatar.C13983a;
import com.tencent.connect.common.Constants;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.open.C14512a;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14529h;
import com.tencent.open.p111c.C14533c;
import com.tencent.open.p111c.C14534d;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.web.C14562a;
import com.tencent.open.web.security.C14564b;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.connect.auth.a */
/* JADX INFO: loaded from: classes12.dex */
public class DialogC13973a extends Dialog {

    /* JADX INFO: renamed from: a */
    private String f57920a;

    /* JADX INFO: renamed from: b */
    private b f57921b;

    /* JADX INFO: renamed from: c */
    private IUiListener f57922c;

    /* JADX INFO: renamed from: d */
    private Handler f57923d;

    /* JADX INFO: renamed from: e */
    private FrameLayout f57924e;

    /* JADX INFO: renamed from: f */
    private LinearLayout f57925f;

    /* JADX INFO: renamed from: g */
    private FrameLayout f57926g;

    /* JADX INFO: renamed from: h */
    private ProgressBar f57927h;

    /* JADX INFO: renamed from: i */
    private String f57928i;

    /* JADX INFO: renamed from: j */
    private C14534d f57929j;

    /* JADX INFO: renamed from: k */
    private Context f57930k;

    /* JADX INFO: renamed from: l */
    private C14564b f57931l;

    /* JADX INFO: renamed from: m */
    private boolean f57932m;

    /* JADX INFO: renamed from: n */
    private int f57933n;

    /* JADX INFO: renamed from: o */
    private String f57934o;

    /* JADX INFO: renamed from: p */
    private String f57935p;

    /* JADX INFO: renamed from: q */
    private long f57936q;

    /* JADX INFO: renamed from: r */
    private long f57937r;

    /* JADX INFO: renamed from: s */
    private HashMap<String, Runnable> f57938s;

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$a */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SLog.m85496v("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            DialogC13973a.this.f57926g.setVisibility(8);
            if (DialogC13973a.this.f57929j != null) {
                DialogC13973a.this.f57929j.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DialogC13973a.this.f57923d.removeCallbacks((Runnable) DialogC13973a.this.f57938s.remove(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.m85496v("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            DialogC13973a.this.f57926g.setVisibility(0);
            DialogC13973a.this.f57936q = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(DialogC13973a.this.f57934o)) {
                DialogC13973a.this.f57923d.removeCallbacks((Runnable) DialogC13973a.this.f57938s.remove(DialogC13973a.this.f57934o));
            }
            DialogC13973a.this.f57934o = str;
            DialogC13973a dialogC13973a = DialogC13973a.this;
            d dVar = dialogC13973a.new d(dialogC13973a.f57934o);
            DialogC13973a.this.f57938s.put(str, dVar);
            DialogC13973a.this.f57923d.postDelayed(dVar, 120000L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            SLog.m85492i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
            boolean zM85671b = C14559n.m85671b(DialogC13973a.this.f57930k);
            DialogC13973a dialogC13973a = DialogC13973a.this;
            if (!zM85671b) {
                dialogC13973a.f57921b.onError(new UiError(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, "当前网络不可用，请稍后重试！", str2));
                DialogC13973a.this.dismiss();
                return;
            }
            if (dialogC13973a.f57934o.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
                DialogC13973a.this.f57921b.onError(new UiError(i, str, str2));
                DialogC13973a.this.dismiss();
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - DialogC13973a.this.f57936q;
            if (DialogC13973a.this.f57933n < 1 && jElapsedRealtime < DialogC13973a.this.f57937r) {
                DialogC13973a.m83238m(DialogC13973a.this);
                DialogC13973a.this.f57923d.postDelayed(new Runnable() { // from class: com.tencent.connect.auth.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DialogC13973a.this.f57929j != null) {
                            DialogC13973a.this.f57929j.loadUrl(DialogC13973a.this.f57934o);
                        }
                    }
                }, 500L);
            } else if (DialogC13973a.this.f57929j != null) {
                DialogC13973a.this.f57929j.loadUrl(DialogC13973a.this.m83213a());
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                SLog.m85490e("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            } catch (Throwable unused) {
                SLog.m85490e("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.m85496v("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject jSONObjectM85675c = C14559n.m85675c(str);
                DialogC13973a dialogC13973a = DialogC13973a.this;
                dialogC13973a.f57932m = dialogC13973a.m83230e();
                if (!DialogC13973a.this.f57932m) {
                    if (jSONObjectM85675c.optString("fail_cb", null) != null) {
                        DialogC13973a.this.m83242a(jSONObjectM85675c.optString("fail_cb"), "");
                    } else if (jSONObjectM85675c.optInt("fall_to_wv") == 1) {
                        DialogC13973a dialogC13973a2 = DialogC13973a.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(DialogC13973a.this.f57920a);
                        sb.append(DialogC13973a.this.f57920a.indexOf("?") > -1 ? "&" : "?");
                        dialogC13973a2.f57920a = sb.toString();
                        DialogC13973a.this.f57920a = DialogC13973a.this.f57920a + "browser_error=1";
                        if (DialogC13973a.this.f57929j != null) {
                            DialogC13973a.this.f57929j.loadUrl(DialogC13973a.this.f57920a);
                        }
                    } else {
                        String strOptString = jSONObjectM85675c.optString("redir", null);
                        if (strOptString != null && DialogC13973a.this.f57929j != null) {
                            DialogC13973a.this.f57929j.loadUrl(strOptString);
                        }
                    }
                }
                return true;
            }
            if (str.startsWith("auth://tauth.qq.com/")) {
                DialogC13973a.this.f57921b.onComplete(C14559n.m85675c(str));
                DialogC13973a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                DialogC13973a.this.f57921b.onCancel();
                DialogC13973a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                DialogC13973a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.DOWNLOAD_URI) || str.endsWith(ShareConstants.PATCH_SUFFIX)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                    intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    DialogC13973a.this.f57930k.startActivity(intent);
                } catch (Exception e) {
                    SLog.m85491e("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                }
                return true;
            }
            if (!str.startsWith("auth://progress")) {
                if (str.startsWith("auth://onLoginSubmit")) {
                    try {
                        List<String> pathSegments = Uri.parse(str).getPathSegments();
                        if (!pathSegments.isEmpty()) {
                            DialogC13973a.this.f57935p = pathSegments.get(0);
                        }
                    } catch (Exception unused) {
                    }
                    return true;
                }
                if (DialogC13973a.this.f57931l.mo85425a(DialogC13973a.this.f57929j, str)) {
                    return true;
                }
                SLog.m85492i("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            }
            try {
                List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                if (pathSegments2.isEmpty()) {
                    return true;
                }
                int iIntValue = Integer.valueOf(pathSegments2.get(0)).intValue();
                if (iIntValue == 0) {
                    DialogC13973a.this.f57926g.setVisibility(8);
                    if (DialogC13973a.this.f57929j != null) {
                        DialogC13973a.this.f57929j.setVisibility(0);
                    }
                } else if (iIntValue == 1) {
                    DialogC13973a.this.f57926g.setVisibility(0);
                }
            } catch (Exception unused2) {
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$c */
    public class c extends Handler {

        /* JADX INFO: renamed from: b */
        private b f57951b;

        public c(b bVar, Looper looper) {
            super(looper);
            this.f57951b = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.f57951b.m83244a((String) message.obj);
            } else if (i == 2) {
                this.f57951b.onCancel();
            } else {
                if (i != 3) {
                    return;
                }
                DialogC13973a.m83221b(DialogC13973a.this.f57930k, (String) message.obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        String f57952a;

        public d(String str) {
            this.f57952a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SLog.m85496v("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.f57952a + " | mRetryUrl: " + DialogC13973a.this.f57934o);
            if (this.f57952a.equals(DialogC13973a.this.f57934o)) {
                DialogC13973a.this.f57921b.onError(new UiError(ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, "请求页面超时，请稍后重试！", DialogC13973a.this.f57934o));
                DialogC13973a.this.dismiss();
            }
        }
    }

    public DialogC13973a(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f57932m = false;
        this.f57936q = 0L;
        this.f57937r = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
        this.f57930k = context;
        this.f57920a = str2;
        this.f57921b = new b(str, str2, qQToken.getAppId(), iUiListener);
        this.f57923d = new c(this.f57921b, context.getMainLooper());
        this.f57922c = iUiListener;
        this.f57928i = str;
        this.f57931l = new C14564b();
        getWindow().setSoftInputMode(32);
    }

    /* JADX INFO: renamed from: a */
    private void m83217a(ViewGroup viewGroup) {
        ImageView imageView = new ImageView(this.f57930k);
        int iM83311a = C13983a.m83311a(this.f57930k, 15.6f);
        int iM83311a2 = C13983a.m83311a(this.f57930k, 25.2f);
        int iM83311a3 = C13983a.m83311a(this.f57930k, 10.0f);
        int i = iM83311a3 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM83311a + i, iM83311a2 + i);
        layoutParams.leftMargin = iM83311a3;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(iM83311a3, iM83311a3, iM83311a3, iM83311a3);
        imageView.setImageDrawable(C14559n.m85644a("h5_qr_back.png", this.f57930k));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.connect.auth.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC13973a.this.dismiss();
                if (DialogC13973a.this.f57932m || DialogC13973a.this.f57921b == null) {
                    return;
                }
                DialogC13973a.this.f57921b.onCancel();
            }
        });
        viewGroup.addView(imageView);
    }

    /* JADX INFO: renamed from: b */
    private void m83220b() {
        try {
            m83224c();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C14534d c14534d = new C14534d(this.f57930k);
            this.f57929j = c14534d;
            c14534d.setLayerType(1, null);
            this.f57929j.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C14533c c14533c = new C14533c(this.f57930k);
            c14533c.setLayoutParams(layoutParams);
            c14533c.addView(this.f57929j);
            FrameLayout frameLayout = new FrameLayout(this.f57930k);
            this.f57924e = frameLayout;
            frameLayout.addView(c14533c);
            this.f57924e.setBackgroundColor(-1);
            this.f57924e.addView(this.f57926g);
            String string = C14559n.m85667b(this.f57920a).getString("style");
            if (string != null && "qr".equals(string)) {
                m83217a(this.f57924e);
            }
            setContentView(this.f57924e);
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.AuthDialog", "onCreateView exception", th);
            C14512a.m85392a(this, this.f57923d);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83224c() {
        TextView textView;
        this.f57927h = new ProgressBar(this.f57930k);
        this.f57927h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f57925f = new LinearLayout(this.f57930k);
        if (this.f57928i.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.f57930k);
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
        this.f57925f.setLayoutParams(layoutParams2);
        this.f57925f.addView(this.f57927h);
        if (textView != null) {
            this.f57925f.addView(textView);
        }
        this.f57926g = new FrameLayout(this.f57930k);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f57926g.setLayoutParams(layoutParams3);
        this.f57926g.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f57926g.addView(this.f57925f);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: d */
    private void m83228d() {
        C14534d c14534d = this.f57929j;
        if (c14534d != null) {
            c14534d.setVerticalScrollBarEnabled(false);
            this.f57929j.setHorizontalScrollBarEnabled(false);
            this.f57929j.setWebViewClient(new a());
            this.f57929j.setWebChromeClient(new WebChromeClient());
            this.f57929j.clearFormData();
            this.f57929j.clearSslPreferences();
            this.f57929j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.connect.auth.a.2
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    return true;
                }
            });
            this.f57929j.setOnTouchListener(new View.OnTouchListener() { // from class: com.tencent.connect.auth.a.3
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
            WebSettings settings = this.f57929j.getSettings();
            C14562a.m85702a(this.f57929j);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f57930k.getDir("databases", 0).getPath());
            settings.setDomStorageEnabled(true);
            SLog.m85496v("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f57920a);
            String str = this.f57920a;
            this.f57934o = str;
            this.f57929j.loadUrl(str);
            this.f57929j.setVisibility(4);
            this.f57931l.m85423a(new SecureJsInterface(), "SecureJsInterface");
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
    public boolean m83230e() {
        C13974b c13974bM83245a = C13974b.m83245a();
        String strM83248c = c13974bM83245a.m83248c();
        C13974b.a aVar = new C13974b.a();
        aVar.f57959a = this.f57922c;
        aVar.f57960b = this;
        aVar.f57961c = strM83248c;
        String strM83247a = c13974bM83245a.m83247a(aVar);
        String str = this.f57920a;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleM85667b = C14559n.m85667b(this.f57920a);
        bundleM85667b.putString("token_key", strM83248c);
        bundleM85667b.putString("serial", strM83247a);
        bundleM85667b.putString("browser", "1");
        String str2 = strSubstring + "?" + HttpUtils.encodeUrl(bundleM85667b);
        this.f57920a = str2;
        return C14559n.m85661a(this.f57930k, str2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m83238m(DialogC13973a dialogC13973a) {
        int i = dialogC13973a.f57933n;
        dialogC13973a.f57933n = i + 1;
        return i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f57938s.clear();
        this.f57923d.removeCallbacksAndMessages(null);
        try {
            Context context = this.f57930k;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                SLog.m85492i("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        C14534d c14534d = this.f57929j;
        if (c14534d != null) {
            c14534d.destroy();
            this.f57929j = null;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.f57932m) {
            this.f57921b.onCancel();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C14512a.m85393a(getWindow());
        m83220b();
        m83228d();
        this.f57938s = new HashMap<>();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$b */
    public class b extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        String f57945a;

        /* JADX INFO: renamed from: b */
        String f57946b;

        /* JADX INFO: renamed from: d */
        private String f57948d;

        /* JADX INFO: renamed from: e */
        private IUiListener f57949e;

        public b(String str, String str2, String str3, IUiListener iUiListener) {
            this.f57948d = str;
            this.f57945a = str2;
            this.f57946b = str3;
            this.f57949e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m83244a(String str) {
            try {
                onComplete(C14559n.m85678d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f57949e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f57949e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C14529h.m85459a().m85463a(this.f57948d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f57945a, false);
            IUiListener iUiListener = this.f57949e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f57949e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f57945a;
            } else {
                str = this.f57945a;
            }
            String str2 = str;
            C14529h.m85459a().m85463a(this.f57948d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            DialogC13973a.this.m83215a(str2);
            IUiListener iUiListener = this.f57949e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f57949e = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m83215a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f57935p) && this.f57935p.length() >= 4) {
            String str2 = this.f57935p;
            String strSubstring = str2.substring(str2.length() - 4);
            sb.append("_u_");
            sb.append(strSubstring);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m83213a() {
        String str = this.f57920a;
        String strConcat = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?".concat(str.substring(str.indexOf("?") + 1));
        SLog.m85492i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return strConcat;
    }

    /* JADX INFO: renamed from: a */
    public void m83242a(String str, String str2) {
        if (this.f57929j != null) {
            this.f57929j.loadUrl("javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m83221b(Context context, String str) {
        try {
            JSONObject jSONObjectM85678d = C14559n.m85678d(str);
            int i = jSONObjectM85678d.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectM85678d.getString("msg"), i).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
