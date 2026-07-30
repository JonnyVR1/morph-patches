package p153l;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VIcon;
import p153l.jd00;

/* JADX INFO: renamed from: l.qa */
/* JADX INFO: loaded from: classes10.dex */
public class C19541qa<P extends jd00> extends pd00<C19327pa> {

    /* JADX INFO: renamed from: J */
    public String f156280J;

    /* JADX INFO: renamed from: l.qa$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenMkWebViewAct f156281a;

        public a(AccessTokenMkWebViewAct accessTokenMkWebViewAct) {
            this.f156281a = accessTokenMkWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f156281a.m81369A2();
        }
    }

    /* JADX INFO: renamed from: l.qa$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenMkWebViewAct f156283a;

        public b(AccessTokenMkWebViewAct accessTokenMkWebViewAct) {
            this.f156283a = accessTokenMkWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f156283a.m81370B2();
        }
    }

    /* JADX INFO: renamed from: l.qa$c */
    public class c extends dpf0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ dpf0 f156285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nxl nxlVar, dpf0 dpf0Var) {
            super(nxlVar);
            this.f156285c = dpf0Var;
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            if (NullChecker.m82486a(this.f156285c)) {
                this.f156285c.mo17978e(webView, i, str, str2);
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            if (C19541qa.this.m175855b0()) {
                C19541qa c19541qa = C19541qa.this;
                c19541qa.f156280J = c19541qa.f151655g.getTitle();
            }
            if (NullChecker.m82486a(this.f156285c)) {
                this.f156285c.mo17979f(webView, str);
            }
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: g */
        public void mo17980g(WebView webView, String str, Bitmap bitmap) {
            if (NullChecker.m82486a(this.f156285c)) {
                this.f156285c.mo17980g(webView, str, bitmap);
            }
        }

        @Override // p153l.ilw
        /* JADX INFO: renamed from: l */
        public void mo18131l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (NullChecker.m82486a(this.f156285c)) {
                this.f156285c.mo18131l(webView, renderProcessGoneDetail);
            }
        }
    }

    public C19541qa(PutongAct putongAct) {
        super(putongAct);
    }

    @Override // p153l.pd00
    /* JADX INFO: renamed from: F */
    public void mo171725F() {
        super.mo171725F();
        m175854a0();
    }

    @Override // p153l.pd00
    /* JADX INFO: renamed from: J */
    public void mo171727J() {
        if (m171745y() == null || !m171745y().contains("?speed=true")) {
            this.f151655g.setLayerType(1, null);
        }
        super.mo171727J();
    }

    /* JADX INFO: renamed from: Z */
    public String m175853Z() {
        MKWebView mKWebView;
        if ((TextUtils.isEmpty(this.f156280J) || this.f156280J.contains("mp.weixin.qq.com")) && (mKWebView = this.f151655g) != null) {
            this.f156280J = mKWebView.getTitle();
        }
        return this.f156280J;
    }

    /* JADX INFO: renamed from: a0 */
    public void m175854a0() {
        if (act() instanceof AccessTokenMkWebViewAct) {
            this.f151650b.m224830B();
            AccessTokenMkWebViewAct accessTokenMkWebViewAct = (AccessTokenMkWebViewAct) act();
            if (accessTokenMkWebViewAct.m81373w2()) {
                Drawable drawable = accessTokenMkWebViewAct.getResources().getDrawable(cbc0.f80791q0);
                drawable.mutate();
                drawable.setColorFilter(accessTokenMkWebViewAct.getResources().getColor(b9c0.f75557c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon = new VIcon(accessTokenMkWebViewAct);
                vIcon.setIconStyle(4);
                vIcon.setImageDrawable(drawable);
                vIcon.setOnClickListener(new a(accessTokenMkWebViewAct));
                this.f151650b.m224835z(vIcon);
            }
            if (accessTokenMkWebViewAct.m81374y2()) {
                Drawable drawable2 = accessTokenMkWebViewAct.getResources().getDrawable(cbc0.f80787o0);
                drawable2.mutate();
                drawable2.setColorFilter(accessTokenMkWebViewAct.getResources().getColor(b9c0.f75557c), PorterDuff.Mode.SRC_ATOP);
                VIcon vIcon2 = new VIcon(accessTokenMkWebViewAct);
                vIcon2.setIconStyle(4);
                vIcon2.setImageDrawable(drawable2);
                vIcon2.setOnClickListener(new b(accessTokenMkWebViewAct));
                this.f151650b.m224835z(vIcon2);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m175855b0() {
        String strM171745y = m171745y();
        String[] strArrSplit = strM171745y == null ? null : strM171745y.split("://");
        return strArrSplit != null && strArrSplit.length > 1 && strArrSplit[1].startsWith("mp.weixin.qq.com");
    }

    @Override // p153l.pd00
    /* JADX INFO: renamed from: z */
    public dpf0 mo171746z() {
        return new c(this.f151654f, super.mo171746z());
    }
}
