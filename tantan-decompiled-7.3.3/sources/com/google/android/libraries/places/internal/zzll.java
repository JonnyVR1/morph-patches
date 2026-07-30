package com.google.android.libraries.places.internal;

import androidx.lifecycle.C0491t;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;
import p153l.nll0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzll implements C0491t.c {
    private final zzla zza;
    private final zzlq zzb;
    private final zzlr zzc;

    public zzll(zzla zzlaVar, zzlq zzlqVar, zzlr zzlrVar) {
        this.zza = zzlaVar;
        this.zzb = zzlqVar;
        this.zzc = zzlrVar;
    }

    @Override // androidx.lifecycle.C0491t.c
    public final nll0 create(Class cls) {
        zzmt.zzf(cls == zzln.class, "This factory can only be used to instantiate its enclosing class.");
        return new zzln(this.zza, this.zzb, this.zzc, null);
    }

    @Override // androidx.lifecycle.C0491t.c
    @NotNull
    public /* bridge */ /* synthetic */ nll0 create(@NotNull KClass kClass, @NotNull cvb cvbVar) {
        return super.create(kClass, cvbVar);
    }

    @Override // androidx.lifecycle.C0491t.c
    public final nll0 create(Class cls, cvb cvbVar) {
        return create(cls);
    }
}
