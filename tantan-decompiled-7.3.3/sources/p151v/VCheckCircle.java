package p151v;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Keep;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VCheckCircle extends ImageView {

    /* JADX INFO: renamed from: r */
    public static Paint f209971r;

    /* JADX INFO: renamed from: s */
    public static Paint f209972s;

    /* JADX INFO: renamed from: t */
    public static Paint f209973t;

    /* JADX INFO: renamed from: u */
    public static Paint f209974u;

    /* JADX INFO: renamed from: a */
    public Bitmap f209975a;

    /* JADX INFO: renamed from: b */
    public Bitmap f209976b;

    /* JADX INFO: renamed from: c */
    public Canvas f209977c;

    /* JADX INFO: renamed from: d */
    public Canvas f209978d;

    /* JADX INFO: renamed from: e */
    public boolean f209979e;

    /* JADX INFO: renamed from: f */
    public int f209980f;

    /* JADX INFO: renamed from: g */
    public int f209981g;

    /* JADX INFO: renamed from: h */
    public float f209982h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f209983i;

    /* JADX INFO: renamed from: j */
    public boolean f209984j;

    /* JADX INFO: renamed from: k */
    public boolean f209985k;

    /* JADX INFO: renamed from: l */
    public boolean f209986l;

    /* JADX INFO: renamed from: m */
    public int f209987m;

    /* JADX INFO: renamed from: n */
    public int f209988n;

    /* JADX INFO: renamed from: o */
    public int f209989o;

    /* JADX INFO: renamed from: p */
    public float f209990p;

    /* JADX INFO: renamed from: q */
    public long f209991q;

    public VCheckCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209979e = true;
        this.f209980f = 1140850688;
        this.f209981g = -1;
        this.f209984j = true;
        this.f209987m = 24;
        this.f209989o = -16725933;
        this.f209990p = 0.25f;
        this.f209991q = 500L;
        m224247c(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m224245a(boolean z) {
        this.f209984j = z;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.f209983i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(this.f209991q);
        this.f209983i.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m224246b() {
        ObjectAnimator objectAnimator = this.f209983i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m224247c(Context context) {
        if (f209971r == null) {
            f209971r = new Paint(1);
            Paint paint = new Paint(1);
            f209972s = paint;
            paint.setColor(0);
            Paint paint2 = f209972s;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            f209973t = paint3;
            paint3.setColor(0);
            Paint paint4 = f209973t;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            f209973t.setStrokeWidth(qa00.m175859d(28.0f));
            f209973t.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            f209974u = paint5;
            paint5.setColor(this.f209981g);
            f209974u.setStyle(style);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m224248d() {
        return this.f209986l;
    }

    /* JADX INFO: renamed from: e */
    public void m224249e(boolean z, boolean z2) {
        if (z == this.f209986l) {
            return;
        }
        this.f209986l = z;
        if (this.f209985k && z2) {
            m224245a(z);
        } else {
            m224246b();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    @Keep
    public float getProgress() {
        return this.f209982h;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f209985k = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f209985k = false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float fM175859d;
        int i;
        if (getVisibility() != 0) {
            return;
        }
        if (this.f209979e || this.f209982h != 0.0f) {
            f209973t.setStrokeWidth(this.f209987m + qa00.m175859d(6.0f));
            this.f209975a.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f = this.f209982h;
            float f2 = f >= 0.5f ? 1.0f : f / 0.5f;
            float f3 = f < 0.5f ? 0.0f : (f - 0.5f) / 0.5f;
            if (!this.f209984j) {
                f = 1.0f - f;
            }
            float f4 = this.f209990p;
            if (f >= f4) {
                if (f < f4 * 2.0f) {
                    float fM175859d2 = qa00.m175859d(2.0f);
                    float fM175859d3 = qa00.m175859d(2.0f);
                    float f5 = this.f209990p;
                    fM175859d = fM175859d2 - ((fM175859d3 * (f - f5)) / f5);
                }
                if (this.f209979e) {
                    f209971r.setColor(this.f209980f);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - qa00.m175859d(2.0f), f209971r);
                    f209974u.setStrokeWidth(((((getMeasuredWidth() / 2) - qa00.m175859d(1.0f)) - measuredWidth) / 5.0f) + qa00.m175859d(2.0f));
                    Paint paint = f209974u;
                    if (this.f209986l) {
                        i = this.f209989o;
                    } else {
                        i = this.f209981g;
                    }
                    paint.setColor(i);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - qa00.m175859d(2.0f), f209974u);
                }
                f209971r.setColor(this.f209989o);
                this.f209977c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - qa00.m175859d(2.0f), f209971r);
                this.f209977c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth * (1.0f - f2), f209972s);
                canvas.drawBitmap(this.f209975a, 0.0f, 0.0f, (Paint) null);
                this.f209976b.eraseColor(0);
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                Drawable drawable = getDrawable();
                int i2 = this.f209988n;
                drawable.setBounds(measuredWidth2, measuredHeight + i2, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i2);
                getDrawable().draw(this.f209978d);
                this.f209978d.drawCircle((getMeasuredWidth() / 2) - qa00.m175859d(2.5f), (getMeasuredHeight() / 2) + qa00.m175859d(4.0f), ((getMeasuredWidth() + qa00.m175859d(6.0f)) / 2) * (1.0f - f3), f209973t);
                canvas.drawBitmap(this.f209976b, 0.0f, 0.0f, (Paint) null);
            }
            fM175859d = (qa00.m175859d(2.0f) * f) / this.f209990p;
            measuredWidth -= fM175859d;
            if (this.f209979e) {
                f209971r.setColor(this.f209980f);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - qa00.m175859d(2.0f), f209971r);
                f209974u.setStrokeWidth(((((getMeasuredWidth() / 2) - qa00.m175859d(1.0f)) - measuredWidth) / 5.0f) + qa00.m175859d(2.0f));
                Paint paint2 = f209974u;
                if (this.f209986l) {
                    i = this.f209989o;
                } else {
                    i = this.f209981g;
                }
                paint2.setColor(i);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - qa00.m175859d(2.0f), f209974u);
            }
            f209971r.setColor(this.f209989o);
            this.f209977c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - qa00.m175859d(2.0f), f209971r);
            this.f209977c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth * (1.0f - f2), f209972s);
            canvas.drawBitmap(this.f209975a, 0.0f, 0.0f, (Paint) null);
            this.f209976b.eraseColor(0);
            int intrinsicWidth2 = getDrawable().getIntrinsicWidth();
            int intrinsicHeight2 = getDrawable().getIntrinsicHeight();
            int measuredWidth3 = (getMeasuredWidth() - intrinsicWidth2) / 2;
            int measuredHeight2 = (getMeasuredHeight() - intrinsicHeight2) / 2;
            Drawable drawable2 = getDrawable();
            int i3 = this.f209988n;
            drawable2.setBounds(measuredWidth3, measuredHeight2 + i3, intrinsicWidth2 + measuredWidth3, measuredHeight2 + intrinsicHeight2 + i3);
            getDrawable().draw(this.f209978d);
            this.f209978d.drawCircle((getMeasuredWidth() / 2) - qa00.m175859d(2.5f), (getMeasuredHeight() / 2) + qa00.m175859d(4.0f), ((getMeasuredWidth() + qa00.m175859d(6.0f)) / 2) * (1.0f - f3), f209973t);
            canvas.drawBitmap(this.f209976b, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f209987m = getMeasuredWidth();
        if (getVisibility() == 0) {
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f209980f = i;
    }

    public void setCheckOffset(int i) {
        this.f209988n = i;
    }

    public void setColor(int i) {
        this.f209989o = i;
    }

    public void setDrawBackground(boolean z) {
        this.f209979e = z;
    }

    public void setDuration(long j) {
        this.f209991q = j;
    }

    @Keep
    public void setProgress(float f) {
        if (this.f209982h == f) {
            return;
        }
        this.f209982h = f;
        invalidate();
    }

    public void setProgressBounceEffect(boolean z) {
        this.f209990p = z ? this.f209990p : Float.MAX_VALUE;
    }

    public void setSize(int i) {
        this.f209987m = i;
    }

    public void setStrokeColor(int i) {
        this.f209981g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.f209975a == null) {
            int i2 = this.f209987m;
            Bitmap.Config config = Bitmap.Config.ARGB_4444;
            this.f209975a = Bitmap.createBitmap(i2, i2, config);
            this.f209977c = new Canvas(this.f209975a);
            int i3 = this.f209987m;
            this.f209976b = Bitmap.createBitmap(i3, i3, config);
            this.f209978d = new Canvas(this.f209976b);
        }
    }

    public VCheckCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209979e = true;
        this.f209980f = 1140850688;
        this.f209981g = -1;
        this.f209984j = true;
        this.f209987m = 24;
        this.f209989o = -16725933;
        this.f209990p = 0.25f;
        this.f209991q = 500L;
        m224247c(context);
    }

    public VCheckCircle(Context context) {
        super(context);
        this.f209979e = true;
        this.f209980f = 1140850688;
        this.f209981g = -1;
        this.f209984j = true;
        this.f209987m = 24;
        this.f209989o = -16725933;
        this.f209990p = 0.25f;
        this.f209991q = 500L;
        m224247c(context);
    }
}
