package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import p149l.eza0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final eza0<Context> contextProvider;
    private final eza0<String> dbNameProvider;
    private final eza0<Integer> schemaVersionProvider;

    public SchemaManager_Factory(eza0<Context> eza0Var, eza0<String> eza0Var2, eza0<Integer> eza0Var3) {
        this.contextProvider = eza0Var;
        this.dbNameProvider = eza0Var2;
        this.schemaVersionProvider = eza0Var3;
    }

    public static SchemaManager_Factory create(eza0<Context> eza0Var, eza0<String> eza0Var2, eza0<Integer> eza0Var3) {
        return new SchemaManager_Factory(eza0Var, eza0Var2, eza0Var3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p149l.eza0
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
