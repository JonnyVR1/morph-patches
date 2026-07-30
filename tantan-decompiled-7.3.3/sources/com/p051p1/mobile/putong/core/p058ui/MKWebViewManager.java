package com.p051p1.mobile.putong.core.p058ui;

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
import com.p051p1.mobile.putong.core.p058ui.MKWebViewManager;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p153l.cdc0;
import p153l.nec0;
import p153l.nxl;
import p153l.psd0;
import p153l.rx3;
import p153l.w0c;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes6.dex */
public class MKWebViewManager extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f28853a;

    /* JADX INFO: renamed from: b */
    public ProgressBar f28854b;

    /* JADX INFO: renamed from: c */
    public View f28855c;

    /* JADX INFO: renamed from: d */
    public View f28856d;

    /* JADX INFO: renamed from: e */
    public View f28857e;

    /* JADX INFO: renamed from: f */
    public View f28858f;

    /* JADX INFO: renamed from: g */
    public String f28859g;

    /* JADX INFO: renamed from: h */
    public String f28860h;

    /* JADX INFO: renamed from: i */
    public Context f28861i;

    /* JADX INFO: renamed from: j */
    public w0c f28862j;

    /* JADX INFO: renamed from: k */
    public x20 f28863k;

    /* JADX INFO: renamed from: l */
    public boolean f28864l;

    /* JADX INFO: renamed from: m */
    public boolean f28865m;

    /* JADX INFO: renamed from: n */
    public String f28866n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.MKWebViewManager$a */
    public class C8423a extends MKWebViewHelper.C3521b {
        public C8423a(nxl nxlVar) {
            super(nxlVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m45112q() {
            MKWebViewManager.this.f28858f.setAlpha(1.0f);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            MKWebViewManager.this.f28858f.setAlpha(1.0f);
            MKWebViewManager.this.f28854b.setVisibility(8);
            if (MKWebViewManager.this.f28860h.contains("&_offline=1")) {
                MKWebViewManager.this.f28855c.setVisibility(8);
            } else if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewManager.this.f28860h)) {
                MKWebViewManager.this.f28855c.setVisibility(0);
            } else {
                MKWebViewManager.this.f28855c.setVisibility(8);
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            MKWebViewManager.this.postDelayed(new Runnable() { // from class: l.xlw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195019a.m45112q();
                }
            }, 100L);
            MKWebViewManager.this.f28854b.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewManager.this.f28859g) && NullChecker.m82486a(MKWebViewManager.this.f28853a) && !TextUtils.isEmpty(MKWebViewManager.this.f28853a.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && MKWebViewManager.this.f28855c.getVisibility() != 0 && MKWebViewManager.this.f28853a.getTag(cdc0.f81152b0) != null) {
                MKWebViewManager.this.f28853a.setTag(cdc0.f81152b0, null);
            }
            if (NullChecker.m82486a(MKWebViewManager.this.f28863k)) {
                MKWebViewManager.this.f28863k.call();
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.C3521b, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            MKWebViewManager.this.f28858f.setAlpha(0.0f);
            MKWebViewManager.this.f28854b.setVisibility(0);
            super.mo17980g(webView, str, bitmap);
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28863k = null;
        this.f28864l = true;
        this.f28865m = true;
        this.f28866n = "transparent";
        View viewInflate = View.inflate(getContext(), nec0.f141633r, this);
        this.f28857e = viewInflate;
        this.f28853a = (MKWebView) viewInflate.findViewById(cdc0.f81150a0);
        this.f28854b = (ProgressBar) this.f28857e.findViewById(cdc0.f81134L);
        this.f28855c = this.f28857e.findViewById(cdc0.f81126D);
        this.f28856d = this.f28857e.findViewById(cdc0.f81135M);
        this.f28858f = this.f28857e.findViewById(cdc0.f81125C);
        this.f28861i = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m45098b(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    public MKWebViewHelper.C3521b getPageListener() {
        return new C8423a(this.f28862j);
    }

    /* JADX INFO: renamed from: j */
    public void m45106j(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f28860h)) {
            return;
        }
        w0c w0cVar = new w0c();
        this.f28862j = w0cVar;
        Context context = this.f28861i;
        if (context instanceof Activity) {
            w0cVar.m17975z((Activity) context, this.f28853a);
        }
        this.f28862j.m17959J(new MKWebViewHelper.InterfaceC3520a() { // from class: l.vlw
            @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper.InterfaceC3520a
            /* JADX INFO: renamed from: a */
            public final void mo17976a(MKWebView mKWebView) {
                MKWebViewManager.m45098b(mKWebView);
            }
        });
        if (this.f28864l && !this.f28862j.m204138N()) {
            Context context2 = this.f28861i;
            if (context2 instanceof PutongAct) {
                this.f28862j.m204137M((PutongAct) context2, "", this.f28853a, this.f28860h);
            }
        }
        m45107k();
        this.f28853a.setMKWebLoadListener(getPageListener());
        boolean zM82486a = NullChecker.m82486a(map);
        MKWebView mKWebView = this.f28853a;
        if (zM82486a) {
            mKWebView.loadUrl(this.f28860h, map);
        } else {
            mKWebView.loadUrl(this.f28860h);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m45107k() {
        int color = 0;
        if (TextUtils.isEmpty(this.f28866n)) {
            this.f28853a.getSettings().setCacheMode(-1);
            this.f28853a.clearCache(false);
            return;
        }
        if (!this.f28866n.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f28866n.startsWith("#");
            String str = this.f28866n;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f28853a.getSettings().setCacheMode(-1);
                this.f28853a.clearCache(false);
                return;
            }
        }
        this.f28853a.setBackgroundColor(color);
        this.f28853a.getSettings().setCacheMode(2);
        this.f28853a.clearCache(true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m45108l(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            m45110n();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m45109m(String str, String str2) {
        this.f28860h = str;
        this.f28859g = str2;
        if (this.f28861i instanceof PutongAct) {
            m45106j(null);
            ((PutongAct) this.f28861i).lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.tlw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174868a.m45108l((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m45110n() {
        this.f28862j.m204135K();
        if (NullChecker.m82486a(this.f28853a)) {
            this.f28853a.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f28853a.getParent();
            if (NullChecker.m82486a(viewGroup)) {
                viewGroup.removeView(this.f28853a);
            }
            this.f28853a.setTag(null);
            this.f28853a.clearHistory();
            this.f28853a.destroy();
            this.f28853a = null;
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MKWebViewManager(Context context) {
        this(context, null);
    }
}
