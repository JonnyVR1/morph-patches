package p153l;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class lcv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public MeasurementManagerFutures f131384a;

    /* JADX INFO: renamed from: b */
    public final Context f131385b;

    public lcv0(Context context) {
        this.f131385b = context;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m153696a() {
        MeasurementManagerFutures measurementManagerFuturesM3206a = MeasurementManagerFutures.m3206a(this.f131385b);
        this.f131384a = measurementManagerFuturesM3206a;
        return measurementManagerFuturesM3206a == null ? pvw0.m173980g(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesM3206a.mo3207b();
    }

    /* JADX INFO: renamed from: b */
    public final hpr m153697b(Uri uri, InputEvent inputEvent) {
        MeasurementManagerFutures measurementManagerFutures = this.f131384a;
        Objects.requireNonNull(measurementManagerFutures);
        return measurementManagerFutures.mo3208c(uri, inputEvent);
    }
}
