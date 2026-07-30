package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class uuw {

    /* JADX INFO: renamed from: a */
    public final uny0 f178463a;

    public uuw(uny0 uny0Var) {
        this.f178463a = (uny0) Preconditions.checkNotNull(uny0Var);
    }

    /* JADX INFO: renamed from: a */
    public final String m196037a() {
        try {
            return this.f178463a.getId();
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m196038b() {
        try {
            this.f178463a.remove();
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uuw)) {
            return false;
        }
        try {
            return this.f178463a.mo165509u3(((uuw) obj).f178463a);
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            return this.f178463a.zzj();
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return 0;
        }
    }
}
