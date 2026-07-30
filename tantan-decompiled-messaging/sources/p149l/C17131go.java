package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: l.go */
/* JADX INFO: loaded from: classes9.dex */
public class C17131go extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f103639a;

    /* JADX INFO: renamed from: b */
    public Paint f103640b;

    /* JADX INFO: renamed from: c */
    public int f103641c;

    /* JADX INFO: renamed from: d */
    public int f103642d;

    public C17131go(int i, int i2, int i3, int i4) {
        m127207a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m127207a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f103639a = paint;
        paint.setColor(i3);
        this.f103639a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f103640b = paint2;
        paint2.setColor(i4);
        this.f103640b.setAntiAlias(true);
        this.f103642d = i2;
        this.f103641c = i / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i = this.f103642d;
        int i2 = this.f103641c;
        if (i <= 0) {
            canvas.drawCircle(i2, i2, i2, this.f103639a);
            return;
        }
        canvas.drawCircle(i2, i2, i2, this.f103640b);
        int i3 = this.f103641c;
        canvas.drawCircle(i3, i3, i3 - this.f103642d, this.f103639a);
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
