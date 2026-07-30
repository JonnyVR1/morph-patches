package p149l;

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

/* JADX INFO: loaded from: classes4.dex */
public class t600 extends Drawable {

    /* JADX INFO: renamed from: v */
    public static Rect f167896v = new Rect();

    /* JADX INFO: renamed from: a */
    public int f167897a;

    /* JADX INFO: renamed from: b */
    public Paint f167898b;

    /* JADX INFO: renamed from: c */
    public Paint f167899c;

    /* JADX INFO: renamed from: d */
    public int f167900d;

    /* JADX INFO: renamed from: e */
    public float f167901e;

    /* JADX INFO: renamed from: f */
    public float f167902f;

    /* JADX INFO: renamed from: g */
    public float f167903g;

    /* JADX INFO: renamed from: h */
    public int f167904h;

    /* JADX INFO: renamed from: i */
    public float f167905i;

    /* JADX INFO: renamed from: j */
    public float f167906j;

    /* JADX INFO: renamed from: k */
    public int f167907k;

    /* JADX INFO: renamed from: l */
    public final String f167908l;

    /* JADX INFO: renamed from: m */
    public final int f167909m;

    /* JADX INFO: renamed from: n */
    public final int f167910n;

    /* JADX INFO: renamed from: o */
    public final int f167911o;

    /* JADX INFO: renamed from: p */
    public final int f167912p;

    /* JADX INFO: renamed from: q */
    public int f167913q;

    /* JADX INFO: renamed from: r */
    public int f167914r;

    /* JADX INFO: renamed from: s */
    public String f167915s;

    /* JADX INFO: renamed from: t */
    public int f167916t;

    /* JADX INFO: renamed from: u */
    public Paint f167917u;

