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
    private int f13470a;

    /* JADX INFO: renamed from: b */
    private int f13471b;

    /* JADX INFO: renamed from: c */
    private int f13472c;

    /* JADX INFO: renamed from: d */
    private int f13473d;

    /* JADX INFO: renamed from: e */
    private Paint f13474e;

    /* JADX INFO: renamed from: f */
    private int f13475f;

    /* JADX INFO: renamed from: g */
    private Rect f13476g;

    /* JADX INFO: renamed from: h */
    private String[] f13477h;

    public iOSLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13475f = 0;
        this.f13477h = new String[]{"#bbbbbb", "#aaaaaa", "#999999", "#888888", "#777777", "#666666"};
        m19201a();
    }

    /* JADX INFO: renamed from: a */
    private void m19201a() {
        this.f13474e = new Paint(1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f13476g == null) {
            int i2 = this.f13470a;
            int i3 = this.f13472c;
            this.f13476g = new Rect((i2 - i3) / 2, 0, (i2 + i3) / 2, this.f13473d);
        }
        int i4 = 0;
        while (true) {
            i = this.f13475f;
            if (i4 >= 12) {
                break;
            }
            if (i4 - i >= 5) {
                this.f13474e.setColor(Color.parseColor(this.f13477h[5]));
            } else if (i4 - i >= 0 && i4 - i < 5) {
                this.f13474e.setColor(Color.parseColor(this.f13477h[i4 - i]));
            } else if (i4 - i >= -7 && i4 - i < 0) {
                this.f13474e.setColor(Color.parseColor(this.f13477h[5]));
            } else if (i4 - i >= -11 && i4 - i < -7) {
                this.f13474e.setColor(Color.parseColor(this.f13477h[(i4 + 12) - i]));
            }
            canvas.drawRect(this.f13476g, this.f13474e);
            int i5 = this.f13470a;
            canvas.rotate(30.0f, i5 / 2, i5 / 2);
            i4++;
        }
        int i6 = i + 1;
        this.f13475f = i6;
        if (i6 > 11) {
            this.f13475f = 0;
        }
        postInvalidateDelayed(100L);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
            this.f13470a = 200;
        } else {
            this.f13470a = View.MeasureSpec.getSize(i);
            int size = View.MeasureSpec.getSize(i2);
            this.f13471b = size;
            this.f13470a = Math.min(this.f13470a, size);
        }
        int i3 = this.f13470a;
        int i4 = i3 / 12;
        this.f13472c = i4;
        this.f13473d = i4 * 4;
        setMeasuredDimension(i3, i3);
    }

    public iOSLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public iOSLoadingView(Context context) {
        this(context, null);
    }
}
