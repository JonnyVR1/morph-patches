package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import p149l.jf4;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzlg {
    private Task zza;

    public /* synthetic */ zzlg(zzlf zzlfVar) {
    }

    public abstract jf4 zza();

    @Nullable
    public final Task zzc() {
        return this.zza;
    }

    public final void zzd(Task task) {
        this.zza = task;
    }
}
