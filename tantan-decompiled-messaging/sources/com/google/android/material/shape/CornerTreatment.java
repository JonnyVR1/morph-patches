package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class CornerTreatment {
    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f2, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f, f2, cornerSize.getCornerSize(rectF));
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f2, float f3) {
        getCornerPath(f, f2, shapePath);
    }

    @Deprecated
    public void getCornerPath(float f, float f2, @NonNull ShapePath shapePath) {
    }
}
