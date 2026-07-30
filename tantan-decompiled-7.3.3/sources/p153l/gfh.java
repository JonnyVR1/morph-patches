package p153l;

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

/* JADX INFO: loaded from: classes13.dex */
public class gfh extends Drawable {

    /* JADX INFO: renamed from: v */
    public static Rect f103907v = new Rect();

    /* JADX INFO: renamed from: a */
    public int f103908a;

    /* JADX INFO: renamed from: b */
    public Paint f103909b;

    /* JADX INFO: renamed from: c */
    public Paint f103910c;

    /* JADX INFO: renamed from: d */
    public int f103911d;

    /* JADX INFO: renamed from: e */
    public float f103912e;

    /* JADX INFO: renamed from: f */
    public float f103913f;

    /* JADX INFO: renamed from: g */
    public float f103914g;

    /* JADX INFO: renamed from: h */
    public int f103915h;

    /* JADX INFO: renamed from: i */
    public float f103916i;

    /* JADX INFO: renamed from: j */
    public float f103917j;

    /* JADX INFO: renamed from: k */
    public int f103918k;

    /* JADX INFO: renamed from: l */
    public final String f103919l;

    /* JADX INFO: renamed from: m */
    public final int f103920m;

    /* JADX INFO: renamed from: n */
    public final int f103921n;

    /* JADX INFO: renamed from: o */
    public final int f103922o;

    /* JADX INFO: renamed from: p */
    public final int f103923p;

    /* JADX INFO: renamed from: q */
    public int f103924q;

    /* JADX INFO: renamed from: r */
    public int f103925r;

    /* JADX INFO: renamed from: s */
    public String f103926s;

    /* JADX INFO: renamed from: t */
    public int f103927t;

    /* JADX INFO: renamed from: u */
    public Paint f103928u;

