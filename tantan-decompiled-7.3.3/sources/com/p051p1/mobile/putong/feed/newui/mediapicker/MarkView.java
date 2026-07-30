package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.l9k;
import p153l.lbc0;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class MarkView extends View {

    /* JADX INFO: renamed from: a */
    public int f41208a;

    /* JADX INFO: renamed from: b */
    public int f41209b;

    /* JADX INFO: renamed from: c */
    public float f41210c;

    /* JADX INFO: renamed from: d */
    public boolean f41211d;

    /* JADX INFO: renamed from: e */
    public int f41212e;

    /* JADX INFO: renamed from: f */
    public int f41213f;

    public MarkView(Context context) {
        super(context);
        this.f41208a = qa00.m175859d(17.0f);
        this.f41209b = qa00.m175859d(12.0f);
        this.f41211d = false;
        this.f41213f = Color.parseColor("#f55a43");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f41210c = this.f41208a / 2.0f;
        if (!this.f41211d) {
            Paint paint = new Paint();
            float f = this.f41210c - 4.0f;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            paint.setStrokeWidth(4.0f);
            float f2 = this.f41210c;
            canvas.drawCircle(f2, f2, f, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor("#19000000"));
            float f3 = this.f41210c;
            canvas.drawCircle(f3, f3, f, paint);
            return;
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        setLayerType(1, paint2);
        paint2.setColor(this.f41213f);
        float f4 = this.f41210c;
        canvas.drawCircle(f4, f4, f4, paint2);
        paint2.setColor(-1);
        if (this.f41212e != 0) {
            paint2.setTextSize(this.f41209b);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTypeface(lyh0.m156283c(3));
            canvas.drawText(String.valueOf(this.f41212e), canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((paint2.descent() + paint2.ascent()) / 2.0f)), paint2);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) getContext().getResources().getDrawable(lbc0.f131038g)).getBitmap();
        float fM175859d = qa00.m175859d(10.0f);
        float fM175859d2 = qa00.m175859d(8.0f);
        float f5 = this.f41210c;
        float f6 = f5 - (fM175859d / 2.0f);
        float f7 = f5 - (fM175859d2 / 2.0f);
        if (f6 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        canvas.drawBitmap(l9k.m153435a(bitmap, fM175859d, fM175859d2), f6, f7, paint2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f41208a;
        setMeasuredDimension(i3, i3);
    }

    public void setChecked(boolean z) {
        this.f41211d = z;
        invalidate();
    }

    public void setCheckedBgColor(int i) {
        this.f41213f = i;
        invalidate();
    }

    public void setSelectPosition(int i) {
        this.f41212e = i;
        invalidate();
    }

    public MarkView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41208a = qa00.m175859d(17.0f);
        this.f41209b = qa00.m175859d(12.0f);
        this.f41211d = false;
        this.f41213f = Color.parseColor("#f55a43");
    }

    public MarkView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41208a = qa00.m175859d(17.0f);
        this.f41209b = qa00.m175859d(12.0f);
        this.f41211d = false;
        this.f41213f = Color.parseColor("#f55a43");
    }
}
