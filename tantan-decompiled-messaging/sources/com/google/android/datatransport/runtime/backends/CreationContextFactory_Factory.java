package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final eza0<Context> applicationContextProvider;
    private final eza0<Clock> monotonicClockProvider;
    private final eza0<Clock> wallClockProvider;

    public CreationContextFactory_Factory(eza0<Context> eza0Var, eza0<Clock> eza0Var2, eza0<Clock> eza0Var3) {
        this.applicationContextProvider = eza0Var;
        this.wallClockProvider = eza0Var2;
        this.monotonicClockProvider = eza0Var3;
    }

    public static CreationContextFactory_Factory create(eza0<Context> eza0Var, eza0<Clock> eza0Var2, eza0<Clock> eza0Var3) {
        return new CreationContextFactory_Factory(eza0Var, eza0Var2, eza0Var3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
