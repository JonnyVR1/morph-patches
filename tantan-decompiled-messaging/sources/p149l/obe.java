package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes13.dex */
public abstract class obe<T> extends ImageSpan implements ool {

    /* JADX INFO: renamed from: a */
    public Drawable f142900a;

    /* JADX INFO: renamed from: b */
    public int f142901b;

    /* JADX INFO: renamed from: c */
    public int f142902c;

    /* JADX INFO: renamed from: d */
    public final T f142903d;

    /* JADX INFO: renamed from: e */
    public final int f142904e;

    public obe(Context context, T t, int i) {
        super(context, (Bitmap) null, 33);
        this.f142903d = t;
        this.f142904e = t100.m186890d(i);
    }

    @Override // p149l.ool
    /* JADX INFO: renamed from: a */
    public void mo95709a(int i) {
        this.f142902c = t100.m186890d(i);
    }

    /* JADX INFO: renamed from: b */
    public void m163413b() {
        this.f142900a = null;
    }

    /* JADX INFO: renamed from: c */
    public Drawable m163414c() {
        return this.f142900a;
    }

    /* JADX INFO: renamed from: d */
    public T m163415d() {
        return this.f142903d;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f142900a == null) {
            return;
        }
        int i6 = paint.getFontMetricsInt().bottom;
        int i7 = paint.getFontMetricsInt().top;
        int i8 = (((i6 - i7) - this.f142900a.getBounds().bottom) / 2) + i4 + i7;
        canvas.save();
        canvas.translate(f + this.f142901b, i8);
        this.f142900a.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public boolean m163416e() {
        return this.f142900a != null;
    }

    /* JADX INFO: renamed from: f */
    public void mo163417f(imf0 imf0Var) {
        this.f142900a = imf0Var;
        if (imf0Var == null) {
            return;
        }
        if (imf0Var.mo137069a() == 0) {
            imf0Var.setBounds(0, 0, (int) (this.f142904e * imf0Var.getRatio()), this.f142904e);
        } else {
            imf0Var.setBounds(0, 0, imf0Var.mo137069a(), this.f142904e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m163418g(int i) {
        this.f142901b = t100.m186890d(i);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f142900a == null) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return this.f142900a.getBounds().right + this.f142901b + this.f142902c;
    }
}
