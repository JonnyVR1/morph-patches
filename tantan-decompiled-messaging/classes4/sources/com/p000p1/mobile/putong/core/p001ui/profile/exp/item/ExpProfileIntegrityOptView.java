package com.p000p1.mobile.putong.core.p001ui.profile.exp.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import l.t100;
import l.u4c0;
import l.w0c0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileIntegrityOptView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f1040c;

    /* JADX INFO: renamed from: d */
    public VText f1041d;

    /* JADX INFO: renamed from: e */
    public VText f1042e;

    /* JADX INFO: renamed from: f */
    public VText f1043f;

    /* JADX INFO: renamed from: g */
    public Paint f1044g;

    /* JADX INFO: renamed from: h */
    public Paint f1045h;

    /* JADX INFO: renamed from: i */
    public int f1046i;

    /* JADX INFO: renamed from: j */
    public int f1047j;

    /* JADX INFO: renamed from: k */
    public int f1048k;

    /* JADX INFO: renamed from: l */
    public int f1049l;

    /* JADX INFO: renamed from: m */
    public int f1050m;

    /* JADX INFO: renamed from: n */
    public int f1051n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.ExpProfileIntegrityOptView$a */
    public static class C0061a {

        /* JADX INFO: renamed from: a */
        public int f1052a;

        /* JADX INFO: renamed from: b */
        public int f1053b;

        /* JADX INFO: renamed from: c */
        public String f1054c;

        /* JADX INFO: renamed from: d */
        public String f1055d;

        public C0061a(int i, int i2, String str, String str2) {
            this.f1052a = i;
            this.f1053b = i2;
            this.f1054c = str;
            this.f1055d = str2;
        }
    }

    public ExpProfileIntegrityOptView(Context context) {
        super(context);
        this.f1048k = t100.d(0.0f);
        this.f1049l = t100.d(20.0f);
        this.f1050m = t100.d(16.0f);
        this.f1051n = t100.d(3.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NonNull Canvas canvas) {
        super/*android.view.View*/.dispatchDraw(canvas);
        if (this.f1046i == this.f1047j) {
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, (this.f1050m / 2.0f) + this.f1048k, this.f1049l / 2.0f);
        int i = this.f1050m;
        canvas.drawCircle((i / 2.0f) + this.f1048k, this.f1049l / 2.0f, (i / 2.0f) - this.f1051n, this.f1044g);
        int i2 = this.f1048k;
        int i3 = this.f1051n;
        RectF rectF = new RectF(i2 + i3, i3 + t100.d(2.0f), (this.f1048k + this.f1050m) - this.f1051n, (this.f1049l - t100.d(2.0f)) - this.f1051n);
        int i4 = this.f1046i;
        canvas.drawArc(rectF, 0.0f, i4 == 0 ? 36.0f : (i4 / this.f1047j) * 360.0f, false, this.f1045h);
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f1040c = findViewById(u4c0.G5);
        this.f1041d = findViewById(u4c0.ge);
        this.f1042e = findViewById(u4c0.u);
        this.f1043f = findViewById(u4c0.d4);
        Paint paint = new Paint();
        this.f1044g = paint;
        paint.setColor(getResources().getColor(w0c0.n0));
        Paint paint2 = this.f1044g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f1044g.setStrokeWidth(t100.d(3.2f));
        this.f1044g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f1045h = paint3;
        paint3.setColor(getResources().getColor(w0c0.b));
        this.f1045h.setStyle(style);
        this.f1045h.setStrokeWidth(t100.d(3.2f));
        this.f1045h.setAntiAlias(true);
    }

    public ExpProfileIntegrityOptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1048k = t100.d(0.0f);
        this.f1049l = t100.d(20.0f);
        this.f1050m = t100.d(16.0f);
        this.f1051n = t100.d(3.0f);
    }

    public ExpProfileIntegrityOptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1048k = t100.d(0.0f);
        this.f1049l = t100.d(20.0f);
        this.f1050m = t100.d(16.0f);
        this.f1051n = t100.d(3.0f);
    }
}
