package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class red0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f159045a;

    /* JADX INFO: renamed from: b */
    public int f159046b;

    /* JADX INFO: renamed from: c */
    public int f159047c;

    /* JADX INFO: renamed from: d */
    public int f159048d;

    public red0(int i, int i2, int i3, int i4) {
        this.f159046b = i2;
        this.f159047c = i3;
        this.f159048d = i4;
        Paint paint = new Paint();
        this.f159045a = paint;
        paint.setAntiAlias(true);
        this.f159045a.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, this.f159047c, this.f159048d);
        int i = this.f159046b;
        canvas.drawRoundRect(rectF, i, i, this.f159045a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f159048d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f159047c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.f159045a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f159045a.setColorFilter(colorFilter);
    }
}
