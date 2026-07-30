package com.p046p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.other.side.DividedStepProgressBar;
import java.util.HashSet;
import p149l.e30;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class DividedStepProgressBar extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f51242a;

    /* JADX INFO: renamed from: b */
    public final Paint f51243b;

    /* JADX INFO: renamed from: c */
    public int f51244c;

    /* JADX INFO: renamed from: d */
    public int f51245d;

    /* JADX INFO: renamed from: e */
    public int f51246e;

    /* JADX INFO: renamed from: f */
    public int f51247f;

    /* JADX INFO: renamed from: g */
    public int f51248g;

    /* JADX INFO: renamed from: h */
    public boolean f51249h;

    /* JADX INFO: renamed from: i */
    public final HashSet<InterfaceC12892a> f51250i;

    /* JADX INFO: renamed from: j */
    public boolean f51251j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.side.DividedStepProgressBar$a */
    public interface InterfaceC12892a {
        /* JADX INFO: renamed from: a */
        void m75556a(int i, int i2);
    }

    public DividedStepProgressBar(Context context) {
        super(context);
        this.f51242a = new Paint();
        this.f51243b = new Paint();
        this.f51244c = 0;
        this.f51245d = t100.f167255d;
        this.f51246e = t100.f167252a;
        this.f51247f = 3000;
        this.f51248g = 0;
        this.f51249h = true;
        this.f51250i = new HashSet<>();
        this.f51251j = false;
        m75555c();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m75554b(int i, InterfaceC12892a interfaceC12892a) {
        interfaceC12892a.m75556a(this.f51248g, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m75555c() {
        this.f51242a.setAntiAlias(true);
        this.f51242a.setDither(true);
        Paint paint = this.f51242a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f51242a.setColor(1526726655);
        this.f51243b.setAntiAlias(true);
        this.f51243b.setDither(true);
        this.f51243b.setStyle(style);
        this.f51243b.setColor(-1694498817);
    }

    public int getRadius() {
        return this.f51246e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51244c <= 0) {
            this.f51248g = 0;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.f51245d;
        int i2 = this.f51244c;
        int i3 = (measuredWidth - (i * (i2 - 1))) / i2;
        for (int i4 = 1; i4 <= this.f51244c; i4++) {
            int i5 = (i4 - 1) * (this.f51245d + i3);
            int i6 = this.f51246e;
            canvas.drawRoundRect(i5, 0.0f, i5 + i3, measuredHeight, i6, i6, this.f51242a);
        }
        int i7 = this.f51248g;
        int i8 = this.f51247f;
        final int i9 = i7 / i8;
        int i10 = (this.f51245d + i3) * i9;
        int i11 = this.f51251j ? ((i8 - (i7 % i8)) * i3) / i8 : ((i7 % i8) * i3) / i8;
        int i12 = this.f51246e;
        canvas.drawRoundRect(i10, 0.0f, i11 + i10, measuredHeight, i12, i12, this.f51243b);
        vwb.m200354z(this.f51250i, new e30() { // from class: l.r4e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157665a.m75554b(i9, (DividedStepProgressBar.InterfaceC12892a) obj);
            }
        });
        if (this.f51249h) {
            this.f51248g = (this.f51248g + 50) % (this.f51247f * this.f51244c);
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
            size = Math.min(size, t100.m186890d(78.0f));
        }
        if (Integer.MIN_VALUE == mode2) {
            size2 = Math.min(size2, t100.f167254c);
        }
        setMeasuredDimension(size, size2);
    }

    public void setRadius(int i) {
        this.f51246e = i;
    }

    public DividedStepProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51242a = new Paint();
        this.f51243b = new Paint();
        this.f51244c = 0;
        this.f51245d = t100.f167255d;
        this.f51246e = t100.f167252a;
        this.f51247f = 3000;
        this.f51248g = 0;
        this.f51249h = true;
        this.f51250i = new HashSet<>();
        this.f51251j = false;
        m75555c();
    }

    public DividedStepProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51242a = new Paint();
        this.f51243b = new Paint();
        this.f51244c = 0;
        this.f51245d = t100.f167255d;
        this.f51246e = t100.f167252a;
        this.f51247f = 3000;
        this.f51248g = 0;
        this.f51249h = true;
        this.f51250i = new HashSet<>();
        this.f51251j = false;
        m75555c();
    }
}
