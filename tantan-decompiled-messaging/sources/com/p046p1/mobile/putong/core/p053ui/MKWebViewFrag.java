package com.p046p1.mobile.putong.core.p053ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.p053ui.MKWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.Map;
import p149l.d30;
import p149l.e30;
import p149l.izb;
import p149l.sw3;
import p149l.u4c0;
import p149l.uiw;
import p149l.vwb;
import p149l.wul;

/* JADX INFO: loaded from: classes6.dex */
public class MKWebViewFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public MKWebView f27990A;

    /* JADX INFO: renamed from: B */
    public ProgressBar f27991B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f27992C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f27993D;

    /* JADX INFO: renamed from: E */
    public ImageView f27994E;

    /* JADX INFO: renamed from: J */
    public String f27999J;

    /* JADX INFO: renamed from: K */
    public String f28000K;

    /* JADX INFO: renamed from: L */
    public izb f28001L;

    /* JADX INFO: renamed from: z */
    public FrameLayout f28003z;

    /* JADX INFO: renamed from: F */
    public boolean f27995F = true;

    /* JADX INFO: renamed from: G */
    public boolean f27996G = true;

    /* JADX INFO: renamed from: H */
    public String f27997H = "transparent";

    /* JADX INFO: renamed from: I */
    public boolean f27998I = true;

    /* JADX INFO: renamed from: M */
    public d30 f28002M = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.MKWebViewFrag$a */
    public class C8259a extends MKWebViewHelper.C14921b {
        public C8259a(wul wulVar) {
            super(wulVar);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            if (i != -2 || TextUtils.isEmpty(str2) || TextUtils.equals(str2.replace("&_offline=1", ""), MKWebViewFrag.this.f28000K)) {
                MKWebViewFrag.this.f27992C.setVisibility(0);
            } else {
                MKWebViewFrag.this.f27992C.setVisibility(8);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            MKWebViewFrag.this.f27991B.setVisibility(8);
            if (TextUtils.isEmpty(MKWebViewFrag.this.f27999J) && NullChecker.m81303a(MKWebViewFrag.this.f27990A) && !TextUtils.isEmpty(MKWebViewFrag.this.f27990A.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && MKWebViewFrag.this.f27992C.getVisibility() != 0 && MKWebViewFrag.this.f27990A.getTag(u4c0.f174540wf) != null) {
                MKWebViewFrag.this.f27990A.setTag(u4c0.f174540wf, null);
            }
            if (NullChecker.m81303a(MKWebViewFrag.this.f28002M)) {
                MKWebViewFrag.this.f28002M.call();
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            super.mo43913g(webView, str, bitmap);
        }
    }

    public MKWebViewFrag() {
        creates(new e30() { // from class: l.riw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159609a.m43905W4((Bundle) obj);
            }
        }, new d30() { // from class: l.siw
            @Override // p149l.d30
            public final void call() {
                this.f164746a.m43906X4();
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m43899M4(MKWebView mKWebView) {
        mKWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        mKWebView.getSettings().setTextZoom(100);
    }

    /* JADX INFO: renamed from: V4 */
    private void m43904V4() {
        int color = 0;
        if (TextUtils.isEmpty(this.f27997H)) {
            this.f27990A.getSettings().setCacheMode(-1);
            this.f27990A.clearCache(false);
            return;
        }
        if (!this.f27997H.equalsIgnoreCase("transparent")) {
            boolean zStartsWith = this.f27997H.startsWith("#");
            String str = this.f27997H;
            if (!zStartsWith) {
                str = "#" + str;
            }
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.f27990A.getSettings().setCacheMode(-1);
                this.f27990A.clearCache(false);
                return;
            }
        }
        this.f27990A.setBackgroundColor(color);
        this.f27990A.getSettings().setCacheMode(2);
        this.f27990A.clearCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m43905W4(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f27999J)) {
            act().setTitle(this.f27999J);
        }
        m43910U4(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m43906X4() {
        this.f28001L.m139039y();
        if (NullChecker.m81303a(this.f27990A)) {
            this.f27990A.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) this.f27990A.getParent();
            if (NullChecker.m81303a(viewGroup)) {
                viewGroup.removeView(this.f27990A);
            }
            this.f27990A.setTag(null);
            this.f27990A.clearHistory();
            this.f27990A.destroy();
            this.f27990A = null;
        }
    }

    /* JADX INFO: renamed from: R4 */
    public View m43907R4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uiw.m193963b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S4 */
    public void m43908S4(String str) {
        izb izbVar = this.f28001L;
        if (izbVar == null || vwb.m200296J(izbVar.m139040z())) {
            return;
        }
        this.f28001L.m139040z().get(0).m114651p().mo127285b(str, new String[0]);
    }

    /* JADX INFO: renamed from: T4 */
    public MKWebViewHelper.C14921b m43909T4() {
        return new C8259a(this.f28001L);
    }

    /* JADX INFO: renamed from: U4 */
    public void m43910U4(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f28000K)) {
            return;
        }
        izb izbVar = new izb();
        this.f28001L = izbVar;
        izbVar.m87118q(getActivity(), this.f27990A);
        this.f28001L.m87120x(new MKWebViewHelper.InterfaceC14920a() { // from class: l.tiw
            @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.InterfaceC14920a
            /* JADX INFO: renamed from: a */
            public final void mo87121a(MKWebView mKWebView) {
                MKWebViewFrag.m43899M4(mKWebView);
            }
        });
        if (this.f27995F && !this.f28001L.m139035B()) {
            this.f28001L.m139034A((PutongAct) getActivity(), "", this.f27990A, this.f28000K);
        }
        boolean z = this.f27996G;
        ProgressBar progressBar = this.f27991B;
        if (z) {
            progressBar.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
        }
        m43904V4();
        this.f27990A.setMKWebLoadListener(m43909T4());
        boolean zM81303a = NullChecker.m81303a(map);
        MKWebView mKWebView = this.f27990A;
        if (zM81303a) {
            mKWebView.loadUrl(this.f28000K, map);
        } else {
            mKWebView.loadUrl(this.f28000K);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m43907R4(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        if (NullChecker.m81303a(getArguments())) {
            this.f27999J = getArguments().getString("title");
            this.f28000K = getArguments().getString("url");
        }
    }
}
