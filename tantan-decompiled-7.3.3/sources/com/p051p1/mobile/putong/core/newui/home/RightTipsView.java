package com.p051p1.mobile.putong.core.newui.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class RightTipsView extends View {

    /* JADX INFO: renamed from: a */
    public int f22570a;

    /* JADX INFO: renamed from: b */
    public int f22571b;

    /* JADX INFO: renamed from: c */
    public int f22572c;

    /* JADX INFO: renamed from: d */
    public int f22573d;

    /* JADX INFO: renamed from: e */
    public double f22574e;

    /* JADX INFO: renamed from: f */
    public Path f22575f;

    /* JADX INFO: renamed from: g */
    public Paint f22576g;

    /* JADX INFO: renamed from: h */
    public TextPaint f22577h;

    /* JADX INFO: renamed from: i */
    public String f22578i;

    /* JADX INFO: renamed from: j */
    public StaticLayout f22579j;

    /* JADX INFO: renamed from: k */
    public int f22580k;

    /* JADX INFO: renamed from: l */
    public int f22581l;

    public RightTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22570a = qa00.m175859d(5.0f);
        this.f22571b = qa00.m175859d(5.0f);
        this.f22572c = qa00.m175859d(10.0f);
        this.f22573d = qa00.m175859d(10.0f);
        this.f22574e = 70.0d;
        this.f22578i = "喜欢按钮在这里，随意拖动试试~";
        m37966a();
    }

    /* JADX INFO: renamed from: a */
    public final void m37966a() {
        setLayerType(0, this.f22576g);
        Paint paint = new Paint();
        this.f22576g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22576g.setAntiAlias(true);
        this.f22576g.setColor(-539853);
        this.f22576g.setShadowLayer(this.f22571b, 0.0f, qa00.m175859d(2.0f), 419430400);
        TextPaint textPaint = new TextPaint();
        this.f22577h = textPaint;
        textPaint.setColor(-1);
        this.f22577h.setAntiAlias(true);
        this.f22577h.setTextSize(qa00.m175859d(15.0f));
        this.f22577h.setTypeface(Typeface.DEFAULT_BOLD);
        TextPaint textPaint2 = this.f22577h;
        String str = this.f22578i;
        StaticLayout staticLayout = new StaticLayout(this.f22578i, this.f22577h, (int) textPaint2.measureText(str, 0, str.length()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        this.f22579j = staticLayout;
        this.f22580k = (this.f22571b * 2) + (this.f22573d * 2) + staticLayout.getWidth() + this.f22572c;
        this.f22581l = (this.f22571b * 2) + (this.f22573d * 2) + this.f22579j.getHeight();
        this.f22575f = m37967b();
    }

    /* JADX INFO: renamed from: b */
    public final Path m37967b() {
        Path path = new Path();
        int i = this.f22571b;
        path.moveTo(this.f22570a + i, i);
        int i2 = this.f22580k;
        int i3 = this.f22571b;
        path.lineTo(((i2 - i3) - this.f22572c) - this.f22570a, i3);
        int i4 = this.f22580k;
        int i5 = this.f22571b;
        int i6 = this.f22572c;
        path.quadTo((i4 - i5) - i6, i5, (i4 - i5) - i6, i5 + i6);
        double d = ((this.f22574e / 180.0d) * 3.141592653589793d) / 2.0d;
        double dTan = Math.tan(d);
        int i7 = this.f22572c;
        int i8 = (int) (dTan * ((double) i7));
        path.lineTo((this.f22580k - this.f22571b) - i7, (this.f22581l / 2) - i8);
        int iTan = (int) (((double) ((i8 * 2) / 3)) / Math.tan(d));
        int i9 = i8 / 3;
        path.lineTo(((this.f22580k - this.f22571b) - this.f22572c) + iTan, (this.f22581l / 2) - i9);
        int i10 = this.f22580k;
        int i11 = this.f22571b;
        int i12 = this.f22572c;
        int i13 = this.f22581l;
        path.quadTo(((i10 - i11) - i12) + i12, i13 / 2, ((i10 - i11) - i12) + iTan, (i13 / 2) + i9);
        path.lineTo((this.f22580k - this.f22571b) - this.f22572c, (this.f22581l / 2) + i8);
        int i14 = this.f22580k;
        int i15 = this.f22571b;
        path.lineTo((i14 - i15) - this.f22572c, (this.f22581l - i15) - this.f22570a);
        int i16 = this.f22580k;
        int i17 = this.f22571b;
        int i18 = this.f22572c;
        int i19 = this.f22581l;
        path.quadTo((i16 - i17) - i18, i19 - i17, ((i16 - i17) - i18) - this.f22570a, i19 - i17);
        int i20 = this.f22571b;
        path.lineTo(this.f22570a + i20, this.f22581l - i20);
        int i21 = this.f22571b;
        int i22 = this.f22581l;
        path.quadTo(i21, i22 - i21, i21, (i22 - i21) - this.f22570a);
        int i23 = this.f22571b;
        path.lineTo(i23, this.f22570a + i23);
        int i24 = this.f22571b;
        path.quadTo(i24, i24, this.f22570a + i24, i24);
        return path;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f22575f;
        if (path != null) {
            canvas.drawPath(path, this.f22576g);
            canvas.save();
            int i = this.f22571b;
            int i2 = this.f22573d;
            canvas.translate(i + i2, i + i2);
            this.f22579j.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f22580k, this.f22581l);
    }

    public RightTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RightTipsView(Context context) {
        this(context, null);
    }
}
