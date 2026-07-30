package com.p046p1.mobile.putong.core.p053ui.match.view;

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
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class MatchEdgeTransFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f30491a;

    /* JADX INFO: renamed from: b */
    public int f30492b;

    /* JADX INFO: renamed from: c */
    public float f30493c;

    /* JADX INFO: renamed from: d */
    public int f30494d;

    /* JADX INFO: renamed from: e */
    public int f30495e;

    /* JADX INFO: renamed from: f */
    public int f30496f;

    /* JADX INFO: renamed from: g */
    public int f30497g;

    /* JADX INFO: renamed from: h */
    public int f30498h;

    /* JADX INFO: renamed from: i */
    public int f30499i;

    /* JADX INFO: renamed from: j */
    public int[] f30500j;

    /* JADX INFO: renamed from: k */
    public float[] f30501k;

    public MatchEdgeTransFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30494d = 1;
        this.f30495e = 1 << 1;
        this.f30496f = 1 << 2;
        this.f30497g = 1 << 3;
        this.f30500j = new int[]{-1, 0};
        this.f30501k = new float[]{0.0f, 1.0f};
        m47652a();
    }

    /* JADX INFO: renamed from: a */
    public final void m47652a() {
        Paint paint = new Paint(1);
        this.f30491a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f30491a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f30492b = this.f30494d | this.f30495e;
        this.f30493c = t100.m186890d(10.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m47653b() {
        this.f30491a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f30493c, this.f30500j, this.f30501k, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.f30492b;
        if (i == 0 || (i & this.f30494d) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.f30498h, this.f30493c, this.f30491a);
        }
        int i2 = this.f30492b;
        if (i2 == 0 || (i2 & this.f30495e) != 0) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, this.f30498h / 2.0f, this.f30499i / 2.0f);
            canvas.drawRect(0.0f, 0.0f, this.f30498h, this.f30493c, this.f30491a);
            canvas.restoreToCount(iSave);
        }
        float f = (this.f30499i - this.f30498h) / 2.0f;
        int i3 = this.f30492b;
        if (i3 == 0 || (i3 & this.f30496f) != 0) {
            int iSave2 = canvas.save();
            canvas.rotate(270.0f, this.f30498h / 2.0f, this.f30499i / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.f30498h + f, this.f30493c, this.f30491a);
            canvas.restoreToCount(iSave2);
        }
        int i4 = this.f30492b;
        if (i4 == 0 || (i4 & this.f30497g) != 0) {
            int iSave3 = canvas.save();
            canvas.rotate(90.0f, this.f30498h / 2.0f, this.f30499i / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.f30498h + f, this.f30493c, this.f30491a);
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
        m47653b();
        this.f30498h = getWidth();
        this.f30499i = getHeight();
    }

    public MatchEdgeTransFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MatchEdgeTransFrameLayout(Context context) {
        this(context, null);
    }
}
