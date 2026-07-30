package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p149l.iyq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zaaw implements zabf {
    private final zabi zaa;
    private final Lock zab;
    private final Context zac;
    private final GoogleApiAvailabilityLight zad;

    @Nullable
    private ConnectionResult zae;
    private int zaf;
    private int zah;

    @Nullable
    private iyq0 zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;

    @Nullable
    private IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;

    @Nullable
    private final ClientSettings zar;
    private final Map zas;

    @Nullable
    private final Api.AbstractClientBuilder zat;
    private int zag = 0;
    private final Bundle zai = new Bundle();
    private final Set zaj = new HashSet();
    private final ArrayList zau = new ArrayList();

    public zaaw(zabi zabiVar, @Nullable ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.zaa = zabiVar;
        this.zar = clientSettings;
        this.zas = map;
        this.zad = googleApiAvailabilityLight;
        this.zat = abstractClientBuilder;
        this.zab = lock;
        this.zac = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaA() {
        this.zam = false;
        this.zaa.zag.zad = Collections.EMPTY_SET;
        for (Api.AnyClientKey anyClientKey : this.zaj) {
            if (!this.zaa.zab.containsKey(anyClientKey)) {
                zabi zabiVar = this.zaa;
                zabiVar.zab.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void zaB(boolean z) {
        iyq0 iyq0Var = this.zak;
        if (iyq0Var != null) {
            if (iyq0Var.isConnected() && z) {
                iyq0Var.zaa();
            }
            iyq0Var.disconnect();
            this.zao = null;
        }
    }

    private final void zaC() {
        this.zaa.zai();
        zabj.zaa().execute(new zaak(this));
        iyq0 iyq0Var = this.zak;
        if (iyq0Var != null) {
            if (this.zap) {
                iyq0Var.mo109907a((IAccountAccessor) Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaB(false);
        }
        Iterator it = this.zaa.zab.keySet().iterator();
        while (it.hasNext()) {
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.zaa.get((Api.AnyClientKey) it.next()))).disconnect();
        }
        this.zaa.zah.zab(this.zai.isEmpty() ? null : this.zai);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(ConnectionResult connectionResult) {
        zaz();
        zaB(!connectionResult.hasResolution());
        this.zaa.zak(connectionResult);
        this.zaa.zah.zaa(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(ConnectionResult connectionResult, Api api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.zad.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.zae == null || priority < this.zaf)) {
            this.zae = connectionResult;
            this.zaf = priority;
        }
        zabi zabiVar = this.zaa;
        zabiVar.zab.put(api.zab(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaF() {
        if (this.zah != 0) {
            return;
        }
        if (!this.zam || this.zan) {
            ArrayList arrayList = new ArrayList();
            this.zag = 1;
            this.zah = this.zaa.zaa.size();
            for (Api.AnyClientKey anyClientKey : this.zaa.zaa.keySet()) {
                if (!this.zaa.zab.containsKey(anyClientKey)) {
                    arrayList.add((Api.Client) this.zaa.zaa.get(anyClientKey));
                } else if (zaH()) {
                    zaC();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zau.add(zabj.zaa().submit(new zaap(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaG(int i) {
        if (this.zag == i) {
            return true;
        }
        this.zaa.zag.zaf();
        "Unexpected callback in ".concat(toString());
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + zaJ(this.zag) + " but received callback for step " + zaJ(i), new Exception());
        zaD(new ConnectionResult(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaH() {
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.zaa.zag.zaf();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            zaD(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.zae;
        if (connectionResult == null) {
            return true;
        }
        this.zaa.zaf = this.zaf;
        zaD(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaI(ConnectionResult connectionResult) {
        return this.zal && !connectionResult.hasResolution();
    }

    private static final String zaJ(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set zao(zaaw zaawVar) {
        ClientSettings clientSettings = zaawVar.zar;
        if (clientSettings == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
        Map mapZad = zaawVar.zar.zad();
        for (Api api : mapZad.keySet()) {
            zabi zabiVar = zaawVar.zaa;
            if (!zabiVar.zab.containsKey(api.zab())) {
                hashSet.addAll(((com.google.android.gms.common.internal.zab) mapZad.get(api)).zaa);
            }
        }
        return hashSet;
    }

    public static /* bridge */ /* synthetic */ void zar(zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (zaawVar.zaG(0)) {
            ConnectionResult connectionResultZaa = zakVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                if (!zaawVar.zaI(connectionResultZaa)) {
                    zaawVar.zaD(connectionResultZaa);
                    return;
                } else {
                    zaawVar.zaA();
                    zaawVar.zaF();
                    return;
                }
            }
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) Preconditions.checkNotNull(zakVar.m15360F());
            ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZaa2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                zaawVar.zaD(connectionResultZaa2);
                return;
            }
            zaawVar.zan = true;
            zaawVar.zao = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.zap = zavVar.zac();
            zaawVar.zaq = zavVar.zad();
            zaawVar.zaF();
        }
    }

    private final void zaz() {
        ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.zau.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, l.iyq0] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        this.zaa.zab.clear();
        this.zam = false;
        zaas zaasVar = null;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (Api api : this.zas.keySet()) {
            Api.Client client = (Api.Client) Preconditions.checkNotNull((Api.Client) this.zaa.zaa.get(api.zab()));
            z |= api.zac().getPriority() == 1;
            boolean zBooleanValue = ((Boolean) this.zas.get(api)).booleanValue();
            if (client.requiresSignIn()) {
                this.zam = true;
                if (zBooleanValue) {
                    this.zaj.add(api.zab());
                } else {
                    this.zal = false;
                }
            }
            map.put(client, new zaal(this, api, zBooleanValue));
        }
        if (z) {
            this.zam = false;
        }
        if (this.zam) {
            Preconditions.checkNotNull(this.zar);
            Preconditions.checkNotNull(this.zat);
            this.zar.zae(Integer.valueOf(System.identityHashCode(this.zaa.zag)));
            zaat zaatVar = new zaat(this, zaasVar);
            Api.AbstractClientBuilder abstractClientBuilder = this.zat;
            Context context = this.zac;
            zabi zabiVar = this.zaa;
            ClientSettings clientSettings = this.zar;
            this.zak = abstractClientBuilder.buildClient(context, zabiVar.zag.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) zaatVar, (GoogleApiClient.OnConnectionFailedListener) zaatVar);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(zabj.zaa().submit(new zaao(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(@Nullable Bundle bundle) {
        if (zaG(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api, boolean z) {
        if (zaG(1)) {
            zaE(connectionResult, api, z);
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        zaD(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        zaz();
        zaB(true);
        this.zaa.zak(null);
        return true;
    }
}
