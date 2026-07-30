package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p149l.hzq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zak implements Handler.Callback {

    @NotOnlyInitialized
    private final zaj zab;
    private final Handler zah;
    private final ArrayList zac = new ArrayList();

    @VisibleForTesting
    final ArrayList zaa = new ArrayList();
    private final ArrayList zad = new ArrayList();
    private volatile boolean zae = false;
    private final AtomicInteger zaf = new AtomicInteger(0);
    private boolean zag = false;
    private final Object zai = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.zab = zajVar;
        this.zah = new hzq0(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            try {
                if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    @VisibleForTesting
    public final void zac(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.zah, "onConnectionFailure must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            try {
                ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList = new ArrayList(this.zad);
                int i = this.zaf.get();
                for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList) {
                    if (this.zae && this.zaf.get() == i) {
                        if (this.zad.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zad(@Nullable Bundle bundle) {
        Preconditions.checkHandlerThread(this.zah, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.zai) {
            try {
                Preconditions.checkState(!this.zag);
                this.zah.removeMessages(1);
                this.zag = true;
                Preconditions.checkState(this.zaa.isEmpty());
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.zac);
                int i = this.zaf.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                    if (!this.zae || !this.zab.isConnected() || this.zaf.get() != i) {
                        break;
                        break;
                        break;
                    } else if (!this.zaa.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zae(int i) {
        Preconditions.checkHandlerThread(this.zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.zah.removeMessages(1);
        synchronized (this.zai) {
            try {
                this.zag = true;
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.zac);
                int i2 = this.zaf.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                    if (!this.zae || this.zaf.get() != i2) {
                        break;
                        break;
                    } else if (this.zac.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            try {
                if (this.zac.contains(connectionCallbacks)) {
                    String.valueOf(connectionCallbacks);
                } else {
                    this.zac.add(connectionCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zab.isConnected()) {
            Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            try {
                if (this.zad.contains(onConnectionFailedListener)) {
                    String.valueOf(onConnectionFailedListener);
                } else {
                    this.zad.add(onConnectionFailedListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            try {
                if (!this.zac.remove(connectionCallbacks)) {
                    String.valueOf(connectionCallbacks);
                } else if (this.zag) {
                    this.zaa.add(connectionCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            try {
                if (!this.zad.remove(onConnectionFailedListener)) {
                    String.valueOf(onConnectionFailedListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zaj(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            zContains = this.zac.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final boolean zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            zContains = this.zad.contains(onConnectionFailedListener);
        }
        return zContains;
    }
}
