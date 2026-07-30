package p149l;

import android.animation.ValueAnimator;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class k380 extends ex00 {

    /* JADX INFO: renamed from: b */
    public FrameLayout f120801b;

    /* JADX INFO: renamed from: c */
    public SurfaceView f120802c;

    /* JADX INFO: renamed from: r */
    private void m144371r() {
        int measuredWidth;
        int measuredHeight;
        final int iM193329p = uep0.m193329p() / 2;
        final int i = (int) (iM193329p * 1.488f);
        final int iM115436a = eat.m115436a(true);
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM193329p, i);
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            measuredWidth = surfaceView.getMeasuredWidth();
            measuredHeight = this.f93563a.f109823d.getMeasuredHeight();
        } else {
            measuredWidth = 0;
            measuredHeight = 0;
        }
        final int i2 = measuredWidth - iM193329p;
        final int i3 = measuredHeight - i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i380
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f110624a.m144377n(layoutParams, iM193329p, i, iM115436a, i2, i3, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(bt0.f77155b);
        valueAnimatorOfFloat.setDuration(300L);
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.j380
            @Override // java.lang.Runnable
            public final void run() {
                this.f116017a.m144378o();
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: s */
    private void m144372s() {
        FrameLayout frameLayout = this.f120801b;
        if (frameLayout != null) {
            xdl0.m208344M(frameLayout, true);
            SurfaceView surfaceView = this.f120802c;
            if (surfaceView != null) {
                if (surfaceView.getParent() != null) {
                    ViewParent parent = this.f120802c.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeAllViews();
                    }
                }
                this.f120801b.addView(this.f120802c);
                ht70.m132853j("showRemoteView ");
            }
        }
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: b */
    public void mo101817b() {
        if (this.f120802c == null) {
            m144381t();
        } else {
            m144371r();
        }
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: c */
    public void mo101818c() {
        m144375l();
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        super.mo101819e(c17423a);
        ht70.m132853j("updateViews");
    }

    /* JADX INFO: renamed from: j */
    public void m144373j(SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f120802c = surfaceView;
        ht70.m132853j("addRemoteView " + surfaceView);
    }

    /* JADX INFO: renamed from: k */
    public void m144374k() {
        if (this.f120801b == null) {
            FrameLayout frameLayout = new FrameLayout(this.f93563a.f109820a);
            this.f120801b = frameLayout;
            frameLayout.setBackgroundColor(0);
        }
        if (this.f93563a.f109822c != null && this.f120801b.getParent() == null) {
            this.f93563a.f109822c.addView(this.f120801b);
            xdl0.m208344M(this.f93563a.f109822c, true);
        }
        m144372s();
    }

    /* JADX INFO: renamed from: l */
    public void m144375l() {
        m144376m();
        this.f120802c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m144376m() {
        FrameLayout frameLayout = this.f120801b;
        if (frameLayout == null || this.f93563a.f109822c == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f93563a.f109822c.removeView(this.f120801b);
        this.f120801b = null;
        ht70.m132853j("cleanRemoteView ");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m144377n(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.f120801b;
        if (frameLayout != null) {
            float f = i;
            layoutParams.width = (int) (f * fFloatValue);
            layoutParams.height = (int) (i2 * fFloatValue);
            layoutParams.leftMargin = (int) (((1.0f - fFloatValue) * f) + f);
            layoutParams.topMargin = i3;
            frameLayout.setLayoutParams(layoutParams);
        }
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            FrameLayout.LayoutParams layoutParamsM118529a = ex00.m118529a(surfaceView);
            layoutParamsM118529a.topMargin = (int) (i3 * fFloatValue);
            float f2 = 1.0f - fFloatValue;
            layoutParamsM118529a.width = (int) (i + (i4 * f2));
            layoutParamsM118529a.height = (int) (i2 + (i5 * f2));
            this.f93563a.f109823d.setLayoutParams(layoutParamsM118529a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m144378o() {
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            xdl0.m208344M(surfaceView, true);
        }
        m144374k();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m144379p(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            layoutParams.topMargin = (int) (i * fFloatValue);
            layoutParams.width = (int) (i2 - ((i2 - i3) * fFloatValue));
            layoutParams.height = (int) (i4 - ((i4 - i5) * fFloatValue));
            surfaceView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m144380q() {
        SurfaceView surfaceView = this.f93563a.f109823d;
        if (surfaceView != null) {
            xdl0.m208344M(surfaceView, true);
        }
        ViewGroup viewGroup = this.f93563a.f109821b;
        if (viewGroup != null) {
            xdl0.m208344M(viewGroup, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m144381t() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f93563a.f109822c;
        if (viewGroup2 != null) {
            xdl0.m208344M(viewGroup2, false);
        }
        hx00.C17423a c17423a = this.f93563a;
        if (c17423a.f109823d == null || (viewGroup = c17423a.f109821b) == null) {
            return;
        }
        final int width = viewGroup.getWidth();
        final int height = this.f93563a.f109821b.getHeight();
        final FrameLayout.LayoutParams layoutParamsM118529a = ex00.m118529a(this.f93563a.f109823d);
        final int i = layoutParamsM118529a.topMargin;
        final int measuredWidth = this.f93563a.f109823d.getMeasuredWidth();
        final int measuredHeight = this.f93563a.f109823d.getMeasuredHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g380
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f100365a.m144379p(layoutParamsM118529a, i, width, measuredWidth, height, measuredHeight, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(bt0.f77155b);
        valueAnimatorOfFloat.setDuration(300L);
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.h380
            @Override // java.lang.Runnable
            public final void run() {
                this.f105581a.m144380q();
            }
        });
        valueAnimatorOfFloat.start();
    }
}
