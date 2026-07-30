package p149l;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class f3v0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public MeasurementManagerFutures f94721a;

    /* JADX INFO: renamed from: b */
    public final Context f94722b;

    public f3v0(Context context) {
        this.f94722b = context;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m119265a() {
        MeasurementManagerFutures measurementManagerFuturesM3205a = MeasurementManagerFutures.m3205a(this.f94722b);
        this.f94721a = measurementManagerFuturesM3205a;
        return measurementManagerFuturesM3205a == null ? jmw0.m142234g(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesM3205a.mo3206b();
    }

    /* JADX INFO: renamed from: b */
    public final gnr m119266b(Uri uri, InputEvent inputEvent) {
        MeasurementManagerFutures measurementManagerFutures = this.f94721a;
        Objects.requireNonNull(measurementManagerFutures);
        return measurementManagerFutures.mo3207c(uri, inputEvent);
    }
}
