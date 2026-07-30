package p147v;

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
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VCheckCircle extends ImageView {

    /* JADX INFO: renamed from: r */
    public static Paint f209049r;

    /* JADX INFO: renamed from: s */
    public static Paint f209050s;

    /* JADX INFO: renamed from: t */
    public static Paint f209051t;

    /* JADX INFO: renamed from: u */
    public static Paint f209052u;

    /* JADX INFO: renamed from: a */
    public Bitmap f209053a;

    /* JADX INFO: renamed from: b */
    public Bitmap f209054b;

    /* JADX INFO: renamed from: c */
    public Canvas f209055c;

    /* JADX INFO: renamed from: d */
    public Canvas f209056d;

    /* JADX INFO: renamed from: e */
    public boolean f209057e;

    /* JADX INFO: renamed from: f */
    public int f209058f;

    /* JADX INFO: renamed from: g */
    public int f209059g;

    /* JADX INFO: renamed from: h */
    public float f209060h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f209061i;

    /* JADX INFO: renamed from: j */
    public boolean f209062j;

    /* JADX INFO: renamed from: k */
    public boolean f209063k;

    /* JADX INFO: renamed from: l */
    public boolean f209064l;

    /* JADX INFO: renamed from: m */
    public int f209065m;

    /* JADX INFO: renamed from: n */
    public int f209066n;

    /* JADX INFO: renamed from: o */
    public int f209067o;

    /* JADX INFO: renamed from: p */
    public float f209068p;

    /* JADX INFO: renamed from: q */
    public long f209069q;

    public VCheckCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209057e = true;
        this.f209058f = 1140850688;
        this.f209059g = -1;
        this.f209062j = true;
        this.f209065m = 24;
        this.f209067o = -16725933;
        this.f209068p = 0.25f;
        this.f209069q = 500L;
        m223001c(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m222999a(boolean z) {
        this.f209062j = z;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.f209061i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(this.f209069q);
        this.f209061i.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m223000b() {
        ObjectAnimator objectAnimator = this.f209061i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m223001c(Context context) {
        if (f209049r == null) {
            f209049r = new Paint(1);
            Paint paint = new Paint(1);
            f209050s = paint;
            paint.setColor(0);
            Paint paint2 = f209050s;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            f209051t = paint3;
            paint3.setColor(0);
            Paint paint4 = f209051t;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            f209051t.setStrokeWidth(t100.m186890d(28.0f));
            f209051t.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            f209052u = paint5;
            paint5.setColor(this.f209059g);
            f209052u.setStyle(style);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m223002d() {
        return this.f209064l;
    }

    /* JADX INFO: renamed from: e */
    public void m223003e(boolean z, boolean z2) {
        if (z == this.f209064l) {
            return;
        }
        this.f209064l = z;
        if (this.f209063k && z2) {
            m222999a(z);
        } else {
            m223000b();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    @Keep
    public float getProgress() {
        return this.f209060h;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f209063k = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f209063k = false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float fM186890d;
        int i;
        if (getVisibility() != 0) {
            return;
        }
        if (this.f209057e || this.f209060h != 0.0f) {
            f209051t.setStrokeWidth(this.f209065m + t100.m186890d(6.0f));
            this.f209053a.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f = this.f209060h;
            float f2 = f >= 0.5f ? 1.0f : f / 0.5f;
            float f3 = f < 0.5f ? 0.0f : (f - 0.5f) / 0.5f;
            if (!this.f209062j) {
                f = 1.0f - f;
            }
            float f4 = this.f209068p;
            if (f >= f4) {
                if (f < f4 * 2.0f) {
                    float fM186890d2 = t100.m186890d(2.0f);
                    float fM186890d3 = t100.m186890d(2.0f);
                    float f5 = this.f209068p;
                    fM186890d = fM186890d2 - ((fM186890d3 * (f - f5)) / f5);
                }
                if (this.f209057e) {
                    f209049r.setColor(this.f209058f);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.m186890d(2.0f), f209049r);
                    f209052u.setStrokeWidth(((((getMeasuredWidth() / 2) - t100.m186890d(1.0f)) - measuredWidth) / 5.0f) + t100.m186890d(2.0f));
                    Paint paint = f209052u;
                    if (this.f209064l) {
                        i = this.f209067o;
                    } else {
                        i = this.f209059g;
                    }
                    paint.setColor(i);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.m186890d(2.0f), f209052u);
                }
                f209049r.setColor(this.f209067o);
                this.f209055c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.m186890d(2.0f), f209049r);
                this.f209055c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth * (1.0f - f2), f209050s);
                canvas.drawBitmap(this.f209053a, 0.0f, 0.0f, (Paint) null);
                this.f209054b.eraseColor(0);
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                Drawable drawable = getDrawable();
                int i2 = this.f209066n;
                drawable.setBounds(measuredWidth2, measuredHeight + i2, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i2);
                getDrawable().draw(this.f209056d);
                this.f209056d.drawCircle((getMeasuredWidth() / 2) - t100.m186890d(2.5f), (getMeasuredHeight() / 2) + t100.m186890d(4.0f), ((getMeasuredWidth() + t100.m186890d(6.0f)) / 2) * (1.0f - f3), f209051t);
                canvas.drawBitmap(this.f209054b, 0.0f, 0.0f, (Paint) null);
            }
            fM186890d = (t100.m186890d(2.0f) * f) / this.f209068p;
            measuredWidth -= fM186890d;
            if (this.f209057e) {
                f209049r.setColor(this.f209058f);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.m186890d(2.0f), f209049r);
                f209052u.setStrokeWidth(((((getMeasuredWidth() / 2) - t100.m186890d(1.0f)) - measuredWidth) / 5.0f) + t100.m186890d(2.0f));
                Paint paint2 = f209052u;
                if (this.f209064l) {
                    i = this.f209067o;
                } else {
                    i = this.f209059g;
                }
                paint2.setColor(i);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.m186890d(2.0f), f209052u);
            }
            f209049r.setColor(this.f209067o);
            this.f209055c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.m186890d(2.0f), f209049r);
            this.f209055c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth * (1.0f - f2), f209050s);
            canvas.drawBitmap(this.f209053a, 0.0f, 0.0f, (Paint) null);
            this.f209054b.eraseColor(0);
            int intrinsicWidth2 = getDrawable().getIntrinsicWidth();
            int intrinsicHeight2 = getDrawable().getIntrinsicHeight();
            int measuredWidth3 = (getMeasuredWidth() - intrinsicWidth2) / 2;
            int measuredHeight2 = (getMeasuredHeight() - intrinsicHeight2) / 2;
            Drawable drawable2 = getDrawable();
            int i3 = this.f209066n;
            drawable2.setBounds(measuredWidth3, measuredHeight2 + i3, intrinsicWidth2 + measuredWidth3, measuredHeight2 + intrinsicHeight2 + i3);
            getDrawable().draw(this.f209056d);
            this.f209056d.drawCircle((getMeasuredWidth() / 2) - t100.m186890d(2.5f), (getMeasuredHeight() / 2) + t100.m186890d(4.0f), ((getMeasuredWidth() + t100.m186890d(6.0f)) / 2) * (1.0f - f3), f209051t);
            canvas.drawBitmap(this.f209054b, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f209065m = getMeasuredWidth();
        if (getVisibility() == 0) {
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f209058f = i;
    }

    public void setCheckOffset(int i) {
        this.f209066n = i;
    }

    public void setColor(int i) {
        this.f209067o = i;
    }

    public void setDrawBackground(boolean z) {
        this.f209057e = z;
    }

    public void setDuration(long j) {
        this.f209069q = j;
    }

    @Keep
    public void setProgress(float f) {
        if (this.f209060h == f) {
            return;
        }
        this.f209060h = f;
        invalidate();
    }

    public void setProgressBounceEffect(boolean z) {
        this.f209068p = z ? this.f209068p : Float.MAX_VALUE;
    }

    public void setSize(int i) {
        this.f209065m = i;
    }

    public void setStrokeColor(int i) {
        this.f209059g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.f209053a == null) {
            int i2 = this.f209065m;
            Bitmap.Config config = Bitmap.Config.ARGB_4444;
            this.f209053a = Bitmap.createBitmap(i2, i2, config);
            this.f209055c = new Canvas(this.f209053a);
            int i3 = this.f209065m;
            this.f209054b = Bitmap.createBitmap(i3, i3, config);
            this.f209056d = new Canvas(this.f209054b);
        }
    }

    public VCheckCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209057e = true;
        this.f209058f = 1140850688;
        this.f209059g = -1;
        this.f209062j = true;
        this.f209065m = 24;
        this.f209067o = -16725933;
        this.f209068p = 0.25f;
        this.f209069q = 500L;
        m223001c(context);
    }

    public VCheckCircle(Context context) {
        super(context);
        this.f209057e = true;
        this.f209058f = 1140850688;
        this.f209059g = -1;
        this.f209062j = true;
        this.f209065m = 24;
        this.f209067o = -16725933;
        this.f209068p = 0.25f;
        this.f209069q = 500L;
        m223001c(context);
    }
}
