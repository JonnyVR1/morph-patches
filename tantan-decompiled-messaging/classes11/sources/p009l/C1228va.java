package p009l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import l.v0c0;
import l.w2c0;
import l.wul;
import p009l.u400;
import v.VIcon;

/* JADX INFO: renamed from: l.va */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C1228va<P extends u400> extends a500<C1216ua> {

    /* JADX INFO: renamed from: J */
    public String f21492J;

    /* JADX INFO: renamed from: l.va$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenMkWebViewAct f21493a;

        public a(AccessTokenMkWebViewAct accessTokenMkWebViewAct) {
            this.f21493a = accessTokenMkWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21493a.m10529z2();
        }
    }

    /* JADX INFO: renamed from: l.va$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenMkWebViewAct f21495a;

        public b(AccessTokenMkWebViewAct accessTokenMkWebViewAct) {
            this.f21495a = accessTokenMkWebViewAct;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21495a.m10524A2();
        }
    }

    /* JADX INFO: renamed from: l.va$c */
    public class c extends MKWebViewHelper.b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MKWebViewHelper.b f21497b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wul wulVar, MKWebViewHelper.b bVar) {
            super(wulVar);
            this.f21497b = bVar;
        }

        /* JADX INFO: renamed from: e */
        public void m23326e(WebView webView, int i, String str, String str2) {
            if (NullChecker.a(this.f21497b)) {
                this.f21497b.e(webView, i, str, str2);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m23327f(WebView webView, String str) {
            if (C1228va.this.m23325b0()) {
                C1228va c1228va = C1228va.this;
                c1228va.f21492J = c1228va.f9229g.getTitle();
            }
            if (NullChecker.a(this.f21497b)) {
                this.f21497b.f(webView, str);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m23328g(WebView webView, String str, Bitmap bitmap) {
            if (NullChecker.a(this.f21497b)) {
                this.f21497b.g(webView, str, bitmap);
            }
        }

        /* JADX INFO: renamed from: l */
        public void m23329l(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (NullChecker.a(this.f21497b)) {
                this.f21497b.l(webView, renderProcessGoneDetail);
            }
        }
    }

    public C1228va(PutongAct putongAct) {
        super(putongAct);
    }

    @Override // p009l.a500
    /* JADX INFO: renamed from: F */
    public void mo11213F() {
        super.mo11213F();
        m23324a0();
    }

    @Override // p009l.a500
    /* JADX INFO: renamed from: J */
    public void mo11215J() {
        if (m11235y() == null || !m11235y().contains("?speed=true")) {
            this.f9229g.setLayerType(1, null);
        }
        super.mo11215J();
    }

    /* JADX INFO: renamed from: Z */
    public String m23323Z() {
        MKWebView mKWebView;
        if ((TextUtils.isEmpty(this.f21492J) || this.f21492J.contains("mp.weixin.qq.com")) && (mKWebView = this.f9229g) != null) {
            this.f21492J = mKWebView.getTitle();
        }
        return this.f21492J;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, com.p1.mobile.putong.app.PutongAct, com.p1.mobile.putong.ui.webview.mk.AccessTokenMkWebViewAct] */
    /* JADX INFO: renamed from: a0 */
    public void m23324a0() {
        if (act() instanceof AccessTokenMkWebViewAct) {
            this.f9224b.B();
            ?? r0 = (AccessTokenMkWebViewAct) act();
            if (r0.m10527v2()) {
                Drawable drawable = r0.getResources().getDrawable(w2c0.q0);
                drawable.mutate();
                drawable.setColorFilter(r0.getResources().getColor(v0c0.c), PorterDuff.Mode.SRC_ATOP);
                View vIcon = new VIcon((Context) r0);
                vIcon.setIconStyle(4);
                vIcon.setImageDrawable(drawable);
                vIcon.setOnClickListener(new a(r0));
                this.f9224b.z(new View[]{vIcon});
            }
            if (r0.m10528w2()) {
                Drawable drawable2 = r0.getResources().getDrawable(w2c0.o0);
                drawable2.mutate();
                drawable2.setColorFilter(r0.getResources().getColor(v0c0.c), PorterDuff.Mode.SRC_ATOP);
                View vIcon2 = new VIcon((Context) r0);
                vIcon2.setIconStyle(4);
                vIcon2.setImageDrawable(drawable2);
                vIcon2.setOnClickListener(new b(r0));
                this.f9224b.z(new View[]{vIcon2});
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m23325b0() {
        String strM11235y = m11235y();
        String[] strArrSplit = strM11235y == null ? null : strM11235y.split("://");
        return strArrSplit != null && strArrSplit.length > 1 && strArrSplit[1].startsWith("mp.weixin.qq.com");
    }

    @Override // p009l.a500
    /* JADX INFO: renamed from: z */
    public MKWebViewHelper.b mo11236z() {
        return new c(this.f9228f, super.mo11236z());
    }
}
