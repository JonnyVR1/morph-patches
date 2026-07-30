package p149l;

import android.net.Uri;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rvy0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jts0 f161288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f161289b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n1r0 f161290c;

    public rvy0(n1r0 n1r0Var, jts0 jts0Var, boolean z) {
        this.f161288a = jts0Var;
        this.f161289b = z;
        this.f161290c = n1r0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        try {
            this.f161288a.mo132940c("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            n1r0.m157484x8(this.f161290c, list);
            this.f161288a.mo132941h0(list);
            if (this.f161290c.f136711q || this.f161289b) {
                for (Uri uri : list) {
                    if (this.f161290c.m157491G8(uri)) {
                        this.f161290c.f136709o.m182382c(n1r0.m157465Q8(uri, this.f161290c.f136719y, "1").toString(), null);
                    } else {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132458x7)).booleanValue()) {
                            this.f161290c.f136709o.m182382c(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
