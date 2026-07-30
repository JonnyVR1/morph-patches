package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationBoostRoundView extends View {

    /* JADX INFO: renamed from: a */
    public RectF f3446a;

    /* JADX INFO: renamed from: b */
    public Paint f3447b;

    /* JADX INFO: renamed from: c */
    public int f3448c;

    /* JADX INFO: renamed from: d */
    public float f3449d;

    /* JADX INFO: renamed from: e */
    public int f3450e;

    /* JADX INFO: renamed from: f */
    public String f3451f;

    /* JADX INFO: renamed from: g */
    public String f3452g;

    /* JADX INFO: renamed from: h */
    public double f3453h;

    public ConversationBoostRoundView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3449d = 360.0f;
        this.f3451f = "#f9f9f9";
        this.f3452g = "";
        m4743a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4743a() {
        Paint paint = new Paint();
        this.f3447b = paint;
        paint.setDither(true);
        this.f3447b.setAntiAlias(true);
        this.f3447b.setStyle(Paint.Style.STROKE);
        this.f3447b.setStrokeWidth(t100.d(3.0f));
        this.f3448c = t100.d(69.0f);
        this.f3450e = t100.d(3.0f);
        int i = this.f3450e;
        int i2 = this.f3448c;
        this.f3446a = new RectF(i, i, i2 - i, i2 - i);
        this.f3453h = (Math.atan(0.39393940567970276d) * 180.0d) / 3.141592653589793d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3447b.setColor(Color.parseColor("#ffffff"));
        RectF rectF = this.f3446a;
        float f = rectF.right;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.bottom;
        canvas.drawCircle((f + f2) / 2.0f, (f3 + f4) / 2.0f, (f4 - f2) / 2.0f, this.f3447b);
        this.f3447b.setColor(Color.parseColor(this.f3451f));
        canvas.drawArc(this.f3446a, 90.0f, 360.0f, false, this.f3447b);
        if (TextUtils.isEmpty(this.f3452g)) {
            return;
        }
        this.f3447b.setColor(Color.parseColor(this.f3452g));
        canvas.drawArc(this.f3446a, 90.0f, this.f3449d, false, this.f3447b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f3448c;
        setMeasuredDimension(i3, i3);
    }

    public void setOuterColor(String str) {
        this.f3452g = str;
    }

    public void setSweepDegree(float f) {
        if (f == 360.0f) {
            this.f3449d = f;
        } else {
            double d = this.f3453h;
            this.f3449d = (int) ((((360.0d - (2.0d * d)) * ((double) f)) / 360.0d) + d);
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
