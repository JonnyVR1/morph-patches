package com.p051p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.other.side.DividedStepProgressBar;
import java.util.HashSet;
import p153l.jyb;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class DividedStepProgressBar extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f52090a;

    /* JADX INFO: renamed from: b */
    public final Paint f52091b;

    /* JADX INFO: renamed from: c */
    public int f52092c;

    /* JADX INFO: renamed from: d */
    public int f52093d;

    /* JADX INFO: renamed from: e */
    public int f52094e;

    /* JADX INFO: renamed from: f */
    public int f52095f;

    /* JADX INFO: renamed from: g */
    public int f52096g;

    /* JADX INFO: renamed from: h */
    public boolean f52097h;

    /* JADX INFO: renamed from: i */
    public final HashSet<InterfaceC13055a> f52098i;

    /* JADX INFO: renamed from: j */
    public boolean f52099j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.side.DividedStepProgressBar$a */
    public interface InterfaceC13055a {
        /* JADX INFO: renamed from: a */
        void m76739a(int i, int i2);
    }

    public DividedStepProgressBar(Context context) {
        super(context);
        this.f52090a = new Paint();
        this.f52091b = new Paint();
        this.f52092c = 0;
        this.f52093d = qa00.f156317d;
        this.f52094e = qa00.f156314a;
        this.f52095f = 3000;
        this.f52096g = 0;
        this.f52097h = true;
        this.f52098i = new HashSet<>();
        this.f52099j = false;
        m76738c();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m76737b(int i, InterfaceC13055a interfaceC13055a) {
        interfaceC13055a.m76739a(this.f52096g, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m76738c() {
        this.f52090a.setAntiAlias(true);
        this.f52090a.setDither(true);
        Paint paint = this.f52090a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f52090a.setColor(1526726655);
        this.f52091b.setAntiAlias(true);
        this.f52091b.setDither(true);
        this.f52091b.setStyle(style);
        this.f52091b.setColor(-1694498817);
    }

    public int getRadius() {
        return this.f52094e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f52092c <= 0) {
            this.f52096g = 0;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.f52093d;
        int i2 = this.f52092c;
        int i3 = (measuredWidth - (i * (i2 - 1))) / i2;
        for (int i4 = 1; i4 <= this.f52092c; i4++) {
            int i5 = (i4 - 1) * (this.f52093d + i3);
            int i6 = this.f52094e;
            canvas.drawRoundRect(i5, 0.0f, i5 + i3, measuredHeight, i6, i6, this.f52090a);
        }
        int i7 = this.f52096g;
        int i8 = this.f52095f;
        final int i9 = i7 / i8;
        int i10 = (this.f52093d + i3) * i9;
        int i11 = this.f52099j ? ((i8 - (i7 % i8)) * i3) / i8 : ((i7 % i8) * i3) / i8;
        int i12 = this.f52094e;
        canvas.drawRoundRect(i10, 0.0f, i11 + i10, measuredHeight, i12, i12, this.f52091b);
        jyb.m147537z(this.f52098i, new y20() { // from class: l.f6e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97396a.m76737b(i9, (DividedStepProgressBar.InterfaceC13055a) obj);
            }
        });
        if (this.f52097h) {
            this.f52096g = (this.f52096g + 50) % (this.f52095f * this.f52092c);
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
            size = Math.min(size, qa00.m175859d(78.0f));
        }
        if (Integer.MIN_VALUE == mode2) {
            size2 = Math.min(size2, qa00.f156316c);
        }
        setMeasuredDimension(size, size2);
    }

    public void setRadius(int i) {
        this.f52094e = i;
    }

    public DividedStepProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52090a = new Paint();
        this.f52091b = new Paint();
        this.f52092c = 0;
        this.f52093d = qa00.f156317d;
        this.f52094e = qa00.f156314a;
        this.f52095f = 3000;
        this.f52096g = 0;
        this.f52097h = true;
        this.f52098i = new HashSet<>();
        this.f52099j = false;
        m76738c();
    }

    public DividedStepProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52090a = new Paint();
        this.f52091b = new Paint();
        this.f52092c = 0;
        this.f52093d = qa00.f156317d;
        this.f52094e = qa00.f156314a;
        this.f52095f = 3000;
        this.f52096g = 0;
        this.f52097h = true;
        this.f52098i = new HashSet<>();
        this.f52099j = false;
        m76738c();
    }
}
