package immomo.com.mklibrary.core.base.p115ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.p069ss.bytertc.engine.type.ErrorCode;
import com.tencent.liteav.TXLiteAVCode;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import org.json.JSONArray;
import p149l.df3;
import p149l.fnl;
import p149l.foq;
import p149l.ggj0;
import p149l.miw;
import p149l.mxv;
import p149l.qkq0;
import p149l.shw;
import p149l.wul;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MKWebViewHelper implements wul {

    /* JADX INFO: renamed from: j */
    private static final String f63283j = "MKWebViewHelper";

    /* JADX INFO: renamed from: a */
    private String f63284a;

    /* JADX INFO: renamed from: e */
    private WeakReference<Activity> f63288e;

    /* JADX INFO: renamed from: f */
    private WeakReference<Fragment> f63289f;

    /* JADX INFO: renamed from: h */
    protected MKWebView f63291h;

    /* JADX INFO: renamed from: b */
    private boolean f63285b = false;

    /* JADX INFO: renamed from: c */
    private boolean f63286c = false;

    /* JADX INFO: renamed from: d */
    private boolean f63287d = false;

    /* JADX INFO: renamed from: g */
    protected wul f63290g = this;

    /* JADX INFO: renamed from: i */
    private BroadcastReceiver f63292i = new BroadcastReceiver() { // from class: immomo.com.mklibrary.core.base.ui.MKWebViewHelper.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (!"mk.close.close_all_page".equals(action)) {
                if ("mk.close.close_other_page".equals(action)) {
                    if (MKWebViewHelper.this.f63284a.equals(intent.getStringExtra("webview_id"))) {
                        return;
                    }
                    MKWebViewHelper.this.f63290g.closePage();
                    mxv.m156927b(MKWebViewHelper.f63283j, "关闭其他页面");
                    return;
                }
                return;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("url");
            if (stringArrayExtra != null) {
                for (String str : stringArrayExtra) {
                    if (TextUtils.equals(str, MKWebViewHelper.this.f63291h.getOriginURL())) {
                        return;
                    }
                }
            }
            MKWebViewHelper.this.f63290g.closePage();
            mxv.m156927b(MKWebViewHelper.f63283j, "关闭所有页面");
        }
    };

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebViewHelper$a */
    public interface InterfaceC14920a {
        /* JADX INFO: renamed from: a */
        void mo87121a(MKWebView mKWebView);
    }

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.base.ui.MKWebViewHelper$b */
    public static class C14921b extends miw {

        /* JADX INFO: renamed from: a */
        private wul f63294a;

        public C14921b(wul wulVar) {
            this.f63294a = wulVar;
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: a */
        public boolean mo87122a(ConsoleMessage consoleMessage) {
            return super.mo87122a(consoleMessage);
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            mxv.m156926a(MKWebViewHelper.f63283j, "tang------页面加载错误 " + str2 + "   " + i);
            wul wulVar = this.f63294a;
            if (wulVar != null) {
                wulVar.mo87109c(webView, i, str, str2);
            }
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
            wul wulVar = this.f63294a;
            if (wulVar != null) {
                wulVar.mo87108b(webView, str);
            }
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            super.mo43913g(webView, str, bitmap);
            wul wulVar = this.f63294a;
            if (wulVar != null) {
                wulVar.mo87107a(webView, str, bitmap);
            }
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: k */
        public void mo87123k(WebView webView, String str) {
            mxv.m156926a(MKWebViewHelper.f63283j, "tang-----onReceiveTitle " + str + "  " + webView.getUrl());
            super.mo87123k(webView, str);
            wul wulVar = this.f63294a;
            if (wulVar != null) {
                wulVar.mo87113j(webView, str);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m87102r() {
        if (this.f63286c) {
            return;
        }
        qkq0.m175383a("make sure bindActivity or bindFragment has been called");
    }

    /* JADX INFO: renamed from: s */
    public static String[] m87103s(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            strArr[i] = objOpt != null ? objOpt.toString() : null;
        }
        return strArr;
    }

    /* JADX INFO: renamed from: t */
    private void m87104t(String str) {
        int iIntValue;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("_ui");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            } else {
                iIntValue = Integer.valueOf(queryParameter).intValue();
            }
        } catch (Exception unused) {
            iIntValue = -1;
        }
        mxv.m156926a(f63283j, "tang------ _ui参数是 " + iIntValue);
        if (iIntValue <= 0) {
            this.f63290g.mo139037e(true);
            this.f63290g.mo87115l(false);
            return;
        }
        ggj0 ggj0Var = new ggj0(iIntValue);
        if (ggj0Var.m125983d()) {
            this.f63290g.mo96738f();
        }
        boolean zM125981b = ggj0Var.m125981b();
        wul wulVar = this.f63290g;
        if (zM125981b) {
            if (wulVar.mo87112i() != null) {
                this.f63290g.mo87112i().setRequestedOrientation(0);
            }
        } else if (wulVar.mo87112i() != null) {
            boolean zM125980a = ggj0Var.m125980a();
            wul wulVar2 = this.f63290g;
            if (zM125980a) {
                wulVar2.mo87112i().setRequestedOrientation(-1);
            } else {
                wulVar2.mo87112i().setRequestedOrientation(1);
            }
        }
        boolean zM125984e = ggj0Var.m125984e();
        wul wulVar3 = this.f63290g;
        if (zM125984e) {
            wulVar3.mo87115l(true);
        } else {
            wulVar3.mo87115l(false);
        }
        this.f63290g.mo139037e((zM125984e || ggj0Var.m125982c()) ? false : true);
    }

    /* JADX INFO: renamed from: u */
    private void m87105u() {
        if (this.f63287d) {
            return;
        }
        this.f63284a = shw.m184281a();
        m87106w();
        this.f63291h.setPageUID(this.f63284a);
        this.f63291h.setMKWebLoadListener(new C14921b(this));
        this.f63291h.setWebUserAgent(shw.m184291k());
        this.f63287d = true;
    }

    /* JADX INFO: renamed from: w */
    private void m87106w() {
        df3.m111426b(this.f63290g.mo87112i(), this.f63292i, "mk.close.close_all_page", "mk.close.close_other_page");
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: a */
    public final void mo87107a(WebView webView, String str, Bitmap bitmap) {
        this.f63290g.mo96738f();
        m87104t(str);
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: b */
    public void mo87108b(WebView webView, String str) {
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: c */
    public final void mo87109c(WebView webView, int i, String str, String str2) {
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: d */
    public void mo87110d() {
        foq bridgeProcessor;
        df3.m111428d(this.f63290g.mo87112i(), this.f63292i);
        MKWebView mKWebView = this.f63291h;
        if (mKWebView != null && (bridgeProcessor = mKWebView.getBridgeProcessor()) != null) {
            bridgeProcessor.m122483d();
        }
        MKWebView mKWebView2 = this.f63291h;
        if (mKWebView2 != null) {
            mKWebView2.m87078C0();
            this.f63291h = null;
        }
    }

    @Override // p149l.ahw
    /* JADX INFO: renamed from: h */
    public final void mo87111h(String str) {
        this.f63290g.mo139038g(str);
    }

    @Override // p149l.jiw
    /* JADX INFO: renamed from: i */
    public Activity mo87112i() {
        WeakReference<Activity> weakReference = this.f63288e;
        if (weakReference != null) {
            return weakReference.get();
        }
        WeakReference<Fragment> weakReference2 = this.f63289f;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        return this.f63289f.get().getActivity();
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: j */
    public void mo87113j(WebView webView, String str) {
        this.f63290g.mo87111h(str);
    }

    @Override // p149l.ahw
    @Deprecated
    /* JADX INFO: renamed from: k */
    public void mo87114k(String str, String str2) {
        m87105u();
        this.f63291h.setWebUserAgent(str);
    }

    @Override // p149l.ahw
    /* JADX INFO: renamed from: l */
    public void mo87115l(boolean z) {
        try {
            Activity activityMo87112i = this.f63290g.mo87112i();
            if (activityMo87112i == null) {
                return;
            }
            Window window = activityMo87112i.getWindow();
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (z) {
                attributes.flags |= 1024;
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                    systemUiVisibility |= TXLiteAVCode.EVT_SW_ENCODER_START_SUCC;
                }
            } else {
                attributes.flags &= ErrorCode.ERROR_CODE_JOIN_ROOM_ROOM_FORBIDDEN;
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 0;
                    systemUiVisibility &= -5;
                }
            }
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
            this.f63290g.mo139037e(!z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: m */
    public void mo87116m() {
        MKWebView mKWebView;
        if (this.f63290g.mo87112i() == null || (mKWebView = this.f63291h) == null) {
            return;
        }
        mKWebView.m87079D0(this.f63285b);
        this.f63285b = false;
    }

    @Override // p149l.wul
    /* JADX INFO: renamed from: n */
    public void mo87117n() {
        MKWebView mKWebView;
        if (this.f63290g.mo87112i() == null || (mKWebView = this.f63291h) == null) {
            return;
        }
        mKWebView.onResume();
    }

    /* JADX INFO: renamed from: q */
    public void m87118q(Activity activity, MKWebView mKWebView) {
        if (this.f63289f != null) {
            throw new InvalidParameterException("bindFragment 已经调用，不能再 bindActivity");
        }
        this.f63288e = new WeakReference<>(activity);
        this.f63291h = mKWebView;
        this.f63286c = true;
        m87105u();
    }

    /* JADX INFO: renamed from: v */
    public final void m87119v(@NonNull String str, @NonNull fnl fnlVar) {
        foq bridgeProcessor;
        m87102r();
        MKWebView mKWebView = this.f63291h;
        if (mKWebView == null || (bridgeProcessor = mKWebView.getBridgeProcessor()) == null) {
            return;
        }
        bridgeProcessor.m122487h(str, fnlVar);
    }

    /* JADX INFO: renamed from: x */
    public void m87120x(InterfaceC14920a interfaceC14920a) {
        m87102r();
        MKWebView mKWebView = this.f63291h;
        if (mKWebView != null) {
            interfaceC14920a.mo87121a(mKWebView);
        }
    }
}
