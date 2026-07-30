package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.m7m;
import p153l.n7m;
import p153l.nyj0;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private n7m.AbstractBinderC18816a mBinder = new BinderC0250a();

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class BinderC0250a extends n7m.AbstractBinderC18816a {
        public BinderC0250a() {
        }

        @Override // p153l.n7m
        /* JADX INFO: renamed from: y2 */
        public void mo1288y2(@Nullable m7m m7mVar) throws RemoteException {
            if (m7mVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.isPermissionRevocationEnabled(new nyj0(m7mVar));
        }
    }

    public abstract void isPermissionRevocationEnabled(@NonNull nyj0 nyj0Var);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
