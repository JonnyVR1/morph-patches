package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.eqh0;
import p149l.f3c0;
import p149l.t100;
import p149l.t6k;

/* JADX INFO: loaded from: classes12.dex */
public class MarkView extends View {

    /* JADX INFO: renamed from: a */
    public int f40360a;

    /* JADX INFO: renamed from: b */
    public int f40361b;

    /* JADX INFO: renamed from: c */
    public float f40362c;

    /* JADX INFO: renamed from: d */
    public boolean f40363d;

    /* JADX INFO: renamed from: e */
    public int f40364e;

    /* JADX INFO: renamed from: f */
    public int f40365f;

    public MarkView(Context context) {
        super(context);
        this.f40360a = t100.m186890d(17.0f);
        this.f40361b = t100.m186890d(12.0f);
        this.f40363d = false;
        this.f40365f = Color.parseColor("#f55a43");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f40362c = this.f40360a / 2.0f;
        if (!this.f40363d) {
            Paint paint = new Paint();
            float f = this.f40362c - 4.0f;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            paint.setStrokeWidth(4.0f);
            float f2 = this.f40362c;
            canvas.drawCircle(f2, f2, f, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.parseColor("#19000000"));
            float f3 = this.f40362c;
            canvas.drawCircle(f3, f3, f, paint);
            return;
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        setLayerType(1, paint2);
        paint2.setColor(this.f40365f);
        float f4 = this.f40362c;
        canvas.drawCircle(f4, f4, f4, paint2);
        paint2.setColor(-1);
        if (this.f40364e != 0) {
            paint2.setTextSize(this.f40361b);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTypeface(eqh0.m117752c(3));
            canvas.drawText(String.valueOf(this.f40364e), canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((paint2.descent() + paint2.ascent()) / 2.0f)), paint2);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) getContext().getResources().getDrawable(f3c0.f94520g)).getBitmap();
        float fM186890d = t100.m186890d(10.0f);
        float fM186890d2 = t100.m186890d(8.0f);
        float f5 = this.f40362c;
        float f6 = f5 - (fM186890d / 2.0f);
        float f7 = f5 - (fM186890d2 / 2.0f);
        if (f6 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        canvas.drawBitmap(t6k.m187383a(bitmap, fM186890d, fM186890d2), f6, f7, paint2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f40360a;
        setMeasuredDimension(i3, i3);
    }

    public void setChecked(boolean z) {
        this.f40363d = z;
        invalidate();
    }

    public void setCheckedBgColor(int i) {
        this.f40365f = i;
        invalidate();
    }

    public void setSelectPosition(int i) {
        this.f40364e = i;
        invalidate();
    }

    public MarkView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40360a = t100.m186890d(17.0f);
        this.f40361b = t100.m186890d(12.0f);
        this.f40363d = false;
        this.f40365f = Color.parseColor("#f55a43");
    }

    public MarkView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40360a = t100.m186890d(17.0f);
        this.f40361b = t100.m186890d(12.0f);
        this.f40363d = false;
        this.f40365f = Color.parseColor("#f55a43");
    }
}
