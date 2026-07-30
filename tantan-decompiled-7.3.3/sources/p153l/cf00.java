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

/* JADX INFO: loaded from: classes4.dex */
public class cf00 extends Drawable {

    /* JADX INFO: renamed from: v */
    public static Rect f81445v = new Rect();

    /* JADX INFO: renamed from: a */
    public int f81446a;

    /* JADX INFO: renamed from: b */
    public Paint f81447b;

    /* JADX INFO: renamed from: c */
    public Paint f81448c;

    /* JADX INFO: renamed from: d */
    public int f81449d;

    /* JADX INFO: renamed from: e */
    public float f81450e;

    /* JADX INFO: renamed from: f */
    public float f81451f;

    /* JADX INFO: renamed from: g */
    public float f81452g;

    /* JADX INFO: renamed from: h */
    public int f81453h;

    /* JADX INFO: renamed from: i */
    public float f81454i;

    /* JADX INFO: renamed from: j */
    public float f81455j;

    /* JADX INFO: renamed from: k */
    public int f81456k;

    /* JADX INFO: renamed from: l */
    public final String f81457l;

    /* JADX INFO: renamed from: m */
    public final int f81458m;

    /* JADX INFO: renamed from: n */
    public final int f81459n;

    /* JADX INFO: renamed from: o */
    public final int f81460o;

    /* JADX INFO: renamed from: p */
    public final int f81461p;

    /* JADX INFO: renamed from: q */
    public int f81462q;

    /* JADX INFO: renamed from: r */
    public int f81463r;

    /* JADX INFO: renamed from: s */
    public String f81464s;

    /* JADX INFO: renamed from: t */
    public int f81465t;

    /* JADX INFO: renamed from: u */
    public Paint f81466u;

