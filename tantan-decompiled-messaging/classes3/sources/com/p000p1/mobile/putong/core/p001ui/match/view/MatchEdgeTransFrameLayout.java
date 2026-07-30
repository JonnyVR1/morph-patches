package com.p000p1.mobile.putong.core.p001ui.match.view;

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
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchEdgeTransFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f382a;

    /* JADX INFO: renamed from: b */
    public int f383b;

    /* JADX INFO: renamed from: c */
    public float f384c;

    /* JADX INFO: renamed from: d */
    public int f385d;

    /* JADX INFO: renamed from: e */
    public int f386e;

    /* JADX INFO: renamed from: f */
    public int f387f;

    /* JADX INFO: renamed from: g */
    public int f388g;

    /* JADX INFO: renamed from: h */
    public int f389h;

    /* JADX INFO: renamed from: i */
    public int f390i;

    /* JADX INFO: renamed from: j */
    public int[] f391j;

    /* JADX INFO: renamed from: k */
    public float[] f392k;

    public MatchEdgeTransFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f385d = 1;
        this.f386e = 1 << 1;
        this.f387f = 1 << 2;
        this.f388g = 1 << 3;
        this.f391j = new int[]{-1, 0};
        this.f392k = new float[]{0.0f, 1.0f};
        m716a();
    }

    /* JADX INFO: renamed from: a */
    public final void m716a() {
        Paint paint = new Paint(1);
        this.f382a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f382a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f383b = this.f385d | this.f386e;
        this.f384c = t100.d(10.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m717b() {
        this.f382a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f384c, this.f391j, this.f392k, Shader.TileMode.CLAMP));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.f383b;
        if (i == 0 || (i & this.f385d) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.f389h, this.f384c, this.f382a);
        }
        int i2 = this.f383b;
        if (i2 == 0 || (i2 & this.f386e) != 0) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, this.f389h / 2.0f, this.f390i / 2.0f);
            canvas.drawRect(0.0f, 0.0f, this.f389h, this.f384c, this.f382a);
            canvas.restoreToCount(iSave);
        }
        float f = (this.f390i - this.f389h) / 2.0f;
        int i3 = this.f383b;
        if (i3 == 0 || (i3 & this.f387f) != 0) {
            int iSave2 = canvas.save();
            canvas.rotate(270.0f, this.f389h / 2.0f, this.f390i / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.f389h + f, this.f384c, this.f382a);
            canvas.restoreToCount(iSave2);
        }
        int i4 = this.f383b;
        if (i4 == 0 || (i4 & this.f388g) != 0) {
            int iSave3 = canvas.save();
            canvas.rotate(90.0f, this.f389h / 2.0f, this.f390i / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.f389h + f, this.f384c, this.f382a);
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
        m717b();
        this.f389h = getWidth();
        this.f390i = getHeight();
    }

    public MatchEdgeTransFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MatchEdgeTransFrameLayout(Context context) {
        this(context, null);
    }
}
