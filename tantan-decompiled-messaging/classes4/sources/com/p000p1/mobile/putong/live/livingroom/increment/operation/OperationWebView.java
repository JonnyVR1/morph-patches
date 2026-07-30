package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import immomo.com.mklibrary.core.base.ui.MKWebViewHelper;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.edv;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hfw;
import l.hxs;
import l.izb;
import l.jkp0;
import l.t100;
import l.u3g0;
import l.wul;
import l.xdl0;
import l.ypv;
import l.ztr;
import p002l.g5c0;
import p002l.ju50;
import p002l.ku50;
import p002l.mu50;
import p002l.zr50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationWebView extends LiveOperationWebViewBindings<ju50> {

    /* JADX INFO: renamed from: j */
    public Act f6886j;

    /* JADX INFO: renamed from: k */
    public RotateAnimation f6887k;

    /* JADX INFO: renamed from: l */
    public final int f6888l;

    /* JADX INFO: renamed from: m */
    public final int f6889m;

    /* JADX INFO: renamed from: n */
    public izb f6890n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.OperationWebView$a */
    public class C0452a extends MKWebViewHelper.b {
        public C0452a(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m8713p() {
            OperationWebView.this.f4102f.setBackground(null);
        }

        /* JADX INFO: renamed from: e */
        public void m8714e(WebView webView, int i, String str, String str2) {
            super.e(webView, i, str, str2);
            OperationWebView.this.m8697G0(webView);
            hfw.a("[live]operation", "onReceivedErrorX message = " + str);
            ztr.b(i, str, str2, OperationWebView.class.getName());
        }

        /* JADX INFO: renamed from: f */
        public void m8715f(WebView webView, String str) {
            super.f(webView, str);
            OperationWebView.this.m8705r0();
            OperationWebView.this.f4100d.m14207z3(500L, new Runnable() { // from class: l.bu50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8360a.m8713p();
                }
            });
        }
    }

    public OperationWebView(@NonNull Context context) {
        super(context);
        this.f6888l = t100.d(148.0f);
        this.f6889m = t100.d(72.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m8687B0(View view) {
        this.f4100d.m16244d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m8688D0() {
        this.f4100d.m16244d4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    private void m8695t0() {
        izb izbVar = new izb();
        this.f6890n = izbVar;
        izbVar.q((Activity) getContext(), this.f4103g);
        this.f6890n.A(getContext(), "", this.f4103g, "");
        this.f4103g.setBackgroundColor(0);
        this.f4103g.setMKWebLoadListener(new C0452a(this.f6890n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5450C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m8696E0(final BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        if (m8709w0()) {
            final String strM16245e4 = this.f4100d.m16245e4();
            if (TextUtils.isEmpty(strM16245e4)) {
                this.f6886j.duringCreated(ypv.a.a()).subscribe(ffw.e(new e30() { // from class: l.zt50
                    public final void call(Object obj) {
                        this.f23578a.m8711z0(strM16245e4, bLiveOperationItemPopUpDrawer, (AuthData) obj);
                    }
                }, new e30() { // from class: l.au50
                    public final void call(Object obj) {
                        hfw.a("[live]operation", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m8707u0(strM16245e4, this.f4103g, bLiveOperationItemPopUpDrawer.h5Url);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final void m8697G0(WebView webView) {
        m8705r0();
        this.f4102f.setBackground(null);
        ((ggv) ypv.l(fld0.c)).i = false;
        xdl0.M(webView, false);
        xdl0.M(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public void m8698H0() {
        ((ggv) ypv.l(fld0.c)).i = false;
        this.f4103g.loadUrl("about:blank");
        m8705r0();
        this.f4102f.setBackground(null);
        xdl0.M(this.f4103g, false);
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: I0 */
    public void m8699I0(Drawable drawable) {
        this.f4102f.setBackground(drawable);
        this.f6887k = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f6887k.setInterpolator(new LinearInterpolator());
        this.f6887k.setDuration(600L);
        this.f6887k.setRepeatCount(-1);
        this.f6887k.setFillAfter(true);
        this.f4105i.setAnimation(this.f6887k);
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [l.ho2] */
    /* JADX INFO: renamed from: J0 */
    public void m8700J0(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        xdl0.M(this.f4103g, true);
        this.f4103g.clearAnimation();
        int i = (int) (this.f6888l * (m8710y0(bLiveOperationItemPopUpDrawer.width) ? bLiveOperationItemPopUpDrawer.width : 1.0f));
        m8701K0(i, (int) (this.f6889m * (m8710y0(bLiveOperationItemPopUpDrawer.height) ? bLiveOperationItemPopUpDrawer.height : 1.0f)));
        hxs.t("context_livingAct", this.f4104h, bLiveOperationItemPopUpDrawer.closeButtonUrl, t100.m);
        xdl0.E0(this.f4104h, new View.OnClickListener() { // from class: l.xt50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22448a.m8687B0(view);
            }
        });
        int i2 = bLiveOperationItemPopUpDrawer.fadingSeconds;
        if (i2 > 0) {
            this.f4100d.m14180B3(i2, TimeUnit.SECONDS, new Runnable() { // from class: l.yt50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23072a.m8688D0();
                }
            });
        }
        m8696E0(bLiveOperationItemPopUpDrawer);
        this.f4100d.m25548F2().OperationsEvent.showOperationsRoot().j(new ku50.C0652a(8100).m16807i(false).m16799a());
        mu50.m18186d(this.f4100d.m25552L2(), this.f4100d.m25547E2(), str, BLiveOperationPopupType.get("H5Drawer"));
        m8703p0(i);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m8701K0(int i, int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.f4102f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) aVar).width = i;
        ((ViewGroup.MarginLayoutParams) aVar).height = i2;
        this.f4102f.setLayoutParams(aVar);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings
    public void destroy() {
        this.f4103g.stopLoading();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public void m8702o0() {
        edv.b(this.f4103g, this.f6890n);
        this.f4103g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings
    public void onFinishInflate() {
        super.onFinishInflate();
        m5451h0(this);
        m8695t0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public void m8703p0(int i) {
        float f;
        int iIntValue = ((Integer) this.f4100d.m14184F3(new zr50(8100))).intValue();
        xdl0.M(this, true);
        xdl0.M(this.f4103g, true);
        Interpolator linearInterpolator = new LinearInterpolator();
        if (iIntValue == 5) {
            f = i;
        } else {
            f = iIntValue == 17 ? i / 2.0f : 0.0f;
        }
        Animation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 0, f, 0, 0.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(linearInterpolator);
        this.f4102f.startAnimation(scaleAnimation);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo5452i1(ju50 ju50Var) {
        if (NullChecker.a(ju50Var)) {
            this.f4100d = ju50Var;
            this.f6886j = ju50Var.act();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8705r0() {
        if (NullChecker.a(this.f6887k)) {
            this.f6887k.cancel();
        }
        this.f4105i.clearAnimation();
        xdl0.M(this.f4105i, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m8706s0() {
        if (NullChecker.a(this.f4100d)) {
            this.f4100d.m16244d4();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8707u0(String str, MKWebView mKWebView, String str2) {
        mKWebView.setTag(g5c0.f11081f8, this);
        HashMap map = new HashMap();
        if (jkp0.d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m8708v0(u3g0 u3g0Var) {
        return u3g0Var.b == this.f4103g.hashCode();
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m8709w0() {
        Act act = this.f6886j;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m8710y0(float f) {
        return f > 0.0f && f <= 1.0f;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8711z0(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer, AuthData authData) {
        this.f4100d.m16252l4(authData.accessToken);
        m8707u0(str, this.f4103g, bLiveOperationItemPopUpDrawer.h5Url);
    }

    public OperationWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6888l = t100.d(148.0f);
        this.f6889m = t100.d(72.0f);
    }

    public OperationWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6888l = t100.d(148.0f);
        this.f6889m = t100.d(72.0f);
    }
}
