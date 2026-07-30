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

/* JADX INFO: loaded from: classes12.dex */
public class rdh extends Drawable {

    /* JADX INFO: renamed from: v */
    public static Rect f158913v = new Rect();

    /* JADX INFO: renamed from: a */
    public int f158914a;

    /* JADX INFO: renamed from: b */
    public Paint f158915b;

    /* JADX INFO: renamed from: c */
    public Paint f158916c;

    /* JADX INFO: renamed from: d */
    public int f158917d;

    /* JADX INFO: renamed from: e */
    public float f158918e;

    /* JADX INFO: renamed from: f */
    public float f158919f;

    /* JADX INFO: renamed from: g */
    public float f158920g;

    /* JADX INFO: renamed from: h */
    public int f158921h;

    /* JADX INFO: renamed from: i */
    public float f158922i;

    /* JADX INFO: renamed from: j */
    public float f158923j;

    /* JADX INFO: renamed from: k */
    public int f158924k;

    /* JADX INFO: renamed from: l */
    public final String f158925l;

    /* JADX INFO: renamed from: m */
    public final int f158926m;

    /* JADX INFO: renamed from: n */
    public final int f158927n;

    /* JADX INFO: renamed from: o */
    public final int f158928o;

    /* JADX INFO: renamed from: p */
    public final int f158929p;

    /* JADX INFO: renamed from: q */
    public int f158930q;

    /* JADX INFO: renamed from: r */
    public int f158931r;

    /* JADX INFO: renamed from: s */
    public String f158932s;

    /* JADX INFO: renamed from: t */
    public int f158933t;

    /* JADX INFO: renamed from: u */
    public Paint f158934u;

