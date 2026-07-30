package p153l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.p051p1.mobile.putong.app.web.WebViewClientX;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class rx3 extends WebViewClientX {
    public static String EMPTY_PAGE = "about:blank";
    private Context context;
    private boolean error;
    private boolean hardwareAccelerated;
    private InterfaceC19928a listener;
    private qcj<bsp0, csp0> mInterceptRequestFunc;
    private qcj<String, Boolean> overrideUrlLoading;

    /* JADX INFO: renamed from: l.rx3$a */
    public interface InterfaceC19928a {
        /* JADX INFO: renamed from: a */
        void mo37613a(String str);

        /* JADX INFO: renamed from: b */
        void mo37614b(String str);

        /* JADX INFO: renamed from: c */
        void mo37615c(int i, String str, String str2);
    }

    public rx3(Context context, qcj<String, Boolean> qcjVar, boolean z) {
        this.context = context;
        this.overrideUrlLoading = qcjVar;
        this.hardwareAccelerated = z;
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    public void onPageFinishedX(WebViewX webViewX, String str) {
        tu2.m192703a("[common][webview]", "onPageFinishedX url : " + str);
        webViewX.setLayerType(0, null);
        super.onPageFinishedX(webViewX, str);
        if (!this.error) {
            webViewX.setVisibility(0);
        }
        if (NullChecker.m82486a(this.listener)) {
            this.listener.mo37613a(str);
        }
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    public void onPageStartedX(WebViewX webViewX, String str, Bitmap bitmap) {
        tu2.m192703a("[common][webview]", "onPageStartedX url : " + str);
        webViewX.setLayerType(2, null);
        super.onPageStartedX(webViewX, str, bitmap);
        this.error = false;
        if (NullChecker.m82486a(this.listener)) {
            this.listener.mo37614b(str);
        }
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    public void onReceivedErrorX(WebViewX webViewX, bsp0 bsp0Var, asp0 asp0Var) {
        super.onReceivedErrorX(webViewX, bsp0Var, asp0Var);
        tu2.m192703a("[common][webview]", "onReceivedErrorX errorCode : " + asp0Var.m99964b() + "description : " + ((Object) asp0Var.m99963a()));
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    @RequiresApi(api = 23)
    public void onReceivedHttpErrorX(WebViewX webViewX, bsp0 bsp0Var, dsp0 dsp0Var) {
        super.onReceivedHttpErrorX(webViewX, bsp0Var, dsp0Var);
        if (!NullChecker.m82486a(bsp0Var.getUrl()) || TextUtils.isEmpty(bsp0Var.getUrl().getPath()) || bsp0Var.isForMainFrame() || !bsp0Var.getUrl().getPath().endsWith("/favicon.ico")) {
            tu2.m192703a("[common][webview]", "onReceivedHttpErrorX errorCode : " + dsp0Var.f90505d + "description : " + dsp0Var.f90506e);
        }
    }

    public void setInterceptRequestFunc(qcj<bsp0, csp0> qcjVar) {
        this.mInterceptRequestFunc = qcjVar;
    }

    public void setListener(InterfaceC19928a interfaceC19928a) {
        this.listener = interfaceC19928a;
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    public csp0 shouldInterceptRequestX(WebViewX webViewX, bsp0 bsp0Var) {
        qcj<bsp0, csp0> qcjVar = this.mInterceptRequestFunc;
        return qcjVar != null ? qcjVar.call(bsp0Var) : super.shouldInterceptRequestX(webViewX, bsp0Var);
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    public boolean shouldOverrideUrlLoadingX(WebViewX webViewX, String str) {
        if (str.startsWith("tel:")) {
            try {
                this.context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("CWebViewClient shouldOverrideUrlLoading:" + e.getMessage(), e));
            }
            return true;
        }
        if (str.startsWith("sms:") || str.startsWith("smsto:") || str.startsWith("geo:") || str.startsWith("market:")) {
            try {
                this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception e2) {
                CrashHelper.m82479c(new Exception("CWebViewClient shouldOverrideUrlLoading:" + e2.getMessage(), e2));
            }
            return true;
        }
        if (str.startsWith("mailto:")) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse(str));
                this.context.startActivity(intent);
            } catch (ActivityNotFoundException e3) {
                CrashHelper.m82479c(e3);
            }
            return true;
        }
        if (erq.m122256a(str)) {
            erq.m122258c(this.context, str);
            return true;
        }
        if (NullChecker.m82486a(this.overrideUrlLoading)) {
            return this.overrideUrlLoading.call(str).booleanValue();
        }
        if (zxp.INSTANCE.m222061b(webViewX, str, this.context)) {
            return true;
        }
        return super.shouldOverrideUrlLoadingX(webViewX, str);
    }

    public rx3(Context context) {
        this(context, null, false);
    }

    @Override // com.p051p1.mobile.putong.app.web.WebViewClientX
    public void onReceivedErrorX(WebViewX webViewX, int i, String str, String str2) {
        super.onReceivedErrorX(webViewX, i, str, str2);
        this.error = true;
        webViewX.loadUrl(EMPTY_PAGE);
        webViewX.setVisibility(4);
        if (NullChecker.m82486a(this.listener)) {
            this.listener.mo37615c(i, str, str2);
        }
    }
}
