package p003l;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class odm {
    /* JADX INFO: renamed from: a */
    public static ShapeDrawable m8443a(int i, int i2) {
        float f = i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }
}
