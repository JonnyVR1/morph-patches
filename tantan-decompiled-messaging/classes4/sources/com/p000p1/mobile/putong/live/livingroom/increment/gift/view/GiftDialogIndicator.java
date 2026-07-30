package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import l.t100;
import l.w660;
import p002l.h1c0;
import p002l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftDialogIndicator extends View {

    /* JADX INFO: renamed from: a */
    public float f6354a;

    /* JADX INFO: renamed from: b */
    public final Paint f6355b;

    /* JADX INFO: renamed from: c */
    public final Paint f6356c;

    /* JADX INFO: renamed from: d */
    public ViewPager f6357d;

    /* JADX INFO: renamed from: e */
    public int f6358e;

    /* JADX INFO: renamed from: f */
    public int f6359f;

    /* JADX INFO: renamed from: g */
    public boolean f6360g;

    /* JADX INFO: renamed from: h */
    public boolean f6361h;

    /* JADX INFO: renamed from: i */
    public float f6362i;

    /* JADX INFO: renamed from: j */
    public float f6363j;

    public GiftDialogIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f6355b = paint;
        Paint paint2 = new Paint(1);
        this.f6356c = paint2;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(h1c0.f11774c);
        int color2 = resources.getColor(h1c0.f11777d);
        float fD = t100.d(3.5f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17128h, i, 0);
        this.f6360g = typedArrayObtainStyledAttributes.getBoolean(p9c0.f17130i, true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(p9c0.f17138m, color));
        paint2.setStyle(style);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(p9c0.f17132j, color2));
        this.f6354a = typedArrayObtainStyledAttributes.getDimension(p9c0.f17134k, fD);
        this.f6361h = typedArrayObtainStyledAttributes.getBoolean(p9c0.f17140n, true);
        this.f6362i = typedArrayObtainStyledAttributes.getDimension(p9c0.f17136l, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m8038a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        w660 adapter;
        int count;
        super.onDraw(canvas);
        ViewPager viewPager = this.f6357d;
        if (viewPager == null || (adapter = viewPager.getAdapter()) == null || (count = adapter.getCount()) == 0) {
            return;
        }
        if (this.f6358e >= count) {
            setCurrentItem(count - 1);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f = this.f6354a;
        float f2 = (f * 2.0f) + this.f6362i;
        float f3 = paddingLeft + f;
        if (this.f6360g) {
            f3 += ((((width - paddingLeft) - paddingRight) - ((count - 1) * f2)) - (f * 2.0f)) / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f4 = (i * f2) + f3;
            if (this.f6355b.getAlpha() > 0) {
                float f5 = this.f6354a;
                float f6 = f5 / 2.0f;
                float f7 = this.f6363j;
                int i2 = t100.c;
                canvas.drawRoundRect(f4 - f6, f7, f4 + f6, f7 + f5, i2, i2, this.f6355b);
            }
        }
        float f8 = f3 + ((this.f6361h ? this.f6359f : this.f6358e) * f2);
        float f9 = this.f6354a;
        float f10 = f9 / 2.0f;
        float f11 = this.f6363j;
        float f12 = f11 + f9;
        int i3 = t100.c;
        canvas.drawRoundRect(f8 - f10, f11, f8 + f10, f12, i3, i3, this.f6356c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6363j = (getMeasuredHeight() - this.f6354a) / 2.0f;
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f6357d;
        if (viewPager == null) {
            return;
        }
        viewPager.setCurrentItem(i);
        this.f6358e = this.f6357d.getCurrentItem();
        this.f6359f = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f6357d == viewPager || viewPager.getAdapter() == null) {
            return;
        }
        this.f6357d = viewPager;
        invalidate();
    }

    public GiftDialogIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftDialogIndicator(Context context) {
        this(context, null);
    }
}
