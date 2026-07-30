package p153l;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.C2297w1;
import com.google.android.gms.internal.ads.zzfrw;

/* JADX INFO: loaded from: classes6.dex */
public final class liw0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final cjw0 f132268a;

    /* JADX INFO: renamed from: b */
    public final C2297w1 f132269b;

    /* JADX INFO: renamed from: c */
    public final Object f132270c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f132271d = false;

    /* JADX INFO: renamed from: e */
    public boolean f132272e = false;

    public liw0(@NonNull Context context, @NonNull Looper looper, @NonNull C2297w1 c2297w1) {
        this.f132269b = c2297w1;
        this.f132268a = new cjw0(context, looper, this, this, 12800000);
    }

    /* JADX INFO: renamed from: b */
    private final void m154421b() {
        synchronized (this.f132270c) {
            try {
                if (this.f132268a.isConnected() || this.f132268a.isConnecting()) {
                    this.f132268a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m154422a() {
        synchronized (this.f132270c) {
            try {
                if (!this.f132271d) {
                    this.f132271d = true;
                    this.f132268a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f132270c) {
            try {
                if (this.f132272e) {
                    return;
                }
                this.f132272e = true;
                try {
                    this.f132268a.m110287c().m150074M6(new zzfrw(this.f132269b.m12798h()));
                } catch (Exception unused) {
                } finally {
                    m154421b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
