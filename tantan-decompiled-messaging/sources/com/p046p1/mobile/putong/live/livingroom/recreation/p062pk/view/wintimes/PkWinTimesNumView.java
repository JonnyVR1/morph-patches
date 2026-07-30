package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesNumView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f51793a;

    /* JADX INFO: renamed from: b */
    public float f51794b;

    /* JADX INFO: renamed from: c */
    public Camera f51795c;

    /* JADX INFO: renamed from: d */
    public Matrix f51796d;

    /* JADX INFO: renamed from: e */
    public Paint f51797e;

    /* JADX INFO: renamed from: f */
    public int f51798f;

    /* JADX INFO: renamed from: g */
    public int f51799g;

    /* JADX INFO: renamed from: h */
    public int f51800h;

    /* JADX INFO: renamed from: i */
    public boolean f51801i;

    /* JADX INFO: renamed from: j */
    public ArrayList<Integer> f51802j;

    /* JADX INFO: renamed from: k */
    public Bitmap f51803k;

    /* JADX INFO: renamed from: l */
    public Bitmap f51804l;

    /* JADX INFO: renamed from: m */
    public Bitmap f51805m;

    public PkWinTimesNumView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51793a = true;
        this.f51794b = 0.0f;
        this.f51795c = new Camera();
        this.f51796d = new Matrix();
        this.f51797e = new Paint(1);
        this.f51798f = 0;
        this.f51802j = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m76316a() {
        int i = this.f51798f;
        if (i > 99) {
            this.f51801i = true;
            this.f51799g = 9;
            this.f51800h = 9;
            if (this.f51793a) {
                this.f51803k = BitmapFactory.decodeResource(getResources(), i3c0.f110690E4);
            } else {
                this.f51803k = BitmapFactory.decodeResource(getResources(), i3c0.f110715G5);
            }
        } else {
            this.f51801i = false;
            this.f51799g = i / 10;
            this.f51800h = i % 10;
        }
        this.f51804l = BitmapFactory.decodeResource(getResources(), this.f51802j.get(this.f51800h).intValue());
        this.f51805m = BitmapFactory.decodeResource(getResources(), this.f51802j.get(this.f51799g).intValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m76317b() {
        boolean z = this.f51793a;
        ArrayList<Integer> arrayList = this.f51802j;
        if (z) {
            arrayList.add(Integer.valueOf(i3c0.f111182u4));
            this.f51802j.add(Integer.valueOf(i3c0.f111194v4));
            this.f51802j.add(Integer.valueOf(i3c0.f111206w4));
            this.f51802j.add(Integer.valueOf(i3c0.f111218x4));
            this.f51802j.add(Integer.valueOf(i3c0.f111230y4));
            this.f51802j.add(Integer.valueOf(i3c0.f111242z4));
            this.f51802j.add(Integer.valueOf(i3c0.f110642A4));
            this.f51802j.add(Integer.valueOf(i3c0.f110654B4));
            this.f51802j.add(Integer.valueOf(i3c0.f110666C4));
            this.f51802j.add(Integer.valueOf(i3c0.f110678D4));
            return;
        }
        arrayList.add(Integer.valueOf(i3c0.f111207w5));
        this.f51802j.add(Integer.valueOf(i3c0.f111219x5));
        this.f51802j.add(Integer.valueOf(i3c0.f111231y5));
        this.f51802j.add(Integer.valueOf(i3c0.f111243z5));
        this.f51802j.add(Integer.valueOf(i3c0.f110643A5));
        this.f51802j.add(Integer.valueOf(i3c0.f110655B5));
        this.f51802j.add(Integer.valueOf(i3c0.f110667C5));
        this.f51802j.add(Integer.valueOf(i3c0.f110679D5));
        this.f51802j.add(Integer.valueOf(i3c0.f110691E5));
        this.f51802j.add(Integer.valueOf(i3c0.f110703F5));
    }

    /* JADX INFO: renamed from: c */
    public void m76318c(boolean z) {
        this.f51793a = z;
        this.f51802j.clear();
        m76317b();
        this.f51795c.setLocation(0.0f, 0.0f, getResources().getDisplayMetrics().density * (-4.0f));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float width;
        super.draw(canvas);
        if (this.f51802j.isEmpty() || this.f51805m == null || this.f51804l == null) {
            return;
        }
        if (this.f51799g == 0 && this.f51800h == 0) {
            return;
        }
        this.f51796d.reset();
        canvas.save();
        this.f51795c.save();
        this.f51795c.rotateX(this.f51794b);
        this.f51795c.getMatrix(this.f51796d);
        this.f51795c.restore();
        this.f51796d.preTranslate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        this.f51796d.postTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.concat(this.f51796d);
        if (this.f51799g != 0) {
            canvas.drawBitmap(this.f51805m, 0.0f, 0.0f, this.f51797e);
            width = this.f51805m.getWidth() + 0.0f;
        } else {
            width = 0.0f;
        }
        canvas.drawBitmap(this.f51804l, width, 0.0f, this.f51797e);
        float width2 = width + this.f51804l.getWidth();
        if (this.f51801i) {
            canvas.drawBitmap(this.f51803k, width2, 0.0f, this.f51797e);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f51798f == 0) {
            setMeasuredDimension(i, i2);
            return;
        }
        if (this.f51805m == null || this.f51804l == null) {
            setMeasuredDimension(i, i2);
            return;
        }
        int width = this.f51801i ? this.f51803k.getWidth() : 0;
        if (this.f51799g > 0) {
            width += this.f51805m.getWidth();
        }
        setMeasuredDimension(width + this.f51804l.getWidth(), t100.m186890d(14.0f));
    }

    public void setNumber(long j) {
        this.f51798f = (int) j;
        m76316a();
        requestLayout();
    }

    public PkWinTimesNumView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesNumView(Context context) {
        this(context, null);
    }
}
