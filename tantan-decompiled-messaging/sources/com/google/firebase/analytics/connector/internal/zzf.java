package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.heytap.mcssdk.mode.CommandMessage;
import p149l.tw0;

/* JADX INFO: loaded from: classes7.dex */
final class zzf implements tw0.InterfaceC20300a {
    private final /* synthetic */ zzg zza;

    public zzf(zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // p149l.nrx0
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !zzb.zze(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle(CommandMessage.PARAMS, bundle);
        this.zza.zza.onMessageTriggered(3, bundle2);
    }
}
