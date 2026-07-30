package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final i7b0<Context> applicationContextProvider;
    private final i7b0<Clock> monotonicClockProvider;
    private final i7b0<Clock> wallClockProvider;

    public CreationContextFactory_Factory(i7b0<Context> i7b0Var, i7b0<Clock> i7b0Var2, i7b0<Clock> i7b0Var3) {
        this.applicationContextProvider = i7b0Var;
        this.wallClockProvider = i7b0Var2;
        this.monotonicClockProvider = i7b0Var3;
    }

    public static CreationContextFactory_Factory create(i7b0<Context> i7b0Var, i7b0<Clock> i7b0Var2, i7b0<Clock> i7b0Var3) {
        return new CreationContextFactory_Factory(i7b0Var, i7b0Var2, i7b0Var3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
