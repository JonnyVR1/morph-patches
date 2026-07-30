package p153l;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: classes12.dex */
public class egm {
    /* JADX INFO: renamed from: a */
    public static ShapeDrawable m120790a(int i, int i2) {
        float f = i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }
}
