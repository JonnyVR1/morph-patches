package com.p000p1.mobile.putong.core.p001ui.profile.views;

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
import com.p000p1.mobile.putong.core.p001ui.profile.views.MKWebViewManager;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.Map;
import l.a5c0;
import l.d30;
import l.e30;
import l.e51;
import l.izb;
import l.mkd0;
import l.n6c0;
import l.sw3;
import l.wul;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MKWebViewManager extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f1954a;

    /* JADX INFO: renamed from: b */
    public ProgressBar f1955b;

    /* JADX INFO: renamed from: c */
    public View f1956c;

    /* JADX INFO: renamed from: d */
    public View f1957d;

    /* JADX INFO: renamed from: e */
    public View f1958e;

    /* JADX INFO: renamed from: f */
    public View f1959f;

    /* JADX INFO: renamed from: g */
    public String f1960g;

    /* JADX INFO: renamed from: h */
    public String f1961h;

    /* JADX INFO: renamed from: i */
    public Context f1962i;

    /* JADX INFO: renamed from: j */
    public izb f1963j;

    /* JADX INFO: renamed from: k */
    public d30 f1964k;

    /* JADX INFO: renamed from: l */
    public boolean f1965l;

    /* JADX INFO: renamed from: m */
    public boolean f1966m;

    /* JADX INFO: renamed from: n */
    public String f1967n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.MKWebViewManager$a */
    public class C0169a extends MKWebViewHelper.b {
        public C0169a(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m3497p() {
            MKWebViewManager.this.f1959f.setAlpha(1.0f);
        }

        /* JADX INFO: renamed from: e */
        public void m3498e(WebView webView, int i, String str, String str2) {
            MKWebViewManager.this.f1959f.setAlpha(1.0f);
            MKWebViewManager.this.f1955b.setVisibility(8);
            if (MKWebViewManager.this.f1961h.contains("&_offline=1")) {
                MKWebViewManager.this.f1956c.setVisibility(8);
            } else if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewManager.this.f1961h)) {
                MKWebViewManager.this.f1956c.setVisibility(0);
            } else {
                MKWebViewManager.this.f1956c.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m3499f(WebView webView, String str) {
            e51.H(MKWebViewManager.this.f1962i, new Runnable() { // from class: l.ziw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23445a.m3497p();
                }
            }, 100L);
            MKWebViewManager.this.f1955b.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewManager.this.f1960g) && NullChecker.a(MKWebViewManager.this.f1954a) && !TextUtils.isEmpty(MKWebViewManager.this.f1954a.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && MKWebViewManager.this.f1956c.getVisibility() != 0 && MKWebViewManager.this.f1954a.getTag(a5c0.e0) != null) {
                MKWebViewManager.this.f1954a.setTag(a5c0.e0, null);
            }
            if (NullChecker.a(MKWebViewManager.this.f1964k)) {
                MKWebViewManager.this.f1964k.call();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3500g(WebView webView, String str, Bitmap bitmap) {
            MKWebViewManager.this.f1959f.setAlpha(0.0f);
            MKWebViewManager.this.f1955b.setVisibility(0);
            super.g(webView, str, bitmap);
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1964k = null;
        this.f1965l = true;
        this.f1966m = true;
        this.f1967n = "transparent";
        View viewInflate = View.inflate(getContext(), n6c0.k0, this);
        this.f1958e = viewInflate;
        this.f1954a = viewInflate.findViewById(a5c0.d0);
        this.f1955b = (ProgressBar) this.f1958e.findViewById(a5c0.G);
        this.f1956c = this.f1958e.findViewById(a5c0.o);
        this.f1957d = this.f1958e.findViewById(a5c0.H);
        this.f1959f = this.f1958e.findViewById(a5c0.f);
        this.f1962i = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3482b(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    public MKWebViewHelper.b getPageListener() {
        return new C0169a(this.f1963j);
    }

    /* JADX INFO: renamed from: k */
    public void m3491k(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f1961h)) {
            return;
        }
        izb izbVar = new izb();
        this.f1963j = izbVar;
        Context context = this.f1962i;
        if (context instanceof Activity) {
            izbVar.q((Activity) context, this.f1954a);
        }
        this.f1963j.x(new MKWebViewHelper.a() { // from class: l.xiw
            /* JADX INFO: renamed from: a */
            public final void m25984a(MKWebView mKWebView) {
                MKWebViewManager.m3482b(mKWebView);
            }
        });
        if (this.f1965l && !this.f1963j.B()) {
            PutongAct putongAct = this.f1962i;
            if (putongAct instanceof PutongAct) {
                this.f1963j.A(putongAct, "", this.f1954a, this.f1961h);
            }
        }
        m3492l();
        this.f1954a.setMKWebLoadListener(getPageListener());
        boolean zA = NullChecker.a(map);
        MKWebView mKWebView = this.f1954a;
        if (zA) {
            mKWebView.loadUrl(this.f1961h, map);
        } else {
            mKWebView.loadUrl(this.f1961h);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3492l() {
        int color = 0;
        if (TextUtils.isEmpty(this.f1967n)) {
            this.f1954a.getSettings().setCacheMode(-1);
            this.f1954a.clearCache(false);
            return;
        }
        if (!this.f1967n.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f1967n.startsWith("#");
            String str = this.f1967n;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f1954a.getSettings().setCacheMode(-1);
                this.f1954a.clearCache(false);
                return;
            }
        }
        this.f1954a.setBackgroundColor(color);
        this.f1954a.getSettings().setCacheMode(2);
        this.f1954a.clearCache(true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m3493m(c cVar) {
        if (cVar == c.m) {
            m3495o();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3494n(String str, String str2) {
        this.f1961h = str;
        this.f1960g = str2;
        if (this.f1962i instanceof PutongAct) {
            m3491k(null);
            this.f1962i.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.viw
                public final void call(Object obj) {
                    this.f21183a.m3493m((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3495o() {
        this.f1963j.y();
        if (NullChecker.a(this.f1954a)) {
            this.f1954a.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f1954a.getParent();
            if (NullChecker.a(viewGroup)) {
                viewGroup.removeView(this.f1954a);
            }
            this.f1954a.setTag(null);
            this.f1954a.clearHistory();
            this.f1954a.destroy();
            this.f1954a = null;
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MKWebViewManager(Context context) {
        this(context, null);
    }
}
