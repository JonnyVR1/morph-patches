package com.p046p1.mobile.putong.core.newui.view;

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
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class ShimmerOptLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Xfermode f27001a;

    /* JADX INFO: renamed from: b */
    public Xfermode f27002b;

    /* JADX INFO: renamed from: c */
    public Paint f27003c;

    /* JADX INFO: renamed from: d */
    public float f27004d;

    /* JADX INFO: renamed from: e */
    public Path f27005e;

    /* JADX INFO: renamed from: f */
    public C8256c f27006f;

    /* JADX INFO: renamed from: g */
    public C8255b f27007g;

    /* JADX INFO: renamed from: h */
    public int f27008h;

    /* JADX INFO: renamed from: i */
    public int f27009i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f27010j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$a */
    public class C8254a implements ValueAnimator.AnimatorUpdateListener {
        public C8254a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerOptLayout.this.f27004d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShimmerOptLayout.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$b */
    public static class C8255b {

        /* JADX INFO: renamed from: a */
        public int[] f27012a;

        /* JADX INFO: renamed from: b */
        public float[] f27013b;

        /* JADX INFO: renamed from: c */
        public float f27014c = 30.0f;

        /* JADX INFO: renamed from: d */
        public long f27015d = 2000;

        /* JADX INFO: renamed from: e */
        public float f27016e = t100.m186890d(100.0f);

        /* JADX INFO: renamed from: f */
        public int f27017f = -1;

        /* JADX INFO: renamed from: g */
        public float f27018g = 0.0f;

        /* JADX INFO: renamed from: h */
        public int f27019h = 0;

        /* JADX INFO: renamed from: i */
        public int f27020i = 0;

        /* JADX INFO: renamed from: j */
        public TimeInterpolator f27021j = new LinearInterpolator();

        public C8255b(@NonNull int[] iArr, @Nullable float[] fArr) {
            this.f27012a = iArr;
            this.f27013b = fArr;
        }

        /* JADX INFO: renamed from: k */
        public boolean m43784k() {
            return this.f27017f != -1;
        }

        /* JADX INFO: renamed from: l */
        public C8255b m43785l(long j) {
            this.f27015d = j;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C8255b m43786m(float f) {
            this.f27018g = f;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C8255b m43787n(float f) {
            this.f27014c = f;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C8255b m43788o(int i) {
            this.f27019h = i;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C8255b m43789p(int i) {
            this.f27016e = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$c */
    public static class C8256c {

        /* JADX INFO: renamed from: a */
        public C8255b f27022a;

        /* JADX INFO: renamed from: b */
        public int f27023b;

        /* JADX INFO: renamed from: c */
        public int f27024c;

        /* JADX INFO: renamed from: d */
        public Context f27025d;

        /* JADX INFO: renamed from: e */
        public Shader f27026e;

        /* JADX INFO: renamed from: g */
        public float f27028g;

        /* JADX INFO: renamed from: h */
        public float f27029h;

        /* JADX INFO: renamed from: i */
        public Paint f27030i;

        /* JADX INFO: renamed from: f */
        public boolean f27027f = false;

        /* JADX INFO: renamed from: j */
        public RectF f27031j = new RectF();

        public C8256c(Context context, C8255b c8255b, int i, int i2, Paint paint) {
            this.f27022a = c8255b;
            this.f27023b = i;
            this.f27024c = i2;
            this.f27025d = context;
            this.f27030i = paint;
            m43791b();
        }

        /* JADX INFO: renamed from: b */
        public final void m43791b() {
            this.f27027f = true;
            if (this.f27022a.m43784k()) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f27025d.getResources(), this.f27022a.f27017f);
                Matrix matrix = new Matrix();
                float height = this.f27024c / bitmapDecodeResource.getHeight();
                matrix.setScale(height, height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f27026e = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                this.f27028g = -bitmapCreateBitmap.getWidth();
                this.f27029h = this.f27023b;
                this.f27031j.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            } else {
                this.f27026e = new LinearGradient(0.0f, 0.0f, this.f27022a.f27016e, 0.0f, this.f27022a.f27012a, this.f27022a.f27013b, Shader.TileMode.CLAMP);
                float f = this.f27022a.f27014c;
                C8255b c8255b = this.f27022a;
                if (f >= 0.0f) {
                    this.f27028g = -c8255b.f27016e;
                    double d = ((float) (((double) (this.f27022a.f27014c / 180.0f)) * 3.141592653589793d)) * 1.0f;
                    this.f27029h = (float) ((((double) this.f27023b) * Math.cos(d)) + (Math.sin(d) * ((double) this.f27024c)));
                    this.f27031j.set(0.0f, -((float) ((((double) this.f27023b) * Math.sin(d)) + (Math.cos(d) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE))), this.f27022a.f27016e, (float) ((Math.sin(d) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) + (Math.cos(d) * ((double) this.f27024c))));
                } else {
                    this.f27028g = -c8255b.f27016e;
                    double d2 = ((float) (((double) ((-this.f27022a.f27014c) / 180.0f)) * 3.141592653589793d)) * 1.0f;
                    this.f27029h = (float) ((((double) this.f27023b) * Math.cos(d2)) + (Math.sin(d2) * ((double) this.f27024c)));
                    this.f27031j.set(0.0f, -((float) ((Math.sin(d2) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) + (Math.cos(d2) * ((double) this.f27024c)))), this.f27022a.f27016e, (float) ((((double) this.f27023b) * Math.sin(d2)) + (Math.cos(d2) * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
                }
            }
            this.f27030i.setShader(this.f27026e);
        }

        /* JADX INFO: renamed from: c */
        public void m43792c(C8255b c8255b, int i, int i2) {
            this.f27022a = c8255b;
            this.f27023b = i;
            this.f27024c = i2;
            m43791b();
        }
    }

    public ShimmerOptLayout(@NonNull Context context) {
        super(context);
        this.f27001a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f27002b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27004d = 0.0f;
        this.f27008h = -1;
        this.f27009i = -1;
        m43771d();
    }

    /* JADX INFO: renamed from: b */
    public void m43769b() {
        ValueAnimator valueAnimator = this.f27010j;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.f27004d = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f27010j = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.f27007g.f27015d);
            this.f27010j.addUpdateListener(new C8254a());
            this.f27010j.setInterpolator(this.f27007g.f27021j);
            this.f27010j.setRepeatCount(this.f27007g.f27020i);
            this.f27010j.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m43770c() {
        int i;
        int i2 = this.f27008h;
        if (i2 <= 0 || (i = this.f27009i) <= 0) {
            return;
        }
        C8256c c8256c = this.f27006f;
        if (c8256c == null) {
            this.f27006f = new C8256c(getContext(), this.f27007g, this.f27008h, this.f27009i, this.f27003c);
        } else {
            if (c8256c.f27027f) {
                return;
            }
            c8256c.m43792c(this.f27007g, i2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m43771d() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f27003c = paint;
        paint.setAntiAlias(true);
        this.f27007g = new C8255b(new int[]{16777215, -1711276033, 16777215}, null);
        this.f27005e = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C8256c c8256c = this.f27006f;
        if (c8256c == null || !c8256c.f27027f) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        if (this.f27007g.f27019h == 1) {
            super.dispatchDraw(canvas);
            this.f27003c.setXfermode(this.f27001a);
        } else {
            this.f27003c.setXfermode(null);
        }
        this.f27003c.setShader(this.f27006f.f27026e);
        if (this.f27007g.m43784k()) {
            int iSave = canvas.save();
            C8256c c8256c2 = this.f27006f;
            float f = c8256c2.f27028g;
            canvas.translate(f + ((c8256c2.f27029h - f) * this.f27004d), 0.0f);
            canvas.drawRect(this.f27006f.f27031j, this.f27003c);
            canvas.restoreToCount(iSave);
        } else {
            int iSave2 = canvas.save();
            if (this.f27007g.f27014c >= 0.0f) {
                canvas.rotate(this.f27007g.f27014c);
                C8256c c8256c3 = this.f27006f;
                float f2 = c8256c3.f27028g;
                canvas.translate(f2 + ((c8256c3.f27029h - f2) * this.f27004d), 0.0f);
                canvas.drawRect(this.f27006f.f27031j, this.f27003c);
            } else {
                canvas.translate(0.0f, this.f27009i);
                canvas.rotate(this.f27007g.f27014c);
                int iSave3 = canvas.save();
                C8256c c8256c4 = this.f27006f;
                float f3 = c8256c4.f27028g;
                canvas.translate(f3 + ((c8256c4.f27029h - f3) * this.f27004d), 0.0f);
                canvas.drawRect(this.f27006f.f27031j, this.f27003c);
                canvas.restoreToCount(iSave3);
            }
            canvas.restoreToCount(iSave2);
        }
        if (this.f27007g.f27018g > 0.0f) {
            this.f27003c.setShader(null);
            this.f27005e.reset();
            this.f27005e.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f27005e;
            float f4 = this.f27008h + 2;
            float f5 = this.f27009i + 2;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-2.0f, -2.0f, f4, f5, direction);
            this.f27003c.setXfermode(this.f27002b);
            this.f27005e.addRoundRect(0.0f, 0.0f, this.f27008h, this.f27009i, this.f27007g.f27018g, this.f27007g.f27018g, direction);
            this.f27005e.close();
            canvas.drawPath(this.f27005e, this.f27003c);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: e */
    public final void m43772e() {
        C8256c c8256c = this.f27006f;
        if (c8256c == null || !c8256c.f27027f) {
            return;
        }
        c8256c.f27027f = false;
    }

    /* JADX INFO: renamed from: f */
    public void m43773f() {
        ValueAnimator valueAnimator = this.f27010j;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f27010j.cancel();
        this.f27004d = 0.0f;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m43773f();
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
        if (measuredWidth != this.f27008h || measuredHeight != this.f27009i) {
            this.f27008h = measuredWidth;
            this.f27009i = measuredHeight;
            m43772e();
        }
        m43770c();
    }

    public void setShimmerConfig(C8255b c8255b) {
        this.f27007g = c8255b;
        m43772e();
        m43770c();
        invalidate();
    }

    public void setShimmerProgress(float f) {
        this.f27004d = f;
        invalidate();
    }

    public ShimmerOptLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27001a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f27002b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27004d = 0.0f;
        this.f27008h = -1;
        this.f27009i = -1;
        m43771d();
    }

    public ShimmerOptLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27001a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f27002b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27004d = 0.0f;
        this.f27008h = -1;
        this.f27009i = -1;
        m43771d();
    }
}
