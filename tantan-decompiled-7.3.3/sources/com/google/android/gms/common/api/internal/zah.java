package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
public final class zah extends zad {
    public final ListenerHolder.ListenerKey zab;

    public zah(ListenerHolder.ListenerKey listenerKey, sni0 sni0Var) {
        super(4, sni0Var);
        this.zab = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq zabqVar) {
        zaci zaciVar = (zaci) zabqVar.zah().get(this.zab);
        return zaciVar != null && zaciVar.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq zabqVar) {
        zaci zaciVar = (zaci) zabqVar.zah().get(this.zab);
        if (zaciVar == null) {
            return null;
        }
        return zaciVar.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(zabq zabqVar) throws RemoteException {
        zaci zaciVar = (zaci) zabqVar.zah().remove(this.zab);
        if (zaciVar == null) {
            this.zaa.m186943e(Boolean.FALSE);
            return;
        }
        zaciVar.zab.unregisterListener(zabqVar.zaf(), this.zaa);
        zaciVar.zaa.clearListener();
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@NonNull zaad zaadVar, boolean z) {
    }
}
