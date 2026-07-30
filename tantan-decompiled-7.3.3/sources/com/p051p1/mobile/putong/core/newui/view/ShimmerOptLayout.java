package com.p051p1.mobile.putong.core.newui.view;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ShimmerOptLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Xfermode f27849a;

    /* JADX INFO: renamed from: b */
    public Xfermode f27850b;

    /* JADX INFO: renamed from: c */
    public Paint f27851c;

    /* JADX INFO: renamed from: d */
    public float f27852d;

    /* JADX INFO: renamed from: e */
    public Path f27853e;

    /* JADX INFO: renamed from: f */
    public C8419c f27854f;

    /* JADX INFO: renamed from: g */
    public C8418b f27855g;

    /* JADX INFO: renamed from: h */
    public int f27856h;

    /* JADX INFO: renamed from: i */
    public int f27857i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f27858j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$a */
    public class C8417a implements ValueAnimator.AnimatorUpdateListener {
        public C8417a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerOptLayout.this.f27852d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShimmerOptLayout.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$b */
    public static class C8418b {

        /* JADX INFO: renamed from: a */
        public int[] f27860a;

        /* JADX INFO: renamed from: b */
        public float[] f27861b;

        /* JADX INFO: renamed from: c */
        public float f27862c = 30.0f;

        /* JADX INFO: renamed from: d */
        public long f27863d = 2000;

        /* JADX INFO: renamed from: e */
        public float f27864e = qa00.m175859d(100.0f);

        /* JADX INFO: renamed from: f */
        public int f27865f = -1;

        /* JADX INFO: renamed from: g */
        public float f27866g = 0.0f;

        /* JADX INFO: renamed from: h */
        public int f27867h = 0;

        /* JADX INFO: renamed from: i */
        public int f27868i = 0;

        /* JADX INFO: renamed from: j */
        public TimeInterpolator f27869j = new LinearInterpolator();

        public C8418b(@NonNull int[] iArr, @Nullable float[] fArr) {
            this.f27860a = iArr;
            this.f27861b = fArr;
        }

        /* JADX INFO: renamed from: k */
        public boolean m44970k() {
            return this.f27865f != -1;
        }

        /* JADX INFO: renamed from: l */
        public C8418b m44971l(long j) {
            this.f27863d = j;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C8418b m44972m(float f) {
            this.f27866g = f;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C8418b m44973n(float f) {
            this.f27862c = f;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C8418b m44974o(int i) {
            this.f27867h = i;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C8418b m44975p(int i) {
            this.f27864e = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$c */
    public static class C8419c {

        /* JADX INFO: renamed from: a */
        public C8418b f27870a;

        /* JADX INFO: renamed from: b */
        public int f27871b;

        /* JADX INFO: renamed from: c */
        public int f27872c;

        /* JADX INFO: renamed from: d */
        public Context f27873d;

        /* JADX INFO: renamed from: e */
        public Shader f27874e;

        /* JADX INFO: renamed from: g */
        public float f27876g;

        /* JADX INFO: renamed from: h */
        public float f27877h;

        /* JADX INFO: renamed from: i */
        public Paint f27878i;

        /* JADX INFO: renamed from: f */
        public boolean f27875f = false;

        /* JADX INFO: renamed from: j */
        public RectF f27879j = new RectF();

        public C8419c(Context context, C8418b c8418b, int i, int i2, Paint paint) {
            this.f27870a = c8418b;
            this.f27871b = i;
            this.f27872c = i2;
            this.f27873d = context;
            this.f27878i = paint;
            m44977b();
        }

        /* JADX INFO: renamed from: b */
        public final void m44977b() {
            this.f27875f = true;
            if (this.f27870a.m44970k()) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f27873d.getResources(), this.f27870a.f27865f);
                Matrix matrix = new Matrix();
                float height = this.f27872c / bitmapDecodeResource.getHeight();
                matrix.setScale(height, height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f27874e = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                this.f27876g = -bitmapCreateBitmap.getWidth();
                this.f27877h = this.f27871b;
                this.f27879j.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            } else {
                this.f27874e = new LinearGradient(0.0f, 0.0f, this.f27870a.f27864e, 0.0f, this.f27870a.f27860a, this.f27870a.f27861b, Shader.TileMode.CLAMP);
                float f = this.f27870a.f27862c;
                C8418b c8418b = this.f27870a;
                if (f >= 0.0f) {
                    this.f27876g = -c8418b.f27864e;
                    double d = ((float) (((double) (this.f27870a.f27862c / 180.0f)) * 3.141592653589793d)) * 1.0f;
                    this.f27877h = (float) ((((double) this.f27871b) * Math.cos(d)) + (Math.sin(d) * ((double) this.f27872c)));
                    this.f27879j.set(0.0f, -((float) ((((double) this.f27871b) * Math.sin(d)) + (Math.cos(d) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE))), this.f27870a.f27864e, (float) ((Math.sin(d) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) + (Math.cos(d) * ((double) this.f27872c))));
                } else {
                    this.f27876g = -c8418b.f27864e;
                    double d2 = ((float) (((double) ((-this.f27870a.f27862c) / 180.0f)) * 3.141592653589793d)) * 1.0f;
                    this.f27877h = (float) ((((double) this.f27871b) * Math.cos(d2)) + (Math.sin(d2) * ((double) this.f27872c)));
                    this.f27879j.set(0.0f, -((float) ((Math.sin(d2) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) + (Math.cos(d2) * ((double) this.f27872c)))), this.f27870a.f27864e, (float) ((((double) this.f27871b) * Math.sin(d2)) + (Math.cos(d2) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
                }
            }
            this.f27878i.setShader(this.f27874e);
        }

        /* JADX INFO: renamed from: c */
        public void m44978c(C8418b c8418b, int i, int i2) {
            this.f27870a = c8418b;
            this.f27871b = i;
            this.f27872c = i2;
            m44977b();
        }
    }

    public ShimmerOptLayout(@NonNull Context context) {
        super(context);
        this.f27849a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f27850b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27852d = 0.0f;
        this.f27856h = -1;
        this.f27857i = -1;
        m44957d();
    }

    /* JADX INFO: renamed from: b */
    public void m44955b() {
        ValueAnimator valueAnimator = this.f27858j;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.f27852d = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f27858j = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.f27855g.f27863d);
            this.f27858j.addUpdateListener(new C8417a());
            this.f27858j.setInterpolator(this.f27855g.f27869j);
            this.f27858j.setRepeatCount(this.f27855g.f27868i);
            this.f27858j.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44956c() {
        int i;
        int i2 = this.f27856h;
        if (i2 <= 0 || (i = this.f27857i) <= 0) {
            return;
        }
        C8419c c8419c = this.f27854f;
        if (c8419c == null) {
            this.f27854f = new C8419c(getContext(), this.f27855g, this.f27856h, this.f27857i, this.f27851c);
        } else {
            if (c8419c.f27875f) {
                return;
            }
            c8419c.m44978c(this.f27855g, i2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m44957d() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f27851c = paint;
        paint.setAntiAlias(true);
        this.f27855g = new C8418b(new int[]{16777215, -1711276033, 16777215}, null);
        this.f27853e = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C8419c c8419c = this.f27854f;
        if (c8419c == null || !c8419c.f27875f) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        if (this.f27855g.f27867h == 1) {
            super.dispatchDraw(canvas);
            this.f27851c.setXfermode(this.f27849a);
        } else {
            this.f27851c.setXfermode(null);
        }
        this.f27851c.setShader(this.f27854f.f27874e);
        if (this.f27855g.m44970k()) {
            int iSave = canvas.save();
            C8419c c8419c2 = this.f27854f;
            float f = c8419c2.f27876g;
            canvas.translate(f + ((c8419c2.f27877h - f) * this.f27852d), 0.0f);
            canvas.drawRect(this.f27854f.f27879j, this.f27851c);
            canvas.restoreToCount(iSave);
        } else {
            int iSave2 = canvas.save();
            if (this.f27855g.f27862c >= 0.0f) {
                canvas.rotate(this.f27855g.f27862c);
                C8419c c8419c3 = this.f27854f;
                float f2 = c8419c3.f27876g;
                canvas.translate(f2 + ((c8419c3.f27877h - f2) * this.f27852d), 0.0f);
                canvas.drawRect(this.f27854f.f27879j, this.f27851c);
            } else {
                canvas.translate(0.0f, this.f27857i);
                canvas.rotate(this.f27855g.f27862c);
                int iSave3 = canvas.save();
                C8419c c8419c4 = this.f27854f;
                float f3 = c8419c4.f27876g;
                canvas.translate(f3 + ((c8419c4.f27877h - f3) * this.f27852d), 0.0f);
                canvas.drawRect(this.f27854f.f27879j, this.f27851c);
                canvas.restoreToCount(iSave3);
            }
            canvas.restoreToCount(iSave2);
        }
        if (this.f27855g.f27866g > 0.0f) {
            this.f27851c.setShader(null);
            this.f27853e.reset();
            this.f27853e.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f27853e;
            float f4 = this.f27856h + 2;
            float f5 = this.f27857i + 2;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-2.0f, -2.0f, f4, f5, direction);
            this.f27851c.setXfermode(this.f27850b);
            this.f27853e.addRoundRect(0.0f, 0.0f, this.f27856h, this.f27857i, this.f27855g.f27866g, this.f27855g.f27866g, direction);
            this.f27853e.close();
            canvas.drawPath(this.f27853e, this.f27851c);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: e */
    public final void m44958e() {
        C8419c c8419c = this.f27854f;
        if (c8419c == null || !c8419c.f27875f) {
            return;
        }
        c8419c.f27875f = false;
    }

    /* JADX INFO: renamed from: f */
    public void m44959f() {
        ValueAnimator valueAnimator = this.f27858j;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f27858j.cancel();
        this.f27852d = 0.0f;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m44959f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth != this.f27856h || measuredHeight != this.f27857i) {
            this.f27856h = measuredWidth;
            this.f27857i = measuredHeight;
            m44958e();
        }
        m44956c();
    }

    public void setShimmerConfig(C8418b c8418b) {
        this.f27855g = c8418b;
        m44958e();
        m44956c();
        invalidate();
    }

    public void setShimmerProgress(float f) {
        this.f27852d = f;
        invalidate();
    }

    public ShimmerOptLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27849a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f27850b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27852d = 0.0f;
        this.f27856h = -1;
        this.f27857i = -1;
        m44957d();
    }

    public ShimmerOptLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27849a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f27850b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27852d = 0.0f;
        this.f27856h = -1;
        this.f27857i = -1;
        m44957d();
    }
}
