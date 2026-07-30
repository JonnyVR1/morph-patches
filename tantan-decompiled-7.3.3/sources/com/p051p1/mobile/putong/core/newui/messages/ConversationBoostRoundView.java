package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationBoostRoundView extends View {

    /* JADX INFO: renamed from: a */
    public RectF f25410a;

    /* JADX INFO: renamed from: b */
    public Paint f25411b;

    /* JADX INFO: renamed from: c */
    public int f25412c;

    /* JADX INFO: renamed from: d */
    public float f25413d;

    /* JADX INFO: renamed from: e */
    public int f25414e;

    /* JADX INFO: renamed from: f */
    public String f25415f;

    /* JADX INFO: renamed from: g */
    public String f25416g;

    /* JADX INFO: renamed from: h */
    public double f25417h;

    public ConversationBoostRoundView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25413d = 360.0f;
        this.f25415f = "#f9f9f9";
        this.f25416g = "";
        m41659a();
    }

    /* JADX INFO: renamed from: a */
    public final void m41659a() {
        Paint paint = new Paint();
        this.f25411b = paint;
        paint.setDither(true);
        this.f25411b.setAntiAlias(true);
        this.f25411b.setStyle(Paint.Style.STROKE);
        this.f25411b.setStrokeWidth(qa00.m175859d(3.0f));
        this.f25412c = qa00.m175859d(69.0f);
        this.f25414e = qa00.m175859d(3.0f);
        int i = this.f25414e;
        int i2 = this.f25412c;
        this.f25410a = new RectF(i, i, i2 - i, i2 - i);
        this.f25417h = (Math.atan(0.39393940567970276d) * 180.0d) / 3.141592653589793d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25411b.setColor(Color.parseColor("#ffffff"));
        RectF rectF = this.f25410a;
        float f = rectF.right;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.bottom;
        canvas.drawCircle((f + f2) / 2.0f, (f3 + f4) / 2.0f, (f4 - f2) / 2.0f, this.f25411b);
        this.f25411b.setColor(Color.parseColor(this.f25415f));
        canvas.drawArc(this.f25410a, 90.0f, 360.0f, false, this.f25411b);
        if (TextUtils.isEmpty(this.f25416g)) {
            return;
        }
        this.f25411b.setColor(Color.parseColor(this.f25416g));
        canvas.drawArc(this.f25410a, 90.0f, this.f25413d, false, this.f25411b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f25412c;
        setMeasuredDimension(i3, i3);
    }

    public void setOuterColor(String str) {
        this.f25416g = str;
    }

    public void setSweepDegree(float f) {
        if (f == 360.0f) {
            this.f25413d = f;
        } else {
            double d = this.f25417h;
            this.f25413d = (int) ((((360.0d - (2.0d * d)) * ((double) f)) / 360.0d) + d);
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
