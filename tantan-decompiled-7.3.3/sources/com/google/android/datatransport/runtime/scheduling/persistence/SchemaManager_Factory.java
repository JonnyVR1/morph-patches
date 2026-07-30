package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final i7b0<Context> contextProvider;
    private final i7b0<String> dbNameProvider;
    private final i7b0<Integer> schemaVersionProvider;

    public SchemaManager_Factory(i7b0<Context> i7b0Var, i7b0<String> i7b0Var2, i7b0<Integer> i7b0Var3) {
        this.contextProvider = i7b0Var;
        this.dbNameProvider = i7b0Var2;
        this.schemaVersionProvider = i7b0Var3;
    }

    public static SchemaManager_Factory create(i7b0<Context> i7b0Var, i7b0<String> i7b0Var2, i7b0<Integer> i7b0Var3) {
        return new SchemaManager_Factory(i7b0Var, i7b0Var2, i7b0Var3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
