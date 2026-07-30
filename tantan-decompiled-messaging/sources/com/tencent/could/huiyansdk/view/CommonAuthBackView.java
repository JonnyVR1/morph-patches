package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes2.dex */
public class CommonAuthBackView extends View {

    /* JADX INFO: renamed from: a */
    public int f57561a;

    /* JADX INFO: renamed from: b */
    public Point f57562b;

    /* JADX INFO: renamed from: c */
    public Paint f57563c;

    public CommonAuthBackView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82419a();
    }

    /* JADX INFO: renamed from: a */
    public final void m82419a() {
        this.f57562b = new Point();
        this.f57563c = new Paint();
        this.f57563c.setPathEffect(new DashPathEffect(new float[]{CommonUtils.dpToPx(this, 1.5f), CommonUtils.dpToPx(this, 25.0f)}, CommonUtils.dpToPx(this, 0.0f)));
        this.f57563c.setColor(getResources().getColor(C13869R.color.txy_auth_bg_circle));
        this.f57563c.setStyle(Paint.Style.STROKE);
        this.f57563c.setStrokeWidth(CommonUtils.dpToPx(this, 6.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Point point = this.f57562b;
        canvas.drawCircle(point.x, point.y, this.f57561a, this.f57563c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Point point = this.f57562b;
        int i3 = size >> 1;
        point.x = i3;
        int i4 = size2 >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        this.f57561a = i3;
        this.f57561a = i3 - CommonUtils.dpToPx(this, 5.0f);
        setMeasuredDimension(size, size2);
    }

    public CommonAuthBackView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonAuthBackView(Context context) {
        this(context, null);
    }
}
