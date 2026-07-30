package p028v.progressbar;

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
import l.t0c0;
import l.u1c0;
import l.u5c0;
import p003l.kwa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a */
    public final float f13506a;

    /* JADX INFO: renamed from: b */
    public final RectF f13507b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f13508c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f13509d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f13510e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f13511f;

    /* JADX INFO: renamed from: g */
    public boolean f13512g;

    /* JADX INFO: renamed from: h */
    public Paint f13513h;

    /* JADX INFO: renamed from: i */
    public boolean f13514i;

    /* JADX INFO: renamed from: j */
    public int f13515j;

    /* JADX INFO: renamed from: k */
    public int f13516k;

    /* JADX INFO: renamed from: l */
    public float f13517l;

    /* JADX INFO: renamed from: m */
    public float f13518m;

    /* JADX INFO: renamed from: n */
    public float f13519n;

    /* JADX INFO: renamed from: o */
    public float f13520o;

    /* JADX INFO: renamed from: p */
    public Interpolator f13521p;

    /* JADX INFO: renamed from: q */
    public Interpolator f13522q;

    /* JADX INFO: renamed from: r */
    public float f13523r;

    /* JADX INFO: renamed from: s */
    public int[] f13524s;

    /* JADX INFO: renamed from: t */
    public float f13525t;

    /* JADX INFO: renamed from: u */
    public float f13526u;

    /* JADX INFO: renamed from: v */
    public int f13527v;

    /* JADX INFO: renamed from: w */
    public int f13528w;

    /* JADX INFO: renamed from: x */
    public boolean f13529x;

    /* JADX INFO: renamed from: y */
    public static final ArgbEvaluator f13504y = new ArgbEvaluator();

    /* JADX INFO: renamed from: z */
    public static final Interpolator f13505z = new LinearInterpolator();

    /* JADX INFO: renamed from: A */
    public static final Interpolator f13502A = new LinearInterpolator();

    /* JADX INFO: renamed from: B */
    public static final Interpolator f13503B = new DecelerateInterpolator();

    public enum Style {
        NORMAL,
        ROUNDED
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$a */
    public class C1419a implements ValueAnimator.AnimatorUpdateListener {
        public C1419a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.m12228A(kwa0.m5870e(valueAnimator) * 360.0f);
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$b */
    public class C1420b implements ValueAnimator.AnimatorUpdateListener {
        public C1420b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float fM5870e = kwa0.m5870e(valueAnimator);
            boolean z = ProgressDrawable.this.f13529x;
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            if (z) {
                f = fM5870e * progressDrawable.f13528w;
            } else {
                f = (fM5870e * (ProgressDrawable.this.f13528w - ProgressDrawable.this.f13527v)) + progressDrawable.f13527v;
            }
            ProgressDrawable.this.m12229B(f);
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$c */
    public class C1421c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f13532a = false;

        public C1421c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13532a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13532a) {
                return;
            }
            ProgressDrawable.this.f13529x = false;
            ProgressDrawable.this.m12230C();
            ProgressDrawable.this.f13509d.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13532a = false;
            ProgressDrawable.this.f13512g = true;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$d */
    public class C1422d implements ValueAnimator.AnimatorUpdateListener {
        public C1422d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fM5870e = kwa0.m5870e(valueAnimator);
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            progressDrawable.m12229B(progressDrawable.f13528w - (fM5870e * (ProgressDrawable.this.f13528w - ProgressDrawable.this.f13527v)));
            float currentPlayTime = valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration();
            if (ProgressDrawable.this.f13524s.length <= 1 || currentPlayTime <= 0.7f) {
                return;
            }
            ProgressDrawable.this.f13513h.setColor(((Integer) ProgressDrawable.f13504y.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(ProgressDrawable.this.f13515j), Integer.valueOf(ProgressDrawable.this.f13524s[(ProgressDrawable.this.f13516k + 1) % ProgressDrawable.this.f13524s.length]))).intValue());
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$e */
    public class C1423e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f13535a;

        public C1423e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13535a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13535a) {
                return;
            }
            ProgressDrawable.this.m12238z();
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            progressDrawable.f13516k = (progressDrawable.f13516k + 1) % ProgressDrawable.this.f13524s.length;
            ProgressDrawable progressDrawable2 = ProgressDrawable.this;
            progressDrawable2.f13515j = progressDrawable2.f13524s[ProgressDrawable.this.f13516k];
            ProgressDrawable.this.f13513h.setColor(ProgressDrawable.this.f13515j);
            ProgressDrawable.this.f13508c.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13535a = false;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$f */
    public class C1424f implements ValueAnimator.AnimatorUpdateListener {
        public C1424f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.m12231D(1.0f - kwa0.m5870e(valueAnimator));
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$g */
    public class C1425g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f13538a;

        public C1425g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13538a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressDrawable.this.m12231D(0.0f);
            if (this.f13538a) {
                return;
            }
            ProgressDrawable.this.stop();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13538a = false;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$h */
    public class C1426h implements Animator.AnimatorListener {
        public C1426h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressDrawable.this.f13511f.removeListener(this);
            ProgressDrawable.m12214h(ProgressDrawable.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$i */
    public static class C1427i {

        /* JADX INFO: renamed from: a */
        public int[] f13541a;

        /* JADX INFO: renamed from: b */
        public float f13542b;

        /* JADX INFO: renamed from: c */
        public float f13543c;

        /* JADX INFO: renamed from: d */
        public float f13544d;

        /* JADX INFO: renamed from: e */
        public int f13545e;

        /* JADX INFO: renamed from: f */
        public int f13546f;

        /* JADX INFO: renamed from: g */
        public Style f13547g;

        /* JADX INFO: renamed from: h */
        public Interpolator f13548h = ProgressDrawable.f13503B;

        /* JADX INFO: renamed from: i */
        public Interpolator f13549i = ProgressDrawable.f13502A;

        /* JADX INFO: renamed from: j */
        public float f13550j = -1.0f;

        public C1427i(Context context) {
            m12242d(context);
        }

        /* JADX INFO: renamed from: a */
        public ProgressDrawable m12239a() {
            return new ProgressDrawable(this.f13541a, this.f13544d, this.f13550j, this.f13542b, this.f13543c, this.f13545e, this.f13546f, this.f13547g, this.f13549i, this.f13548h);
        }

        /* JADX INFO: renamed from: b */
        public C1427i m12240b(int i) {
            this.f13541a = new int[]{i};
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C1427i m12241c(int[] iArr) {
            kwa0.m5867b(iArr);
            this.f13541a = iArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final void m12242d(Context context) {
            this.f13544d = context.getResources().getDimension(u1c0.f);
            this.f13542b = 1.0f;
            this.f13543c = 1.0f;
            this.f13541a = new int[]{context.getResources().getColor(t0c0.x)};
            this.f13545e = context.getResources().getInteger(u5c0.b);
            this.f13546f = context.getResources().getInteger(u5c0.a);
            this.f13547g = Style.ROUNDED;
        }

        /* JADX INFO: renamed from: e */
        public C1427i m12243e(int i) {
            kwa0.m5866a(i);
            this.f13546f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C1427i m12244f(int i) {
            kwa0.m5866a(i);
            this.f13545e = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C1427i m12245g(float f) {
            kwa0.m5869d(f);
            this.f13543c = f;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C1427i m12246h(float f) {
            this.f13550j = f;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1427i m12247i(float f) {
            kwa0.m5868c(f, "StrokeWidth");
            this.f13544d = f;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C1427i m12248j(float f) {
            kwa0.m5869d(f);
            this.f13542b = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$j */
    public interface InterfaceC1428j {
    }

    public ProgressDrawable(int[] iArr, float f, float f2, float f3, float f4, int i, int i2, Style style, Interpolator interpolator, Interpolator interpolator2) {
        this.f13507b = new RectF();
        this.f13518m = 0.0f;
        this.f13519n = 0.0f;
        this.f13520o = 1.0f;
        this.f13522q = interpolator2;
        this.f13521p = interpolator;
        this.f13523r = f;
        this.f13506a = f2;
        this.f13516k = 0;
        this.f13524s = iArr;
        this.f13515j = iArr[0];
        this.f13525t = f3;
        this.f13526u = f4;
        this.f13527v = i;
        this.f13528w = i2;
        Paint paint = new Paint();
        this.f13513h = paint;
        paint.setAntiAlias(true);
        this.f13513h.setStyle(Paint.Style.STROKE);
        this.f13513h.setStrokeWidth(f);
        this.f13513h.setStrokeCap(style == Style.ROUNDED ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.f13513h.setColor(this.f13524s[0]);
        m12232E();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC1428j m12214h(ProgressDrawable progressDrawable) {
        progressDrawable.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m12228A(float f) {
        this.f13519n = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: B */
    public void m12229B(float f) {
        this.f13517l = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: C */
    public final void m12230C() {
        this.f13512g = false;
        this.f13518m += 360 - this.f13528w;
    }

    /* JADX INFO: renamed from: D */
    public final void m12231D(float f) {
        this.f13520o = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: E */
    public final void m12232E() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f13510e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f13521p);
        this.f13510e.setDuration((long) (2000.0f / this.f13526u));
        this.f13510e.addUpdateListener(new C1419a());
        this.f13510e.setRepeatCount(-1);
        this.f13510e.setRepeatMode(1);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f13527v, this.f13528w);
        this.f13508c = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(this.f13522q);
        this.f13508c.setDuration((long) (600.0f / this.f13525t));
        this.f13508c.addUpdateListener(new C1420b());
        this.f13508c.addListener(new C1421c());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.f13528w, this.f13527v);
        this.f13509d = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setInterpolator(this.f13522q);
        this.f13509d.setDuration((long) (600.0f / this.f13525t));
        this.f13509d.addUpdateListener(new C1422d());
        this.f13509d.addListener(new C1423e());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f13511f = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setInterpolator(f13505z);
        this.f13511f.setDuration(200L);
        this.f13511f.addUpdateListener(new C1424f());
        this.f13511f.addListener(new C1425g());
    }

    /* JADX INFO: renamed from: F */
    public final void m12233F() {
        this.f13510e.cancel();
        this.f13508c.cancel();
        this.f13509d.cancel();
        this.f13511f.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2 = this.f13519n - this.f13518m;
        float f3 = this.f13517l;
        if (!this.f13512g) {
            f2 += 360.0f - f3;
        }
        float f4 = f2 % 360.0f;
        float f5 = this.f13520o;
        if (f5 < 1.0f) {
            float f6 = f5 * f3;
            f4 = (f4 + (f3 - f6)) % 360.0f;
            f = f6;
        } else {
            f = f3;
        }
        canvas.drawArc(this.f13507b, f4, f, false, this.f13513h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f13514i;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f13506a != -1.0f) {
            float fWidth = rect.width() * this.f13506a;
            this.f13523r = fWidth;
            this.f13513h.setStrokeWidth(fWidth);
        }
        RectF rectF = this.f13507b;
        float f = rect.left;
        float f2 = this.f13523r;
        rectF.left = f + (f2 / 2.0f) + 0.5f;
        rectF.right = (rect.right - (f2 / 2.0f)) - 0.5f;
        rectF.top = rect.top + (f2 / 2.0f) + 0.5f;
        rectF.bottom = (rect.bottom - (f2 / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f13513h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13513h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        this.f13514i = true;
        m12237y();
        this.f13510e.start();
        this.f13508c.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            this.f13514i = false;
            m12233F();
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m12234v(int[] iArr) {
        this.f13524s = iArr;
        this.f13515j = iArr[0];
    }

    /* JADX INFO: renamed from: w */
    public void m12235w() {
        m12236x(null);
    }

    /* JADX INFO: renamed from: x */
    public void m12236x(InterfaceC1428j interfaceC1428j) {
        if (!isRunning() || this.f13511f.isRunning()) {
            return;
        }
        this.f13511f.addListener(new C1426h());
        this.f13511f.start();
    }

    /* JADX INFO: renamed from: y */
    public final void m12237y() {
        this.f13529x = true;
        this.f13520o = 1.0f;
        this.f13513h.setColor(this.f13515j);
    }

    /* JADX INFO: renamed from: z */
    public final void m12238z() {
        this.f13512g = true;
        this.f13518m += this.f13527v;
    }
}
