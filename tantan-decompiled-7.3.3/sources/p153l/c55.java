package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class c55 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final Interpolator f79762g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final Interpolator f79763h = new zjg();

    /* JADX INFO: renamed from: i */
    public static final int[] f79764i = {RoundedDrawable.DEFAULT_BORDER_COLOR};

    /* JADX INFO: renamed from: a */
    public final C16187c f79765a;

    /* JADX INFO: renamed from: b */
    public float f79766b;

    /* JADX INFO: renamed from: c */
    public Resources f79767c;

    /* JADX INFO: renamed from: d */
    public Animator f79768d;

    /* JADX INFO: renamed from: e */
    public float f79769e;

    /* JADX INFO: renamed from: f */
    public boolean f79770f;

    /* JADX INFO: renamed from: l.c55$a */
    public class C16185a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C16187c f79771a;

        public C16185a(C16187c c16187c) {
            this.f79771a = c16187c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            c55.this.m107992n(fFloatValue, this.f79771a);
            c55.this.m107980b(fFloatValue, this.f79771a, false);
            c55.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l.c55$c */
    public static class C16187c {

        /* JADX INFO: renamed from: a */
        public final RectF f79775a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f79776b;

        /* JADX INFO: renamed from: c */
        public final Paint f79777c;

        /* JADX INFO: renamed from: d */
        public final Paint f79778d;

        /* JADX INFO: renamed from: e */
        public float f79779e;

        /* JADX INFO: renamed from: f */
        public float f79780f;

        /* JADX INFO: renamed from: g */
        public float f79781g;

        /* JADX INFO: renamed from: h */
        public float f79782h;

        /* JADX INFO: renamed from: i */
        public int[] f79783i;

        /* JADX INFO: renamed from: j */
        public int f79784j;

        /* JADX INFO: renamed from: k */
        public float f79785k;

        /* JADX INFO: renamed from: l */
        public float f79786l;

        /* JADX INFO: renamed from: m */
        public float f79787m;

        /* JADX INFO: renamed from: n */
        public boolean f79788n;

        /* JADX INFO: renamed from: o */
        public Path f79789o;

        /* JADX INFO: renamed from: p */
        public float f79790p;

        /* JADX INFO: renamed from: q */
        public float f79791q;

        /* JADX INFO: renamed from: r */
        public int f79792r;

        /* JADX INFO: renamed from: s */
        public int f79793s;

        /* JADX INFO: renamed from: t */
        public int f79794t;

        /* JADX INFO: renamed from: u */
        public int f79795u;

        public C16187c() {
            Paint paint = new Paint();
            this.f79776b = paint;
            Paint paint2 = new Paint();
            this.f79777c = paint2;
            Paint paint3 = new Paint();
            this.f79778d = paint3;
            this.f79779e = 0.0f;
            this.f79780f = 0.0f;
            this.f79781g = 0.0f;
            this.f79782h = 5.0f;
            this.f79790p = 1.0f;
            this.f79794t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: A */
        public void m107993A() {
            this.f79785k = this.f79779e;
            this.f79786l = this.f79780f;
            this.f79787m = this.f79781g;
        }

        /* JADX INFO: renamed from: a */
        public void m107994a(Canvas canvas, Rect rect) {
            RectF rectF = this.f79775a;
            float f = this.f79791q;
            float fMin = (this.f79782h / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f79792r * this.f79790p) / 2.0f, this.f79782h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.f79779e;
            float f3 = this.f79781g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f79780f + f3) * 360.0f) - f4;
            this.f79776b.setColor(this.f79795u);
            this.f79776b.setAlpha(this.f79794t);
            float f6 = this.f79782h / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f79778d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.f79776b);
            m107995b(canvas, f4, f5, rectF);
        }

        /* JADX INFO: renamed from: b */
        public void m107995b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f79788n) {
                Path path = this.f79789o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f79789o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f79792r * this.f79790p) / 2.0f;
                this.f79789o.moveTo(0.0f, 0.0f);
                this.f79789o.lineTo(this.f79792r * this.f79790p, 0.0f);
                Path path3 = this.f79789o;
                float f4 = this.f79792r;
                float f5 = this.f79790p;
                path3.lineTo((f4 * f5) / 2.0f, this.f79793s * f5);
                this.f79789o.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.f79782h / 2.0f));
                this.f79789o.close();
                this.f79777c.setColor(this.f79795u);
                this.f79777c.setAlpha(this.f79794t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f79789o, this.f79777c);
                canvas.restore();
            }
        }

        /* JADX INFO: renamed from: c */
        public int m107996c() {
            return this.f79794t;
        }

        /* JADX INFO: renamed from: d */
        public float m107997d() {
            return this.f79780f;
        }

        /* JADX INFO: renamed from: e */
        public int m107998e() {
            return this.f79783i[m107999f()];
        }

        /* JADX INFO: renamed from: f */
        public int m107999f() {
            return (this.f79784j + 1) % this.f79783i.length;
        }

        /* JADX INFO: renamed from: g */
        public float m108000g() {
            return this.f79779e;
        }

        /* JADX INFO: renamed from: h */
        public int m108001h() {
            return this.f79783i[this.f79784j];
        }

        /* JADX INFO: renamed from: i */
        public float m108002i() {
            return this.f79786l;
        }

        /* JADX INFO: renamed from: j */
        public float m108003j() {
            return this.f79787m;
        }

        /* JADX INFO: renamed from: k */
        public float m108004k() {
            return this.f79785k;
        }

        /* JADX INFO: renamed from: l */
        public void m108005l() {
            m108013t(m107999f());
        }

        /* JADX INFO: renamed from: m */
        public void m108006m() {
            this.f79785k = 0.0f;
            this.f79786l = 0.0f;
            this.f79787m = 0.0f;
            m108018y(0.0f);
            m108015v(0.0f);
            m108016w(0.0f);
        }

        /* JADX INFO: renamed from: n */
        public void m108007n(int i) {
            this.f79794t = i;
        }

        /* JADX INFO: renamed from: o */
        public void m108008o(float f, float f2) {
            this.f79792r = (int) f;
            this.f79793s = (int) f2;
        }

        /* JADX INFO: renamed from: p */
        public void m108009p(float f) {
            if (f != this.f79790p) {
                this.f79790p = f;
            }
        }

        /* JADX INFO: renamed from: q */
        public void m108010q(float f) {
            this.f79791q = f;
        }

        /* JADX INFO: renamed from: r */
        public void m108011r(int i) {
            this.f79795u = i;
        }

        /* JADX INFO: renamed from: s */
        public void m108012s(ColorFilter colorFilter) {
            this.f79776b.setColorFilter(colorFilter);
        }

        /* JADX INFO: renamed from: t */
        public void m108013t(int i) {
            this.f79784j = i;
            this.f79795u = this.f79783i[i];
        }

        /* JADX INFO: renamed from: u */
        public void m108014u(@NonNull int[] iArr) {
            this.f79783i = iArr;
            m108013t(0);
        }

        /* JADX INFO: renamed from: v */
        public void m108015v(float f) {
            this.f79780f = f;
        }

        /* JADX INFO: renamed from: w */
        public void m108016w(float f) {
            this.f79781g = f;
        }

        /* JADX INFO: renamed from: x */
        public void m108017x(boolean z) {
            if (this.f79788n != z) {
                this.f79788n = z;
            }
        }

        /* JADX INFO: renamed from: y */
        public void m108018y(float f) {
            this.f79779e = f;
        }

        /* JADX INFO: renamed from: z */
        public void m108019z(float f) {
            this.f79782h = f;
            this.f79776b.setStrokeWidth(f);
        }
    }

    public c55(@NonNull Context context) {
        this.f79767c = ((Context) yn80.m216775e(context)).getResources();
        C16187c c16187c = new C16187c();
        this.f79765a = c16187c;
        c16187c.m108014u(f79764i);
        m107989k(2.5f);
        m107991m();
    }

    /* JADX INFO: renamed from: a */
    public final void m107979a(float f, C16187c c16187c) {
        m107992n(f, c16187c);
        float fFloor = (float) (Math.floor(c16187c.m108003j() / 0.8f) + 1.0d);
        c16187c.m108018y(c16187c.m108004k() + (((c16187c.m108002i() - 0.01f) - c16187c.m108004k()) * f));
        c16187c.m108015v(c16187c.m108002i());
        c16187c.m108016w(c16187c.m108003j() + ((fFloor - c16187c.m108003j()) * f));
    }

    /* JADX INFO: renamed from: b */
    public void m107980b(float f, C16187c c16187c, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f79770f) {
            m107979a(f, c16187c);
            return;
        }
        if (f != 1.0f || z) {
            float fM108003j = c16187c.m108003j();
            if (f < 0.5f) {
                interpolation = c16187c.m108004k();
                interpolation2 = (f79763h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM108004k = c16187c.m108004k() + 0.79f;
                interpolation = fM108004k - (((1.0f - f79763h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM108004k;
            }
            float f2 = fM108003j + (0.20999998f * f);
            float f3 = (f + this.f79769e) * 216.0f;
            c16187c.m108018y(interpolation);
            c16187c.m108015v(interpolation2);
            c16187c.m108016w(f2);
            m107986h(f3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m107981c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* JADX INFO: renamed from: d */
    public void m107982d(boolean z) {
        this.f79765a.m108017x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f79766b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f79765a.m107994a(canvas, bounds);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m107983e(float f) {
        this.f79765a.m108009p(f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public void m107984f(@NonNull int... iArr) {
        this.f79765a.m108014u(iArr);
        this.f79765a.m108013t(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m107985g(float f) {
        this.f79765a.m108016w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f79765a.m107996c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m107986h(float f) {
        this.f79766b = f;
    }

    /* JADX INFO: renamed from: i */
    public final void m107987i(float f, float f2, float f3, float f4) {
        C16187c c16187c = this.f79765a;
        float f5 = this.f79767c.getDisplayMetrics().density;
        c16187c.m108019z(f2 * f5);
        c16187c.m108010q(f * f5);
        c16187c.m108013t(0);
        c16187c.m108008o(f3 * f5, f4 * f5);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f79768d.isRunning();
    }

    /* JADX INFO: renamed from: j */
    public void m107988j(float f, float f2) {
        this.f79765a.m108018y(f);
        this.f79765a.m108015v(f2);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m107989k(float f) {
        this.f79765a.m108019z(f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m107990l(int i) {
        if (i == 0) {
            m107987i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m107987i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public final void m107991m() {
        C16187c c16187c = this.f79765a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C16185a(c16187c));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f79762g);
        valueAnimatorOfFloat.addListener(new C16186b(c16187c));
        this.f79768d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: n */
    public void m107992n(float f, C16187c c16187c) {
        if (f > 0.75f) {
            c16187c.m108011r(m107981c((f - 0.75f) / 0.25f, c16187c.m108001h(), c16187c.m107998e()));
        } else {
            c16187c.m108011r(c16187c.m108001h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f79765a.m108007n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f79765a.m108012s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f79768d.cancel();
        this.f79765a.m107993A();
        if (this.f79765a.m107997d() != this.f79765a.m108000g()) {
            this.f79770f = true;
            this.f79768d.setDuration(666L);
            this.f79768d.start();
        } else {
            this.f79765a.m108013t(0);
            this.f79765a.m108006m();
            this.f79768d.setDuration(1332L);
            this.f79768d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f79768d.cancel();
        m107986h(0.0f);
        this.f79765a.m108017x(false);
        this.f79765a.m108013t(0);
        this.f79765a.m108006m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l.c55$b */
    public class C16186b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C16187c f79773a;

        public C16186b(C16187c c16187c) {
            this.f79773a = c16187c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            c55.this.m107980b(1.0f, this.f79773a, true);
            this.f79773a.m107993A();
            this.f79773a.m108005l();
            c55 c55Var = c55.this;
            if (!c55Var.f79770f) {
                c55Var.f79769e += 1.0f;
                return;
            }
            c55Var.f79770f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f79773a.m108017x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c55.this.f79769e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
