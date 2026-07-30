package p149l;

import android.animation.Animator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class m280 {

    /* JADX INFO: renamed from: a */
    public View f130897a;

    /* JADX INFO: renamed from: b */
    public View f130898b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f130899c;

    /* JADX INFO: renamed from: d */
    public TextView f130900d;

    /* JADX INFO: renamed from: e */
    public Animator f130901e;

    public m280(View view, View view2, LinearLayout linearLayout, TextView textView) {
        this.f130897a = view;
        this.f130898b = view2;
        this.f130899c = linearLayout;
        this.f130900d = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m152663a() {
        Animator animator = this.f130901e;
        if (animator != null) {
            animator.cancel();
            this.f130901e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m152664b() {
        LinearLayout linearLayout = this.f130899c;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackgroundResource(i3c0.f111201w);
        xdl0.m208344M(this.f130898b, false);
        xdl0.m208344M(this.f130897a, false);
    }

    /* JADX INFO: renamed from: c */
    public void m152665c() {
        if (this.f130897a == null) {
            return;
        }
        if (!xdl0.m208349O0(this.f130898b)) {
            xdl0.m208344M(this.f130898b, true);
            xdl0.m208344M(this.f130897a, true);
            xdl0.m208344M(this.f130900d, true);
            this.f130899c.measure(ffx.m121202e(), ffx.m121199b(t100.m186890d(26.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f130898b.getLayoutParams();
            layoutParams.width = this.f130899c.getMeasuredWidth();
            layoutParams.height = this.f130899c.getMeasuredHeight();
            this.f130898b.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f130897a.getLayoutParams();
            layoutParams2.width = this.f130899c.getMeasuredWidth();
            layoutParams2.height = this.f130899c.getMeasuredHeight();
            this.f130897a.setLayoutParams(layoutParams2);
            this.f130898b.setBackgroundResource(i3c0.f111202w0);
            this.f130897a.setBackgroundResource(i3c0.f111202w0);
            this.f130899c.setBackgroundResource(i3c0.f110804Na);
        }
        View view = this.f130898b;
        Property<View, Float> property = bt0.f77162i;
        Interpolator interpolator = bt0.f77154a;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(view, property, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.0f), bt0.m103739l(this.f130897a, View.ALPHA, 0L, 1000L, new LinearInterpolator(), 1.0f, 0.0f), bt0.m103739l(this.f130897a, View.SCALE_X, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.4f), bt0.m103739l(this.f130897a, View.SCALE_Y, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.75f));
        this.f130901e = animatorM103753z;
        animatorM103753z.start();
    }

    public m280() {
    }
}
