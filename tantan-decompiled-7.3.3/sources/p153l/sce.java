package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes13.dex */
public abstract class sce<T> extends ImageSpan implements zql {

    /* JADX INFO: renamed from: a */
    public Drawable f167243a;

    /* JADX INFO: renamed from: b */
    public int f167244b;

    /* JADX INFO: renamed from: c */
    public int f167245c;

    /* JADX INFO: renamed from: d */
    public final T f167246d;

    /* JADX INFO: renamed from: e */
    public final int f167247e;

    public sce(Context context, T t, int i) {
        super(context, (Bitmap) null, 33);
        this.f167246d = t;
        this.f167247e = qa00.m175859d(i);
    }

    @Override // p153l.zql
    /* JADX INFO: renamed from: a */
    public void mo145148a(int i) {
        this.f167245c = qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: b */
    public void m185369b() {
        this.f167243a = null;
    }

    /* JADX INFO: renamed from: c */
    public Drawable m185370c() {
        return this.f167243a;
    }

    /* JADX INFO: renamed from: d */
    public T m185371d() {
        return this.f167246d;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f167243a == null) {
            return;
        }
        int i6 = paint.getFontMetricsInt().bottom;
        int i7 = paint.getFontMetricsInt().top;
        int i8 = (((i6 - i7) - this.f167243a.getBounds().bottom) / 2) + i4 + i7;
        canvas.save();
        canvas.translate(f + this.f167244b, i8);
        this.f167243a.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public boolean m185372e() {
        return this.f167243a != null;
    }

    /* JADX INFO: renamed from: f */
    public void mo182213f(ruf0 ruf0Var) {
        this.f167243a = ruf0Var;
        if (ruf0Var == null) {
            return;
        }
        if (ruf0Var.mo161714a() == 0) {
            ruf0Var.setBounds(0, 0, (int) (this.f167247e * ruf0Var.getRatio()), this.f167247e);
        } else {
            ruf0Var.setBounds(0, 0, ruf0Var.mo161714a(), this.f167247e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m185373g(int i) {
        this.f167244b = qa00.m175859d(i);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f167243a == null) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return this.f167243a.getBounds().right + this.f167244b + this.f167245c;
    }
}