    public rdh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z) {
        this.f158914a = t100.m186890d(14.0f);
        this.f158930q = 0;
        this.f158931r = 0;
        this.f158933t = -1;
        this.f158914a = t100.m186890d(i6 > 0 ? i6 : 15.0f);
        m178964b(context, i4, i5, f, z);
        this.f158925l = str;
        int iMeasureText = (int) this.f158916c.measureText(str);
        this.f158926m = i;
        this.f158928o = i2;
        int i7 = (int) (iMeasureText + (this.f158918e * 2.0f));
        int iMin = i3 == -1 ? i7 : Math.min(i7, i3 - this.f158931r);
        this.f158927n = iMin;
        int i8 = (int) (this.f158917d + (this.f158919f * 2.0f) + (this.f158920g * 2.0f));
        this.f158929p = i8;
        setBounds(0, 0, iMin + this.f158931r, i8);
        this.f158933t = i3;
        if (i3 != -1) {
            int i9 = this.f158931r;
            if (i7 > i3 - i9) {
                m178963a((i3 - i9) - ((int) (this.f158918e * 2.0f)));
            } else {
                this.f158932s = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m178963a(int i) {
        if (!NullChecker.m81303a(this.f158925l) || i <= 0 || this.f158925l.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f158925l.length(); i2++) {
            String strConcat = this.f158925l.substring(0, i2).concat("...");
            if (this.f158916c.measureText(strConcat) > i) {
                return;
            }
            this.f158932s = strConcat;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m178964b(Context context, int i, int i2, float f, boolean z) {
        if (this.f158914a == this.f158924k && NullChecker.m81303a(this.f158916c)) {
            return;
        }
        this.f158924k = this.f158914a;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        this.f158916c = textPaint;
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textPaint.setTypeface(eqh0.m117752c(2));
        }
        this.f158916c.setTextSize(this.f158924k);
        this.f158916c.setAntiAlias(true);
        Paint paint = this.f158916c;
        paint.setFlags(paint.getFlags() | 128);
        this.f158918e = 17.0f * f2;
        this.f158919f = 8.0f * f2;
        this.f158920g = f * f2;
        this.f158931r = (int) (i * f2);
        Paint paint2 = new Paint();
        this.f158915b = paint2;
        paint2.setAntiAlias(true);
        this.f158921h = i2;
        this.f158922i = this.f158916c.getFontMetrics().ascent;
        float f3 = this.f158916c.getFontMetrics().descent;
        this.f158923j = f3;
        this.f158917d = (int) (f3 - this.f158922i);
    }

    /* JADX INFO: renamed from: c */
    public rdh m178965c(@ColorInt int i, float f) {
        if (this.f158934u == null) {
            this.f158934u = new Paint();
        }
        this.f158934u.setStrokeWidth(f);
        this.f158934u.setColor(i);
        this.f158934u.setAntiAlias(true);
        this.f158934u.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f158933t == -1) {
            canvas.getClipBounds(f158913v);
            int width = f158913v.width() == 0 ? canvas.getWidth() : f158913v.width();
            int i = this.f158927n;
            boolean z = width < i;
            if (z) {
                i = width;
            }
            this.f158915b.setColor(this.f158928o);
            float f = this.f158920g;
            RectF rectF = new RectF(0.0f, f, i, this.f158929p - f);
            int i2 = this.f158921h;
            canvas.drawRoundRect(rectF, i2, i2, this.f158915b);
            Paint paint = this.f158934u;
            if (paint != null) {
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                float f2 = rectF.top + strokeWidth;
                rectF.top = f2;
                rectF.right = f2 - strokeWidth;
                rectF.bottom -= strokeWidth;
                int i3 = this.f158921h;
                canvas.drawRoundRect(rectF, i3, i3, this.f158934u);
            }
            if (z) {
                canvas.save();
                canvas.scale((width * 1.0f) / this.f158927n, 1.0f);
            }
            this.f158916c.setColor(this.f158926m);
            if (NullChecker.m81303a(this.f158925l)) {
                canvas.drawText(this.f158925l, this.f158918e, ((this.f158929p - this.f158920g) - this.f158919f) - this.f158923j, this.f158916c);
            }
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        int i4 = this.f158930q;
        Paint paint2 = this.f158915b;
        if (i4 <= 0) {
            paint2.setColor(this.f158928o);
            float f3 = this.f158920g;
            RectF rectF2 = new RectF(0.0f, f3, this.f158927n, this.f158929p - f3);
            int i5 = this.f158921h;
            canvas.drawRoundRect(rectF2, i5, i5, this.f158915b);
            Paint paint3 = this.f158934u;
            if (paint3 != null) {
                float strokeWidth2 = (paint3.getStrokeWidth() / 2.0f) + 1.0f;
                rectF2.left += strokeWidth2;
                rectF2.top += strokeWidth2;
                rectF2.right -= strokeWidth2;
                rectF2.bottom -= strokeWidth2;
                int i6 = this.f158921h;
                canvas.drawRoundRect(rectF2, i6, i6, this.f158934u);
            }
            if (NullChecker.m81303a(this.f158932s)) {
                this.f158916c.setColor(this.f158926m);
                canvas.drawText(this.f158932s, this.f158918e, ((this.f158929p - this.f158920g) - this.f158919f) - this.f158923j, this.f158916c);
                return;
            }
            return;
        }
        paint2.setColor(0);
        new RectF(0.0f, 0.0f, this.f158927n, this.f158930q + (this.f158920g * 2.0f));
        this.f158915b.setColor(this.f158928o);
        RectF rectF3 = new RectF(0.0f, 0.0f, this.f158927n, this.f158930q);
        int i7 = this.f158921h;
        canvas.drawRoundRect(rectF3, i7, i7, this.f158915b);
        Paint paint4 = this.f158934u;
        if (paint4 != null) {
            float strokeWidth3 = (paint4.getStrokeWidth() / 2.0f) + 1.0f;
            rectF3.left += strokeWidth3;
            rectF3.top += strokeWidth3;
            rectF3.right -= strokeWidth3;
            rectF3.bottom -= strokeWidth3;
            int i8 = this.f158921h;
            canvas.drawRoundRect(rectF3, i8, i8, this.f158934u);
        }
        if (NullChecker.m81303a(this.f158932s)) {
            this.f158916c.setColor(this.f158926m);
            String str = this.f158932s;
            float f4 = this.f158918e;
            float f5 = this.f158923j;
            canvas.drawText(str, f4, (((f5 - this.f158922i) / 2.0f) - f5) + rectF3.centerY(), this.f158916c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f158929p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f158927n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f158929p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f158927n;
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
        this.f158930q = i7;
    }
}
