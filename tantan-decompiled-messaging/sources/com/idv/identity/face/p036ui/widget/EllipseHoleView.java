package com.idv.identity.face.p036ui.widget;

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
import p149l.lse;
import p149l.x8c0;

/* JADX INFO: loaded from: classes7.dex */
public class EllipseHoleView extends AppCompatImageView {

    /* JADX INFO: renamed from: K */
    private static final Xfermode f12198K = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: A */
    private int f12199A;

    /* JADX INFO: renamed from: B */
    private boolean f12200B;

    /* JADX INFO: renamed from: C */
    private int f12201C;

    /* JADX INFO: renamed from: D */
    private Handler f12202D;

    /* JADX INFO: renamed from: E */
    private boolean f12203E;

    /* JADX INFO: renamed from: F */
    private Runnable f12204F;

    /* JADX INFO: renamed from: G */
    private float f12205G;

    /* JADX INFO: renamed from: H */
    private float f12206H;

    /* JADX INFO: renamed from: I */
    private boolean f12207I;

    /* JADX INFO: renamed from: J */
    boolean f12208J;

    /* JADX INFO: renamed from: c */
    private Bitmap f12209c;

    /* JADX INFO: renamed from: d */
    private Paint f12210d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Bitmap> f12211e;

    /* JADX INFO: renamed from: f */
    public float f12212f;

    /* JADX INFO: renamed from: g */
    public float f12213g;

    /* JADX INFO: renamed from: h */
    public float f12214h;

    /* JADX INFO: renamed from: i */
    public float f12215i;

    /* JADX INFO: renamed from: j */
    private boolean f12216j;

    /* JADX INFO: renamed from: k */
    private boolean f12217k;

    /* JADX INFO: renamed from: l */
    private int f12218l;

    /* JADX INFO: renamed from: m */
    private float f12219m;

    /* JADX INFO: renamed from: n */
    private float f12220n;

    /* JADX INFO: renamed from: o */
    private float f12221o;

    /* JADX INFO: renamed from: p */
    protected int f12222p;

    /* JADX INFO: renamed from: q */
    protected int f12223q;

    /* JADX INFO: renamed from: r */
    protected int f12224r;

    /* JADX INFO: renamed from: s */
    private int f12225s;

    /* JADX INFO: renamed from: t */
    private int f12226t;

    /* JADX INFO: renamed from: u */
    private int f12227u;

    /* JADX INFO: renamed from: v */
    private int f12228v;

    /* JADX INFO: renamed from: w */
    private RectF f12229w;

    /* JADX INFO: renamed from: x */
    public BitmapShader f12230x;

    /* JADX INFO: renamed from: y */
    private SweepGradient f12231y;

    /* JADX INFO: renamed from: z */
    private int f12232z;

