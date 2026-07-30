package p002l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.annotation.ColorInt;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t600 extends Drawable {

    /* JADX INFO: renamed from: v */
    public static Rect f19431v = new Rect();

    /* JADX INFO: renamed from: a */
    public int f19432a;

    /* JADX INFO: renamed from: b */
    public Paint f19433b;

    /* JADX INFO: renamed from: c */
    public Paint f19434c;

    /* JADX INFO: renamed from: d */
    public int f19435d;

    /* JADX INFO: renamed from: e */
    public float f19436e;

    /* JADX INFO: renamed from: f */
    public float f19437f;

    /* JADX INFO: renamed from: g */
    public float f19438g;

    /* JADX INFO: renamed from: h */
    public int f19439h;

    /* JADX INFO: renamed from: i */
    public float f19440i;

    /* JADX INFO: renamed from: j */
    public float f19441j;

    /* JADX INFO: renamed from: k */
    public int f19442k;

    /* JADX INFO: renamed from: l */
    public final String f19443l;

    /* JADX INFO: renamed from: m */
    public final int f19444m;

    /* JADX INFO: renamed from: n */
    public final int f19445n;

    /* JADX INFO: renamed from: o */
    public final int f19446o;

    /* JADX INFO: renamed from: p */
    public final int f19447p;

    /* JADX INFO: renamed from: q */
    public int f19448q;

    /* JADX INFO: renamed from: r */
    public int f19449r;

    /* JADX INFO: renamed from: s */
    public String f19450s;

    /* JADX INFO: renamed from: t */
    public int f19451t;

    /* JADX INFO: renamed from: u */
    public Paint f19452u;

    public t600(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z) {
        this.f19432a = t100.d(14.0f);
        this.f19448q = 0;
        this.f19449r = 0;
        this.f19451t = -1;
        this.f19432a = t100.d(i6 > 0 ? i6 : 15.0f);
        m22799b(context, i4, i5, f, z);
        this.f19443l = str;
        int iMeasureText = (int) this.f19434c.measureText(str);
        this.f19444m = i;
        this.f19446o = i2;
        int i7 = (int) (iMeasureText + (this.f19436e * 2.0f));
        int iMin = i3 == -1 ? i7 : Math.min(i7, i3 - this.f19449r);
        this.f19445n = iMin;
        int i8 = (int) (this.f19435d + (this.f19437f * 2.0f) + (this.f19438g * 2.0f));
        this.f19447p = i8;
        setBounds(0, 0, iMin + this.f19449r, i8);
        this.f19451t = i3;
        if (i3 != -1) {
            int i9 = this.f19449r;
            if (i7 > i3 - i9) {
                m22798a((i3 - i9) - ((int) (this.f19436e * 2.0f)));
            } else {
                this.f19450s = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22798a(int i) {
        if (!NullChecker.a(this.f19443l) || i <= 0 || this.f19443l.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f19443l.length(); i2++) {
            String strConcat = this.f19443l.substring(0, i2).concat("...");
            if (this.f19434c.measureText(strConcat) > i) {
                return;
            }
            this.f19450s = strConcat;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22799b(Context context, int i, int i2, float f, boolean z) {
        if (this.f19432a == this.f19442k && NullChecker.a(this.f19434c)) {
            return;
        }
        this.f19442k = this.f19432a;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        this.f19434c = textPaint;
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textPaint.setTypeface(eqh0.c(2));
        }
        this.f19434c.setTextSize(this.f19442k);
        this.f19434c.setAntiAlias(true);
        Paint paint = this.f19434c;
        paint.setFlags(paint.getFlags() | 128);
        this.f19436e = 17.0f * f2;
        this.f19437f = 8.0f * f2;
        this.f19438g = f * f2;
        this.f19449r = (int) (i * f2);
        Paint paint2 = new Paint();
        this.f19433b = paint2;
        paint2.setAntiAlias(true);
        this.f19439h = i2;
        this.f19440i = this.f19434c.getFontMetrics().ascent;
        float f3 = this.f19434c.getFontMetrics().descent;
        this.f19441j = f3;
        this.f19435d = (int) (f3 - this.f19440i);
    }

    /* JADX INFO: renamed from: c */
    public t600 m22800c(@ColorInt int i, float f) {
        if (this.f19452u == null) {
            this.f19452u = new Paint();
        }
        this.f19452u.setStrokeWidth(f);
        this.f19452u.setColor(i);
        this.f19452u.setAntiAlias(true);
        this.f19452u.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f19451t == -1) {
            canvas.getClipBounds(f19431v);
            int width = f19431v.width() == 0 ? canvas.getWidth() : f19431v.width();
            int i = this.f19445n;
            boolean z = width < i;
            if (z) {
                i = width;
            }
            this.f19433b.setColor(this.f19446o);
            float f = this.f19438g;
            RectF rectF = new RectF(0.0f, f, i, this.f19447p - f);
            int i2 = this.f19439h;
            canvas.drawRoundRect(rectF, i2, i2, this.f19433b);
            Paint paint = this.f19452u;
            if (paint != null) {
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                float f2 = rectF.top + strokeWidth;
                rectF.top = f2;
                rectF.right = f2 - strokeWidth;
                rectF.bottom -= strokeWidth;
                int i3 = this.f19439h;
                canvas.drawRoundRect(rectF, i3, i3, this.f19452u);
            }
            if (z) {
                canvas.save();
                canvas.scale((width * 1.0f) / this.f19445n, 1.0f);
            }
            this.f19434c.setColor(this.f19444m);
            if (NullChecker.a(this.f19443l)) {
                canvas.drawText(this.f19443l, this.f19436e, ((this.f19447p - this.f19438g) - this.f19437f) - this.f19441j, this.f19434c);
            }
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        int i4 = this.f19448q;
        Paint paint2 = this.f19433b;
        if (i4 <= 0) {
            paint2.setColor(this.f19446o);
            float f3 = this.f19438g;
            RectF rectF2 = new RectF(0.0f, f3, this.f19445n, this.f19447p - f3);
            int i5 = this.f19439h;
            canvas.drawRoundRect(rectF2, i5, i5, this.f19433b);
            Paint paint3 = this.f19452u;
            if (paint3 != null) {
                float strokeWidth2 = (paint3.getStrokeWidth() / 2.0f) + 1.0f;
                rectF2.left += strokeWidth2;
                rectF2.top += strokeWidth2;
                rectF2.right -= strokeWidth2;
                rectF2.bottom -= strokeWidth2;
                int i6 = this.f19439h;
                canvas.drawRoundRect(rectF2, i6, i6, this.f19452u);
            }
            if (NullChecker.a(this.f19450s)) {
                this.f19434c.setColor(this.f19444m);
                canvas.drawText(this.f19450s, this.f19436e, ((this.f19447p - this.f19438g) - this.f19437f) - this.f19441j, this.f19434c);
                return;
            }
            return;
        }
        paint2.setColor(0);
        new RectF(0.0f, 0.0f, this.f19445n, this.f19448q + (this.f19438g * 2.0f));
        this.f19433b.setColor(this.f19446o);
        RectF rectF3 = new RectF(0.0f, 0.0f, this.f19445n, this.f19448q);
        int i7 = this.f19439h;
        canvas.drawRoundRect(rectF3, i7, i7, this.f19433b);
        Paint paint4 = this.f19452u;
        if (paint4 != null) {
            float strokeWidth3 = (paint4.getStrokeWidth() / 2.0f) + 1.0f;
            rectF3.left += strokeWidth3;
            rectF3.top += strokeWidth3;
            rectF3.right -= strokeWidth3;
            rectF3.bottom -= strokeWidth3;
            int i8 = this.f19439h;
            canvas.drawRoundRect(rectF3, i8, i8, this.f19452u);
        }
        if (NullChecker.a(this.f19450s)) {
            this.f19434c.setColor(this.f19444m);
            String str = this.f19450s;
            float f4 = this.f19436e;
            float f5 = this.f19441j;
            canvas.drawText(str, f4, (((f5 - this.f19440i) / 2.0f) - f5) + rectF3.centerY(), this.f19434c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19447p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19445n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f19447p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f19445n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public t600(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z, int i7) {
        this(context, str, i, i2, i3, i4, i5, f, i6, z);
        this.f19448q = i7;
    }
}
