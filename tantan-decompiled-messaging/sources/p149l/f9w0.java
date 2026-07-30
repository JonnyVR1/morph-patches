package p149l;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.C2274w1;
import com.google.android.gms.internal.ads.zzfrw;

/* JADX INFO: loaded from: classes6.dex */
public final class f9w0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final w9w0 f96537a;

    /* JADX INFO: renamed from: b */
    public final C2274w1 f96538b;

    /* JADX INFO: renamed from: c */
    public final Object f96539c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f96540d = false;

    /* JADX INFO: renamed from: e */
    public boolean f96541e = false;

    public f9w0(@NonNull Context context, @NonNull Looper looper, @NonNull C2274w1 c2274w1) {
        this.f96538b = c2274w1;
        this.f96537a = new w9w0(context, looper, this, this, 12800000);
    }

    /* JADX INFO: renamed from: b */
    private final void m120130b() {
        synchronized (this.f96539c) {
            try {
                if (this.f96537a.isConnected() || this.f96537a.isConnecting()) {
                    this.f96537a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m120131a() {
        synchronized (this.f96539c) {
            try {
                if (!this.f96540d) {
                    this.f96540d = true;
                    this.f96537a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f96539c) {
            try {
                if (this.f96541e) {
                    return;
                }
                this.f96541e = true;
                try {
                    this.f96537a.m202354c().m115437M6(new zzfrw(this.f96538b.m12744h()));
                } catch (Exception unused) {
                } finally {
                    m120130b();
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
