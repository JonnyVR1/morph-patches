package com.p000p1.mobile.putong.core.newui.view;

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
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShimmerOptLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Xfermode f5779a;

    /* JADX INFO: renamed from: b */
    public Xfermode f5780b;

    /* JADX INFO: renamed from: c */
    public Paint f5781c;

    /* JADX INFO: renamed from: d */
    public float f5782d;

    /* JADX INFO: renamed from: e */
    public Path f5783e;

    /* JADX INFO: renamed from: f */
    public C0420c f5784f;

    /* JADX INFO: renamed from: g */
    public C0419b f5785g;

    /* JADX INFO: renamed from: h */
    public int f5786h;

    /* JADX INFO: renamed from: i */
    public int f5787i;

    /* JADX INFO: renamed from: j */
    public ValueAnimator f5788j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$a */
    public class C0418a implements ValueAnimator.AnimatorUpdateListener {
        public C0418a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerOptLayout.this.f5782d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShimmerOptLayout.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$b */
    public static class C0419b {

        /* JADX INFO: renamed from: a */
        public int[] f5790a;

        /* JADX INFO: renamed from: b */
        public float[] f5791b;

        /* JADX INFO: renamed from: c */
        public float f5792c = 30.0f;

        /* JADX INFO: renamed from: d */
        public long f5793d = 2000;

        /* JADX INFO: renamed from: e */
        public float f5794e = t100.d(100.0f);

        /* JADX INFO: renamed from: f */
        public int f5795f = -1;

        /* JADX INFO: renamed from: g */
        public float f5796g = 0.0f;

        /* JADX INFO: renamed from: h */
        public int f5797h = 0;

        /* JADX INFO: renamed from: i */
        public int f5798i = 0;

        /* JADX INFO: renamed from: j */
        public TimeInterpolator f5799j = new LinearInterpolator();

        public C0419b(@NonNull int[] iArr, @Nullable float[] fArr) {
            this.f5790a = iArr;
            this.f5791b = fArr;
        }

        /* JADX INFO: renamed from: k */
        public boolean m8048k() {
            return this.f5795f != -1;
        }

        /* JADX INFO: renamed from: l */
        public C0419b m8049l(long j) {
            this.f5793d = j;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0419b m8050m(float f) {
            this.f5796g = f;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C0419b m8051n(float f) {
            this.f5792c = f;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C0419b m8052o(int i) {
            this.f5797h = i;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0419b m8053p(int i) {
            this.f5794e = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.ShimmerOptLayout$c */
    public static class C0420c {

        /* JADX INFO: renamed from: a */
        public C0419b f5800a;

        /* JADX INFO: renamed from: b */
        public int f5801b;

        /* JADX INFO: renamed from: c */
        public int f5802c;

        /* JADX INFO: renamed from: d */
        public Context f5803d;

        /* JADX INFO: renamed from: e */
        public Shader f5804e;

        /* JADX INFO: renamed from: g */
        public float f5806g;

        /* JADX INFO: renamed from: h */
        public float f5807h;

        /* JADX INFO: renamed from: i */
        public Paint f5808i;

        /* JADX INFO: renamed from: f */
        public boolean f5805f = false;

        /* JADX INFO: renamed from: j */
        public RectF f5809j = new RectF();

        public C0420c(Context context, C0419b c0419b, int i, int i2, Paint paint) {
            this.f5800a = c0419b;
            this.f5801b = i;
            this.f5802c = i2;
            this.f5803d = context;
            this.f5808i = paint;
            m8055b();
        }

        /* JADX INFO: renamed from: b */
        public final void m8055b() {
            this.f5805f = true;
            if (this.f5800a.m8048k()) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f5803d.getResources(), this.f5800a.f5795f);
                Matrix matrix = new Matrix();
                float height = this.f5802c / bitmapDecodeResource.getHeight();
                matrix.setScale(height, height);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f5804e = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                this.f5806g = -bitmapCreateBitmap.getWidth();
                this.f5807h = this.f5801b;
                this.f5809j.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            } else {
                this.f5804e = new LinearGradient(0.0f, 0.0f, this.f5800a.f5794e, 0.0f, this.f5800a.f5790a, this.f5800a.f5791b, Shader.TileMode.CLAMP);
                float f = this.f5800a.f5792c;
                C0419b c0419b = this.f5800a;
                if (f >= 0.0f) {
                    this.f5806g = -c0419b.f5794e;
                    double d = ((float) (((double) (this.f5800a.f5792c / 180.0f)) * 3.141592653589793d)) * 1.0f;
                    this.f5807h = (float) ((((double) this.f5801b) * Math.cos(d)) + (Math.sin(d) * ((double) this.f5802c)));
                    this.f5809j.set(0.0f, -((float) ((((double) this.f5801b) * Math.sin(d)) + (Math.cos(d) * 0.0d))), this.f5800a.f5794e, (float) ((Math.sin(d) * 0.0d) + (Math.cos(d) * ((double) this.f5802c))));
                } else {
                    this.f5806g = -c0419b.f5794e;
                    double d2 = ((float) (((double) ((-this.f5800a.f5792c) / 180.0f)) * 3.141592653589793d)) * 1.0f;
                    this.f5807h = (float) ((((double) this.f5801b) * Math.cos(d2)) + (Math.sin(d2) * ((double) this.f5802c)));
                    this.f5809j.set(0.0f, -((float) ((Math.sin(d2) * 0.0d) + (Math.cos(d2) * ((double) this.f5802c)))), this.f5800a.f5794e, (float) ((((double) this.f5801b) * Math.sin(d2)) + (Math.cos(d2) * 0.0d)));
                }
            }
            this.f5808i.setShader(this.f5804e);
        }

        /* JADX INFO: renamed from: c */
        public void m8056c(C0419b c0419b, int i, int i2) {
            this.f5800a = c0419b;
            this.f5801b = i;
            this.f5802c = i2;
            m8055b();
        }
    }

    public ShimmerOptLayout(@NonNull Context context) {
        super(context);
        this.f5779a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f5780b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5782d = 0.0f;
        this.f5786h = -1;
        this.f5787i = -1;
        m8035d();
    }

    /* JADX INFO: renamed from: b */
    public void m8033b() {
        ValueAnimator valueAnimator = this.f5788j;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            this.f5782d = 0.0f;
            invalidate();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5788j = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.f5785g.f5793d);
            this.f5788j.addUpdateListener(new C0418a());
            this.f5788j.setInterpolator(this.f5785g.f5799j);
            this.f5788j.setRepeatCount(this.f5785g.f5798i);
            this.f5788j.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8034c() {
        int i;
        int i2 = this.f5786h;
        if (i2 <= 0 || (i = this.f5787i) <= 0) {
            return;
        }
        C0420c c0420c = this.f5784f;
        if (c0420c == null) {
            this.f5784f = new C0420c(getContext(), this.f5785g, this.f5786h, this.f5787i, this.f5781c);
        } else {
            if (c0420c.f5805f) {
                return;
            }
            c0420c.m8056c(this.f5785g, i2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8035d() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f5781c = paint;
        paint.setAntiAlias(true);
        this.f5785g = new C0419b(new int[]{16777215, -1711276033, 16777215}, null);
        this.f5783e = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C0420c c0420c = this.f5784f;
        if (c0420c == null || !c0420c.f5805f) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        if (this.f5785g.f5797h == 1) {
            super.dispatchDraw(canvas);
            this.f5781c.setXfermode(this.f5779a);
        } else {
            this.f5781c.setXfermode(null);
        }
        this.f5781c.setShader(this.f5784f.f5804e);
        if (this.f5785g.m8048k()) {
            int iSave = canvas.save();
            C0420c c0420c2 = this.f5784f;
            float f = c0420c2.f5806g;
            canvas.translate(f + ((c0420c2.f5807h - f) * this.f5782d), 0.0f);
            canvas.drawRect(this.f5784f.f5809j, this.f5781c);
            canvas.restoreToCount(iSave);
        } else {
            int iSave2 = canvas.save();
            if (this.f5785g.f5792c >= 0.0f) {
                canvas.rotate(this.f5785g.f5792c);
                C0420c c0420c3 = this.f5784f;
                float f2 = c0420c3.f5806g;
                canvas.translate(f2 + ((c0420c3.f5807h - f2) * this.f5782d), 0.0f);
                canvas.drawRect(this.f5784f.f5809j, this.f5781c);
            } else {
                canvas.translate(0.0f, this.f5787i);
                canvas.rotate(this.f5785g.f5792c);
                int iSave3 = canvas.save();
                C0420c c0420c4 = this.f5784f;
                float f3 = c0420c4.f5806g;
                canvas.translate(f3 + ((c0420c4.f5807h - f3) * this.f5782d), 0.0f);
                canvas.drawRect(this.f5784f.f5809j, this.f5781c);
                canvas.restoreToCount(iSave3);
            }
            canvas.restoreToCount(iSave2);
        }
        if (this.f5785g.f5796g > 0.0f) {
            this.f5781c.setShader(null);
            this.f5783e.reset();
            this.f5783e.setFillType(Path.FillType.EVEN_ODD);
            Path path = this.f5783e;
            float f4 = this.f5786h + 2;
            float f5 = this.f5787i + 2;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(-2.0f, -2.0f, f4, f5, direction);
            this.f5781c.setXfermode(this.f5780b);
            this.f5783e.addRoundRect(0.0f, 0.0f, this.f5786h, this.f5787i, this.f5785g.f5796g, this.f5785g.f5796g, direction);
            this.f5783e.close();
            canvas.drawPath(this.f5783e, this.f5781c);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: e */
    public final void m8036e() {
        C0420c c0420c = this.f5784f;
        if (c0420c == null || !c0420c.f5805f) {
            return;
        }
        c0420c.f5805f = false;
    }

    /* JADX INFO: renamed from: f */
    public void m8037f() {
        ValueAnimator valueAnimator = this.f5788j;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f5788j.cancel();
        this.f5782d = 0.0f;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8037f();
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
        if (measuredWidth != this.f5786h || measuredHeight != this.f5787i) {
            this.f5786h = measuredWidth;
            this.f5787i = measuredHeight;
            m8036e();
        }
        m8034c();
    }

    public void setShimmerConfig(C0419b c0419b) {
        this.f5785g = c0419b;
        m8036e();
        m8034c();
        invalidate();
    }

    public void setShimmerProgress(float f) {
        this.f5782d = f;
        invalidate();
    }

    public ShimmerOptLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5779a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f5780b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5782d = 0.0f;
        this.f5786h = -1;
        this.f5787i = -1;
        m8035d();
    }

    public ShimmerOptLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5779a = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.f5780b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5782d = 0.0f;
        this.f5786h = -1;
        this.f5787i = -1;
        m8035d();
    }
}
