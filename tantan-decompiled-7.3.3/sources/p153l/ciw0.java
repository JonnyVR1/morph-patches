package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.internal.ads.zzfrz;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class ciw0 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final cjw0 f82080a;

    /* JADX INFO: renamed from: b */
    public final String f82081b;

    /* JADX INFO: renamed from: c */
    public final String f82082c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue f82083d;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f82084e;

    public ciw0(Context context, String str, String str2) {
        this.f82081b = str;
        this.f82082c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f82084e = handlerThread;
        handlerThread.start();
        cjw0 cjw0Var = new cjw0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f82080a = cjw0Var;
        this.f82083d = new LinkedBlockingQueue();
        cjw0Var.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static C2223n m110028a() {
        fzr0 fzr0VarM13037l0 = C2223n.m13037l0();
        fzr0VarM13037l0.m128321t(32768L);
        return (C2223n) fzr0VarM13037l0.m185950m();
    }

    /* JADX INFO: renamed from: b */
    public final C2223n m110029b(int i) {
        C2223n c2223n;
        try {
            c2223n = (C2223n) this.f82083d.poll(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c2223n = null;
        }
        return c2223n == null ? m110028a() : c2223n;
    }

    /* JADX INFO: renamed from: c */
    public final void m110030c() {
        cjw0 cjw0Var = this.f82080a;
        if (cjw0Var != null) {
            if (cjw0Var.isConnected() || this.f82080a.isConnecting()) {
                this.f82080a.disconnect();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final kjw0 m110031d() {
        try {
            return this.f82080a.m110287c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        kjw0 kjw0VarM110031d = m110031d();
        if (kjw0VarM110031d != null) {
            try {
                try {
                    this.f82083d.put(kjw0VarM110031d.m150075m4(new zzfrz(this.f82081b, this.f82082c)).m13803F());
                } catch (Throwable unused) {
                    this.f82083d.put(m110028a());
                }
            } catch (InterruptedException unused2) {
            } finally {
                m110030c();
                this.f82084e.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.f82083d.put(m110028a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.f82083d.put(m110028a());
        } catch (InterruptedException unused) {
        }
    }
}
