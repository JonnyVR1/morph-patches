package p149l;

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
public final class kyb {

    /* JADX INFO: renamed from: a */
    public final Object f125263a = new Object();

    /* JADX INFO: renamed from: b */
    public final jpl f125264b;

    /* JADX INFO: renamed from: c */
    public final ipl f125265c;

    /* JADX INFO: renamed from: d */
    public final ComponentName f125266d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final PendingIntent f125267e;

    public kyb(jpl jplVar, ipl iplVar, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.f125264b = jplVar;
        this.f125265c = iplVar;
        this.f125266d = componentName;
        this.f125267e = pendingIntent;
    }

    /* JADX INFO: renamed from: a */
    public final void m147841a(Bundle bundle) {
        PendingIntent pendingIntent = this.f125267e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m147842b(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m147841a(bundle2);
        return bundle2;
    }

    /* JADX INFO: renamed from: c */
    public IBinder m147843c() {
        return this.f125265c.asBinder();
    }

    /* JADX INFO: renamed from: d */
    public ComponentName m147844d() {
        return this.f125266d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public PendingIntent m147845e() {
        return this.f125267e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m147846f(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.f125264b.mo820u2(this.f125265c, uri, m147842b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m147847g(@NonNull String str, @Nullable Bundle bundle) {
        int iMo813T2;
        Bundle bundleM147842b = m147842b(bundle);
        synchronized (this.f125263a) {
            try {
                try {
                    iMo813T2 = this.f125264b.mo813T2(this.f125265c, str, bundleM147842b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iMo813T2;
    }

    /* JADX INFO: renamed from: h */
    public boolean m147848h(@NonNull Uri uri) {
        try {
            PendingIntent pendingIntent = this.f125267e;
            jpl jplVar = this.f125264b;
            return pendingIntent != null ? jplVar.mo815V2(this.f125265c, uri, m147842b(null)) : jplVar.mo821z7(this.f125265c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
