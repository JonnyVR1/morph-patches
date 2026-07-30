package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public class HuiYanReflectLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public Paint f57567a;

    /* JADX INFO: renamed from: b */
    public ColorMatrixColorFilter f57568b;

    /* JADX INFO: renamed from: c */
    public Rect f57569c;

    public HuiYanReflectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82421a();
    }

    /* JADX INFO: renamed from: a */
    public final void m82421a() {
        Paint paint = new Paint(1);
        this.f57567a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f57568b = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        this.f57569c = new Rect();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f57567a.setColorFilter(this.f57568b);
        this.f57569c.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.f57569c, this.f57567a);
    }
}
