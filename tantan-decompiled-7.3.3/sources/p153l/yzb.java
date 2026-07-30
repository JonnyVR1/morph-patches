package p153l;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yzb {

    /* JADX INFO: renamed from: a */
    public final Object f202182a = new Object();

    /* JADX INFO: renamed from: b */
    public final wrl f202183b;

    /* JADX INFO: renamed from: c */
    public final vrl f202184c;

    /* JADX INFO: renamed from: d */
    public final ComponentName f202185d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final PendingIntent f202186e;

    public yzb(wrl wrlVar, vrl vrlVar, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.f202183b = wrlVar;
        this.f202184c = vrlVar;
        this.f202185d = componentName;
        this.f202186e = pendingIntent;
    }

    /* JADX INFO: renamed from: a */
    public final void m218012a(Bundle bundle) {
        PendingIntent pendingIntent = this.f202186e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m218013b(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m218012a(bundle2);
        return bundle2;
    }

    /* JADX INFO: renamed from: c */
    public IBinder m218014c() {
        return this.f202184c.asBinder();
    }

    /* JADX INFO: renamed from: d */
    public ComponentName m218015d() {
        return this.f202185d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public PendingIntent m218016e() {
        return this.f202186e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m218017f(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.f202183b.mo821u2(this.f202184c, uri, m218013b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m218018g(@NonNull String str, @Nullable Bundle bundle) {
        int iMo814T2;
        Bundle bundleM218013b = m218013b(bundle);
        synchronized (this.f202182a) {
            try {
                try {
                    iMo814T2 = this.f202183b.mo814T2(this.f202184c, str, bundleM218013b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMo814T2;
    }

    /* JADX INFO: renamed from: h */
    public boolean m218019h(@NonNull Uri uri) {
        try {
            PendingIntent pendingIntent = this.f202186e;
            wrl wrlVar = this.f202183b;
            return pendingIntent != null ? wrlVar.mo816V2(this.f202184c, uri, m218013b(null)) : wrlVar.mo822z7(this.f202184c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
