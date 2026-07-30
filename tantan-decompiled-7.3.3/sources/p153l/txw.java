package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class txw {

    /* JADX INFO: renamed from: a */
    public final axy0 f176615a;

    public txw(axy0 axy0Var) {
        this.f176615a = (axy0) Preconditions.checkNotNull(axy0Var);
    }

    /* JADX INFO: renamed from: a */
    public final String m193538a() {
        try {
            return this.f176615a.getId();
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m193539b() {
        try {
            this.f176615a.remove();
        } catch (RemoteException e) {
            v6k.m200076a(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof txw)) {
            return false;
        }
        try {
            return this.f176615a.mo100858u3(((txw) obj).f176615a);
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            return this.f176615a.zzj();
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return 0;
        }
    }
}
