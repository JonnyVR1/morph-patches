package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSquareBottomStickoutView extends View {

    /* JADX INFO: renamed from: a */
    public int f43639a;

    /* JADX INFO: renamed from: b */
    public final int f43640b;

    /* JADX INFO: renamed from: c */
    public final int f43641c;

    /* JADX INFO: renamed from: d */
    public final int f43642d;

    /* JADX INFO: renamed from: e */
    public final int f43643e;

    /* JADX INFO: renamed from: f */
    public int f43644f;

    /* JADX INFO: renamed from: g */
    public Paint f43645g;

    /* JADX INFO: renamed from: h */
    public Path f43646h;

    /* JADX INFO: renamed from: i */
    public CornerPathEffect f43647i;

    /* JADX INFO: renamed from: j */
    public int f43648j;

    /* JADX INFO: renamed from: k */
    public int f43649k;

    public FeedSquareBottomStickoutView(Context context) {
        super(context);
        this.f43640b = 0;
        this.f43641c = 1;
        this.f43642d = 2;
        this.f43643e = 3;
        this.f43644f = 1;
        m66776b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m66775a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i2) : i;
    }

    /* JADX INFO: renamed from: b */
    public void m66776b(Context context, @Nullable AttributeSet attributeSet) {
        this.f43646h = new Path();
        this.f43645g = new Paint();
        this.f43647i = new CornerPathEffect(qa00.m175859d(4.0f));
        this.f43645g.setColor(this.f43639a);
        this.f43645g.setPathEffect(this.f43647i);
        this.f43645g.setAntiAlias(true);
        this.f43645g.setStyle(Paint.Style.FILL);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168643b0);
            this.f43639a = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168645c0, -16711936);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f43644f;
        if (i == 0) {
            this.f43646h.moveTo(0.0f, this.f43648j);
            this.f43646h.lineTo(this.f43648j, this.f43649k);
            this.f43646h.lineTo(this.f43648j / 2, 0.0f);
        } else if (i == 1) {
            this.f43646h.moveTo(0.0f, 0.0f);
            this.f43646h.lineTo(this.f43648j / 2, this.f43649k);
            this.f43646h.lineTo(this.f43648j, 0.0f);
        } else if (i == 2) {
            this.f43646h.moveTo(0.0f, 0.0f);
            this.f43646h.lineTo(0.0f, this.f43649k);
            this.f43646h.lineTo(this.f43648j, this.f43649k / 2);
        } else if (i == 3) {
            this.f43646h.moveTo(0.0f, this.f43649k / 2);
            this.f43646h.lineTo(this.f43648j, this.f43649k);
            this.f43646h.lineTo(this.f43648j, 0.0f);
        }
        this.f43646h.close();
        canvas.drawPath(this.f43646h, this.f43645g);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f43648j = m66775a(100, i);
        int iM66775a = m66775a(100, i2);
        this.f43649k = iM66775a;
        setMeasuredDimension(this.f43648j, iM66775a);
    }

    public void setContentColor(int i) {
        this.f43639a = i;
        Paint paint = this.f43645g;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public FeedSquareBottomStickoutView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43640b = 0;
        this.f43641c = 1;
        this.f43642d = 2;
        this.f43643e = 3;
        this.f43644f = 1;
        m66776b(context, attributeSet);
    }

    public FeedSquareBottomStickoutView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43640b = 0;
        this.f43641c = 1;
        this.f43642d = 2;
        this.f43643e = 3;
        this.f43644f = 1;
        m66776b(context, attributeSet);
    }
}
