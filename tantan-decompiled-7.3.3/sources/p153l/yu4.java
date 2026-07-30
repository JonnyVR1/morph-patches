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
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class yu4 extends Drawable {

    /* JADX INFO: renamed from: r */
    public static Paint f201569r;

    /* JADX INFO: renamed from: s */
    public static float f201570s;

    /* JADX INFO: renamed from: t */
    public static HashMap<Integer, Paint> f201571t = new HashMap<>();

    /* JADX INFO: renamed from: u */
    public static Rect f201572u = new Rect();

    /* JADX INFO: renamed from: a */
    public Paint f201573a;

    /* JADX INFO: renamed from: b */
    public int f201574b;

    /* JADX INFO: renamed from: c */
    public float f201575c;

    /* JADX INFO: renamed from: d */
    public int f201576d;

    /* JADX INFO: renamed from: e */
    public float f201577e;

    /* JADX INFO: renamed from: f */
    public float f201578f;

    /* JADX INFO: renamed from: g */
    public float f201579g;

    /* JADX INFO: renamed from: h */
    public float f201580h;

    /* JADX INFO: renamed from: i */
    public final String f201581i;

    /* JADX INFO: renamed from: j */
    public final int f201582j;

    /* JADX INFO: renamed from: k */
    public final int f201583k;

    /* JADX INFO: renamed from: l */
    public final int f201584l;

    /* JADX INFO: renamed from: m */
    public final int f201585m;

    /* JADX INFO: renamed from: n */
    public int f201586n;

    /* JADX INFO: renamed from: o */
    public String f201587o;

    /* JADX INFO: renamed from: p */
    public int f201588p;

    /* JADX INFO: renamed from: q */
    public Paint f201589q;

    public yu4(Context context, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, int i7, float f4, boolean z) {
        this.f201586n = 0;
        this.f201588p = -1;
        int iM217356c = m217356c(i2);
        if (f201571t.get(Integer.valueOf(iM217356c)) == null) {
            m217357d(context, iM217356c);
        }
        this.f201573a = f201571t.get(Integer.valueOf(iM217356c));
        this.f201579g = m217355b(f2);
        this.f201580h = m217355b(f3);
        this.f201575c = m217355b(f);
        this.f201586n = m217356c(i5);
        this.f201576d = i6;
        Paint paint = this.f201573a;
        if (z) {
            paint.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            paint.setTypeface(lyh0.m156283c(2));
        }
        this.f201577e = this.f201573a.getFontMetrics().ascent;
        float f5 = this.f201573a.getFontMetrics().descent;
        this.f201578f = f5;
        this.f201574b = (int) (f5 - this.f201577e);
        this.f201581i = str;
        int iMeasureText = (int) this.f201573a.measureText(str);
        this.f201582j = i;
        this.f201584l = i3;
        int i8 = (int) (iMeasureText + (this.f201579g * 2.0f));
        int iMin = i4 == -1 ? i8 : Math.min(i8, i4 - this.f201586n);
        this.f201583k = iMin;
        int i9 = (int) (this.f201574b + (this.f201580h * 2.0f) + (this.f201575c * 2.0f) + (f4 * 2.0f));
        this.f201585m = i9;
        m217359e(i7, f4);
        setBounds(0, 0, iMin + this.f201586n, i9);
        this.f201588p = i4;
        if (i4 != -1) {
            int i10 = this.f201586n;
            if (i8 > i4 - i10) {
                m217358a((i4 - i10) - ((int) (this.f201579g * 2.0f)));
            } else {
                this.f201587o = str;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m217355b(float f) {
        return Math.round(qa00.m175858c().density * f);
    }

    /* JADX INFO: renamed from: c */
    public static int m217356c(int i) {
        return Math.round(qa00.m175858c().density * i);
    }

    /* JADX INFO: renamed from: d */
    public static void m217357d(Context context, int i) {
        f201570s = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(lyh0.m156283c(2));
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setFlags(textPaint.getFlags() | 128);
        Paint paint = new Paint();
        f201569r = paint;
        paint.setAntiAlias(true);
        f201571t.put(Integer.valueOf(i), textPaint);
    }

    /* JADX INFO: renamed from: a */
    public final void m217358a(int i) {
        if (!NullChecker.m82486a(this.f201581i) || i <= 0 || this.f201581i.length() <= 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f201581i.length(); i2++) {
            String strConcat = this.f201581i.substring(0, i2).concat("...");
            if (this.f201573a.measureText(strConcat) > i) {
                return;
            }
            this.f201587o = strConcat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float strokeWidth = 0.0f;
        if (this.f201588p != -1) {
            f201569r.setColor(this.f201584l);
            float f = this.f201575c;
            RectF rectF = new RectF(0.0f, f, this.f201583k, this.f201585m - f);
            int i = this.f201576d;
            canvas.drawRoundRect(rectF, i, i, f201569r);
            Paint paint = this.f201589q;
            if (paint != null) {
                strokeWidth = (paint.getStrokeWidth() / 2.0f) + 1.0f;
                rectF.left += strokeWidth;
                rectF.top += strokeWidth;
                rectF.right -= strokeWidth;
                rectF.bottom -= strokeWidth;
                int i2 = this.f201576d;
                canvas.drawRoundRect(rectF, i2, i2, this.f201589q);
            }
            if (NullChecker.m82486a(this.f201587o)) {
                this.f201573a.setColor(this.f201582j);
                canvas.drawText(this.f201587o, this.f201579g, (((this.f201585m - strokeWidth) - this.f201575c) - this.f201580h) - this.f201578f, this.f201573a);
                return;
            }
            return;
        }
        canvas.getClipBounds(f201572u);
        int width = f201572u.width() == 0 ? canvas.getWidth() : f201572u.width();
        int i3 = this.f201583k;
        boolean z = width < i3;
        if (z) {
            i3 = width;
        }
        f201569r.setColor(this.f201584l);
        float f2 = this.f201575c;
        RectF rectF2 = new RectF(0.0f, f2, i3, this.f201585m - f2);
        int i4 = this.f201576d;
        canvas.drawRoundRect(rectF2, i4, i4, f201569r);
        Paint paint2 = this.f201589q;
        if (paint2 != null) {
            strokeWidth = (paint2.getStrokeWidth() / 2.0f) + 1.0f;
            rectF2.left += strokeWidth;
            float f3 = rectF2.top + strokeWidth;
            rectF2.top = f3;
            rectF2.right = f3 - strokeWidth;
            rectF2.bottom -= strokeWidth;
            int i5 = this.f201576d;
            canvas.drawRoundRect(rectF2, i5, i5, this.f201589q);
        }
        if (z) {
            canvas.save();
            canvas.scale((width * 1.0f) / this.f201583k, 1.0f);
        }
        this.f201573a.setColor(this.f201582j);
        if (NullChecker.m82486a(this.f201581i)) {
            canvas.drawText(this.f201581i, this.f201579g, (((this.f201585m - strokeWidth) - this.f201575c) - this.f201580h) - this.f201578f, this.f201573a);
        }
        if (z) {
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: e */
    public yu4 m217359e(@ColorInt int i, float f) {
        if (this.f201589q == null) {
            this.f201589q = new Paint();
        }
        this.f201589q.setStrokeWidth(f);
        this.f201589q.setColor(i);
        this.f201589q.setAntiAlias(true);
        this.f201589q.setStyle(Paint.Style.STROKE);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f201585m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f201583k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f201585m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f201583k;
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
