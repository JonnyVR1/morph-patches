package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14529h;
import com.tencent.open.p111c.C14531a;
import com.tencent.open.p111c.C14532b;
import com.tencent.open.utils.C14556k;
import com.tencent.open.utils.C14559n;
import com.tencent.open.web.C14562a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.d */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC14535d extends AbstractDialogC14530c implements C14531a.a {

    /* JADX INFO: renamed from: c */
    static Toast f61089c;

    /* JADX INFO: renamed from: d */
    private String f61090d;

    /* JADX INFO: renamed from: e */
    private IUiListener f61091e;

    /* JADX INFO: renamed from: f */
    private c f61092f;

    /* JADX INFO: renamed from: g */
    private Handler f61093g;

    /* JADX INFO: renamed from: h */
    private C14531a f61094h;

    /* JADX INFO: renamed from: i */
    private C14532b f61095i;

    /* JADX INFO: renamed from: j */
    private WeakReference<Context> f61096j;

    /* JADX INFO: renamed from: k */
    private int f61097k;

    /* JADX INFO: renamed from: com.tencent.open.d$a */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            DialogC14535d.this.f61095i.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.m85496v("openSDK_LOG.PKDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            DialogC14535d.this.f61092f.onError(new UiError(i, str, str2));
            if (DialogC14535d.this.f61096j != null && DialogC14535d.this.f61096j.get() != null) {
                Toast.makeText((Context) DialogC14535d.this.f61096j.get(), "网络连接异常或系统错误", 0).show();
            }
            DialogC14535d.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.m85496v("openSDK_LOG.PKDialog", "Redirect URL: " + str);
            if (str.startsWith(C14556k.m85609a().m85610a((Context) DialogC14535d.this.f61096j.get(), "auth://tauth.qq.com/"))) {
                DialogC14535d.this.f61092f.onComplete(C14559n.m85675c(str));
                DialogC14535d.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                DialogC14535d.this.f61092f.onCancel();
                DialogC14535d.this.dismiss();
                return true;
            }
            if (!str.startsWith(Constants.CLOSE_URI)) {
                return false;
            }
            DialogC14535d.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.d$b */
    public class b extends C14521b.b {
        private b() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.d$d */
    public class d extends Handler {

        /* JADX INFO: renamed from: b */
        private c f61106b;

        public d(c cVar, Looper looper) {
            super(looper);
            this.f61106b = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.m85488d("openSDK_LOG.PKDialog", "msg = " + message.what);
            int i = message.what;
            if (i == 1) {
                this.f61106b.m85485a((String) message.obj);
                return;
            }
            if (i == 2) {
                this.f61106b.onCancel();
                return;
            }
            if (i == 3) {
                if (DialogC14535d.this.f61096j == null || DialogC14535d.this.f61096j.get() == null) {
                    return;
                }
                DialogC14535d.m85482c((Context) DialogC14535d.this.f61096j.get(), (String) message.obj);
                return;
            }
            if (i != 5 || DialogC14535d.this.f61096j == null || DialogC14535d.this.f61096j.get() == null) {
                return;
            }
            DialogC14535d.m85483d((Context) DialogC14535d.this.f61096j.get(), (String) message.obj);
        }
    }

    public DialogC14535d(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f61096j = new WeakReference<>(context);
        this.f61090d = str2;
        this.f61092f = new c(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f61093g = new d(this.f61092f, context.getMainLooper());
        this.f61091e = iUiListener;
        this.f61097k = Math.round(context.getResources().getDisplayMetrics().density * 185.0f);
        SLog.m85490e("openSDK_LOG.PKDialog", "density=" + context.getResources().getDisplayMetrics().density + "; webviewHeight=" + this.f61097k);
    }

    /* JADX INFO: renamed from: b */
    private void m85478b() {
        C14531a c14531a = new C14531a(this.f61096j.get());
        this.f61094h = c14531a;
        c14531a.setBackgroundColor(1711276032);
        this.f61094h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        C14532b c14532b = new C14532b(this.f61096j.get());
        this.f61095i = c14532b;
        c14532b.setBackgroundColor(0);
        this.f61095i.setBackgroundDrawable(null);
        try {
            View.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this.f61095i, 1, new Paint());
        } catch (Exception e) {
            e.printStackTrace();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f61097k);
        layoutParams.addRule(13, -1);
        this.f61095i.setLayoutParams(layoutParams);
        this.f61094h.addView(this.f61095i);
        this.f61094h.m85470a(this);
        setContentView(this.f61094h);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: c */
    private void m85481c() {
        this.f61095i.setVerticalScrollBarEnabled(false);
        this.f61095i.setHorizontalScrollBarEnabled(false);
        this.f61095i.setWebViewClient(new a());
        this.f61095i.setWebChromeClient(this.f61080b);
        this.f61095i.clearFormData();
        WebSettings settings = this.f61095i.getSettings();
        if (settings == null) {
            return;
        }
        C14562a.m85702a(this.f61095i);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        WeakReference<Context> weakReference = this.f61096j;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f61096j.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.f61079a.m85423a(new b(), "sdk_js_if");
        this.f61095i.clearView();
        this.f61095i.loadUrl(this.f61090d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m85483d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM85678d = C14559n.m85678d(str);
            jSONObjectM85678d.getInt("action");
            jSONObjectM85678d.getString("msg");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.open.p111c.C14531a.a
    /* JADX INFO: renamed from: a */
    public void mo85472a(int i) {
        WeakReference<Context> weakReference = this.f61096j;
        if (weakReference != null && weakReference.get() != null) {
            if (i >= this.f61097k || 2 != this.f61096j.get().getResources().getConfiguration().orientation) {
                this.f61095i.getLayoutParams().height = this.f61097k;
            } else {
                this.f61095i.getLayoutParams().height = i;
            }
        }
        SLog.m85490e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.open.AbstractDialogC14530c, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        m85478b();
        m85481c();
    }

    /* JADX INFO: renamed from: com.tencent.open.d$c */
    public static class c extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        String f61100a;

        /* JADX INFO: renamed from: b */
        String f61101b;

        /* JADX INFO: renamed from: c */
        private WeakReference<Context> f61102c;

        /* JADX INFO: renamed from: d */
        private String f61103d;

        /* JADX INFO: renamed from: e */
        private IUiListener f61104e;

        public c(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f61102c = new WeakReference<>(context);
            this.f61103d = str;
            this.f61100a = str2;
            this.f61101b = str3;
            this.f61104e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m85485a(String str) {
            try {
                onComplete(C14559n.m85678d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f61104e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f61104e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C14529h.m85459a().m85463a(this.f61103d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f61100a, false);
            IUiListener iUiListener = this.f61104e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f61104e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f61100a;
            } else {
                str = this.f61100a;
            }
            String str2 = str;
            C14529h.m85459a().m85463a(this.f61103d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            IUiListener iUiListener = this.f61104e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f61104e = null;
            }
        }
    }

    @Override // com.tencent.open.p111c.C14531a.a
    /* JADX INFO: renamed from: a */
    public void mo85471a() {
        this.f61095i.getLayoutParams().height = this.f61097k;
        SLog.m85490e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }

    @Override // com.tencent.open.AbstractDialogC14530c
    /* JADX INFO: renamed from: a */
    public void mo85389a(String str) {
        SLog.m85488d("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f61079a.mo85425a(this.f61095i, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m85482c(Context context, String str) {
        try {
            JSONObject jSONObjectM85678d = C14559n.m85678d(str);
            int i = jSONObjectM85678d.getInt("type");
            String string = jSONObjectM85678d.getString("msg");
            if (i == 0) {
                Toast toast = f61089c;
                if (toast == null) {
                    f61089c = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f61089c.setText(string);
                    f61089c.setDuration(0);
                }
                f61089c.show();
                return;
            }
            if (i == 1) {
                Toast toast2 = f61089c;
                if (toast2 == null) {
                    f61089c = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f61089c.setText(string);
                    f61089c.setDuration(1);
                }
                f61089c.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
