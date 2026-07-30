package p153l;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class fbs0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hbs0 f98143a;

    public fbs0(hbs0 hbs0Var) {
        this.f98143a = hbs0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f98143a.f108645c) {
            try {
                hbs0 hbs0Var = this.f98143a;
                if (hbs0Var.f108646d != null) {
                    hbs0Var.f108648f = hbs0Var.f108646d.m180760d();
                }
            } catch (DeadObjectException e) {
                dct0.m115296e("Unable to obtain a cache service instance.", e);
                hbs0.m134419h(this.f98143a);
            }
            this.f98143a.f108645c.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.f98143a.f108645c) {
            this.f98143a.f108648f = null;
            this.f98143a.f108645c.notifyAll();
        }
    }
}
