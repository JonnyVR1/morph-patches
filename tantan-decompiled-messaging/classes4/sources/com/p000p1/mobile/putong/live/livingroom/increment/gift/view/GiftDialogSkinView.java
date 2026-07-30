package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

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
import com.p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.bt0;
import l.dt0;
import l.e30;
import l.hce;
import l.hxs;
import l.mep0;
import l.ngm;
import l.s7m;
import l.t100;
import l.xdl0;
import l.ym2;
import p002l.epj;
import p002l.i3c0;
import p002l.yoj;
import p002l.znj;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftDialogSkinView extends FrameLayout implements s7m<yoj<?>> {

    /* JADX INFO: renamed from: l */
    public static final int f6364l = t100.d(30.0f);

    /* JADX INFO: renamed from: a */
    public VDraweeView f6365a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6366b;

    /* JADX INFO: renamed from: c */
    public LiveMkWebView f6367c;

    /* JADX INFO: renamed from: d */
    public yoj<?> f6368d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6369e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f6370f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f6371g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f6372h;

    /* JADX INFO: renamed from: i */
    public int f6373i;

    /* JADX INFO: renamed from: j */
    public boolean f6374j;

    /* JADX INFO: renamed from: k */
    public String f6375k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogSkinView$a */
    public class C0433a extends ym2 {
        public C0433a() {
        }

        /* JADX INFO: renamed from: h */
        public void m8076h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int iY0 = (int) (xdl0.y0() * (ngmVar.getHeight() / ngmVar.getWidth()));
            xdl0.C0(GiftDialogSkinView.this.f6365a, iY0);
            GiftDialogSkinView.this.f6373i = iY0;
            GiftDialogSkinView.this.m8058M();
        }
    }

    public GiftDialogSkinView(@NonNull Context context) {
        super(context);
        this.f6374j = false;
    }

    /* JADX INFO: renamed from: E */
    private void m8039E() {
        LiveMkWebView liveMkWebView = this.f6367c;
        if (liveMkWebView == null) {
            return;
        }
        liveMkWebView.p();
        this.f6367c = null;
    }

    private void setSchemaAction(final BLiveGiftSkin bLiveGiftSkin) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveGiftSkin.top.schema);
        VDraweeView vDraweeView = this.f6365a;
        if (zIsEmpty) {
            vDraweeView.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.zoj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23523a.m8047A(bLiveGiftSkin, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8047A(BLiveGiftSkin bLiveGiftSkin, View view) {
        this.f6368d.mo14197p3(200, bLiveGiftSkin.top.schema);
    }

    /* JADX INFO: renamed from: B */
    public final void m8048B(final String str, final VDraweeView vDraweeView) {
        if (vDraweeView.getWidth() == 0) {
            vDraweeView.post(new Runnable() { // from class: l.apj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7846a.m8074y(str, vDraweeView);
                }
            });
        } else {
            m8074y(str, vDraweeView);
        }
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void m8074y(String str, VDraweeView vDraweeView) {
        hxs.u("context_livingAct", vDraweeView, str, vDraweeView.getWidth(), vDraweeView.getHeight());
    }

    /* JADX INFO: renamed from: C0 */
    public Context m8050C0() {
        return null;
    }

    /* JADX INFO: renamed from: F */
    public void m8051F() {
        int i;
        dt0.C(this.f6372h);
        dt0.C(this.f6371g);
        this.f6372h = null;
        this.f6371g = null;
        if (xdl0.O0(this) && (i = this.f6373i) != 0) {
            xdl0.C0(this, i);
        }
        m8065m();
    }

    /* JADX INFO: renamed from: G */
    public final void m8052G(BLiveGiftSkin bLiveGiftSkin) {
        if (TextUtils.isEmpty(bLiveGiftSkin.bg.url)) {
            this.f6369e.setBackgroundResource(i3c0.f12958t7);
            this.f6369e.setController((hce) null);
        } else {
            m8048B(bLiveGiftSkin.bg.url, this.f6369e);
            this.f6369e.setBackgroundResource(0);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m8053H(final BLiveGiftSkin bLiveGiftSkin) {
        xdl0.M0(this.f6365a, false);
        if (TextUtils.isEmpty(bLiveGiftSkin.top.url)) {
            return;
        }
        if (this.f6367c == null) {
            m8071v(bLiveGiftSkin.top.url);
        }
        xdl0.M(this.f6367c, true);
        this.f6367c.w(bLiveGiftSkin.top.url);
        int iM8069s = m8069s(bLiveGiftSkin);
        xdl0.C0(this.f6367c, iM8069s);
        this.f6373i = iM8069s;
        this.f6368d.m26850M3(new e30() { // from class: l.cpj
            public final void call(Object obj) {
                this.f8854a.m8075z(bLiveGiftSkin, (String) obj);
            }
        });
        m8058M();
    }

    /* JADX INFO: renamed from: I */
    public final void m8054I(BLiveGiftSkin bLiveGiftSkin) {
        this.f6374j = !TextUtils.isEmpty(bLiveGiftSkin.top.url);
        if (bLiveGiftSkin.isH5Type()) {
            m8053H(bLiveGiftSkin);
        } else {
            m8055J(bLiveGiftSkin);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m8055J(BLiveGiftSkin bLiveGiftSkin) {
        xdl0.M0(this.f6365a, !TextUtils.isEmpty(bLiveGiftSkin.top.url));
        LiveMkWebView liveMkWebView = this.f6367c;
        if (liveMkWebView != null) {
            xdl0.M(liveMkWebView, false);
        }
        setSchemaAction(bLiveGiftSkin);
        if (TextUtils.isEmpty(bLiveGiftSkin.top.url)) {
            return;
        }
        hxs.v("context_livingAct", this.f6365a, bLiveGiftSkin.top.url, 0, 0, false, true, false, new C0433a());
    }

    /* JADX INFO: renamed from: K */
    public final void m8056K(BLiveGiftSkin bLiveGiftSkin) {
        if (TextUtils.isEmpty(bLiveGiftSkin.interlayer.url)) {
            this.f6370f.setController((hce) null);
        } else {
            m8048B(bLiveGiftSkin.interlayer.url, this.f6370f);
        }
        xdl0.M0(this.f6370f, !TextUtils.isEmpty(bLiveGiftSkin.interlayer.url));
    }

    /* JADX INFO: renamed from: L */
    public void m8057L(BLiveGiftSkin bLiveGiftSkin) {
        if (bLiveGiftSkin == null) {
            m8065m();
            return;
        }
        if (TextUtils.equals(this.f6375k, bLiveGiftSkin.id)) {
            return;
        }
        this.f6375k = bLiveGiftSkin.id;
        setAlpha(1.0f);
        xdl0.M(this, true);
        m8052G(bLiveGiftSkin);
        m8056K(bLiveGiftSkin);
        m8054I(bLiveGiftSkin);
    }

    /* JADX INFO: renamed from: M */
    public final void m8058M() {
        yoj<?> yojVar = this.f6368d;
        if (yojVar == null) {
            return;
        }
        if (((Boolean) yojVar.m14184F3(new znj(700))).booleanValue()) {
            this.f6368d.m25548F2().GiftDialogEventGroup.giftDialogHeightChange().p();
        }
        int i = this.f6373i;
        if (i != 0) {
            xdl0.C0(this, i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m8059N() {
        if (xdl0.O0(this)) {
            if (this.f6372h == null) {
                this.f6372h = m8067p();
            }
            if (this.f6372h.isRunning()) {
                return;
            }
            this.f6372h.start();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m8060O() {
        if (xdl0.O0(this)) {
            if (this.f6371g == null) {
                this.f6371g = m8068q();
            }
            if (this.f6371g.isRunning()) {
                return;
            }
            this.f6371g.start();
        }
    }

    public void destroy() {
        m8039E();
    }

    public int getTopSkinHeight() {
        if (xdl0.O0(this)) {
            return this.f6373i - f6364l;
        }
        return 0;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m8062j(View view) {
        epj.m12656a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m8063k(VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        this.f6369e = vDraweeView;
        this.f6370f = vDraweeView2;
        mep0.c1(vDraweeView, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
        mep0.c1(vDraweeView2, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m8061i1(yoj<?> yojVar) {
        this.f6368d = yojVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m8065m() {
        VDraweeView vDraweeView = this.f6370f;
        if (vDraweeView != null) {
            vDraweeView.setController((hce) null);
        }
        VDraweeView vDraweeView2 = this.f6369e;
        if (vDraweeView2 != null) {
            vDraweeView2.setController((hce) null);
        }
        VDraweeView vDraweeView3 = this.f6365a;
        if (vDraweeView3 != null) {
            vDraweeView3.setController((hce) null);
        }
        LiveMkWebView liveMkWebView = this.f6367c;
        if (liveMkWebView != null) {
            liveMkWebView.v();
            xdl0.C0(this.f6367c, 0);
        }
        xdl0.M(this, false);
        this.f6375k = "";
    }

    /* JADX INFO: renamed from: n */
    public void m8066n() {
        LiveMkWebView liveMkWebView = this.f6367c;
        if (liveMkWebView == null || !xdl0.O0(liveMkWebView)) {
            return;
        }
        m8065m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8062j(this);
    }

    /* JADX INFO: renamed from: p */
    public final AnimatorSet m8067p() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f6373i, 1);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bpj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8303a.m8072w(valueAnimator);
            }
        });
        Animator animatorN = bt0.n(this, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorN.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorN);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q */
    public final AnimatorSet m8068q() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, this.f6373i);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dpj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9382a.m8073x(valueAnimator);
            }
        });
        Animator animatorN = bt0.n(this, View.ALPHA, new float[]{0.0f, 1.0f});
        animatorN.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorN);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s */
    public final int m8069s(BLiveGiftSkin bLiveGiftSkin) {
        Uri uri = Uri.parse(bLiveGiftSkin.top.url);
        try {
            return (int) (xdl0.y0() / (Integer.parseInt(uri.getQueryParameter("topSkinWidth")) / Integer.parseInt(uri.getQueryParameter("topSkinHeight"))));
        } catch (Exception unused) {
            return t100.d(80.0f);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m8070u() {
        return this.f6374j;
    }

    /* JADX INFO: renamed from: v */
    public final void m8071v(String str) {
        LiveMkWebView liveMkWebViewInflate = this.f6366b.inflate();
        this.f6367c = liveMkWebViewInflate;
        CommonH5Builder.BgType bgType = CommonH5Builder.BgType.TRAN_BG;
        liveMkWebViewInflate.y(true, str, bgType);
        this.f6367c.setWithProgressView(false);
        this.f6367c.setWithErrorView(false);
        this.f6367c.setVerticalScrollBarEnable(false);
        this.f6367c.setWebViewBg(bgType);
        mep0.c1(this.f6367c, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8072w(ValueAnimator valueAnimator) {
        xdl0.C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8073x(ValueAnimator valueAnimator) {
        xdl0.C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8075z(BLiveGiftSkin bLiveGiftSkin, String str) {
        this.f6367c.k(this.f6368d.act(), str, bLiveGiftSkin.top.url);
    }

    public GiftDialogSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6374j = false;
    }

    public GiftDialogSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6374j = false;
    }
}
