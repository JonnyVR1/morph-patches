package p153l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes6.dex */
public final class qqx0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final String f159054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tnx0 f159055b;

    public qqx0(tnx0 tnx0Var, String str) {
        this.f159055b = tnx0Var;
        this.f159054a = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f159055b.f175337a.zzj().m114563F().m153300a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            h4t0 h4t0VarM113902P2 = d3t0.m113902P2(iBinder);
            tnx0 tnx0Var = this.f159055b;
            if (h4t0VarM113902P2 == null) {
                tnx0Var.f175337a.zzj().m114563F().m153300a("Install Referrer Service implementation was not found");
            } else {
                tnx0Var.f175337a.zzj().m114562E().m153300a("Install Referrer Service connected");
                this.f159055b.f175337a.zzl().m177841w(new ppx0(this, h4t0VarM113902P2, this));
            }
        } catch (RuntimeException e) {
            this.f159055b.f175337a.zzj().m114563F().m153301b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f159055b.f175337a.zzj().m114562E().m153300a("Install Referrer Service disconnected");
    }
}
