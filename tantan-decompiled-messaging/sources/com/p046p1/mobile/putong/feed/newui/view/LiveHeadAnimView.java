package com.p046p1.mobile.putong.feed.newui.view;

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
import com.p046p1.mobile.putong.feed.R$string;
import p149l.fje;
import p149l.jb80;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class LiveHeadAnimView extends View {

    /* JADX INFO: renamed from: f */
    public static final float f43451f = t100.f167266o;

    /* JADX INFO: renamed from: g */
    public static final float f43452g = t100.m186890d(52.0f);

    /* JADX INFO: renamed from: a */
    public C11386b f43453a;

    /* JADX INFO: renamed from: b */
    public C11385a f43454b;

    /* JADX INFO: renamed from: c */
    public C11387c f43455c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f43456d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f43457e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$a */
    public class C11385a {

        /* JADX INFO: renamed from: a */
        public float f43458a;

        public C11385a() {
            this.f43458a = 0.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m66393a(float f) {
            this.f43458a = f;
        }

        /* JADX INFO: renamed from: b */
        public void m66394b(Canvas canvas) {
            RectF rectFM66408j = LiveHeadAnimView.this.f43455c.m66408j();
            rectFM66408j.set(0.0f, 0.0f, LiveHeadAnimView.f43452g, LiveHeadAnimView.f43452g);
            Paint paintM66404f = LiveHeadAnimView.this.f43455c.m66404f();
            Paint paintM66404f2 = LiveHeadAnimView.this.f43455c.m66404f();
            paintM66404f2.setAntiAlias(true);
            paintM66404f.setAntiAlias(true);
            Path pathM66406h = LiveHeadAnimView.this.f43455c.m66406h();
            canvas.save();
            canvas.translate(LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1);
            pathM66406h.addCircle(0.0f, 0.0f, (LiveHeadAnimView.f43452g / 2.0f) - t100.f167254c, Path.Direction.CW);
            canvas.clipPath(pathM66406h, Region.Op.DIFFERENCE);
            if (LiveHeadAnimView.this.f43457e == null) {
                LiveHeadAnimView.this.f43457e = new LinearGradient(0.0f, (-LiveHeadAnimView.this.getMeasuredHeight()) >> 1, 0.0f, LiveHeadAnimView.this.getMeasuredHeight() >> 1, new int[]{-48311, -99265}, new float[]{0.0f, 1.0f}, Shader.TileMode.MIRROR);
            }
            paintM66404f2.setShader(LiveHeadAnimView.this.f43457e);
            Paint.Style style = Paint.Style.FILL;
            paintM66404f2.setStyle(style);
            paintM66404f2.setAlpha((int) ((1.0f - this.f43458a) * 204.0f));
            canvas.drawCircle(0.0f, 0.0f, (LiveHeadAnimView.f43452g / 2.0f) + (t100.f167258g * this.f43458a), paintM66404f2);
            paintM66404f.setShader(LiveHeadAnimView.this.f43457e);
            paintM66404f.setStyle(style);
            canvas.drawCircle(0.0f, 0.0f, LiveHeadAnimView.f43452g / 2.0f, paintM66404f);
            canvas.restore();
            LiveHeadAnimView.this.f43455c.m66407i(rectFM66408j);
            LiveHeadAnimView.this.f43455c.m66403e(paintM66404f);
            LiveHeadAnimView.this.f43455c.m66403e(paintM66404f2);
            LiveHeadAnimView.this.f43455c.m66405g(pathM66406h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$b */
    public class C11386b {

        /* JADX INFO: renamed from: a */
        public Matrix f43460a;

        /* JADX INFO: renamed from: b */
        public Matrix f43461b = new Matrix();

        /* JADX INFO: renamed from: c */
        public final Bitmap f43462c;

        /* JADX INFO: renamed from: d */
        public float f43463d;

        public C11386b(Bitmap bitmap) {
            this.f43462c = bitmap;
        }

        /* JADX INFO: renamed from: a */
        public void m66395a(float f) {
            if (f <= 0.7f) {
                this.f43463d = 1.0f - ((f / 0.7f) * 0.17f);
            } else {
                this.f43463d = (((f - 0.7f) * 0.17f) / 0.3f) + 0.83f;
            }
            this.f43461b.reset();
            Matrix matrix = this.f43461b;
            float f2 = this.f43463d;
            matrix.postScale(f2, f2, LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1);
        }

        /* JADX INFO: renamed from: b */
        public void m66396b(Canvas canvas) {
            if (LiveHeadAnimView.this.getMeasuredHeight() == 0 || LiveHeadAnimView.this.getMeasuredWidth() == 0) {
                return;
            }
            Paint paintM66404f = LiveHeadAnimView.this.f43455c.m66404f();
            Path pathM66406h = LiveHeadAnimView.this.f43455c.m66406h();
            canvas.save();
            Matrix matrixM66397c = m66397c(LiveHeadAnimView.this.f43455c.m66401c());
            paintM66404f.setAntiAlias(true);
            pathM66406h.addCircle(LiveHeadAnimView.this.getMeasuredWidth() >> 1, LiveHeadAnimView.this.getMeasuredHeight() >> 1, (LiveHeadAnimView.f43452g / 2.0f) * this.f43463d, Path.Direction.CW);
            canvas.clipPath(pathM66406h);
            canvas.drawBitmap(this.f43462c, matrixM66397c, paintM66404f);
            canvas.restore();
            LiveHeadAnimView.this.f43455c.m66400b(matrixM66397c);
            LiveHeadAnimView.this.f43455c.m66405g(pathM66406h);
            LiveHeadAnimView.this.f43455c.m66403e(paintM66404f);
        }

        /* JADX INFO: renamed from: c */
        public final Matrix m66397c(Matrix matrix) {
            m66398d();
            matrix.set(this.f43460a);
            matrix.postConcat(this.f43461b);
            return matrix;
        }

        /* JADX INFO: renamed from: d */
        public final void m66398d() {
            if (this.f43460a == null) {
                this.f43460a = new Matrix();
                RectF rectFM66408j = LiveHeadAnimView.this.f43455c.m66408j();
                RectF rectFM66408j2 = LiveHeadAnimView.this.f43455c.m66408j();
                rectFM66408j.set(0.0f, 0.0f, this.f43462c.getWidth(), this.f43462c.getHeight());
                boolean z = this.f43462c.getWidth() >= this.f43462c.getHeight();
                float width = (this.f43462c.getWidth() + 0.0f) / (this.f43462c.getHeight() + 0.0f);
                float f = LiveHeadAnimView.f43452g;
                if (z) {
                    f *= width;
                }
                float f2 = z ? LiveHeadAnimView.f43452g : LiveHeadAnimView.f43452g / width;
                float measuredWidth = (LiveHeadAnimView.this.getMeasuredWidth() - f) / 2.0f;
                float measuredHeight = (LiveHeadAnimView.this.getMeasuredHeight() - f2) / 2.0f;
                rectFM66408j2.set(measuredWidth, measuredHeight, f + measuredWidth, f2 + measuredHeight);
                this.f43460a.setRectToRect(rectFM66408j, rectFM66408j2, Matrix.ScaleToFit.CENTER);
                LiveHeadAnimView.this.f43455c.m66407i(rectFM66408j);
                LiveHeadAnimView.this.f43455c.m66407i(rectFM66408j2);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveHeadAnimView$c */
    public class C11387c {

        /* JADX INFO: renamed from: a */
        public jb80<RectF> f43465a;

        /* JADX INFO: renamed from: b */
        public jb80<Matrix> f43466b;

        /* JADX INFO: renamed from: c */
        public jb80<Path> f43467c;

        /* JADX INFO: renamed from: d */
        public jb80<Paint> f43468d;

        public C11387c() {
            this.f43465a = new jb80<>(4);
            this.f43466b = new jb80<>(1);
            this.f43467c = new jb80<>(2);
            this.f43468d = new jb80<>(5);
        }

        /* JADX INFO: renamed from: a */
        public Rect m66399a(Bitmap bitmap) {
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
        public void m66400b(Matrix matrix) {
            matrix.reset();
            this.f43466b.release(matrix);
        }

        /* JADX INFO: renamed from: c */
        public Matrix m66401c() {
            Matrix matrixAcquire = this.f43466b.acquire();
            return matrixAcquire == null ? new Matrix() : matrixAcquire;
        }

        /* JADX INFO: renamed from: d */
        public int m66402d(Paint paint) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i = fontMetricsInt.top;
            return ((~i) - ((~i) - (~fontMetricsInt.ascent))) - (fontMetricsInt.bottom - fontMetricsInt.descent);
        }

        /* JADX INFO: renamed from: e */
        public void m66403e(Paint paint) {
            paint.reset();
            this.f43468d.release(paint);
        }

        /* JADX INFO: renamed from: f */
        public Paint m66404f() {
            Paint paintAcquire = this.f43468d.acquire();
            return paintAcquire == null ? new Paint() : paintAcquire;
        }

        /* JADX INFO: renamed from: g */
        public void m66405g(Path path) {
            path.reset();
            this.f43467c.release(path);
        }

        /* JADX INFO: renamed from: h */
        public Path m66406h() {
            Path pathAcquire = this.f43467c.acquire();
            return pathAcquire == null ? new Path() : pathAcquire;
        }

        /* JADX INFO: renamed from: i */
        public void m66407i(RectF rectF) {
            rectF.setEmpty();
            this.f43465a.release(rectF);
        }

        /* JADX INFO: renamed from: j */
        public RectF m66408j() {
            RectF rectFAcquire = this.f43465a.acquire();
            return rectFAcquire == null ? new RectF() : rectFAcquire;
        }
    }

    public LiveHeadAnimView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66389h();
    }

    /* JADX INFO: renamed from: f */
    public void m66387f() {
        ValueAnimator valueAnimator = this.f43456d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: g */
    public final Bitmap m66388g(Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        Rect rectM66399a = this.f43455c.m66399a(bitmap);
        Paint paintM66404f = this.f43455c.m66404f();
        Paint paintM66404f2 = this.f43455c.m66404f();
        int width = bitmap.getWidth();
        Canvas canvas = new Canvas(bitmap);
        canvas.save();
        canvas.translate(0.0f, rectM66399a.top);
        paintM66404f.setAntiAlias(true);
        RectF rectFM66408j = this.f43455c.m66408j();
        float fWidth = rectM66399a.width() / (f43452g + 0.0f);
        rectFM66408j.set(0.0f, 0.0f, width, f43451f * fWidth);
        paintM66404f.setShader(new LinearGradient(0.0f, rectFM66408j.top, 0.0f, rectFM66408j.bottom, new int[]{-48311, -1275113401, 16677951}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR));
        canvas.drawRect(rectFM66408j, paintM66404f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(t100.m186892f(10) * fWidth);
        paint.setColor(-1);
        float f = (t100.f167255d * fWidth) / 2.0f;
        canvas.translate(t100.m186890d(18.0f) * fWidth, rectFM66408j.height() - (t100.m186890d(7.0f) * fWidth));
        canvas.drawText(getContext().getString(R$string.f38994W0), 0.0f, 0.0f, paint);
        canvas.translate((-t100.f167256e) * fWidth, (-this.f43455c.m66402d(paint)) >> 1);
        paintM66404f2.setAntiAlias(true);
        paintM66404f2.setColor(-1);
        paintM66404f2.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, f, paintM66404f2);
        canvas.restore();
        this.f43455c.m66407i(rectFM66408j);
        this.f43455c.m66403e(paintM66404f);
        this.f43455c.m66403e(paintM66404f2);
        return bitmap;
    }

    /* JADX INFO: renamed from: h */
    public final void m66389h() {
        this.f43455c = new C11387c();
        this.f43454b = new C11385a();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m66390i(ValueAnimator valueAnimator) {
        this.f43453a.m66395a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f43454b.m66393a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m66391j(Bitmap bitmap) {
        this.f43453a = new C11386b(m66388g(bitmap));
        m66392k();
    }

    /* JADX INFO: renamed from: k */
    public final void m66392k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43456d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.f43456d.setInterpolator(new fje(0.3f, 0.0f, 0.6f, 1.0f));
        this.f43456d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gss
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f104209a.m66390i(valueAnimator);
            }
        });
        this.f43456d.setRepeatCount(-1);
        this.f43456d.setRepeatMode(1);
        this.f43456d.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f43456d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C11386b c11386b = this.f43453a;
        if (c11386b == null) {
            return;
        }
        c11386b.m66396b(canvas);
        this.f43454b.m66394b(canvas);
    }

    public LiveHeadAnimView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveHeadAnimView(Context context) {
        this(context, null);
    }
}
