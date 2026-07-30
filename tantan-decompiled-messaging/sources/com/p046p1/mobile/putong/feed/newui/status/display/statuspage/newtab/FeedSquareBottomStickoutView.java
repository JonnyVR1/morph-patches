package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.m9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSquareBottomStickoutView extends View {

    /* JADX INFO: renamed from: a */
    public int f42791a;

    /* JADX INFO: renamed from: b */
    public final int f42792b;

    /* JADX INFO: renamed from: c */
    public final int f42793c;

    /* JADX INFO: renamed from: d */
    public final int f42794d;

    /* JADX INFO: renamed from: e */
    public final int f42795e;

    /* JADX INFO: renamed from: f */
    public int f42796f;

    /* JADX INFO: renamed from: g */
    public Paint f42797g;

    /* JADX INFO: renamed from: h */
    public Path f42798h;

    /* JADX INFO: renamed from: i */
    public CornerPathEffect f42799i;

    /* JADX INFO: renamed from: j */
    public int f42800j;

    /* JADX INFO: renamed from: k */
    public int f42801k;

    public FeedSquareBottomStickoutView(Context context) {
        super(context);
        this.f42792b = 0;
        this.f42793c = 1;
        this.f42794d = 2;
        this.f42795e = 3;
        this.f42796f = 1;
        m65593b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m65592a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i2) : i;
    }

    /* JADX INFO: renamed from: b */
    public void m65593b(Context context, @Nullable AttributeSet attributeSet) {
        this.f42798h = new Path();
        this.f42797g = new Paint();
        this.f42799i = new CornerPathEffect(t100.m186890d(4.0f));
        this.f42797g.setColor(this.f42791a);
        this.f42797g.setPathEffect(this.f42799i);
        this.f42797g.setAntiAlias(true);
        this.f42797g.setStyle(Paint.Style.FILL);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132721b0);
            this.f42791a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f132723c0, -16711936);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f42796f;
        if (i == 0) {
            this.f42798h.moveTo(0.0f, this.f42800j);
            this.f42798h.lineTo(this.f42800j, this.f42801k);
            this.f42798h.lineTo(this.f42800j / 2, 0.0f);
        } else if (i == 1) {
            this.f42798h.moveTo(0.0f, 0.0f);
            this.f42798h.lineTo(this.f42800j / 2, this.f42801k);
            this.f42798h.lineTo(this.f42800j, 0.0f);
        } else if (i == 2) {
            this.f42798h.moveTo(0.0f, 0.0f);
            this.f42798h.lineTo(0.0f, this.f42801k);
            this.f42798h.lineTo(this.f42800j, this.f42801k / 2);
        } else if (i == 3) {
            this.f42798h.moveTo(0.0f, this.f42801k / 2);
            this.f42798h.lineTo(this.f42800j, this.f42801k);
            this.f42798h.lineTo(this.f42800j, 0.0f);
        }
        this.f42798h.close();
        canvas.drawPath(this.f42798h, this.f42797g);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f42800j = m65592a(100, i);
        int iM65592a = m65592a(100, i2);
        this.f42801k = iM65592a;
        setMeasuredDimension(this.f42800j, iM65592a);
    }

    public void setContentColor(int i) {
        this.f42791a = i;
        Paint paint = this.f42797g;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public FeedSquareBottomStickoutView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42792b = 0;
        this.f42793c = 1;
        this.f42794d = 2;
        this.f42795e = 3;
        this.f42796f = 1;
        m65593b(context, attributeSet);
    }

    public FeedSquareBottomStickoutView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42792b = 0;
        this.f42793c = 1;
        this.f42794d = 2;
        this.f42795e = 3;
        this.f42796f = 1;
        m65593b(context, attributeSet);
    }
}