    public gfh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z) {
        this.f103908a = qa00.m175859d(14.0f);
        this.f103924q = 0;
        this.f103925r = 0;
        this.f103927t = -1;
        this.f103908a = qa00.m175859d(i6 > 0 ? i6 : 15.0f);
        m130056b(context, i4, i5, f, z);
        this.f103919l = str;
        int iMeasureText = (int) this.f103910c.measureText(str);
        this.f103920m = i;
        this.f103922o = i2;
        int i7 = (int) (iMeasureText + (this.f103912e * 2.0f));
        int iMin = i3 == -1 ? i7 : Math.min(i7, i3 - this.f103925r);
        this.f103921n = iMin;
        int i8 = (int) (this.f103911d + (this.f103913f * 2.0f) + (this.f103914g * 2.0f));
        this.f103923p = i8;
        setBounds(0, 0, iMin + this.f103925r, i8);
        this.f103927t = i3;
        if (i3 != -1) {
            int i9 = this.f103925r;
            if (i7 > i3 - i9) {
                m130055a((i3 - i9) - ((int) (this.f103912e * 2.0f)));
            } else {
                this.f103926s = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m130055a(int i) {
        if (!NullChecker.m82486a(this.f103919l) || i <= 0 || this.f103919l.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f103919l.length(); i2++) {
            String strConcat = this.f103919l.substring(0, i2).concat("...");
            if (this.f103910c.measureText(strConcat) > i) {
                return;
            }
            this.f103926s = strConcat;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m130056b(Context context, int i, int i2, float f, boolean z) {
        if (this.f103908a == this.f103918k && NullChecker.m82486a(this.f103910c)) {
            return;
        }
        this.f103918k = this.f103908a;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        this.f103910c = textPaint;
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textPaint.setTypeface(lyh0.m156283c(2));
        }
        this.f103910c.setTextSize(this.f103918k);
        this.f103910c.setAntiAlias(true);
        Paint paint = this.f103910c;
        paint.setFlags(paint.getFlags() | 128);
        this.f103912e = 17.0f * f2;
        this.f103913f = 8.0f * f2;
        this.f103914g = f * f2;
        this.f103925r = (int) (i * f2);
        Paint paint2 = new Paint();
        this.f103909b = paint2;
        paint2.setAntiAlias(true);
        this.f103915h = i2;
        this.f103916i = this.f103910c.getFontMetrics().ascent;
        float f3 = this.f103910c.getFontMetrics().descent;
        this.f103917j = f3;
        this.f103911d = (int) (f3 - this.f103916i);
    }

    /* JADX INFO: renamed from: c */
    public gfh m130057c(@ColorInt int i, float f) {
        if (this.f103928u == null) {
            this.f103928u = new Paint();
        }
        this.f103928u.setStrokeWidth(f);
        this.f103928u.setColor(i);
        this.f103928u.setAntiAlias(true);
        this.f103928u.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f103927t == -1) {
            canvas.getClipBounds(f103907v);
            int width = f103907v.width() == 0 ? canvas.getWidth() : f103907v.width();
            int i = this.f103921n;
            boolean z = width < i;
            if (z) {
                i = width;
            }
            this.f103909b.setColor(this.f103922o);
            float f = this.f103914g;
            RectF rectF = new RectF(0.0f, f, i, this.f103923p - f);
            int i2 = this.f103915h;
            canvas.drawRoundRect(rectF, i2, i2, this.f103909b);
            Paint paint = this.f103928u;
            if (paint != null) {
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                float f2 = rectF.top + strokeWidth;
                rectF.top = f2;
                rectF.right = f2 - strokeWidth;
                rectF.bottom -= strokeWidth;
                int i3 = this.f103915h;
                canvas.drawRoundRect(rectF, i3, i3, this.f103928u);
            }
            if (z) {
                canvas.save();
                canvas.scale((width * 1.0f) / this.f103921n, 1.0f);
            }
            this.f103910c.setColor(this.f103920m);
            if (NullChecker.m82486a(this.f103919l)) {
                canvas.drawText(this.f103919l, this.f103912e, ((this.f103923p - this.f103914g) - this.f103913f) - this.f103917j, this.f103910c);
            }
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        int i4 = this.f103924q;
        Paint paint2 = this.f103909b;
        if (i4 <= 0) {
            paint2.setColor(this.f103922o);
            float f3 = this.f103914g;
            RectF rectF2 = new RectF(0.0f, f3, this.f103921n, this.f103923p - f3);
            int i5 = this.f103915h;
            canvas.drawRoundRect(rectF2, i5, i5, this.f103909b);
            Paint paint3 = this.f103928u;
            if (paint3 != null) {
                float strokeWidth2 = (paint3.getStrokeWidth() / 2.0f) + 1.0f;
                rectF2.left += strokeWidth2;
                rectF2.top += strokeWidth2;
                rectF2.right -= strokeWidth2;
                rectF2.bottom -= strokeWidth2;
                int i6 = this.f103915h;
                canvas.drawRoundRect(rectF2, i6, i6, this.f103928u);
            }
            if (NullChecker.m82486a(this.f103926s)) {
                this.f103910c.setColor(this.f103920m);
                canvas.drawText(this.f103926s, this.f103912e, ((this.f103923p - this.f103914g) - this.f103913f) - this.f103917j, this.f103910c);
                return;
            }
            return;
        }
        paint2.setColor(0);
        new RectF(0.0f, 0.0f, this.f103921n, this.f103924q + (this.f103914g * 2.0f));
        this.f103909b.setColor(this.f103922o);
        RectF rectF3 = new RectF(0.0f, 0.0f, this.f103921n, this.f103924q);
        int i7 = this.f103915h;
        canvas.drawRoundRect(rectF3, i7, i7, this.f103909b);
        Paint paint4 = this.f103928u;
        if (paint4 != null) {
            float strokeWidth3 = (paint4.getStrokeWidth() / 2.0f) + 1.0f;
            rectF3.left += strokeWidth3;
            rectF3.top += strokeWidth3;
            rectF3.right -= strokeWidth3;
            rectF3.bottom -= strokeWidth3;
            int i8 = this.f103915h;
            canvas.drawRoundRect(rectF3, i8, i8, this.f103928u);
        }
        if (NullChecker.m82486a(this.f103926s)) {
            this.f103910c.setColor(this.f103920m);
            String str = this.f103926s;
            float f4 = this.f103912e;
            float f5 = this.f103917j;
            canvas.drawText(str, f4, (((f5 - this.f103916i) / 2.0f) - f5) + rectF3.centerY(), this.f103910c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f103923p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f103921n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f103923p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f103921n;
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

    public gfh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z, int i7) {
        this(context, str, i, i2, i3, i4, i5, f, i6, z);
        this.f103924q = i7;
    }
}
