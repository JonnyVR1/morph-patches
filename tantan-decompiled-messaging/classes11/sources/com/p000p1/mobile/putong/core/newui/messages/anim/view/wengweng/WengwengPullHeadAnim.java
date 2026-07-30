package com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng;

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
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.bt0;
import l.e51;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import l.z4q0;
import l.zz6;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WengwengPullHeadAnim extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public static final float f4469n = t100.d(38.0f);

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f4470d;

    /* JADX INFO: renamed from: e */
    public VLinear f4471e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4472f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4473g;

    /* JADX INFO: renamed from: h */
    public VText f4474h;

    /* JADX INFO: renamed from: i */
    public WengWengHeaderView f4475i;

    /* JADX INFO: renamed from: j */
    public boolean f4476j;

    /* JADX INFO: renamed from: k */
    public final Handler f4477k;

    /* JADX INFO: renamed from: l */
    public int f4478l;

    /* JADX INFO: renamed from: m */
    public final Runnable f4479m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$a */
    public class C0335a extends AnimListener {
        public C0335a() {
        }

        public void onFinished() {
            super.onFinished();
            WengwengPullHeadAnim.this.m6401q0();
        }

        public void onStart() {
            super.onStart();
            WengwengPullHeadAnim.this.m6397B0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$b */
    public class C0336b implements RequestCallback {
        public C0336b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m6411b() {
            if (WengwengPullHeadAnim.this.f4478l < 50) {
                WengwengPullHeadAnim.this.m6405u0();
            }
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            WengwengPullHeadAnim.this.f4478l++;
            e51.H(WengwengPullHeadAnim.this.getContext(), new Runnable() { // from class: l.x4q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22431a.m6411b();
                }
            }, 200L);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengwengPullHeadAnim$c */
    public class RunnableC0337c implements Runnable {
        public RunnableC0337c() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m6413b(Animator animator) {
            xdl0.M(WengwengPullHeadAnim.this.f4470d, true);
            animator.start();
            WengwengPullHeadAnim.this.f4470d.startAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WengwengPullHeadAnim.this.f4475i.getHeaderState() == WengWengHeaderView.State.TipState) {
                VDraweeView vDraweeView = WengwengPullHeadAnim.this.f4473g;
                Property property = View.ALPHA;
                Animator animatorL = bt0.l(vDraweeView, property, 0L, 200L, (Interpolator) null, new float[]{1.0f, 0.0f});
                Animator animatorL2 = bt0.l(WengwengPullHeadAnim.this.f4472f, property, 0L, 200L, (Interpolator) null, new float[]{1.0f, 0.0f});
                final Animator animatorL3 = bt0.l(WengwengPullHeadAnim.this.f4470d, property, 0L, 200L, (Interpolator) null, new float[]{0.0f, 1.0f});
                bt0.f(animatorL, new Runnable() { // from class: l.y4q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22893a.m6413b(animatorL3);
                    }
                });
                animatorL.start();
                animatorL2.start();
            }
        }
    }

    public WengwengPullHeadAnim(Context context) {
        super(context);
        this.f4476j = false;
        this.f4477k = new Handler(Looper.getMainLooper());
        this.f4478l = 0;
        this.f4479m = new RunnableC0337c();
        m6396r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m6396r() {
        m6400p0(LayoutInflater.from(getContext()), this);
        qib0.G.L0(this.f4473g, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        qib0.G.Y0(this.f4472f, zz6.u0() ? x2c0.h9 : x2c0.g9);
        m6405u0();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6397B0() {
        xdl0.M(this.f4473g, false);
        xdl0.M(this.f4472f, false);
        this.f4473g.setAlpha(0.0f);
        this.f4472f.setAlpha(0.0f);
        xdl0.V(this.f4473g, t100.d(8.0f));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6398D0(int i) {
        WengWengHeaderView wengWengHeaderView = this.f4475i;
        if (wengWengHeaderView == null) {
            return;
        }
        if (wengWengHeaderView.getHeaderState() == WengWengHeaderView.State.NormalState) {
            float f = i;
            float f2 = f4469n;
            if (f < f2) {
                xdl0.M(this.f4474h, false);
                return;
            }
            this.f4474h.setAlpha((f - f2) / (this.f4475i.getMAX_PULL_VIEW_HEIGH() - f2));
            xdl0.M(this.f4474h, true);
            return;
        }
        if (this.f4475i.getHeaderState() == WengWengHeaderView.State.TipState) {
            float f3 = i;
            float f4 = f4469n;
            VText vText = this.f4474h;
            if (f3 < f4) {
                xdl0.M(vText, false);
            } else {
                vText.setAlpha(1.0f);
                xdl0.M(this.f4474h, true);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m6399E0(int i) {
        float f;
        int i2;
        int max_pull_view_heigh = this.f4475i.getMAX_PULL_VIEW_HEIGH();
        int iD = t100.d(38.0f);
        WengWengHeaderView.State headerState = this.f4475i.getHeaderState();
        WengWengHeaderView.State state = WengWengHeaderView.State.NormalState;
        if (headerState == state) {
            f = i / (max_pull_view_heigh * 1.0f);
        } else {
            f = this.f4475i.getHeaderState() == WengWengHeaderView.State.TipState ? (i - iD) / ((max_pull_view_heigh - iD) * 1.0f) : 0.0f;
        }
        int iD2 = t100.d((i * 38) / (max_pull_view_heigh * 1.0f));
        xdl0.C0(this.f4473g, iD2);
        xdl0.C0(this.f4472f, iD2);
        int i3 = 0;
        xdl0.D0(iD2, new View[]{this.f4473g});
        xdl0.D0(iD2, new View[]{this.f4472f});
        xdl0.C0(this.f4470d, iD2);
        int iD3 = t100.d(8.0f);
        int iD4 = t100.d(4.0f);
        int iD5 = t100.d(8.0f);
        int iD6 = t100.d(12.0f);
        int iD7 = t100.d(4.0f);
        int iD8 = t100.d(8.0f);
        if (this.f4475i.getHeaderState() == state) {
            i3 = (int) (iD3 * f);
            i2 = (int) (iD6 * f);
        } else if (this.f4475i.getHeaderState() == WengWengHeaderView.State.TipState) {
            i3 = (int) (iD4 + ((iD5 - iD4) * f));
            i2 = (int) (iD7 + ((iD8 - iD7) * f));
        } else {
            i2 = 0;
        }
        xdl0.X(this.f4470d, i3);
        xdl0.X(this.f4471e, i3);
        xdl0.U(this.f4474h, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f4477k.removeCallbacks(this.f4479m);
    }

    /* JADX INFO: renamed from: p0 */
    public View m6400p0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z4q0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m6401q0() {
        Animator animatorL = bt0.l(this.f4470d, View.ALPHA, 0L, 200L, (Interpolator) null, new float[]{1.0f, 0.0f});
        bt0.f(animatorL, new Runnable() { // from class: l.v4q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21451a.m6403s0();
            }
        });
        animatorL.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public void m6402r0() {
        if (xdl0.O0(this)) {
            xdl0.M(this, false);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m6403s0() {
        xdl0.M(this.f4470d, false);
        m6407w0();
        this.f4477k.postDelayed(this.f4479m, 3000L);
    }

    public void setData(WengWengHeaderView wengWengHeaderView) {
        this.f4475i = wengWengHeaderView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPullHeight(int i) {
        if (i == 0) {
            m6402r0();
            return;
        }
        xdl0.M(this, true);
        m6399E0(i);
        m6398D0(i);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m6404t0(ValueAnimator valueAnimator) {
        xdl0.V(this.f4473g, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m6405u0() {
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/ef40b278-b08d-43ad-9c4a-9d67999fc6a314.svga").repeatCount(1).autoPlay(false).loadCallback(new C0336b()).animListener(new C0335a()).into(this.f4470d);
    }

    /* JADX INFO: renamed from: v0 */
    public void m6406v0() {
        WengWengHeaderView wengWengHeaderView;
        if (this.f4476j || (wengWengHeaderView = this.f4475i) == null) {
            return;
        }
        if (wengWengHeaderView.getHeaderState() == WengWengHeaderView.State.NormalState) {
            xdl0.M(this.f4472f, false);
            xdl0.M(this.f4473g, false);
            xdl0.M(this.f4470d, true);
            this.f4474h.setTextSize(11.0f);
            this.f4470d.setAlpha(1.0f);
            this.f4470d.startAnimation();
        } else if (this.f4475i.getHeaderState() == WengWengHeaderView.State.TipState) {
            this.f4474h.setTextSize(10.0f);
            m6408y0();
        }
        this.f4476j = true;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m6407w0() {
        xdl0.M(this.f4473g, true);
        xdl0.M(this.f4472f, true);
        Property property = View.ALPHA;
        Animator animatorL = bt0.l(this.f4473g, property, 0L, 200L, (Interpolator) null, new float[]{0.0f, 1.0f});
        Animator animatorL2 = bt0.l(this.f4472f, property, 0L, 200L, (Interpolator) null, new float[]{0.0f, 1.0f});
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(t100.d(8.0f), t100.d(-6.0f));
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.w4q0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21893a.m6404t0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        animatorL.start();
        animatorL2.start();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m6408y0() {
        this.f4477k.removeCallbacks(this.f4479m);
        this.f4477k.post(this.f4479m);
    }

    /* JADX INFO: renamed from: z0 */
    public void m6409z0(boolean z) {
        this.f4470d.stopAnimation(z);
        this.f4476j = false;
        this.f4477k.removeCallbacks(this.f4479m);
    }

    public WengwengPullHeadAnim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4476j = false;
        this.f4477k = new Handler(Looper.getMainLooper());
        this.f4478l = 0;
        this.f4479m = new RunnableC0337c();
        m6396r();
    }

    public WengwengPullHeadAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4476j = false;
        this.f4477k = new Handler(Looper.getMainLooper());
        this.f4478l = 0;
        this.f4479m = new RunnableC0337c();
        m6396r();
    }
}
