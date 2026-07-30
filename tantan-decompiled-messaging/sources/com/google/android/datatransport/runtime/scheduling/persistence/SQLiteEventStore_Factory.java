package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final eza0<Clock> clockProvider;
    private final eza0<EventStoreConfig> configProvider;
    private final eza0<String> packageNameProvider;
    private final eza0<SchemaManager> schemaManagerProvider;
    private final eza0<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(eza0<Clock> eza0Var, eza0<Clock> eza0Var2, eza0<EventStoreConfig> eza0Var3, eza0<SchemaManager> eza0Var4, eza0<String> eza0Var5) {
        this.wallClockProvider = eza0Var;
        this.clockProvider = eza0Var2;
        this.configProvider = eza0Var3;
        this.schemaManagerProvider = eza0Var4;
        this.packageNameProvider = eza0Var5;
    }

    public static SQLiteEventStore_Factory create(eza0<Clock> eza0Var, eza0<Clock> eza0Var2, eza0<EventStoreConfig> eza0Var3, eza0<SchemaManager> eza0Var4, eza0<String> eza0Var5) {
        return new SQLiteEventStore_Factory(eza0Var, eza0Var2, eza0Var3, eza0Var4, eza0Var5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, eza0<String> eza0Var) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, eza0Var);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
