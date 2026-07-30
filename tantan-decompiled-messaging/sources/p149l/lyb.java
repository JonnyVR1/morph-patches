package p149l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class lyb {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final ipl f130554a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final PendingIntent f130555b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final fyb f130556c;

    /* JADX INFO: renamed from: l.lyb$a */
    public class C18353a extends fyb {
        public C18353a() {
        }

        @Override // p149l.fyb
        /* JADX INFO: renamed from: a */
        public void mo123731a(@NonNull String str, @Nullable Bundle bundle) {
            try {
                lyb.this.f130554a.mo128693I5(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p149l.fyb
        @NonNull
        /* JADX INFO: renamed from: b */
        public Bundle mo123732b(@NonNull String str, @Nullable Bundle bundle) {
            try {
                return lyb.this.f130554a.mo128694U0(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // p149l.fyb
        /* JADX INFO: renamed from: c */
        public void mo123733c(@Nullable Bundle bundle) {
            try {
                lyb.this.f130554a.mo128697e8(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p149l.fyb
        /* JADX INFO: renamed from: d */
        public void mo123734d(int i, @Nullable Bundle bundle) {
            try {
                lyb.this.f130554a.mo128695V3(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p149l.fyb
        /* JADX INFO: renamed from: e */
        public void mo123735e(@NonNull String str, @Nullable Bundle bundle) {
            try {
                lyb.this.f130554a.mo128696X7(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p149l.fyb
        /* JADX INFO: renamed from: f */
        public void mo123736f(int i, @NonNull Uri uri, boolean z, @Nullable Bundle bundle) {
            try {
                lyb.this.f130554a.mo128698h8(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public lyb(@Nullable ipl iplVar, @Nullable PendingIntent pendingIntent) {
        if (iplVar == null && pendingIntent == null) {
            qkq0.m175383a("CustomTabsSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.f130554a = iplVar;
        this.f130555b = pendingIntent;
        this.f130556c = iplVar == null ? null : new C18353a();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public IBinder m152230a() {
        ipl iplVar = this.f130554a;
        if (iplVar == null) {
            return null;
        }
        return iplVar.asBinder();
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m152231b() {
        ipl iplVar = this.f130554a;
        if (iplVar != null) {
            return iplVar.asBinder();
        }
        qkq0.m175383a("CustomTabSessionToken must have valid binder or pending session");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public PendingIntent m152232c() {
        return this.f130555b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lyb)) {
            return false;
        }
        lyb lybVar = (lyb) obj;
        PendingIntent pendingIntentM152232c = lybVar.m152232c();
        PendingIntent pendingIntent = this.f130555b;
        if ((pendingIntent == null) != (pendingIntentM152232c == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentM152232c) : m152231b().equals(lybVar.m152231b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f130555b;
        return pendingIntent != null ? pendingIntent.hashCode() : m152231b().hashCode();
    }
}
