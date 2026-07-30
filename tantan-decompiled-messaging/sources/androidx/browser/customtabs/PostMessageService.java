package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.ipl;
import p149l.n0m;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    private n0m.AbstractBinderC18600a mBinder = new BinderC0187a();

    /* JADX INFO: renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class BinderC0187a extends n0m.AbstractBinderC18600a {
        public BinderC0187a() {
        }

        @Override // p149l.n0m
        /* JADX INFO: renamed from: H5 */
        public void mo822H5(@NonNull ipl iplVar, @Nullable Bundle bundle) throws RemoteException {
            iplVar.mo128697e8(bundle);
        }

        @Override // p149l.n0m
        /* JADX INFO: renamed from: x6 */
        public void mo823x6(@NonNull ipl iplVar, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            iplVar.mo128696X7(str, bundle);
        }
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
