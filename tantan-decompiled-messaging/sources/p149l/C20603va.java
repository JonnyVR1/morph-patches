package p149l;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import p147v.VIcon;
import p149l.u400;

/* JADX INFO: renamed from: l.va */
/* JADX INFO: loaded from: classes11.dex */
public class C20603va<P extends u400> extends a500<C20393ua> {

    /* JADX INFO: renamed from: J */
    public String f180685J;

    /* JADX INFO: renamed from: l.va$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenMkWebViewAct f180686a;

        public a(AccessTokenMkWebViewAct accessTokenMkWebViewAct) {
            this.f180686a = accessTokenMkWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f180686a.m80191z2();
        }
    }

    /* JADX INFO: renamed from: l.va$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenMkWebViewAct f180688a;

        public b(AccessTokenMkWebViewAct accessTokenMkWebViewAct) {
            this.f180688a = accessTokenMkWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f180688a.m80186A2();
        }
    }

    /* JADX INFO: renamed from: l.va$c */
    public class c extends MKWebViewHelper.C14921b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MKWebViewHelper.C14921b f180690b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wul wulVar, MKWebViewHelper.C14921b c14921b) {
            super(wulVar);
            this.f180690b = c14921b;
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            if (NullChecker.m81303a(this.f180690b)) {
                this.f180690b.mo43911e(webView, i, str, str2);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            if (C20603va.this.m197610b0()) {
                C20603va c20603va = C20603va.this;
                c20603va.f180685J = c20603va.f67601g.getTitle();
            }
            if (NullChecker.m81303a(this.f180690b)) {
                this.f180690b.mo43912f(webView, str);
            }
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: g */
        public void mo43913g(WebView webView, String str, Bitmap bitmap) {
            if (NullChecker.m81303a(this.f180690b)) {
                this.f180690b.mo43913g(webView, str, bitmap);
            }
        }

        @Override // p149l.miw
        /* JADX INFO: renamed from: l */
        public void mo95004l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (NullChecker.m81303a(this.f180690b)) {
                this.f180690b.mo95004l(webView, renderProcessGoneDetail);
            }
        }
    }

    public C20603va(PutongAct putongAct) {
        super(putongAct);
    }

    @Override // p149l.a500
    /* JADX INFO: renamed from: F */
    public void mo94979F() {
        super.mo94979F();
        m197609a0();
    }

    @Override // p149l.a500
    /* JADX INFO: renamed from: J */
    public void mo94981J() {
        if (m95000y() == null || !m95000y().contains("?speed=true")) {
            this.f67601g.setLayerType(1, null);
        }
        super.mo94981J();
    }

    /* JADX INFO: renamed from: Z */
    public String m197608Z() {
        MKWebView mKWebView;
        if ((TextUtils.isEmpty(this.f180685J) || this.f180685J.contains("mp.weixin.qq.com")) && (mKWebView = this.f67601g) != null) {
            this.f180685J = mKWebView.getTitle();
        }
        return this.f180685J;
    }

    /* JADX INFO: renamed from: a0 */
    public void m197609a0() {
        if (act() instanceof AccessTokenMkWebViewAct) {
            this.f67596b.m223584B();
            AccessTokenMkWebViewAct accessTokenMkWebViewAct = (AccessTokenMkWebViewAct) act();
            if (accessTokenMkWebViewAct.m80189v2()) {
                Drawable drawable = accessTokenMkWebViewAct.getResources().getDrawable(w2c0.f184195q0);
                drawable.mutate();
                drawable.setColorFilter(accessTokenMkWebViewAct.getResources().getColor(v0c0.f179096c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon = new VIcon(accessTokenMkWebViewAct);
                vIcon.setIconStyle(4);
                vIcon.setImageDrawable(drawable);
                vIcon.setOnClickListener(new a(accessTokenMkWebViewAct));
                this.f67596b.m223589z(vIcon);
            }
            if (accessTokenMkWebViewAct.m80190w2()) {
                Drawable drawable2 = accessTokenMkWebViewAct.getResources().getDrawable(w2c0.f184191o0);
                drawable2.mutate();
                drawable2.setColorFilter(accessTokenMkWebViewAct.getResources().getColor(v0c0.f179096c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon2 = new VIcon(accessTokenMkWebViewAct);
                vIcon2.setIconStyle(4);
                vIcon2.setImageDrawable(drawable2);
                vIcon2.setOnClickListener(new b(accessTokenMkWebViewAct));
                this.f67596b.m223589z(vIcon2);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m197610b0() {
        String strM95000y = m95000y();
        String[] strArrSplit = strM95000y == null ? null : strM95000y.split("://");
        return strArrSplit != null && strArrSplit.length > 1 && strArrSplit[1].startsWith("mp.weixin.qq.com");
    }

    @Override // p149l.a500
    /* JADX INFO: renamed from: z */
    public MKWebViewHelper.C14921b mo95001z() {
        return new c(this.f67600f, super.mo95001z());
    }
}
