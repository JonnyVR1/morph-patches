package com.p046p1.mobile.putong.core.p053ui;

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
import com.p046p1.mobile.putong.core.p053ui.MKWebViewManager;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.Map;
import p149l.d30;
import p149l.e30;
import p149l.i6c0;
import p149l.izb;
import p149l.mkd0;
import p149l.sw3;
import p149l.w4c0;
import p149l.wul;

/* JADX INFO: loaded from: classes6.dex */
public class MKWebViewManager extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f28005a;

    /* JADX INFO: renamed from: b */
    public ProgressBar f28006b;

    /* JADX INFO: renamed from: c */
    public View f28007c;

    /* JADX INFO: renamed from: d */
    public View f28008d;

    /* JADX INFO: renamed from: e */
    public View f28009e;

    /* JADX INFO: renamed from: f */
    public View f28010f;

    /* JADX INFO: renamed from: g */
    public String f28011g;

    /* JADX INFO: renamed from: h */
    public String f28012h;

    /* JADX INFO: renamed from: i */
    public Context f28013i;

    /* JADX INFO: renamed from: j */
    public izb f28014j;

    /* JADX INFO: renamed from: k */
    public d30 f28015k;

    /* JADX INFO: renamed from: l */
    public boolean f28016l;

    /* JADX INFO: renamed from: m */
    public boolean f28017m;

    /* JADX INFO: renamed from: n */
    public String f28018n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.MKWebViewManager$a */
    public class C8260a extends MKWebViewHelper.C14921b {
        public C8260a(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            MKWebViewManager.this.f28010f.setAlpha(1.0f);
            MKWebViewManager.this.f28006b.setVisibility(8);
            if (MKWebViewManager.this.f28012h.contains("&_offline=1")) {
                MKWebViewManager.this.f28007c.setVisibility(8);
            } else if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewManager.this.f28012h)) {
                MKWebViewManager.this.f28007c.setVisibility(0);
            } else {
                MKWebViewManager.this.f28007c.setVisibility(8);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            MKWebViewManager.this.postDelayed(new Runnable() { // from class: l.ajw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70142a.m43929p();
                }
            }, 100L);
            MKWebViewManager.this.f28006b.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewManager.this.f28011g) && NullChecker.m81303a(MKWebViewManager.this.f28005a) && !TextUtils.isEmpty(MKWebViewManager.this.f28005a.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && MKWebViewManager.this.f28007c.getVisibility() != 0 && MKWebViewManager.this.f28005a.getTag(w4c0.f184523b0) != null) {
                MKWebViewManager.this.f28005a.setTag(w4c0.f184523b0, null);
            }
            if (NullChecker.m81303a(MKWebViewManager.this.f28015k)) {
                MKWebViewManager.this.f28015k.call();
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            MKWebViewManager.this.f28010f.setAlpha(0.0f);
            MKWebViewManager.this.f28006b.setVisibility(0);
            super.mo43913g(webView, str, bitmap);
        }

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ void m43929p() {
            MKWebViewManager.this.f28010f.setAlpha(1.0f);
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28015k = null;
        this.f28016l = true;
        this.f28017m = true;
        this.f28018n = "transparent";
        View viewInflate = View.inflate(getContext(), i6c0.f111723r, this);
        this.f28009e = viewInflate;
        this.f28005a = (MKWebView) viewInflate.findViewById(w4c0.f184521a0);
        this.f28006b = (ProgressBar) this.f28009e.findViewById(w4c0.f184505L);
        this.f28007c = this.f28009e.findViewById(w4c0.f184497D);
        this.f28008d = this.f28009e.findViewById(w4c0.f184506M);
        this.f28010f = this.f28009e.findViewById(w4c0.f184496C);
        this.f28013i = context;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43914a(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    public MKWebViewHelper.C14921b getPageListener() {
        return new C8260a(this.f28014j);
    }

    /* JADX INFO: renamed from: j */
    public void m43923j(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f28012h)) {
            return;
        }
        izb izbVar = new izb();
        this.f28014j = izbVar;
        Context context = this.f28013i;
        if (context instanceof Activity) {
            izbVar.m87118q((Activity) context, this.f28005a);
        }
        this.f28014j.m87120x(new MKWebViewHelper.InterfaceC14920a() { // from class: l.yiw
            @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.InterfaceC14920a
            /* JADX INFO: renamed from: a */
            public final void mo87121a(MKWebView mKWebView) {
                MKWebViewManager.m43914a(mKWebView);
            }
        });
        if (this.f28016l && !this.f28014j.m139035B()) {
            Context context2 = this.f28013i;
            if (context2 instanceof PutongAct) {
                this.f28014j.m139034A((PutongAct) context2, "", this.f28005a, this.f28012h);
            }
        }
        m43924k();
        this.f28005a.setMKWebLoadListener(getPageListener());
        boolean zM81303a = NullChecker.m81303a(map);
        MKWebView mKWebView = this.f28005a;
        if (zM81303a) {
            mKWebView.loadUrl(this.f28012h, map);
        } else {
            mKWebView.loadUrl(this.f28012h);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m43924k() {
        int color = 0;
        if (TextUtils.isEmpty(this.f28018n)) {
            this.f28005a.getSettings().setCacheMode(-1);
            this.f28005a.clearCache(false);
            return;
        }
        if (!this.f28018n.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f28018n.startsWith("#");
            String str = this.f28018n;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f28005a.getSettings().setCacheMode(-1);
                this.f28005a.clearCache(false);
                return;
            }
        }
        this.f28005a.setBackgroundColor(color);
        this.f28005a.getSettings().setCacheMode(2);
        this.f28005a.clearCache(true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m43925l(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            m43927n();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m43926m(String str, String str2) {
        this.f28012h = str;
        this.f28011g = str2;
        if (this.f28013i instanceof PutongAct) {
            m43923j(null);
            ((PutongAct) this.f28013i).lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.wiw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186581a.m43925l((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m43927n() {
        this.f28014j.m139039y();
        if (NullChecker.m81303a(this.f28005a)) {
            this.f28005a.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f28005a.getParent();
            if (NullChecker.m81303a(viewGroup)) {
                viewGroup.removeView(this.f28005a);
            }
            this.f28005a.setTag(null);
            this.f28005a.clearHistory();
            this.f28005a.destroy();
            this.f28005a = null;
        }
    }

    public MKWebViewManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MKWebViewManager(Context context) {
        this(context, null);
    }
}
