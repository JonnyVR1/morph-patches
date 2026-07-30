package p149l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
public class dt6 {

    /* JADX INFO: renamed from: a */
    private final Matrix f87820a;

    /* JADX INFO: renamed from: b */
    private RectF f87821b;

    public dt6(CameraCharacteristics cameraCharacteristics, RectF rectF) {
        if (!m113535a(rectF)) {
            ig3.m135964a("previewRect");
            throw null;
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        int iIntValue = num == null ? 90 : num.intValue();
        this.f87821b = new RectF(rect);
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        this.f87820a = m113536b(num2 != null && num2.intValue() == 0, iIntValue, rectF);
    }

    /* JADX INFO: renamed from: a */
    private boolean m113535a(RectF rectF) {
        return (rectF.width() == 0.0f || rectF.height() == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private Matrix m113536b(boolean z, int i, RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(-i);
        matrix.mapRect(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, this.f87821b, Matrix.ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        return matrix;
    }

    /* JADX INFO: renamed from: c */
    public RectF m113537c(RectF rectF) {
        RectF rectF2 = new RectF();
        this.f87820a.mapRect(rectF2, rectF);
        return rectF2;
    }
}
