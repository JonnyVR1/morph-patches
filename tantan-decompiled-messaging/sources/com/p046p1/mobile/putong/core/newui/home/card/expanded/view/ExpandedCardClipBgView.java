package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

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
import p149l.ffx;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardClipBgView extends View {

    /* JADX INFO: renamed from: a */
    public int f22504a;

    /* JADX INFO: renamed from: b */
    public int f22505b;

    /* JADX INFO: renamed from: c */
    public int f22506c;

    /* JADX INFO: renamed from: d */
    public int f22507d;

    /* JADX INFO: renamed from: e */
    public int f22508e;

    /* JADX INFO: renamed from: f */
    public int f22509f;

    /* JADX INFO: renamed from: g */
    public Paint f22510g;

    /* JADX INFO: renamed from: h */
    public Xfermode f22511h;

    /* JADX INFO: renamed from: i */
    public Path f22512i;

    /* JADX INFO: renamed from: j */
    public RectF f22513j;

    /* JADX INFO: renamed from: k */
    public float[] f22514k;

    /* JADX INFO: renamed from: l */
    public float f22515l;

    public ExpandedCardClipBgView(Context context) {
        super(context);
        this.f22506c = 0;
        this.f22507d = 0;
        this.f22509f = 0;
        m38228a();
    }

    /* JADX INFO: renamed from: a */
    public final void m38228a() {
        Paint paint = new Paint();
        this.f22510g = paint;
        paint.setColor(-1);
        this.f22510g.setAntiAlias(true);
        this.f22511h = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f22508e = t100.m186890d(10.0f);
        float fM186890d = t100.m186890d(20.0f);
        this.f22515l = fM186890d;
        this.f22514k = new float[]{fM186890d, fM186890d, fM186890d, fM186890d, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f22512i = new Path();
        this.f22513j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m38229b(int i, int i2) {
        this.f22506c = i;
        this.f22507d = i2;
        invalidate();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        int iMax = Math.max((int) (-this.f22515l), ((this.f22507d + this.f22508e) + this.f22509f) - this.f22506c);
        this.f22512i.reset();
        this.f22513j.set(0.0f, iMax, this.f22505b, this.f22504a);
        this.f22512i.addRoundRect(this.f22513j, this.f22514k, Path.Direction.CW);
        this.f22512i.close();
        canvas.clipPath(this.f22512i);
        super.draw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f22504a = ffx.m121201d(i2);
        this.f22505b = ffx.m121201d(i);
    }

    public void setExtTop(int i) {
        this.f22509f = i;
        invalidate();
    }

    public ExpandedCardClipBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22506c = 0;
        this.f22507d = 0;
        this.f22509f = 0;
        m38228a();
    }

    public ExpandedCardClipBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22506c = 0;
        this.f22507d = 0;
        this.f22509f = 0;
        m38228a();
    }
}
