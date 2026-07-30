package p007l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a2h extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f5552a;

    /* JADX INFO: renamed from: b */
    public Paint f5553b;

    /* JADX INFO: renamed from: c */
    public int f5554c;

    /* JADX INFO: renamed from: d */
    public int f5555d;

    public a2h(int i, int i2, int i3, int i4) {
        m8399a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m8399a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f5552a = paint;
        paint.setColor(i3);
        this.f5552a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f5553b = paint2;
        paint2.setColor(i4);
        this.f5553b.setAntiAlias(true);
        this.f5555d = i2;
        this.f5554c = i / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i = this.f5555d;
        int i2 = this.f5554c;
        if (i <= 0) {
            canvas.drawCircle(i2, i2, i2, this.f5552a);
            return;
        }
        canvas.drawCircle(i2, i2, i2, this.f5553b);
        int i3 = this.f5554c;
        canvas.drawCircle(i3, i3, i3 - this.f5555d, this.f5552a);
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
