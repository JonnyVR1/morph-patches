package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fih0 extends gih0 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: r */
    public static final boolean f3634r = true;

    /* JADX INFO: renamed from: d */
    public float f3635d;

    /* JADX INFO: renamed from: e */
    public Paint f3636e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f3637f;

    /* JADX INFO: renamed from: g */
    public LightingColorFilter f3638g;

    /* JADX INFO: renamed from: h */
    public int f3639h;

    /* JADX INFO: renamed from: i */
    public int f3640i;

    /* JADX INFO: renamed from: j */
    public int f3641j;

    /* JADX INFO: renamed from: k */
    public int f3642k;

    /* JADX INFO: renamed from: l */
    public int f3643l;

    /* JADX INFO: renamed from: m */
    public int f3644m;

    /* JADX INFO: renamed from: n */
    public Paint f3645n;

    /* JADX INFO: renamed from: o */
    public ColorMatrix f3646o;

    /* JADX INFO: renamed from: p */
    public float f3647p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f3648q;

    /* JADX INFO: renamed from: l.fih0$a */
    public class C0293a implements ValueAnimator.AnimatorUpdateListener {
        public C0293a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            fih0.this.m4382i(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public fih0(View view) {
        super(view);
        this.f3635d = 0.3f;
        this.f3636e = new Paint();
        this.f3637f = null;
        this.f3638g = null;
        this.f3641j = 0;
        this.f3644m = 0;
        this.f3645n = new Paint();
        this.f3646o = new ColorMatrix();
        this.f3647p = this.f3635d;
        this.f3648q = new C0293a();
    }

    @Override // p003l.gih0
    /* JADX INFO: renamed from: d */
    public void mo4378d(boolean z, boolean z2) {
        if (!z) {
            m4383j();
            onAnimationEnd(null);
            return;
        }
        m4383j();
        if (!z2) {
            onAnimationEnd(null);
            return;
        }
        this.f3895a.setLayerType(2, this.f3645n);
        ValueAnimator duration = ValueAnimator.ofFloat(this.f3647p, this.f3895a.isEnabled() ? 1.0f : this.f3635d).setDuration(400L);
        this.f3637f = duration;
        duration.addUpdateListener(this.f3648q);
        this.f3637f.addListener(this);
        this.f3637f.start();
    }

    @Override // p003l.gih0
    /* JADX INFO: renamed from: e */
    public void mo4379e(boolean z) {
        m4383j();
        if (z) {
            this.f3636e.setColorFilter(this.f3638g);
            this.f3895a.setLayerType(2, this.f3636e);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        this.f3637f = duration;
        duration.addUpdateListener(this);
        this.f3637f.addListener(this);
        this.f3637f.start();
    }

    /* JADX INFO: renamed from: g */
    public void m4380g(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            m4381h(13421772, 0);
        } else {
            TypedArray typedArrayObtainStyledAttributes = this.f3895a.getContext().obtainStyledAttributes(attributeSet, b9c0.v, 0, 0);
            m4381h(typedArrayObtainStyledAttributes.getColor(b9c0.x, 13421772), typedArrayObtainStyledAttributes.getColor(b9c0.w, 0));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4381h(int i, int i2) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(i, i2);
        this.f3638g = lightingColorFilter;
        this.f3639h = (i & 16711680) >> 16;
        this.f3640i = (i & 65280) >> 8;
        this.f3641j = i & 255;
        this.f3642k = (i2 & 16711680) >> 16;
        this.f3643l = (i2 & 65280) >> 8;
        this.f3644m = i2 & 255;
        this.f3636e.setColorFilter(lightingColorFilter);
        m4552f();
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public void m4382i(float f) {
        this.f3647p = f;
        this.f3646o.setSaturation(f);
        this.f3645n.setColorFilter(new ColorMatrixColorFilter(this.f3646o));
        if (f3634r) {
            this.f3895a.setLayerPaint(this.f3645n);
        }
        this.f3895a.invalidate();
    }

    /* JADX INFO: renamed from: j */
    public final void m4383j() {
        ValueAnimator valueAnimator = this.f3637f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3636e.setColorFilter(this.f3638g);
            this.f3637f = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3637f = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean zIsEnabled = this.f3895a.isEnabled();
        View view = this.f3895a;
        if (zIsEnabled) {
            view.setLayerType(0, null);
        } else {
            view.setLayerType(2, this.f3645n);
            m4382i(this.f3635d);
        }
        this.f3637f = null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    @TargetApi(17)
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = this.f3639h;
        int i2 = this.f3640i;
        int i3 = this.f3641j;
        this.f3636e.setColorFilter(new LightingColorFilter((((int) (i + ((255 - i) * animatedFraction))) << 16) + (((int) (i2 + ((255 - i2) * animatedFraction))) << 8) + ((int) (i3 + ((255 - i3) * animatedFraction))), 0));
        if (f3634r) {
            this.f3895a.setLayerPaint(this.f3636e);
        }
        this.f3895a.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
