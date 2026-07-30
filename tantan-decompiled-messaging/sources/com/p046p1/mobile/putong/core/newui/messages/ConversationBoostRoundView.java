package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationBoostRoundView extends View {

    /* JADX INFO: renamed from: a */
    public RectF f24668a;

    /* JADX INFO: renamed from: b */
    public Paint f24669b;

    /* JADX INFO: renamed from: c */
    public int f24670c;

    /* JADX INFO: renamed from: d */
    public float f24671d;

    /* JADX INFO: renamed from: e */
    public int f24672e;

    /* JADX INFO: renamed from: f */
    public String f24673f;

    /* JADX INFO: renamed from: g */
    public String f24674g;

    /* JADX INFO: renamed from: h */
    public double f24675h;

    public ConversationBoostRoundView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24671d = 360.0f;
        this.f24673f = "#f9f9f9";
        this.f24674g = "";
        m40648a();
    }

    /* JADX INFO: renamed from: a */
    public final void m40648a() {
        Paint paint = new Paint();
        this.f24669b = paint;
        paint.setDither(true);
        this.f24669b.setAntiAlias(true);
        this.f24669b.setStyle(Paint.Style.STROKE);
        this.f24669b.setStrokeWidth(t100.m186890d(3.0f));
        this.f24670c = t100.m186890d(69.0f);
        this.f24672e = t100.m186890d(3.0f);
        int i = this.f24672e;
        int i2 = this.f24670c;
        this.f24668a = new RectF(i, i, i2 - i, i2 - i);
        this.f24675h = (Math.atan(0.39393940567970276d) * 180.0d) / 3.141592653589793d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24669b.setColor(Color.parseColor("#ffffff"));
        RectF rectF = this.f24668a;
        float f = rectF.right;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.bottom;
        canvas.drawCircle((f + f2) / 2.0f, (f3 + f4) / 2.0f, (f4 - f2) / 2.0f, this.f24669b);
        this.f24669b.setColor(Color.parseColor(this.f24673f));
        canvas.drawArc(this.f24668a, 90.0f, 360.0f, false, this.f24669b);
        if (TextUtils.isEmpty(this.f24674g)) {
            return;
        }
        this.f24669b.setColor(Color.parseColor(this.f24674g));
        canvas.drawArc(this.f24668a, 90.0f, this.f24671d, false, this.f24669b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f24670c;
        setMeasuredDimension(i3, i3);
    }

    public void setOuterColor(String str) {
        this.f24674g = str;
    }

    public void setSweepDegree(float f) {
        if (f == 360.0f) {
            this.f24671d = f;
        } else {
            double d = this.f24675h;
            this.f24671d = (int) ((((360.0d - (2.0d * d)) * ((double) f)) / 360.0d) + d);
        }
        invalidate();
    }

    public ConversationBoostRoundView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationBoostRoundView(Context context) {
        this(context, null);
    }
}