    public cf00(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z) {
        this.f81446a = qa00.m175859d(14.0f);
        this.f81462q = 0;
        this.f81463r = 0;
        this.f81465t = -1;
        this.f81446a = qa00.m175859d(i6 > 0 ? i6 : 15.0f);
        m109504b(context, i4, i5, f, z);
        this.f81457l = str;
        int iMeasureText = (int) this.f81448c.measureText(str);
        this.f81458m = i;
        this.f81460o = i2;
        int i7 = (int) (iMeasureText + (this.f81450e * 2.0f));
        int iMin = i3 == -1 ? i7 : Math.min(i7, i3 - this.f81463r);
        this.f81459n = iMin;
        int i8 = (int) (this.f81449d + (this.f81451f * 2.0f) + (this.f81452g * 2.0f));
        this.f81461p = i8;
        setBounds(0, 0, iMin + this.f81463r, i8);
        this.f81465t = i3;
        if (i3 != -1) {
            int i9 = this.f81463r;
            if (i7 > i3 - i9) {
                m109503a((i3 - i9) - ((int) (this.f81450e * 2.0f)));
            } else {
                this.f81464s = str;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m109503a(int i) {
        if (!NullChecker.m82486a(this.f81457l) || i <= 0 || this.f81457l.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f81457l.length(); i2++) {
            String strConcat = this.f81457l.substring(0, i2).concat("...");
            if (this.f81448c.measureText(strConcat) > i) {
                return;
            }
            this.f81464s = strConcat;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m109504b(Context context, int i, int i2, float f, boolean z) {
        if (this.f81446a == this.f81456k && NullChecker.m82486a(this.f81448c)) {
            return;
        }
        this.f81456k = this.f81446a;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        this.f81448c = textPaint;
        if (z) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textPaint.setTypeface(lyh0.m156283c(2));
        }
        this.f81448c.setTextSize(this.f81456k);
        this.f81448c.setAntiAlias(true);
        Paint paint = this.f81448c;
        paint.setFlags(paint.getFlags() | 128);
        this.f81450e = 17.0f * f2;
        this.f81451f = 8.0f * f2;
        this.f81452g = f * f2;
        this.f81463r = (int) (i * f2);
        Paint paint2 = new Paint();
        this.f81447b = paint2;
        paint2.setAntiAlias(true);
        this.f81453h = i2;
        this.f81454i = this.f81448c.getFontMetrics().ascent;
        float f3 = this.f81448c.getFontMetrics().descent;
        this.f81455j = f3;
        this.f81449d = (int) (f3 - this.f81454i);
    }

    /* JADX INFO: renamed from: c */
    public cf00 m109505c(@ColorInt int i, float f) {
        if (this.f81466u == null) {
            this.f81466u = new Paint();
        }
        this.f81466u.setStrokeWidth(f);
        this.f81466u.setColor(i);
        this.f81466u.setAntiAlias(true);
        this.f81466u.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f81465t == -1) {
            canvas.getClipBounds(f81445v);
            int width = f81445v.width() == 0 ? canvas.getWidth() : f81445v.width();
            int i = this.f81459n;
            boolean z = width < i;
            if (z) {
                i = width;
            }
            this.f81447b.setColor(this.f81460o);
            float f = this.f81452g;
            RectF rectF = new RectF(0.0f, f, i, this.f81461p - f);
            int i2 = this.f81453h;
            canvas.drawRoundRect(rectF, i2, i2, this.f81447b);
            Paint paint = this.f81466u;
            if (paint != null) {
                float strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                float f2 = rectF.top + strokeWidth;
                rectF.top = f2;
                rectF.right = f2 - strokeWidth;
                rectF.bottom -= strokeWidth;
                int i3 = this.f81453h;
                canvas.drawRoundRect(rectF, i3, i3, this.f81466u);
            }
            if (z) {
                canvas.save();
                canvas.scale((width * 1.0f) / this.f81459n, 1.0f);
            }
            this.f81448c.setColor(this.f81458m);
            if (NullChecker.m82486a(this.f81457l)) {
                canvas.drawText(this.f81457l, this.f81450e, ((this.f81461p - this.f81452g) - this.f81451f) - this.f81455j, this.f81448c);
            }
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        int i4 = this.f81462q;
        Paint paint2 = this.f81447b;
        if (i4 <= 0) {
            paint2.setColor(this.f81460o);
            float f3 = this.f81452g;
            RectF rectF2 = new RectF(0.0f, f3, this.f81459n, this.f81461p - f3);
            int i5 = this.f81453h;
            canvas.drawRoundRect(rectF2, i5, i5, this.f81447b);
            Paint paint3 = this.f81466u;
            if (paint3 != null) {
                float strokeWidth2 = (paint3.getStrokeWidth() / 2.0f) + 1.0f;
                rectF2.left += strokeWidth2;
                rectF2.top += strokeWidth2;
                rectF2.right -= strokeWidth2;
                rectF2.bottom -= strokeWidth2;
                int i6 = this.f81453h;
                canvas.drawRoundRect(rectF2, i6, i6, this.f81466u);
            }
            if (NullChecker.m82486a(this.f81464s)) {
                this.f81448c.setColor(this.f81458m);
                canvas.drawText(this.f81464s, this.f81450e, ((this.f81461p - this.f81452g) - this.f81451f) - this.f81455j, this.f81448c);
                return;
            }
            return;
        }
        paint2.setColor(0);
        new RectF(0.0f, 0.0f, this.f81459n, this.f81462q + (this.f81452g * 2.0f));
        this.f81447b.setColor(this.f81460o);
        RectF rectF3 = new RectF(0.0f, 0.0f, this.f81459n, this.f81462q);
        int i7 = this.f81453h;
        canvas.drawRoundRect(rectF3, i7, i7, this.f81447b);
        Paint paint4 = this.f81466u;
        if (paint4 != null) {
            float strokeWidth3 = (paint4.getStrokeWidth() / 2.0f) + 1.0f;
            rectF3.left += strokeWidth3;
            rectF3.top += strokeWidth3;
            rectF3.right -= strokeWidth3;
            rectF3.bottom -= strokeWidth3;
            int i8 = this.f81453h;
            canvas.drawRoundRect(rectF3, i8, i8, this.f81466u);
        }
        if (NullChecker.m82486a(this.f81464s)) {
            this.f81448c.setColor(this.f81458m);
            String str = this.f81464s;
            float f4 = this.f81450e;
            float f5 = this.f81455j;
            canvas.drawText(str, f4, (((f5 - this.f81454i) / 2.0f) - f5) + rectF3.centerY(), this.f81448c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f81461p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f81459n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f81461p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f81459n;
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

    public cf00(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, int i6, boolean z, int i7) {
        this(context, str, i, i2, i3, i4, i5, f, i6, z);
        this.f81462q = i7;
    }
}
