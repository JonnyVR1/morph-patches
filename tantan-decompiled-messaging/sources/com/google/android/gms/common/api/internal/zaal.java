package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference zaa;
    private final Api zab;
    private final boolean zac;

    public zaal(zaaw zaawVar, Api api, boolean z) {
        this.zaa = new WeakReference(zaawVar);
        this.zab = api;
        this.zac = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaaw zaawVar = (zaaw) this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaawVar.zaa.zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaawVar.zab.lock();
        try {
            if (zaawVar.zaG(0)) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.zab, this.zac);
                }
                if (zaawVar.zaH()) {
                    zaawVar.zaF();
                }
            }
        } finally {
            zaawVar.zab.unlock();
        }
    }
}
