package com.p046p1.mobile.putong.core.newui.home;

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
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class RightTipsView extends View {

    /* JADX INFO: renamed from: a */
    public int f21828a;

    /* JADX INFO: renamed from: b */
    public int f21829b;

    /* JADX INFO: renamed from: c */
    public int f21830c;

    /* JADX INFO: renamed from: d */
    public int f21831d;

    /* JADX INFO: renamed from: e */
    public double f21832e;

    /* JADX INFO: renamed from: f */
    public Path f21833f;

    /* JADX INFO: renamed from: g */
    public Paint f21834g;

    /* JADX INFO: renamed from: h */
    public TextPaint f21835h;

    /* JADX INFO: renamed from: i */
    public String f21836i;

    /* JADX INFO: renamed from: j */
    public StaticLayout f21837j;

    /* JADX INFO: renamed from: k */
    public int f21838k;

    /* JADX INFO: renamed from: l */
    public int f21839l;

    public RightTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21828a = t100.m186890d(5.0f);
        this.f21829b = t100.m186890d(5.0f);
        this.f21830c = t100.m186890d(10.0f);
        this.f21831d = t100.m186890d(10.0f);
        this.f21832e = 70.0d;
        this.f21836i = "喜欢按钮在这里，随意拖动试试~";
        m36963a();
    }

    /* JADX INFO: renamed from: a */
    public final void m36963a() {
        setLayerType(0, this.f21834g);
        Paint paint = new Paint();
        this.f21834g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21834g.setAntiAlias(true);
        this.f21834g.setColor(-539853);
        this.f21834g.setShadowLayer(this.f21829b, 0.0f, t100.m186890d(2.0f), 419430400);
        TextPaint textPaint = new TextPaint();
        this.f21835h = textPaint;
        textPaint.setColor(-1);
        this.f21835h.setAntiAlias(true);
        this.f21835h.setTextSize(t100.m186890d(15.0f));
        this.f21835h.setTypeface(Typeface.DEFAULT_BOLD);
        TextPaint textPaint2 = this.f21835h;
        String str = this.f21836i;
        StaticLayout staticLayout = new StaticLayout(this.f21836i, this.f21835h, (int) textPaint2.measureText(str, 0, str.length()), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        this.f21837j = staticLayout;
        this.f21838k = (this.f21829b * 2) + (this.f21831d * 2) + staticLayout.getWidth() + this.f21830c;
        this.f21839l = (this.f21829b * 2) + (this.f21831d * 2) + this.f21837j.getHeight();
        this.f21833f = m36964b();
    }

    /* JADX INFO: renamed from: b */
    public final Path m36964b() {
        Path path = new Path();
        int i = this.f21829b;
        path.moveTo(this.f21828a + i, i);
        int i2 = this.f21838k;
        int i3 = this.f21829b;
        path.lineTo(((i2 - i3) - this.f21830c) - this.f21828a, i3);
        int i4 = this.f21838k;
        int i5 = this.f21829b;
        int i6 = this.f21830c;
        path.quadTo((i4 - i5) - i6, i5, (i4 - i5) - i6, i5 + i6);
        double d = ((this.f21832e / 180.0d) * 3.141592653589793d) / 2.0d;
        double dTan = Math.tan(d);
        int i7 = this.f21830c;
        int i8 = (int) (dTan * ((double) i7));
        path.lineTo((this.f21838k - this.f21829b) - i7, (this.f21839l / 2) - i8);
        int iTan = (int) (((double) ((i8 * 2) / 3)) / Math.tan(d));
        int i9 = i8 / 3;
        path.lineTo(((this.f21838k - this.f21829b) - this.f21830c) + iTan, (this.f21839l / 2) - i9);
        int i10 = this.f21838k;
        int i11 = this.f21829b;
        int i12 = this.f21830c;
        int i13 = this.f21839l;
        path.quadTo(((i10 - i11) - i12) + i12, i13 / 2, ((i10 - i11) - i12) + iTan, (i13 / 2) + i9);
        path.lineTo((this.f21838k - this.f21829b) - this.f21830c, (this.f21839l / 2) + i8);
        int i14 = this.f21838k;
        int i15 = this.f21829b;
        path.lineTo((i14 - i15) - this.f21830c, (this.f21839l - i15) - this.f21828a);
        int i16 = this.f21838k;
        int i17 = this.f21829b;
        int i18 = this.f21830c;
        int i19 = this.f21839l;
        path.quadTo((i16 - i17) - i18, i19 - i17, ((i16 - i17) - i18) - this.f21828a, i19 - i17);
        int i20 = this.f21829b;
        path.lineTo(this.f21828a + i20, this.f21839l - i20);
        int i21 = this.f21829b;
        int i22 = this.f21839l;
        path.quadTo(i21, i22 - i21, i21, (i22 - i21) - this.f21828a);
        int i23 = this.f21829b;
        path.lineTo(i23, this.f21828a + i23);
        int i24 = this.f21829b;
        path.quadTo(i24, i24, this.f21828a + i24, i24);
        return path;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f21833f;
        if (path != null) {
            canvas.drawPath(path, this.f21834g);
            canvas.save();
            int i = this.f21829b;
            int i2 = this.f21831d;
            canvas.translate(i + i2, i + i2);
            this.f21837j.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f21838k, this.f21839l);
    }

    public RightTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RightTipsView(Context context) {
        this(context, null);
    }
}
