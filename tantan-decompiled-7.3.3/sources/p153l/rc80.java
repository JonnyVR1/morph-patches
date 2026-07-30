package p153l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class rc80 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f162073a;

    /* JADX INFO: renamed from: b */
    public RectF f162074b;

    /* JADX INFO: renamed from: c */
    public final float f162075c;

    /* JADX INFO: renamed from: d */
    public final Paint f162076d;

    /* JADX INFO: renamed from: e */
    public int f162077e;

    /* JADX INFO: renamed from: f */
    public float f162078f;

    public rc80(float f, int i) {
        this.f162077e = 15;
        this.f162078f = 10.0f;
        Paint paint = new Paint();
        this.f162073a = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(qa00.f156318e);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.f162075c = f;
        Paint paint2 = new Paint();
        this.f162076d = paint2;
        paint2.setColor(Color.parseColor("#dcdcdc"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.f162077e = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f162074b == null) {
            return;
        }
        canvas.save();
        Rect bounds = getBounds();
        canvas.clipRect(bounds);
        float f = bounds.left;
        float f2 = bounds.top;
        float f3 = bounds.right;
        float f4 = bounds.bottom;
        float f5 = this.f162075c;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f162076d);
        if ((this.f162077e & 1) == 0) {
            int i = bounds.left;
            int i2 = bounds.top;
            float f6 = this.f162075c;
            canvas.drawRect(i, i2, i + f6, f6 + i2, this.f162076d);
        }
        if ((this.f162077e & 2) == 0) {
            int i3 = bounds.right;
            float f7 = this.f162075c;
            int i4 = bounds.top;
            canvas.drawRect(i3 - f7, i4, i3, f7 + i4, this.f162076d);
        }
        if ((this.f162077e & 4) == 0) {
            int i5 = bounds.left;
            int i6 = bounds.bottom;
            float f8 = this.f162075c;
            canvas.drawRect(i5, i6 - f8, i5 + f8, i6, this.f162076d);
        }
        if ((this.f162077e & 8) == 0) {
            int i7 = bounds.right;
            float f9 = this.f162075c;
            int i8 = bounds.bottom;
            canvas.drawRect(i7 - f9, i8 - f9, i7, i8, this.f162076d);
        }
        canvas.rotate(this.f162078f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        this.f162078f = (this.f162078f + 3.0f) % 360.0f;
        canvas.drawArc(this.f162074b, 0.0f, 270.0f, false, this.f162073a);
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
        float fM175859d = qa00.m175859d(32.0f) / 2.0f;
        float fWidth = rect.width() / 2;
        float fHeight = rect.height() / 2;
        this.f162074b = new RectF(fWidth - fM175859d, fHeight - fM175859d, fWidth + fM175859d, fHeight + fM175859d);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public rc80(float f) {
        this(f, 15);
    }

    public rc80() {
        this(CoreModule.f18263b.getResources().getDimension(cac0.f80571a));
    }
}
