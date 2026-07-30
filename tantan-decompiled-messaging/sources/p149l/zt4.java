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
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class zt4 extends Drawable {

    /* JADX INFO: renamed from: r */
    public static Paint f204670r;

    /* JADX INFO: renamed from: s */
    public static float f204671s;

    /* JADX INFO: renamed from: t */
    public static HashMap<Integer, Paint> f204672t = new HashMap<>();

    /* JADX INFO: renamed from: u */
    public static Rect f204673u = new Rect();

    /* JADX INFO: renamed from: a */
    public Paint f204674a;

    /* JADX INFO: renamed from: b */
    public int f204675b;

    /* JADX INFO: renamed from: c */
    public float f204676c;

    /* JADX INFO: renamed from: d */
    public int f204677d;

    /* JADX INFO: renamed from: e */
    public float f204678e;

    /* JADX INFO: renamed from: f */
    public float f204679f;

    /* JADX INFO: renamed from: g */
    public float f204680g;

    /* JADX INFO: renamed from: h */
    public float f204681h;

    /* JADX INFO: renamed from: i */
    public final String f204682i;

    /* JADX INFO: renamed from: j */
    public final int f204683j;

    /* JADX INFO: renamed from: k */
    public final int f204684k;

    /* JADX INFO: renamed from: l */
    public final int f204685l;

    /* JADX INFO: renamed from: m */
    public final int f204686m;

    /* JADX INFO: renamed from: n */
    public int f204687n;

    /* JADX INFO: renamed from: o */
    public String f204688o;

    /* JADX INFO: renamed from: p */
    public int f204689p;

    /* JADX INFO: renamed from: q */
    public Paint f204690q;

    public zt4(Context context, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, int i7, float f4, boolean z) {
        this.f204687n = 0;
        this.f204689p = -1;
        int iM220090c = m220090c(i2);
        if (f204672t.get(Integer.valueOf(iM220090c)) == null) {
            m220091d(context, iM220090c);
        }
        this.f204674a = f204672t.get(Integer.valueOf(iM220090c));
        this.f204680g = m220089b(f2);
        this.f204681h = m220089b(f3);
        this.f204676c = m220089b(f);
        this.f204687n = m220090c(i5);
        this.f204677d = i6;
        Paint paint = this.f204674a;
        if (z) {
            paint.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            paint.setTypeface(eqh0.m117752c(2));
        }
        this.f204678e = this.f204674a.getFontMetrics().ascent;
        float f5 = this.f204674a.getFontMetrics().descent;
        this.f204679f = f5;
        this.f204675b = (int) (f5 - this.f204678e);
        this.f204682i = str;
        int iMeasureText = (int) this.f204674a.measureText(str);
        this.f204683j = i;
        this.f204685l = i3;
        int i8 = (int) (iMeasureText + (this.f204680g * 2.0f));
        int iMin = i4 == -1 ? i8 : Math.min(i8, i4 - this.f204687n);
        this.f204684k = iMin;
        int i9 = (int) (this.f204675b + (this.f204681h * 2.0f) + (this.f204676c * 2.0f) + (f4 * 2.0f));
        this.f204686m = i9;
        m220093e(i7, f4);
        setBounds(0, 0, iMin + this.f204687n, i9);
        this.f204689p = i4;
        if (i4 != -1) {
            int i10 = this.f204687n;
            if (i8 > i4 - i10) {
                m220092a((i4 - i10) - ((int) (this.f204680g * 2.0f)));
            } else {
                this.f204688o = str;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m220089b(float f) {
        return Math.round(t100.m186889c().density * f);
    }

    /* JADX INFO: renamed from: c */
    public static int m220090c(int i) {
        return Math.round(t100.m186889c().density * i);
    }

    /* JADX INFO: renamed from: d */
    public static void m220091d(Context context, int i) {
        f204671s = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(eqh0.m117752c(2));
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setFlags(textPaint.getFlags() | 128);
        Paint paint = new Paint();
        f204670r = paint;
        paint.setAntiAlias(true);
        f204672t.put(Integer.valueOf(i), textPaint);
    }

    /* JADX INFO: renamed from: a */
    public final void m220092a(int i) {
        if (!NullChecker.m81303a(this.f204682i) || i <= 0 || this.f204682i.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f204682i.length(); i2++) {
            String strConcat = this.f204682i.substring(0, i2).concat("...");
            if (this.f204674a.measureText(strConcat) > i) {
                return;
            }
            this.f204688o = strConcat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float strokeWidth = 0.0f;
        if (this.f204689p != -1) {
            f204670r.setColor(this.f204685l);
            float f = this.f204676c;
            RectF rectF = new RectF(0.0f, f, this.f204684k, this.f204686m - f);
            int i = this.f204677d;
            canvas.drawRoundRect(rectF, i, i, f204670r);
            Paint paint = this.f204690q;
            if (paint != null) {
                strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                rectF.top += strokeWidth;
                rectF.right -= strokeWidth;
                rectF.bottom -= strokeWidth;
                int i2 = this.f204677d;
                canvas.drawRoundRect(rectF, i2, i2, this.f204690q);
            }
            if (NullChecker.m81303a(this.f204688o)) {
                this.f204674a.setColor(this.f204683j);
                canvas.drawText(this.f204688o, this.f204680g, (((this.f204686m - strokeWidth) - this.f204676c) - this.f204681h) - this.f204679f, this.f204674a);
                return;
            }
            return;
        }
        canvas.getClipBounds(f204673u);
        int width = f204673u.width() == 0 ? canvas.getWidth() : f204673u.width();
        int i3 = this.f204684k;
        boolean z = width < i3;
        if (z) {
            i3 = width;
        }
        f204670r.setColor(this.f204685l);
        float f2 = this.f204676c;
        RectF rectF2 = new RectF(0.0f, f2, i3, this.f204686m - f2);
        int i4 = this.f204677d;
        canvas.drawRoundRect(rectF2, i4, i4, f204670r);
        Paint paint2 = this.f204690q;
        if (paint2 != null) {
            strokeWidth = (paint2.getStrokeWidth() / 2.0f) + 1.0f;
            rectF2.left += strokeWidth;
            float f3 = rectF2.top + strokeWidth;
            rectF2.top = f3;
            rectF2.right = f3 - strokeWidth;
            rectF2.bottom -= strokeWidth;
            int i5 = this.f204677d;
            canvas.drawRoundRect(rectF2, i5, i5, this.f204690q);
        }
        if (z) {
            canvas.save();
            canvas.scale((width * 1.0f) / this.f204684k, 1.0f);
        }
        this.f204674a.setColor(this.f204683j);
        if (NullChecker.m81303a(this.f204682i)) {
            canvas.drawText(this.f204682i, this.f204680g, (((this.f204686m - strokeWidth) - this.f204676c) - this.f204681h) - this.f204679f, this.f204674a);
        }
        if (z) {
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: e */
    public zt4 m220093e(@ColorInt int i, float f) {
        if (this.f204690q == null) {
            this.f204690q = new Paint();
        }
        this.f204690q.setStrokeWidth(f);
        this.f204690q.setColor(i);
        this.f204690q.setAntiAlias(true);
        this.f204690q.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f204686m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f204684k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f204686m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f204684k;
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
}
