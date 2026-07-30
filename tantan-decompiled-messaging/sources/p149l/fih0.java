package p149l;

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
public class fih0 extends gih0 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: r */
    public static final boolean f97663r = true;

    /* JADX INFO: renamed from: d */
    public float f97664d;

    /* JADX INFO: renamed from: e */
    public Paint f97665e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f97666f;

    /* JADX INFO: renamed from: g */
    public LightingColorFilter f97667g;

    /* JADX INFO: renamed from: h */
    public int f97668h;

    /* JADX INFO: renamed from: i */
    public int f97669i;

    /* JADX INFO: renamed from: j */
    public int f97670j;

    /* JADX INFO: renamed from: k */
    public int f97671k;

    /* JADX INFO: renamed from: l */
    public int f97672l;

    /* JADX INFO: renamed from: m */
    public int f97673m;

    /* JADX INFO: renamed from: n */
    public Paint f97674n;

    /* JADX INFO: renamed from: o */
    public ColorMatrix f97675o;

    /* JADX INFO: renamed from: p */
    public float f97676p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator.AnimatorUpdateListener f97677q;

    /* JADX INFO: renamed from: l.fih0$a */
    public class C16845a implements ValueAnimator.AnimatorUpdateListener {
        public C16845a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            fih0.this.m121517i(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public fih0(View view) {
        super(view);
        this.f97664d = 0.3f;
        this.f97665e = new Paint();
        this.f97666f = null;
        this.f97667g = null;
        this.f97670j = 0;
        this.f97673m = 0;
        this.f97674n = new Paint();
        this.f97675o = new ColorMatrix();
        this.f97676p = this.f97664d;
        this.f97677q = new C16845a();
    }

    @Override // p149l.gih0
    /* JADX INFO: renamed from: d */
    public void mo121513d(boolean z, boolean z2) {
        if (!z) {
            m121518j();
            onAnimationEnd(null);
            return;
        }
        m121518j();
        if (!z2) {
            onAnimationEnd(null);
            return;
        }
        this.f102901a.setLayerType(2, this.f97674n);
        ValueAnimator duration = ValueAnimator.ofFloat(this.f97676p, this.f102901a.isEnabled() ? 1.0f : this.f97664d).setDuration(400L);
        this.f97666f = duration;
        duration.addUpdateListener(this.f97677q);
        this.f97666f.addListener(this);
        this.f97666f.start();
    }

    @Override // p149l.gih0
    /* JADX INFO: renamed from: e */
    public void mo121514e(boolean z) {
        m121518j();
        if (z) {
            this.f97665e.setColorFilter(this.f97667g);
            this.f102901a.setLayerType(2, this.f97665e);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        this.f97666f = duration;
        duration.addUpdateListener(this);
        this.f97666f.addListener(this);
        this.f97666f.start();
    }

    /* JADX INFO: renamed from: g */
    public void m121515g(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet == null) {
            m121516h(13421772, 0);
        } else {
            TypedArray typedArrayObtainStyledAttributes = this.f102901a.getContext().obtainStyledAttributes(attributeSet, b9c0.f74532v, 0, 0);
            m121516h(typedArrayObtainStyledAttributes.getColor(b9c0.f74546x, 13421772), typedArrayObtainStyledAttributes.getColor(b9c0.f74539w, 0));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m121516h(int i, int i2) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(i, i2);
        this.f97667g = lightingColorFilter;
        this.f97668h = (i & 16711680) >> 16;
        this.f97669i = (i & 65280) >> 8;
        this.f97670j = i & 255;
        this.f97671k = (i2 & 16711680) >> 16;
        this.f97672l = (i2 & 65280) >> 8;
        this.f97673m = i2 & 255;
        this.f97665e.setColorFilter(lightingColorFilter);
        m126292f();
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public void m121517i(float f) {
        this.f97676p = f;
        this.f97675o.setSaturation(f);
        this.f97674n.setColorFilter(new ColorMatrixColorFilter(this.f97675o));
        if (f97663r) {
            this.f102901a.setLayerPaint(this.f97674n);
        }
        this.f102901a.invalidate();
    }

    /* JADX INFO: renamed from: j */
    public final void m121518j() {
        ValueAnimator valueAnimator = this.f97666f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f97665e.setColorFilter(this.f97667g);
            this.f97666f = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f97666f = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean zIsEnabled = this.f102901a.isEnabled();
        View view = this.f102901a;
        if (zIsEnabled) {
            view.setLayerType(0, null);
        } else {
            view.setLayerType(2, this.f97674n);
            m121517i(this.f97664d);
        }
        this.f97666f = null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    @TargetApi(17)
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = this.f97668h;
        int i2 = this.f97669i;
        int i3 = this.f97670j;
        this.f97665e.setColorFilter(new LightingColorFilter((((int) (i + ((255 - i) * animatedFraction))) << 16) + (((int) (i2 + ((255 - i2) * animatedFraction))) << 8) + ((int) (i3 + ((255 - i3) * animatedFraction))), 0));
        if (f97663r) {
            this.f102901a.setLayerPaint(this.f97665e);
        }
        this.f102901a.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
