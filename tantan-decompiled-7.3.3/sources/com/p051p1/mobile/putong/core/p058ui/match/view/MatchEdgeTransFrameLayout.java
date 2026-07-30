package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class MatchEdgeTransFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f31339a;

    /* JADX INFO: renamed from: b */
    public int f31340b;

    /* JADX INFO: renamed from: c */
    public float f31341c;

    /* JADX INFO: renamed from: d */
    public int f31342d;

    /* JADX INFO: renamed from: e */
    public int f31343e;

    /* JADX INFO: renamed from: f */
    public int f31344f;

    /* JADX INFO: renamed from: g */
    public int f31345g;

    /* JADX INFO: renamed from: h */
    public int f31346h;

    /* JADX INFO: renamed from: i */
    public int f31347i;

    /* JADX INFO: renamed from: j */
    public int[] f31348j;

    /* JADX INFO: renamed from: k */
    public float[] f31349k;

    public MatchEdgeTransFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31342d = 1;
        this.f31343e = 1 << 1;
        this.f31344f = 1 << 2;
        this.f31345g = 1 << 3;
        this.f31348j = new int[]{-1, 0};
        this.f31349k = new float[]{0.0f, 1.0f};
        m48835a();
    }

    /* JADX INFO: renamed from: a */
    public final void m48835a() {
        Paint paint = new Paint(1);
        this.f31339a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31339a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f31340b = this.f31342d | this.f31343e;
        this.f31341c = qa00.m175859d(10.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m48836b() {
        this.f31339a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f31341c, this.f31348j, this.f31349k, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.f31340b;
        if (i == 0 || (i & this.f31342d) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.f31346h, this.f31341c, this.f31339a);
        }
        int i2 = this.f31340b;
        if (i2 == 0 || (i2 & this.f31343e) != 0) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, this.f31346h / 2.0f, this.f31347i / 2.0f);
            canvas.drawRect(0.0f, 0.0f, this.f31346h, this.f31341c, this.f31339a);
            canvas.restoreToCount(iSave);
        }
        float f = (this.f31347i - this.f31346h) / 2.0f;
        int i3 = this.f31340b;
        if (i3 == 0 || (i3 & this.f31344f) != 0) {
            int iSave2 = canvas.save();
            canvas.rotate(270.0f, this.f31346h / 2.0f, this.f31347i / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.f31346h + f, this.f31341c, this.f31339a);
            canvas.restoreToCount(iSave2);
        }
        int i4 = this.f31340b;
        if (i4 == 0 || (i4 & this.f31345g) != 0) {
            int iSave3 = canvas.save();
            canvas.rotate(90.0f, this.f31346h / 2.0f, this.f31347i / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.f31346h + f, this.f31341c, this.f31339a);
            canvas.restoreToCount(iSave3);
        }
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m48836b();
        this.f31346h = getWidth();
        this.f31347i = getHeight();
    }

    public MatchEdgeTransFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MatchEdgeTransFrameLayout(Context context) {
        this(context, null);
    }
}
