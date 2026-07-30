package p009l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import l.t100;
import l.v1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class l480 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f15930a;

    /* JADX INFO: renamed from: b */
    public RectF f15931b;

    /* JADX INFO: renamed from: c */
    public final float f15932c;

    /* JADX INFO: renamed from: d */
    public final Paint f15933d;

    /* JADX INFO: renamed from: e */
    public int f15934e;

    /* JADX INFO: renamed from: f */
    public float f15935f;

    public l480(float f, int i) {
        this.f15934e = 15;
        this.f15935f = 10.0f;
        Paint paint = new Paint();
        this.f15930a = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(t100.e);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.f15932c = f;
        Paint paint2 = new Paint();
        this.f15933d = paint2;
        paint2.setColor(Color.parseColor("#dcdcdc"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.f15934e = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f15931b == null) {
            return;
        }
        canvas.save();
        Rect bounds = getBounds();
        canvas.clipRect(bounds);
        float f = bounds.left;
        float f2 = bounds.top;
        float f3 = bounds.right;
        float f4 = bounds.bottom;
        float f5 = this.f15932c;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f15933d);
        if ((this.f15934e & 1) == 0) {
            int i = bounds.left;
            int i2 = bounds.top;
            float f6 = this.f15932c;
            canvas.drawRect(i, i2, i + f6, f6 + i2, this.f15933d);
        }
        if ((this.f15934e & 2) == 0) {
            int i3 = bounds.right;
            float f7 = this.f15932c;
            int i4 = bounds.top;
            canvas.drawRect(i3 - f7, i4, i3, f7 + i4, this.f15933d);
        }
        if ((this.f15934e & 4) == 0) {
            int i5 = bounds.left;
            int i6 = bounds.bottom;
            float f8 = this.f15932c;
            canvas.drawRect(i5, i6 - f8, i5 + f8, i6, this.f15933d);
        }
        if ((this.f15934e & 8) == 0) {
            int i7 = bounds.right;
            float f9 = this.f15932c;
            int i8 = bounds.bottom;
            canvas.drawRect(i7 - f9, i8 - f9, i7, i8, this.f15933d);
        }
        canvas.rotate(this.f15935f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        this.f15935f = (this.f15935f + 3.0f) % 360.0f;
        canvas.drawArc(this.f15931b, 0.0f, 270.0f, false, this.f15930a);
        canvas.restore();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fD = t100.d(32.0f) / 2.0f;
        float fWidth = rect.width() / 2;
        float fHeight = rect.height() / 2;
        this.f15931b = new RectF(fWidth - fD, fHeight - fD, fWidth + fD, fHeight + fD);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public l480(float f) {
        this(f, 15);
    }

    public l480() {
        this(CoreModule.b.getResources().getDimension(v1c0.a));
    }
}
