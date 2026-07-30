package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import p149l.pkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzazh {
    static final zzazi zza;

    static {
        zzazi zzbdxVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            zzbdxVar = (zzazi) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzazi.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            zzbdxVar = new zzbdx();
        } catch (Exception e2) {
            pkq0.m170054a("Storage override failed to initialize", e2);
            return;
        }
        zza = zzbdxVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            zzazj.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
