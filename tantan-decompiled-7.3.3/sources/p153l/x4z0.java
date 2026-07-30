package p153l;

import android.net.Uri;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class x4z0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p2t0 f192446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f192447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tar0 f192448c;

    public x4z0(tar0 tar0Var, p2t0 p2t0Var, boolean z) {
        this.f192446a = p2t0Var;
        this.f192447b = z;
        this.f192448c = tar0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        try {
            this.f192446a.mo161254c("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            tar0.m189941x8(this.f192448c, list);
            this.f192446a.mo161255h0(list);
            if (this.f192448c.f172788q || this.f192447b) {
                for (Uri uri : list) {
                    if (this.f192448c.m189946G8(uri)) {
                        this.f192448c.f172786o.m215479c(tar0.m189922Q8(uri, this.f192448c.f172796y, "1").toString(), null);
                    } else {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168529x7)).booleanValue()) {
                            this.f192448c.f172786o.m215479c(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            dct0.m115296e("", e);
        }
    }
}
