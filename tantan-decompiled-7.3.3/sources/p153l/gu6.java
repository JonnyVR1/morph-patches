package p153l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
public class gu6 {

    /* JADX INFO: renamed from: a */
    private final Matrix f106469a;

    /* JADX INFO: renamed from: b */
    private RectF f106470b;

    public gu6(CameraCharacteristics cameraCharacteristics, RectF rectF) {
        if (!m132273a(rectF)) {
            wg3.m206174a("previewRect");
            throw null;
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        int iIntValue = num == null ? 90 : num.intValue();
        this.f106470b = new RectF(rect);
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        this.f106469a = m132274b(num2 != null && num2.intValue() == 0, iIntValue, rectF);
    }

    /* JADX INFO: renamed from: a */
    private boolean m132273a(RectF rectF) {
        return (rectF.width() == 0.0f || rectF.height() == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private Matrix m132274b(boolean z, int i, RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(-i);
        matrix.mapRect(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, this.f106470b, Matrix.ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        return matrix;
    }

    /* JADX INFO: renamed from: c */
    public RectF m132275c(RectF rectF) {
        RectF rectF2 = new RectF();
        this.f106469a.mapRect(rectF2, rectF);
        return rectF2;
    }
}
