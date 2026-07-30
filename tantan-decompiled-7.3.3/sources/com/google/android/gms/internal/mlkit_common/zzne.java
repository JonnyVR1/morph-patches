package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes6.dex */
public enum zzne {
    TYPE_UNKNOWN(0),
    CUSTOM(1),
    AUTOML_IMAGE_LABELING(2),
    BASE_TRANSLATE(3),
    CUSTOM_OBJECT_DETECTION(4),
    CUSTOM_IMAGE_LABELING(5),
    BASE_ENTITY_EXTRACTION(6),
    BASE_DIGITAL_INK(7),
    TOXICITY_DETECTION(8),
    IMAGE_CAPTIONING(9),
    DIGITAL_INK_SEGMENTATION(10);

    private final int zzm;

    zzne(int i) {
        this.zzm = i;
    }

    public final int zza() {
        return this.zzm;
    }
}
