package com.idv.identity.face.p043ui.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;
import p153l.dhc0;
import p153l.pte;

/* JADX INFO: loaded from: classes7.dex */
public class EllipseHoleView extends AppCompatImageView {

    /* JADX INFO: renamed from: K */
    private static final Xfermode f12939K = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: A */
    private int f12940A;

    /* JADX INFO: renamed from: B */
    private boolean f12941B;

    /* JADX INFO: renamed from: C */
    private int f12942C;

    /* JADX INFO: renamed from: D */
    private Handler f12943D;

    /* JADX INFO: renamed from: E */
    private boolean f12944E;

    /* JADX INFO: renamed from: F */
    private Runnable f12945F;

    /* JADX INFO: renamed from: G */
    private float f12946G;

    /* JADX INFO: renamed from: H */
    private float f12947H;

    /* JADX INFO: renamed from: I */
    private boolean f12948I;

    /* JADX INFO: renamed from: J */
    boolean f12949J;

    /* JADX INFO: renamed from: c */
    private Bitmap f12950c;

    /* JADX INFO: renamed from: d */
    private Paint f12951d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Bitmap> f12952e;

    /* JADX INFO: renamed from: f */
    public float f12953f;

    /* JADX INFO: renamed from: g */
    public float f12954g;

    /* JADX INFO: renamed from: h */
    public float f12955h;

    /* JADX INFO: renamed from: i */
    public float f12956i;

    /* JADX INFO: renamed from: j */
    private boolean f12957j;

    /* JADX INFO: renamed from: k */
    private boolean f12958k;

    /* JADX INFO: renamed from: l */
    private int f12959l;

    /* JADX INFO: renamed from: m */
    private float f12960m;

    /* JADX INFO: renamed from: n */
    private float f12961n;

    /* JADX INFO: renamed from: o */
    private float f12962o;

    /* JADX INFO: renamed from: p */
    protected int f12963p;

    /* JADX INFO: renamed from: q */
    protected int f12964q;

    /* JADX INFO: renamed from: r */
    protected int f12965r;

    /* JADX INFO: renamed from: s */
    private int f12966s;

    /* JADX INFO: renamed from: t */
    private int f12967t;

    /* JADX INFO: renamed from: u */
    private int f12968u;

    /* JADX INFO: renamed from: v */
    private int f12969v;

    /* JADX INFO: renamed from: w */
    private RectF f12970w;

    /* JADX INFO: renamed from: x */
    public BitmapShader f12971x;

    /* JADX INFO: renamed from: y */
    private SweepGradient f12972y;

