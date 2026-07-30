package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes13.dex */
public class ac20 extends ImageSpan implements ool {

    /* JADX INFO: renamed from: a */
    public final int f68765a;

    /* JADX INFO: renamed from: b */
    public Bitmap f68766b;

    /* JADX INFO: renamed from: c */
    public String f68767c;

    /* JADX INFO: renamed from: d */
    public float f68768d;

    /* JADX INFO: renamed from: e */
    public Drawable f68769e;

    /* JADX INFO: renamed from: f */
    public int f68770f;

    /* JADX INFO: renamed from: g */
    public int f68771g;

    public ac20(Context context, String str, int i) {
        super(context, (Bitmap) null, 34);
        this.f68767c = str;
        this.f68765a = i;
    }

    /* JADX INFO: renamed from: b */
    private Drawable m95708b() {
        if (this.f68766b == null) {
            return null;
        }
        Drawable drawable = this.f68769e;
        if (drawable != null) {
            return drawable;
        }
        this.f68769e = new BitmapDrawable(this.f68766b);
        float height = this.f68765a / this.f68766b.getHeight();
        this.f68768d = height;
        this.f68769e.setBounds(0, 0, (int) (height * this.f68766b.getWidth()), this.f68765a);
        return this.f68769e;
    }

    @Override // p149l.ool
    /* JADX INFO: renamed from: a */
    public void mo95709a(int i) {
        this.f68771g = t100.m186890d(i);
    }

    /* JADX INFO: renamed from: c */
    public String m95710c() {
        return this.f68767c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m95711d() {
        return this.f68766b != null;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Bitmap bitmap;
        Drawable drawableM95708b = m95708b();
        if (drawableM95708b == null || (bitmap = this.f68766b) == null || bitmap.isRecycled()) {
            return;
        }
        int i6 = paint.getFontMetricsInt().bottom;
        int i7 = paint.getFontMetricsInt().top;
        int i8 = (((i6 - i7) - drawableM95708b.getBounds().bottom) / 2) + i4 + i7;
        canvas.save();
        canvas.translate(f + this.f68770f, i8);
        drawableM95708b.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m95712e(Bitmap bitmap) {
        this.f68766b = bitmap;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawableM95708b = m95708b();
        if (drawableM95708b == null) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return drawableM95708b.getBounds().right + this.f68770f + this.f68771g;
    }
}
