package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class a2h extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f67257a;

    /* JADX INFO: renamed from: b */
    public Paint f67258b;

    /* JADX INFO: renamed from: c */
    public int f67259c;

    /* JADX INFO: renamed from: d */
    public int f67260d;

    public a2h(int i, int i2, int i3, int i4) {
        m94600a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m94600a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f67257a = paint;
        paint.setColor(i3);
        this.f67257a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f67258b = paint2;
        paint2.setColor(i4);
        this.f67258b.setAntiAlias(true);
        this.f67260d = i2;
        this.f67259c = i / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i = this.f67260d;
        int i2 = this.f67259c;
        if (i <= 0) {
            canvas.drawCircle(i2, i2, i2, this.f67257a);
            return;
        }
        canvas.drawCircle(i2, i2, i2, this.f67258b);
        int i3 = this.f67259c;
        canvas.drawCircle(i3, i3, i3 - this.f67260d, this.f67257a);
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
