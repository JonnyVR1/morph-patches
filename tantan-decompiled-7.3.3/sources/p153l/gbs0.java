package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class gbs0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hbs0 f103489a;

    public gbs0(hbs0 hbs0Var) {
        this.f103489a = hbs0Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f103489a.f108645c) {
            try {
                this.f103489a.f108648f = null;
                hbs0 hbs0Var = this.f103489a;
                if (hbs0Var.f108646d != null) {
                    hbs0Var.f108646d = null;
                }
                this.f103489a.f108645c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
