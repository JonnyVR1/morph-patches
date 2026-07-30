package com.p046p1.mobile.putong.core.p053ui.profile.exp.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.t100;
import p149l.u4c0;
import p149l.w0c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileIntegrityOptView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f33218c;

    /* JADX INFO: renamed from: d */
    public VText f33219d;

    /* JADX INFO: renamed from: e */
    public VText f33220e;

    /* JADX INFO: renamed from: f */
    public VText f33221f;

    /* JADX INFO: renamed from: g */
    public Paint f33222g;

    /* JADX INFO: renamed from: h */
    public Paint f33223h;

    /* JADX INFO: renamed from: i */
    public int f33224i;

    /* JADX INFO: renamed from: j */
    public int f33225j;

    /* JADX INFO: renamed from: k */
    public int f33226k;

    /* JADX INFO: renamed from: l */
    public int f33227l;

    /* JADX INFO: renamed from: m */
    public int f33228m;

    /* JADX INFO: renamed from: n */
    public int f33229n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.ExpProfileIntegrityOptView$a */
    public static class C8636a {

        /* JADX INFO: renamed from: a */
        public int f33230a;

        /* JADX INFO: renamed from: b */
        public int f33231b;

        /* JADX INFO: renamed from: c */
        public String f33232c;

        /* JADX INFO: renamed from: d */
        public String f33233d;

        public C8636a(int i, int i2, String str, String str2) {
            this.f33230a = i;
            this.f33231b = i2;
            this.f33232c = str;
            this.f33233d = str2;
        }
    }

    public ExpProfileIntegrityOptView(Context context) {
        super(context);
        this.f33226k = t100.m186890d(0.0f);
        this.f33227l = t100.m186890d(20.0f);
        this.f33228m = t100.m186890d(16.0f);
        this.f33229n = t100.m186890d(3.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f33224i == this.f33225j) {
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, (this.f33228m / 2.0f) + this.f33226k, this.f33227l / 2.0f);
        int i = this.f33228m;
        canvas.drawCircle((i / 2.0f) + this.f33226k, this.f33227l / 2.0f, (i / 2.0f) - this.f33229n, this.f33222g);
        int i2 = this.f33226k;
        int i3 = this.f33229n;
        RectF rectF = new RectF(i2 + i3, i3 + t100.m186890d(2.0f), (this.f33226k + this.f33228m) - this.f33229n, (this.f33227l - t100.m186890d(2.0f)) - this.f33229n);
        int i4 = this.f33224i;
        canvas.drawArc(rectF, 0.0f, i4 == 0 ? 36.0f : (i4 / this.f33225j) * 360.0f, false, this.f33223h);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33218c = (VImage) findViewById(u4c0.f173824G5);
        this.f33219d = (VText) findViewById(u4c0.f174268ge);
        this.f33220e = (VText) findViewById(u4c0.f174490u);
        this.f33221f = (VText) findViewById(u4c0.f174207d4);
        Paint paint = new Paint();
        this.f33222g = paint;
        paint.setColor(getResources().getColor(w0c0.f183870n0));
        Paint paint2 = this.f33222g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f33222g.setStrokeWidth(t100.m186890d(3.2f));
        this.f33222g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f33223h = paint3;
        paint3.setColor(getResources().getColor(w0c0.f183831b));
        this.f33223h.setStyle(style);
        this.f33223h.setStrokeWidth(t100.m186890d(3.2f));
        this.f33223h.setAntiAlias(true);
    }

    public ExpProfileIntegrityOptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33226k = t100.m186890d(0.0f);
        this.f33227l = t100.m186890d(20.0f);
        this.f33228m = t100.m186890d(16.0f);
        this.f33229n = t100.m186890d(3.0f);
    }

    public ExpProfileIntegrityOptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33226k = t100.m186890d(0.0f);
        this.f33227l = t100.m186890d(20.0f);
        this.f33228m = t100.m186890d(16.0f);
        this.f33229n = t100.m186890d(3.0f);
    }
}
