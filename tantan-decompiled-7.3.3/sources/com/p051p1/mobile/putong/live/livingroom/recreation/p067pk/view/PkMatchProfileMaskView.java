package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

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
    public Paint f52559a;

    /* JADX INFO: renamed from: b */
    public Path f52560b;

    /* JADX INFO: renamed from: c */
    public Path f52561c;

    public PkMatchProfileMaskView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f52559a == null) {
            Paint paint = new Paint();
            this.f52559a = paint;
            paint.setColor(-1);
            this.f52559a.setStyle(Paint.Style.FILL);
            this.f52559a.setAntiAlias(true);
            this.f52560b = new Path();
            this.f52561c = new Path();
        }
        this.f52561c.reset();
        this.f52560b.reset();
        Path path = this.f52561c;
        float width = getWidth();
        float height = getHeight();
        Path.Direction direction = Path.Direction.CCW;
        path.addRect(0.0f, 0.0f, width, height, direction);
        this.f52560b.addCircle(getHeight() / 2.0f, getWidth() / 2.0f, Math.min(getHeight(), getWidth()) / 2.0f, direction);
        this.f52561c.op(this.f52560b, Path.Op.DIFFERENCE);
        canvas.drawPath(this.f52561c, this.f52559a);
    }

    public PkMatchProfileMaskView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkMatchProfileMaskView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
