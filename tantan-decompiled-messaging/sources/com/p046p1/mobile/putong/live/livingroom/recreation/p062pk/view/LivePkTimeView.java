package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkTimeView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f51676a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Bitmap> f51677b;

    /* JADX INFO: renamed from: c */
    public Bitmap f51678c;

    /* JADX INFO: renamed from: d */
    public int f51679d;

    /* JADX INFO: renamed from: e */
    public int f51680e;

    /* JADX INFO: renamed from: f */
    public Paint f51681f;

    /* JADX INFO: renamed from: g */
    public int f51682g;

    /* JADX INFO: renamed from: h */
    public int f51683h;

    /* JADX INFO: renamed from: i */
    public int f51684i;

    public LivePkTimeView(Context context) {
        super(context);
        this.f51677b = new ArrayList<>();
        this.f51679d = 0;
        this.f51680e = 0;
        this.f51681f = new Paint();
        this.f51682g = t100.m186890d(1.0f);
        this.f51683h = t100.m186890d(2.0f);
        this.f51684i = t100.m186890d(2.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m76150a(int i) {
        if (this.f51679d == 0 && this.f51680e == 0 && i < 0) {
            return;
        }
        if (i >= 0 && i < 3600) {
            this.f51679d = i / 60;
            this.f51680e = i % 60;
        } else if (i >= 3600) {
            this.f51679d = 59;
            this.f51680e = 59;
        } else {
            this.f51679d = 0;
            this.f51680e = 0;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f51677b.clear();
        this.f51676a = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getVisibility() == 8 || getHeight() == 0) {
            return;
        }
        if (!this.f51676a) {
            this.f51677b.clear();
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111087m5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111099n5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111111o5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111123p5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111135q5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111147r5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111159s5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111171t5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111183u5));
            this.f51677b.add(BitmapFactory.decodeResource(getResources(), i3c0.f111195v5));
            this.f51678c = BitmapFactory.decodeResource(getResources(), i3c0.f110810O4);
            this.f51676a = true;
        }
        int i = this.f51679d;
        int i2 = i / 10;
        int i3 = i % 10;
        int i4 = this.f51680e;
        int i5 = i4 / 10;
        int i6 = i4 % 10;
        float f = this.f51682g;
        if (i2 == 1) {
            f += this.f51684i;
        }
        if (i3 == 1) {
            f += this.f51684i;
        }
        if (i5 == 1) {
            f += this.f51684i;
        }
        if (i6 == 1) {
            f += this.f51684i;
        }
        if (this.f51677b.isEmpty()) {
            return;
        }
        Bitmap bitmap = this.f51677b.get(i2);
        canvas.drawBitmap(bitmap, f, this.f51683h, this.f51681f);
        Bitmap bitmap2 = this.f51677b.get(i3);
        float width = f + bitmap.getWidth() + this.f51682g;
        canvas.drawBitmap(bitmap2, width, this.f51683h, this.f51681f);
        float width2 = width + bitmap2.getWidth() + this.f51682g;
        canvas.drawBitmap(this.f51678c, width2, this.f51683h, this.f51681f);
        Bitmap bitmap3 = this.f51677b.get(i5);
        float width3 = width2 + this.f51678c.getWidth() + this.f51682g;
        canvas.drawBitmap(bitmap3, width3, this.f51683h, this.f51681f);
        canvas.drawBitmap(this.f51677b.get(i6), width3 + bitmap3.getWidth() + this.f51682g, this.f51683h, this.f51681f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutParams(new ViewGroup.LayoutParams(t100.m186890d(24.0f), t100.m186890d(8.0f)));
    }

    public LivePkTimeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51677b = new ArrayList<>();
        this.f51679d = 0;
        this.f51680e = 0;
        this.f51681f = new Paint();
        this.f51682g = t100.m186890d(1.0f);
        this.f51683h = t100.m186890d(2.0f);
        this.f51684i = t100.m186890d(2.0f);
    }

    public LivePkTimeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51677b = new ArrayList<>();
        this.f51679d = 0;
        this.f51680e = 0;
        this.f51681f = new Paint();
        this.f51682g = t100.m186890d(1.0f);
        this.f51683h = t100.m186890d(2.0f);
        this.f51684i = t100.m186890d(2.0f);
    }
}
