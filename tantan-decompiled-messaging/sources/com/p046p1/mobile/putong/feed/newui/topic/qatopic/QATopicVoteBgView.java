package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.z1c0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicVoteBgView extends View {

    /* JADX INFO: renamed from: i */
    public static int f43179i = t100.m186890d(35.0f);

    /* JADX INFO: renamed from: a */
    public float f43180a;

    /* JADX INFO: renamed from: b */
    public boolean f43181b;

    /* JADX INFO: renamed from: c */
    public Paint f43182c;

    /* JADX INFO: renamed from: d */
    public int f43183d;

    /* JADX INFO: renamed from: e */
    public int f43184e;

    /* JADX INFO: renamed from: f */
    public RectF f43185f;

    /* JADX INFO: renamed from: g */
    public RectF f43186g;

    /* JADX INFO: renamed from: h */
    public float f43187h;

    public QATopicVoteBgView(@NonNull Context context) {
        super(context);
        this.f43180a = t100.m186890d(3.0f);
        this.f43181b = false;
        this.f43185f = new RectF();
        this.f43186g = new RectF();
        this.f43187h = getResources().getDimension(z1c0.f201064a);
    }

    /* JADX INFO: renamed from: a */
    public final void m66080a() {
        Paint paint = new Paint();
        this.f43182c = paint;
        paint.setAntiAlias(true);
        this.f43182c.setColor(this.f43184e);
        this.f43182c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43181b) {
            m66080a();
            this.f43185f.set(0.0f, 0.0f, this.f43183d, getHeight());
            RectF rectF = this.f43186g;
            RectF rectF2 = this.f43185f;
            float f = rectF2.left;
            float f2 = this.f43180a;
            rectF.set(f + f2, rectF2.top + f2, rectF2.right - f2, rectF2.bottom - f2);
            canvas.save();
            RectF rectF3 = this.f43186g;
            float f3 = this.f43187h;
            canvas.drawRoundRect(rectF3, f3, f3, this.f43182c);
            canvas.restore();
        }
    }

    public void setColor(int i) {
        this.f43184e = i;
    }

    public void setLikedWidth(int i) {
        this.f43183d = Math.max(i, f43179i);
        this.f43181b = true;
        invalidate();
    }

    public void setRadius(float f) {
        this.f43187h = f;
    }

    public void setWidthOffset(float f) {
        this.f43180a = f;
    }

    public QATopicVoteBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43180a = t100.m186890d(3.0f);
        this.f43181b = false;
        this.f43185f = new RectF();
        this.f43186g = new RectF();
        this.f43187h = getResources().getDimension(z1c0.f201064a);
    }

    public QATopicVoteBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43180a = t100.m186890d(3.0f);
        this.f43181b = false;
        this.f43185f = new RectF();
        this.f43186g = new RectF();
        this.f43187h = getResources().getDimension(z1c0.f201064a);
    }
}
