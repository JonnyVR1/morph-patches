package p149l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes6.dex */
public final class khx0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final String f123237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nex0 f123238b;

    public khx0(nex0 nex0Var, String str) {
        this.f123238b = nex0Var;
        this.f123237a = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f123238b.f138669a.zzj().m211417F().m123936a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            bvs0 bvs0VarM211024P2 = xts0.m211024P2(iBinder);
            nex0 nex0Var = this.f123238b;
            if (bvs0VarM211024P2 == null) {
                nex0Var.f138669a.zzj().m211417F().m123936a("Install Referrer Service implementation was not found");
            } else {
                nex0Var.f138669a.zzj().m211416E().m123936a("Install Referrer Service connected");
                this.f123238b.f138669a.zzl().m146305w(new jgx0(this, bvs0VarM211024P2, this));
            }
        } catch (RuntimeException e) {
            this.f123238b.f138669a.zzj().m211417F().m123937b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f123238b.f138669a.zzj().m211416E().m123936a("Install Referrer Service disconnected");
    }
}
