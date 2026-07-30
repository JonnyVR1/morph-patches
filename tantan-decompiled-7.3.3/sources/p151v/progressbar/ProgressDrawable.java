package p151v.progressbar;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p153l.bac0;
import p153l.o4b0;
import p153l.z8c0;
import p153l.zdc0;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a */
    public final float f210803a;

    /* JADX INFO: renamed from: b */
    public final RectF f210804b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f210805c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f210806d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f210807e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f210808f;

    /* JADX INFO: renamed from: g */
    public boolean f210809g;

    /* JADX INFO: renamed from: h */
    public Paint f210810h;

    /* JADX INFO: renamed from: i */
    public boolean f210811i;

    /* JADX INFO: renamed from: j */
    public int f210812j;

    /* JADX INFO: renamed from: k */
    public int f210813k;

    /* JADX INFO: renamed from: l */
    public float f210814l;

    /* JADX INFO: renamed from: m */
    public float f210815m;

    /* JADX INFO: renamed from: n */
    public float f210816n;

    /* JADX INFO: renamed from: o */
    public float f210817o;

    /* JADX INFO: renamed from: p */
    public Interpolator f210818p;

    /* JADX INFO: renamed from: q */
    public Interpolator f210819q;

    /* JADX INFO: renamed from: r */
    public float f210820r;

    /* JADX INFO: renamed from: s */
    public int[] f210821s;

    /* JADX INFO: renamed from: t */
    public float f210822t;

    /* JADX INFO: renamed from: u */
    public float f210823u;

    /* JADX INFO: renamed from: v */
    public int f210824v;

    /* JADX INFO: renamed from: w */
    public int f210825w;

    /* JADX INFO: renamed from: x */
    public boolean f210826x;

    /* JADX INFO: renamed from: y */
    public static final ArgbEvaluator f210801y = new ArgbEvaluator();

    /* JADX INFO: renamed from: z */
    public static final Interpolator f210802z = new LinearInterpolator();

    /* JADX INFO: renamed from: A */
    public static final Interpolator f210799A = new LinearInterpolator();

    /* JADX INFO: renamed from: B */
    public static final Interpolator f210800B = new DecelerateInterpolator();

    public enum Style {
        NORMAL,
        ROUNDED
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$a */
    public class C22741a implements ValueAnimator.AnimatorUpdateListener {
        public C22741a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.m224968A(o4b0.m165979e(valueAnimator) * 360.0f);
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$b */
    public class C22742b implements ValueAnimator.AnimatorUpdateListener {
        public C22742b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float fM165979e = o4b0.m165979e(valueAnimator);
            boolean z = ProgressDrawable.this.f210826x;
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            if (z) {
                f = fM165979e * progressDrawable.f210825w;
            } else {
                f = (fM165979e * (ProgressDrawable.this.f210825w - ProgressDrawable.this.f210824v)) + progressDrawable.f210824v;
            }
            ProgressDrawable.this.m224969B(f);
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$c */
    public class C22743c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f210829a = false;

        public C22743c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f210829a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f210829a) {
                return;
            }
            ProgressDrawable.this.f210826x = false;
            ProgressDrawable.this.m224970C();
            ProgressDrawable.this.f210806d.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f210829a = false;
            ProgressDrawable.this.f210809g = true;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$d */
    public class C22744d implements ValueAnimator.AnimatorUpdateListener {
        public C22744d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fM165979e = o4b0.m165979e(valueAnimator);
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            progressDrawable.m224969B(progressDrawable.f210825w - (fM165979e * (ProgressDrawable.this.f210825w - ProgressDrawable.this.f210824v)));
            float currentPlayTime = valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration();
            if (ProgressDrawable.this.f210821s.length <= 1 || currentPlayTime <= 0.7f) {
                return;
            }
            ProgressDrawable.this.f210810h.setColor(((Integer) ProgressDrawable.f210801y.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(ProgressDrawable.this.f210812j), Integer.valueOf(ProgressDrawable.this.f210821s[(ProgressDrawable.this.f210813k + 1) % ProgressDrawable.this.f210821s.length]))).intValue());
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$e */
    public class C22745e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f210832a;

        public C22745e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f210832a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f210832a) {
                return;
            }
            ProgressDrawable.this.m224978z();
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            progressDrawable.f210813k = (progressDrawable.f210813k + 1) % ProgressDrawable.this.f210821s.length;
            ProgressDrawable progressDrawable2 = ProgressDrawable.this;
            progressDrawable2.f210812j = progressDrawable2.f210821s[ProgressDrawable.this.f210813k];
            ProgressDrawable.this.f210810h.setColor(ProgressDrawable.this.f210812j);
            ProgressDrawable.this.f210805c.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f210832a = false;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$f */
    public class C22746f implements ValueAnimator.AnimatorUpdateListener {
        public C22746f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.m224971D(1.0f - o4b0.m165979e(valueAnimator));
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$g */
    public class C22747g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f210835a;

        public C22747g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f210835a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressDrawable.this.m224971D(0.0f);
            if (this.f210835a) {
                return;
            }
            ProgressDrawable.this.stop();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f210835a = false;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$h */
    public class C22748h implements Animator.AnimatorListener {
        public C22748h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressDrawable.this.f210808f.removeListener(this);
            ProgressDrawable.m224954h(ProgressDrawable.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$i */
    public static class C22749i {

        /* JADX INFO: renamed from: a */
        public int[] f210838a;

        /* JADX INFO: renamed from: b */
        public float f210839b;

        /* JADX INFO: renamed from: c */
        public float f210840c;

        /* JADX INFO: renamed from: d */
        public float f210841d;

        /* JADX INFO: renamed from: e */
        public int f210842e;

        /* JADX INFO: renamed from: f */
        public int f210843f;

        /* JADX INFO: renamed from: g */
        public Style f210844g;

        /* JADX INFO: renamed from: h */
        public Interpolator f210845h = ProgressDrawable.f210800B;

        /* JADX INFO: renamed from: i */
        public Interpolator f210846i = ProgressDrawable.f210799A;

        /* JADX INFO: renamed from: j */
        public float f210847j = -1.0f;

        public C22749i(Context context) {
            m224982d(context);
        }

        /* JADX INFO: renamed from: a */
        public ProgressDrawable m224979a() {
            return new ProgressDrawable(this.f210838a, this.f210841d, this.f210847j, this.f210839b, this.f210840c, this.f210842e, this.f210843f, this.f210844g, this.f210846i, this.f210845h);
        }

        /* JADX INFO: renamed from: b */
        public C22749i m224980b(int i) {
            this.f210838a = new int[]{i};
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C22749i m224981c(int[] iArr) {
            o4b0.m165976b(iArr);
            this.f210838a = iArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final void m224982d(Context context) {
            this.f210841d = context.getResources().getDimension(bac0.f75667f);
            this.f210839b = 1.0f;
            this.f210840c = 1.0f;
            this.f210838a = new int[]{context.getResources().getColor(z8c0.f203363x)};
            this.f210842e = context.getResources().getInteger(zdc0.f203871b);
            this.f210843f = context.getResources().getInteger(zdc0.f203870a);
            this.f210844g = Style.ROUNDED;
        }

        /* JADX INFO: renamed from: e */
        public C22749i m224983e(int i) {
            o4b0.m165975a(i);
            this.f210843f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C22749i m224984f(int i) {
            o4b0.m165975a(i);
            this.f210842e = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C22749i m224985g(float f) {
            o4b0.m165978d(f);
            this.f210840c = f;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C22749i m224986h(float f) {
            this.f210847j = f;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C22749i m224987i(float f) {
            o4b0.m165977c(f, "StrokeWidth");
            this.f210841d = f;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C22749i m224988j(float f) {
            o4b0.m165978d(f);
            this.f210839b = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$j */
    public interface InterfaceC22750j {
    }

    public ProgressDrawable(int[] iArr, float f, float f2, float f3, float f4, int i, int i2, Style style, Interpolator interpolator, Interpolator interpolator2) {
        this.f210804b = new RectF();
        this.f210815m = 0.0f;
        this.f210816n = 0.0f;
        this.f210817o = 1.0f;
        this.f210819q = interpolator2;
        this.f210818p = interpolator;
        this.f210820r = f;
        this.f210803a = f2;
        this.f210813k = 0;
        this.f210821s = iArr;
        this.f210812j = iArr[0];
        this.f210822t = f3;
        this.f210823u = f4;
        this.f210824v = i;
        this.f210825w = i2;
        Paint paint = new Paint();
        this.f210810h = paint;
        paint.setAntiAlias(true);
        this.f210810h.setStyle(Paint.Style.STROKE);
        this.f210810h.setStrokeWidth(f);
        this.f210810h.setStrokeCap(style == Style.ROUNDED ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.f210810h.setColor(this.f210821s[0]);
        m224972E();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC22750j m224954h(ProgressDrawable progressDrawable) {
        progressDrawable.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m224968A(float f) {
        this.f210816n = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: B */
    public void m224969B(float f) {
        this.f210814l = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: C */
    public final void m224970C() {
        this.f210809g = false;
        this.f210815m += 360 - this.f210825w;
    }

    /* JADX INFO: renamed from: D */
    public final void m224971D(float f) {
        this.f210817o = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: E */
    public final void m224972E() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f210807e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f210818p);
        this.f210807e.setDuration((long) (2000.0f / this.f210823u));
        this.f210807e.addUpdateListener(new C22741a());
        this.f210807e.setRepeatCount(-1);
        this.f210807e.setRepeatMode(1);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f210824v, this.f210825w);
        this.f210805c = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(this.f210819q);
        this.f210805c.setDuration((long) (600.0f / this.f210822t));
        this.f210805c.addUpdateListener(new C22742b());
        this.f210805c.addListener(new C22743c());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.f210825w, this.f210824v);
        this.f210806d = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setInterpolator(this.f210819q);
        this.f210806d.setDuration((long) (600.0f / this.f210822t));
        this.f210806d.addUpdateListener(new C22744d());
        this.f210806d.addListener(new C22745e());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f210808f = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setInterpolator(f210802z);
        this.f210808f.setDuration(200L);
        this.f210808f.addUpdateListener(new C22746f());
        this.f210808f.addListener(new C22747g());
    }

    /* JADX INFO: renamed from: F */
    public final void m224973F() {
        this.f210807e.cancel();
        this.f210805c.cancel();
        this.f210806d.cancel();
        this.f210808f.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2 = this.f210816n - this.f210815m;
        float f3 = this.f210814l;
        if (!this.f210809g) {
            f2 += 360.0f - f3;
        }
        float f4 = f2 % 360.0f;
        float f5 = this.f210817o;
        if (f5 < 1.0f) {
            float f6 = f5 * f3;
            f4 = (f4 + (f3 - f6)) % 360.0f;
            f = f6;
        } else {
            f = f3;
        }
        canvas.drawArc(this.f210804b, f4, f, false, this.f210810h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f210811i;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f210803a != -1.0f) {
            float fWidth = rect.width() * this.f210803a;
            this.f210820r = fWidth;
            this.f210810h.setStrokeWidth(fWidth);
        }
        RectF rectF = this.f210804b;
        float f = rect.left;
        float f2 = this.f210820r;
        rectF.left = f + (f2 / 2.0f) + 0.5f;
        rectF.right = (rect.right - (f2 / 2.0f)) - 0.5f;
        rectF.top = rect.top + (f2 / 2.0f) + 0.5f;
        rectF.bottom = (rect.bottom - (f2 / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f210810h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f210810h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        this.f210811i = true;
        m224977y();
        this.f210807e.start();
        this.f210805c.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            this.f210811i = false;
            m224973F();
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m224974v(int[] iArr) {
        this.f210821s = iArr;
        this.f210812j = iArr[0];
    }

    /* JADX INFO: renamed from: w */
    public void m224975w() {
        m224976x(null);
    }

    /* JADX INFO: renamed from: x */
    public void m224976x(InterfaceC22750j interfaceC22750j) {
        if (!isRunning() || this.f210808f.isRunning()) {
            return;
        }
        this.f210808f.addListener(new C22748h());
        this.f210808f.start();
    }

    /* JADX INFO: renamed from: y */
    public final void m224977y() {
        this.f210826x = true;
        this.f210817o = 1.0f;
        this.f210810h.setColor(this.f210812j);
    }

    /* JADX INFO: renamed from: z */
    public final void m224978z() {
        this.f210809g = true;
        this.f210815m += this.f210824v;
    }
}
