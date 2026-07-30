package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: classes3.dex */
public class zmd0 extends RectShape {

    /* JADX INFO: renamed from: a */
    public int f205062a;

    public zmd0(int i) {
        this.f205062a = i;
    }

    @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public void draw(Canvas canvas, Paint paint) {
        RectF rectFRect = rect();
        int i = this.f205062a;
        canvas.drawRoundRect(rectFRect, i, i, paint);
    }
}
