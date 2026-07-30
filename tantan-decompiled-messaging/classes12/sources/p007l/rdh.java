package p007l;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rdh extends Drawable {

    /* JADX INFO: renamed from: v */
    public static Rect f12599v = new Rect();

    /* JADX INFO: renamed from: a */
    public int f12600a;

    /* JADX INFO: renamed from: b */
    public Paint f12601b;

    /* JADX INFO: renamed from: c */
    public Paint f12602c;

    /* JADX INFO: renamed from: d */
    public int f12603d;

    /* JADX INFO: renamed from: e */
    public float f12604e;

    /* JADX INFO: renamed from: f */
    public float f12605f;

    /* JADX INFO: renamed from: g */
    public float f12606g;

    /* JADX INFO: renamed from: h */
    public int f12607h;

    /* JADX INFO: renamed from: i */
    public float f12608i;

    /* JADX INFO: renamed from: j */
    public float f12609j;

    /* JADX INFO: renamed from: k */
    public int f12610k;

    /* JADX INFO: renamed from: l */
    public final String f12611l;

    /* JADX INFO: renamed from: m */
    public final int f12612m;

    /* JADX INFO: renamed from: n */
    public final int f12613n;

    /* JADX INFO: renamed from: o */
    public final int f12614o;

    /* JADX INFO: renamed from: p */
    public final int f12615p;

    /* JADX INFO: renamed from: q */
    public int f12616q;

    /* JADX INFO: renamed from: r */
    public int f12617r;

    /* JADX INFO: renamed from: s */
    public String f12618s;

    /* JADX INFO: renamed from: t */
    public int f12619t;

    /* JADX INFO: renamed from: u */
    public Paint f12620u;

    public rdh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z) {
        this.f12600a = t100.d(14.0f);
        this.f12616q = 0;
        this.f12617r = 0;
        this.f12619t = -1;
        this.f12600a = t100.d(i6 > 0 ? i6 : 15.0f);
        m13896b(context, i4, i5, f, z);
        this.f12611l = str;
        int iMeasureText = (int) this.f12602c.measureText(str);
        this.f12612m = i;
        this.f12614o = i2;
        int i7 = (int) (iMeasureText + (this.f12604e * 2.0f));
        int iMin = i3 == -1 ? i7 : Math.min(i7, i3 - this.f12617r);
        this.f12613n = iMin;
        int i8 = (int) (this.f12603d + (this.f12605f * 2.0f) + (this.f12606g * 2.0f));
        this.f12615p = i8;
        setBounds(0, 0, iMin + this.f12617r, i8);
        this.f12619t = i3;
        if (i3 != -1) {
            int i9 = this.f12617r;
            if (i7 > i3 - i9) {
                m13895a((i3 - i9) - ((int) (this.f12604e * 2.0f)));
            } else {
                this.f12618s = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13895a(int i) {
        if (!NullChecker.a(this.f12611l) || i <= 0 || this.f12611l.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f12611l.length(); i2++) {
            String strConcat = this.f12611l.substring(0, i2).concat("...");
            if (this.f12602c.measureText(strConcat) > i) {
                return;
            }
            this.f12618s = strConcat;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m13896b(Context context, int i, int i2, float f, boolean z) {
        if (this.f12600a == this.f12610k && NullChecker.a(this.f12602c)) {
            return;
        }
        this.f12610k = this.f12600a;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        this.f12602c = textPaint;
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textPaint.setTypeface(eqh0.c(2));
        }
        this.f12602c.setTextSize(this.f12610k);
        this.f12602c.setAntiAlias(true);
        Paint paint = this.f12602c;
        paint.setFlags(paint.getFlags() | 128);
        this.f12604e = 17.0f * f2;
        this.f12605f = 8.0f * f2;
        this.f12606g = f * f2;
        this.f12617r = (int) (i * f2);
        Paint paint2 = new Paint();
        this.f12601b = paint2;
        paint2.setAntiAlias(true);
        this.f12607h = i2;
        this.f12608i = this.f12602c.getFontMetrics().ascent;
        float f3 = this.f12602c.getFontMetrics().descent;
        this.f12609j = f3;
        this.f12603d = (int) (f3 - this.f12608i);
    }

    /* JADX INFO: renamed from: c */
    public rdh m13897c(@ColorInt int i, float f) {
        if (this.f12620u == null) {
            this.f12620u = new Paint();
        }
        this.f12620u.setStrokeWidth(f);
        this.f12620u.setColor(i);
        this.f12620u.setAntiAlias(true);
        this.f12620u.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f12619t == -1) {
            canvas.getClipBounds(f12599v);
            int width = f12599v.width() == 0 ? canvas.getWidth() : f12599v.width();
            int i = this.f12613n;
            boolean z = width < i;
            if (z) {
                i = width;
            }
            this.f12601b.setColor(this.f12614o);
            float f = this.f12606g;
            RectF rectF = new RectF(0.0f, f, i, this.f12615p - f);
            int i2 = this.f12607h;
            canvas.drawRoundRect(rectF, i2, i2, this.f12601b);
            Paint paint = this.f12620u;
            if (paint != null) {
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                float f2 = rectF.top + strokeWidth;
                rectF.top = f2;
                rectF.right = f2 - strokeWidth;
                rectF.bottom -= strokeWidth;
                int i3 = this.f12607h;
                canvas.drawRoundRect(rectF, i3, i3, this.f12620u);
            }
            if (z) {
                canvas.save();
                canvas.scale((width * 1.0f) / this.f12613n, 1.0f);
            }
            this.f12602c.setColor(this.f12612m);
            if (NullChecker.a(this.f12611l)) {
                canvas.drawText(this.f12611l, this.f12604e, ((this.f12615p - this.f12606g) - this.f12605f) - this.f12609j, this.f12602c);
            }
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        int i4 = this.f12616q;
        Paint paint2 = this.f12601b;
        if (i4 <= 0) {
            paint2.setColor(this.f12614o);
            float f3 = this.f12606g;
            RectF rectF2 = new RectF(0.0f, f3, this.f12613n, this.f12615p - f3);
            int i5 = this.f12607h;
            canvas.drawRoundRect(rectF2, i5, i5, this.f12601b);
            Paint paint3 = this.f12620u;
            if (paint3 != null) {
                float strokeWidth2 = (paint3.getStrokeWidth() / 2.0f) + 1.0f;
                rectF2.left += strokeWidth2;
                rectF2.top += strokeWidth2;
                rectF2.right -= strokeWidth2;
                rectF2.bottom -= strokeWidth2;
                int i6 = this.f12607h;
                canvas.drawRoundRect(rectF2, i6, i6, this.f12620u);
            }
            if (NullChecker.a(this.f12618s)) {
                this.f12602c.setColor(this.f12612m);
                canvas.drawText(this.f12618s, this.f12604e, ((this.f12615p - this.f12606g) - this.f12605f) - this.f12609j, this.f12602c);
                return;
            }
            return;
        }
        paint2.setColor(0);
        new RectF(0.0f, 0.0f, this.f12613n, this.f12616q + (this.f12606g * 2.0f));
        this.f12601b.setColor(this.f12614o);
        RectF rectF3 = new RectF(0.0f, 0.0f, this.f12613n, this.f12616q);
        int i7 = this.f12607h;
        canvas.drawRoundRect(rectF3, i7, i7, this.f12601b);
        Paint paint4 = this.f12620u;
        if (paint4 != null) {
            float strokeWidth3 = (paint4.getStrokeWidth() / 2.0f) + 1.0f;
            rectF3.left += strokeWidth3;
            rectF3.top += strokeWidth3;
            rectF3.right -= strokeWidth3;
            rectF3.bottom -= strokeWidth3;
            int i8 = this.f12607h;
            canvas.drawRoundRect(rectF3, i8, i8, this.f12620u);
        }
        if (NullChecker.a(this.f12618s)) {
            this.f12602c.setColor(this.f12612m);
            String str = this.f12618s;
            float f4 = this.f12604e;
            float f5 = this.f12609j;
            canvas.drawText(str, f4, (((f5 - this.f12608i) / 2.0f) - f5) + rectF3.centerY(), this.f12602c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12615p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12613n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f12615p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f12613n;
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

    public rdh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z, int i7) {
        this(context, str, i, i2, i3, i4, i5, f, i6, z);
        this.f12616q = i7;
    }
}
