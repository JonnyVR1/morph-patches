package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p149l.tw0;

/* JADX INFO: loaded from: classes7.dex */
final class zzd implements tw0.InterfaceC20300a {
    private final /* synthetic */ zze zza;

    public zzd(zze zzeVar) {
        this.zza = zzeVar;
    }

    @Override // p149l.nrx0
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (this.zza.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzb.zza(str2));
            this.zza.zzb.onMessageTriggered(2, bundle2);
        }
    }
}
