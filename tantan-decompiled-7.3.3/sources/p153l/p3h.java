package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class p3h extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f150401a;

    /* JADX INFO: renamed from: b */
    public Paint f150402b;

    /* JADX INFO: renamed from: c */
    public int f150403c;

    /* JADX INFO: renamed from: d */
    public int f150404d;

    public p3h(int i, int i2, int i3, int i4) {
        m170491a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m170491a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f150401a = paint;
        paint.setColor(i3);
        this.f150401a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f150402b = paint2;
        paint2.setColor(i4);
        this.f150402b.setAntiAlias(true);
        this.f150404d = i2;
        this.f150403c = i / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i = this.f150404d;
        int i2 = this.f150403c;
        if (i <= 0) {
            canvas.drawCircle(i2, i2, i2, this.f150401a);
            return;
        }
        canvas.drawCircle(i2, i2, i2, this.f150402b);
        int i3 = this.f150403c;
        canvas.drawCircle(i3, i3, i3 - this.f150404d, this.f150401a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
