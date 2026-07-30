package p149l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class l480 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f125979a;

    /* JADX INFO: renamed from: b */
    public RectF f125980b;

    /* JADX INFO: renamed from: c */
    public final float f125981c;

    /* JADX INFO: renamed from: d */
    public final Paint f125982d;

    /* JADX INFO: renamed from: e */
    public int f125983e;

    /* JADX INFO: renamed from: f */
    public float f125984f;

    public l480(float f, int i) {
        this.f125983e = 15;
        this.f125984f = 10.0f;
        Paint paint = new Paint();
        this.f125979a = paint;
        paint.setColor(-1);
        paint.setStrokeWidth(t100.f167256e);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.f125981c = f;
        Paint paint2 = new Paint();
        this.f125982d = paint2;
        paint2.setColor(Color.parseColor("#dcdcdc"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.f125983e = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f125980b == null) {
            return;
        }
        canvas.save();
        Rect bounds = getBounds();
        canvas.clipRect(bounds);
        float f = bounds.left;
        float f2 = bounds.top;
        float f3 = bounds.right;
        float f4 = bounds.bottom;
        float f5 = this.f125981c;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f125982d);
        if ((this.f125983e & 1) == 0) {
            int i = bounds.left;
            int i2 = bounds.top;
            float f6 = this.f125981c;
            canvas.drawRect(i, i2, i + f6, f6 + i2, this.f125982d);
        }
        if ((this.f125983e & 2) == 0) {
            int i3 = bounds.right;
            float f7 = this.f125981c;
            int i4 = bounds.top;
            canvas.drawRect(i3 - f7, i4, i3, f7 + i4, this.f125982d);
        }
        if ((this.f125983e & 4) == 0) {
            int i5 = bounds.left;
            int i6 = bounds.bottom;
            float f8 = this.f125981c;
            canvas.drawRect(i5, i6 - f8, i5 + f8, i6, this.f125982d);
        }
        if ((this.f125983e & 8) == 0) {
            int i7 = bounds.right;
            float f9 = this.f125981c;
            int i8 = bounds.bottom;
            canvas.drawRect(i7 - f9, i8 - f9, i7, i8, this.f125982d);
        }
        canvas.rotate(this.f125984f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        this.f125984f = (this.f125984f + 3.0f) % 360.0f;
        canvas.drawArc(this.f125980b, 0.0f, 270.0f, false, this.f125979a);
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
        float fM186890d = t100.m186890d(32.0f) / 2.0f;
        float fWidth = rect.width() / 2;
        float fHeight = rect.height() / 2;
        this.f125980b = new RectF(fWidth - fM186890d, fHeight - fM186890d, fWidth + fM186890d, fHeight + fM186890d);
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
        this(CoreModule.f17544b.getResources().getDimension(v1c0.f179225a));
    }
}
