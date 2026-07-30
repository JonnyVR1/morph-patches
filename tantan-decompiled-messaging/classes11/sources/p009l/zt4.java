package p009l;

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
import l.eqh0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zt4 extends Drawable {

    /* JADX INFO: renamed from: r */
    public static Paint f23875r;

    /* JADX INFO: renamed from: s */
    public static float f23876s;

    /* JADX INFO: renamed from: t */
    public static HashMap<Integer, Paint> f23877t = new HashMap<>();

    /* JADX INFO: renamed from: u */
    public static Rect f23878u = new Rect();

    /* JADX INFO: renamed from: a */
    public Paint f23879a;

    /* JADX INFO: renamed from: b */
    public int f23880b;

    /* JADX INFO: renamed from: c */
    public float f23881c;

    /* JADX INFO: renamed from: d */
    public int f23882d;

    /* JADX INFO: renamed from: e */
    public float f23883e;

    /* JADX INFO: renamed from: f */
    public float f23884f;

    /* JADX INFO: renamed from: g */
    public float f23885g;

    /* JADX INFO: renamed from: h */
    public float f23886h;

    /* JADX INFO: renamed from: i */
    public final String f23887i;

    /* JADX INFO: renamed from: j */
    public final int f23888j;

    /* JADX INFO: renamed from: k */
    public final int f23889k;

    /* JADX INFO: renamed from: l */
    public final int f23890l;

    /* JADX INFO: renamed from: m */
    public final int f23891m;

    /* JADX INFO: renamed from: n */
    public int f23892n;

    /* JADX INFO: renamed from: o */
    public String f23893o;

    /* JADX INFO: renamed from: p */
    public int f23894p;

    /* JADX INFO: renamed from: q */
    public Paint f23895q;

    public zt4(Context context, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, int i7, float f4, boolean z) {
        this.f23892n = 0;
        this.f23894p = -1;
        int iM25957c = m25957c(i2);
        if (f23877t.get(Integer.valueOf(iM25957c)) == null) {
            m25958d(context, iM25957c);
        }
        this.f23879a = f23877t.get(Integer.valueOf(iM25957c));
        this.f23885g = m25956b(f2);
        this.f23886h = m25956b(f3);
        this.f23881c = m25956b(f);
        this.f23892n = m25957c(i5);
        this.f23882d = i6;
        Paint paint = this.f23879a;
        if (z) {
            paint.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            paint.setTypeface(eqh0.c(2));
        }
        this.f23883e = this.f23879a.getFontMetrics().ascent;
        float f5 = this.f23879a.getFontMetrics().descent;
        this.f23884f = f5;
        this.f23880b = (int) (f5 - this.f23883e);
        this.f23887i = str;
        int iMeasureText = (int) this.f23879a.measureText(str);
        this.f23888j = i;
        this.f23890l = i3;
        int i8 = (int) (iMeasureText + (this.f23885g * 2.0f));
        int iMin = i4 == -1 ? i8 : Math.min(i8, i4 - this.f23892n);
        this.f23889k = iMin;
        int i9 = (int) (this.f23880b + (this.f23886h * 2.0f) + (this.f23881c * 2.0f) + (f4 * 2.0f));
        this.f23891m = i9;
        m25960e(i7, f4);
        setBounds(0, 0, iMin + this.f23892n, i9);
        this.f23894p = i4;
        if (i4 != -1) {
            int i10 = this.f23892n;
            if (i8 > i4 - i10) {
                m25959a((i4 - i10) - ((int) (this.f23885g * 2.0f)));
            } else {
                this.f23893o = str;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m25956b(float f) {
        return Math.round(t100.c().density * f);
    }

    /* JADX INFO: renamed from: c */
    public static int m25957c(int i) {
        return Math.round(t100.c().density * i);
    }

    /* JADX INFO: renamed from: d */
    public static void m25958d(Context context, int i) {
        f23876s = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(eqh0.c(2));
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setFlags(textPaint.getFlags() | 128);
        Paint paint = new Paint();
        f23875r = paint;
        paint.setAntiAlias(true);
        f23877t.put(Integer.valueOf(i), textPaint);
    }

    /* JADX INFO: renamed from: a */
    public final void m25959a(int i) {
        if (!NullChecker.a(this.f23887i) || i <= 0 || this.f23887i.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f23887i.length(); i2++) {
            String strConcat = this.f23887i.substring(0, i2).concat("...");
            if (this.f23879a.measureText(strConcat) > i) {
                return;
            }
            this.f23893o = strConcat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float strokeWidth = 0.0f;
        if (this.f23894p != -1) {
            f23875r.setColor(this.f23890l);
            float f = this.f23881c;
            RectF rectF = new RectF(0.0f, f, this.f23889k, this.f23891m - f);
            int i = this.f23882d;
            canvas.drawRoundRect(rectF, i, i, f23875r);
            Paint paint = this.f23895q;
            if (paint != null) {
                strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                rectF.top += strokeWidth;
                rectF.right -= strokeWidth;
                rectF.bottom -= strokeWidth;
                int i2 = this.f23882d;
                canvas.drawRoundRect(rectF, i2, i2, this.f23895q);
            }
            if (NullChecker.a(this.f23893o)) {
                this.f23879a.setColor(this.f23888j);
                canvas.drawText(this.f23893o, this.f23885g, (((this.f23891m - strokeWidth) - this.f23881c) - this.f23886h) - this.f23884f, this.f23879a);
                return;
            }
            return;
        }
        canvas.getClipBounds(f23878u);
        int width = f23878u.width() == 0 ? canvas.getWidth() : f23878u.width();
        int i3 = this.f23889k;
        boolean z = width < i3;
        if (z) {
            i3 = width;
        }
        f23875r.setColor(this.f23890l);
        float f2 = this.f23881c;
        RectF rectF2 = new RectF(0.0f, f2, i3, this.f23891m - f2);
        int i4 = this.f23882d;
        canvas.drawRoundRect(rectF2, i4, i4, f23875r);
        Paint paint2 = this.f23895q;
        if (paint2 != null) {
            strokeWidth = (paint2.getStrokeWidth() / 2.0f) + 1.0f;
            rectF2.left += strokeWidth;
            float f3 = rectF2.top + strokeWidth;
            rectF2.top = f3;
            rectF2.right = f3 - strokeWidth;
            rectF2.bottom -= strokeWidth;
            int i5 = this.f23882d;
            canvas.drawRoundRect(rectF2, i5, i5, this.f23895q);
        }
        if (z) {
            canvas.save();
            canvas.scale((width * 1.0f) / this.f23889k, 1.0f);
        }
        this.f23879a.setColor(this.f23888j);
        if (NullChecker.a(this.f23887i)) {
            canvas.drawText(this.f23887i, this.f23885g, (((this.f23891m - strokeWidth) - this.f23881c) - this.f23886h) - this.f23884f, this.f23879a);
        }
        if (z) {
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: e */
    public zt4 m25960e(@ColorInt int i, float f) {
        if (this.f23895q == null) {
            this.f23895q = new Paint();
        }
        this.f23895q.setStrokeWidth(f);
        this.f23895q.setColor(i);
        this.f23895q.setAntiAlias(true);
        this.f23895q.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f23891m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f23889k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f23891m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f23889k;
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
