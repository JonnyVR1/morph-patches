package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

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
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class LivePkTimeView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f52524a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Bitmap> f52525b;

    /* JADX INFO: renamed from: c */
    public Bitmap f52526c;

    /* JADX INFO: renamed from: d */
    public int f52527d;

    /* JADX INFO: renamed from: e */
    public int f52528e;

    /* JADX INFO: renamed from: f */
    public Paint f52529f;

    /* JADX INFO: renamed from: g */
    public int f52530g;

    /* JADX INFO: renamed from: h */
    public int f52531h;

    /* JADX INFO: renamed from: i */
    public int f52532i;

    public LivePkTimeView(Context context) {
        super(context);
        this.f52525b = new ArrayList<>();
        this.f52527d = 0;
        this.f52528e = 0;
        this.f52529f = new Paint();
        this.f52530g = qa00.m175859d(1.0f);
        this.f52531h = qa00.m175859d(2.0f);
        this.f52532i = qa00.m175859d(2.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m77333a(int i) {
        if (this.f52527d == 0 && this.f52528e == 0 && i < 0) {
            return;
        }
        if (i >= 0 && i < 3600) {
            this.f52527d = i / 60;
            this.f52528e = i % 60;
        } else if (i >= 3600) {
            this.f52527d = 59;
            this.f52528e = 59;
        } else {
            this.f52527d = 0;
            this.f52528e = 0;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f52525b.clear();
        this.f52524a = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getVisibility() == 8 || getHeight() == 0) {
            return;
        }
        if (!this.f52524a) {
            this.f52525b.clear();
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146415m5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146427n5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146439o5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146451p5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146463q5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146475r5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146487s5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146499t5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146511u5));
            this.f52525b.add(BitmapFactory.decodeResource(getResources(), obc0.f146523v5));
            this.f52526c = BitmapFactory.decodeResource(getResources(), obc0.f146138O4);
            this.f52524a = true;
        }
        int i = this.f52527d;
        int i2 = i / 10;
        int i3 = i % 10;
        int i4 = this.f52528e;
        int i5 = i4 / 10;
        int i6 = i4 % 10;
        float f = this.f52530g;
        if (i2 == 1) {
            f += this.f52532i;
        }
        if (i3 == 1) {
            f += this.f52532i;
        }
        if (i5 == 1) {
            f += this.f52532i;
        }
        if (i6 == 1) {
            f += this.f52532i;
        }
        if (this.f52525b.isEmpty()) {
            return;
        }
        Bitmap bitmap = this.f52525b.get(i2);
        canvas.drawBitmap(bitmap, f, this.f52531h, this.f52529f);
        Bitmap bitmap2 = this.f52525b.get(i3);
        float width = f + bitmap.getWidth() + this.f52530g;
        canvas.drawBitmap(bitmap2, width, this.f52531h, this.f52529f);
        float width2 = width + bitmap2.getWidth() + this.f52530g;
        canvas.drawBitmap(this.f52526c, width2, this.f52531h, this.f52529f);
        Bitmap bitmap3 = this.f52525b.get(i5);
        float width3 = width2 + this.f52526c.getWidth() + this.f52530g;
        canvas.drawBitmap(bitmap3, width3, this.f52531h, this.f52529f);
        canvas.drawBitmap(this.f52525b.get(i6), width3 + bitmap3.getWidth() + this.f52530g, this.f52531h, this.f52529f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutParams(new ViewGroup.LayoutParams(qa00.m175859d(24.0f), qa00.m175859d(8.0f)));
    }

    public LivePkTimeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52525b = new ArrayList<>();
        this.f52527d = 0;
        this.f52528e = 0;
        this.f52529f = new Paint();
        this.f52530g = qa00.m175859d(1.0f);
        this.f52531h = qa00.m175859d(2.0f);
        this.f52532i = qa00.m175859d(2.0f);
    }

    public LivePkTimeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52525b = new ArrayList<>();
        this.f52527d = 0;
        this.f52528e = 0;
        this.f52529f = new Paint();
        this.f52530g = qa00.m175859d(1.0f);
        this.f52531h = qa00.m175859d(2.0f);
        this.f52532i = qa00.m175859d(2.0f);
    }
}
