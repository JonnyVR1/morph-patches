package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p153l.l01;
import p153l.sni0;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {
    final /* synthetic */ GoogleApiManager zaa;

    @NotOnlyInitialized
    private final Api.Client zac;
    private final ApiKey zad;
    private final zaad zae;
    private final int zah;

    @Nullable
    private final zact zai;
    private boolean zaj;
    private final Queue zab = new LinkedList();
    private final Set zaf = new HashSet();
    private final Map zag = new HashMap();
    private final List zak = new ArrayList();

    @Nullable
    private ConnectionResult zal = null;
    private int zam = 0;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.zaa = googleApiManager;
        Api.Client clientZab = googleApi.zab(googleApiManager.zar.getLooper(), this);
        this.zac = clientZab;
        this.zad = googleApi.getApiKey();
        this.zae = new zaad();
        this.zah = googleApi.zaa();
        if (clientZab.requiresSignIn()) {
            this.zai = googleApi.zac(googleApiManager.zai, googleApiManager.zar);
        } else {
            this.zai = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @WorkerThread
    private final Feature zaC(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            l01 l01Var = new l01(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                l01Var.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l2 = (Long) l01Var.get(feature2.getName());
                if (l2 == null || l2.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    private final void zaD(ConnectionResult connectionResult) {
        Iterator it = this.zaf.iterator();
        while (it.hasNext()) {
            ((zal) it.next()).zac(this.zad, connectionResult, Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zaE(Status status) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        zaF(status, null, false);
    }

    @WorkerThread
    private final void zaF(@Nullable Status status, @Nullable Exception exc, boolean z) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if ((status == null) == (exc == null)) {
            wg3.m206174a("Status XOR exception should be null");
            return;
        }
        Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    @WorkerThread
    private final void zaG() {
        ArrayList arrayList = new ArrayList(this.zab);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaM(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zaH() {
        zan();
        zaD(ConnectionResult.RESULT_SUCCESS);
        zaL();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            zaci zaciVar = (zaci) it.next();
            if (zaC(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.registerListener(this.zac, new sni0<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zaI(int i) {
        zan();
        this.zaj = true;
        this.zae.zae(i, this.zac.getLastDisconnectMessage());
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 9, apiKey), Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        ApiKey apiKey2 = this.zad;
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(Message.obtain(googleApiManager2.zar, 11, apiKey2), 120000L);
        this.zaa.zak.zac();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((zaci) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        this.zaa.zar.removeMessages(12, this.zad);
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(12, apiKey), this.zaa.zae);
    }

    @WorkerThread
    private final void zaK(zai zaiVar) {
        zaiVar.zag(this.zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    private final void zaL() {
        if (this.zaj) {
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.removeMessages(11, this.zad);
            GoogleApiManager googleApiManager2 = this.zaa;
            googleApiManager2.zar.removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    @WorkerThread
    private final boolean zaM(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaK(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature featureZaC = zaC(zacVar.zab(this));
        if (featureZaC == null) {
            zaK(zaiVar);
            return true;
        }
        this.zac.getClass();
        featureZaC.getName();
        featureZaC.getVersion();
        if (!this.zaa.zas || !zacVar.zaa(this)) {
            zacVar.zae(new UnsupportedApiCallException(featureZaC));
            return true;
        }
        zabs zabsVar = new zabs(this.zad, featureZaC, null);
        int iIndexOf = this.zak.indexOf(zabsVar);
        List list = this.zak;
        if (iIndexOf >= 0) {
            zabs zabsVar2 = (zabs) list.get(iIndexOf);
            this.zaa.zar.removeMessages(15, zabsVar2);
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 15, zabsVar2), Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            return false;
        }
        list.add(zabsVar);
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(Message.obtain(googleApiManager2.zar, 15, zabsVar), Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zar.sendMessageDelayed(Message.obtain(googleApiManager3.zar, 16, zabsVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (zaN(connectionResult)) {
            return false;
        }
        this.zaa.zaE(connectionResult, this.zah);
        return false;
    }

    @WorkerThread
    private final boolean zaN(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.zac) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                if (googleApiManager.zao == null || !googleApiManager.zap.contains(this.zad)) {
                    return false;
                }
                this.zaa.zao.zah(connectionResult, this.zah);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final boolean zaO(boolean z) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (!this.zac.isConnected() || !this.zag.isEmpty()) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        zaJ();
        return false;
    }

    public static /* bridge */ /* synthetic */ void zal(zabq zabqVar, zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (zabqVar.zac.isConnected()) {
                zabqVar.zaG();
            } else {
                zabqVar.zao();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zam(zabq zabqVar, zabs zabsVar) {
        Feature[] featureArrZab;
        if (zabqVar.zak.remove(zabsVar)) {
            zabqVar.zaa.zar.removeMessages(15, zabsVar);
            zabqVar.zaa.zar.removeMessages(16, zabsVar);
            Feature feature = zabsVar.zab;
            ArrayList arrayList = new ArrayList(zabqVar.zab.size());
            for (zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof zac) && (featureArrZab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(featureArrZab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zaiVar2 = (zai) arrayList.get(i);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(feature));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.zaa.zar.getLooper()) {
            zaH();
        } else {
            this.zaa.zar.post(new zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.zaa.zar.getLooper()) {
            zaI(i);
        } else {
            this.zaa.zar.post(new zabn(this, i));
        }
    }

    public final boolean zaA() {
        return this.zac.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    @WorkerThread
    public final boolean zaB() {
        return zaO(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api api, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    @WorkerThread
    public final int zac() {
        return this.zam;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        return this.zal;
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map zah() {
        return this.zag;
    }

    @WorkerThread
    public final void zan() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        this.zal = null;
    }

    @WorkerThread
    public final void zao() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.zaa;
            int iZab = googleApiManager.zak.zab(googleApiManager.zai, this.zac);
            if (iZab != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iZab, null);
                this.zac.getClass();
                connectionResult.toString();
                zar(connectionResult, null);
                return;
            }
            GoogleApiManager googleApiManager2 = this.zaa;
            Api.Client client = this.zac;
            zabu zabuVar = new zabu(googleApiManager2, client, this.zad);
            if (client.requiresSignIn()) {
                ((zact) Preconditions.checkNotNull(this.zai)).zae(zabuVar);
            }
            try {
                this.zac.connect(zabuVar);
            } catch (SecurityException e) {
                zar(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            zar(new ConnectionResult(10), e2);
        }
    }

    @WorkerThread
    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zac.isConnected()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    @WorkerThread
    public final void zaq() {
        this.zam++;
    }

    @WorkerThread
    public final void zar(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.zaa.zak.zac();
        zaD(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zaf = true;
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(19), Constants.INBOX_V2_THROTTLE_WINDOW_MS);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaE(GoogleApiManager.zab);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        GoogleApiManager googleApiManager2 = this.zaa;
        if (exc != null) {
            Preconditions.checkHandlerThread(googleApiManager2.zar);
            zaF(null, exc, false);
            return;
        }
        boolean z = googleApiManager2.zas;
        ApiKey apiKey = this.zad;
        if (!z) {
            zaE(GoogleApiManager.zaF(apiKey, connectionResult));
            return;
        }
        zaF(GoogleApiManager.zaF(apiKey, connectionResult), null, true);
        if (this.zab.isEmpty() || zaN(connectionResult) || this.zaa.zaE(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaE(GoogleApiManager.zaF(this.zad, connectionResult));
            return;
        }
        GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zar.sendMessageDelayed(Message.obtain(googleApiManager3.zar, 9, this.zad), Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    @WorkerThread
    public final void zas(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        Api.Client client = this.zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    @WorkerThread
    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(this.zaa.zar);
        this.zaf.add(zalVar);
    }

    @WorkerThread
    public final void zau() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zaj) {
            zao();
        }
    }

    @WorkerThread
    public final void zav() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        zaE(GoogleApiManager.zaa);
        this.zae.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new sni0()));
        }
        zaD(new ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new zabp(this));
        }
    }

    @WorkerThread
    public final void zaw() {
        Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zaj) {
            zaL();
            GoogleApiManager googleApiManager = this.zaa;
            zaE(googleApiManager.zaj.isGooglePlayServicesAvailable(googleApiManager.zai) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.zac.isConnected();
    }
}
