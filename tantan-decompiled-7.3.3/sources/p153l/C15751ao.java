package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: l.ao */
/* JADX INFO: loaded from: classes9.dex */
public class C15751ao extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f72405a;

    /* JADX INFO: renamed from: b */
    public Paint f72406b;

    /* JADX INFO: renamed from: c */
    public int f72407c;

    /* JADX INFO: renamed from: d */
    public int f72408d;

    public C15751ao(int i, int i2, int i3, int i4) {
        m99048a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m99048a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f72405a = paint;
        paint.setColor(i3);
        this.f72405a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f72406b = paint2;
        paint2.setColor(i4);
        this.f72406b.setAntiAlias(true);
        this.f72408d = i2;
        this.f72407c = i / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i = this.f72408d;
        int i2 = this.f72407c;
        if (i <= 0) {
            canvas.drawCircle(i2, i2, i2, this.f72405a);
            return;
        }
        canvas.drawCircle(i2, i2, i2, this.f72406b);
        int i3 = this.f72407c;
        canvas.drawCircle(i3, i3, i3 - this.f72408d, this.f72405a);
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
