package p028v.fresco.subscaleview;

import android.graphics.PointF;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ImageViewState implements Serializable {
    private float centerX;
    private float centerY;
    private int orientation;
    private float scale;

    public ImageViewState(float f, PointF pointF, int i) {
        this.scale = f;
        this.centerX = pointF.x;
        this.centerY = pointF.y;
        this.orientation = i;
    }

    public PointF getCenter() {
        return new PointF(this.centerX, this.centerY);
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getScale() {
        return this.scale;
    }
}
