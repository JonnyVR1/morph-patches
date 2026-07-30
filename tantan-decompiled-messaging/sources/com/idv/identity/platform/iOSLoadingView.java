package com.idv.identity.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class iOSLoadingView extends View {

    /* JADX INFO: renamed from: a */
    private int f12729a;

    /* JADX INFO: renamed from: b */
    private int f12730b;

    /* JADX INFO: renamed from: c */
    private int f12731c;

    /* JADX INFO: renamed from: d */
    private int f12732d;

    /* JADX INFO: renamed from: e */
    private Paint f12733e;

    /* JADX INFO: renamed from: f */
    private int f12734f;

    /* JADX INFO: renamed from: g */
    private Rect f12735g;

    /* JADX INFO: renamed from: h */
    private String[] f12736h;

    public iOSLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12734f = 0;
        this.f12736h = new String[]{"#bbbbbb", "#aaaaaa", "#999999", "#888888", "#777777", "#666666"};
        m18124a();
    }

    /* JADX INFO: renamed from: a */
    private void m18124a() {
        this.f12733e = new Paint(1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f12735g == null) {
            int i2 = this.f12729a;
            int i3 = this.f12731c;
            this.f12735g = new Rect((i2 - i3) / 2, 0, (i2 + i3) / 2, this.f12732d);
        }
        int i4 = 0;
        while (true) {
            i = this.f12734f;
            if (i4 >= 12) {
                break;
            }
            if (i4 - i >= 5) {
                this.f12733e.setColor(Color.parseColor(this.f12736h[5]));
            } else if (i4 - i >= 0 && i4 - i < 5) {
                this.f12733e.setColor(Color.parseColor(this.f12736h[i4 - i]));
            } else if (i4 - i >= -7 && i4 - i < 0) {
                this.f12733e.setColor(Color.parseColor(this.f12736h[5]));
            } else if (i4 - i >= -11 && i4 - i < -7) {
                this.f12733e.setColor(Color.parseColor(this.f12736h[(i4 + 12) - i]));
            }
            canvas.drawRect(this.f12735g, this.f12733e);
            int i5 = this.f12729a;
            canvas.rotate(30.0f, i5 / 2, i5 / 2);
            i4++;
        }
        int i6 = i + 1;
        this.f12734f = i6;
        if (i6 > 11) {
            this.f12734f = 0;
        }
        postInvalidateDelayed(100L);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
            this.f12729a = 200;
        } else {
            this.f12729a = View.MeasureSpec.getSize(i);
            int size = View.MeasureSpec.getSize(i2);
            this.f12730b = size;
            this.f12729a = Math.min(this.f12729a, size);
        }
        int i3 = this.f12729a;
        int i4 = i3 / 12;
        this.f12731c = i4;
        this.f12732d = i4 * 4;
        setMeasuredDimension(i3, i3);
    }

    public iOSLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public iOSLoadingView(Context context) {
        this(context, null);
    }
}
