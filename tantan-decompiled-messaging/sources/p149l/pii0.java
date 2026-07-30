package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes8.dex */
public class pii0 extends Drawable {

    /* JADX INFO: renamed from: i */
    public static int f149561i = 2;

    /* JADX INFO: renamed from: j */
    public static int f149562j = 3;

    /* JADX INFO: renamed from: k */
    public static int f149563k = 6;

    /* JADX INFO: renamed from: a */
    public final Paint f149564a;

    /* JADX INFO: renamed from: b */
    public final String f149565b;

    /* JADX INFO: renamed from: c */
    public final int f149566c;

    /* JADX INFO: renamed from: d */
    public final int f149567d;

    /* JADX INFO: renamed from: e */
    public final int f149568e;

    /* JADX INFO: renamed from: f */
    public boolean f149569f;

    /* JADX INFO: renamed from: g */
    public int f149570g;

    /* JADX INFO: renamed from: h */
    public int f149571h;

    public pii0(String str, int i, int i2, Typeface typeface, int i3, int i4, int i5) {
        this.f149569f = false;
        this.f149565b = str;
        this.f149566c = i2;
        this.f149567d = i3;
        this.f149568e = i;
        Paint paint = new Paint();
        this.f149564a = paint;
        paint.setColor(i3);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(typeface);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f149569f = true;
        this.f149570g = i4;
        this.f149571h = i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iMin = this.f149566c;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 2;
        }
        this.f149564a.setTextSize(iMin);
        if (this.f149569f) {
            int i = this.f149570g;
            if (i == 2) {
                this.f149564a.setColor(this.f149571h);
                canvas.drawCircle(iWidth / 2, iHeight / 2, Math.max(iWidth, iHeight) / 2, this.f149564a);
            } else if (i == 3) {
                this.f149564a.setColor(this.f149571h);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), t100.m186890d(2.0f), t100.m186890d(2.0f), this.f149564a);
            } else if (i == 4) {
                this.f149564a.setColor(this.f149571h);
                float f = iWidth;
                float f2 = iHeight;
                canvas.drawRect(new RectF(iWidth / 2, 0.0f, f, f2), this.f149564a);
                canvas.drawArc(new RectF(0.0f, 0.0f, f, f2), 90.0f, 180.0f, true, this.f149564a);
            } else if (i == 5) {
                this.f149564a.setColor(this.f149571h);
                float f3 = iHeight;
                canvas.drawRect(new RectF(0.0f, 0.0f, iWidth / 2, f3), this.f149564a);
                canvas.drawArc(new RectF(0.0f, 0.0f, iWidth, f3), 270.0f, 180.0f, true, this.f149564a);
            } else if (i == 6) {
                this.f149564a.setColor(this.f149571h);
                float f4 = iHeight / 2;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), f4, f4, this.f149564a);
            }
            this.f149564a.setColor(this.f149567d);
        }
        canvas.drawText(this.f149565b, iWidth / 2, (iHeight / 2) - ((this.f149564a.descent() + this.f149564a.ascent()) / 2.0f), this.f149564a);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f149568e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f149568e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f149564a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f149564a.setColorFilter(colorFilter);
    }
}
