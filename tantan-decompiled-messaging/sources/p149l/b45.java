package p149l;

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
public class b45 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final Interpolator f73282g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final Interpolator f73283h = new lig();

    /* JADX INFO: renamed from: i */
    public static final int[] f73284i = {RoundedDrawable.DEFAULT_BORDER_COLOR};

    /* JADX INFO: renamed from: a */
    public final C15797c f73285a;

    /* JADX INFO: renamed from: b */
    public float f73286b;

    /* JADX INFO: renamed from: c */
    public Resources f73287c;

    /* JADX INFO: renamed from: d */
    public Animator f73288d;

    /* JADX INFO: renamed from: e */
    public float f73289e;

    /* JADX INFO: renamed from: f */
    public boolean f73290f;

    /* JADX INFO: renamed from: l.b45$a */
    public class C15795a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15797c f73291a;

        public C15795a(C15797c c15797c) {
            this.f73291a = c15797c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b45.this.m100182n(fFloatValue, this.f73291a);
            b45.this.m100170b(fFloatValue, this.f73291a, false);
            b45.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l.b45$c */
    public static class C15797c {

        /* JADX INFO: renamed from: a */
        public final RectF f73295a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f73296b;

        /* JADX INFO: renamed from: c */
        public final Paint f73297c;

        /* JADX INFO: renamed from: d */
        public final Paint f73298d;

        /* JADX INFO: renamed from: e */
        public float f73299e;

        /* JADX INFO: renamed from: f */
        public float f73300f;

        /* JADX INFO: renamed from: g */
        public float f73301g;

        /* JADX INFO: renamed from: h */
        public float f73302h;

        /* JADX INFO: renamed from: i */
        public int[] f73303i;

        /* JADX INFO: renamed from: j */
        public int f73304j;

        /* JADX INFO: renamed from: k */
        public float f73305k;

        /* JADX INFO: renamed from: l */
        public float f73306l;

        /* JADX INFO: renamed from: m */
        public float f73307m;

        /* JADX INFO: renamed from: n */
        public boolean f73308n;

        /* JADX INFO: renamed from: o */
        public Path f73309o;

        /* JADX INFO: renamed from: p */
        public float f73310p;

        /* JADX INFO: renamed from: q */
        public float f73311q;

        /* JADX INFO: renamed from: r */
        public int f73312r;

        /* JADX INFO: renamed from: s */
        public int f73313s;

        /* JADX INFO: renamed from: t */
        public int f73314t;

        /* JADX INFO: renamed from: u */
        public int f73315u;

        public C15797c() {
            Paint paint = new Paint();
            this.f73296b = paint;
            Paint paint2 = new Paint();
            this.f73297c = paint2;
            Paint paint3 = new Paint();
            this.f73298d = paint3;
            this.f73299e = 0.0f;
            this.f73300f = 0.0f;
            this.f73301g = 0.0f;
            this.f73302h = 5.0f;
            this.f73310p = 1.0f;
            this.f73314t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: A */
        public void m100183A() {
            this.f73305k = this.f73299e;
            this.f73306l = this.f73300f;
            this.f73307m = this.f73301g;
        }

        /* JADX INFO: renamed from: a */
        public void m100184a(Canvas canvas, Rect rect) {
            RectF rectF = this.f73295a;
            float f = this.f73311q;
            float fMin = (this.f73302h / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f73312r * this.f73310p) / 2.0f, this.f73302h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.f73299e;
            float f3 = this.f73301g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f73300f + f3) * 360.0f) - f4;
            this.f73296b.setColor(this.f73315u);
            this.f73296b.setAlpha(this.f73314t);
            float f6 = this.f73302h / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f73298d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.f73296b);
            m100185b(canvas, f4, f5, rectF);
        }

        /* JADX INFO: renamed from: b */
        public void m100185b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f73308n) {
                Path path = this.f73309o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f73309o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f73312r * this.f73310p) / 2.0f;
                this.f73309o.moveTo(0.0f, 0.0f);
                this.f73309o.lineTo(this.f73312r * this.f73310p, 0.0f);
                Path path3 = this.f73309o;
                float f4 = this.f73312r;
                float f5 = this.f73310p;
                path3.lineTo((f4 * f5) / 2.0f, this.f73313s * f5);
                this.f73309o.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.f73302h / 2.0f));
                this.f73309o.close();
                this.f73297c.setColor(this.f73315u);
                this.f73297c.setAlpha(this.f73314t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f73309o, this.f73297c);
                canvas.restore();
            }
        }

        /* JADX INFO: renamed from: c */
        public int m100186c() {
            return this.f73314t;
        }

        /* JADX INFO: renamed from: d */
        public float m100187d() {
            return this.f73300f;
        }

        /* JADX INFO: renamed from: e */
        public int m100188e() {
            return this.f73303i[m100189f()];
        }

        /* JADX INFO: renamed from: f */
        public int m100189f() {
            return (this.f73304j + 1) % this.f73303i.length;
        }

        /* JADX INFO: renamed from: g */
        public float m100190g() {
            return this.f73299e;
        }

        /* JADX INFO: renamed from: h */
        public int m100191h() {
            return this.f73303i[this.f73304j];
        }

        /* JADX INFO: renamed from: i */
        public float m100192i() {
            return this.f73306l;
        }

        /* JADX INFO: renamed from: j */
        public float m100193j() {
            return this.f73307m;
        }

        /* JADX INFO: renamed from: k */
        public float m100194k() {
            return this.f73305k;
        }

        /* JADX INFO: renamed from: l */
        public void m100195l() {
            m100203t(m100189f());
        }

        /* JADX INFO: renamed from: m */
        public void m100196m() {
            this.f73305k = 0.0f;
            this.f73306l = 0.0f;
            this.f73307m = 0.0f;
            m100208y(0.0f);
            m100205v(0.0f);
            m100206w(0.0f);
        }

        /* JADX INFO: renamed from: n */
        public void m100197n(int i) {
            this.f73314t = i;
        }

        /* JADX INFO: renamed from: o */
        public void m100198o(float f, float f2) {
            this.f73312r = (int) f;
            this.f73313s = (int) f2;
        }

        /* JADX INFO: renamed from: p */
        public void m100199p(float f) {
            if (f != this.f73310p) {
                this.f73310p = f;
            }
        }

        /* JADX INFO: renamed from: q */
        public void m100200q(float f) {
            this.f73311q = f;
        }

        /* JADX INFO: renamed from: r */
        public void m100201r(int i) {
            this.f73315u = i;
        }

        /* JADX INFO: renamed from: s */
        public void m100202s(ColorFilter colorFilter) {
            this.f73296b.setColorFilter(colorFilter);
        }

        /* JADX INFO: renamed from: t */
        public void m100203t(int i) {
            this.f73304j = i;
            this.f73315u = this.f73303i[i];
        }

        /* JADX INFO: renamed from: u */
        public void m100204u(@NonNull int[] iArr) {
            this.f73303i = iArr;
            m100203t(0);
        }

        /* JADX INFO: renamed from: v */
        public void m100205v(float f) {
            this.f73300f = f;
        }

        /* JADX INFO: renamed from: w */
        public void m100206w(float f) {
            this.f73301g = f;
        }

        /* JADX INFO: renamed from: x */
        public void m100207x(boolean z) {
            if (this.f73308n != z) {
                this.f73308n = z;
            }
        }

        /* JADX INFO: renamed from: y */
        public void m100208y(float f) {
            this.f73299e = f;
        }

        /* JADX INFO: renamed from: z */
        public void m100209z(float f) {
            this.f73302h = f;
            this.f73296b.setStrokeWidth(f);
        }
    }

    public b45(@NonNull Context context) {
        this.f73287c = ((Context) tf80.m188658e(context)).getResources();
        C15797c c15797c = new C15797c();
        this.f73285a = c15797c;
        c15797c.m100204u(f73284i);
        m100179k(2.5f);
        m100181m();
    }

    /* JADX INFO: renamed from: a */
    public final void m100169a(float f, C15797c c15797c) {
        m100182n(f, c15797c);
        float fFloor = (float) (Math.floor(c15797c.m100193j() / 0.8f) + 1.0d);
        c15797c.m100208y(c15797c.m100194k() + (((c15797c.m100192i() - 0.01f) - c15797c.m100194k()) * f));
        c15797c.m100205v(c15797c.m100192i());
        c15797c.m100206w(c15797c.m100193j() + ((fFloor - c15797c.m100193j()) * f));
    }

    /* JADX INFO: renamed from: b */
    public void m100170b(float f, C15797c c15797c, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f73290f) {
            m100169a(f, c15797c);
            return;
        }
        if (f != 1.0f || z) {
            float fM100193j = c15797c.m100193j();
            if (f < 0.5f) {
                interpolation = c15797c.m100194k();
                interpolation2 = (f73283h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM100194k = c15797c.m100194k() + 0.79f;
                interpolation = fM100194k - (((1.0f - f73283h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM100194k;
            }
            float f2 = fM100193j + (0.20999998f * f);
            float f3 = (f + this.f73289e) * 216.0f;
            c15797c.m100208y(interpolation);
            c15797c.m100205v(interpolation2);
            c15797c.m100206w(f2);
            m100176h(f3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m100171c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    /* JADX INFO: renamed from: d */
    public void m100172d(boolean z) {
        this.f73285a.m100207x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f73286b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f73285a.m100184a(canvas, bounds);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m100173e(float f) {
        this.f73285a.m100199p(f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public void m100174f(@NonNull int... iArr) {
        this.f73285a.m100204u(iArr);
        this.f73285a.m100203t(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m100175g(float f) {
        this.f73285a.m100206w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f73285a.m100186c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m100176h(float f) {
        this.f73286b = f;
    }

    /* JADX INFO: renamed from: i */
    public final void m100177i(float f, float f2, float f3, float f4) {
        C15797c c15797c = this.f73285a;
        float f5 = this.f73287c.getDisplayMetrics().density;
        c15797c.m100209z(f2 * f5);
        c15797c.m100200q(f * f5);
        c15797c.m100203t(0);
        c15797c.m100198o(f3 * f5, f4 * f5);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f73288d.isRunning();
    }

    /* JADX INFO: renamed from: j */
    public void m100178j(float f, float f2) {
        this.f73285a.m100208y(f);
        this.f73285a.m100205v(f2);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m100179k(float f) {
        this.f73285a.m100209z(f);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m100180l(int i) {
        if (i == 0) {
            m100177i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m100177i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public final void m100181m() {
        C15797c c15797c = this.f73285a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C15795a(c15797c));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f73282g);
        valueAnimatorOfFloat.addListener(new C15796b(c15797c));
        this.f73288d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: n */
    public void m100182n(float f, C15797c c15797c) {
        if (f > 0.75f) {
            c15797c.m100201r(m100171c((f - 0.75f) / 0.25f, c15797c.m100191h(), c15797c.m100188e()));
        } else {
            c15797c.m100201r(c15797c.m100191h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f73285a.m100197n(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f73285a.m100202s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f73288d.cancel();
        this.f73285a.m100183A();
        if (this.f73285a.m100187d() != this.f73285a.m100190g()) {
            this.f73290f = true;
            this.f73288d.setDuration(666L);
            this.f73288d.start();
        } else {
            this.f73285a.m100203t(0);
            this.f73285a.m100196m();
            this.f73288d.setDuration(1332L);
            this.f73288d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f73288d.cancel();
        m100176h(0.0f);
        this.f73285a.m100207x(false);
        this.f73285a.m100203t(0);
        this.f73285a.m100196m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l.b45$b */
    public class C15796b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15797c f73293a;

        public C15796b(C15797c c15797c) {
            this.f73293a = c15797c;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b45.this.m100170b(1.0f, this.f73293a, true);
            this.f73293a.m100183A();
            this.f73293a.m100195l();
            b45 b45Var = b45.this;
            if (!b45Var.f73290f) {
                b45Var.f73289e += 1.0f;
                return;
            }
            b45Var.f73290f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f73293a.m100207x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b45.this.f73289e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
