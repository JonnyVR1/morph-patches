package p006l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: l.go */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0774go extends Drawable {

    /* JADX INFO: renamed from: a */
    public Paint f13411a;

    /* JADX INFO: renamed from: b */
    public Paint f13412b;

    /* JADX INFO: renamed from: c */
    public int f13413c;

    /* JADX INFO: renamed from: d */
    public int f13414d;

    public C0774go(int i, int i2, int i3, int i4) {
        m15895a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final void m15895a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f13411a = paint;
        paint.setColor(i3);
        this.f13411a.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f13412b = paint2;
        paint2.setColor(i4);
        this.f13412b.setAntiAlias(true);
        this.f13414d = i2;
        this.f13413c = i / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i = this.f13414d;
        int i2 = this.f13413c;
        if (i <= 0) {
            canvas.drawCircle(i2, i2, i2, this.f13411a);
            return;
        }
        canvas.drawCircle(i2, i2, i2, this.f13412b);
        int i3 = this.f13413c;
        canvas.drawCircle(i3, i3, i3 - this.f13414d, this.f13411a);
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
