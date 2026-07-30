package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    public zao(zap zapVar, zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.zaa.zaa) {
            ConnectionResult connectionResultZab = this.zab.zab();
            boolean zHasResolution = connectionResultZab.hasResolution();
            zap zapVar = this.zaa;
            if (zHasResolution) {
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultZab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            if (zapVar.zac.getErrorResolutionIntent(zapVar.getActivity(), connectionResultZab.getErrorCode(), null) != null) {
                zap zapVar2 = this.zaa;
                zapVar2.zac.zag(zapVar2.getActivity(), zapVar2.mLifecycleFragment, connectionResultZab.getErrorCode(), 2, this.zaa);
                return;
            }
            int errorCode = connectionResultZab.getErrorCode();
            zap zapVar3 = this.zaa;
            if (errorCode != 18) {
                zapVar3.zaa(connectionResultZab, this.zab.zaa());
                return;
            }
            Dialog dialogZab = zapVar3.zac.zab(zapVar3.getActivity(), zapVar3);
            zap zapVar4 = this.zaa;
            zapVar4.zac.zac(zapVar4.getActivity().getApplicationContext(), new zan(this, dialogZab));
        }
    }
}
