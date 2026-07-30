package p153l;

import android.animation.ValueAnimator;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class qb80 extends o510 {

    /* JADX INFO: renamed from: b */
    public FrameLayout f156458b;

    /* JADX INFO: renamed from: c */
    public SurfaceView f156459c;

    /* JADX INFO: renamed from: r */
    private void m176012r() {
        int measuredWidth;
        int measuredHeight;
        final int iM216939p = ynp0.m216939p() / 2;
        final int i = (int) (iM216939p * 1.488f);
        final int iM125051a = fct.m125051a(true);
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM216939p, i);
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            measuredWidth = surfaceView.getMeasuredWidth();
            measuredHeight = this.f145026a.f161279d.getMeasuredHeight();
        } else {
            measuredWidth = 0;
            measuredHeight = 0;
        }
        final int i2 = measuredWidth - iM216939p;
        final int i3 = measuredHeight - i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ob80
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f145949a.m176018n(layoutParams, iM216939p, i, iM125051a, i2, i3, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(gt0.f106347b);
        valueAnimatorOfFloat.setDuration(300L);
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.pb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f151353a.m176019o();
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: s */
    private void m176013s() {
        FrameLayout frameLayout = this.f156458b;
        if (frameLayout != null) {
            bnl0.m105524M(frameLayout, true);
            SurfaceView surfaceView = this.f156459c;
            if (surfaceView != null) {
                if (surfaceView.getParent() != null) {
                    ViewParent parent = this.f156459c.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeAllViews();
                    }
                }
                this.f156458b.addView(this.f156459c);
                n180.m161093j("showRemoteView ");
            }
        }
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: b */
    public void mo100754b() {
        if (this.f156459c == null) {
            m176022t();
        } else {
            m176012r();
        }
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: c */
    public void mo100755c() {
        m176016l();
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        super.mo100756e(c19765a);
        n180.m161093j("updateViews");
    }

    /* JADX INFO: renamed from: j */
    public void m176014j(SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f156459c = surfaceView;
        n180.m161093j("addRemoteView " + surfaceView);
    }

    /* JADX INFO: renamed from: k */
    public void m176015k() {
        if (this.f156458b == null) {
            FrameLayout frameLayout = new FrameLayout(this.f145026a.f161276a);
            this.f156458b = frameLayout;
            frameLayout.setBackgroundColor(0);
        }
        if (this.f145026a.f161278c != null && this.f156458b.getParent() == null) {
            this.f145026a.f161278c.addView(this.f156458b);
            bnl0.m105524M(this.f145026a.f161278c, true);
        }
        m176013s();
    }

    /* JADX INFO: renamed from: l */
    public void m176016l() {
        m176017m();
        this.f156459c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m176017m() {
        FrameLayout frameLayout = this.f156458b;
        if (frameLayout == null || this.f145026a.f161278c == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f145026a.f161278c.removeView(this.f156458b);
        this.f156458b = null;
        n180.m161093j("cleanRemoteView ");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m176018n(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.f156458b;
        if (frameLayout != null) {
            float f = i;
            layoutParams.width = (int) (f * fFloatValue);
            layoutParams.height = (int) (i2 * fFloatValue);
            layoutParams.leftMargin = (int) (((1.0f - fFloatValue) * f) + f);
            layoutParams.topMargin = i3;
            frameLayout.setLayoutParams(layoutParams);
        }
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParamsM166083a = o510.m166083a(surfaceView);
            layoutParamsM166083a.topMargin = (int) (i3 * fFloatValue);
            float f2 = 1.0f - fFloatValue;
            layoutParamsM166083a.width = (int) (i + (i4 * f2));
            layoutParamsM166083a.height = (int) (i2 + (i5 * f2));
            this.f145026a.f161279d.setLayoutParams(layoutParamsM166083a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m176019o() {
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            bnl0.m105524M(surfaceView, true);
        }
        m176015k();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m176020p(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            layoutParams.topMargin = (int) (i * fFloatValue);
            layoutParams.width = (int) (i2 - ((i2 - i3) * fFloatValue));
            layoutParams.height = (int) (i4 - ((i4 - i5) * fFloatValue));
            surfaceView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m176021q() {
        SurfaceView surfaceView = this.f145026a.f161279d;
        if (surfaceView != null) {
            bnl0.m105524M(surfaceView, true);
        }
        ViewGroup viewGroup = this.f145026a.f161277b;
        if (viewGroup != null) {
            bnl0.m105524M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m176022t() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f145026a.f161278c;
        if (viewGroup2 != null) {
            bnl0.m105524M(viewGroup2, false);
        }
        r510.C19765a c19765a = this.f145026a;
        if (c19765a.f161279d == null || (viewGroup = c19765a.f161277b) == null) {
            return;
        }
        final int width = viewGroup.getWidth();
        final int height = this.f145026a.f161277b.getHeight();
        final FrameLayout.LayoutParams layoutParamsM166083a = o510.m166083a(this.f145026a.f161279d);
        final int i = layoutParamsM166083a.topMargin;
        final int measuredWidth = this.f145026a.f161279d.getMeasuredWidth();
        final int measuredHeight = this.f145026a.f161279d.getMeasuredHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mb80
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f135624a.m176020p(layoutParamsM166083a, i, width, measuredWidth, height, measuredHeight, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(gt0.f106347b);
        valueAnimatorOfFloat.setDuration(300L);
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.nb80
            @Override // java.lang.Runnable
            public final void run() {
                this.f141077a.m176021q();
            }
        });
        valueAnimatorOfFloat.start();
    }
}
