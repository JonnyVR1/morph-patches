package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ProductData {
    public static ProductData withProductId(@Nullable Integer num) {
        return new AutoValue_ProductData(num);
    }

    @Nullable
    public abstract Integer getProductId();
}
