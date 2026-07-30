package com.google.android.libraries.places.internal;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class zzbvz extends zzbwv {

    @NotNull
    public static final zzbvw zza = new zzbvw(null);

    @NotNull
    private static final ReentrantLock zzd;

    @NotNull
    private static final Condition zze;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        zzd = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        zze = conditionNewCondition;
    }
}
