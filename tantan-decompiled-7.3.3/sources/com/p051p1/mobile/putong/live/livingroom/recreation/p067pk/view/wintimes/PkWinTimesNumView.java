package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes;

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
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class PkWinTimesNumView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f52641a;

    /* JADX INFO: renamed from: b */
    public float f52642b;

    /* JADX INFO: renamed from: c */
    public Camera f52643c;

    /* JADX INFO: renamed from: d */
    public Matrix f52644d;

    /* JADX INFO: renamed from: e */
    public Paint f52645e;

    /* JADX INFO: renamed from: f */
    public int f52646f;

    /* JADX INFO: renamed from: g */
    public int f52647g;

    /* JADX INFO: renamed from: h */
    public int f52648h;

    /* JADX INFO: renamed from: i */
    public boolean f52649i;

    /* JADX INFO: renamed from: j */
    public ArrayList<Integer> f52650j;

    /* JADX INFO: renamed from: k */
    public Bitmap f52651k;

    /* JADX INFO: renamed from: l */
    public Bitmap f52652l;

    /* JADX INFO: renamed from: m */
    public Bitmap f52653m;

    public PkWinTimesNumView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52641a = true;
        this.f52642b = 0.0f;
        this.f52643c = new Camera();
        this.f52644d = new Matrix();
        this.f52645e = new Paint(1);
        this.f52646f = 0;
        this.f52650j = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m77499a() {
        int i = this.f52646f;
        if (i > 99) {
            this.f52649i = true;
            this.f52647g = 9;
            this.f52648h = 9;
            if (this.f52641a) {
                this.f52651k = BitmapFactory.decodeResource(getResources(), obc0.f146018E4);
            } else {
                this.f52651k = BitmapFactory.decodeResource(getResources(), obc0.f146043G5);
            }
        } else {
            this.f52649i = false;
            this.f52647g = i / 10;
            this.f52648h = i % 10;
        }
        this.f52652l = BitmapFactory.decodeResource(getResources(), this.f52650j.get(this.f52648h).intValue());
        this.f52653m = BitmapFactory.decodeResource(getResources(), this.f52650j.get(this.f52647g).intValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m77500b() {
        boolean z = this.f52641a;
        ArrayList<Integer> arrayList = this.f52650j;
        if (z) {
            arrayList.add(Integer.valueOf(obc0.f146510u4));
            this.f52650j.add(Integer.valueOf(obc0.f146522v4));
            this.f52650j.add(Integer.valueOf(obc0.f146534w4));
            this.f52650j.add(Integer.valueOf(obc0.f146546x4));
            this.f52650j.add(Integer.valueOf(obc0.f146558y4));
            this.f52650j.add(Integer.valueOf(obc0.f146570z4));
            this.f52650j.add(Integer.valueOf(obc0.f145970A4));
            this.f52650j.add(Integer.valueOf(obc0.f145982B4));
            this.f52650j.add(Integer.valueOf(obc0.f145994C4));
            this.f52650j.add(Integer.valueOf(obc0.f146006D4));
            return;
        }
        arrayList.add(Integer.valueOf(obc0.f146535w5));
        this.f52650j.add(Integer.valueOf(obc0.f146547x5));
        this.f52650j.add(Integer.valueOf(obc0.f146559y5));
        this.f52650j.add(Integer.valueOf(obc0.f146571z5));
        this.f52650j.add(Integer.valueOf(obc0.f145971A5));
        this.f52650j.add(Integer.valueOf(obc0.f145983B5));
        this.f52650j.add(Integer.valueOf(obc0.f145995C5));
        this.f52650j.add(Integer.valueOf(obc0.f146007D5));
        this.f52650j.add(Integer.valueOf(obc0.f146019E5));
        this.f52650j.add(Integer.valueOf(obc0.f146031F5));
    }

    /* JADX INFO: renamed from: c */
    public void m77501c(boolean z) {
        this.f52641a = z;
        this.f52650j.clear();
        m77500b();
        this.f52643c.setLocation(0.0f, 0.0f, getResources().getDisplayMetrics().density * (-4.0f));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float width;
        super.draw(canvas);
        if (this.f52650j.isEmpty() || this.f52653m == null || this.f52652l == null) {
            return;
        }
        if (this.f52647g == 0 && this.f52648h == 0) {
            return;
        }
        this.f52644d.reset();
        canvas.save();
        this.f52643c.save();
        this.f52643c.rotateX(this.f52642b);
        this.f52643c.getMatrix(this.f52644d);
        this.f52643c.restore();
        this.f52644d.preTranslate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        this.f52644d.postTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.concat(this.f52644d);
        if (this.f52647g != 0) {
            canvas.drawBitmap(this.f52653m, 0.0f, 0.0f, this.f52645e);
            width = this.f52653m.getWidth() + 0.0f;
        } else {
            width = 0.0f;
        }
        canvas.drawBitmap(this.f52652l, width, 0.0f, this.f52645e);
        float width2 = width + this.f52652l.getWidth();
        if (this.f52649i) {
            canvas.drawBitmap(this.f52651k, width2, 0.0f, this.f52645e);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f52646f == 0) {
            setMeasuredDimension(i, i2);
            return;
        }
        if (this.f52653m == null || this.f52652l == null) {
            setMeasuredDimension(i, i2);
            return;
        }
        int width = this.f52649i ? this.f52651k.getWidth() : 0;
        if (this.f52647g > 0) {
            width += this.f52653m.getWidth();
        }
        setMeasuredDimension(width + this.f52652l.getWidth(), qa00.m175859d(14.0f));
    }

    public void setNumber(long j) {
        this.f52646f = (int) j;
        m77499a();
        requestLayout();
    }

    public PkWinTimesNumView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkWinTimesNumView(Context context) {
        this(context, null);
    }
}
