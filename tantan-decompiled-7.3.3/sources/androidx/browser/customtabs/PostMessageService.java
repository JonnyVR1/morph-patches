package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.h3m;
import p153l.vrl;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    private h3m.AbstractBinderC17380a mBinder = new BinderC0188a();

    /* JADX INFO: renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class BinderC0188a extends h3m.AbstractBinderC17380a {
        public BinderC0188a() {
        }

        @Override // p153l.h3m
        /* JADX INFO: renamed from: H5 */
        public void mo823H5(@NonNull vrl vrlVar, @Nullable Bundle bundle) throws RemoteException {
            vrlVar.mo198729e8(bundle);
        }

        @Override // p153l.h3m
        /* JADX INFO: renamed from: x6 */
        public void mo824x6(@NonNull vrl vrlVar, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            vrlVar.mo198728X7(str, bundle);
        }
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
