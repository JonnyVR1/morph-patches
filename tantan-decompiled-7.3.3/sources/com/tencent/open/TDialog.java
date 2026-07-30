package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.p110b.C14529h;
import com.tencent.open.p111c.C14532b;
import com.tencent.open.p111c.C14533c;
import com.tencent.open.utils.C14556k;
import com.tencent.open.utils.C14559n;
import com.tencent.open.web.C14562a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TDialog extends AbstractDialogC14530c {

    /* JADX INFO: renamed from: c */
    static final FrameLayout.LayoutParams f60994c = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: d */
    static Toast f60995d = null;

    /* JADX INFO: renamed from: f */
    private static WeakReference<ProgressDialog> f60996f;

    /* JADX INFO: renamed from: e */
    private WeakReference<Context> f60997e;

    /* JADX INFO: renamed from: g */
    private String f60998g;

    /* JADX INFO: renamed from: h */
    private OnTimeListener f60999h;

    /* JADX INFO: renamed from: i */
    private IUiListener f61000i;

    /* JADX INFO: renamed from: j */
    private FrameLayout f61001j;

    /* JADX INFO: renamed from: k */
    private C14532b f61002k;

    /* JADX INFO: renamed from: l */
    private Handler f61003l;

    /* JADX INFO: renamed from: m */
    private boolean f61004m;

    /* JADX INFO: renamed from: n */
    private QQToken f61005n;

    public class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TDialog.this.f61002k != null) {
                TDialog.this.f61002k.setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.m85496v("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TDialog.this.f60999h.onError(new UiError(i, str, str2));
            if (TDialog.this.f60997e != null && TDialog.this.f60997e.get() != null) {
                Toast.makeText((Context) TDialog.this.f60997e.get(), "网络连接异常或系统错误", 0).show();
            }
            TDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.m85496v("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(C14556k.m85609a().m85610a((Context) TDialog.this.f60997e.get(), "auth://tauth.qq.com/"))) {
                TDialog.this.f60999h.onComplete(C14559n.m85675c(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                TDialog.this.f60999h.onCancel();
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (!str.startsWith(Constants.DOWNLOAD_URI) && !str.endsWith(ShareConstants.PATCH_SUFFIX)) {
                return str.startsWith("auth://progress");
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                if (TDialog.this.f60997e != null && TDialog.this.f60997e.get() != null) {
                    ((Context) TDialog.this.f60997e.get()).startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public class JsListener extends C14521b.b {
        private JsListener() {
        }

        public void onAddShare(String str) {
            SLog.m85488d("openSDK_LOG.TDialog", "JsListener onAddShare");
            onComplete(str);
        }

        public void onCancel(String str) {
            SLog.m85490e("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + str);
            TDialog.this.f61003l.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void onCancelAddShare(String str) {
            SLog.m85490e("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + str);
            onCancel("cancel");
        }

        public void onCancelInvite() {
            SLog.m85490e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
            onCancel("");
        }

        public void onCancelLogin() {
            onCancel("");
        }

        public void onComplete(String str) {
            TDialog.this.f61003l.obtainMessage(1, str).sendToTarget();
            SLog.m85490e("openSDK_LOG.TDialog", "JsListener onComplete" + str);
            TDialog.this.dismiss();
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onLoad(String str) {
            TDialog.this.f61003l.obtainMessage(4, str).sendToTarget();
        }

        public void showMsg(String str) {
            TDialog.this.f61003l.obtainMessage(3, str).sendToTarget();
        }
    }

    public class THandler extends Handler {

        /* JADX INFO: renamed from: b */
        private OnTimeListener f61015b;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.f61015b = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.m85488d("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            int i = message.what;
            if (i == 1) {
                this.f61015b.m85391a((String) message.obj);
                return;
            }
            if (i == 2) {
                this.f61015b.onCancel();
                return;
            }
            if (i == 3) {
                if (TDialog.this.f60997e == null || TDialog.this.f60997e.get() == null) {
                    return;
                }
                TDialog.m85386c((Context) TDialog.this.f60997e.get(), (String) message.obj);
                return;
            }
            if (i != 5 || TDialog.this.f60997e == null || TDialog.this.f60997e.get() == null) {
                return;
            }
            TDialog.m85388d((Context) TDialog.this.f60997e.get(), (String) message.obj);
        }
    }

    public TDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f61004m = false;
        this.f61005n = null;
        this.f60997e = new WeakReference<>(context);
        this.f60998g = str2;
        this.f60999h = new OnTimeListener(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f61003l = new THandler(this.f60999h, context.getMainLooper());
        this.f61000i = iUiListener;
        this.f61005n = qQToken;
    }

    /* JADX INFO: renamed from: a */
    private void m85380a() {
        try {
            new TextView(this.f60997e.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C14532b c14532b = new C14532b(this.f60997e.get());
            this.f61002k = c14532b;
            c14532b.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C14533c c14533c = new C14533c(this.f60997e.get());
            this.f61001j = c14533c;
            c14533c.setLayoutParams(layoutParams);
            this.f61001j.setBackgroundColor(-1);
            this.f61001j.addView(this.f61002k);
            setContentView(this.f61001j);
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.TDialog", "onCreateView exception", th);
            C14512a.m85392a(this, this.f61003l);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: b */
    private void m85383b() {
        C14532b c14532b = this.f61002k;
        if (c14532b != null) {
            c14532b.setVerticalScrollBarEnabled(false);
            this.f61002k.setHorizontalScrollBarEnabled(false);
            this.f61002k.setWebViewClient(new FbWebViewClient());
            this.f61002k.setWebChromeClient(this.f61080b);
            this.f61002k.clearFormData();
            WebSettings settings = this.f61002k.getSettings();
            if (settings == null) {
                return;
            }
            C14562a.m85702a(this.f61002k);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            WeakReference<Context> weakReference = this.f60997e;
            if (weakReference != null && weakReference.get() != null) {
                settings.setDatabaseEnabled(true);
                settings.setDatabasePath(this.f60997e.get().getApplicationContext().getDir("databases", 0).getPath());
            }
            settings.setDomStorageEnabled(true);
            this.f61079a.m85423a(new JsListener(), "sdk_js_if");
            this.f61002k.loadUrl(this.f60998g);
            this.f61002k.setLayoutParams(f60994c);
            this.f61002k.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m85386c(Context context, String str) {
        try {
            JSONObject jSONObjectM85678d = C14559n.m85678d(str);
            int i = jSONObjectM85678d.getInt("type");
            String string = jSONObjectM85678d.getString("msg");
            if (i == 0) {
                Toast toast = f60995d;
                if (toast == null) {
                    f60995d = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f60995d.setText(string);
                    f60995d.setDuration(0);
                }
                f60995d.show();
                return;
            }
            if (i == 1) {
                Toast toast2 = f60995d;
                if (toast2 == null) {
                    f60995d = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f60995d.setText(string);
                    f60995d.setDuration(1);
                }
                f60995d.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m85388d(Context context, String str) {
        WeakReference<ProgressDialog> weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM85678d = C14559n.m85678d(str);
            int i = jSONObjectM85678d.getInt("action");
            String string = jSONObjectM85678d.getString("msg");
            if (i != 1) {
                if (i != 0 || (weakReference = f60996f) == null || weakReference.get() == null || !f60996f.get().isShowing()) {
                    return;
                }
                f60996f.get().dismiss();
                f60996f = null;
                return;
            }
            WeakReference<ProgressDialog> weakReference2 = f60996f;
            if (weakReference2 != null && weakReference2.get() != null) {
                f60996f.get().setMessage(string);
                if (f60996f.get().isShowing()) {
                    return;
                }
                f60996f.get().show();
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(string);
            f60996f = new WeakReference<>(progressDialog);
            progressDialog.show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        OnTimeListener onTimeListener = this.f60999h;
        if (onTimeListener != null) {
            onTimeListener.onCancel();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.AbstractDialogC14530c, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C14512a.m85393a(getWindow());
        m85380a();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.open.TDialog.1
            @Override // java.lang.Runnable
            public void run() {
                View decorView;
                View childAt;
                Window window = TDialog.this.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
                    return;
                }
                childAt.setPadding(0, 0, 0, 0);
            }
        });
        m85383b();
    }

    public static class OnTimeListener extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        String f61009a;

        /* JADX INFO: renamed from: b */
        String f61010b;

        /* JADX INFO: renamed from: c */
        private WeakReference<Context> f61011c;

        /* JADX INFO: renamed from: d */
        private String f61012d;

        /* JADX INFO: renamed from: e */
        private IUiListener f61013e;

        public OnTimeListener(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f61011c = new WeakReference<>(context);
            this.f61012d = str;
            this.f61009a = str2;
            this.f61010b = str3;
            this.f61013e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m85391a(String str) {
            try {
                onComplete(C14559n.m85678d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f61013e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f61013e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C14529h.m85459a().m85463a(this.f61012d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f61009a, false);
            IUiListener iUiListener = this.f61013e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f61013e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f61009a;
            } else {
                str = this.f61009a;
            }
            String str2 = str;
            C14529h.m85459a().m85463a(this.f61012d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            IUiListener iUiListener = this.f61013e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f61013e = null;
            }
        }
    }

    @Override // com.tencent.open.AbstractDialogC14530c
    /* JADX INFO: renamed from: a */
    public void mo85389a(String str) {
        SLog.m85488d("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f61079a.mo85425a(this.f61002k, str);
        } catch (Exception unused) {
        }
    }
}
