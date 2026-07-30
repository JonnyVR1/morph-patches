package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class tmd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f174921a;

    /* JADX INFO: renamed from: b */
    public int f174922b;

    /* JADX INFO: renamed from: c */
    public int f174923c;

    /* JADX INFO: renamed from: d */
    public int f174924d;

    public tmd0(int i, int i2, int i3, int i4) {
        this.f174922b = i2;
        this.f174923c = i3;
        this.f174924d = i4;
        Paint paint = new Paint();
        this.f174921a = paint;
        paint.setAntiAlias(true);
        this.f174921a.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, this.f174923c, this.f174924d);
        int i = this.f174922b;
        canvas.drawRoundRect(rectF, i, i, this.f174921a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f174924d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f174923c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.f174921a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f174921a.setColorFilter(colorFilter);
    }
}
