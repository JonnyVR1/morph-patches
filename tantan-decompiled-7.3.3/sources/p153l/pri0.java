package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes8.dex */
public class pri0 extends Drawable {

    /* JADX INFO: renamed from: i */
    public static int f153790i = 2;

    /* JADX INFO: renamed from: j */
    public static int f153791j = 3;

    /* JADX INFO: renamed from: k */
    public static int f153792k = 6;

    /* JADX INFO: renamed from: a */
    public final Paint f153793a;

    /* JADX INFO: renamed from: b */
    public final String f153794b;

    /* JADX INFO: renamed from: c */
    public final int f153795c;

    /* JADX INFO: renamed from: d */
    public final int f153796d;

    /* JADX INFO: renamed from: e */
    public final int f153797e;

    /* JADX INFO: renamed from: f */
    public boolean f153798f;

    /* JADX INFO: renamed from: g */
    public int f153799g;

    /* JADX INFO: renamed from: h */
    public int f153800h;

    public pri0(String str, int i, int i2, Typeface typeface, int i3, int i4, int i5) {
        this.f153798f = false;
        this.f153794b = str;
        this.f153795c = i2;
        this.f153796d = i3;
        this.f153797e = i;
        Paint paint = new Paint();
        this.f153793a = paint;
        paint.setColor(i3);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(typeface);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f153798f = true;
        this.f153799g = i4;
        this.f153800h = i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iMin = this.f153795c;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 2;
        }
        this.f153793a.setTextSize(iMin);
        if (this.f153798f) {
            int i = this.f153799g;
            if (i == 2) {
                this.f153793a.setColor(this.f153800h);
                canvas.drawCircle(iWidth / 2, iHeight / 2, Math.max(iWidth, iHeight) / 2, this.f153793a);
            } else if (i == 3) {
                this.f153793a.setColor(this.f153800h);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), qa00.m175859d(2.0f), qa00.m175859d(2.0f), this.f153793a);
            } else if (i == 4) {
                this.f153793a.setColor(this.f153800h);
                float f = iWidth;
                float f2 = iHeight;
                canvas.drawRect(new RectF(iWidth / 2, 0.0f, f, f2), this.f153793a);
                canvas.drawArc(new RectF(0.0f, 0.0f, f, f2), 90.0f, 180.0f, true, this.f153793a);
            } else if (i == 5) {
                this.f153793a.setColor(this.f153800h);
                float f3 = iHeight;
                canvas.drawRect(new RectF(0.0f, 0.0f, iWidth / 2, f3), this.f153793a);
                canvas.drawArc(new RectF(0.0f, 0.0f, iWidth, f3), 270.0f, 180.0f, true, this.f153793a);
            } else if (i == 6) {
                this.f153793a.setColor(this.f153800h);
                float f4 = iHeight / 2;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, iWidth, iHeight), f4, f4, this.f153793a);
            }
            this.f153793a.setColor(this.f153796d);
        }
        canvas.drawText(this.f153794b, iWidth / 2, (iHeight / 2) - ((this.f153793a.descent() + this.f153793a.ascent()) / 2.0f), this.f153793a);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f153797e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f153797e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f153793a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f153793a.setColorFilter(colorFilter);
    }
}
