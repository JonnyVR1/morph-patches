package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.fn2;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.obc0;
import p153l.orj;
import p153l.pqj;
import p153l.qa00;
import p153l.qim;
import p153l.qnp0;
import p153l.urj;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogSkinView extends FrameLayout implements iam<orj<?>> {

    /* JADX INFO: renamed from: l */
    public static final int f51170l = qa00.m175859d(30.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f51171a;

    /* JADX INFO: renamed from: b */
    public ViewStub f51172b;

    /* JADX INFO: renamed from: c */
    public LiveMkWebView f51173c;

    /* JADX INFO: renamed from: d */
    public orj<?> f51174d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51175e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51176f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f51177g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f51178h;

    /* JADX INFO: renamed from: i */
    public int f51179i;

    /* JADX INFO: renamed from: j */
    public boolean f51180j;

    /* JADX INFO: renamed from: k */
    public String f51181k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView$a */
    public class C13007a extends fn2 {
        public C13007a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            int iM105592y0 = (int) (bnl0.m105592y0() * (qimVar.getHeight() / qimVar.getWidth()));
            bnl0.m105505C0(GiftDialogSkinView.this.f51171a, iM105592y0);
            GiftDialogSkinView.this.f51179i = iM105592y0;
            GiftDialogSkinView.this.m75656M();
        }
    }

    public GiftDialogSkinView(@NonNull Context context) {
        super(context);
        this.f51180j = false;
    }

    /* JADX INFO: renamed from: E */
    private void m75638E() {
        LiveMkWebView liveMkWebView = this.f51173c;
        if (liveMkWebView == null) {
            return;
        }
        liveMkWebView.m70050p();
        this.f51173c = null;
    }

    private void setSchemaAction(final BLiveGiftSkin bLiveGiftSkin) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftSkin.top.schema);
        VDraweeView vDraweeView = this.f51171a;
        if (zIsEmpty) {
            vDraweeView.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.prj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153801a.m75646A(bLiveGiftSkin, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m75646A(BLiveGiftSkin bLiveGiftSkin, View view) {
        this.f51174d.mo138869p3(200, bLiveGiftSkin.top.schema);
    }

    /* JADX INFO: renamed from: B */
    public final void m75647B(final String str, final VDraweeView vDraweeView) {
        if (vDraweeView.getWidth() == 0) {
            vDraweeView.post(new Runnable() { // from class: l.qrj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159133a.m75671y(str, vDraweeView);
                }
            });
        } else {
            m75671y(str, vDraweeView);
        }
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void m75671y(String str, VDraweeView vDraweeView) {
        izs.m142870u("context_livingAct", vDraweeView, str, vDraweeView.getWidth(), vDraweeView.getHeight());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public void m75649F() {
        int i;
        it0.m142009C(this.f51178h);
        it0.m142009C(this.f51177g);
        this.f51178h = null;
        this.f51177g = null;
        if (bnl0.m105529O0(this) && (i = this.f51179i) != 0) {
            bnl0.m105505C0(this, i);
        }
        m75662m();
    }

    /* JADX INFO: renamed from: G */
    public final void m75650G(BLiveGiftSkin bLiveGiftSkin) {
        if (TextUtils.isEmpty(bLiveGiftSkin.f45231bg.url)) {
            this.f51175e.setBackgroundResource(obc0.f146501t7);
            this.f51175e.setController(null);
        } else {
            m75647B(bLiveGiftSkin.f45231bg.url, this.f51175e);
            this.f51175e.setBackgroundResource(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m75651H(final BLiveGiftSkin bLiveGiftSkin) {
        bnl0.m105525M0(this.f51171a, false);
        if (TextUtils.isEmpty(bLiveGiftSkin.top.url)) {
            return;
        }
        if (this.f51173c == null) {
            m75668v(bLiveGiftSkin.top.url);
        }
        bnl0.m105524M(this.f51173c, true);
        this.f51173c.m70057w(bLiveGiftSkin.top.url);
        int iM75666s = m75666s(bLiveGiftSkin);
        bnl0.m105505C0(this.f51173c, iM75666s);
        this.f51179i = iM75666s;
        this.f51174d.m168932M3(new y20() { // from class: l.srj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170352a.m75672z(bLiveGiftSkin, (String) obj);
            }
        });
        m75656M();
    }

    /* JADX INFO: renamed from: I */
    public final void m75652I(BLiveGiftSkin bLiveGiftSkin) {
        this.f51180j = !TextUtils.isEmpty(bLiveGiftSkin.top.url);
        if (bLiveGiftSkin.isH5Type()) {
            m75651H(bLiveGiftSkin);
        } else {
            m75653J(bLiveGiftSkin);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m75653J(BLiveGiftSkin bLiveGiftSkin) {
        bnl0.m105525M0(this.f51171a, !TextUtils.isEmpty(bLiveGiftSkin.top.url));
        LiveMkWebView liveMkWebView = this.f51173c;
        if (liveMkWebView != null) {
            bnl0.m105524M(liveMkWebView, false);
        }
        setSchemaAction(bLiveGiftSkin);
        if (TextUtils.isEmpty(bLiveGiftSkin.top.url)) {
            return;
        }
        izs.m142871v("context_livingAct", this.f51171a, bLiveGiftSkin.top.url, 0, 0, false, true, false, new C13007a());
    }

    /* JADX INFO: renamed from: K */
    public final void m75654K(BLiveGiftSkin bLiveGiftSkin) {
        if (TextUtils.isEmpty(bLiveGiftSkin.interlayer.url)) {
            this.f51176f.setController(null);
        } else {
            m75647B(bLiveGiftSkin.interlayer.url, this.f51176f);
        }
        bnl0.m105525M0(this.f51176f, !TextUtils.isEmpty(bLiveGiftSkin.interlayer.url));
    }

    /* JADX INFO: renamed from: L */
    public void m75655L(BLiveGiftSkin bLiveGiftSkin) {
        if (bLiveGiftSkin == null) {
            m75662m();
            return;
        }
        if (TextUtils.equals(this.f51181k, bLiveGiftSkin.f45232id)) {
            return;
        }
        this.f51181k = bLiveGiftSkin.f45232id;
        setAlpha(1.0f);
        bnl0.m105524M(this, true);
        m75650G(bLiveGiftSkin);
        m75654K(bLiveGiftSkin);
        m75652I(bLiveGiftSkin);
    }

    /* JADX INFO: renamed from: M */
    public final void m75656M() {
        orj<?> orjVar = this.f51174d;
        if (orjVar == null) {
            return;
        }
        if (((Boolean) orjVar.m138856F3(new pqj(700))).booleanValue()) {
            this.f51174d.m213811F2().GiftDialogEventGroup.giftDialogHeightChange().m199277p();
        }
        int i = this.f51179i;
        if (i != 0) {
            bnl0.m105505C0(this, i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m75657N() {
        if (bnl0.m105529O0(this)) {
            if (this.f51178h == null) {
                this.f51178h = m75664p();
            }
            if (this.f51178h.isRunning()) {
                return;
            }
            this.f51178h.start();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m75658O() {
        if (bnl0.m105529O0(this)) {
            if (this.f51177g == null) {
                this.f51177g = m75665q();
            }
            if (this.f51177g.isRunning()) {
                return;
            }
            this.f51177g.start();
        }
    }

    @Override // p153l.iam
    public void destroy() {
        m75638E();
    }

    public int getTopSkinHeight() {
        if (bnl0.m105529O0(this)) {
            return this.f51179i - f51170l;
        }
        return 0;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m75659j(View view) {
        urj.m197616a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m75660k(VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f51175e = vDraweeView;
        this.f51176f = vDraweeView2;
        qnp0.m177260c1(vDraweeView, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        qnp0.m177260c1(vDraweeView2, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(orj<?> orjVar) {
        this.f51174d = orjVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m75662m() {
        VDraweeView vDraweeView = this.f51176f;
        if (vDraweeView != null) {
            vDraweeView.setController(null);
        }
        VDraweeView vDraweeView2 = this.f51175e;
        if (vDraweeView2 != null) {
            vDraweeView2.setController(null);
        }
        VDraweeView vDraweeView3 = this.f51171a;
        if (vDraweeView3 != null) {
            vDraweeView3.setController(null);
        }
        LiveMkWebView liveMkWebView = this.f51173c;
        if (liveMkWebView != null) {
            liveMkWebView.m70056v();
            bnl0.m105505C0(this.f51173c, 0);
        }
        bnl0.m105524M(this, false);
        this.f51181k = "";
    }

    /* JADX INFO: renamed from: n */
    public void m75663n() {
        LiveMkWebView liveMkWebView = this.f51173c;
        if (liveMkWebView == null || !bnl0.m105529O0(liveMkWebView)) {
            return;
        }
        m75662m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75659j(this);
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorSet m75664p() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f51179i, 1);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rrj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f164583a.m75669w(valueAnimator);
            }
        });
        Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM132168n);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q */
    public final AnimatorSet m75665q() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, this.f51179i);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.trj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f175882a.m75670x(valueAnimator);
            }
        });
        Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 0.0f, 1.0f);
        animatorM132168n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM132168n);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s */
    public final int m75666s(BLiveGiftSkin bLiveGiftSkin) {
        Uri uri = Uri.parse(bLiveGiftSkin.top.url);
        try {
            return (int) (bnl0.m105592y0() / (Integer.parseInt(uri.getQueryParameter("topSkinWidth")) / Integer.parseInt(uri.getQueryParameter("topSkinHeight"))));
        } catch (Exception unused) {
            return qa00.m175859d(80.0f);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m75667u() {
        return this.f51180j;
    }

    /* JADX INFO: renamed from: v */
    public final void m75668v(String str) {
        LiveMkWebView liveMkWebView = (LiveMkWebView) this.f51172b.inflate();
        this.f51173c = liveMkWebView;
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebView.m70059y(true, str, bgType);
        this.f51173c.setWithProgressView(false);
        this.f51173c.setWithErrorView(false);
        this.f51173c.setVerticalScrollBarEnable(false);
        this.f51173c.setWebViewBg(bgType);
        qnp0.m177260c1(this.f51173c, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m75669w(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m75670x(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m75672z(BLiveGiftSkin bLiveGiftSkin, String str) {
        this.f51173c.m70045k((PutongAct) this.f51174d.act(), str, bLiveGiftSkin.top.url);
    }

    public GiftDialogSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51180j = false;
    }

    public GiftDialogSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51180j = false;
    }
}
