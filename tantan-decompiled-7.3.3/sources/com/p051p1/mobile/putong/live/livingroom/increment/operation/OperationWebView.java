package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p153l.awr;
import p153l.bcg0;
import p153l.bnl0;
import p153l.dhw;
import p153l.dpf0;
import p153l.f060;
import p153l.ffv;
import p153l.fhw;
import p153l.hiv;
import p153l.htd0;
import p153l.izs;
import p153l.mdc0;
import p153l.ntp0;
import p153l.nxl;
import p153l.p260;
import p153l.q260;
import p153l.qa00;
import p153l.s260;
import p153l.w0c;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class OperationWebView extends LiveOperationWebViewBindings<p260> {

    /* JADX INFO: renamed from: j */
    public Act f51692j;

    /* JADX INFO: renamed from: k */
    public RotateAnimation f51693k;

    /* JADX INFO: renamed from: l */
    public final int f51694l;

    /* JADX INFO: renamed from: m */
    public final int f51695m;

    /* JADX INFO: renamed from: n */
    public w0c f51696n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.OperationWebView$a */
    public class C13026a extends dpf0 {
        public C13026a(nxl nxlVar) {
            super(nxlVar);
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: e */
        public void mo17978e(WebView webView, int i, String str, String str2) {
            super.mo17978e(webView, i, str, str2);
            OperationWebView.this.m76268G0(webView);
            fhw.m125605a("[live]operation", "onReceivedErrorX message = " + str);
            awr.m100708b(i, str, str2, OperationWebView.class.getName());
        }

        @Override // p153l.dpf0, p153l.ilw
        /* JADX INFO: renamed from: f */
        public void mo17979f(WebView webView, String str) {
            super.mo17979f(webView, str);
            OperationWebView.this.m76276r0();
            ((p260) OperationWebView.this.f48906d).m138879z3(500L, new Runnable() { // from class: l.h260
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107524a.m76284q();
                }
            });
        }

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ void m76284q() {
            OperationWebView.this.f48908f.setBackground(null);
        }
    }

    public OperationWebView(@NonNull Context context) {
        super(context);
        this.f51694l = qa00.m175859d(148.0f);
        this.f51695m = qa00.m175859d(72.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m76258B0(View view) {
        ((p260) this.f48906d).m170333d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m76259D0() {
        ((p260) this.f48906d).m170333d4();
    }

    /* JADX INFO: renamed from: t0 */
    private void m76266t0() {
        w0c w0cVar = new w0c();
        this.f51696n = w0cVar;
        w0cVar.m17975z((Activity) getContext(), this.f48909g);
        this.f51696n.m204137M((PutongAct) getContext(), "", this.f48909g, "");
        this.f48909g.setBackgroundColor(0);
        this.f48909g.setMKWebLoadListener(new C13026a(this.f51696n));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m76267E0(final BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        if (m76280w0()) {
            final String strM170334e4 = ((p260) this.f48906d).m170334e4();
            if (TextUtils.isEmpty(strM170334e4)) {
                this.f51692j.duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.f260
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f96855a.m76282z0(strM170334e4, bLiveOperationItemPopUpDrawer, (AuthData) obj);
                    }
                }, new y20() { // from class: l.g260
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        fhw.m125605a("[live]operation", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m76278u0(strM170334e4, this.f48909g, bLiveOperationItemPopUpDrawer.h5Url);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m76268G0(WebView webView) {
        m76276r0();
        this.f48908f.setBackground(null);
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = false;
        bnl0.m105524M(webView, false);
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: H0 */
    public void m76269H0() {
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = false;
        this.f48909g.loadUrl("about:blank");
        m76276r0();
        this.f48908f.setBackground(null);
        bnl0.m105524M(this.f48909g, false);
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: I0 */
    public void m76270I0(Drawable drawable) {
        this.f48908f.setBackground(drawable);
        this.f51693k = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f51693k.setInterpolator(new LinearInterpolator());
        this.f51693k.setDuration(600L);
        this.f51693k.setRepeatCount(-1);
        this.f51693k.setFillAfter(true);
        this.f48911i.setAnimation(this.f51693k);
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [l.oo2] */
    /* JADX INFO: renamed from: J0 */
    public void m76271J0(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        bnl0.m105524M(this.f48909g, true);
        this.f48909g.clearAnimation();
        int i = (int) (this.f51694l * (m76281y0(bLiveOperationItemPopUpDrawer.width) ? bLiveOperationItemPopUpDrawer.width : 1.0f));
        m76272K0(i, (int) (this.f51695m * (m76281y0(bLiveOperationItemPopUpDrawer.height) ? bLiveOperationItemPopUpDrawer.height : 1.0f)));
        izs.m142869t("context_livingAct", this.f48910h, bLiveOperationItemPopUpDrawer.closeButtonUrl, qa00.f156326m);
        bnl0.m105509E0(this.f48910h, new View.OnClickListener() { // from class: l.d260
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84755a.m76258B0(view);
            }
        });
        int i2 = bLiveOperationItemPopUpDrawer.fadingSeconds;
        if (i2 > 0) {
            ((p260) this.f48906d).m138852B3(i2, TimeUnit.SECONDS, new Runnable() { // from class: l.e260
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91706a.m76259D0();
                }
            });
        }
        m76267E0(bLiveOperationItemPopUpDrawer);
        ((p260) this.f48906d).m213811F2().OperationsEvent.showOperationsRoot().mo199273j(new q260.C19505a(8100).m175010i(false).m175002a());
        s260.m184112d(((p260) this.f48906d).m213815L2(), ((p260) this.f48906d).m213810E2(), str, BLiveOperationPopupType.get(BLiveOperationPopupType.H5Drawer));
        m76274p0(i);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m76272K0(int i, int i2) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f48908f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a).width = i;
        ((ViewGroup.MarginLayoutParams) c0221a).height = i2;
        this.f48908f.setLayoutParams(c0221a);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p153l.iam
    public void destroy() {
        this.f48909g.stopLoading();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public void m76273o0() {
        ffv.m125425a(this.f48909g, this.f51696n);
        this.f48909g = null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73212h0(this);
        m76266t0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m76274p0(int i) {
        float f;
        int iIntValue = ((Integer) ((p260) this.f48906d).m138856F3(new f060(8100))).intValue();
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f48909g, true);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (iIntValue == 5) {
            f = i;
        } else {
            f = iIntValue == 17 ? i / 2.0f : 0.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, f, 0, 0.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(linearInterpolator);
        this.f48908f.startAnimation(scaleAnimation);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p153l.iam
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p260 p260Var) {
        if (NullChecker.m82486a(p260Var)) {
            this.f48906d = p260Var;
            this.f51692j = p260Var.act();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m76276r0() {
        if (NullChecker.m82486a(this.f51693k)) {
            this.f51693k.cancel();
        }
        this.f48911i.clearAnimation();
        bnl0.m105524M(this.f48911i, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m76277s0() {
        if (NullChecker.m82486a(this.f48906d)) {
            ((p260) this.f48906d).m170333d4();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m76278u0(String str, MKWebView mKWebView, String str2) {
        mKWebView.setTag(mdc0.f136176f8, this);
        HashMap map = new HashMap();
        if (ntp0.m164746d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m76279v0(bcg0 bcg0Var) {
        return bcg0Var.f76143b == this.f48909g.hashCode();
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m76280w0() {
        Act act = this.f51692j;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m76281y0(float f) {
        return f > 0.0f && f <= 1.0f;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m76282z0(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer, AuthData authData) {
        ((p260) this.f48906d).m170341l4(authData.accessToken);
        m76278u0(str, this.f48909g, bLiveOperationItemPopUpDrawer.h5Url);
    }

    public OperationWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51694l = qa00.m175859d(148.0f);
        this.f51695m = qa00.m175859d(72.0f);
    }

    public OperationWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51694l = qa00.m175859d(148.0f);
        this.f51695m = qa00.m175859d(72.0f);
    }
}
