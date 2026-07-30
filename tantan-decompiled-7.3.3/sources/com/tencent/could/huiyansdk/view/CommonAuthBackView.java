package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.utils.CommonUtils;

/* JADX INFO: loaded from: classes12.dex */
public class CommonAuthBackView extends View {

    /* JADX INFO: renamed from: a */
    public int f58409a;

    /* JADX INFO: renamed from: b */
    public Point f58410b;

    /* JADX INFO: renamed from: c */
    public Paint f58411c;

    public CommonAuthBackView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m83602a();
    }

    /* JADX INFO: renamed from: a */
    public final void m83602a() {
        this.f58410b = new Point();
        this.f58411c = new Paint();
        this.f58411c.setPathEffect(new DashPathEffect(new float[]{CommonUtils.dpToPx(this, 1.5f), CommonUtils.dpToPx(this, 25.0f)}, CommonUtils.dpToPx(this, 0.0f)));
        this.f58411c.setColor(getResources().getColor(C14032R.color.txy_auth_bg_circle));
        this.f58411c.setStyle(Paint.Style.STROKE);
        this.f58411c.setStrokeWidth(CommonUtils.dpToPx(this, 6.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Point point = this.f58410b;
        canvas.drawCircle(point.x, point.y, this.f58409a, this.f58411c);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Point point = this.f58410b;
        int i3 = size >> 1;
        point.x = i3;
        int i4 = size2 >> 1;
        point.y = i4;
        if (i3 > i4) {
            i3 = i4;
        }
        this.f58409a = i3;
        this.f58409a = i3 - CommonUtils.dpToPx(this, 5.0f);
        setMeasuredDimension(size, size2);
    }

    public CommonAuthBackView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonAuthBackView(Context context) {
        this(context, null);
    }
}
