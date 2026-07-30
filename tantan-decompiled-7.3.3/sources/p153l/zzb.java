package p153l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class zzb {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final vrl f206687a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final PendingIntent f206688b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final tzb f206689c;

    /* JADX INFO: renamed from: l.zzb$a */
    public class C21945a extends tzb {
        public C21945a() {
        }

        @Override // p153l.tzb
        /* JADX INFO: renamed from: a */
        public void mo109941a(@NonNull String str, @Nullable Bundle bundle) {
            try {
                zzb.this.f206687a.mo198725I5(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p153l.tzb
        @NonNull
        /* JADX INFO: renamed from: b */
        public Bundle mo109942b(@NonNull String str, @Nullable Bundle bundle) {
            try {
                return zzb.this.f206687a.mo198726U0(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // p153l.tzb
        /* JADX INFO: renamed from: c */
        public void mo109943c(@Nullable Bundle bundle) {
            try {
                zzb.this.f206687a.mo198729e8(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p153l.tzb
        /* JADX INFO: renamed from: d */
        public void mo109944d(int i, @Nullable Bundle bundle) {
            try {
                zzb.this.f206687a.mo198727V3(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p153l.tzb
        /* JADX INFO: renamed from: e */
        public void mo109945e(@NonNull String str, @Nullable Bundle bundle) {
            try {
                zzb.this.f206687a.mo198728X7(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // p153l.tzb
        /* JADX INFO: renamed from: f */
        public void mo109946f(int i, @NonNull Uri uri, boolean z, @Nullable Bundle bundle) {
            try {
                zzb.this.f206687a.mo198730h8(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public zzb(@Nullable vrl vrlVar, @Nullable PendingIntent pendingIntent) {
        if (vrlVar == null && pendingIntent == null) {
            wtq0.m207906a("CustomTabsSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.f206687a = vrlVar;
        this.f206688b = pendingIntent;
        this.f206689c = vrlVar == null ? null : new C21945a();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public IBinder m222242a() {
        vrl vrlVar = this.f206687a;
        if (vrlVar == null) {
            return null;
        }
        return vrlVar.asBinder();
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m222243b() {
        vrl vrlVar = this.f206687a;
        if (vrlVar != null) {
            return vrlVar.asBinder();
        }
        wtq0.m207906a("CustomTabSessionToken must have valid binder or pending session");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public PendingIntent m222244c() {
        return this.f206688b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        PendingIntent pendingIntentM222244c = zzbVar.m222244c();
        PendingIntent pendingIntent = this.f206688b;
        if ((pendingIntent == null) != (pendingIntentM222244c == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentM222244c) : m222243b().equals(zzbVar.m222243b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f206688b;
        return pendingIntent != null ? pendingIntent.hashCode() : m222243b().hashCode();
    }
}
