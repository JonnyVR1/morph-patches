package p153l;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class f3z0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p2t0 f97017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f97018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tar0 f97019c;

    public f3z0(tar0 tar0Var, p2t0 p2t0Var, boolean z) {
        this.f97017a = p2t0Var;
        this.f97018b = z;
        this.f97019c = tar0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        try {
            this.f97017a.mo161254c("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.f97017a.mo161255h0(arrayList);
            if (this.f97019c.f172787p || this.f97018b) {
                for (Uri uri : arrayList) {
                    if (this.f97019c.m189947H8(uri)) {
                        this.f97019c.f172786o.m215479c(tar0.m189922Q8(uri, this.f97019c.f172796y, "1").toString(), null);
                    } else {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168529x7)).booleanValue()) {
                            this.f97019c.f172786o.m215479c(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
