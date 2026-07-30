package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchProfileMaskView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f51711a;

    /* JADX INFO: renamed from: b */
    public Path f51712b;

    /* JADX INFO: renamed from: c */
    public Path f51713c;

    public PkMatchProfileMaskView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f51711a == null) {
            Paint paint = new Paint();
            this.f51711a = paint;
            paint.setColor(-1);
            this.f51711a.setStyle(Paint.Style.FILL);
            this.f51711a.setAntiAlias(true);
            this.f51712b = new Path();
            this.f51713c = new Path();
        }
        this.f51713c.reset();
        this.f51712b.reset();
        Path path = this.f51713c;
        float width = getWidth();
        float height = getHeight();
        Path.Direction direction = Path.Direction.CCW;
        path.addRect(0.0f, 0.0f, width, height, direction);
        this.f51712b.addCircle(getHeight() / 2.0f, getWidth() / 2.0f, Math.min(getHeight(), getWidth()) / 2.0f, direction);
        this.f51713c.op(this.f51712b, Path.Op.DIFFERENCE);
        canvas.drawPath(this.f51713c, this.f51711a);
    }

    public PkMatchProfileMaskView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkMatchProfileMaskView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
