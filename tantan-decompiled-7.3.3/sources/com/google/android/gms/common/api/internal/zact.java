package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
import p153l.f7r0;
import p153l.j7r0;
import p153l.o7r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zact extends f7r0 implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final Api.AbstractClientBuilder zaa = j7r0.f118707c;
    private final Context zab;
    private final Handler zac;
    private final Api.AbstractClientBuilder zad;
    private final Set zae;
    private final ClientSettings zaf;
    private o7r0 zag;
    private zacs zah;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    public static /* bridge */ /* synthetic */ void zad(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult connectionResultZaa = zakVar.zaa();
        if (connectionResultZaa.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(zakVar.m15414F());
            ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZaa2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                zactVar.zah.zae(connectionResultZaa2);
                zactVar.zag.disconnect();
                return;
            }
            zactVar.zah.zaf(zavVar.zab(), zactVar.zae);
        } else {
            zactVar.zah.zae(connectionResultZaa);
        }
        zactVar.zag.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.zag.mo149033b(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zah.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.zah.zag(i);
    }

    @Override // p153l.f7r0, p153l.p7r0
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.zac.post(new zacr(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.Api$Client, l.o7r0] */
    @WorkerThread
    public final void zae(zacs zacsVar) {
        o7r0 o7r0Var = this.zag;
        if (o7r0Var != null) {
            o7r0Var.disconnect();
        }
        this.zaf.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.zad;
        Context context = this.zab;
        Handler handler = this.zac;
        ClientSettings clientSettings = this.zaf;
        this.zag = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zacsVar;
        Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new zacq(this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        o7r0 o7r0Var = this.zag;
        if (o7r0Var != null) {
            o7r0Var.disconnect();
        }
    }
}