    public t600(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z) {
        this.f167897a = t100.m186890d(14.0f);
        this.f167913q = 0;
        this.f167914r = 0;
        this.f167916t = -1;
        this.f167897a = t100.m186890d(i6 > 0 ? i6 : 15.0f);
        m187356b(context, i4, i5, f, z);
        this.f167908l = str;
        int iMeasureText = (int) this.f167899c.measureText(str);
        this.f167909m = i;
        this.f167911o = i2;
        int i7 = (int) (iMeasureText + (this.f167901e * 2.0f));
        int iMin = i3 == -1 ? i7 : Math.min(i7, i3 - this.f167914r);
        this.f167910n = iMin;
        int i8 = (int) (this.f167900d + (this.f167902f * 2.0f) + (this.f167903g * 2.0f));
        this.f167912p = i8;
        setBounds(0, 0, iMin + this.f167914r, i8);
        this.f167916t = i3;
        if (i3 != -1) {
            int i9 = this.f167914r;
            if (i7 > i3 - i9) {
                m187355a((i3 - i9) - ((int) (this.f167901e * 2.0f)));
            } else {
                this.f167915s = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m187355a(int i) {
        if (!NullChecker.m81303a(this.f167908l) || i <= 0 || this.f167908l.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f167908l.length(); i2++) {
            String strConcat = this.f167908l.substring(0, i2).concat("...");
            if (this.f167899c.measureText(strConcat) > i) {
                return;
            }
            this.f167915s = strConcat;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m187356b(Context context, int i, int i2, float f, boolean z) {
        if (this.f167897a == this.f167907k && NullChecker.m81303a(this.f167899c)) {
            return;
        }
        this.f167907k = this.f167897a;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        this.f167899c = textPaint;
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textPaint.setTypeface(eqh0.m117752c(2));
        }
        this.f167899c.setTextSize(this.f167907k);
        this.f167899c.setAntiAlias(true);
        Paint paint = this.f167899c;
        paint.setFlags(paint.getFlags() | 128);
        this.f167901e = 17.0f * f2;
        this.f167902f = 8.0f * f2;
        this.f167903g = f * f2;
        this.f167914r = (int) (i * f2);
        Paint paint2 = new Paint();
        this.f167898b = paint2;
        paint2.setAntiAlias(true);
        this.f167904h = i2;
        this.f167905i = this.f167899c.getFontMetrics().ascent;
        float f3 = this.f167899c.getFontMetrics().descent;
        this.f167906j = f3;
        this.f167900d = (int) (f3 - this.f167905i);
    }

    /* JADX INFO: renamed from: c */
    public t600 m187357c(@ColorInt int i, float f) {
        if (this.f167917u == null) {
            this.f167917u = new Paint();
        }
        this.f167917u.setStrokeWidth(f);
        this.f167917u.setColor(i);
        this.f167917u.setAntiAlias(true);
        this.f167917u.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f167916t == -1) {
            canvas.getClipBounds(f167896v);
            int width = f167896v.width() == 0 ? canvas.getWidth() : f167896v.width();
            int i = this.f167910n;
            boolean z = width < i;
            if (z) {
                i = width;
            }
            this.f167898b.setColor(this.f167911o);
            float f = this.f167903g;
            RectF rectF = new RectF(0.0f, f, i, this.f167912p - f);
            int i2 = this.f167904h;
            canvas.drawRoundRect(rectF, i2, i2, this.f167898b);
            Paint paint = this.f167917u;
            if (paint != null) {
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                float f2 = rectF.top + strokeWidth;
                rectF.top = f2;
                rectF.right = f2 - strokeWidth;
                rectF.bottom -= strokeWidth;
                int i3 = this.f167904h;
                canvas.drawRoundRect(rectF, i3, i3, this.f167917u);
            }
            if (z) {
                canvas.save();
                canvas.scale((width * 1.0f) / this.f167910n, 1.0f);
            }
            this.f167899c.setColor(this.f167909m);
            if (NullChecker.m81303a(this.f167908l)) {
                canvas.drawText(this.f167908l, this.f167901e, ((this.f167912p - this.f167903g) - this.f167902f) - this.f167906j, this.f167899c);
            }
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        int i4 = this.f167913q;
        Paint paint2 = this.f167898b;
        if (i4 <= 0) {
            paint2.setColor(this.f167911o);
            float f3 = this.f167903g;
            RectF rectF2 = new RectF(0.0f, f3, this.f167910n, this.f167912p - f3);
            int i5 = this.f167904h;
            canvas.drawRoundRect(rectF2, i5, i5, this.f167898b);
            Paint paint3 = this.f167917u;
            if (paint3 != null) {
                float strokeWidth2 = (paint3.getStrokeWidth() / 2.0f) + 1.0f;
                rectF2.left += strokeWidth2;
                rectF2.top += strokeWidth2;
                rectF2.right -= strokeWidth2;
                rectF2.bottom -= strokeWidth2;
                int i6 = this.f167904h;
                canvas.drawRoundRect(rectF2, i6, i6, this.f167917u);
            }
            if (NullChecker.m81303a(this.f167915s)) {
                this.f167899c.setColor(this.f167909m);
                canvas.drawText(this.f167915s, this.f167901e, ((this.f167912p - this.f167903g) - this.f167902f) - this.f167906j, this.f167899c);
                return;
            }
            return;
        }
        paint2.setColor(0);
        new RectF(0.0f, 0.0f, this.f167910n, this.f167913q + (this.f167903g * 2.0f));
        this.f167898b.setColor(this.f167911o);
        RectF rectF3 = new RectF(0.0f, 0.0f, this.f167910n, this.f167913q);
        int i7 = this.f167904h;
        canvas.drawRoundRect(rectF3, i7, i7, this.f167898b);
        Paint paint4 = this.f167917u;
        if (paint4 != null) {
            float strokeWidth3 = (paint4.getStrokeWidth() / 2.0f) + 1.0f;
            rectF3.left += strokeWidth3;
            rectF3.top += strokeWidth3;
            rectF3.right -= strokeWidth3;
            rectF3.bottom -= strokeWidth3;
            int i8 = this.f167904h;
            canvas.drawRoundRect(rectF3, i8, i8, this.f167917u);
        }
        if (NullChecker.m81303a(this.f167915s)) {
            this.f167899c.setColor(this.f167909m);
            String str = this.f167915s;
            float f4 = this.f167901e;
            float f5 = this.f167906j;
            canvas.drawText(str, f4, (((f5 - this.f167905i) / 2.0f) - f5) + rectF3.centerY(), this.f167899c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f167912p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f167910n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f167912p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f167910n;
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
        this.f167913q = i7;
    }
}
