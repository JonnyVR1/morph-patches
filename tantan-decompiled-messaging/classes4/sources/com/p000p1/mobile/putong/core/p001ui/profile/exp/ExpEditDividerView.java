package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpEditDividerView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f919a;

    public ExpEditDividerView(@NonNull Context context) {
        super(context);
        this.f919a = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f919a.setColor(-16777216);
        this.f919a.setAntiAlias(true);
        this.f919a.setStyle(Paint.Style.FILL);
        this.f919a.setAlpha(5);
        int i = t100.q;
        canvas.drawRect(i, t100.g, getMeasuredWidth() - i, t100.h, this.f919a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(t100.m, 1073741824));
    }

    public ExpEditDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f919a = new Paint();
    }

    public ExpEditDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f919a = new Paint();
    }
}
