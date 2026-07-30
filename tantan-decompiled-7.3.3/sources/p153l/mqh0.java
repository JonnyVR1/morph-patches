package p153l;

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

/* JADX INFO: loaded from: classes3.dex */
public class mqh0 extends nqh0 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: r */
    public static final boolean f138055r = true;

    /* JADX INFO: renamed from: d */
    public float f138056d;

    /* JADX INFO: renamed from: e */
    public Paint f138057e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f138058f;

    /* JADX INFO: renamed from: g */
    public LightingColorFilter f138059g;

    /* JADX INFO: renamed from: h */
    public int f138060h;

    /* JADX INFO: renamed from: i */
    public int f138061i;

    /* JADX INFO: renamed from: j */
    public int f138062j;

    /* JADX INFO: renamed from: k */
    public int f138063k;

    /* JADX INFO: renamed from: l */
    public int f138064l;

    /* JADX INFO: renamed from: m */
    public int f138065m;

    /* JADX INFO: renamed from: n */
    public Paint f138066n;

    /* JADX INFO: renamed from: o */
    public ColorMatrix f138067o;

    /* JADX INFO: renamed from: p */
    public float f138068p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f138069q;

    /* JADX INFO: renamed from: l.mqh0$a */
    public class C18673a implements ValueAnimator.AnimatorUpdateListener {
        public C18673a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mqh0.this.m159512i(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public mqh0(View view) {
        super(view);
        this.f138056d = 0.3f;
        this.f138057e = new Paint();
        this.f138058f = null;
        this.f138059g = null;
        this.f138062j = 0;
        this.f138065m = 0;
        this.f138066n = new Paint();
        this.f138067o = new ColorMatrix();
        this.f138068p = this.f138056d;
        this.f138069q = new C18673a();
    }

    @Override // p153l.nqh0
    /* JADX INFO: renamed from: d */
    public void mo159508d(boolean z, boolean z2) {
        if (!z) {
            m159513j();
            onAnimationEnd(null);
            return;
        }
        m159513j();
        if (!z2) {
            onAnimationEnd(null);
            return;
        }
        this.f143230a.setLayerType(2, this.f138066n);
        ValueAnimator duration = ValueAnimator.ofFloat(this.f138068p, this.f143230a.isEnabled() ? 1.0f : this.f138056d).setDuration(400L);
        this.f138058f = duration;
        duration.addUpdateListener(this.f138069q);
        this.f138058f.addListener(this);
        this.f138058f.start();
    }

    @Override // p153l.nqh0
    /* JADX INFO: renamed from: e */
    public void mo159509e(boolean z) {
        m159513j();
        if (z) {
            this.f138057e.setColorFilter(this.f138059g);
            this.f143230a.setLayerType(2, this.f138057e);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        this.f138058f = duration;
        duration.addUpdateListener(this);
        this.f138058f.addListener(this);
        this.f138058f.start();
    }

    /* JADX INFO: renamed from: g */
    public void m159510g(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            m159511h(13421772, 0);
        } else {
            TypedArray typedArrayObtainStyledAttributes = this.f143230a.getContext().obtainStyledAttributes(attributeSet, hhc0.f109841v, 0, 0);
            m159511h(typedArrayObtainStyledAttributes.getColor(hhc0.f109855x, 13421772), typedArrayObtainStyledAttributes.getColor(hhc0.f109848w, 0));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m159511h(int i, int i2) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(i, i2);
        this.f138059g = lightingColorFilter;
        this.f138060h = (i & 16711680) >> 16;
        this.f138061i = (i & 65280) >> 8;
        this.f138062j = i & 255;
        this.f138063k = (i2 & 16711680) >> 16;
        this.f138064l = (i2 & 65280) >> 8;
        this.f138065m = i2 & 255;
        this.f138057e.setColorFilter(lightingColorFilter);
        m164311f();
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public void m159512i(float f) {
        this.f138068p = f;
        this.f138067o.setSaturation(f);
        this.f138066n.setColorFilter(new ColorMatrixColorFilter(this.f138067o));
        if (f138055r) {
            this.f143230a.setLayerPaint(this.f138066n);
        }
        this.f143230a.invalidate();
    }

    /* JADX INFO: renamed from: j */
    public final void m159513j() {
        ValueAnimator valueAnimator = this.f138058f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f138057e.setColorFilter(this.f138059g);
            this.f138058f = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f138058f = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean zIsEnabled = this.f143230a.isEnabled();
        View view = this.f143230a;
        if (zIsEnabled) {
            view.setLayerType(0, null);
        } else {
            view.setLayerType(2, this.f138066n);
            m159512i(this.f138056d);
        }
        this.f138058f = null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    @TargetApi(17)
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = this.f138060h;
        int i2 = this.f138061i;
        int i3 = this.f138062j;
        this.f138057e.setColorFilter(new LightingColorFilter((((int) (i + ((255 - i) * animatedFraction))) << 16) + (((int) (i2 + ((255 - i2) * animatedFraction))) << 8) + ((int) (i3 + ((255 - i3) * animatedFraction))), 0));
        if (f138055r) {
            this.f143230a.setLayerPaint(this.f138057e);
        }
        this.f143230a.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
