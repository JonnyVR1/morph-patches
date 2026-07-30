package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaf extends zad {
    public final zaci zab;

    public zaf(zaci zaciVar, sei0 sei0Var) {
        super(3, sei0Var);
        this.zab = zaciVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq zabqVar) {
        return this.zab.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq zabqVar) {
        return this.zab.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(zabq zabqVar) throws RemoteException {
        this.zab.zaa.registerListener(zabqVar.zaf(), this.zaa);
        ListenerHolder.ListenerKey listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zabqVar.zah().put(listenerKey, this.zab);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@NonNull zaad zaadVar, boolean z) {
    }
}
