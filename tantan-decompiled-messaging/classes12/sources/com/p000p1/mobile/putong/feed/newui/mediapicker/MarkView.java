package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.eqh0;
import l.t100;
import l.t6k;
import p007l.f3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MarkView extends View {

    /* JADX INFO: renamed from: a */
    public int f1821a;

    /* JADX INFO: renamed from: b */
    public int f1822b;

    /* JADX INFO: renamed from: c */
    public float f1823c;

    /* JADX INFO: renamed from: d */
    public boolean f1824d;

    /* JADX INFO: renamed from: e */
    public int f1825e;

    /* JADX INFO: renamed from: f */
    public int f1826f;

    public MarkView(Context context) {
        super(context);
        this.f1821a = t100.d(17.0f);
        this.f1822b = t100.d(12.0f);
        this.f1824d = false;
        this.f1826f = Color.parseColor("#f55a43");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1823c = this.f1821a / 2.0f;
        if (!this.f1824d) {
            Paint paint = new Paint();
            float f = this.f1823c - 4.0f;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            paint.setStrokeWidth(4.0f);
            float f2 = this.f1823c;
            canvas.drawCircle(f2, f2, f, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor("#19000000"));
            float f3 = this.f1823c;
            canvas.drawCircle(f3, f3, f, paint);
            return;
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        setLayerType(1, paint2);
        paint2.setColor(this.f1826f);
        float f4 = this.f1823c;
        canvas.drawCircle(f4, f4, f4, paint2);
        paint2.setColor(-1);
        if (this.f1825e != 0) {
            paint2.setTextSize(this.f1822b);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTypeface(eqh0.c(3));
            canvas.drawText(String.valueOf(this.f1825e), canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((paint2.descent() + paint2.ascent()) / 2.0f)), paint2);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) getContext().getResources().getDrawable(f3c0.f7803g)).getBitmap();
        float fD = t100.d(10.0f);
        float fD2 = t100.d(8.0f);
        float f5 = this.f1823c;
        float f6 = f5 - (fD / 2.0f);
        float f7 = f5 - (fD2 / 2.0f);
        if (f6 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        canvas.drawBitmap(t6k.a(bitmap, fD, fD2), f6, f7, paint2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f1821a;
        setMeasuredDimension(i3, i3);
    }

    public void setChecked(boolean z) {
        this.f1824d = z;
        invalidate();
    }

    public void setCheckedBgColor(int i) {
        this.f1826f = i;
        invalidate();
    }

    public void setSelectPosition(int i) {
        this.f1825e = i;
        invalidate();
    }

    public MarkView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1821a = t100.d(17.0f);
        this.f1822b = t100.d(12.0f);
        this.f1824d = false;
        this.f1826f = Color.parseColor("#f55a43");
    }

    public MarkView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1821a = t100.d(17.0f);
        this.f1822b = t100.d(12.0f);
        this.f1824d = false;
        this.f1826f = Color.parseColor("#f55a43");
    }
}