    /* JADX INFO: renamed from: com.idv.identity.face.ui.widget.EllipseHoleView$a */
    public class RunnableC3574a implements Runnable {
        public RunnableC3574a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = EllipseHoleView.this.f12203E;
            EllipseHoleView ellipseHoleView = EllipseHoleView.this;
            if (z) {
                ellipseHoleView.f12202D.postDelayed(this, EllipseHoleView.this.f12201C / EllipseHoleView.this.getMax());
                return;
            }
            int progress = ellipseHoleView.getProgress() + 1;
            EllipseHoleView.m17708h(EllipseHoleView.this);
            if (progress >= EllipseHoleView.this.getMax()) {
                progress = EllipseHoleView.this.getMax();
            }
            EllipseHoleView.this.setProgress(progress);
            int max = EllipseHoleView.this.getMax();
            EllipseHoleView ellipseHoleView2 = EllipseHoleView.this;
            if (progress >= max) {
                EllipseHoleView.m17708h(ellipseHoleView2);
            } else {
                ellipseHoleView2.f12202D.postDelayed(this, EllipseHoleView.this.f12201C / EllipseHoleView.this.getMax());
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.ui.widget.EllipseHoleView$b */
    public class C3575b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Animator.AnimatorListener f12234a;

        public C3575b(Animator.AnimatorListener animatorListener) {
            this.f12234a = animatorListener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12234a;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12234a;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
            EllipseHoleView.this.f12207I = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12234a;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f12234a;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    public EllipseHoleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12212f = -1.0f;
        this.f12213g = -1.0f;
        this.f12214h = -1.0f;
        this.f12215i = -1.0f;
        this.f12216j = false;
        this.f12217k = false;
        this.f12218l = -1;
        this.f12219m = 0.0f;
        this.f12220n = 0.0f;
        this.f12228v = 0;
        this.f12229w = new RectF();
        this.f12201C = -1;
        this.f12203E = false;
        this.f12204F = new RunnableC3574a();
        this.f12205G = 0.0f;
        this.f12206H = 0.0f;
        this.f12207I = false;
        this.f12208J = false;
        this.f12202D = new Handler(Looper.getMainLooper());
        m17710q(context, attributeSet);
        m17712t();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ lse m17708h(EllipseHoleView ellipseHoleView) {
        ellipseHoleView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: q */
    private void m17710q(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x8c0.f191486h);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12212f = typedArrayObtainStyledAttributes.getDimension(x8c0.f191492n, 0.0f);
            this.f12213g = typedArrayObtainStyledAttributes.getDimension(x8c0.f191493o, 0.0f);
            this.f12214h = typedArrayObtainStyledAttributes.getDimension(x8c0.f191495q, 0.0f);
            this.f12215i = typedArrayObtainStyledAttributes.getDimension(x8c0.f191491m, 0.0f);
            this.f12216j = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191490l, false);
            this.f12217k = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191494p, false);
            this.f12221o = typedArrayObtainStyledAttributes.getDimension(x8c0.f191500v, 5.0f);
            this.f12222p = typedArrayObtainStyledAttributes.getColor(x8c0.f191498t, -65536);
            this.f12228v = typedArrayObtainStyledAttributes.getInt(x8c0.f191502x, 0);
            this.f12232z = typedArrayObtainStyledAttributes.getColor(x8c0.f191489k, 0);
            this.f12199A = typedArrayObtainStyledAttributes.getColor(x8c0.f191488j, 0);
            this.f12200B = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191497s, false);
            this.f12223q = typedArrayObtainStyledAttributes.getColor(x8c0.f191499u, -16711936);
            this.f12224r = typedArrayObtainStyledAttributes.getInt(x8c0.f191501w, 0);
            this.f12225s = typedArrayObtainStyledAttributes.getInt(x8c0.f191487i, 360);
            this.f12227u = typedArrayObtainStyledAttributes.getInteger(x8c0.f191496r, 100);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m17711s(Canvas canvas, RectF rectF) {
        this.f12210d.setStyle(Paint.Style.STROKE);
        this.f12210d.setColor(this.f12222p);
        this.f12210d.setAlpha(128);
        canvas.drawOval(rectF, this.f12210d);
        BitmapShader bitmapShader = this.f12230x;
        if (bitmapShader != null) {
            this.f12210d.setShader(bitmapShader);
        }
        this.f12210d.setAlpha(0);
        if (this.f12200B && this.f12232z != 0 && this.f12199A != 0 && this.f12231y == null) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            this.f12231y = new SweepGradient(fCenterX, fCenterY, new int[]{this.f12232z, this.f12199A}, (float[]) null);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, fCenterX, fCenterY);
            this.f12231y.setLocalMatrix(matrix);
        }
        SweepGradient sweepGradient = this.f12231y;
        if (sweepGradient != null) {
            this.f12210d.setShader(sweepGradient);
        }
        this.f12210d.setColor(this.f12223q);
        canvas.drawArc(rectF, this.f12224r, (this.f12226t * (this.f12225s - this.f12224r)) / getMax(), false, this.f12210d);
        this.f12210d.setShader(null);
    }

    /* JADX INFO: renamed from: t */
    private void m17712t() {
        this.f12210d = new Paint(1);
    }

    public synchronized int getMax() {
        return this.f12227u;
    }

    public synchronized int getProgress() {
        return this.f12226t;
    }

    public RectF getRectF() {
        float width = getWidth();
        float height = getHeight();
        float f = this.f12212f;
        float f2 = 0.0f;
        if (f <= -1.0f) {
            f = 0.0f;
        }
        if (this.f12216j) {
            f = (width / 2.0f) - (this.f12214h / 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
        }
        float f3 = (height - width) / 2.0f;
        float f4 = this.f12213g;
        if (f4 > -1.0f) {
            f3 = f4;
        }
        if (this.f12217k) {
            float f5 = (height / 2.0f) - (this.f12215i / 2.0f);
            if (f5 >= 0.0f) {
                f2 = f5;
            }
        } else {
            f2 = f3;
        }
        float f6 = this.f12214h;
        float f7 = f6 > -1.0f ? f6 + f : width;
        float f8 = width + f2;
        float f9 = this.f12215i;
        if (f9 > -1.0f) {
            f8 = f2 + f9;
        }
        this.f12229w.set(f, f2, f7, f8);
        return this.f12229w;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f12211e = null;
        Bitmap bitmap = this.f12209c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m17713j(Animator.AnimatorListener animatorListener) {
        int width = getWidth();
        int height = getHeight();
        float f = this.f12214h;
        float f2 = width * 0.7f;
        if (f == f2 && this.f12215i == height * 0.7f) {
            animatorListener.onAnimationEnd(null);
            return;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("widthAttr", f, f2), PropertyValuesHolder.ofFloat("heightAttr", this.f12215i, height * 0.7f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.addListener(animatorListener);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f12205G = this.f12214h;
        this.f12206H = this.f12215i;
    }

    /* JADX INFO: renamed from: k */
    public void m17714k(Animator.AnimatorListener animatorListener) {
        this.f12207I = true;
        int width = getWidth();
        float height = getHeight() * 0.45f;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("widthAttr", this.f12214h, width * 0.45f);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("heightAttr", this.f12215i, height);
        this.f12205G = this.f12214h;
        this.f12206H = this.f12215i;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.addListener(new C3575b(animatorListener));
        if (animatorListener != null) {
            objectAnimatorOfPropertyValuesHolder.addListener(animatorListener);
        }
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f12205G = this.f12214h;
        this.f12206H = this.f12215i;
    }

    /* JADX INFO: renamed from: l */
    public void m17715l() {
        m17716m(null);
    }

    /* JADX INFO: renamed from: m */
    public void m17716m(Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("widthAttr", this.f12214h, getWidth() * 0.71f), PropertyValuesHolder.ofFloat("heightAttr", this.f12215i, getHeight() * 0.71f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        if (animatorListener != null) {
            objectAnimatorOfPropertyValuesHolder.addListener(animatorListener);
        }
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
        this.f12205G = this.f12214h;
        this.f12206H = this.f12215i;
    }

    /* JADX INFO: renamed from: o */
    public void m17717o(int i) {
        this.f12218l = i;
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
            WeakReference<Bitmap> weakReference = this.f12211e;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    Bitmap bitmap = this.f12209c;
                    if (bitmap == null || bitmap.isRecycled()) {
                        this.f12209c = m17718p();
                    }
                    this.f12210d.reset();
                    this.f12210d.setFilterBitmap(false);
                    this.f12210d.setXfermode(f12198K);
                    canvas2.drawColor(this.f12218l);
                    canvas2.drawBitmap(this.f12209c, 0.0f, 0.0f, this.f12210d);
                    this.f12211e = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f12210d.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12210d);
            }
            this.f12210d.setColor(this.f12222p);
            this.f12210d.setStyle(Paint.Style.STROKE);
            this.f12210d.setStrokeWidth(this.f12221o);
            this.f12210d.setAntiAlias(true);
            this.f12210d.setStrokeCap(Paint.Cap.ROUND);
            this.f12229w.set(getRectF().left - (this.f12221o / 2.0f), getRectF().top - (this.f12221o / 2.0f), getRectF().right + (this.f12221o / 2.0f), getRectF().bottom + (this.f12221o / 2.0f));
            if (this.f12228v == 0) {
                m17711s(canvas, this.f12229w);
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
    public Bitmap m17718p() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        RectF rectF = getRectF();
        RectF rectF2 = this.f12229w;
        float f = rectF.left;
        float f2 = this.f12221o;
        rectF2.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
        canvas.drawOval(this.f12229w, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: r */
    public boolean m17719r() {
        return this.f12207I;
    }

    public void setHeightAttr(float f) {
        this.f12215i = f;
        postInvalidate();
    }

    public synchronized void setProgress(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException("progress not less than 0");
            }
            int i2 = this.f12227u;
            if (i > i2) {
                i = i2;
            }
            if (i <= i2) {
                this.f12226t = i;
                postInvalidate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setWidthAttr(float f) {
        this.f12214h = f;
        postInvalidate();
    }

    public EllipseHoleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m17710q(context, attributeSet);
        m17712t();
    }

    public EllipseHoleView(Context context) {
        this(context, null);
        m17712t();
    }
}
