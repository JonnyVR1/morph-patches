package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p153l.i8r0;
import p153l.l01;
import p153l.n8r0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
final class zaaa implements zaca {
    private final Context zaa;
    private final zabe zab;
    private final Looper zac;
    private final zabi zad;
    private final zabi zae;
    private final Map zaf;

    @Nullable
    private final Api.Client zah;

    @Nullable
    private Bundle zai;
    private final Lock zam;
    private final Set zag = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    private ConnectionResult zaj = null;

    @Nullable
    private ConnectionResult zak = null;
    private boolean zal = false;
    private int zan = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private zaaa(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @Nullable Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.zaa = context;
        this.zab = zabeVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zax(this, null));
        this.zae = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, 0 == true ? 1 : 0));
        l01 l01Var = new l01();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            l01Var.put((Api.AnyClientKey) it.next(), this.zad);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            l01Var.put((Api.AnyClientKey) it2.next(), this.zae);
        }
        this.zaf = Collections.unmodifiableMap(l01Var);
    }

    private final void zaA(ConnectionResult connectionResult) {
        int i = this.zan;
        if (i == 1) {
            zaB();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.zab.zaa(connectionResult);
            zaB();
        }
        this.zan = 0;
    }

    private final void zaB() {
        Iterator it = this.zag.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        this.zag.clear();
    }

    private final boolean zaC() {
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaD(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.zae);
    }

    private static boolean zaE(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static zaaa zag(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        l01 l01Var = new l01();
        l01 l01Var2 = new l01();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                l01Var.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                l01Var2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!l01Var.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        l01 l01Var3 = new l01();
        l01 l01Var4 = new l01();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey anyClientKeyZab = api.zab();
            if (l01Var.containsKey(anyClientKeyZab)) {
                l01Var3.put(api, (Boolean) map2.get(api));
            } else {
                if (!l01Var2.containsKey(anyClientKeyZab)) {
                    wtq0.m207906a("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    return null;
                }
                l01Var4.put(api, (Boolean) map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zatVar = (zat) arrayList.get(i);
            if (l01Var3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!l01Var4.containsKey(zatVar.zaa)) {
                    wtq0.m207906a("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    return null;
                }
                arrayList3.add(zatVar);
            }
        }
        return new zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, l01Var, l01Var2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, l01Var3, l01Var4);
    }

    public static /* bridge */ /* synthetic */ void zan(zaaa zaaaVar, int i, boolean z) {
        zaaaVar.zab.zac(i, z);
        zaaaVar.zak = null;
        zaaaVar.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(zaaa zaaaVar, Bundle bundle) {
        Bundle bundle2 = zaaaVar.zai;
        if (bundle2 == null) {
            zaaaVar.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        if (!zaE(zaaaVar.zaj)) {
            if (zaaaVar.zaj != null && zaE(zaaaVar.zak)) {
                zaaaVar.zae.zar();
                zaaaVar.zaA((ConnectionResult) Preconditions.checkNotNull(zaaaVar.zaj));
                return;
            }
            ConnectionResult connectionResult2 = zaaaVar.zaj;
            if (connectionResult2 == null || (connectionResult = zaaaVar.zak) == null) {
                return;
            }
            if (zaaaVar.zae.zaf < zaaaVar.zad.zaf) {
                connectionResult2 = connectionResult;
            }
            zaaaVar.zaA(connectionResult2);
            return;
        }
        if (zaE(zaaaVar.zak) || zaaaVar.zaC()) {
            int i = zaaaVar.zan;
            if (i == 1) {
                zaaaVar.zaB();
            } else if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(zaaaVar.zab)).zab(zaaaVar.zai);
                zaaaVar.zaB();
            }
            zaaaVar.zan = 0;
            return;
        }
        ConnectionResult connectionResult3 = zaaaVar.zak;
        if (connectionResult3 != null) {
            if (zaaaVar.zan == 1) {
                zaaaVar.zaB();
            } else {
                zaaaVar.zaA(connectionResult3);
                zaaaVar.zad.zar();
            }
        }
    }

    @Nullable
    private final PendingIntent zaz() {
        Api.Client client = this.zah;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), client.getSignInIntent(), i8r0.f113366a | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @Nullable
    public final ConnectionResult zad(@NonNull Api api) {
        if (Objects.equal(this.zaf.get(api.zab()), this.zae)) {
            return zaC() ? new ConnectionResult(4, zaz()) : this.zae.zad(api);
        }
        return this.zad.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            this.zad.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (zaC()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
            return apiMethodImpl;
        }
        this.zae.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            return this.zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.zae.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.zae.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.zad.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.zam.lock();
        try {
            boolean zZax = zax();
            this.zae.zar();
            this.zak = new ConnectionResult(4);
            if (zZax) {
                new n8r0(this.zac).post(new zav(this));
            } else {
                zaB();
            }
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        this.zam.lock();
        try {
            boolean z = false;
            if (this.zad.zaw() && (this.zae.zaw() || zaC() || this.zan == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            boolean z = false;
            if (zax() || zaw()) {
                if (!this.zae.zaw()) {
                    this.zag.add(signInConnectionListener);
                    z = true;
                    if (this.zan == 0) {
                        this.zan = 1;
                    }
                    this.zak = null;
                    this.zae.zaq();
                }
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }
}
