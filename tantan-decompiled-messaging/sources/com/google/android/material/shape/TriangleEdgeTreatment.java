package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.size = f;
        this.inside = z;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f2 - (this.size * f3), 0.0f);
        boolean z = this.inside;
        float f4 = this.size;
        shapePath.lineTo(f2, z ? f4 * f3 : (-f4) * f3);
        shapePath.lineTo(f2 + (this.size * f3), 0.0f);
        shapePath.lineTo(f, 0.0f);
    }
}
