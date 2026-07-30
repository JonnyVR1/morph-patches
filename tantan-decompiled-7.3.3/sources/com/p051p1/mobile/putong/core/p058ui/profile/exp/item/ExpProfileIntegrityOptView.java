package com.p051p1.mobile.putong.core.p058ui.profile.exp.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.c9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileIntegrityOptView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f34066c;

    /* JADX INFO: renamed from: d */
    public VText f34067d;

    /* JADX INFO: renamed from: e */
    public VText f34068e;

    /* JADX INFO: renamed from: f */
    public VText f34069f;

    /* JADX INFO: renamed from: g */
    public Paint f34070g;

    /* JADX INFO: renamed from: h */
    public Paint f34071h;

    /* JADX INFO: renamed from: i */
    public int f34072i;

    /* JADX INFO: renamed from: j */
    public int f34073j;

    /* JADX INFO: renamed from: k */
    public int f34074k;

    /* JADX INFO: renamed from: l */
    public int f34075l;

    /* JADX INFO: renamed from: m */
    public int f34076m;

    /* JADX INFO: renamed from: n */
    public int f34077n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.ExpProfileIntegrityOptView$a */
    public static class C8799a {

        /* JADX INFO: renamed from: a */
        public int f34078a;

        /* JADX INFO: renamed from: b */
        public int f34079b;

        /* JADX INFO: renamed from: c */
        public String f34080c;

        /* JADX INFO: renamed from: d */
        public String f34081d;

        public C8799a(int i, int i2, String str, String str2) {
            this.f34078a = i;
            this.f34079b = i2;
            this.f34080c = str;
            this.f34081d = str2;
        }
    }

    public ExpProfileIntegrityOptView(Context context) {
        super(context);
        this.f34074k = qa00.m175859d(0.0f);
        this.f34075l = qa00.m175859d(20.0f);
        this.f34076m = qa00.m175859d(16.0f);
        this.f34077n = qa00.m175859d(3.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f34072i == this.f34073j) {
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, (this.f34076m / 2.0f) + this.f34074k, this.f34075l / 2.0f);
        int i = this.f34076m;
        canvas.drawCircle((i / 2.0f) + this.f34074k, this.f34075l / 2.0f, (i / 2.0f) - this.f34077n, this.f34070g);
        int i2 = this.f34074k;
        int i3 = this.f34077n;
        RectF rectF = new RectF(i2 + i3, i3 + qa00.m175859d(2.0f), (this.f34074k + this.f34076m) - this.f34077n, (this.f34075l - qa00.m175859d(2.0f)) - this.f34077n);
        int i4 = this.f34072i;
        canvas.drawArc(rectF, 0.0f, i4 == 0 ? 36.0f : (i4 / this.f34073j) * 360.0f, false, this.f34071h);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f34066c = (VImage) findViewById(adc0.f69946I5);
        this.f34067d = (VText) findViewById(adc0.f70409je);
        this.f34068e = (VText) findViewById(adc0.f70581u);
        this.f34069f = (VText) findViewById(adc0.f70332f4);
        Paint paint = new Paint();
        this.f34070g = paint;
        paint.setColor(getResources().getColor(c9c0.f80443o0));
        Paint paint2 = this.f34070g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f34070g.setStrokeWidth(qa00.m175859d(3.2f));
        this.f34070g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f34071h = paint3;
        paint3.setColor(getResources().getColor(c9c0.f80400b));
        this.f34071h.setStyle(style);
        this.f34071h.setStrokeWidth(qa00.m175859d(3.2f));
        this.f34071h.setAntiAlias(true);
    }

    public ExpProfileIntegrityOptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34074k = qa00.m175859d(0.0f);
        this.f34075l = qa00.m175859d(20.0f);
        this.f34076m = qa00.m175859d(16.0f);
        this.f34077n = qa00.m175859d(3.0f);
    }

    public ExpProfileIntegrityOptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34074k = qa00.m175859d(0.0f);
        this.f34075l = qa00.m175859d(20.0f);
        this.f34076m = qa00.m175859d(16.0f);
        this.f34077n = qa00.m175859d(3.0f);
    }
}
