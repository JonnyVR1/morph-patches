package p003l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xed0 extends RectShape {

    /* JADX INFO: renamed from: a */
    public int f8772a;

    public xed0(int i) {
        this.f8772a = i;
    }

    @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public void draw(Canvas canvas, Paint paint) {
        RectF rectFRect = rect();
        int i = this.f8772a;
        canvas.drawRoundRect(rectFRect, i, i, paint);
    }
}
