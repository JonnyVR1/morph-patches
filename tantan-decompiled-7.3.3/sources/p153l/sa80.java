package p153l;

import android.animation.Animator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class sa80 {

    /* JADX INFO: renamed from: a */
    public View f167014a;

    /* JADX INFO: renamed from: b */
    public View f167015b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f167016c;

    /* JADX INFO: renamed from: d */
    public TextView f167017d;

    /* JADX INFO: renamed from: e */
    public Animator f167018e;

    public sa80(View view, View view2, LinearLayout linearLayout, TextView textView) {
        this.f167014a = view;
        this.f167015b = view2;
        this.f167016c = linearLayout;
        this.f167017d = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m185265a() {
        Animator animator = this.f167018e;
        if (animator != null) {
            animator.cancel();
            this.f167018e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m185266b() {
        LinearLayout linearLayout = this.f167016c;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackgroundResource(obc0.f146529w);
        bnl0.m105524M(this.f167015b, false);
        bnl0.m105524M(this.f167014a, false);
    }

    /* JADX INFO: renamed from: c */
    public void m185267c() {
        if (this.f167014a == null) {
            return;
        }
        if (!bnl0.m105529O0(this.f167015b)) {
            bnl0.m105524M(this.f167015b, true);
            bnl0.m105524M(this.f167014a, true);
            bnl0.m105524M(this.f167017d, true);
            this.f167016c.measure(dox.m117367e(), dox.m117364b(qa00.m175859d(26.0f)));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f167015b.getLayoutParams();
            layoutParams.width = this.f167016c.getMeasuredWidth();
            layoutParams.height = this.f167016c.getMeasuredHeight();
            this.f167015b.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f167014a.getLayoutParams();
            layoutParams2.width = this.f167016c.getMeasuredWidth();
            layoutParams2.height = this.f167016c.getMeasuredHeight();
            this.f167014a.setLayoutParams(layoutParams2);
            this.f167015b.setBackgroundResource(obc0.f146530w0);
            this.f167014a.setBackgroundResource(obc0.f146530w0);
            this.f167016c.setBackgroundResource(obc0.f146132Na);
        }
        View view = this.f167015b;
        Property<View, Float> property = gt0.f106354i;
        Interpolator interpolator = gt0.f106346a;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(view, property, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.0f), gt0.m132166l(this.f167014a, View.ALPHA, 0L, 1000L, new LinearInterpolator(), 1.0f, 0.0f), gt0.m132166l(this.f167014a, View.SCALE_X, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.4f), gt0.m132166l(this.f167014a, View.SCALE_Y, 0L, 1000L, interpolator, 1.0f, 1.3f, 1.75f));
        this.f167018e = animatorM132180z;
        animatorM132180z.start();
    }

    public sa80() {
    }
}
