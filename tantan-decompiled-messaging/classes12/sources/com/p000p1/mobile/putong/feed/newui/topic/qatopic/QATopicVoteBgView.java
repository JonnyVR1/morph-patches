package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import p007l.z1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicVoteBgView extends View {

    /* JADX INFO: renamed from: i */
    public static int f4640i = t100.d(35.0f);

    /* JADX INFO: renamed from: a */
    public float f4641a;

    /* JADX INFO: renamed from: b */
    public boolean f4642b;

    /* JADX INFO: renamed from: c */
    public Paint f4643c;

    /* JADX INFO: renamed from: d */
    public int f4644d;

    /* JADX INFO: renamed from: e */
    public int f4645e;

    /* JADX INFO: renamed from: f */
    public RectF f4646f;

    /* JADX INFO: renamed from: g */
    public RectF f4647g;

    /* JADX INFO: renamed from: h */
    public float f4648h;

    public QATopicVoteBgView(@NonNull Context context) {
        super(context);
        this.f4641a = t100.d(3.0f);
        this.f4642b = false;
        this.f4646f = new RectF();
        this.f4647g = new RectF();
        this.f4648h = getResources().getDimension(z1c0.f15553a);
    }

    /* JADX INFO: renamed from: a */
    public final void m7232a() {
        Paint paint = new Paint();
        this.f4643c = paint;
        paint.setAntiAlias(true);
        this.f4643c.setColor(this.f4645e);
        this.f4643c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4642b) {
            m7232a();
            this.f4646f.set(0.0f, 0.0f, this.f4644d, getHeight());
            RectF rectF = this.f4647g;
            RectF rectF2 = this.f4646f;
            float f = rectF2.left;
            float f2 = this.f4641a;
            rectF.set(f + f2, rectF2.top + f2, rectF2.right - f2, rectF2.bottom - f2);
            canvas.save();
            RectF rectF3 = this.f4647g;
            float f3 = this.f4648h;
            canvas.drawRoundRect(rectF3, f3, f3, this.f4643c);
            canvas.restore();
        }
    }

    public void setColor(int i) {
        this.f4645e = i;
    }

    public void setLikedWidth(int i) {
        this.f4644d = Math.max(i, f4640i);
        this.f4642b = true;
        invalidate();
    }

    public void setRadius(float f) {
        this.f4648h = f;
    }

    public void setWidthOffset(float f) {
        this.f4641a = f;
    }

    public QATopicVoteBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4641a = t100.d(3.0f);
        this.f4642b = false;
        this.f4646f = new RectF();
        this.f4647g = new RectF();
        this.f4648h = getResources().getDimension(z1c0.f15553a);
    }

    public QATopicVoteBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4641a = t100.d(3.0f);
        this.f4642b = false;
        this.f4646f = new RectF();
        this.f4647g = new RectF();
        this.f4648h = getResources().getDimension(z1c0.f15553a);
    }
}
