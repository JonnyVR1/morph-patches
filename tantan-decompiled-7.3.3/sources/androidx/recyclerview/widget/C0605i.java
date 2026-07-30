package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import p153l.kkl0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public class C0605i extends RecyclerView.AbstractC0578n implements RecyclerView.InterfaceC0583s {

    /* JADX INFO: renamed from: D */
    public static final int[] f2791D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E */
    public static final int[] f2792E = new int[0];

    /* JADX INFO: renamed from: A */
    public int f2793A;

    /* JADX INFO: renamed from: B */
    public final Runnable f2794B;

    /* JADX INFO: renamed from: C */
    public final RecyclerView.AbstractC0584t f2795C;

    /* JADX INFO: renamed from: a */
    public final int f2796a;

    /* JADX INFO: renamed from: b */
    public final int f2797b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f2798c;

    /* JADX INFO: renamed from: d */
    public final Drawable f2799d;

    /* JADX INFO: renamed from: e */
    public final int f2800e;

    /* JADX INFO: renamed from: f */
    public final int f2801f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f2802g;

    /* JADX INFO: renamed from: h */
    public final Drawable f2803h;

    /* JADX INFO: renamed from: i */
    public final int f2804i;

    /* JADX INFO: renamed from: j */
    public final int f2805j;

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public int f2806k;

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public int f2807l;

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public float f2808m;

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public int f2809n;

    /* JADX INFO: renamed from: o */
    @VisibleForTesting
    public int f2810o;

    /* JADX INFO: renamed from: p */
    @VisibleForTesting
    public float f2811p;

    /* JADX INFO: renamed from: s */
    public RecyclerView f2814s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f2821z;

    /* JADX INFO: renamed from: q */
    public int f2812q = 0;

    /* JADX INFO: renamed from: r */
    public int f2813r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f2815t = false;

    /* JADX INFO: renamed from: u */
    public boolean f2816u = false;

    /* JADX INFO: renamed from: v */
    public int f2817v = 0;

    /* JADX INFO: renamed from: w */
    public int f2818w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f2819x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f2820y = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0605i.this.m3717m(500);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$b */
    public class b extends RecyclerView.AbstractC0584t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C0605i.this.m3726x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f2824a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2824a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2824a) {
                this.f2824a = false;
                return;
            }
            float fFloatValue = ((Float) C0605i.this.f2821z.getAnimatedValue()).floatValue();
            C0605i c0605i = C0605i.this;
            if (fFloatValue == 0.0f) {
                c0605i.f2793A = 0;
                c0605i.m3724u(0);
            } else {
                c0605i.f2793A = 2;
                c0605i.m3721r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0605i.this.f2798c.setAlpha(iFloatValue);
            C0605i.this.f2799d.setAlpha(iFloatValue);
            C0605i.this.m3721r();
        }
    }

    public C0605i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2821z = valueAnimatorOfFloat;
        this.f2793A = 0;
        this.f2794B = new a();
        this.f2795C = new b();
        this.f2798c = stateListDrawable;
        this.f2799d = drawable;
        this.f2802g = stateListDrawable2;
        this.f2803h = drawable2;
        this.f2800e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2801f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2804i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2805j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2796a = i2;
        this.f2797b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m3711f(recyclerView);
    }

    /* JADX INFO: renamed from: h */
    private void m3708h() {
        this.f2814s.removeItemDecoration(this);
        this.f2814s.removeOnItemTouchListener(this);
        this.f2814s.removeOnScrollListener(this.f2795C);
        m3712g();
    }

    /* JADX INFO: renamed from: o */
    private boolean m3709o() {
        return kkl0.m150191x(this.f2814s) == 1;
    }

    /* JADX INFO: renamed from: v */
    private void m3710v() {
        this.f2814s.addItemDecoration(this);
        this.f2814s.addOnItemTouchListener(this);
        this.f2814s.addOnScrollListener(this.f2795C);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
    /* JADX INFO: renamed from: a */
    public void mo3425a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f2817v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM3720q = m3720q(motionEvent.getX(), motionEvent.getY());
            boolean zM3719p = m3719p(motionEvent.getX(), motionEvent.getY());
            if (zM3720q || zM3719p) {
                if (zM3719p) {
                    this.f2818w = 1;
                    this.f2811p = (int) motionEvent.getX();
                } else if (zM3720q) {
                    this.f2818w = 2;
                    this.f2808m = (int) motionEvent.getY();
                }
                m3724u(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2817v == 2) {
            this.f2808m = 0.0f;
            this.f2811p = 0.0f;
            m3724u(1);
            this.f2818w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2817v == 2) {
            m3725w();
            if (this.f2818w == 1) {
                m3718n(motionEvent.getX());
            }
            if (this.f2818w == 2) {
                m3727y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
    /* JADX INFO: renamed from: c */
    public boolean mo3426c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i = this.f2817v;
        if (i != 1) {
            return i == 2;
        }
        boolean zM3720q = m3720q(motionEvent.getX(), motionEvent.getY());
        boolean zM3719p = m3719p(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zM3720q && !zM3719p)) {
            return false;
        }
        if (zM3719p) {
            this.f2818w = 1;
            this.f2811p = (int) motionEvent.getX();
        } else if (zM3720q) {
            this.f2818w = 2;
            this.f2808m = (int) motionEvent.getY();
        }
        m3724u(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
    /* JADX INFO: renamed from: e */
    public void mo3427e(boolean z) {
    }

    /* JADX INFO: renamed from: f */
    public void m3711f(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2814s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m3708h();
        }
        this.f2814s = recyclerView;
        if (recyclerView != null) {
            m3710v();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3712g() {
        this.f2814s.removeCallbacks(this.f2794B);
    }

    /* JADX INFO: renamed from: i */
    public final void m3713i(Canvas canvas) {
        int i = this.f2813r;
        int i2 = this.f2804i;
        int i3 = i - i2;
        int i4 = this.f2810o;
        int i5 = this.f2809n;
        int i6 = i4 - (i5 / 2);
        this.f2802g.setBounds(0, 0, i5, i2);
        this.f2803h.setBounds(0, 0, this.f2812q, this.f2805j);
        canvas.translate(0.0f, i3);
        this.f2803h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f2802g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* JADX INFO: renamed from: j */
    public final void m3714j(Canvas canvas) {
        int i = this.f2812q;
        int i2 = this.f2800e;
        int i3 = i - i2;
        int i4 = this.f2807l;
        int i5 = this.f2806k;
        int i6 = i4 - (i5 / 2);
        this.f2798c.setBounds(0, 0, i2, i5);
        this.f2799d.setBounds(0, 0, this.f2801f, this.f2813r);
        if (!m3709o()) {
            canvas.translate(i3, 0.0f);
            this.f2799d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f2798c.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.f2799d.draw(canvas);
        canvas.translate(this.f2800e, i6);
        canvas.scale(-1.0f, 1.0f);
        this.f2798c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f2800e, -i6);
    }

    /* JADX INFO: renamed from: k */
    public final int[] m3715k() {
        int[] iArr = this.f2820y;
        int i = this.f2797b;
        iArr[0] = i;
        iArr[1] = this.f2812q - i;
        return iArr;
    }

    /* JADX INFO: renamed from: l */
    public final int[] m3716l() {
        int[] iArr = this.f2819x;
        int i = this.f2797b;
        iArr[0] = i;
        iArr[1] = this.f2813r - i;
        return iArr;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public void m3717m(int i) {
        int i2 = this.f2793A;
        if (i2 == 1) {
            this.f2821z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f2793A = 3;
        ValueAnimator valueAnimator = this.f2821z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f2821z.setDuration(i);
        this.f2821z.start();
    }

    /* JADX INFO: renamed from: n */
    public final void m3718n(float f) {
        int[] iArrM3715k = m3715k();
        float fMax = Math.max(iArrM3715k[0], Math.min(iArrM3715k[1], f));
        if (Math.abs(this.f2810o - fMax) < 2.0f) {
            return;
        }
        int iM3723t = m3723t(this.f2811p, fMax, iArrM3715k, this.f2814s.computeHorizontalScrollRange(), this.f2814s.computeHorizontalScrollOffset(), this.f2812q);
        if (iM3723t != 0) {
            this.f2814s.scrollBy(iM3723t, 0);
        }
        this.f2811p = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
        if (this.f2812q != this.f2814s.getWidth() || this.f2813r != this.f2814s.getHeight()) {
            this.f2812q = this.f2814s.getWidth();
            this.f2813r = this.f2814s.getHeight();
            m3724u(0);
        } else if (this.f2793A != 0) {
            if (this.f2815t) {
                m3714j(canvas);
            }
            if (this.f2816u) {
                m3713i(canvas);
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p */
    public boolean m3719p(float f, float f2) {
        if (f2 < this.f2813r - this.f2804i) {
            return false;
        }
        int i = this.f2810o;
        int i2 = this.f2809n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q */
    public boolean m3720q(float f, float f2) {
        if (m3709o()) {
            if (f > this.f2800e) {
                return false;
            }
        } else if (f < this.f2812q - this.f2800e) {
            return false;
        }
        int i = this.f2807l;
        int i2 = this.f2806k;
        return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
    }

    /* JADX INFO: renamed from: r */
    public void m3721r() {
        this.f2814s.invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final void m3722s(int i) {
        m3712g();
        this.f2814s.postDelayed(this.f2794B, i);
    }

    /* JADX INFO: renamed from: t */
    public final int m3723t(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* JADX INFO: renamed from: u */
    public void m3724u(int i) {
        if (i == 2 && this.f2817v != 2) {
            this.f2798c.setState(f2791D);
            m3712g();
        }
        if (i == 0) {
            m3721r();
        } else {
            m3725w();
        }
        if (this.f2817v == 2 && i != 2) {
            this.f2798c.setState(f2792E);
            m3722s(1200);
        } else if (i == 1) {
            m3722s(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f2817v = i;
    }

    /* JADX INFO: renamed from: w */
    public void m3725w() {
        int i = this.f2793A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f2821z.cancel();
            }
        }
        this.f2793A = 1;
        ValueAnimator valueAnimator = this.f2821z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f2821z.setDuration(500L);
        this.f2821z.setStartDelay(0L);
        this.f2821z.start();
    }

    /* JADX INFO: renamed from: x */
    public void m3726x(int i, int i2) {
        int iComputeVerticalScrollRange = this.f2814s.computeVerticalScrollRange();
        int i3 = this.f2813r;
        this.f2815t = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f2796a;
        int iComputeHorizontalScrollRange = this.f2814s.computeHorizontalScrollRange();
        int i4 = this.f2812q;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f2796a;
        this.f2816u = z;
        boolean z2 = this.f2815t;
        if (!z2 && !z) {
            if (this.f2817v != 0) {
                m3724u(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f2807l = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.f2806k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f2816u) {
            float f2 = i4;
            this.f2810o = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f2809n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.f2817v;
        if (i5 == 0 || i5 == 1) {
            m3724u(1);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3727y(float f) {
        int[] iArrM3716l = m3716l();
        float fMax = Math.max(iArrM3716l[0], Math.min(iArrM3716l[1], f));
        if (Math.abs(this.f2807l - fMax) < 2.0f) {
            return;
        }
        int iM3723t = m3723t(this.f2808m, fMax, iArrM3716l, this.f2814s.computeVerticalScrollRange(), this.f2814s.computeVerticalScrollOffset(), this.f2813r);
        if (iM3723t != 0) {
            this.f2814s.scrollBy(0, iM3723t);
        }
        this.f2808m = fMax;
    }
}
