package p153l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class rnw0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ snw0 f164132a;

    public /* synthetic */ rnw0(snw0 snw0Var, qnw0 qnw0Var) {
        this.f164132a = snw0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f164132a.f169776b.m111556c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f164132a.m187021c().post(new onw0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f164132a.f169776b.m111556c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f164132a.m187021c().post(new pnw0(this));
    }
}
