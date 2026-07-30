package io.agora.meta;

import io.agora.base.internal.CalledByNative;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MetaUserPositionInfo {
    public float[] mForward;
    public float[] mPosition;
    public float[] mRight;
    public float[] mUp;

    @CalledByNative
    public MetaUserPositionInfo(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.mPosition = fArr;
        this.mForward = fArr2;
        this.mRight = fArr3;
        this.mUp = fArr4;
    }

    public String toString() {
        return "MetaUserPositionInfo{mPosition=" + Arrays.toString(this.mPosition) + ", mForward=" + Arrays.toString(this.mForward) + ", mRight=" + Arrays.toString(this.mRight) + ", mUp=" + Arrays.toString(this.mUp) + '}';
    }
}
