package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {
        private static final TimeModule_UptimeClockFactory INSTANCE = new TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.uptimeClock());
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public Clock get() {
        return uptimeClock();
    }
}
