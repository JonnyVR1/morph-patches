package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ajj0 {

    /* JADX INFO: renamed from: a */
    public final v4m f70118a;

    public ajj0(v4m v4mVar) {
        this.f70118a = v4mVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m96975a(boolean z) {
        try {
            this.f70118a.mo196999E5(z);
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m96976b(boolean z) {
        try {
            this.f70118a.mo197000m7(z);
        } catch (RemoteException e) {
            d4k.m109990a(e);
        }
    }
}
