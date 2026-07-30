package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import p153l.i7b0;

/* JADX INFO: loaded from: classes6.dex */
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final i7b0<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(i7b0<Context> i7b0Var) {
        this.contextProvider = i7b0Var;
    }

    public static EventStoreModule_PackageNameFactory create(i7b0<Context> i7b0Var) {
        return new EventStoreModule_PackageNameFactory(i7b0Var);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.packageName(context));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, p153l.i7b0
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
