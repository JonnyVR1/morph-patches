package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.gac0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicVoteBgView extends View {

    /* JADX INFO: renamed from: i */
    public static int f44027i = qa00.m175859d(35.0f);

    /* JADX INFO: renamed from: a */
    public float f44028a;

    /* JADX INFO: renamed from: b */
    public boolean f44029b;

    /* JADX INFO: renamed from: c */
    public Paint f44030c;

    /* JADX INFO: renamed from: d */
    public int f44031d;

    /* JADX INFO: renamed from: e */
    public int f44032e;

    /* JADX INFO: renamed from: f */
    public RectF f44033f;

    /* JADX INFO: renamed from: g */
    public RectF f44034g;

    /* JADX INFO: renamed from: h */
    public float f44035h;

    public QATopicVoteBgView(@NonNull Context context) {
        super(context);
        this.f44028a = qa00.m175859d(3.0f);
        this.f44029b = false;
        this.f44033f = new RectF();
        this.f44034g = new RectF();
        this.f44035h = getResources().getDimension(gac0.f102974a);
    }

    /* JADX INFO: renamed from: a */
    public final void m67263a() {
        Paint paint = new Paint();
        this.f44030c = paint;
        paint.setAntiAlias(true);
        this.f44030c.setColor(this.f44032e);
        this.f44030c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f44029b) {
            m67263a();
            this.f44033f.set(0.0f, 0.0f, this.f44031d, getHeight());
            RectF rectF = this.f44034g;
            RectF rectF2 = this.f44033f;
            float f = rectF2.left;
            float f2 = this.f44028a;
            rectF.set(f + f2, rectF2.top + f2, rectF2.right - f2, rectF2.bottom - f2);
            canvas.save();
            RectF rectF3 = this.f44034g;
            float f3 = this.f44035h;
            canvas.drawRoundRect(rectF3, f3, f3, this.f44030c);
            canvas.restore();
        }
    }

    public void setColor(int i) {
        this.f44032e = i;
    }

    public void setLikedWidth(int i) {
        this.f44031d = Math.max(i, f44027i);
        this.f44029b = true;
        invalidate();
    }

    public void setRadius(float f) {
        this.f44035h = f;
    }

    public void setWidthOffset(float f) {
        this.f44028a = f;
    }

    public QATopicVoteBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44028a = qa00.m175859d(3.0f);
        this.f44029b = false;
        this.f44033f = new RectF();
        this.f44034g = new RectF();
        this.f44035h = getResources().getDimension(gac0.f102974a);
    }

    public QATopicVoteBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44028a = qa00.m175859d(3.0f);
        this.f44029b = false;
        this.f44033f = new RectF();
        this.f44034g = new RectF();
        this.f44035h = getResources().getDimension(gac0.f102974a);
    }
}
