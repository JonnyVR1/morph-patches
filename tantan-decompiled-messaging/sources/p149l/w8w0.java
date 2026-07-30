package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.internal.ads.zzfrz;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class w8w0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final w9w0 f185275a;

    /* JADX INFO: renamed from: b */
    public final String f185276b;

    /* JADX INFO: renamed from: c */
    public final String f185277c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue f185278d;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f185279e;

    public w8w0(Context context, String str, String str2) {
        this.f185276b = str;
        this.f185277c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f185279e = handlerThread;
        handlerThread.start();
        w9w0 w9w0Var = new w9w0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f185275a = w9w0Var;
        this.f185278d = new LinkedBlockingQueue();
        w9w0Var.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static C2200n m202224a() {
        zpr0 zpr0VarM12983l0 = C2200n.m12983l0();
        zpr0VarM12983l0.m219786t(32768L);
        return (C2200n) zpr0VarM12983l0.m153521m();
    }

    /* JADX INFO: renamed from: b */
    public final C2200n m202225b(int i) {
        C2200n c2200n;
        try {
            c2200n = (C2200n) this.f185278d.poll(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c2200n = null;
        }
        return c2200n == null ? m202224a() : c2200n;
    }

    /* JADX INFO: renamed from: c */
    public final void m202226c() {
        w9w0 w9w0Var = this.f185275a;
        if (w9w0Var != null) {
            if (w9w0Var.isConnected() || this.f185275a.isConnecting()) {
                this.f185275a.disconnect();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final eaw0 m202227d() {
        try {
            return this.f185275a.m202354c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        eaw0 eaw0VarM202227d = m202227d();
        if (eaw0VarM202227d != null) {
            try {
                try {
                    this.f185278d.put(eaw0VarM202227d.m115438m4(new zzfrz(this.f185276b, this.f185277c)).m13749F());
                } catch (Throwable unused) {
                    this.f185278d.put(m202224a());
                }
            } catch (InterruptedException unused2) {
            } finally {
                m202226c();
                this.f185279e.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.f185278d.put(m202224a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.f185278d.put(m202224a());
        } catch (InterruptedException unused) {
        }
    }
}
