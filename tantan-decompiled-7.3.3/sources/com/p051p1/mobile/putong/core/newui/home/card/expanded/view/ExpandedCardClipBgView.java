package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

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
import p153l.dox;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardClipBgView extends View {

    /* JADX INFO: renamed from: a */
    public int f23246a;

    /* JADX INFO: renamed from: b */
    public int f23247b;

    /* JADX INFO: renamed from: c */
    public int f23248c;

    /* JADX INFO: renamed from: d */
    public int f23249d;

    /* JADX INFO: renamed from: e */
    public int f23250e;

    /* JADX INFO: renamed from: f */
    public int f23251f;

    /* JADX INFO: renamed from: g */
    public Paint f23252g;

    /* JADX INFO: renamed from: h */
    public Xfermode f23253h;

    /* JADX INFO: renamed from: i */
    public Path f23254i;

    /* JADX INFO: renamed from: j */
    public RectF f23255j;

    /* JADX INFO: renamed from: k */
    public float[] f23256k;

    /* JADX INFO: renamed from: l */
    public float f23257l;

    public ExpandedCardClipBgView(Context context) {
        super(context);
        this.f23248c = 0;
        this.f23249d = 0;
        this.f23251f = 0;
        m39231a();
    }

    /* JADX INFO: renamed from: a */
    public final void m39231a() {
        Paint paint = new Paint();
        this.f23252g = paint;
        paint.setColor(-1);
        this.f23252g.setAntiAlias(true);
        this.f23253h = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f23250e = qa00.m175859d(10.0f);
        float fM175859d = qa00.m175859d(20.0f);
        this.f23257l = fM175859d;
        this.f23256k = new float[]{fM175859d, fM175859d, fM175859d, fM175859d, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23254i = new Path();
        this.f23255j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m39232b(int i, int i2) {
        this.f23248c = i;
        this.f23249d = i2;
        invalidate();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        int iMax = Math.max((int) (-this.f23257l), ((this.f23249d + this.f23250e) + this.f23251f) - this.f23248c);
        this.f23254i.reset();
        this.f23255j.set(0.0f, iMax, this.f23247b, this.f23246a);
        this.f23254i.addRoundRect(this.f23255j, this.f23256k, Path.Direction.CW);
        this.f23254i.close();
        canvas.clipPath(this.f23254i);
        super.draw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f23246a = dox.m117366d(i2);
        this.f23247b = dox.m117366d(i);
    }

    public void setExtTop(int i) {
        this.f23251f = i;
        invalidate();
    }

    public ExpandedCardClipBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23248c = 0;
        this.f23249d = 0;
        this.f23251f = 0;
        m39231a();
    }

    public ExpandedCardClipBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23248c = 0;
        this.f23249d = 0;
        this.f23251f = 0;
        m39231a();
    }
}
