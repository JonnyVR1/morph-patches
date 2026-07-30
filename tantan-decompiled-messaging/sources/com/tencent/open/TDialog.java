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
import com.tencent.open.p105b.C14366h;
import com.tencent.open.p106c.C14369b;
import com.tencent.open.p106c.C14370c;
import com.tencent.open.utils.C14393k;
import com.tencent.open.utils.C14396n;
import com.tencent.open.web.C14399a;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TDialog extends AbstractDialogC14367c {

    /* JADX INFO: renamed from: c */
    static final FrameLayout.LayoutParams f60146c = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: d */
    static Toast f60147d = null;

    /* JADX INFO: renamed from: f */
    private static WeakReference<ProgressDialog> f60148f;

    /* JADX INFO: renamed from: e */
    private WeakReference<Context> f60149e;

    /* JADX INFO: renamed from: g */
    private String f60150g;

    /* JADX INFO: renamed from: h */
    private OnTimeListener f60151h;

    /* JADX INFO: renamed from: i */
    private IUiListener f60152i;

    /* JADX INFO: renamed from: j */
    private FrameLayout f60153j;

    /* JADX INFO: renamed from: k */
    private C14369b f60154k;

    /* JADX INFO: renamed from: l */
    private Handler f60155l;

    /* JADX INFO: renamed from: m */
    private boolean f60156m;

    /* JADX INFO: renamed from: n */
    private QQToken f60157n;

    public class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TDialog.this.f60154k != null) {
                TDialog.this.f60154k.setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.m84313v("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TDialog.this.f60151h.onError(new UiError(i, str, str2));
            if (TDialog.this.f60149e != null && TDialog.this.f60149e.get() != null) {
                Toast.makeText((Context) TDialog.this.f60149e.get(), "网络连接异常或系统错误", 0).show();
            }
            TDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.m84313v("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(C14393k.m84426a().m84427a((Context) TDialog.this.f60149e.get(), "auth://tauth.qq.com/"))) {
                TDialog.this.f60151h.onComplete(C14396n.m84492c(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                TDialog.this.f60151h.onCancel();
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
                intent.addFlags(268435456);
                if (TDialog.this.f60149e != null && TDialog.this.f60149e.get() != null) {
                    ((Context) TDialog.this.f60149e.get()).startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public class JsListener extends C14358b.b {
        private JsListener() {
        }

        public void onAddShare(String str) {
            SLog.m84305d("openSDK_LOG.TDialog", "JsListener onAddShare");
            onComplete(str);
        }

        public void onCancel(String str) {
            SLog.m84307e("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + str);
            TDialog.this.f60155l.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void onCancelAddShare(String str) {
            SLog.m84307e("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + str);
            onCancel("cancel");
        }

        public void onCancelInvite() {
            SLog.m84307e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
            onCancel("");
        }

        public void onCancelLogin() {
            onCancel("");
        }

        public void onComplete(String str) {
            TDialog.this.f60155l.obtainMessage(1, str).sendToTarget();
            SLog.m84307e("openSDK_LOG.TDialog", "JsListener onComplete" + str);
            TDialog.this.dismiss();
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onLoad(String str) {
            TDialog.this.f60155l.obtainMessage(4, str).sendToTarget();
        }

        public void showMsg(String str) {
            TDialog.this.f60155l.obtainMessage(3, str).sendToTarget();
        }
    }

    public class THandler extends Handler {

        /* JADX INFO: renamed from: b */
        private OnTimeListener f60167b;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.f60167b = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.m84305d("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            int i = message.what;
            if (i == 1) {
                this.f60167b.m84208a((String) message.obj);
                return;
            }
            if (i == 2) {
                this.f60167b.onCancel();
                return;
            }
            if (i == 3) {
                if (TDialog.this.f60149e == null || TDialog.this.f60149e.get() == null) {
                    return;
                }
                TDialog.m84203c((Context) TDialog.this.f60149e.get(), (String) message.obj);
                return;
            }
            if (i != 5 || TDialog.this.f60149e == null || TDialog.this.f60149e.get() == null) {
                return;
            }
            TDialog.m84205d((Context) TDialog.this.f60149e.get(), (String) message.obj);
        }
    }

    public TDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f60156m = false;
        this.f60157n = null;
        this.f60149e = new WeakReference<>(context);
        this.f60150g = str2;
        this.f60151h = new OnTimeListener(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f60155l = new THandler(this.f60151h, context.getMainLooper());
        this.f60152i = iUiListener;
        this.f60157n = qQToken;
    }

    /* JADX INFO: renamed from: a */
    private void m84197a() {
        try {
            new TextView(this.f60149e.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C14369b c14369b = new C14369b(this.f60149e.get());
            this.f60154k = c14369b;
            c14369b.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C14370c c14370c = new C14370c(this.f60149e.get());
            this.f60153j = c14370c;
            c14370c.setLayoutParams(layoutParams);
            this.f60153j.setBackgroundColor(-1);
            this.f60153j.addView(this.f60154k);
            setContentView(this.f60153j);
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.TDialog", "onCreateView exception", th);
            C14349a.m84209a(this, this.f60155l);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: b */
    private void m84200b() {
        C14369b c14369b = this.f60154k;
        if (c14369b != null) {
            c14369b.setVerticalScrollBarEnabled(false);
            this.f60154k.setHorizontalScrollBarEnabled(false);
            this.f60154k.setWebViewClient(new FbWebViewClient());
            this.f60154k.setWebChromeClient(this.f60232b);
            this.f60154k.clearFormData();
            WebSettings settings = this.f60154k.getSettings();
            if (settings == null) {
                return;
            }
            C14399a.m84519a(this.f60154k);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            WeakReference<Context> weakReference = this.f60149e;
            if (weakReference != null && weakReference.get() != null) {
                settings.setDatabaseEnabled(true);
                settings.setDatabasePath(this.f60149e.get().getApplicationContext().getDir("databases", 0).getPath());
            }
            settings.setDomStorageEnabled(true);
            this.f60231a.m84240a(new JsListener(), "sdk_js_if");
            this.f60154k.loadUrl(this.f60150g);
            this.f60154k.setLayoutParams(f60146c);
            this.f60154k.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m84203c(Context context, String str) {
        try {
            JSONObject jSONObjectM84495d = C14396n.m84495d(str);
            int i = jSONObjectM84495d.getInt("type");
            String string = jSONObjectM84495d.getString("msg");
            if (i == 0) {
                Toast toast = f60147d;
                if (toast == null) {
                    f60147d = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f60147d.setText(string);
                    f60147d.setDuration(0);
                }
                f60147d.show();
                return;
            }
            if (i == 1) {
                Toast toast2 = f60147d;
                if (toast2 == null) {
                    f60147d = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f60147d.setText(string);
                    f60147d.setDuration(1);
                }
                f60147d.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m84205d(Context context, String str) {
        WeakReference<ProgressDialog> weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM84495d = C14396n.m84495d(str);
            int i = jSONObjectM84495d.getInt("action");
            String string = jSONObjectM84495d.getString("msg");
            if (i != 1) {
                if (i != 0 || (weakReference = f60148f) == null || weakReference.get() == null || !f60148f.get().isShowing()) {
                    return;
                }
                f60148f.get().dismiss();
                f60148f = null;
                return;
            }
            WeakReference<ProgressDialog> weakReference2 = f60148f;
            if (weakReference2 != null && weakReference2.get() != null) {
                f60148f.get().setMessage(string);
                if (f60148f.get().isShowing()) {
                    return;
                }
                f60148f.get().show();
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(string);
            f60148f = new WeakReference<>(progressDialog);
            progressDialog.show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        OnTimeListener onTimeListener = this.f60151h;
        if (onTimeListener != null) {
            onTimeListener.onCancel();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.AbstractDialogC14367c, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C14349a.m84210a(getWindow());
        m84197a();
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
        m84200b();
    }

    public static class OnTimeListener extends DefaultUiListener {

        /* JADX INFO: renamed from: a */
        String f60161a;

        /* JADX INFO: renamed from: b */
        String f60162b;

        /* JADX INFO: renamed from: c */
        private WeakReference<Context> f60163c;

        /* JADX INFO: renamed from: d */
        private String f60164d;

        /* JADX INFO: renamed from: e */
        private IUiListener f60165e;

        public OnTimeListener(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f60163c = new WeakReference<>(context);
            this.f60164d = str;
            this.f60161a = str2;
            this.f60162b = str3;
            this.f60165e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m84208a(String str) {
            try {
                onComplete(C14396n.m84495d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f60165e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f60165e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C14366h.m84276a().m84280a(this.f60164d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f60161a, false);
            IUiListener iUiListener = this.f60165e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f60165e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f60161a;
            } else {
                str = this.f60161a;
            }
            String str2 = str;
            C14366h.m84276a().m84280a(this.f60164d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            IUiListener iUiListener = this.f60165e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f60165e = null;
            }
        }
    }

    @Override // com.tencent.open.AbstractDialogC14367c
    /* JADX INFO: renamed from: a */
    public void mo84206a(String str) {
        SLog.m84305d("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f60231a.mo84242a(this.f60154k, str);
        } catch (Exception unused) {
        }
    }
}
