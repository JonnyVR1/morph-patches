package com.p051p1.mobile.putong.feed.newui.view;

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
import com.p051p1.mobile.putong.feed.R$string;
import p153l.jke;
import p153l.pj80;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class LiveHeadAnimView extends View {

    /* JADX INFO: renamed from: f */
    public static final float f44299f = qa00.f156328o;

    /* JADX INFO: renamed from: g */
    public static final float f44300g = qa00.m175859d(52.0f);

    /* JADX INFO: renamed from: a */
    public C11549b f44301a;

    /* JADX INFO: renamed from: b */
    public C11548a f44302b;

    /* JADX INFO: renamed from: c */
    public C11550c f44303c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f44304d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f44305e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$a */
    public class C11548a {

        /* JADX INFO: renamed from: a */
        public float f44306a;

        public C11548a() {
            this.f44306a = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m67576a(float f) {
            this.f44306a = f;
        }

        /* JADX INFO: renamed from: b */
        public void m67577b(Canvas canvas) {
            RectF rectFM67591j = LiveHeadAnimView.this.f44303c.m67591j();
            rectFM67591j.set(0.0f, 0.0f, LiveHeadAnimView.f44300g, LiveHeadAnimView.f44300g);
            Paint paintM67587f = LiveHeadAnimView.this.f44303c.m67587f();
            Paint paintM67587f2 = LiveHeadAnimView.this.f44303c.m67587f();
            paintM67587f2.setAntiAlias(true);
            paintM67587f.setAntiAlias(true);
            Path pathM67589h = LiveHeadAnimView.this.f44303c.m67589h();
            canvas.save();
            canvas.translate(LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1);
            pathM67589h.addCircle(0.0f, 0.0f, (LiveHeadAnimView.f44300g / 2.0f) - qa00.f156316c, Path.Direction.CW);
            canvas.clipPath(pathM67589h, Region.Op.DIFFERENCE);
            if (LiveHeadAnimView.this.f44305e == null) {
                LiveHeadAnimView.this.f44305e = new LinearGradient(0.0f, (-LiveHeadAnimView.this.getMeasuredHeight()) >> 1, 0.0f, LiveHeadAnimView.this.getMeasuredHeight() >> 1, new int[]{-48311, -99265}, new float[]{0.0f, 1.0f}, Shader.TileMode.MIRROR);
            }
            paintM67587f2.setShader(LiveHeadAnimView.this.f44305e);
            Paint.Style style = Paint.Style.FILL;
            paintM67587f2.setStyle(style);
            paintM67587f2.setAlpha((int) ((1.0f - this.f44306a) * 204.0f));
            canvas.drawCircle(0.0f, 0.0f, (LiveHeadAnimView.f44300g / 2.0f) + (qa00.f156320g * this.f44306a), paintM67587f2);
            paintM67587f.setShader(LiveHeadAnimView.this.f44305e);
            paintM67587f.setStyle(style);
            canvas.drawCircle(0.0f, 0.0f, LiveHeadAnimView.f44300g / 2.0f, paintM67587f);
            canvas.restore();
            LiveHeadAnimView.this.f44303c.m67590i(rectFM67591j);
            LiveHeadAnimView.this.f44303c.m67586e(paintM67587f);
            LiveHeadAnimView.this.f44303c.m67586e(paintM67587f2);
            LiveHeadAnimView.this.f44303c.m67588g(pathM67589h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$b */
    public class C11549b {

        /* JADX INFO: renamed from: a */
        public Matrix f44308a;

        /* JADX INFO: renamed from: b */
        public Matrix f44309b = new Matrix();

        /* JADX INFO: renamed from: c */
        public final Bitmap f44310c;

        /* JADX INFO: renamed from: d */
        public float f44311d;

        public C11549b(Bitmap bitmap) {
            this.f44310c = bitmap;
        }

        /* JADX INFO: renamed from: a */
        public void m67578a(float f) {
            if (f <= 0.7f) {
                this.f44311d = 1.0f - ((f / 0.7f) * 0.17f);
            } else {
                this.f44311d = (((f - 0.7f) * 0.17f) / 0.3f) + 0.83f;
            }
            this.f44309b.reset();
            Matrix matrix = this.f44309b;
            float f2 = this.f44311d;
            matrix.postScale(f2, f2, LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1);
        }

        /* JADX INFO: renamed from: b */
        public void m67579b(Canvas canvas) {
            if (LiveHeadAnimView.this.getMeasuredHeight() == 0 || LiveHeadAnimView.this.getMeasuredWidth() == 0) {
                return;
            }
            Paint paintM67587f = LiveHeadAnimView.this.f44303c.m67587f();
            Path pathM67589h = LiveHeadAnimView.this.f44303c.m67589h();
            canvas.save();
            Matrix matrixM67580c = m67580c(LiveHeadAnimView.this.f44303c.m67584c());
            paintM67587f.setAntiAlias(true);
            pathM67589h.addCircle(LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1, (LiveHeadAnimView.f44300g / 2.0f) * this.f44311d, Path.Direction.CW);
            canvas.clipPath(pathM67589h);
            canvas.drawBitmap(this.f44310c, matrixM67580c, paintM67587f);
            canvas.restore();
            LiveHeadAnimView.this.f44303c.m67583b(matrixM67580c);
            LiveHeadAnimView.this.f44303c.m67588g(pathM67589h);
            LiveHeadAnimView.this.f44303c.m67586e(paintM67587f);
        }

        /* JADX INFO: renamed from: c */
        public final Matrix m67580c(Matrix matrix) {
            m67581d();
            matrix.set(this.f44308a);
            matrix.postConcat(this.f44309b);
            return matrix;
        }

        /* JADX INFO: renamed from: d */
        public final void m67581d() {
            if (this.f44308a == null) {
                this.f44308a = new Matrix();
                RectF rectFM67591j = LiveHeadAnimView.this.f44303c.m67591j();
                RectF rectFM67591j2 = LiveHeadAnimView.this.f44303c.m67591j();
                rectFM67591j.set(0.0f, 0.0f, this.f44310c.getWidth(), this.f44310c.getHeight());
                boolean z = this.f44310c.getWidth() >= this.f44310c.getHeight();
                float width = (this.f44310c.getWidth() + 0.0f) / (this.f44310c.getHeight() + 0.0f);
                float f = LiveHeadAnimView.f44300g;
                if (z) {
                    f *= width;
                }
                float f2 = z ? LiveHeadAnimView.f44300g : LiveHeadAnimView.f44300g / width;
                float measuredWidth = (LiveHeadAnimView.this.getMeasuredWidth() - f) / 2.0f;
                float measuredHeight = (LiveHeadAnimView.this.getMeasuredHeight() - f2) / 2.0f;
                rectFM67591j2.set(measuredWidth, measuredHeight, f + measuredWidth, f2 + measuredHeight);
                this.f44308a.setRectToRect(rectFM67591j, rectFM67591j2, Matrix.ScaleToFit.CENTER);
                LiveHeadAnimView.this.f44303c.m67590i(rectFM67591j);
                LiveHeadAnimView.this.f44303c.m67590i(rectFM67591j2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$c */
    public class C11550c {

        /* JADX INFO: renamed from: a */
        public pj80<RectF> f44313a;

        /* JADX INFO: renamed from: b */
        public pj80<Matrix> f44314b;

        /* JADX INFO: renamed from: c */
        public pj80<Path> f44315c;

        /* JADX INFO: renamed from: d */
        public pj80<Paint> f44316d;

        public C11550c() {
            this.f44313a = new pj80<>(4);
            this.f44314b = new pj80<>(1);
            this.f44315c = new pj80<>(2);
            this.f44316d = new pj80<>(5);
        }

        /* JADX INFO: renamed from: a */
        public Rect m67582a(Bitmap bitmap) {
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
        public void m67583b(Matrix matrix) {
            matrix.reset();
            this.f44314b.release(matrix);
        }

        /* JADX INFO: renamed from: c */
        public Matrix m67584c() {
            Matrix matrixAcquire = this.f44314b.acquire();
            return matrixAcquire == null ? new Matrix() : matrixAcquire;
        }

        /* JADX INFO: renamed from: d */
        public int m67585d(Paint paint) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i = fontMetricsInt.top;
            return ((~i) - ((~i) - (~fontMetricsInt.ascent))) - (fontMetricsInt.bottom - fontMetricsInt.descent);
        }

        /* JADX INFO: renamed from: e */
        public void m67586e(Paint paint) {
            paint.reset();
            this.f44316d.release(paint);
        }

        /* JADX INFO: renamed from: f */
        public Paint m67587f() {
            Paint paintAcquire = this.f44316d.acquire();
            return paintAcquire == null ? new Paint() : paintAcquire;
        }

        /* JADX INFO: renamed from: g */
        public void m67588g(Path path) {
            path.reset();
            this.f44315c.release(path);
        }

        /* JADX INFO: renamed from: h */
        public Path m67589h() {
            Path pathAcquire = this.f44315c.acquire();
            return pathAcquire == null ? new Path() : pathAcquire;
        }

        /* JADX INFO: renamed from: i */
        public void m67590i(RectF rectF) {
            rectF.setEmpty();
            this.f44313a.release(rectF);
        }

        /* JADX INFO: renamed from: j */
        public RectF m67591j() {
            RectF rectFAcquire = this.f44313a.acquire();
            return rectFAcquire == null ? new RectF() : rectFAcquire;
        }
    }

    public LiveHeadAnimView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67572h();
    }

    /* JADX INFO: renamed from: f */
    public void m67570f() {
        ValueAnimator valueAnimator = this.f44304d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: g */
    public final Bitmap m67571g(Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        Rect rectM67582a = this.f44303c.m67582a(bitmap);
        Paint paintM67587f = this.f44303c.m67587f();
        Paint paintM67587f2 = this.f44303c.m67587f();
        int width = bitmap.getWidth();
        Canvas canvas = new Canvas(bitmap);
        canvas.save();
        canvas.translate(0.0f, rectM67582a.top);
        paintM67587f.setAntiAlias(true);
        RectF rectFM67591j = this.f44303c.m67591j();
        float fWidth = rectM67582a.width() / (f44300g + 0.0f);
        rectFM67591j.set(0.0f, 0.0f, width, f44299f * fWidth);
        paintM67587f.setShader(new LinearGradient(0.0f, rectFM67591j.top, 0.0f, rectFM67591j.bottom, new int[]{-48311, -1275113401, 16677951}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR));
        canvas.drawRect(rectFM67591j, paintM67587f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(qa00.m175861f(10) * fWidth);
        paint.setColor(-1);
        float f = (qa00.f156317d * fWidth) / 2.0f;
        canvas.translate(qa00.m175859d(18.0f) * fWidth, rectFM67591j.height() - (qa00.m175859d(7.0f) * fWidth));
        canvas.drawText(getContext().getString(R$string.f39842W0), 0.0f, 0.0f, paint);
        canvas.translate((-qa00.f156318e) * fWidth, (-this.f44303c.m67585d(paint)) >> 1);
        paintM67587f2.setAntiAlias(true);
        paintM67587f2.setColor(-1);
        paintM67587f2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, f, paintM67587f2);
        canvas.restore();
        this.f44303c.m67590i(rectFM67591j);
        this.f44303c.m67586e(paintM67587f);
        this.f44303c.m67586e(paintM67587f2);
        return bitmap;
    }

    /* JADX INFO: renamed from: h */
    public final void m67572h() {
        this.f44303c = new C11550c();
        this.f44302b = new C11548a();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m67573i(ValueAnimator valueAnimator) {
        this.f44301a.m67578a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f44302b.m67576a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m67574j(Bitmap bitmap) {
        this.f44301a = new C11549b(m67571g(bitmap));
        m67575k();
    }

    /* JADX INFO: renamed from: k */
    public final void m67575k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44304d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.f44304d.setInterpolator(new jke(0.3f, 0.0f, 0.6f, 1.0f));
        this.f44304d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hus
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f111692a.m67573i(valueAnimator);
            }
        });
        this.f44304d.setRepeatCount(-1);
        this.f44304d.setRepeatMode(1);
        this.f44304d.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f44304d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C11549b c11549b = this.f44301a;
        if (c11549b == null) {
            return;
        }
        c11549b.m67579b(canvas);
        this.f44302b.m67577b(canvas);
    }

    public LiveHeadAnimView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveHeadAnimView(Context context) {
        this(context, null);
    }
}
