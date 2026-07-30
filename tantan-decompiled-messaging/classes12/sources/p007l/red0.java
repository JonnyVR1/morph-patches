package p007l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class red0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f12628a;

    /* JADX INFO: renamed from: b */
    public int f12629b;

    /* JADX INFO: renamed from: c */
    public int f12630c;

    /* JADX INFO: renamed from: d */
    public int f12631d;

    public red0(int i, int i2, int i3, int i4) {
        this.f12629b = i2;
        this.f12630c = i3;
        this.f12631d = i4;
        Paint paint = new Paint();
        this.f12628a = paint;
        paint.setAntiAlias(true);
        this.f12628a.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, this.f12630c, this.f12631d);
        int i = this.f12629b;
        canvas.drawRoundRect(rectF, i, i, this.f12628a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12631d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12630c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.f12628a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f12628a.setColorFilter(colorFilter);
    }
}
