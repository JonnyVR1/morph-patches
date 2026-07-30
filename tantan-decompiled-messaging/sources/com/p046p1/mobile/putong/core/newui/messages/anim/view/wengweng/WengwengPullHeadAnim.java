package com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.e51;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.z4q0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public class WengwengPullHeadAnim extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public static final float f25691n = t100.m186890d(38.0f);

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f25692d;

    /* JADX INFO: renamed from: e */
    public VLinear f25693e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f25694f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f25695g;

    /* JADX INFO: renamed from: h */
    public VText f25696h;

    /* JADX INFO: renamed from: i */
    public WengWengHeaderView f25697i;

    /* JADX INFO: renamed from: j */
    public boolean f25698j;

    /* JADX INFO: renamed from: k */
    public final Handler f25699k;

    /* JADX INFO: renamed from: l */
    public int f25700l;

    /* JADX INFO: renamed from: m */
    public final Runnable f25701m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$a */
    public class C8171a extends AnimListener {
        public C8171a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            WengwengPullHeadAnim.this.m42252q0();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            WengwengPullHeadAnim.this.m42248B0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$b */
    public class C8172b implements RequestCallback {
        public C8172b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m42262b() {
            if (WengwengPullHeadAnim.this.f25700l < 50) {
                WengwengPullHeadAnim.this.m42256u0();
            }
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            WengwengPullHeadAnim.this.f25700l++;
            e51.m114743H(WengwengPullHeadAnim.this.getContext(), new Runnable() { // from class: l.x4q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191045a.m42262b();
                }
            }, 200L);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$c */
    public class RunnableC8173c implements Runnable {
        public RunnableC8173c() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m42264b(Animator animator) {
            xdl0.m208344M(WengwengPullHeadAnim.this.f25692d, true);
            animator.start();
            WengwengPullHeadAnim.this.f25692d.startAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WengwengPullHeadAnim.this.f25697i.getHeaderState() == WengWengHeaderView.State.TipState) {
                VDraweeView vDraweeView = WengwengPullHeadAnim.this.f25695g;
                Property property = View.ALPHA;
                Animator animatorM103739l = bt0.m103739l(vDraweeView, property, 0L, 200L, null, 1.0f, 0.0f);
                Animator animatorM103739l2 = bt0.m103739l(WengwengPullHeadAnim.this.f25694f, property, 0L, 200L, null, 1.0f, 0.0f);
                final Animator animatorM103739l3 = bt0.m103739l(WengwengPullHeadAnim.this.f25692d, property, 0L, 200L, null, 0.0f, 1.0f);
                bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.y4q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196327a.m42264b(animatorM103739l3);
                    }
                });
                animatorM103739l.start();
                animatorM103739l2.start();
            }
        }
    }

    public WengwengPullHeadAnim(Context context) {
        super(context);
        this.f25698j = false;
        this.f25699k = new Handler(Looper.getMainLooper());
        this.f25700l = 0;
        this.f25701m = new RunnableC8173c();
        m42247r();
    }

    /* JADX INFO: renamed from: r */
    private void m42247r() {
        m42251p0(LayoutInflater.from(getContext()), this);
        qib0.f154691G.m102331L0(this.f25695g, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        qib0.f154691G.m102354Y0(this.f25694f, zz6.m221004u0() ? x2c0.f190198h9 : x2c0.f190166g9);
        m42256u0();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m42248B0() {
        xdl0.m208344M(this.f25695g, false);
        xdl0.m208344M(this.f25694f, false);
        this.f25695g.setAlpha(0.0f);
        this.f25694f.setAlpha(0.0f);
        xdl0.m208358V(this.f25695g, t100.m186890d(8.0f));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m42249D0(int i) {
        WengWengHeaderView wengWengHeaderView = this.f25697i;
        if (wengWengHeaderView == null) {
            return;
        }
        if (wengWengHeaderView.getHeaderState() == WengWengHeaderView.State.NormalState) {
            float f = i;
            float f2 = f25691n;
            if (f < f2) {
                xdl0.m208344M(this.f25696h, false);
                return;
            }
            this.f25696h.setAlpha((f - f2) / (this.f25697i.getMAX_PULL_VIEW_HEIGH() - f2));
            xdl0.m208344M(this.f25696h, true);
            return;
        }
        if (this.f25697i.getHeaderState() == WengWengHeaderView.State.TipState) {
            float f3 = i;
            float f4 = f25691n;
            VText vText = this.f25696h;
            if (f3 < f4) {
                xdl0.m208344M(vText, false);
            } else {
                vText.setAlpha(1.0f);
                xdl0.m208344M(this.f25696h, true);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m42250E0(int i) {
        float f;
        int i2;
        int max_pull_view_heigh = this.f25697i.getMAX_PULL_VIEW_HEIGH();
        int iM186890d = t100.m186890d(38.0f);
        WengWengHeaderView.State headerState = this.f25697i.getHeaderState();
        WengWengHeaderView.State state = WengWengHeaderView.State.NormalState;
        if (headerState == state) {
            f = i / (max_pull_view_heigh * 1.0f);
        } else {
            f = this.f25697i.getHeaderState() == WengWengHeaderView.State.TipState ? (i - iM186890d) / ((max_pull_view_heigh - iM186890d) * 1.0f) : 0.0f;
        }
        int iM186890d2 = t100.m186890d((i * 38) / (max_pull_view_heigh * 1.0f));
        xdl0.m208325C0(this.f25695g, iM186890d2);
        xdl0.m208325C0(this.f25694f, iM186890d2);
        int i3 = 0;
        xdl0.m208327D0(iM186890d2, this.f25695g);
        xdl0.m208327D0(iM186890d2, this.f25694f);
        xdl0.m208325C0(this.f25692d, iM186890d2);
        int iM186890d3 = t100.m186890d(8.0f);
        int iM186890d4 = t100.m186890d(4.0f);
        int iM186890d5 = t100.m186890d(8.0f);
        int iM186890d6 = t100.m186890d(12.0f);
        int iM186890d7 = t100.m186890d(4.0f);
        int iM186890d8 = t100.m186890d(8.0f);
        if (this.f25697i.getHeaderState() == state) {
            i3 = (int) (iM186890d3 * f);
            i2 = (int) (iM186890d6 * f);
        } else if (this.f25697i.getHeaderState() == WengWengHeaderView.State.TipState) {
            i3 = (int) (iM186890d4 + ((iM186890d5 - iM186890d4) * f));
            i2 = (int) (iM186890d7 + ((iM186890d8 - iM186890d7) * f));
        } else {
            i2 = 0;
        }
        xdl0.m208360X(this.f25692d, i3);
        xdl0.m208360X(this.f25693e, i3);
        xdl0.m208357U(this.f25696h, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25699k.removeCallbacks(this.f25701m);
    }

    /* JADX INFO: renamed from: p0 */
    public View m42251p0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z4q0.m217117b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m42252q0() {
        Animator animatorM103739l = bt0.m103739l(this.f25692d, View.ALPHA, 0L, 200L, null, 1.0f, 0.0f);
        bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.v4q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179969a.m42254s0();
            }
        });
        animatorM103739l.start();
    }

    /* JADX INFO: renamed from: r0 */
    public void m42253r0() {
        if (xdl0.m208349O0(this)) {
            xdl0.m208344M(this, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m42254s0() {
        xdl0.m208344M(this.f25692d, false);
        m42258w0();
        this.f25699k.postDelayed(this.f25701m, 3000L);
    }

    public void setData(WengWengHeaderView wengWengHeaderView) {
        this.f25697i = wengWengHeaderView;
    }

    public void setPullHeight(int i) {
        if (i == 0) {
            m42253r0();
            return;
        }
        xdl0.m208344M(this, true);
        m42250E0(i);
        m42249D0(i);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m42255t0(ValueAnimator valueAnimator) {
        xdl0.m208358V(this.f25695g, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m42256u0() {
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/ef40b278-b08d-43ad-9c4a-9d67999fc6a314.svga").repeatCount(1).autoPlay(false).loadCallback(new C8172b()).animListener(new C8171a()).into(this.f25692d);
    }

    /* JADX INFO: renamed from: v0 */
    public void m42257v0() {
        WengWengHeaderView wengWengHeaderView;
        if (this.f25698j || (wengWengHeaderView = this.f25697i) == null) {
            return;
        }
        if (wengWengHeaderView.getHeaderState() == WengWengHeaderView.State.NormalState) {
            xdl0.m208344M(this.f25694f, false);
            xdl0.m208344M(this.f25695g, false);
            xdl0.m208344M(this.f25692d, true);
            this.f25696h.setTextSize(11.0f);
            this.f25692d.setAlpha(1.0f);
            this.f25692d.startAnimation();
        } else if (this.f25697i.getHeaderState() == WengWengHeaderView.State.TipState) {
            this.f25696h.setTextSize(10.0f);
            m42259y0();
        }
        this.f25698j = true;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m42258w0() {
        xdl0.m208344M(this.f25695g, true);
        xdl0.m208344M(this.f25694f, true);
        Property property = View.ALPHA;
        Animator animatorM103739l = bt0.m103739l(this.f25695g, property, 0L, 200L, null, 0.0f, 1.0f);
        Animator animatorM103739l2 = bt0.m103739l(this.f25694f, property, 0L, 200L, null, 0.0f, 1.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(t100.m186890d(8.0f), t100.m186890d(-6.0f));
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.w4q0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f184584a.m42255t0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        animatorM103739l.start();
        animatorM103739l2.start();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m42259y0() {
        this.f25699k.removeCallbacks(this.f25701m);
        this.f25699k.post(this.f25701m);
    }

    /* JADX INFO: renamed from: z0 */
    public void m42260z0(boolean z) {
        this.f25692d.stopAnimation(z);
        this.f25698j = false;
        this.f25699k.removeCallbacks(this.f25701m);
    }

    public WengwengPullHeadAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25698j = false;
        this.f25699k = new Handler(Looper.getMainLooper());
        this.f25700l = 0;
        this.f25701m = new RunnableC8173c();
        m42247r();
    }

    public WengwengPullHeadAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25698j = false;
        this.f25699k = new Handler(Looper.getMainLooper());
        this.f25700l = 0;
        this.f25701m = new RunnableC8173c();
        m42247r();
    }
}
