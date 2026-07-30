package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes13.dex */
public class jk20 extends ImageSpan implements zql {

    /* JADX INFO: renamed from: a */
    public final int f121262a;

    /* JADX INFO: renamed from: b */
    public Bitmap f121263b;

    /* JADX INFO: renamed from: c */
    public String f121264c;

    /* JADX INFO: renamed from: d */
    public float f121265d;

    /* JADX INFO: renamed from: e */
    public Drawable f121266e;

    /* JADX INFO: renamed from: f */
    public int f121267f;

    /* JADX INFO: renamed from: g */
    public int f121268g;

    public jk20(Context context, String str, int i) {
        super(context, (Bitmap) null, 34);
        this.f121264c = str;
        this.f121262a = i;
    }

    /* JADX INFO: renamed from: b */
    private Drawable m145147b() {
        if (this.f121263b == null) {
            return null;
        }
        Drawable drawable = this.f121266e;
        if (drawable != null) {
            return drawable;
        }
        this.f121266e = new BitmapDrawable(this.f121263b);
        float height = this.f121262a / this.f121263b.getHeight();
        this.f121265d = height;
        this.f121266e.setBounds(0, 0, (int) (height * this.f121263b.getWidth()), this.f121262a);
        return this.f121266e;
    }

    @Override // p153l.zql
    /* JADX INFO: renamed from: a */
    public void mo145148a(int i) {
        this.f121268g = qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: c */
    public String m145149c() {
        return this.f121264c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m145150d() {
        return this.f121263b != null;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Bitmap bitmap;
        Drawable drawableM145147b = m145147b();
        if (drawableM145147b == null || (bitmap = this.f121263b) == null || bitmap.isRecycled()) {
            return;
        }
        int i6 = paint.getFontMetricsInt().bottom;
        int i7 = paint.getFontMetricsInt().top;
        int i8 = (((i6 - i7) - drawableM145147b.getBounds().bottom) / 2) + i4 + i7;
        canvas.save();
        canvas.translate(f + this.f121267f, i8);
        drawableM145147b.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m145151e(Bitmap bitmap) {
        this.f121263b = bitmap;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawableM145147b = m145147b();
        if (drawableM145147b == null) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return drawableM145147b.getBounds().right + this.f121267f + this.f121268g;
    }
}
