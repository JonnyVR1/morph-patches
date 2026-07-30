package p147v.progressbar;

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
import p149l.kwa0;
import p149l.t0c0;
import p149l.u1c0;
import p149l.u5c0;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a */
    public final float f209881a;

    /* JADX INFO: renamed from: b */
    public final RectF f209882b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f209883c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f209884d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f209885e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f209886f;

    /* JADX INFO: renamed from: g */
    public boolean f209887g;

    /* JADX INFO: renamed from: h */
    public Paint f209888h;

    /* JADX INFO: renamed from: i */
    public boolean f209889i;

    /* JADX INFO: renamed from: j */
    public int f209890j;

    /* JADX INFO: renamed from: k */
    public int f209891k;

    /* JADX INFO: renamed from: l */
    public float f209892l;

    /* JADX INFO: renamed from: m */
    public float f209893m;

    /* JADX INFO: renamed from: n */
    public float f209894n;

    /* JADX INFO: renamed from: o */
    public float f209895o;

    /* JADX INFO: renamed from: p */
    public Interpolator f209896p;

    /* JADX INFO: renamed from: q */
    public Interpolator f209897q;

    /* JADX INFO: renamed from: r */
    public float f209898r;

    /* JADX INFO: renamed from: s */
    public int[] f209899s;

    /* JADX INFO: renamed from: t */
    public float f209900t;

    /* JADX INFO: renamed from: u */
    public float f209901u;

    /* JADX INFO: renamed from: v */
    public int f209902v;

    /* JADX INFO: renamed from: w */
    public int f209903w;

    /* JADX INFO: renamed from: x */
    public boolean f209904x;

    /* JADX INFO: renamed from: y */
    public static final ArgbEvaluator f209879y = new ArgbEvaluator();

    /* JADX INFO: renamed from: z */
    public static final Interpolator f209880z = new LinearInterpolator();

    /* JADX INFO: renamed from: A */
    public static final Interpolator f209877A = new LinearInterpolator();

    /* JADX INFO: renamed from: B */
    public static final Interpolator f209878B = new DecelerateInterpolator();

    public enum Style {
        NORMAL,
        ROUNDED
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$a */
    public class C22626a implements ValueAnimator.AnimatorUpdateListener {
        public C22626a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.m223722A(kwa0.m147522e(valueAnimator) * 360.0f);
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$b */
    public class C22627b implements ValueAnimator.AnimatorUpdateListener {
        public C22627b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float fM147522e = kwa0.m147522e(valueAnimator);
            boolean z = ProgressDrawable.this.f209904x;
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            if (z) {
                f = fM147522e * progressDrawable.f209903w;
            } else {
                f = (fM147522e * (ProgressDrawable.this.f209903w - ProgressDrawable.this.f209902v)) + progressDrawable.f209902v;
            }
            ProgressDrawable.this.m223723B(f);
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$c */
    public class C22628c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f209907a = false;

        public C22628c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f209907a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f209907a) {
                return;
            }
            ProgressDrawable.this.f209904x = false;
            ProgressDrawable.this.m223724C();
            ProgressDrawable.this.f209884d.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f209907a = false;
            ProgressDrawable.this.f209887g = true;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$d */
    public class C22629d implements ValueAnimator.AnimatorUpdateListener {
        public C22629d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fM147522e = kwa0.m147522e(valueAnimator);
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            progressDrawable.m223723B(progressDrawable.f209903w - (fM147522e * (ProgressDrawable.this.f209903w - ProgressDrawable.this.f209902v)));
            float currentPlayTime = valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration();
            if (ProgressDrawable.this.f209899s.length <= 1 || currentPlayTime <= 0.7f) {
                return;
            }
            ProgressDrawable.this.f209888h.setColor(((Integer) ProgressDrawable.f209879y.evaluate((currentPlayTime - 0.7f) / 0.3f, Integer.valueOf(ProgressDrawable.this.f209890j), Integer.valueOf(ProgressDrawable.this.f209899s[(ProgressDrawable.this.f209891k + 1) % ProgressDrawable.this.f209899s.length]))).intValue());
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$e */
    public class C22630e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f209910a;

        public C22630e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f209910a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f209910a) {
                return;
            }
            ProgressDrawable.this.m223732z();
            ProgressDrawable progressDrawable = ProgressDrawable.this;
            progressDrawable.f209891k = (progressDrawable.f209891k + 1) % ProgressDrawable.this.f209899s.length;
            ProgressDrawable progressDrawable2 = ProgressDrawable.this;
            progressDrawable2.f209890j = progressDrawable2.f209899s[ProgressDrawable.this.f209891k];
            ProgressDrawable.this.f209888h.setColor(ProgressDrawable.this.f209890j);
            ProgressDrawable.this.f209883c.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f209910a = false;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$f */
    public class C22631f implements ValueAnimator.AnimatorUpdateListener {
        public C22631f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressDrawable.this.m223725D(1.0f - kwa0.m147522e(valueAnimator));
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$g */
    public class C22632g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f209913a;

        public C22632g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f209913a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressDrawable.this.m223725D(0.0f);
            if (this.f209913a) {
                return;
            }
            ProgressDrawable.this.stop();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f209913a = false;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$h */
    public class C22633h implements Animator.AnimatorListener {
        public C22633h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressDrawable.this.f209886f.removeListener(this);
            ProgressDrawable.m223708h(ProgressDrawable.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$i */
    public static class C22634i {

        /* JADX INFO: renamed from: a */
        public int[] f209916a;

        /* JADX INFO: renamed from: b */
        public float f209917b;

        /* JADX INFO: renamed from: c */
        public float f209918c;

        /* JADX INFO: renamed from: d */
        public float f209919d;

        /* JADX INFO: renamed from: e */
        public int f209920e;

        /* JADX INFO: renamed from: f */
        public int f209921f;

        /* JADX INFO: renamed from: g */
        public Style f209922g;

        /* JADX INFO: renamed from: h */
        public Interpolator f209923h = ProgressDrawable.f209878B;

        /* JADX INFO: renamed from: i */
        public Interpolator f209924i = ProgressDrawable.f209877A;

        /* JADX INFO: renamed from: j */
        public float f209925j = -1.0f;

        public C22634i(Context context) {
            m223736d(context);
        }

        /* JADX INFO: renamed from: a */
        public ProgressDrawable m223733a() {
            return new ProgressDrawable(this.f209916a, this.f209919d, this.f209925j, this.f209917b, this.f209918c, this.f209920e, this.f209921f, this.f209922g, this.f209924i, this.f209923h);
        }

        /* JADX INFO: renamed from: b */
        public C22634i m223734b(int i) {
            this.f209916a = new int[]{i};
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C22634i m223735c(int[] iArr) {
            kwa0.m147519b(iArr);
            this.f209916a = iArr;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final void m223736d(Context context) {
            this.f209919d = context.getResources().getDimension(u1c0.f172992f);
            this.f209917b = 1.0f;
            this.f209918c = 1.0f;
            this.f209916a = new int[]{context.getResources().getColor(t0c0.f167172x)};
            this.f209920e = context.getResources().getInteger(u5c0.f174695b);
            this.f209921f = context.getResources().getInteger(u5c0.f174694a);
            this.f209922g = Style.ROUNDED;
        }

        /* JADX INFO: renamed from: e */
        public C22634i m223737e(int i) {
            kwa0.m147518a(i);
            this.f209921f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C22634i m223738f(int i) {
            kwa0.m147518a(i);
            this.f209920e = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C22634i m223739g(float f) {
            kwa0.m147521d(f);
            this.f209918c = f;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C22634i m223740h(float f) {
            this.f209925j = f;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C22634i m223741i(float f) {
            kwa0.m147520c(f, "StrokeWidth");
            this.f209919d = f;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C22634i m223742j(float f) {
            kwa0.m147521d(f);
            this.f209917b = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: v.progressbar.ProgressDrawable$j */
    public interface InterfaceC22635j {
    }

    public ProgressDrawable(int[] iArr, float f, float f2, float f3, float f4, int i, int i2, Style style, Interpolator interpolator, Interpolator interpolator2) {
        this.f209882b = new RectF();
        this.f209893m = 0.0f;
        this.f209894n = 0.0f;
        this.f209895o = 1.0f;
        this.f209897q = interpolator2;
        this.f209896p = interpolator;
        this.f209898r = f;
        this.f209881a = f2;
        this.f209891k = 0;
        this.f209899s = iArr;
        this.f209890j = iArr[0];
        this.f209900t = f3;
        this.f209901u = f4;
        this.f209902v = i;
        this.f209903w = i2;
        Paint paint = new Paint();
        this.f209888h = paint;
        paint.setAntiAlias(true);
        this.f209888h.setStyle(Paint.Style.STROKE);
        this.f209888h.setStrokeWidth(f);
        this.f209888h.setStrokeCap(style == Style.ROUNDED ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        this.f209888h.setColor(this.f209899s[0]);
        m223726E();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ InterfaceC22635j m223708h(ProgressDrawable progressDrawable) {
        progressDrawable.getClass();
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m223722A(float f) {
        this.f209894n = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: B */
    public void m223723B(float f) {
        this.f209892l = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: C */
    public final void m223724C() {
        this.f209887g = false;
        this.f209893m += 360 - this.f209903w;
    }

    /* JADX INFO: renamed from: D */
    public final void m223725D(float f) {
        this.f209895o = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: E */
    public final void m223726E() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f209885e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f209896p);
        this.f209885e.setDuration((long) (2000.0f / this.f209901u));
        this.f209885e.addUpdateListener(new C22626a());
        this.f209885e.setRepeatCount(-1);
        this.f209885e.setRepeatMode(1);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f209902v, this.f209903w);
        this.f209883c = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(this.f209897q);
        this.f209883c.setDuration((long) (600.0f / this.f209900t));
        this.f209883c.addUpdateListener(new C22627b());
        this.f209883c.addListener(new C22628c());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.f209903w, this.f209902v);
        this.f209884d = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setInterpolator(this.f209897q);
        this.f209884d.setDuration((long) (600.0f / this.f209900t));
        this.f209884d.addUpdateListener(new C22629d());
        this.f209884d.addListener(new C22630e());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f209886f = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setInterpolator(f209880z);
        this.f209886f.setDuration(200L);
        this.f209886f.addUpdateListener(new C22631f());
        this.f209886f.addListener(new C22632g());
    }

    /* JADX INFO: renamed from: F */
    public final void m223727F() {
        this.f209885e.cancel();
        this.f209883c.cancel();
        this.f209884d.cancel();
        this.f209886f.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2 = this.f209894n - this.f209893m;
        float f3 = this.f209892l;
        if (!this.f209887g) {
            f2 += 360.0f - f3;
        }
        float f4 = f2 % 360.0f;
        float f5 = this.f209895o;
        if (f5 < 1.0f) {
            float f6 = f5 * f3;
            f4 = (f4 + (f3 - f6)) % 360.0f;
            f = f6;
        } else {
            f = f3;
        }
        canvas.drawArc(this.f209882b, f4, f, false, this.f209888h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f209889i;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f209881a != -1.0f) {
            float fWidth = rect.width() * this.f209881a;
            this.f209898r = fWidth;
            this.f209888h.setStrokeWidth(fWidth);
        }
        RectF rectF = this.f209882b;
        float f = rect.left;
        float f2 = this.f209898r;
        rectF.left = f + (f2 / 2.0f) + 0.5f;
        rectF.right = (rect.right - (f2 / 2.0f)) - 0.5f;
        rectF.top = rect.top + (f2 / 2.0f) + 0.5f;
        rectF.bottom = (rect.bottom - (f2 / 2.0f)) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f209888h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f209888h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        this.f209889i = true;
        m223731y();
        this.f209885e.start();
        this.f209883c.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            this.f209889i = false;
            m223727F();
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m223728v(int[] iArr) {
        this.f209899s = iArr;
        this.f209890j = iArr[0];
    }

    /* JADX INFO: renamed from: w */
    public void m223729w() {
        m223730x(null);
    }

    /* JADX INFO: renamed from: x */
    public void m223730x(InterfaceC22635j interfaceC22635j) {
        if (!isRunning() || this.f209886f.isRunning()) {
            return;
        }
        this.f209886f.addListener(new C22633h());
        this.f209886f.start();
    }

    /* JADX INFO: renamed from: y */
    public final void m223731y() {
        this.f209904x = true;
        this.f209895o = 1.0f;
        this.f209888h.setColor(this.f209890j);
    }

    /* JADX INFO: renamed from: z */
    public final void m223732z() {
        this.f209887g = true;
        this.f209893m += this.f209902v;
    }
}
