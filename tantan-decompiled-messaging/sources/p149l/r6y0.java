package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.momo.momortc.MMConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class r6y0 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public volatile boolean f157990a;

    /* JADX INFO: renamed from: b */
    public volatile yqw0 f157991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3y0 f157992c;

    public r6y0(b3y0 b3y0Var) {
        this.f157992c = b3y0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m178107a() {
        this.f157992c.mo15092h();
        Context contextZza = this.f157992c.zza();
        synchronized (this) {
            try {
                if (this.f157990a) {
                    this.f157992c.zzj().m211416E().m123936a("Connection attempt already in progress");
                    return;
                }
                if (this.f157991b != null && (this.f157991b.isConnecting() || this.f157991b.isConnected())) {
                    this.f157992c.zzj().m211416E().m123936a("Already awaiting connection attempt");
                    return;
                }
                this.f157991b = new yqw0(contextZza, Looper.getMainLooper(), this, this);
                this.f157992c.zzj().m211416E().m123936a("Connecting to remote service");
                this.f157990a = true;
                Preconditions.checkNotNull(this.f157991b);
                this.f157991b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m178108b(Intent intent) {
        this.f157992c.mo15092h();
        Context contextZza = this.f157992c.zza();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                boolean z = this.f157990a;
                b3y0 b3y0Var = this.f157992c;
                if (z) {
                    b3y0Var.zzj().m211416E().m123936a("Connection attempt already in progress");
                    return;
                }
                b3y0Var.zzj().m211416E().m123936a("Using local app measurement service");
                this.f157990a = true;
                connectionTracker.bindService(contextZza, intent, this.f157992c.f73267c, MMConstants.ERR_WATERMARK_READ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m178109d() {
        if (this.f157991b != null && (this.f157991b.isConnected() || this.f157991b.isConnecting())) {
            this.f157991b.disconnect();
        }
        this.f157991b = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f157991b);
                this.f157992c.zzl().m146305w(new u6y0(this, this.f157991b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f157991b = null;
                this.f157990a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        xww0 xww0VarM194133z = this.f157992c.f165891a.m194133z();
        if (xww0VarM194133z != null) {
            xww0VarM194133z.m211417F().m123937b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f157990a = false;
            this.f157991b = null;
        }
        this.f157992c.zzl().m146305w(new y6y0(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f157992c.zzj().m211424z().m123936a("Service connection suspended");
        this.f157992c.zzl().m146305w(new a7y0(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f157990a = false;
                this.f157992c.zzj().m211412A().m123936a("Service connected with null binder");
                return;
            }
            cjw0 wkw0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    wkw0Var = iInterfaceQueryLocalInterface instanceof cjw0 ? (cjw0) iInterfaceQueryLocalInterface : new wkw0(iBinder);
                    this.f157992c.zzj().m211416E().m123936a("Bound to IMeasurementService interface");
                } else {
                    this.f157992c.zzj().m211412A().m123937b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f157992c.zzj().m211412A().m123936a("Service connect failed to get IMeasurementService");
            }
            if (wkw0Var == null) {
                this.f157990a = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.f157992c.zza(), this.f157992c.f73267c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f157992c.zzl().m146305w(new p6y0(this, wkw0Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f157992c.zzj().m211424z().m123936a("Service disconnected");
        this.f157992c.zzl().m146305w(new w6y0(this, componentName));
    }
}
