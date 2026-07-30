package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSquareBottomStickoutView extends View {

    /* JADX INFO: renamed from: a */
    public int f4252a;

    /* JADX INFO: renamed from: b */
    public final int f4253b;

    /* JADX INFO: renamed from: c */
    public final int f4254c;

    /* JADX INFO: renamed from: d */
    public final int f4255d;

    /* JADX INFO: renamed from: e */
    public final int f4256e;

    /* JADX INFO: renamed from: f */
    public int f4257f;

    /* JADX INFO: renamed from: g */
    public Paint f4258g;

    /* JADX INFO: renamed from: h */
    public Path f4259h;

    /* JADX INFO: renamed from: i */
    public CornerPathEffect f4260i;

    /* JADX INFO: renamed from: j */
    public int f4261j;

    /* JADX INFO: renamed from: k */
    public int f4262k;

    public FeedSquareBottomStickoutView(Context context) {
        super(context);
        this.f4253b = 0;
        this.f4254c = 1;
        this.f4255d = 2;
        this.f4256e = 3;
        this.f4257f = 1;
        m6730b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m6729a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i2) : i;
    }

    /* JADX INFO: renamed from: b */
    public void m6730b(Context context, @Nullable AttributeSet attributeSet) {
        this.f4259h = new Path();
        this.f4258g = new Paint();
        this.f4260i = new CornerPathEffect(t100.d(4.0f));
        this.f4258g.setColor(this.f4252a);
        this.f4258g.setPathEffect(this.f4260i);
        this.f4258g.setAntiAlias(true);
        this.f4258g.setStyle(Paint.Style.FILL);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10312b0);
            this.f4252a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10314c0, -16711936);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f4257f;
        if (i == 0) {
            this.f4259h.moveTo(0.0f, this.f4261j);
            this.f4259h.lineTo(this.f4261j, this.f4262k);
            this.f4259h.lineTo(this.f4261j / 2, 0.0f);
        } else if (i == 1) {
            this.f4259h.moveTo(0.0f, 0.0f);
            this.f4259h.lineTo(this.f4261j / 2, this.f4262k);
            this.f4259h.lineTo(this.f4261j, 0.0f);
        } else if (i == 2) {
            this.f4259h.moveTo(0.0f, 0.0f);
            this.f4259h.lineTo(0.0f, this.f4262k);
            this.f4259h.lineTo(this.f4261j, this.f4262k / 2);
        } else if (i == 3) {
            this.f4259h.moveTo(0.0f, this.f4262k / 2);
            this.f4259h.lineTo(this.f4261j, this.f4262k);
            this.f4259h.lineTo(this.f4261j, 0.0f);
        }
        this.f4259h.close();
        canvas.drawPath(this.f4259h, this.f4258g);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4261j = m6729a(100, i);
        int iM6729a = m6729a(100, i2);
        this.f4262k = iM6729a;
        setMeasuredDimension(this.f4261j, iM6729a);
    }

    public void setContentColor(int i) {
        this.f4252a = i;
        Paint paint = this.f4258g;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public FeedSquareBottomStickoutView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4253b = 0;
        this.f4254c = 1;
        this.f4255d = 2;
        this.f4256e = 3;
        this.f4257f = 1;
        m6730b(context, attributeSet);
    }

    public FeedSquareBottomStickoutView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4253b = 0;
        this.f4254c = 1;
        this.f4255d = 2;
        this.f4256e = 3;
        this.f4257f = 1;
        m6730b(context, attributeSet);
    }
}
