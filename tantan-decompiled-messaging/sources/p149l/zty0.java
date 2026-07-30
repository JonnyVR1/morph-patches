package p149l;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zty0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jts0 f204781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f204782b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n1r0 f204783c;

    public zty0(n1r0 n1r0Var, jts0 jts0Var, boolean z) {
        this.f204781a = jts0Var;
        this.f204782b = z;
        this.f204783c = n1r0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        try {
            this.f204781a.mo132940c("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.f204781a.mo132941h0(arrayList);
            if (this.f204783c.f136710p || this.f204782b) {
                for (Uri uri : arrayList) {
                    if (this.f204783c.m157492H8(uri)) {
                        this.f204783c.f136709o.m182382c(n1r0.m157465Q8(uri, this.f204783c.f136719y, "1").toString(), null);
                    } else {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132458x7)).booleanValue()) {
                            this.f204783c.f136709o.m182382c(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
