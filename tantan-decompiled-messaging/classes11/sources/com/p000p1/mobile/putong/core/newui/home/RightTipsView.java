package com.p000p1.mobile.putong.core.newui.home;

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
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RightTipsView extends View {

    /* JADX INFO: renamed from: a */
    public int f606a;

    /* JADX INFO: renamed from: b */
    public int f607b;

    /* JADX INFO: renamed from: c */
    public int f608c;

    /* JADX INFO: renamed from: d */
    public int f609d;

    /* JADX INFO: renamed from: e */
    public double f610e;

    /* JADX INFO: renamed from: f */
    public Path f611f;

    /* JADX INFO: renamed from: g */
    public Paint f612g;

    /* JADX INFO: renamed from: h */
    public TextPaint f613h;

    /* JADX INFO: renamed from: i */
    public String f614i;

    /* JADX INFO: renamed from: j */
    public StaticLayout f615j;

    /* JADX INFO: renamed from: k */
    public int f616k;

    /* JADX INFO: renamed from: l */
    public int f617l;

    public RightTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f606a = t100.d(5.0f);
        this.f607b = t100.d(5.0f);
        this.f608c = t100.d(10.0f);
        this.f609d = t100.d(10.0f);
        this.f610e = 70.0d;
        this.f614i = "喜欢按钮在这里，随意拖动试试~";
        m930a();
    }

    /* JADX INFO: renamed from: a */
    public final void m930a() {
        setLayerType(0, this.f612g);
        Paint paint = new Paint();
        this.f612g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f612g.setAntiAlias(true);
        this.f612g.setColor(-539853);
        this.f612g.setShadowLayer(this.f607b, 0.0f, t100.d(2.0f), 419430400);
        TextPaint textPaint = new TextPaint();
        this.f613h = textPaint;
        textPaint.setColor(-1);
        this.f613h.setAntiAlias(true);
        this.f613h.setTextSize(t100.d(15.0f));
        this.f613h.setTypeface(Typeface.DEFAULT_BOLD);
        TextPaint textPaint2 = this.f613h;
        String str = this.f614i;
        StaticLayout staticLayout = new StaticLayout(this.f614i, this.f613h, (int) textPaint2.measureText(str, 0, str.length()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        this.f615j = staticLayout;
        this.f616k = (this.f607b * 2) + (this.f609d * 2) + staticLayout.getWidth() + this.f608c;
        this.f617l = (this.f607b * 2) + (this.f609d * 2) + this.f615j.getHeight();
        this.f611f = m931b();
    }

    /* JADX INFO: renamed from: b */
    public final Path m931b() {
        Path path = new Path();
        int i = this.f607b;
        path.moveTo(this.f606a + i, i);
        int i2 = this.f616k;
        int i3 = this.f607b;
        path.lineTo(((i2 - i3) - this.f608c) - this.f606a, i3);
        int i4 = this.f616k;
        int i5 = this.f607b;
        int i6 = this.f608c;
        path.quadTo((i4 - i5) - i6, i5, (i4 - i5) - i6, i5 + i6);
        double d = ((this.f610e / 180.0d) * 3.141592653589793d) / 2.0d;
        double dTan = Math.tan(d);
        int i7 = this.f608c;
        int i8 = (int) (dTan * ((double) i7));
        path.lineTo((this.f616k - this.f607b) - i7, (this.f617l / 2) - i8);
        int iTan = (int) (((double) ((i8 * 2) / 3)) / Math.tan(d));
        int i9 = i8 / 3;
        path.lineTo(((this.f616k - this.f607b) - this.f608c) + iTan, (this.f617l / 2) - i9);
        int i10 = this.f616k;
        int i11 = this.f607b;
        int i12 = this.f608c;
        int i13 = this.f617l;
        path.quadTo(((i10 - i11) - i12) + i12, i13 / 2, ((i10 - i11) - i12) + iTan, (i13 / 2) + i9);
        path.lineTo((this.f616k - this.f607b) - this.f608c, (this.f617l / 2) + i8);
        int i14 = this.f616k;
        int i15 = this.f607b;
        path.lineTo((i14 - i15) - this.f608c, (this.f617l - i15) - this.f606a);
        int i16 = this.f616k;
        int i17 = this.f607b;
        int i18 = this.f608c;
        int i19 = this.f617l;
        path.quadTo((i16 - i17) - i18, i19 - i17, ((i16 - i17) - i18) - this.f606a, i19 - i17);
        int i20 = this.f607b;
        path.lineTo(this.f606a + i20, this.f617l - i20);
        int i21 = this.f607b;
        int i22 = this.f617l;
        path.quadTo(i21, i22 - i21, i21, (i22 - i21) - this.f606a);
        int i23 = this.f607b;
        path.lineTo(i23, this.f606a + i23);
        int i24 = this.f607b;
        path.quadTo(i24, i24, this.f606a + i24, i24);
        return path;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f611f;
        if (path != null) {
            canvas.drawPath(path, this.f612g);
            canvas.save();
            int i = this.f607b;
            int i2 = this.f609d;
            canvas.translate(i + i2, i + i2);
            this.f615j.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f616k, this.f617l);
    }

    public RightTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RightTipsView(Context context) {
        this(context, null);
    }
}
