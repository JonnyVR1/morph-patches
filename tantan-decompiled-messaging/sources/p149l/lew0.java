package p149l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class lew0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mew0 f127768a;

    public /* synthetic */ lew0(mew0 mew0Var, kew0 kew0Var) {
        this.f127768a = mew0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f127768a.f133505b.m202813c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f127768a.m154332c().post(new iew0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f127768a.f133505b.m202813c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f127768a.m154332c().post(new jew0(this));
    }
}
