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
import com.tencent.open.p105b.C14366h;
import com.tencent.open.p106c.C14368a;
import com.tencent.open.p106c.C14369b;
import com.tencent.open.utils.C14393k;
import com.tencent.open.utils.C14396n;
import com.tencent.open.web.C14399a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.open.d */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC14372d extends AbstractDialogC14367c implements C14368a.a {

    /* JADX INFO: renamed from: c */
    static Toast f60241c;

    /* JADX INFO: renamed from: d */
    private String f60242d;

    /* JADX INFO: renamed from: e */
    private IUiListener f60243e;

    /* JADX INFO: renamed from: f */
    private c f60244f;

    /* JADX INFO: renamed from: g */
    private Handler f60245g;

    /* JADX INFO: renamed from: h */
    private C14368a f60246h;

    /* JADX INFO: renamed from: i */
    private C14369b f60247i;

    /* JADX INFO: renamed from: j */
    private WeakReference<Context> f60248j;

    /* JADX INFO: renamed from: k */
    private int f60249k;

    /* JADX INFO: renamed from: com.tencent.open.d$a */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            DialogC14372d.this.f60247i.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.m84313v("openSDK_LOG.PKDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            DialogC14372d.this.f60244f.onError(new UiError(i, str, str2));
            if (DialogC14372d.this.f60248j != null && DialogC14372d.this.f60248j.get() != null) {
                Toast.makeText((Context) DialogC14372d.this.f60248j.get(), "网络连接异常或系统错误", 0).show();
            }
            DialogC14372d.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.m84313v("openSDK_LOG.PKDialog", "Redirect URL: " + str);
            if (str.startsWith(C14393k.m84426a().m84427a((Context) DialogC14372d.this.f60248j.get(), "auth://tauth.qq.com/"))) {
                DialogC14372d.this.f60244f.onComplete(C14396n.m84492c(str));
                DialogC14372d.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                DialogC14372d.this.f60244f.onCancel();
                DialogC14372d.this.dismiss();
                return true;
            }
            if (!str.startsWith(Constants.CLOSE_URI)) {
                return false;
            }
            DialogC14372d.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.d$b */
    public class b extends C14358b.b {
        private b() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.d$d */
    public class d extends Handler {

        /* JADX INFO: renamed from: b */
        private c f60258b;

        public d(c cVar, Looper looper) {
            super(looper);
            this.f60258b = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.m84305d("openSDK_LOG.PKDialog", "msg = " + message.what);
            int i = message.what;
            if (i == 1) {
                this.f60258b.m84302a((String) message.obj);
                return;
            }
            if (i == 2) {
                this.f60258b.onCancel();
                return;
            }
            if (i == 3) {
                if (DialogC14372d.this.f60248j == null || DialogC14372d.this.f60248j.get() == null) {
                    return;
                }
                DialogC14372d.m84299c((Context) DialogC14372d.this.f60248j.get(), (String) message.obj);
                return;
            }
            if (i != 5 || DialogC14372d.this.f60248j == null || DialogC14372d.this.f60248j.get() == null) {
                return;
            }
            DialogC14372d.m84300d((Context) DialogC14372d.this.f60248j.get(), (String) message.obj);
        }
    }

    public DialogC14372d(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f60248j = new WeakReference<>(context);
        this.f60242d = str2;
        this.f60244f = new c(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f60245g = new d(this.f60244f, context.getMainLooper());
        this.f60243e = iUiListener;
        this.f60249k = Math.round(context.getResources().getDisplayMetrics().density * 185.0f);
        SLog.m84307e("openSDK_LOG.PKDialog", "density=" + context.getResources().getDisplayMetrics().density + "; webviewHeight=" + this.f60249k);
    }

    /* JADX INFO: renamed from: b */
    private void m84295b() {
        C14368a c14368a = new C14368a(this.f60248j.get());
        this.f60246h = c14368a;
        c14368a.setBackgroundColor(1711276032);
        this.f60246h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        C14369b c14369b = new C14369b(this.f60248j.get());
        this.f60247i = c14369b;
        c14369b.setBackgroundColor(0);
        this.f60247i.setBackgroundDrawable(null);
        try {
            View.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this.f60247i, 1, new Paint());
        } catch (Exception e) {
            e.printStackTrace();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f60249k);
        layoutParams.addRule(13, -1);
        this.f60247i.setLayoutParams(layoutParams);
        this.f60246h.addView(this.f60247i);
        this.f60246h.m84287a(this);
        setContentView(this.f60246h);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: c */
    private void m84298c() {
        this.f60247i.setVerticalScrollBarEnabled(false);
        this.f60247i.setHorizontalScrollBarEnabled(false);
        this.f60247i.setWebViewClient(new a());
        this.f60247i.setWebChromeClient(this.f60232b);
        this.f60247i.clearFormData();
        WebSettings settings = this.f60247i.getSettings();
        if (settings == null) {
            return;
        }
        C14399a.m84519a(this.f60247i);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        WeakReference<Context> weakReference = this.f60248j;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f60248j.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.f60231a.m84240a(new b(), "sdk_js_if");
        this.f60247i.clearView();
        this.f60247i.loadUrl(this.f60242d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m84300d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM84495d = C14396n.m84495d(str);
            jSONObjectM84495d.getInt("action");
            jSONObjectM84495d.getString("msg");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.open.p106c.C14368a.a
    /* JADX INFO: renamed from: a */
    public void mo84289a(int i) {
        WeakReference<Context> weakReference = this.f60248j;
        if (weakReference != null && weakReference.get() != null) {
            if (i >= this.f60249k || 2 != this.f60248j.get().getResources().getConfiguration().orientation) {
                this.f60247i.getLayoutParams().height = this.f60249k;
            } else {
                this.f60247i.getLayoutParams().height = i;
            }
        }
        SLog.m84307e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.open.AbstractDialogC14367c, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        m84295b();
        m84298c();
    }

    /* JADX INFO: renamed from: com.tencent.open.d$c */
    public static class c extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        String f60252a;

        /* JADX INFO: renamed from: b */
        String f60253b;

        /* JADX INFO: renamed from: c */
        private WeakReference<Context> f60254c;

        /* JADX INFO: renamed from: d */
        private String f60255d;

        /* JADX INFO: renamed from: e */
        private IUiListener f60256e;

        public c(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f60254c = new WeakReference<>(context);
            this.f60255d = str;
            this.f60252a = str2;
            this.f60253b = str3;
            this.f60256e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m84302a(String str) {
            try {
                onComplete(C14396n.m84495d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f60256e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f60256e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C14366h.m84276a().m84280a(this.f60255d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f60252a, false);
            IUiListener iUiListener = this.f60256e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f60256e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f60252a;
            } else {
                str = this.f60252a;
            }
            String str2 = str;
            C14366h.m84276a().m84280a(this.f60255d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            IUiListener iUiListener = this.f60256e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f60256e = null;
            }
        }
    }

    @Override // com.tencent.open.p106c.C14368a.a
    /* JADX INFO: renamed from: a */
    public void mo84288a() {
        this.f60247i.getLayoutParams().height = this.f60249k;
        SLog.m84307e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }

    @Override // com.tencent.open.AbstractDialogC14367c
    /* JADX INFO: renamed from: a */
    public void mo84206a(String str) {
        SLog.m84305d("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f60231a.mo84242a(this.f60247i, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m84299c(Context context, String str) {
        try {
            JSONObject jSONObjectM84495d = C14396n.m84495d(str);
            int i = jSONObjectM84495d.getInt("type");
            String string = jSONObjectM84495d.getString("msg");
            if (i == 0) {
                Toast toast = f60241c;
                if (toast == null) {
                    f60241c = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f60241c.setText(string);
                    f60241c.setDuration(0);
                }
                f60241c.show();
                return;
            }
            if (i == 1) {
                Toast toast2 = f60241c;
                if (toast2 == null) {
                    f60241c = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f60241c.setText(string);
                    f60241c.setDuration(1);
                }
                f60241c.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
