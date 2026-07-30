package com.google.android.libraries.places.internal;

import androidx.lifecycle.C0490t;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import p149l.jcl0;
import p149l.otb;

/* JADX INFO: loaded from: classes7.dex */
public final class zzll implements C0490t.c {
    private final zzla zza;
    private final zzlq zzb;
    private final zzlr zzc;

    public zzll(zzla zzlaVar, zzlq zzlqVar, zzlr zzlrVar) {
        this.zza = zzlaVar;
        this.zzb = zzlqVar;
        this.zzc = zzlrVar;
    }

    @Override // androidx.lifecycle.C0490t.c
    public final jcl0 create(Class cls) {
        zzmt.zzf(cls == zzln.class, "This factory can only be used to instantiate its enclosing class.");
        return new zzln(this.zza, this.zzb, this.zzc, null);
    }

    @Override // androidx.lifecycle.C0490t.c
    @NotNull
    public /* bridge */ /* synthetic */ jcl0 create(@NotNull KClass kClass, @NotNull otb otbVar) {
        return super.create(kClass, otbVar);
    }

    @Override // androidx.lifecycle.C0490t.c
    public final jcl0 create(Class cls, otb otbVar) {
        return create(cls);
    }
}
