package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.kpj0;
import p149l.w4m;
import p149l.x4m;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private x4m.AbstractBinderC21033a mBinder = new BinderC0249a();

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class BinderC0249a extends x4m.AbstractBinderC21033a {
        public BinderC0249a() {
        }

        @Override // p149l.x4m
        /* JADX INFO: renamed from: y2 */
        public void mo1287y2(@Nullable w4m w4mVar) throws RemoteException {
            if (w4mVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.isPermissionRevocationEnabled(new kpj0(w4mVar));
        }
    }

    public abstract void isPermissionRevocationEnabled(@NonNull kpj0 kpj0Var);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
