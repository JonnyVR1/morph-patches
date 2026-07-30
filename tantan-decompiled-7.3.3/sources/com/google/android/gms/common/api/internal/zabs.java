package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class zabs {
    private final ApiKey zaa;
    private final Feature zab;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zabs)) {
            zabs zabsVar = (zabs) obj;
            if (Objects.equal(this.zaa, zabsVar.zaa) && Objects.equal(this.zab, zabsVar.zab)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.zab);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(Constants.KEY_KEY, this.zaa).add("feature", this.zab).toString();
    }
}
