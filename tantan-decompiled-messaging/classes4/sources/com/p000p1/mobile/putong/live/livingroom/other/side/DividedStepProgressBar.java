package com.p000p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.other.side.DividedStepProgressBar;
import java.util.HashSet;
import l.e30;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DividedStepProgressBar extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f7284a;

    /* JADX INFO: renamed from: b */
    public final Paint f7285b;

    /* JADX INFO: renamed from: c */
    public int f7286c;

    /* JADX INFO: renamed from: d */
    public int f7287d;

    /* JADX INFO: renamed from: e */
    public int f7288e;

    /* JADX INFO: renamed from: f */
    public int f7289f;

    /* JADX INFO: renamed from: g */
    public int f7290g;

    /* JADX INFO: renamed from: h */
    public boolean f7291h;

    /* JADX INFO: renamed from: i */
    public final HashSet<InterfaceC0481a> f7292i;

    /* JADX INFO: renamed from: j */
    public boolean f7293j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.side.DividedStepProgressBar$a */
    public interface InterfaceC0481a {
        /* JADX INFO: renamed from: a */
        void m9193a(int i, int i2);
    }

    public DividedStepProgressBar(Context context) {
        super(context);
        this.f7284a = new Paint();
        this.f7285b = new Paint();
        this.f7286c = 0;
        this.f7287d = t100.d;
        this.f7288e = t100.a;
        this.f7289f = 3000;
        this.f7290g = 0;
        this.f7291h = true;
        this.f7292i = new HashSet<>();
        this.f7293j = false;
        m9192c();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m9191b(int i, InterfaceC0481a interfaceC0481a) {
        interfaceC0481a.m9193a(this.f7290g, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m9192c() {
        this.f7284a.setAntiAlias(true);
        this.f7284a.setDither(true);
        Paint paint = this.f7284a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f7284a.setColor(1526726655);
        this.f7285b.setAntiAlias(true);
        this.f7285b.setDither(true);
        this.f7285b.setStyle(style);
        this.f7285b.setColor(-1694498817);
    }

    public int getRadius() {
        return this.f7288e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7286c <= 0) {
            this.f7290g = 0;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.f7287d;
        int i2 = this.f7286c;
        int i3 = (measuredWidth - (i * (i2 - 1))) / i2;
        for (int i4 = 1; i4 <= this.f7286c; i4++) {
            int i5 = (i4 - 1) * (this.f7287d + i3);
            int i6 = this.f7288e;
            canvas.drawRoundRect(i5, 0.0f, i5 + i3, measuredHeight, i6, i6, this.f7284a);
        }
        int i7 = this.f7290g;
        int i8 = this.f7289f;
        final int i9 = i7 / i8;
        int i10 = (this.f7287d + i3) * i9;
        int i11 = this.f7293j ? ((i8 - (i7 % i8)) * i3) / i8 : ((i7 % i8) * i3) / i8;
        int i12 = this.f7288e;
        canvas.drawRoundRect(i10, 0.0f, i11 + i10, measuredHeight, i12, i12, this.f7285b);
        vwb.z(this.f7292i, new e30() { // from class: l.r4e
            public final void call(Object obj) {
                this.f18360a.m9191b(i9, (DividedStepProgressBar.InterfaceC0481a) obj);
            }
        });
        if (this.f7291h) {
            this.f7290g = (this.f7290g + 50) % (this.f7289f * this.f7286c);
            postInvalidateDelayed(50L);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE && mode2 != Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (Integer.MIN_VALUE == mode) {
            size = Math.min(size, t100.d(78.0f));
        }
        if (Integer.MIN_VALUE == mode2) {
            size2 = Math.min(size2, t100.c);
        }
        setMeasuredDimension(size, size2);
    }

    public void setRadius(int i) {
        this.f7288e = i;
    }

    public DividedStepProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7284a = new Paint();
        this.f7285b = new Paint();
        this.f7286c = 0;
        this.f7287d = t100.d;
        this.f7288e = t100.a;
        this.f7289f = 3000;
        this.f7290g = 0;
        this.f7291h = true;
        this.f7292i = new HashSet<>();
        this.f7293j = false;
        m9192c();
    }

    public DividedStepProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7284a = new Paint();
        this.f7285b = new Paint();
        this.f7286c = 0;
        this.f7287d = t100.d;
        this.f7288e = t100.a;
        this.f7289f = 3000;
        this.f7290g = 0;
        this.f7291h = true;
        this.f7292i = new HashSet<>();
        this.f7293j = false;
        m9192c();
    }
}
