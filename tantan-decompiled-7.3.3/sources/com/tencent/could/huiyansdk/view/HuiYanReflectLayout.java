package com.tencent.could.huiyansdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanReflectLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a */
    public Paint f58415a;

    /* JADX INFO: renamed from: b */
    public ColorMatrixColorFilter f58416b;

    /* JADX INFO: renamed from: c */
    public Rect f58417c;

    public HuiYanReflectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m83604a();
    }

    /* JADX INFO: renamed from: a */
    public final void m83604a() {
        Paint paint = new Paint(1);
        this.f58415a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f58416b = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        this.f58417c = new Rect();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f58415a.setColorFilter(this.f58416b);
        this.f58417c.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.f58417c, this.f58415a);
    }
}
