package com.p051p1.mobile.putong.core.p058ui.profile.views;

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
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.MKWebViewManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p153l.gdc0;
import p153l.l51;
import p153l.nxl;
import p153l.psd0;
import p153l.rx3;
import p153l.sec0;
import p153l.w0c;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MKWebViewManager extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f34980a;

    /* JADX INFO: renamed from: b */
    public ProgressBar f34981b;

    /* JADX INFO: renamed from: c */
    public View f34982c;

    /* JADX INFO: renamed from: d */
    public View f34983d;

    /* JADX INFO: renamed from: e */
    public View f34984e;

    /* JADX INFO: renamed from: f */
    public View f34985f;

    /* JADX INFO: renamed from: g */
    public String f34986g;

    /* JADX INFO: renamed from: h */
    public String f34987h;

    /* JADX INFO: renamed from: i */
    public Context f34988i;

    /* JADX INFO: renamed from: j */
    public w0c f34989j;

    /* JADX INFO: renamed from: k */
    public x20 f34990k;

    /* JADX INFO: renamed from: l */
    public boolean f34991l;

    /* JADX INFO: renamed from: m */
    public boolean f34992m;

    /* JADX INFO: renamed from: n */
    public String f34993n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.MKWebViewManager$a */
    public class C8907a extends MKWebViewHelper.C3521b {
        public C8907a(nxl nxlVar) {
            super(nxlVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m54125q() {
            MKWebViewManager.this.f34985f.setAlpha(1.0f);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            MKWebViewManager.this.f34985f.setAlpha(1.0f);
            MKWebViewManager.this.f34981b.setVisibility(8);
            if (MKWebViewManager.this.f34987h.contains("&_offline=1")) {
                MKWebViewManager.this.f34982c.setVisibility(8);
            } else if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewManager.this.f34987h)) {
                MKWebViewManager.this.f34982c.setVisibility(0);
            } else {
                MKWebViewManager.this.f34982c.setVisibility(8);
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            l51.m152888H(MKWebViewManager.this.f34988i, new Runnable() { // from class: l.wlw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189745a.m54125q();
                }
            }, 100L);
            MKWebViewManager.this.f34981b.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewManager.this.f34986g) && NullChecker.m82486a(MKWebViewManager.this.f34980a) && !TextUtils.isEmpty(MKWebViewManager.this.f34980a.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && MKWebViewManager.this.f34982c.getVisibility() != 0 && MKWebViewManager.this.f34980a.getTag(gdc0.f103677e0) != null) {
                MKWebViewManager.this.f34980a.setTag(gdc0.f103677e0, null);
            }
            if (NullChecker.m82486a(MKWebViewManager.this.f34990k)) {
                MKWebViewManager.this.f34990k.call();
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            MKWebViewManager.this.f34985f.setAlpha(0.0f);
            MKWebViewManager.this.f34981b.setVisibility(0);
            super.mo17980g(webView, str, bitmap);
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34990k = null;
        this.f34991l = true;
        this.f34992m = true;
        this.f34993n = "transparent";
        View viewInflate = View.inflate(getContext(), sec0.f167575k0, this);
        this.f34984e = viewInflate;
        this.f34980a = (MKWebView) viewInflate.findViewById(gdc0.f103675d0);
        this.f34981b = (ProgressBar) this.f34984e.findViewById(gdc0.f103648G);
        this.f34982c = this.f34984e.findViewById(gdc0.f103687o);
        this.f34983d = this.f34984e.findViewById(gdc0.f103649H);
        this.f34985f = this.f34984e.findViewById(gdc0.f103678f);
        this.f34988i = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m54110b(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    public MKWebViewHelper.C3521b getPageListener() {
        return new C8907a(this.f34989j);
    }

    /* JADX INFO: renamed from: k */
    public void m54119k(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f34987h)) {
            return;
        }
        w0c w0cVar = new w0c();
        this.f34989j = w0cVar;
        Context context = this.f34988i;
        if (context instanceof Activity) {
            w0cVar.m17975z((Activity) context, this.f34980a);
        }
        this.f34989j.m17959J(new MKWebViewHelper.InterfaceC3520a() { // from class: l.ulw
            @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.InterfaceC3520a
            /* JADX INFO: renamed from: a */
            public final void mo17976a(MKWebView mKWebView) {
                MKWebViewManager.m54110b(mKWebView);
            }
        });
        if (this.f34991l && !this.f34989j.m204138N()) {
            Context context2 = this.f34988i;
            if (context2 instanceof PutongAct) {
                this.f34989j.m204137M((PutongAct) context2, "", this.f34980a, this.f34987h);
            }
        }
        m54120l();
        this.f34980a.setMKWebLoadListener(getPageListener());
        boolean zM82486a = NullChecker.m82486a(map);
        MKWebView mKWebView = this.f34980a;
        if (zM82486a) {
            mKWebView.loadUrl(this.f34987h, map);
        } else {
            mKWebView.loadUrl(this.f34987h);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m54120l() {
        int color = 0;
        if (TextUtils.isEmpty(this.f34993n)) {
            this.f34980a.getSettings().setCacheMode(-1);
            this.f34980a.clearCache(false);
            return;
        }
        if (!this.f34993n.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f34993n.startsWith("#");
            String str = this.f34993n;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f34980a.getSettings().setCacheMode(-1);
                this.f34980a.clearCache(false);
                return;
            }
        }
        this.f34980a.setBackgroundColor(color);
        this.f34980a.getSettings().setCacheMode(2);
        this.f34980a.clearCache(true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m54121m(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            m54123o();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m54122n(String str, String str2) {
        this.f34987h = str;
        this.f34986g = str2;
        if (this.f34988i instanceof PutongAct) {
            m54119k(null);
            ((PutongAct) this.f34988i).lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.slw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f169462a.m54121m((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m54123o() {
        this.f34989j.m204135K();
        if (NullChecker.m82486a(this.f34980a)) {
            this.f34980a.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f34980a.getParent();
            if (NullChecker.m82486a(viewGroup)) {
                viewGroup.removeView(this.f34980a);
            }
            this.f34980a.setTag(null);
            this.f34980a.clearHistory();
            this.f34980a.destroy();
            this.f34980a = null;
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MKWebViewManager(Context context) {
        this(context, null);
    }
}
