package p007l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class pii0 extends Drawable {

    /* JADX INFO: renamed from: i */
    public static int f3740i = 2;

    /* JADX INFO: renamed from: j */
    public static int f3741j = 3;

    /* JADX INFO: renamed from: k */
    public static int f3742k = 6;

    /* JADX INFO: renamed from: a */
    public final Paint f3743a;

    /* JADX INFO: renamed from: b */
    public final String f3744b;

    /* JADX INFO: renamed from: c */
    public final int f3745c;

    /* JADX INFO: renamed from: d */
    public final int f3746d;

    /* JADX INFO: renamed from: e */
    public final int f3747e;

    /* JADX INFO: renamed from: f */
    public boolean f3748f;

    /* JADX INFO: renamed from: g */
    public int f3749g;

    /* JADX INFO: renamed from: h */
    public int f3750h;

    public pii0(String str, int i, int i2, Typeface typeface, int i3, int i4, int i5) {
        this.f3748f = false;
        this.f3744b = str;
        this.f3745c = i2;
        this.f3746d = i3;
        this.f3747e = i;
        Paint paint = new Paint();
        this.f3743a = paint;
        paint.setColor(i3);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(typeface);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f3748f = true;
        this.f3749g = i4;
        this.f3750h = i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iMin = this.f3745c;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 2;
        }
        this.f3743a.setTextSize(iMin);
        if (this.f3748f) {
            int i = this.f3749g;
            if (i == 2) {
                this.f3743a.setColor(this.f3750h);
                canvas.drawCircle(iWidth / 2, iHeight / 2, Math.max(iWidth, iHeight) / 2, this.f3743a);
            } else if (i == 3) {
                this.f3743a.setColor(this.f3750h);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), t100.d(2.0f), t100.d(2.0f), this.f3743a);
            } else if (i == 4) {
                this.f3743a.setColor(this.f3750h);
                float f = iWidth;
                float f2 = iHeight;
                canvas.drawRect(new RectF(iWidth / 2, 0.0f, f, f2), this.f3743a);
                canvas.drawArc(new RectF(0.0f, 0.0f, f, f2), 90.0f, 180.0f, true, this.f3743a);
            } else if (i == 5) {
                this.f3743a.setColor(this.f3750h);
                float f3 = iHeight;
                canvas.drawRect(new RectF(0.0f, 0.0f, iWidth / 2, f3), this.f3743a);
                canvas.drawArc(new RectF(0.0f, 0.0f, iWidth, f3), 270.0f, 180.0f, true, this.f3743a);
            } else if (i == 6) {
                this.f3743a.setColor(this.f3750h);
                float f4 = iHeight / 2;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), f4, f4, this.f3743a);
            }
            this.f3743a.setColor(this.f3746d);
        }
        canvas.drawText(this.f3744b, iWidth / 2, (iHeight / 2) - ((this.f3743a.descent() + this.f3743a.ascent()) / 2.0f), this.f3743a);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3747e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3747e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3743a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3743a.setColorFilter(colorFilter);
    }
}
