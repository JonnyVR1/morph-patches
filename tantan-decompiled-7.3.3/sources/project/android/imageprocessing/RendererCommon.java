package project.android.imageprocessing;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class RendererCommon {

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* JADX INFO: renamed from: a */
    public static float[] m222527a(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    /* JADX INFO: renamed from: b */
    public static final float[] m222528b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }
}