    /* JADX INFO: renamed from: z */
    private int f12973z;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.widget.EllipseHoleView$a */
    public class RunnableC3733a implements Runnable {
        public RunnableC3733a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = EllipseHoleView.this.f12944E;
            EllipseHoleView ellipseHoleView = EllipseHoleView.this;
            if (z) {
                ellipseHoleView.f12943D.postDelayed(this, EllipseHoleView.this.f12942C / EllipseHoleView.this.getMax());
                return;
            }
            int progress = ellipseHoleView.getProgress() + 1;
            EllipseHoleView.m18785h(EllipseHoleView.this);
            if (progress >= EllipseHoleView.this.getMax()) {
                progress = EllipseHoleView.this.getMax();
            }
            EllipseHoleView.this.setProgress(progress);
            int max = EllipseHoleView.this.getMax();
            EllipseHoleView ellipseHoleView2 = EllipseHoleView.this;
            if (progress >= max) {
                EllipseHoleView.m18785h(ellipseHoleView2);
            } else {
                ellipseHoleView2.f12943D.postDelayed(this, EllipseHoleView.this.f12942C / EllipseHoleView.this.getMax());
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.widget.EllipseHoleView$b */
    public class C3734b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator.AnimatorListener f12975a;

        public C3734b(Animator.AnimatorListener animatorListener) {
            this.f12975a = animatorListener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12975a;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12975a;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
            EllipseHoleView.this.f12948I = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12975a;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12975a;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    public EllipseHoleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12953f = -1.0f;
        this.f12954g = -1.0f;
        this.f12955h = -1.0f;
        this.f12956i = -1.0f;
        this.f12957j = false;
        this.f12958k = false;
        this.f12959l = -1;
        this.f12960m = 0.0f;
        this.f12961n = 0.0f;
        this.f12969v = 0;
        this.f12970w = new RectF();
        this.f12942C = -1;
        this.f12944E = false;
        this.f12945F = new RunnableC3733a();
        this.f12946G = 0.0f;
        this.f12947H = 0.0f;
        this.f12948I = false;
        this.f12949J = false;
        this.f12943D = new Handler(Looper.getMainLooper());
        m18787q(context, attributeSet);
        m18789t();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ pte m18785h(EllipseHoleView ellipseHoleView) {
        ellipseHoleView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: q */
    private void m18787q(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dhc0.f88462h);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12953f = typedArrayObtainStyledAttributes.getDimension(dhc0.f88468n, 0.0f);
            this.f12954g = typedArrayObtainStyledAttributes.getDimension(dhc0.f88469o, 0.0f);
            this.f12955h = typedArrayObtainStyledAttributes.getDimension(dhc0.f88471q, 0.0f);
            this.f12956i = typedArrayObtainStyledAttributes.getDimension(dhc0.f88467m, 0.0f);
            this.f12957j = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88466l, false);
            this.f12958k = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88470p, false);
            this.f12962o = typedArrayObtainStyledAttributes.getDimension(dhc0.f88476v, 5.0f);
            this.f12963p = typedArrayObtainStyledAttributes.getColor(dhc0.f88474t, -65536);
            this.f12969v = typedArrayObtainStyledAttributes.getInt(dhc0.f88478x, 0);
            this.f12973z = typedArrayObtainStyledAttributes.getColor(dhc0.f88465k, 0);
            this.f12940A = typedArrayObtainStyledAttributes.getColor(dhc0.f88464j, 0);
            this.f12941B = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88473s, false);
            this.f12964q = typedArrayObtainStyledAttributes.getColor(dhc0.f88475u, -16711936);
            this.f12965r = typedArrayObtainStyledAttributes.getInt(dhc0.f88477w, 0);
            this.f12966s = typedArrayObtainStyledAttributes.getInt(dhc0.f88463i, 360);
            this.f12968u = typedArrayObtainStyledAttributes.getInteger(dhc0.f88472r, 100);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m18788s(Canvas canvas, RectF rectF) {
        this.f12951d.setStyle(Paint.Style.STROKE);
        this.f12951d.setColor(this.f12963p);
        this.f12951d.setAlpha(128);
        canvas.drawOval(rectF, this.f12951d);
        BitmapShader bitmapShader = this.f12971x;
        if (bitmapShader != null) {
            this.f12951d.setShader(bitmapShader);
        }
        this.f12951d.setAlpha(0);
        if (this.f12941B && this.f12973z != 0 && this.f12940A != 0 && this.f12972y == null) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            this.f12972y = new SweepGradient(fCenterX, fCenterY, new int[]{this.f12973z, this.f12940A}, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, fCenterX, fCenterY);
            this.f12972y.setLocalMatrix(matrix);
        }
        SweepGradient sweepGradient = this.f12972y;
        if (sweepGradient != null) {
            this.f12951d.setShader(sweepGradient);
        }
        this.f12951d.setColor(this.f12964q);
        canvas.drawArc(rectF, this.f12965r, (this.f12967t * (this.f12966s - this.f12965r)) / getMax(), false, this.f12951d);
        this.f12951d.setShader(null);
    }

    /* JADX INFO: renamed from: t */
    private void m18789t() {
        this.f12951d = new Paint(1);
    }

    public synchronized int getMax() {
        return this.f12968u;
    }

    public synchronized int getProgress() {
        return this.f12967t;
    }

