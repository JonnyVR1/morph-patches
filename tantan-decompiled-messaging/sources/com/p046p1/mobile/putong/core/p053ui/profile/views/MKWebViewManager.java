package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.MKWebViewManager;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.Map;
import p149l.a5c0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.izb;
import p149l.mkd0;
import p149l.n6c0;
import p149l.sw3;
import p149l.wul;

/* JADX INFO: loaded from: classes4.dex */
public class MKWebViewManager extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f34132a;

    /* JADX INFO: renamed from: b */
    public ProgressBar f34133b;

    /* JADX INFO: renamed from: c */
    public View f34134c;

    /* JADX INFO: renamed from: d */
    public View f34135d;

    /* JADX INFO: renamed from: e */
    public View f34136e;

    /* JADX INFO: renamed from: f */
    public View f34137f;

    /* JADX INFO: renamed from: g */
    public String f34138g;

    /* JADX INFO: renamed from: h */
    public String f34139h;

    /* JADX INFO: renamed from: i */
    public Context f34140i;

    /* JADX INFO: renamed from: j */
    public izb f34141j;

    /* JADX INFO: renamed from: k */
    public d30 f34142k;

    /* JADX INFO: renamed from: l */
    public boolean f34143l;

    /* JADX INFO: renamed from: m */
    public boolean f34144m;

    /* JADX INFO: renamed from: n */
    public String f34145n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.MKWebViewManager$a */
    public class C8744a extends MKWebViewHelper.C14921b {
        public C8744a(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m52942p() {
            MKWebViewManager.this.f34137f.setAlpha(1.0f);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            MKWebViewManager.this.f34137f.setAlpha(1.0f);
            MKWebViewManager.this.f34133b.setVisibility(8);
            if (MKWebViewManager.this.f34139h.contains("&_offline=1")) {
                MKWebViewManager.this.f34134c.setVisibility(8);
            } else if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewManager.this.f34139h)) {
                MKWebViewManager.this.f34134c.setVisibility(0);
            } else {
                MKWebViewManager.this.f34134c.setVisibility(8);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            e51.m114743H(MKWebViewManager.this.f34140i, new Runnable() { // from class: l.ziw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203356a.m52942p();
                }
            }, 100L);
            MKWebViewManager.this.f34133b.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewManager.this.f34138g) && NullChecker.m81303a(MKWebViewManager.this.f34132a) && !TextUtils.isEmpty(MKWebViewManager.this.f34132a.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && MKWebViewManager.this.f34134c.getVisibility() != 0 && MKWebViewManager.this.f34132a.getTag(a5c0.f67682e0) != null) {
                MKWebViewManager.this.f34132a.setTag(a5c0.f67682e0, null);
            }
            if (NullChecker.m81303a(MKWebViewManager.this.f34142k)) {
                MKWebViewManager.this.f34142k.call();
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            MKWebViewManager.this.f34137f.setAlpha(0.0f);
            MKWebViewManager.this.f34133b.setVisibility(0);
            super.mo43913g(webView, str, bitmap);
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34142k = null;
        this.f34143l = true;
        this.f34144m = true;
        this.f34145n = "transparent";
        View viewInflate = View.inflate(getContext(), n6c0.f137361k0, this);
        this.f34136e = viewInflate;
        this.f34132a = (MKWebView) viewInflate.findViewById(a5c0.f67680d0);
        this.f34133b = (ProgressBar) this.f34136e.findViewById(a5c0.f67653G);
        this.f34134c = this.f34136e.findViewById(a5c0.f67692o);
        this.f34135d = this.f34136e.findViewById(a5c0.f67654H);
        this.f34137f = this.f34136e.findViewById(a5c0.f67683f);
        this.f34140i = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m52927b(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    public MKWebViewHelper.C14921b getPageListener() {
        return new C8744a(this.f34141j);
    }

    /* JADX INFO: renamed from: k */
    public void m52936k(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f34139h)) {
            return;
        }
        izb izbVar = new izb();
        this.f34141j = izbVar;
        Context context = this.f34140i;
        if (context instanceof Activity) {
            izbVar.m87118q((Activity) context, this.f34132a);
        }
        this.f34141j.m87120x(new MKWebViewHelper.InterfaceC14920a() { // from class: l.xiw
            @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.InterfaceC14920a
            /* JADX INFO: renamed from: a */
            public final void mo87121a(MKWebView mKWebView) {
                MKWebViewManager.m52927b(mKWebView);
            }
        });
        if (this.f34143l && !this.f34141j.m139035B()) {
            Context context2 = this.f34140i;
            if (context2 instanceof PutongAct) {
                this.f34141j.m139034A((PutongAct) context2, "", this.f34132a, this.f34139h);
            }
        }
        m52937l();
        this.f34132a.setMKWebLoadListener(getPageListener());
        boolean zM81303a = NullChecker.m81303a(map);
        MKWebView mKWebView = this.f34132a;
        if (zM81303a) {
            mKWebView.loadUrl(this.f34139h, map);
        } else {
            mKWebView.loadUrl(this.f34139h);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m52937l() {
        int color = 0;
        if (TextUtils.isEmpty(this.f34145n)) {
            this.f34132a.getSettings().setCacheMode(-1);
            this.f34132a.clearCache(false);
            return;
        }
        if (!this.f34145n.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f34145n.startsWith("#");
            String str = this.f34145n;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f34132a.getSettings().setCacheMode(-1);
                this.f34132a.clearCache(false);
                return;
            }
        }
        this.f34132a.setBackgroundColor(color);
        this.f34132a.getSettings().setCacheMode(2);
        this.f34132a.clearCache(true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m52938m(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            m52940o();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m52939n(String str, String str2) {
        this.f34139h = str;
        this.f34138g = str2;
        if (this.f34140i instanceof PutongAct) {
            m52936k(null);
            ((PutongAct) this.f34140i).lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.viw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181645a.m52938m((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m52940o() {
        this.f34141j.m139039y();
        if (NullChecker.m81303a(this.f34132a)) {
            this.f34132a.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f34132a.getParent();
            if (NullChecker.m81303a(viewGroup)) {
                viewGroup.removeView(this.f34132a);
            }
            this.f34132a.setTag(null);
            this.f34132a.clearHistory();
            this.f34132a.destroy();
            this.f34132a = null;
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MKWebViewManager(Context context) {
        this(context, null);
    }
}
