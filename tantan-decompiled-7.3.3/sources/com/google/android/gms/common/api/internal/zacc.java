package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
public final class zacc extends zap {
    private sni0 zad;

    private zacc(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new sni0();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    public static zacc zaa(@NonNull Activity activity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zacc zaccVar = (zacc) fragment.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if (zaccVar == null) {
            return new zacc(fragment);
        }
        if (zaccVar.zad.m186939a().mo15430o()) {
            zaccVar.zad = new sni0();
        }
        return zaccVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.zad.m186942d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i) {
        String errorMessage = connectionResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.zad.m186940b(new ApiException(new Status(connectionResult, errorMessage, connectionResult.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zad.m186942d(new ApiException(new Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(lifecycleActivity);
        sni0 sni0Var = this.zad;
        if (iIsGooglePlayServicesAvailable == 0) {
            sni0Var.m186943e(null);
        } else {
            if (sni0Var.m186939a().mo15430o()) {
                return;
            }
            zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    public final Task zad() {
        return this.zad.m186939a();
    }
}
