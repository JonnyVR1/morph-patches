package com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c17;
import p153l.dbc0;
import p153l.deq0;
import p153l.gt0;
import p153l.l51;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class WengwengPullHeadAnim extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public static final float f26433n = qa00.m175859d(38.0f);

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f26434d;

    /* JADX INFO: renamed from: e */
    public VLinear f26435e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f26436f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f26437g;

    /* JADX INFO: renamed from: h */
    public VText f26438h;

    /* JADX INFO: renamed from: i */
    public WengWengHeaderView f26439i;

    /* JADX INFO: renamed from: j */
    public boolean f26440j;

    /* JADX INFO: renamed from: k */
    public final Handler f26441k;

    /* JADX INFO: renamed from: l */
    public int f26442l;

    /* JADX INFO: renamed from: m */
    public final Runnable f26443m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$a */
    public class C8322a extends AnimListener {
        public C8322a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            WengwengPullHeadAnim.this.m43263q0();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            WengwengPullHeadAnim.this.m43259B0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$b */
    public class C8323b implements RequestCallback {
        public C8323b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m43273b() {
            if (WengwengPullHeadAnim.this.f26442l < 50) {
                WengwengPullHeadAnim.this.m43267u0();
            }
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            WengwengPullHeadAnim.this.f26442l++;
            l51.m152888H(WengwengPullHeadAnim.this.getContext(), new Runnable() { // from class: l.beq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76408a.m43273b();
                }
            }, 200L);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$c */
    public class RunnableC8324c implements Runnable {
        public RunnableC8324c() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m43275b(Animator animator) {
            bnl0.m105524M(WengwengPullHeadAnim.this.f26434d, true);
            animator.start();
            WengwengPullHeadAnim.this.f26434d.startAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WengwengPullHeadAnim.this.f26439i.getHeaderState() == WengWengHeaderView.State.TipState) {
                VDraweeView vDraweeView = WengwengPullHeadAnim.this.f26437g;
                Property property = View.ALPHA;
                Animator animatorM132166l = gt0.m132166l(vDraweeView, property, 0L, 200L, null, 1.0f, 0.0f);
                Animator animatorM132166l2 = gt0.m132166l(WengwengPullHeadAnim.this.f26436f, property, 0L, 200L, null, 1.0f, 0.0f);
                final Animator animatorM132166l3 = gt0.m132166l(WengwengPullHeadAnim.this.f26434d, property, 0L, 200L, null, 0.0f, 1.0f);
                gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.ceq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81410a.m43275b(animatorM132166l3);
                    }
                });
                animatorM132166l.start();
                animatorM132166l2.start();
            }
        }
    }

    public WengwengPullHeadAnim(Context context) {
        super(context);
        this.f26440j = false;
        this.f26441k = new Handler(Looper.getMainLooper());
        this.f26442l = 0;
        this.f26443m = new RunnableC8324c();
        m43258r();
    }

    /* JADX INFO: renamed from: r */
    private void m43258r() {
        m43262p0(LayoutInflater.from(getContext()), this);
        uqb0.f180374G.m127115L0(this.f26437g, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127138Y0(this.f26436f, c17.m107528u0() ? dbc0.f87081i9 : dbc0.f87048h9);
        m43267u0();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m43259B0() {
        bnl0.m105524M(this.f26437g, false);
        bnl0.m105524M(this.f26436f, false);
        this.f26437g.setAlpha(0.0f);
        this.f26436f.setAlpha(0.0f);
        bnl0.m105538V(this.f26437g, qa00.m175859d(8.0f));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m43260D0(int i) {
        WengWengHeaderView wengWengHeaderView = this.f26439i;
        if (wengWengHeaderView == null) {
            return;
        }
        if (wengWengHeaderView.getHeaderState() == WengWengHeaderView.State.NormalState) {
            float f = i;
            float f2 = f26433n;
            if (f < f2) {
                bnl0.m105524M(this.f26438h, false);
                return;
            }
            this.f26438h.setAlpha((f - f2) / (this.f26439i.getMAX_PULL_VIEW_HEIGH() - f2));
            bnl0.m105524M(this.f26438h, true);
            return;
        }
        if (this.f26439i.getHeaderState() == WengWengHeaderView.State.TipState) {
            float f3 = i;
            float f4 = f26433n;
            VText vText = this.f26438h;
            if (f3 < f4) {
                bnl0.m105524M(vText, false);
            } else {
                vText.setAlpha(1.0f);
                bnl0.m105524M(this.f26438h, true);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m43261E0(int i) {
        float f;
        int i2;
        int max_pull_view_heigh = this.f26439i.getMAX_PULL_VIEW_HEIGH();
        int iM175859d = qa00.m175859d(38.0f);
        WengWengHeaderView.State headerState = this.f26439i.getHeaderState();
        WengWengHeaderView.State state = WengWengHeaderView.State.NormalState;
        if (headerState == state) {
            f = i / (max_pull_view_heigh * 1.0f);
        } else {
            f = this.f26439i.getHeaderState() == WengWengHeaderView.State.TipState ? (i - iM175859d) / ((max_pull_view_heigh - iM175859d) * 1.0f) : 0.0f;
        }
        int iM175859d2 = qa00.m175859d((i * 38) / (max_pull_view_heigh * 1.0f));
        bnl0.m105505C0(this.f26437g, iM175859d2);
        bnl0.m105505C0(this.f26436f, iM175859d2);
        int i3 = 0;
        bnl0.m105507D0(iM175859d2, this.f26437g);
        bnl0.m105507D0(iM175859d2, this.f26436f);
        bnl0.m105505C0(this.f26434d, iM175859d2);
        int iM175859d3 = qa00.m175859d(8.0f);
        int iM175859d4 = qa00.m175859d(4.0f);
        int iM175859d5 = qa00.m175859d(8.0f);
        int iM175859d6 = qa00.m175859d(12.0f);
        int iM175859d7 = qa00.m175859d(4.0f);
        int iM175859d8 = qa00.m175859d(8.0f);
        if (this.f26439i.getHeaderState() == state) {
            i3 = (int) (iM175859d3 * f);
            i2 = (int) (iM175859d6 * f);
        } else if (this.f26439i.getHeaderState() == WengWengHeaderView.State.TipState) {
            i3 = (int) (iM175859d4 + ((iM175859d5 - iM175859d4) * f));
            i2 = (int) (iM175859d7 + ((iM175859d8 - iM175859d7) * f));
        } else {
            i2 = 0;
        }
        bnl0.m105540X(this.f26434d, i3);
        bnl0.m105540X(this.f26435e, i3);
        bnl0.m105537U(this.f26438h, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26441k.removeCallbacks(this.f26443m);
    }

    /* JADX INFO: renamed from: p0 */
    public View m43262p0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return deq0.m115455b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m43263q0() {
        Animator animatorM132166l = gt0.m132166l(this.f26434d, View.ALPHA, 0L, 200L, null, 1.0f, 0.0f);
        gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.zdq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f203934a.m43265s0();
            }
        });
        animatorM132166l.start();
    }

    /* JADX INFO: renamed from: r0 */
    public void m43264r0() {
        if (bnl0.m105529O0(this)) {
            bnl0.m105524M(this, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m43265s0() {
        bnl0.m105524M(this.f26434d, false);
        m43269w0();
        this.f26441k.postDelayed(this.f26443m, 3000L);
    }

    public void setData(WengWengHeaderView wengWengHeaderView) {
        this.f26439i = wengWengHeaderView;
    }

    public void setPullHeight(int i) {
        if (i == 0) {
            m43264r0();
            return;
        }
        bnl0.m105524M(this, true);
        m43261E0(i);
        m43260D0(i);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m43266t0(ValueAnimator valueAnimator) {
        bnl0.m105538V(this.f26437g, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m43267u0() {
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/ef40b278-b08d-43ad-9c4a-9d67999fc6a314.svga").repeatCount(1).autoPlay(false).loadCallback(new C8323b()).animListener(new C8322a()).into(this.f26434d);
    }

    /* JADX INFO: renamed from: v0 */
    public void m43268v0() {
        WengWengHeaderView wengWengHeaderView;
        if (this.f26440j || (wengWengHeaderView = this.f26439i) == null) {
            return;
        }
        if (wengWengHeaderView.getHeaderState() == WengWengHeaderView.State.NormalState) {
            bnl0.m105524M(this.f26436f, false);
            bnl0.m105524M(this.f26437g, false);
            bnl0.m105524M(this.f26434d, true);
            this.f26438h.setTextSize(11.0f);
            this.f26434d.setAlpha(1.0f);
            this.f26434d.startAnimation();
        } else if (this.f26439i.getHeaderState() == WengWengHeaderView.State.TipState) {
            this.f26438h.setTextSize(10.0f);
            m43270y0();
        }
        this.f26440j = true;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m43269w0() {
        bnl0.m105524M(this.f26437g, true);
        bnl0.m105524M(this.f26436f, true);
        Property property = View.ALPHA;
        Animator animatorM132166l = gt0.m132166l(this.f26437g, property, 0L, 200L, null, 0.0f, 1.0f);
        Animator animatorM132166l2 = gt0.m132166l(this.f26436f, property, 0L, 200L, null, 0.0f, 1.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qa00.m175859d(8.0f), qa00.m175859d(-6.0f));
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.aeq0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f70821a.m43266t0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        animatorM132166l.start();
        animatorM132166l2.start();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m43270y0() {
        this.f26441k.removeCallbacks(this.f26443m);
        this.f26441k.post(this.f26443m);
    }

    /* JADX INFO: renamed from: z0 */
    public void m43271z0(boolean z) {
        this.f26434d.stopAnimation(z);
        this.f26440j = false;
        this.f26441k.removeCallbacks(this.f26443m);
    }

    public WengwengPullHeadAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26440j = false;
        this.f26441k = new Handler(Looper.getMainLooper());
        this.f26442l = 0;
        this.f26443m = new RunnableC8324c();
        m43258r();
    }

    public WengwengPullHeadAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26440j = false;
        this.f26441k = new Handler(Looper.getMainLooper());
        this.f26442l = 0;
        this.f26443m = new RunnableC8324c();
        m43258r();
    }
}
