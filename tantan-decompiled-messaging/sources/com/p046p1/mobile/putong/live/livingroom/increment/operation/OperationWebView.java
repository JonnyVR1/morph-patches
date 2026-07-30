package com.p046p1.mobile.putong.live.livingroom.increment.operation;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p149l.e30;
import p149l.edv;
import p149l.ffw;
import p149l.fld0;
import p149l.g5c0;
import p149l.ggv;
import p149l.hfw;
import p149l.hxs;
import p149l.izb;
import p149l.jkp0;
import p149l.ju50;
import p149l.ku50;
import p149l.mu50;
import p149l.t100;
import p149l.u3g0;
import p149l.wul;
import p149l.xdl0;
import p149l.ypv;
import p149l.zr50;
import p149l.ztr;

/* JADX INFO: loaded from: classes4.dex */
public class OperationWebView extends LiveOperationWebViewBindings<ju50> {

    /* JADX INFO: renamed from: j */
    public Act f50844j;

    /* JADX INFO: renamed from: k */
    public RotateAnimation f50845k;

    /* JADX INFO: renamed from: l */
    public final int f50846l;

    /* JADX INFO: renamed from: m */
    public final int f50847m;

    /* JADX INFO: renamed from: n */
    public izb f50848n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.operation.OperationWebView$a */
    public class C12863a extends MKWebViewHelper.C14921b {
        public C12863a(wul wulVar) {
            super(wulVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m75101p() {
            OperationWebView.this.f48060f.setBackground(null);
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: e */
        public void mo43911e(WebView webView, int i, String str, String str2) {
            super.mo43911e(webView, i, str, str2);
            OperationWebView.this.m75085G0(webView);
            hfw.m130790a("[live]operation", "onReceivedErrorX message = " + str);
            ztr.m220137b(i, str, str2, OperationWebView.class.getName());
        }

        @Override // immomo.com.mklibrary.core.base.p115ui.MKWebViewHelper.C14921b, p149l.miw
        /* JADX INFO: renamed from: f */
        public void mo43912f(WebView webView, String str) {
            super.mo43912f(webView, str);
            OperationWebView.this.m75093r0();
            ((ju50) OperationWebView.this.f48058d).m129320z3(500L, new Runnable() { // from class: l.bu50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77283a.m75101p();
                }
            });
        }
    }

    public OperationWebView(@NonNull Context context) {
        super(context);
        this.f50846l = t100.m186890d(148.0f);
        this.f50847m = t100.m186890d(72.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m75075B0(View view) {
        ((ju50) this.f48058d).m143251d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m75076D0() {
        ((ju50) this.f48058d).m143251d4();
    }

    /* JADX INFO: renamed from: t0 */
    private void m75083t0() {
        izb izbVar = new izb();
        this.f50848n = izbVar;
        izbVar.m87118q((Activity) getContext(), this.f48061g);
        this.f50848n.m139034A((PutongAct) getContext(), "", this.f48061g, "");
        this.f48061g.setBackgroundColor(0);
        this.f48061g.setMKWebLoadListener(new C12863a(this.f50848n));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m75084E0(final BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        if (m75097w0()) {
            final String strM143252e4 = ((ju50) this.f48058d).m143252e4();
            if (TextUtils.isEmpty(strM143252e4)) {
                this.f50844j.duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.zt50
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f204692a.m75099z0(strM143252e4, bLiveOperationItemPopUpDrawer, (AuthData) obj);
                    }
                }, new e30() { // from class: l.au50
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hfw.m130790a("[live]operation", "accessOutterToken " + ((Throwable) obj).getMessage());
                    }
                }));
            } else {
                m75095u0(strM143252e4, this.f48061g, bLiveOperationItemPopUpDrawer.h5Url);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m75085G0(WebView webView) {
        m75093r0();
        this.f48060f.setBackground(null);
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = false;
        xdl0.m208344M(webView, false);
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: H0 */
    public void m75086H0() {
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = false;
        this.f48061g.loadUrl("about:blank");
        m75093r0();
        this.f48060f.setBackground(null);
        xdl0.m208344M(this.f48061g, false);
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: I0 */
    public void m75087I0(Drawable drawable) {
        this.f48060f.setBackground(drawable);
        this.f50845k = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f50845k.setInterpolator(new LinearInterpolator());
        this.f50845k.setDuration(600L);
        this.f50845k.setRepeatCount(-1);
        this.f50845k.setFillAfter(true);
        this.f48063i.setAnimation(this.f50845k);
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [l.ho2] */
    /* JADX INFO: renamed from: J0 */
    public void m75088J0(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        xdl0.m208344M(this.f48061g, true);
        this.f48061g.clearAnimation();
        int i = (int) (this.f50846l * (m75098y0(bLiveOperationItemPopUpDrawer.width) ? bLiveOperationItemPopUpDrawer.width : 1.0f));
        m75089K0(i, (int) (this.f50847m * (m75098y0(bLiveOperationItemPopUpDrawer.height) ? bLiveOperationItemPopUpDrawer.height : 1.0f)));
        hxs.m133407t("context_livingAct", this.f48062h, bLiveOperationItemPopUpDrawer.closeButtonUrl, t100.f167264m);
        xdl0.m208329E0(this.f48062h, new View.OnClickListener() { // from class: l.xt50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194352a.m75075B0(view);
            }
        });
        int i2 = bLiveOperationItemPopUpDrawer.fadingSeconds;
        if (i2 > 0) {
            ((ju50) this.f48058d).m129293B3(i2, TimeUnit.SECONDS, new Runnable() { // from class: l.yt50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199889a.m75076D0();
                }
            });
        }
        m75084E0(bLiveOperationItemPopUpDrawer);
        ((ju50) this.f48058d).m206028F2().OperationsEvent.showOperationsRoot().mo172463j(new ku50.C18083a(8100).m147264i(false).m147256a());
        mu50.m156384d(((ju50) this.f48058d).m206032L2(), ((ju50) this.f48058d).m206027E2(), str, BLiveOperationPopupType.get(BLiveOperationPopupType.H5Drawer));
        m75091p0(i);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m75089K0(int i, int i2) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f48060f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a).width = i;
        ((ViewGroup.MarginLayoutParams) c0220a).height = i2;
        this.f48060f.setLayoutParams(c0220a);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p149l.s7m
    public void destroy() {
        this.f48061g.stopLoading();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public void m75090o0() {
        edv.m115835b(this.f48061g, this.f50848n);
        this.f48061g = null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72029h0(this);
        m75083t0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m75091p0(int i) {
        float f;
        int iIntValue = ((Integer) ((ju50) this.f48058d).m129297F3(new zr50(8100))).intValue();
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f48061g, true);
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
        this.f48060f.startAnimation(scaleAnimation);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationWebViewBindings, p149l.s7m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ju50 ju50Var) {
        if (NullChecker.m81303a(ju50Var)) {
            this.f48058d = ju50Var;
            this.f50844j = ju50Var.act();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m75093r0() {
        if (NullChecker.m81303a(this.f50845k)) {
            this.f50845k.cancel();
        }
        this.f48063i.clearAnimation();
        xdl0.m208344M(this.f48063i, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m75094s0() {
        if (NullChecker.m81303a(this.f48058d)) {
            ((ju50) this.f48058d).m143251d4();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75095u0(String str, MKWebView mKWebView, String str2) {
        mKWebView.setTag(g5c0.f100931f8, this);
        HashMap map = new HashMap();
        if (jkp0.m141904d(str2)) {
            map.put("H5-Authorization", str);
        }
        mKWebView.loadUrl(str2, map);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m75096v0(u3g0 u3g0Var) {
        return u3g0Var.f173610b == this.f48061g.hashCode();
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m75097w0() {
        Act act = this.f50844j;
        return (act == null || !(act instanceof PutongAct) || act.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m75098y0(float f) {
        return f > 0.0f && f <= 1.0f;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m75099z0(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer, AuthData authData) {
        ((ju50) this.f48058d).m143259l4(authData.accessToken);
        m75095u0(str, this.f48061g, bLiveOperationItemPopUpDrawer.h5Url);
    }

    public OperationWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50846l = t100.m186890d(148.0f);
        this.f50847m = t100.m186890d(72.0f);
    }

    public OperationWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50846l = t100.m186890d(148.0f);
        this.f50847m = t100.m186890d(72.0f);
    }
}
