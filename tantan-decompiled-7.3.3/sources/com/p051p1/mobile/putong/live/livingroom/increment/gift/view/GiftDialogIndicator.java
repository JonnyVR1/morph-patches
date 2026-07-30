package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import p153l.cf60;
import p153l.n9c0;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogIndicator extends View {

    /* JADX INFO: renamed from: a */
    public float f51160a;

    /* JADX INFO: renamed from: b */
    public final Paint f51161b;

    /* JADX INFO: renamed from: c */
    public final Paint f51162c;

    /* JADX INFO: renamed from: d */
    public ViewPager f51163d;

    /* JADX INFO: renamed from: e */
    public int f51164e;

    /* JADX INFO: renamed from: f */
    public int f51165f;

    /* JADX INFO: renamed from: g */
    public boolean f51166g;

    /* JADX INFO: renamed from: h */
    public boolean f51167h;

    /* JADX INFO: renamed from: i */
    public float f51168i;

    /* JADX INFO: renamed from: j */
    public float f51169j;

    public GiftDialogIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f51161b = paint;
        Paint paint2 = new Paint(1);
        this.f51162c = paint2;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(n9c0.f140815c);
        int color2 = resources.getColor(n9c0.f140818d);
        float fM175859d = qa00.m175859d(3.5f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184130h, i, 0);
        this.f51166g = typedArrayObtainStyledAttributes.getBoolean(vhc0.f184132i, true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(vhc0.f184140m, color));
        paint2.setStyle(style);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(vhc0.f184134j, color2));
        this.f51160a = typedArrayObtainStyledAttributes.getDimension(vhc0.f184136k, fM175859d);
        this.f51167h = typedArrayObtainStyledAttributes.getBoolean(vhc0.f184142n, true);
        this.f51168i = typedArrayObtainStyledAttributes.getDimension(vhc0.f184138l, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m75637a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        cf60 adapter;
        int count;
        super.onDraw(canvas);
        ViewPager viewPager = this.f51163d;
        if (viewPager == null || (adapter = viewPager.getAdapter()) == null || (count = adapter.getCount()) == 0) {
            return;
        }
        if (this.f51164e >= count) {
            setCurrentItem(count - 1);
            return;
        }
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f = this.f51160a;
        float f2 = (f * 2.0f) + this.f51168i;
        float f3 = paddingLeft + f;
        if (this.f51166g) {
            f3 += ((((width - paddingLeft) - paddingRight) - ((count - 1) * f2)) - (f * 2.0f)) / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f4 = (i * f2) + f3;
            if (this.f51161b.getAlpha() > 0) {
                float f5 = this.f51160a;
                float f6 = f5 / 2.0f;
                float f7 = this.f51169j;
                int i2 = qa00.f156316c;
                canvas.drawRoundRect(f4 - f6, f7, f4 + f6, f7 + f5, i2, i2, this.f51161b);
            }
        }
        float f8 = f3 + ((this.f51167h ? this.f51165f : this.f51164e) * f2);
        float f9 = this.f51160a;
        float f10 = f9 / 2.0f;
        float f11 = this.f51169j;
        float f12 = f11 + f9;
        int i3 = qa00.f156316c;
        canvas.drawRoundRect(f8 - f10, f11, f8 + f10, f12, i3, i3, this.f51162c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f51169j = (getMeasuredHeight() - this.f51160a) / 2.0f;
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f51163d;
        if (viewPager == null) {
            return;
        }
        viewPager.setCurrentItem(i);
        this.f51164e = this.f51163d.getCurrentItem();
        this.f51165f = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f51163d == viewPager || viewPager.getAdapter() == null) {
            return;
        }
        this.f51163d = viewPager;
        invalidate();
    }

    public GiftDialogIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftDialogIndicator(Context context) {
        this(context, null);
    }
}
