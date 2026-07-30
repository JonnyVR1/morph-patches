package com.p046p1.mobile.putong.core.p053ui.slide;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class NewSlideProcessView extends View {

    /* JADX INFO: renamed from: a */
    public final int f36341a;

    /* JADX INFO: renamed from: b */
    public final int f36342b;

    /* JADX INFO: renamed from: c */
    public Paint f36343c;

    /* JADX INFO: renamed from: d */
    public Paint f36344d;

    /* JADX INFO: renamed from: e */
    public float f36345e;

    /* JADX INFO: renamed from: f */
    public final int f36346f;

    /* JADX INFO: renamed from: g */
    public final int f36347g;

    /* JADX INFO: renamed from: h */
    public boolean f36348h;

    public NewSlideProcessView(@NonNull Context context) {
        super(context);
        this.f36341a = Color.parseColor("#03aeff");
        this.f36342b = Color.parseColor("#4a4a4a");
        this.f36345e = -1.0f;
        this.f36346f = xdl0.m208412y0() - t100.m186890d(10.0f);
        this.f36347g = t100.m186890d(10.0f);
        m55688b();
    }

    /* JADX INFO: renamed from: b */
    public final void m55688b() {
        Paint paint = new Paint();
        this.f36343c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f36343c.setColor(this.f36341a);
        this.f36343c.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f36344d = paint2;
        paint2.setStyle(style);
        this.f36344d.setColor(this.f36342b);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m55689c() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f36345e;
        if (f < 0.0f) {
            return;
        }
        if (this.f36348h || f != 0.0f) {
            this.f36343c.setStrokeWidth(t100.m186890d(3.0f));
            this.f36344d.setStrokeWidth(t100.m186890d(1.0f));
            canvas.drawLine(0.0f, 0.0f, xdl0.m208412y0(), 0.0f, this.f36344d);
            canvas.drawLine(0.0f, 0.0f, (this.f36346f * this.f36345e) + this.f36347g, 0.0f, this.f36343c);
            return;
        }
        this.f36343c.setStrokeWidth(t100.m186890d(7.0f));
        this.f36344d.setStrokeWidth(t100.m186890d(3.0f));
        this.f36348h = true;
        canvas.drawLine(0.0f, 0.0f, xdl0.m208412y0(), 0.0f, this.f36344d);
        canvas.drawLine(0.0f, 0.0f, (this.f36346f * this.f36345e) + this.f36347g, 0.0f, this.f36343c);
        postDelayed(new Runnable() { // from class: l.o940
            @Override // java.lang.Runnable
            public final void run() {
                this.f142693a.m55689c();
            }
        }, 3000L);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setProcess(float f) {
        if (this.f36345e == f) {
            return;
        }
        this.f36345e = f;
        invalidate();
    }

    public NewSlideProcessView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36341a = Color.parseColor("#03aeff");
        this.f36342b = Color.parseColor("#4a4a4a");
        this.f36345e = -1.0f;
        this.f36346f = xdl0.m208412y0() - t100.m186890d(10.0f);
        this.f36347g = t100.m186890d(10.0f);
        m55688b();
    }

    public NewSlideProcessView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36341a = Color.parseColor("#03aeff");
        this.f36342b = Color.parseColor("#4a4a4a");
        this.f36345e = -1.0f;
        this.f36346f = xdl0.m208412y0() - t100.m186890d(10.0f);
        this.f36347g = t100.m186890d(10.0f);
        m55688b();
    }
}
