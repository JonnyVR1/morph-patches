package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final i7b0<Clock> clockProvider;
    private final i7b0<EventStoreConfig> configProvider;
    private final i7b0<String> packageNameProvider;
    private final i7b0<SchemaManager> schemaManagerProvider;
    private final i7b0<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(i7b0<Clock> i7b0Var, i7b0<Clock> i7b0Var2, i7b0<EventStoreConfig> i7b0Var3, i7b0<SchemaManager> i7b0Var4, i7b0<String> i7b0Var5) {
        this.wallClockProvider = i7b0Var;
        this.clockProvider = i7b0Var2;
        this.configProvider = i7b0Var3;
        this.schemaManagerProvider = i7b0Var4;
        this.packageNameProvider = i7b0Var5;
    }

    public static SQLiteEventStore_Factory create(i7b0<Clock> i7b0Var, i7b0<Clock> i7b0Var2, i7b0<EventStoreConfig> i7b0Var3, i7b0<SchemaManager> i7b0Var4, i7b0<String> i7b0Var5) {
        return new SQLiteEventStore_Factory(i7b0Var, i7b0Var2, i7b0Var3, i7b0Var4, i7b0Var5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, i7b0<String> i7b0Var) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, i7b0Var);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
