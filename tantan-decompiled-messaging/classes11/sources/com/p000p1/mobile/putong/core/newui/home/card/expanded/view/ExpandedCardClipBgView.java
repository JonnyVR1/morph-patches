package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedCardClipBgView extends View {

    /* JADX INFO: renamed from: a */
    public int f1282a;

    /* JADX INFO: renamed from: b */
    public int f1283b;

    /* JADX INFO: renamed from: c */
    public int f1284c;

    /* JADX INFO: renamed from: d */
    public int f1285d;

    /* JADX INFO: renamed from: e */
    public int f1286e;

    /* JADX INFO: renamed from: f */
    public int f1287f;

    /* JADX INFO: renamed from: g */
    public Paint f1288g;

    /* JADX INFO: renamed from: h */
    public Xfermode f1289h;

    /* JADX INFO: renamed from: i */
    public Path f1290i;

    /* JADX INFO: renamed from: j */
    public RectF f1291j;

    /* JADX INFO: renamed from: k */
    public float[] f1292k;

    /* JADX INFO: renamed from: l */
    public float f1293l;

    public ExpandedCardClipBgView(Context context) {
        super(context);
        this.f1284c = 0;
        this.f1285d = 0;
        this.f1287f = 0;
        m2206a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2206a() {
        Paint paint = new Paint();
        this.f1288g = paint;
        paint.setColor(-1);
        this.f1288g.setAntiAlias(true);
        this.f1289h = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f1286e = t100.d(10.0f);
        float fD = t100.d(20.0f);
        this.f1293l = fD;
        this.f1292k = new float[]{fD, fD, fD, fD, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f1290i = new Path();
        this.f1291j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m2207b(int i, int i2) {
        this.f1284c = i;
        this.f1285d = i2;
        invalidate();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        int iMax = Math.max((int) (-this.f1293l), ((this.f1285d + this.f1286e) + this.f1287f) - this.f1284c);
        this.f1290i.reset();
        this.f1291j.set(0.0f, iMax, this.f1283b, this.f1282a);
        this.f1290i.addRoundRect(this.f1291j, this.f1292k, Path.Direction.CW);
        this.f1290i.close();
        canvas.clipPath(this.f1290i);
        super.draw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1282a = ffx.d(i2);
        this.f1283b = ffx.d(i);
    }

    public void setExtTop(int i) {
        this.f1287f = i;
        invalidate();
    }

    public ExpandedCardClipBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1284c = 0;
        this.f1285d = 0;
        this.f1287f = 0;
        m2206a();
    }

    public ExpandedCardClipBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1284c = 0;
        this.f1285d = 0;
        this.f1287f = 0;
        m2206a();
    }
}
