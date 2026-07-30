package p028v;

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
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class VCheckCircle extends ImageView {

    /* JADX INFO: renamed from: r */
    public static Paint f12674r;

    /* JADX INFO: renamed from: s */
    public static Paint f12675s;

    /* JADX INFO: renamed from: t */
    public static Paint f12676t;

    /* JADX INFO: renamed from: u */
    public static Paint f12677u;

    /* JADX INFO: renamed from: a */
    public Bitmap f12678a;

    /* JADX INFO: renamed from: b */
    public Bitmap f12679b;

    /* JADX INFO: renamed from: c */
    public Canvas f12680c;

    /* JADX INFO: renamed from: d */
    public Canvas f12681d;

    /* JADX INFO: renamed from: e */
    public boolean f12682e;

    /* JADX INFO: renamed from: f */
    public int f12683f;

    /* JADX INFO: renamed from: g */
    public int f12684g;

    /* JADX INFO: renamed from: h */
    public float f12685h;

    /* JADX INFO: renamed from: i */
    public ObjectAnimator f12686i;

    /* JADX INFO: renamed from: j */
    public boolean f12687j;

    /* JADX INFO: renamed from: k */
    public boolean f12688k;

    /* JADX INFO: renamed from: l */
    public boolean f12689l;

    /* JADX INFO: renamed from: m */
    public int f12690m;

    /* JADX INFO: renamed from: n */
    public int f12691n;

    /* JADX INFO: renamed from: o */
    public int f12692o;

    /* JADX INFO: renamed from: p */
    public float f12693p;

    /* JADX INFO: renamed from: q */
    public long f12694q;

    public VCheckCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12682e = true;
        this.f12683f = 1140850688;
        this.f12684g = -1;
        this.f12687j = true;
        this.f12690m = 24;
        this.f12692o = -16725933;
        this.f12693p = 0.25f;
        this.f12694q = 500L;
        m11474c(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m11472a(boolean z) {
        this.f12687j = z;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.f12686i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(this.f12694q);
        this.f12686i.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m11473b() {
        ObjectAnimator objectAnimator = this.f12686i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11474c(Context context) {
        if (f12674r == null) {
            f12674r = new Paint(1);
            Paint paint = new Paint(1);
            f12675s = paint;
            paint.setColor(0);
            Paint paint2 = f12675s;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            f12676t = paint3;
            paint3.setColor(0);
            Paint paint4 = f12676t;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            f12676t.setStrokeWidth(t100.d(28.0f));
            f12676t.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            f12677u = paint5;
            paint5.setColor(this.f12684g);
            f12677u.setStyle(style);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m11475d() {
        return this.f12689l;
    }

    /* JADX INFO: renamed from: e */
    public void m11476e(boolean z, boolean z2) {
        if (z == this.f12689l) {
            return;
        }
        this.f12689l = z;
        if (this.f12688k && z2) {
            m11472a(z);
        } else {
            m11473b();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    @Keep
    public float getProgress() {
        return this.f12685h;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12688k = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12688k = false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float fD;
        int i;
        if (getVisibility() != 0) {
            return;
        }
        if (this.f12682e || this.f12685h != 0.0f) {
            f12676t.setStrokeWidth(this.f12690m + t100.d(6.0f));
            this.f12678a.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f = this.f12685h;
            float f2 = f >= 0.5f ? 1.0f : f / 0.5f;
            float f3 = f < 0.5f ? 0.0f : (f - 0.5f) / 0.5f;
            if (!this.f12687j) {
                f = 1.0f - f;
            }
            float f4 = this.f12693p;
            if (f >= f4) {
                if (f < f4 * 2.0f) {
                    float fD2 = t100.d(2.0f);
                    float fD3 = t100.d(2.0f);
                    float f5 = this.f12693p;
                    fD = fD2 - ((fD3 * (f - f5)) / f5);
                }
                if (this.f12682e) {
                    f12674r.setColor(this.f12683f);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.d(2.0f), f12674r);
                    f12677u.setStrokeWidth(((((getMeasuredWidth() / 2) - t100.d(1.0f)) - measuredWidth) / 5.0f) + t100.d(2.0f));
                    Paint paint = f12677u;
                    if (this.f12689l) {
                        i = this.f12692o;
                    } else {
                        i = this.f12684g;
                    }
                    paint.setColor(i);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.d(2.0f), f12677u);
                }
                f12674r.setColor(this.f12692o);
                this.f12680c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.d(2.0f), f12674r);
                this.f12680c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth * (1.0f - f2), f12675s);
                canvas.drawBitmap(this.f12678a, 0.0f, 0.0f, (Paint) null);
                this.f12679b.eraseColor(0);
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                Drawable drawable = getDrawable();
                int i2 = this.f12691n;
                drawable.setBounds(measuredWidth2, measuredHeight + i2, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i2);
                getDrawable().draw(this.f12681d);
                this.f12681d.drawCircle((getMeasuredWidth() / 2) - t100.d(2.5f), (getMeasuredHeight() / 2) + t100.d(4.0f), ((getMeasuredWidth() + t100.d(6.0f)) / 2) * (1.0f - f3), f12676t);
                canvas.drawBitmap(this.f12679b, 0.0f, 0.0f, (Paint) null);
            }
            fD = (t100.d(2.0f) * f) / this.f12693p;
            measuredWidth -= fD;
            if (this.f12682e) {
                f12674r.setColor(this.f12683f);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.d(2.0f), f12674r);
                f12677u.setStrokeWidth(((((getMeasuredWidth() / 2) - t100.d(1.0f)) - measuredWidth) / 5.0f) + t100.d(2.0f));
                Paint paint2 = f12677u;
                if (this.f12689l) {
                    i = this.f12692o;
                } else {
                    i = this.f12684g;
                }
                paint2.setColor(i);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.d(2.0f), f12677u);
            }
            f12674r.setColor(this.f12692o);
            this.f12680c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - t100.d(2.0f), f12674r);
            this.f12680c.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth * (1.0f - f2), f12675s);
            canvas.drawBitmap(this.f12678a, 0.0f, 0.0f, (Paint) null);
            this.f12679b.eraseColor(0);
            int intrinsicWidth2 = getDrawable().getIntrinsicWidth();
            int intrinsicHeight2 = getDrawable().getIntrinsicHeight();
            int measuredWidth3 = (getMeasuredWidth() - intrinsicWidth2) / 2;
            int measuredHeight2 = (getMeasuredHeight() - intrinsicHeight2) / 2;
            Drawable drawable2 = getDrawable();
            int i3 = this.f12691n;
            drawable2.setBounds(measuredWidth3, measuredHeight2 + i3, intrinsicWidth2 + measuredWidth3, measuredHeight2 + intrinsicHeight2 + i3);
            getDrawable().draw(this.f12681d);
            this.f12681d.drawCircle((getMeasuredWidth() / 2) - t100.d(2.5f), (getMeasuredHeight() / 2) + t100.d(4.0f), ((getMeasuredWidth() + t100.d(6.0f)) / 2) * (1.0f - f3), f12676t);
            canvas.drawBitmap(this.f12679b, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12690m = getMeasuredWidth();
        if (getVisibility() == 0) {
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f12683f = i;
    }

    public void setCheckOffset(int i) {
        this.f12691n = i;
    }

    public void setColor(int i) {
        this.f12692o = i;
    }

    public void setDrawBackground(boolean z) {
        this.f12682e = z;
    }

    public void setDuration(long j) {
        this.f12694q = j;
    }

    @Keep
    public void setProgress(float f) {
        if (this.f12685h == f) {
            return;
        }
        this.f12685h = f;
        invalidate();
    }

    public void setProgressBounceEffect(boolean z) {
        this.f12693p = z ? this.f12693p : Float.MAX_VALUE;
    }

    public void setSize(int i) {
        this.f12690m = i;
    }

    public void setStrokeColor(int i) {
        this.f12684g = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.f12678a == null) {
            int i2 = this.f12690m;
            Bitmap.Config config = Bitmap.Config.ARGB_4444;
            this.f12678a = Bitmap.createBitmap(i2, i2, config);
            this.f12680c = new Canvas(this.f12678a);
            int i3 = this.f12690m;
            this.f12679b = Bitmap.createBitmap(i3, i3, config);
            this.f12681d = new Canvas(this.f12679b);
        }
    }

    public VCheckCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12682e = true;
        this.f12683f = 1140850688;
        this.f12684g = -1;
        this.f12687j = true;
        this.f12690m = 24;
        this.f12692o = -16725933;
        this.f12693p = 0.25f;
        this.f12694q = 500L;
        m11474c(context);
    }

    public VCheckCircle(Context context) {
        super(context);
        this.f12682e = true;
        this.f12683f = 1140850688;
        this.f12684g = -1;
        this.f12687j = true;
        this.f12690m = 24;
        this.f12692o = -16725933;
        this.f12693p = 0.25f;
        this.f12694q = 500L;
        m11474c(context);
    }
}
