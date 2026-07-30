package p002l;

import android.animation.ValueAnimator;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import l.bt0;
import l.eat;
import l.ht70;
import l.uep0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k380 extends ex00 {

    /* JADX INFO: renamed from: b */
    public FrameLayout f14182b;

    /* JADX INFO: renamed from: c */
    public SurfaceView f14183c;

    /* JADX INFO: renamed from: r */
    private void m16483r() {
        int measuredWidth;
        int measuredHeight;
        final int iP = uep0.p() / 2;
        final int i = (int) (iP * 1.488f);
        final int iA = eat.a(true);
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iP, i);
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            measuredWidth = surfaceView.getMeasuredWidth();
            measuredHeight = this.f10037a.f12331d.getMeasuredHeight();
        } else {
            measuredWidth = 0;
            measuredHeight = 0;
        }
        final int i2 = measuredWidth - iP;
        final int i3 = measuredHeight - i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i380
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12414a.m16489n(layoutParams, iP, i, iA, i2, i3, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(bt0.b);
        valueAnimatorOfFloat.setDuration(300L);
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.j380
            @Override // java.lang.Runnable
            public final void run() {
                this.f13544a.m16490o();
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: s */
    private void m16484s() {
        FrameLayout frameLayout = this.f14182b;
        if (frameLayout != null) {
            xdl0.M(frameLayout, true);
            SurfaceView surfaceView = this.f14183c;
            if (surfaceView != null) {
                if (surfaceView.getParent() != null) {
                    ViewParent parent = this.f14183c.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeAllViews();
                    }
                }
                this.f14182b.addView(this.f14183c);
                ht70.j("showRemoteView ");
            }
        }
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: b */
    public void mo10326b() {
        if (this.f14183c == null) {
            m16493t();
        } else {
            m16483r();
        }
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: c */
    public void mo10327c() {
        m16487l();
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        super.mo10328e(c0612a);
        ht70.j("updateViews");
    }

    /* JADX INFO: renamed from: j */
    public void m16485j(SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f14183c = surfaceView;
        ht70.j("addRemoteView " + surfaceView);
    }

    /* JADX INFO: renamed from: k */
    public void m16486k() {
        if (this.f14182b == null) {
            FrameLayout frameLayout = new FrameLayout(this.f10037a.f12328a);
            this.f14182b = frameLayout;
            frameLayout.setBackgroundColor(0);
        }
        if (this.f10037a.f12330c != null && this.f14182b.getParent() == null) {
            this.f10037a.f12330c.addView(this.f14182b);
            xdl0.M(this.f10037a.f12330c, true);
        }
        m16484s();
    }

    /* JADX INFO: renamed from: l */
    public void m16487l() {
        m16488m();
        this.f14183c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m16488m() {
        FrameLayout frameLayout = this.f14182b;
        if (frameLayout == null || this.f10037a.f12330c == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f10037a.f12330c.removeView(this.f14182b);
        this.f14182b = null;
        ht70.j("cleanRemoteView ");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m16489n(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.f14182b;
        if (frameLayout != null) {
            float f = i;
            layoutParams.width = (int) (f * fFloatValue);
            layoutParams.height = (int) (i2 * fFloatValue);
            layoutParams.leftMargin = (int) (((1.0f - fFloatValue) * f) + f);
            layoutParams.topMargin = i3;
            frameLayout.setLayoutParams(layoutParams);
        }
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParamsM12797a = ex00.m12797a(surfaceView);
            layoutParamsM12797a.topMargin = (int) (i3 * fFloatValue);
            float f2 = 1.0f - fFloatValue;
            layoutParamsM12797a.width = (int) (i + (i4 * f2));
            layoutParamsM12797a.height = (int) (i2 + (i5 * f2));
            this.f10037a.f12331d.setLayoutParams(layoutParamsM12797a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m16490o() {
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            xdl0.M(surfaceView, true);
        }
        m16486k();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m16491p(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            layoutParams.topMargin = (int) (i * fFloatValue);
            layoutParams.width = (int) (i2 - ((i2 - i3) * fFloatValue));
            layoutParams.height = (int) (i4 - ((i4 - i5) * fFloatValue));
            surfaceView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m16492q() {
        SurfaceView surfaceView = this.f10037a.f12331d;
        if (surfaceView != null) {
            xdl0.M(surfaceView, true);
        }
        ViewGroup viewGroup = this.f10037a.f12329b;
        if (viewGroup != null) {
            xdl0.M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m16493t() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f10037a.f12330c;
        if (viewGroup2 != null) {
            xdl0.M(viewGroup2, false);
        }
        hx00.C0612a c0612a = this.f10037a;
        if (c0612a.f12331d == null || (viewGroup = c0612a.f12329b) == null) {
            return;
        }
        final int width = viewGroup.getWidth();
        final int height = this.f10037a.f12329b.getHeight();
        final FrameLayout.LayoutParams layoutParamsM12797a = ex00.m12797a(this.f10037a.f12331d);
        final int i = layoutParamsM12797a.topMargin;
        final int measuredWidth = this.f10037a.f12331d.getMeasuredWidth();
        final int measuredHeight = this.f10037a.f12331d.getMeasuredHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g380
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10740a.m16491p(layoutParamsM12797a, i, width, measuredWidth, height, measuredHeight, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(bt0.b);
        valueAnimatorOfFloat.setDuration(300L);
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.h380
            @Override // java.lang.Runnable
            public final void run() {
                this.f11862a.m16492q();
            }
        });
        valueAnimatorOfFloat.start();
    }
}
