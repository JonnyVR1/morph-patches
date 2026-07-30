package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import p149l.h1c0;
import p149l.p9c0;
import p149l.t100;
import p149l.w660;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogIndicator extends View {

    /* JADX INFO: renamed from: a */
    public float f50312a;

    /* JADX INFO: renamed from: b */
    public final Paint f50313b;

    /* JADX INFO: renamed from: c */
    public final Paint f50314c;

    /* JADX INFO: renamed from: d */
    public ViewPager f50315d;

    /* JADX INFO: renamed from: e */
    public int f50316e;

    /* JADX INFO: renamed from: f */
    public int f50317f;

    /* JADX INFO: renamed from: g */
    public boolean f50318g;

    /* JADX INFO: renamed from: h */
    public boolean f50319h;

    /* JADX INFO: renamed from: i */
    public float f50320i;

    /* JADX INFO: renamed from: j */
    public float f50321j;

    public GiftDialogIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f50313b = paint;
        Paint paint2 = new Paint(1);
        this.f50314c = paint2;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(h1c0.f105354c);
        int color2 = resources.getColor(h1c0.f105357d);
        float fM186890d = t100.m186890d(3.5f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147731h, i, 0);
        this.f50318g = typedArrayObtainStyledAttributes.getBoolean(p9c0.f147733i, true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(p9c0.f147741m, color));
        paint2.setStyle(style);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(p9c0.f147735j, color2));
        this.f50312a = typedArrayObtainStyledAttributes.getDimension(p9c0.f147737k, fM186890d);
        this.f50319h = typedArrayObtainStyledAttributes.getBoolean(p9c0.f147743n, true);
        this.f50320i = typedArrayObtainStyledAttributes.getDimension(p9c0.f147739l, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m74454a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        w660 adapter;
        int count;
        super.onDraw(canvas);
        ViewPager viewPager = this.f50315d;
        if (viewPager == null || (adapter = viewPager.getAdapter()) == null || (count = adapter.getCount()) == 0) {
            return;
        }
        if (this.f50316e >= count) {
            setCurrentItem(count - 1);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f = this.f50312a;
        float f2 = (f * 2.0f) + this.f50320i;
        float f3 = paddingLeft + f;
        if (this.f50318g) {
            f3 += ((((width - paddingLeft) - paddingRight) - ((count - 1) * f2)) - (f * 2.0f)) / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f4 = (i * f2) + f3;
            if (this.f50313b.getAlpha() > 0) {
                float f5 = this.f50312a;
                float f6 = f5 / 2.0f;
                float f7 = this.f50321j;
                int i2 = t100.f167254c;
                canvas.drawRoundRect(f4 - f6, f7, f4 + f6, f7 + f5, i2, i2, this.f50313b);
            }
        }
        float f8 = f3 + ((this.f50319h ? this.f50317f : this.f50316e) * f2);
        float f9 = this.f50312a;
        float f10 = f9 / 2.0f;
        float f11 = this.f50321j;
        float f12 = f11 + f9;
        int i3 = t100.f167254c;
        canvas.drawRoundRect(f8 - f10, f11, f8 + f10, f12, i3, i3, this.f50314c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f50321j = (getMeasuredHeight() - this.f50312a) / 2.0f;
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f50315d;
        if (viewPager == null) {
            return;
        }
        viewPager.setCurrentItem(i);
        this.f50316e = this.f50315d.getCurrentItem();
        this.f50317f = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f50315d == viewPager || viewPager.getAdapter() == null) {
            return;
        }
        this.f50315d = viewPager;
        invalidate();
    }

    public GiftDialogIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftDialogIndicator(Context context) {
        this(context, null);
    }
}
