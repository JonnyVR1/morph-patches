package p009l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.p1.mobile.putong.app.web.WebViewClientX;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.du2;
import l.vip0;
import l.w9j;
import l.wip0;
import l.xip0;
import l.yip0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sw3 extends WebViewClientX {
    public static String EMPTY_PAGE = "about:blank";
    private Context context;
    private boolean error;
    private boolean hardwareAccelerated;
    private InterfaceC1195a listener;
    private w9j<wip0, xip0> mInterceptRequestFunc;
    private w9j<String, Boolean> overrideUrlLoading;

    /* JADX INFO: renamed from: l.sw3$a */
    public interface InterfaceC1195a {
        /* JADX INFO: renamed from: a */
        void mo552a(String str);

        /* JADX INFO: renamed from: b */
        void mo553b(String str);

        /* JADX INFO: renamed from: c */
        void mo554c(int i, String str, String str2);
    }

    public sw3(Context context, w9j<String, Boolean> w9jVar, boolean z) {
        this.context = context;
        this.overrideUrlLoading = w9jVar;
        this.hardwareAccelerated = z;
    }

    public void onPageFinishedX(WebViewX webViewX, String str) {
        du2.a("[common][webview]", "onPageFinishedX url : " + str);
        webViewX.setLayerType(0, null);
        super.onPageFinishedX(webViewX, str);
        if (!this.error) {
            webViewX.setVisibility(0);
        }
        if (NullChecker.a(this.listener)) {
            this.listener.mo552a(str);
        }
    }

    public void onPageStartedX(WebViewX webViewX, String str, Bitmap bitmap) {
        du2.a("[common][webview]", "onPageStartedX url : " + str);
        webViewX.setLayerType(2, null);
        super.onPageStartedX(webViewX, str, bitmap);
        this.error = false;
        if (NullChecker.a(this.listener)) {
            this.listener.mo553b(str);
        }
    }

    public void onReceivedErrorX(WebViewX webViewX, wip0 wip0Var, vip0 vip0Var) {
        super.onReceivedErrorX(webViewX, wip0Var, vip0Var);
        du2.a("[common][webview]", "onReceivedErrorX errorCode : " + vip0Var.b() + "description : " + ((Object) vip0Var.a()));
    }

    @RequiresApi(api = 23)
    public void onReceivedHttpErrorX(WebViewX webViewX, wip0 wip0Var, yip0 yip0Var) {
        super.onReceivedHttpErrorX(webViewX, wip0Var, yip0Var);
        if (!NullChecker.a(wip0Var.getUrl()) || TextUtils.isEmpty(wip0Var.getUrl().getPath()) || wip0Var.isForMainFrame() || !wip0Var.getUrl().getPath().endsWith("/favicon.ico")) {
            du2.a("[common][webview]", "onReceivedHttpErrorX errorCode : " + yip0Var.d + "description : " + yip0Var.e);
        }
    }

    public void setInterceptRequestFunc(w9j<wip0, xip0> w9jVar) {
        this.mInterceptRequestFunc = w9jVar;
    }

    public void setListener(InterfaceC1195a interfaceC1195a) {
        this.listener = interfaceC1195a;
    }

    public xip0 shouldInterceptRequestX(WebViewX webViewX, wip0 wip0Var) {
        w9j<wip0, xip0> w9jVar = this.mInterceptRequestFunc;
        return w9jVar != null ? (xip0) w9jVar.call(wip0Var) : super.shouldInterceptRequestX(webViewX, wip0Var);
    }

    public boolean shouldOverrideUrlLoadingX(WebViewX webViewX, String str) {
        if (str.startsWith("tel:")) {
            try {
                this.context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            } catch (Exception e) {
                CrashHelper.c(new Exception("CWebViewClient shouldOverrideUrlLoading:" + e.getMessage(), e));
            }
            return true;
        }
        if (str.startsWith("sms:") || str.startsWith("smsto:") || str.startsWith("geo:") || str.startsWith("market:")) {
            try {
                this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception e2) {
                CrashHelper.c(new Exception("CWebViewClient shouldOverrideUrlLoading:" + e2.getMessage(), e2));
            }
            return true;
        }
        if (str.startsWith("mailto:")) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse(str));
                this.context.startActivity(intent);
            } catch (ActivityNotFoundException e3) {
                CrashHelper.c(e3);
            }
            return true;
        }
        if (epq.m14090a(str)) {
            epq.m14092c(this.context, str);
            return true;
        }
        if (NullChecker.a(this.overrideUrlLoading)) {
            return ((Boolean) this.overrideUrlLoading.call(str)).booleanValue();
        }
        if (zvp.INSTANCE.m25985b(webViewX, str, this.context)) {
            return true;
        }
        return super.shouldOverrideUrlLoadingX(webViewX, str);
    }

    public sw3(Context context) {
        this(context, null, false);
    }

    public void onReceivedErrorX(WebViewX webViewX, int i, String str, String str2) {
        super.onReceivedErrorX(webViewX, i, str, str2);
        this.error = true;
        webViewX.loadUrl(EMPTY_PAGE);
        webViewX.setVisibility(4);
        if (NullChecker.a(this.listener)) {
            this.listener.mo554c(i, str, str2);
        }
    }
}
