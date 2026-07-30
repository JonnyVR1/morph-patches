package com.hellogroup.p036mk.business.base.p037ui;

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
import com.hellogroup.p036mk.core.utils.globalevent.MKEventManager;
import com.hellogroup.p036mk.fdt.FDTManager;
import com.p074ss.bytertc.engine.type.ErrorCode;
import com.tencent.liteav.TXLiteAVCode;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.fqq;
import p153l.ilw;
import p153l.ipj0;
import p153l.jzv;
import p153l.nxl;
import p153l.qpl;
import p153l.rf3;
import p153l.sjw;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MKWebViewHelper implements nxl, MKEventManager.InterfaceC3606a {

    /* JADX INFO: renamed from: l */
    private static final String f12117l = "MKWebViewHelper";

    /* JADX INFO: renamed from: a */
    private String f12118a;

    /* JADX INFO: renamed from: b */
    private boolean f12119b;

    /* JADX INFO: renamed from: c */
    private boolean f12120c;

    /* JADX INFO: renamed from: d */
    private boolean f12121d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Activity> f12122e;

    /* JADX INFO: renamed from: f */
    private WeakReference<Fragment> f12123f;

    /* JADX INFO: renamed from: g */
    protected nxl f12124g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f12125h;

    /* JADX INFO: renamed from: i */
    protected MKWebView f12126i;

    /* JADX INFO: renamed from: j */
    private String f12127j;

    /* JADX INFO: renamed from: k */
    private BroadcastReceiver f12128k;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebViewHelper$a */
    public interface InterfaceC3520a {
        /* JADX INFO: renamed from: a */
        void mo17976a(MKWebView mKWebView);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.ui.MKWebViewHelper$b */
    public static class C3521b extends ilw {

        /* JADX INFO: renamed from: a */
        private nxl f12130a;

        public C3521b(nxl nxlVar) {
            this.f12130a = nxlVar;
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: a */
        public boolean mo17977a(ConsoleMessage consoleMessage) {
            return super.mo17977a(consoleMessage);
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            jzv.m147728a(MKWebViewHelper.f12117l, "tang------页面加载错误 " + str2 + "   " + i);
            nxl nxlVar = this.f12130a;
            if (nxlVar != null) {
                nxlVar.mo17962c(webView, i, str, str2);
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            nxl nxlVar = this.f12130a;
            if (nxlVar != null) {
                nxlVar.mo17961b(webView, str);
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            super.mo17980g(webView, str, bitmap);
            nxl nxlVar = this.f12130a;
            if (nxlVar != null) {
                nxlVar.mo17960a(webView, str, bitmap);
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: k */
        public void mo17981k(WebView webView, String str) {
            jzv.m147728a(MKWebViewHelper.f12117l, "tang-----onReceiveTitle " + str + "  " + webView.getUrl());
            super.mo17981k(webView, str);
            nxl nxlVar = this.f12130a;
            if (nxlVar != null) {
                nxlVar.mo17969n(webView, str);
            }
        }
    }

    public MKWebViewHelper(String str) {
        this.f12119b = false;
        this.f12120c = false;
        this.f12121d = false;
        this.f12124g = this;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f12125h = atomicBoolean;
        this.f12128k = new BroadcastReceiver() { // from class: com.hellogroup.mk.business.base.ui.MKWebViewHelper.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    return;
                }
                String action = intent.getAction();
                if (!"mk.close.close_all_page".equals(action)) {
                    if ("mk.close.close_other_page".equals(action)) {
                        if (MKWebViewHelper.this.f12118a.equals(intent.getStringExtra("webview_id"))) {
                            return;
                        }
                        MKWebViewHelper.this.f12124g.closePage();
                        jzv.m147729b(MKWebViewHelper.f12117l, "关闭其他页面");
                        return;
                    }
                    return;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("url");
                if (stringArrayExtra != null) {
                    for (String str2 : stringArrayExtra) {
                        if (TextUtils.equals(str2, MKWebViewHelper.this.f12126i.getOriginURL())) {
                            return;
                        }
                    }
                }
                MKWebViewHelper.this.f12124g.closePage();
                jzv.m147729b(MKWebViewHelper.f12117l, "关闭所有页面");
            }
        };
        if (FDTManager.INSTANCE.m18517f()) {
            MKEventManager.m18492b().m18494d(this, "native");
            atomicBoolean.set(true);
        }
        this.f12127j = str;
    }

    /* JADX INFO: renamed from: A */
    private void m17948A() {
        if (this.f12120c) {
            return;
        }
        wtq0.m207906a("make sure bindActivity or bindFragment has been called");
    }

    /* JADX INFO: renamed from: B */
    public static String[] m17949B(JSONArray jSONArray) {
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

    /* JADX INFO: renamed from: C */
    private void m17950C(String str) {
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
        jzv.m147728a(f12117l, "tang------ _ui参数是 " + iIntValue);
        boolean z = false;
        if (iIntValue <= 0) {
            this.f12124g.mo18038e(true);
            this.f12124g.mo17972t(false);
            return;
        }
        ipj0 ipj0Var = new ipj0(iIntValue);
        if (ipj0Var.m141485d()) {
            this.f12124g.mo18039f();
        }
        try {
            boolean zM141483b = ipj0Var.m141483b();
            nxl nxlVar = this.f12124g;
            if (zM141483b) {
                if (nxlVar.mo17967l() != null) {
                    this.f12124g.mo17967l().setRequestedOrientation(0);
                }
            } else if (nxlVar.mo17967l() != null) {
                boolean zM141482a = ipj0Var.m141482a();
                nxl nxlVar2 = this.f12124g;
                if (zM141482a) {
                    nxlVar2.mo17967l().setRequestedOrientation(-1);
                } else if (nxlVar2.mo17967l().getRequestedOrientation() != 1) {
                    this.f12124g.mo17967l().setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            jzv.m147730c(f12117l, "", th);
        }
        boolean zM141486e = ipj0Var.m141486e();
        nxl nxlVar3 = this.f12124g;
        if (zM141486e) {
            nxlVar3.mo17972t(true);
        } else {
            nxlVar3.mo17972t(false);
        }
        nxl nxlVar4 = this.f12124g;
        if (!zM141486e && !ipj0Var.m141484c()) {
            z = true;
        }
        nxlVar4.mo18038e(z);
    }

    /* JADX INFO: renamed from: D */
    private void m17951D() {
        if (this.f12121d) {
            return;
        }
        this.f12118a = sjw.m186314c();
        m17953I();
        this.f12126i.setPageUID(this.f12118a);
        this.f12126i.setMKWebLoadListener(new C3521b(this));
        this.f12126i.setWebUserAgent(sjw.m186321j(this.f12127j));
        this.f12121d = true;
    }

    /* JADX INFO: renamed from: F */
    public static void m17952F(MKWebView mKWebView, MKEventManager.Event event) {
        if (mKWebView == null || event == null || event.m18502e() == null) {
            return;
        }
        String str = (String) event.m18502e().get("pageID");
        String str2 = (String) event.m18502e().get("injectScriptCode");
        if (TextUtils.isEmpty(mKWebView.getWebViewId()) || !mKWebView.getWebViewId().equals(str)) {
            return;
        }
        mKWebView.loadUrl("javascript:" + str2);
    }

    /* JADX INFO: renamed from: I */
    private void m17953I() {
        rf3.m181164b(this.f12124g.mo17967l(), this.f12128k, "mk.close.close_all_page", "mk.close.close_other_page");
    }

    /* JADX INFO: renamed from: E */
    public void m17956E(int i, int i2, Intent intent) {
        MKWebView mKWebView = this.f12126i;
        if (mKWebView == null || mKWebView.getBridgeProcessor() == null) {
            return;
        }
        this.f12126i.getBridgeProcessor().m126791d(i, i2, intent);
    }

    /* JADX INFO: renamed from: G */
    public void m17957G(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        MKWebView mKWebView = this.f12126i;
        if (mKWebView == null || mKWebView.getBridgeProcessor() == null) {
            return;
        }
        this.f12126i.getBridgeProcessor().m126796l(i, strArr, iArr);
    }

    /* JADX INFO: renamed from: H */
    public final void m17958H(@NonNull String str, @NonNull qpl qplVar) {
        fqq bridgeProcessor;
        m17948A();
        MKWebView mKWebView = this.f12126i;
        if (mKWebView == null || (bridgeProcessor = mKWebView.getBridgeProcessor()) == null) {
            return;
        }
        bridgeProcessor.m126798n(str, qplVar);
    }

    /* JADX INFO: renamed from: J */
    public void m17959J(InterfaceC3520a interfaceC3520a) {
        m17948A();
        MKWebView mKWebView = this.f12126i;
        if (mKWebView != null) {
            interfaceC3520a.mo17976a(mKWebView);
        }
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: a */
    public final void mo17960a(WebView webView, String str, Bitmap bitmap) {
        this.f12124g.mo18039f();
        m17950C(str);
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: b */
    public void mo17961b(WebView webView, String str) {
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: c */
    public final void mo17962c(WebView webView, int i, String str, String str2) {
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: d */
    public void mo17963d() {
        fqq bridgeProcessor;
        rf3.m181166d(this.f12124g.mo17967l(), this.f12128k);
        MKWebView mKWebView = this.f12126i;
        if (mKWebView != null && (bridgeProcessor = mKWebView.getBridgeProcessor()) != null) {
            bridgeProcessor.m126793i();
        }
        MKWebView mKWebView2 = this.f12126i;
        if (mKWebView2 != null) {
            mKWebView2.m17915b1();
            this.f12126i = null;
        }
        FDTManager.INSTANCE.m18514b();
        if (this.f12125h.get()) {
            MKEventManager.m18492b().m18496f(this, "native");
        }
    }

    @Override // p153l.ziw
    /* JADX INFO: renamed from: h */
    public final void mo17964h(String str) {
        this.f12124g.mo18040g(str);
    }

    @Override // com.hellogroup.p036mk.core.utils.globalevent.MKEventManager.InterfaceC3606a
    /* JADX INFO: renamed from: i */
    public void mo17965i(MKEventManager.Event event) {
        if ("injectScript".equals(event.m18503f())) {
            m17952F(this.f12126i, event);
        }
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: j */
    public void mo17966j() {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: l */
    public Activity mo17967l() {
        WeakReference<Activity> weakReference = this.f12122e;
        if (weakReference != null) {
            return weakReference.get();
        }
        WeakReference<Fragment> weakReference2 = this.f12123f;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        return this.f12123f.get().getActivity();
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: m */
    public boolean mo17968m(String str, JSONObject jSONObject) {
        this.f12119b = true;
        return super.mo17968m(str, jSONObject);
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: n */
    public void mo17969n(WebView webView, String str) {
        this.f12124g.mo17964h(str);
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: q */
    public void mo17970q(JSONObject jSONObject) {
        int iOptInt = jSONObject != null ? jSONObject.optInt("type", 1) : 1;
        if (iOptInt == 2) {
            Intent intent = new Intent("mk.close.close_all_page");
            intent.putExtra("url", m17949B(jSONObject.optJSONArray("url")));
            rf3.m181165c(this.f12124g.mo17967l(), intent);
            this.f12124g.closePage();
            return;
        }
        if (iOptInt != 3) {
            this.f12124g.closePage();
            return;
        }
        Intent intent2 = new Intent("mk.close.close_other_page");
        intent2.putExtra("webview_id", this.f12118a);
        rf3.m181165c(this.f12124g.mo17967l(), intent2);
    }

    @Override // p153l.ziw
    @Deprecated
    /* JADX INFO: renamed from: s */
    public void mo17971s(String str, String str2) {
        m17951D();
        this.f12126i.setWebUserAgent(str);
    }

    @Override // p153l.ziw
    /* JADX INFO: renamed from: t */
    public void mo17972t(boolean z) {
        try {
            Activity activityMo17967l = this.f12124g.mo17967l();
            if (activityMo17967l == null) {
                return;
            }
            Window window = activityMo17967l.getWindow();
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
            this.f12124g.mo18038e(!z);
        } catch (Exception e) {
            jzv.m147730c(f12117l, "", e);
        }
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: u */
    public void mo17973u() {
        MKWebView mKWebView;
        if (this.f12124g.mo17967l() == null || (mKWebView = this.f12126i) == null) {
            return;
        }
        mKWebView.m17917c1(this.f12119b);
        this.f12119b = false;
    }

    @Override // p153l.nxl
    /* JADX INFO: renamed from: v */
    public void mo17974v() {
        MKWebView mKWebView;
        if (this.f12124g.mo17967l() == null || (mKWebView = this.f12126i) == null) {
            return;
        }
        mKWebView.onResume();
    }

    /* JADX INFO: renamed from: z */
    public void m17975z(Activity activity, MKWebView mKWebView) {
        if (this.f12123f != null) {
            throw new InvalidParameterException("bindFragment 已经调用，不能再 bindActivity");
        }
        this.f12122e = new WeakReference<>(activity);
        this.f12126i = mKWebView;
        this.f12120c = true;
        m17951D();
    }

    public MKWebViewHelper() {
        this(null);
    }
}
