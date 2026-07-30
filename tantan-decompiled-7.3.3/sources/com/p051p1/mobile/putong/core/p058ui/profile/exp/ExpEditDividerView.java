package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditDividerView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f33945a;

    public ExpEditDividerView(@NonNull Context context) {
        super(context);
        this.f33945a = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f33945a.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f33945a.setAntiAlias(true);
        this.f33945a.setStyle(Paint.Style.FILL);
        this.f33945a.setAlpha(5);
        int i = qa00.f156330q;
        canvas.drawRect(i, qa00.f156320g, getMeasuredWidth() - i, qa00.f156321h, this.f33945a);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(qa00.f156326m, 1073741824));
    }

    public ExpEditDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33945a = new Paint();
    }

    public ExpEditDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33945a = new Paint();
    }
}
