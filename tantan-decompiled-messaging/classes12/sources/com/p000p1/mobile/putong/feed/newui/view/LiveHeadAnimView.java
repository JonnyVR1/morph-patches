package com.p000p1.mobile.putong.feed.newui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.R$string;
import l.fje;
import l.jb80;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveHeadAnimView extends View {

    /* JADX INFO: renamed from: f */
    public static final float f4912f = t100.o;

    /* JADX INFO: renamed from: g */
    public static final float f4913g = t100.d(52.0f);

    /* JADX INFO: renamed from: a */
    public C2230b f4914a;

    /* JADX INFO: renamed from: b */
    public C2229a f4915b;

    /* JADX INFO: renamed from: c */
    public C2231c f4916c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f4917d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f4918e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$a */
    public class C2229a {

        /* JADX INFO: renamed from: a */
        public float f4919a;

        public C2229a() {
            this.f4919a = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m7558a(float f) {
            this.f4919a = f;
        }

        /* JADX INFO: renamed from: b */
        public void m7559b(Canvas canvas) {
            RectF rectFM7573j = LiveHeadAnimView.this.f4916c.m7573j();
            rectFM7573j.set(0.0f, 0.0f, LiveHeadAnimView.f4913g, LiveHeadAnimView.f4913g);
            Paint paintM7569f = LiveHeadAnimView.this.f4916c.m7569f();
            Paint paintM7569f2 = LiveHeadAnimView.this.f4916c.m7569f();
            paintM7569f2.setAntiAlias(true);
            paintM7569f.setAntiAlias(true);
            Path pathM7571h = LiveHeadAnimView.this.f4916c.m7571h();
            canvas.save();
            canvas.translate(LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1);
            pathM7571h.addCircle(0.0f, 0.0f, (LiveHeadAnimView.f4913g / 2.0f) - t100.c, Path.Direction.CW);
            canvas.clipPath(pathM7571h, Region.Op.DIFFERENCE);
            if (LiveHeadAnimView.this.f4918e == null) {
                LiveHeadAnimView.this.f4918e = new LinearGradient(0.0f, (-LiveHeadAnimView.this.getMeasuredHeight()) >> 1, 0.0f, LiveHeadAnimView.this.getMeasuredHeight() >> 1, new int[]{-48311, -99265}, new float[]{0.0f, 1.0f}, Shader.TileMode.MIRROR);
            }
            paintM7569f2.setShader(LiveHeadAnimView.this.f4918e);
            Paint.Style style = Paint.Style.FILL;
            paintM7569f2.setStyle(style);
            paintM7569f2.setAlpha((int) ((1.0f - this.f4919a) * 204.0f));
            canvas.drawCircle(0.0f, 0.0f, (LiveHeadAnimView.f4913g / 2.0f) + (t100.g * this.f4919a), paintM7569f2);
            paintM7569f.setShader(LiveHeadAnimView.this.f4918e);
            paintM7569f.setStyle(style);
            canvas.drawCircle(0.0f, 0.0f, LiveHeadAnimView.f4913g / 2.0f, paintM7569f);
            canvas.restore();
            LiveHeadAnimView.this.f4916c.m7572i(rectFM7573j);
            LiveHeadAnimView.this.f4916c.m7568e(paintM7569f);
            LiveHeadAnimView.this.f4916c.m7568e(paintM7569f2);
            LiveHeadAnimView.this.f4916c.m7570g(pathM7571h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$b */
    public class C2230b {

        /* JADX INFO: renamed from: a */
        public Matrix f4921a;

        /* JADX INFO: renamed from: b */
        public Matrix f4922b = new Matrix();

        /* JADX INFO: renamed from: c */
        public final Bitmap f4923c;

        /* JADX INFO: renamed from: d */
        public float f4924d;

        public C2230b(Bitmap bitmap) {
            this.f4923c = bitmap;
        }

        /* JADX INFO: renamed from: a */
        public void m7560a(float f) {
            if (f <= 0.7f) {
                this.f4924d = 1.0f - ((f / 0.7f) * 0.17f);
            } else {
                this.f4924d = (((f - 0.7f) * 0.17f) / 0.3f) + 0.83f;
            }
            this.f4922b.reset();
            Matrix matrix = this.f4922b;
            float f2 = this.f4924d;
            matrix.postScale(f2, f2, LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1);
        }

        /* JADX INFO: renamed from: b */
        public void m7561b(Canvas canvas) {
            if (LiveHeadAnimView.this.getMeasuredHeight() == 0 || LiveHeadAnimView.this.getMeasuredWidth() == 0) {
                return;
            }
            Paint paintM7569f = LiveHeadAnimView.this.f4916c.m7569f();
            Path pathM7571h = LiveHeadAnimView.this.f4916c.m7571h();
            canvas.save();
            Matrix matrixM7562c = m7562c(LiveHeadAnimView.this.f4916c.m7566c());
            paintM7569f.setAntiAlias(true);
            pathM7571h.addCircle(LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1, (LiveHeadAnimView.f4913g / 2.0f) * this.f4924d, Path.Direction.CW);
            canvas.clipPath(pathM7571h);
            canvas.drawBitmap(this.f4923c, matrixM7562c, paintM7569f);
            canvas.restore();
            LiveHeadAnimView.this.f4916c.m7565b(matrixM7562c);
            LiveHeadAnimView.this.f4916c.m7570g(pathM7571h);
            LiveHeadAnimView.this.f4916c.m7568e(paintM7569f);
        }

        /* JADX INFO: renamed from: c */
        public final Matrix m7562c(Matrix matrix) {
            m7563d();
            matrix.set(this.f4921a);
            matrix.postConcat(this.f4922b);
            return matrix;
        }

        /* JADX INFO: renamed from: d */
        public final void m7563d() {
            if (this.f4921a == null) {
                this.f4921a = new Matrix();
                RectF rectFM7573j = LiveHeadAnimView.this.f4916c.m7573j();
                RectF rectFM7573j2 = LiveHeadAnimView.this.f4916c.m7573j();
                rectFM7573j.set(0.0f, 0.0f, this.f4923c.getWidth(), this.f4923c.getHeight());
                boolean z = this.f4923c.getWidth() >= this.f4923c.getHeight();
                float width = (this.f4923c.getWidth() + 0.0f) / (this.f4923c.getHeight() + 0.0f);
                float f = LiveHeadAnimView.f4913g;
                if (z) {
                    f *= width;
                }
                float f2 = z ? LiveHeadAnimView.f4913g : LiveHeadAnimView.f4913g / width;
                float measuredWidth = (LiveHeadAnimView.this.getMeasuredWidth() - f) / 2.0f;
                float measuredHeight = (LiveHeadAnimView.this.getMeasuredHeight() - f2) / 2.0f;
                rectFM7573j2.set(measuredWidth, measuredHeight, f + measuredWidth, f2 + measuredHeight);
                this.f4921a.setRectToRect(rectFM7573j, rectFM7573j2, Matrix.ScaleToFit.CENTER);
                LiveHeadAnimView.this.f4916c.m7572i(rectFM7573j);
                LiveHeadAnimView.this.f4916c.m7572i(rectFM7573j2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$c */
    public class C2231c {

        /* JADX INFO: renamed from: a */
        public jb80<RectF> f4926a;

        /* JADX INFO: renamed from: b */
        public jb80<Matrix> f4927b;

        /* JADX INFO: renamed from: c */
        public jb80<Path> f4928c;

        /* JADX INFO: renamed from: d */
        public jb80<Paint> f4929d;

        public C2231c() {
            this.f4926a = new jb80<>(4);
            this.f4927b = new jb80<>(1);
            this.f4928c = new jb80<>(2);
            this.f4929d = new jb80<>(5);
        }

        /* JADX INFO: renamed from: a */
        public Rect m7564a(Bitmap bitmap) {
            int i;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i2 = 0;
            if (width > height) {
                int i3 = (width - height) / 2;
                i2 = i3;
                width = i3 + height;
                i = 0;
            } else if (height > width) {
                int i4 = (height - width) / 2;
                i = i4;
                height = i4 + width;
            } else {
                i = 0;
            }
            return new Rect(i2, i, width, height);
        }

        /* JADX INFO: renamed from: b */
        public void m7565b(Matrix matrix) {
            matrix.reset();
            this.f4927b.release(matrix);
        }

        /* JADX INFO: renamed from: c */
        public Matrix m7566c() {
            Matrix matrix = (Matrix) this.f4927b.acquire();
            return matrix == null ? new Matrix() : matrix;
        }

        /* JADX INFO: renamed from: d */
        public int m7567d(Paint paint) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i = fontMetricsInt.top;
            return ((~i) - ((~i) - (~fontMetricsInt.ascent))) - (fontMetricsInt.bottom - fontMetricsInt.descent);
        }

        /* JADX INFO: renamed from: e */
        public void m7568e(Paint paint) {
            paint.reset();
            this.f4929d.release(paint);
        }

        /* JADX INFO: renamed from: f */
        public Paint m7569f() {
            Paint paint = (Paint) this.f4929d.acquire();
            return paint == null ? new Paint() : paint;
        }

        /* JADX INFO: renamed from: g */
        public void m7570g(Path path) {
            path.reset();
            this.f4928c.release(path);
        }

        /* JADX INFO: renamed from: h */
        public Path m7571h() {
            Path path = (Path) this.f4928c.acquire();
            return path == null ? new Path() : path;
        }

        /* JADX INFO: renamed from: i */
        public void m7572i(RectF rectF) {
            rectF.setEmpty();
            this.f4926a.release(rectF);
        }

        /* JADX INFO: renamed from: j */
        public RectF m7573j() {
            RectF rectF = (RectF) this.f4926a.acquire();
            return rectF == null ? new RectF() : rectF;
        }
    }

    public LiveHeadAnimView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7554h();
    }

    /* JADX INFO: renamed from: f */
    public void m7552f() {
        ValueAnimator valueAnimator = this.f4917d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: g */
    public final Bitmap m7553g(Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        Rect rectM7564a = this.f4916c.m7564a(bitmap);
        Paint paintM7569f = this.f4916c.m7569f();
        Paint paintM7569f2 = this.f4916c.m7569f();
        int width = bitmap.getWidth();
        Canvas canvas = new Canvas(bitmap);
        canvas.save();
        canvas.translate(0.0f, rectM7564a.top);
        paintM7569f.setAntiAlias(true);
        RectF rectFM7573j = this.f4916c.m7573j();
        float fWidth = rectM7564a.width() / (f4913g + 0.0f);
        rectFM7573j.set(0.0f, 0.0f, width, f4912f * fWidth);
        paintM7569f.setShader(new LinearGradient(0.0f, rectFM7573j.top, 0.0f, rectFM7573j.bottom, new int[]{-48311, -1275113401, 16677951}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR));
        canvas.drawRect(rectFM7573j, paintM7569f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(t100.f(10) * fWidth);
        paint.setColor(-1);
        float f = (t100.d * fWidth) / 2.0f;
        canvas.translate(t100.d(18.0f) * fWidth, rectFM7573j.height() - (t100.d(7.0f) * fWidth));
        canvas.drawText(getContext().getString(R$string.f455W0), 0.0f, 0.0f, paint);
        canvas.translate((-t100.e) * fWidth, (-this.f4916c.m7567d(paint)) >> 1);
        paintM7569f2.setAntiAlias(true);
        paintM7569f2.setColor(-1);
        paintM7569f2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, f, paintM7569f2);
        canvas.restore();
        this.f4916c.m7572i(rectFM7573j);
        this.f4916c.m7568e(paintM7569f);
        this.f4916c.m7568e(paintM7569f2);
        return bitmap;
    }

    /* JADX INFO: renamed from: h */
    public final void m7554h() {
        this.f4916c = new C2231c();
        this.f4915b = new C2229a();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7555i(ValueAnimator valueAnimator) {
        this.f4914a.m7560a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f4915b.m7558a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m7556j(Bitmap bitmap) {
        this.f4914a = new C2230b(m7553g(bitmap));
        m7557k();
    }

    /* JADX INFO: renamed from: k */
    public final void m7557k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4917d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.f4917d.setInterpolator(new fje(0.3f, 0.0f, 0.6f, 1.0f));
        this.f4917d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gss
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8510a.m7555i(valueAnimator);
            }
        });
        this.f4917d.setRepeatCount(-1);
        this.f4917d.setRepeatMode(1);
        this.f4917d.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4917d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C2230b c2230b = this.f4914a;
        if (c2230b == null) {
            return;
        }
        c2230b.m7561b(canvas);
        this.f4915b.m7559b(canvas);
    }

    public LiveHeadAnimView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveHeadAnimView(Context context) {
        this(context, null);
    }
}