    public RectF getRectF() {
        float width = getWidth();
        float height = getHeight();
        float f = this.f12953f;
        float f2 = 0.0f;
        if (f <= -1.0f) {
            f = 0.0f;
        }
        if (this.f12957j) {
            f = (width / 2.0f) - (this.f12955h / 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
        }
        float f3 = (height - width) / 2.0f;
        float f4 = this.f12954g;
        if (f4 > -1.0f) {
            f3 = f4;
        }
        if (this.f12958k) {
            float f5 = (height / 2.0f) - (this.f12956i / 2.0f);
            if (f5 >= 0.0f) {
                f2 = f5;
            }
        } else {
            f2 = f3;
        }
        float f6 = this.f12955h;
        float f7 = f6 > -1.0f ? f6 + f : width;
        float f8 = width + f2;
        float f9 = this.f12956i;
        if (f9 > -1.0f) {
            f8 = f2 + f9;
        }
        this.f12970w.set(f, f2, f7, f8);
        return this.f12970w;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f12952e = null;
        Bitmap bitmap = this.f12950c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m18790j(Animator.AnimatorListener animatorListener) {
        int width = getWidth();
        int height = getHeight();
        float f = this.f12955h;
        float f2 = width * 0.7f;
        if (f == f2 && this.f12956i == height * 0.7f) {
            animatorListener.onAnimationEnd(null);
            return;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("widthAttr", f, f2), PropertyValuesHolder.ofFloat("heightAttr", this.f12956i, height * 0.7f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.addListener(animatorListener);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f12946G = this.f12955h;
        this.f12947H = this.f12956i;
    }

    /* JADX INFO: renamed from: k */
    public void m18791k(Animator.AnimatorListener animatorListener) {
        this.f12948I = true;
        int width = getWidth();
        float height = getHeight() * 0.45f;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("widthAttr", this.f12955h, width * 0.45f);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("heightAttr", this.f12956i, height);
        this.f12946G = this.f12955h;
        this.f12947H = this.f12956i;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.addListener(new C3734b(animatorListener));
        if (animatorListener != null) {
            objectAnimatorOfPropertyValuesHolder.addListener(animatorListener);
        }
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f12946G = this.f12955h;
        this.f12947H = this.f12956i;
    }

    /* JADX INFO: renamed from: l */
    public void m18792l() {
        m18793m(null);
    }

    /* JADX INFO: renamed from: m */
    public void m18793m(Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("widthAttr", this.f12955h, getWidth() * 0.71f), PropertyValuesHolder.ofFloat("heightAttr", this.f12956i, getHeight() * 0.71f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        if (animatorListener != null) {
            objectAnimatorOfPropertyValuesHolder.addListener(animatorListener);
        }
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f12946G = this.f12955h;
        this.f12947H = this.f12956i;
    }

    /* JADX INFO: renamed from: o */
    public void m18794o(int i) {
        this.f12959l = i;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            WeakReference<Bitmap> weakReference = this.f12952e;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    Bitmap bitmap = this.f12950c;
                    if (bitmap == null || bitmap.isRecycled()) {
                        this.f12950c = m18795p();
                    }
                    this.f12951d.reset();
                    this.f12951d.setFilterBitmap(false);
                    this.f12951d.setXfermode(f12939K);
                    canvas2.drawColor(this.f12959l);
                    canvas2.drawBitmap(this.f12950c, 0.0f, 0.0f, this.f12951d);
                    this.f12952e = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f12951d.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12951d);
            }
            this.f12951d.setColor(this.f12963p);
            this.f12951d.setStyle(Paint.Style.STROKE);
            this.f12951d.setStrokeWidth(this.f12962o);
            this.f12951d.setAntiAlias(true);
            this.f12951d.setStrokeCap(Paint.Cap.ROUND);
            this.f12970w.set(getRectF().left - (this.f12962o / 2.0f), getRectF().top - (this.f12962o / 2.0f), getRectF().right + (this.f12962o / 2.0f), getRectF().bottom + (this.f12962o / 2.0f));
            if (this.f12969v == 0) {
                m18788s(canvas, this.f12970w);
            }
        } catch (Exception unused2) {
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public Bitmap m18795p() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        RectF rectF = getRectF();
        RectF rectF2 = this.f12970w;
        float f = rectF.left;
        float f2 = this.f12962o;
        rectF2.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
        canvas.drawOval(this.f12970w, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: r */
    public boolean m18796r() {
        return this.f12948I;
    }

    public void setHeightAttr(float f) {
        this.f12956i = f;
        postInvalidate();
    }

    public synchronized void setProgress(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException("progress not less than 0");
            }
            int i2 = this.f12968u;
            if (i > i2) {
                i = i2;
            }
            if (i <= i2) {
                this.f12967t = i;
                postInvalidate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setWidthAttr(float f) {
        this.f12955h = f;
        postInvalidate();
    }

    public EllipseHoleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m18787q(context, attributeSet);
        m18789t();
    }

    public EllipseHoleView(Context context) {
        this(context, null);
        m18789t();
    }
}
