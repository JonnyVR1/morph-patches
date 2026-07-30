package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000eH\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m87232d2 = {"Lcom/google/firebase/analytics/ktx/ParametersBuilder;", "", "<init>", "()V", StickerBundle.TYPE, "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "param", "", Constants.KEY_KEY, "", "value", "", "", "", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ParametersBuilder {

    @NotNull
    private final Bundle zza = new Bundle();

    @NotNull
    /* JADX INFO: renamed from: getBundle, reason: from getter */
    public final Bundle getZza() {
        return this.zza;
    }

    @Deprecated
    public final void param(@NonNull String key, @NonNull Bundle[] value) {
        key.getClass();
        value.getClass();
        this.zza.putParcelableArray(key, value);
    }

    @Deprecated
    public final void param(@NonNull String key, long value) {
        key.getClass();
        this.zza.putLong(key, value);
    }

    @Deprecated
    public final void param(@NonNull String key, @NonNull Bundle value) {
        key.getClass();
        value.getClass();
        this.zza.putBundle(key, value);
    }

    @Deprecated
    public final void param(@NonNull String key, @NonNull String value) {
        key.getClass();
        value.getClass();
        this.zza.putString(key, value);
    }

    @Deprecated
    public final void param(@NonNull String key, double value) {
        key.getClass();
        this.zza.putDouble(key, value);
    }
}
