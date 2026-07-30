package p153l;

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
public final class xfy0 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public volatile boolean f194119a;

    /* JADX INFO: renamed from: b */
    public volatile e0x0 f194120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hcy0 f194121c;

    public xfy0(hcy0 hcy0Var) {
        this.f194121c = hcy0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m210867a() {
        this.f194121c.mo15146h();
        Context contextZza = this.f194121c.zza();
        synchronized (this) {
            try {
                if (this.f194119a) {
                    this.f194121c.zzj().m114562E().m153300a("Connection attempt already in progress");
                    return;
                }
                if (this.f194120b != null && (this.f194120b.isConnecting() || this.f194120b.isConnected())) {
                    this.f194121c.zzj().m114562E().m153300a("Already awaiting connection attempt");
                    return;
                }
                this.f194120b = new e0x0(contextZza, Looper.getMainLooper(), this, this);
                this.f194121c.zzj().m114562E().m153300a("Connecting to remote service");
                this.f194119a = true;
                Preconditions.checkNotNull(this.f194120b);
                this.f194120b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m210868b(Intent intent) {
        this.f194121c.mo15146h();
        Context contextZza = this.f194121c.zza();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                boolean z = this.f194119a;
                hcy0 hcy0Var = this.f194121c;
                if (z) {
                    hcy0Var.zzj().m114562E().m153300a("Connection attempt already in progress");
                    return;
                }
                hcy0Var.zzj().m114562E().m153300a("Using local app measurement service");
                this.f194119a = true;
                connectionTracker.bindService(contextZza, intent, this.f194121c.f108758c, MMConstants.ERR_WATERMARK_READ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m210869d() {
        if (this.f194120b != null && (this.f194120b.isConnected() || this.f194120b.isConnecting())) {
            this.f194120b.disconnect();
        }
        this.f194120b = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f194120b);
                this.f194121c.zzl().m177841w(new agy0(this, this.f194120b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f194120b = null;
                this.f194119a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        d6x0 d6x0VarM100313z = this.f194121c.f202159a.m100313z();
        if (d6x0VarM100313z != null) {
            d6x0VarM100313z.m114563F().m153301b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f194119a = false;
            this.f194120b = null;
        }
        this.f194121c.zzl().m177841w(new egy0(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f194121c.zzj().m114570z().m153300a("Service connection suspended");
        this.f194121c.zzl().m177841w(new ggy0(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f194119a = false;
                this.f194121c.zzj().m114558A().m153300a("Service connected with null binder");
                return;
            }
            isw0 cuw0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    cuw0Var = iInterfaceQueryLocalInterface instanceof isw0 ? (isw0) iInterfaceQueryLocalInterface : new cuw0(iBinder);
                    this.f194121c.zzj().m114562E().m153300a("Bound to IMeasurementService interface");
                } else {
                    this.f194121c.zzj().m114558A().m153301b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f194121c.zzj().m114558A().m153300a("Service connect failed to get IMeasurementService");
            }
            if (cuw0Var == null) {
                this.f194119a = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.f194121c.zza(), this.f194121c.f108758c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f194121c.zzl().m177841w(new vfy0(this, cuw0Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f194121c.zzj().m114570z().m153300a("Service disconnected");
        this.f194121c.zzl().m177841w(new cgy0(this, componentName));
    }
}
