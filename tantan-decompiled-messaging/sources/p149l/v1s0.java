package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

/* JADX INFO: loaded from: classes6.dex */
public final class v1s0 {

    /* JADX INFO: renamed from: a */
    public ips0 f179272a;

    /* JADX INFO: renamed from: b */
    public final Context f179273b;

    /* JADX INFO: renamed from: c */
    public final String f179274c;

    /* JADX INFO: renamed from: d */
    public final rou0 f179275d;

    /* JADX INFO: renamed from: e */
    public final int f179276e;

    /* JADX INFO: renamed from: f */
    public final uw0.AbstractC20525a f179277f;

    /* JADX INFO: renamed from: g */
    public final kns0 f179278g = new kns0();

    /* JADX INFO: renamed from: h */
    public final cfy0 f179279h = cfy0.f80684a;

    public v1s0(Context context, String str, rou0 rou0Var, int i, uw0.AbstractC20525a abstractC20525a) {
        this.f179273b = context;
        this.f179274c = str;
        this.f179275d = rou0Var;
        this.f179276e = i;
        this.f179277f = abstractC20525a;
    }

    /* JADX INFO: renamed from: a */
    public final void m196650a() {
        try {
            ips0 ips0VarM156442d = exr0.m118702a().m156442d(this.f179273b, zzq.m12252F(), this.f179274c, this.f179278g);
            this.f179272a = ips0VarM156442d;
            if (ips0VarM156442d != null) {
                if (this.f179276e != 3) {
                    this.f179272a.mo137581I1(new zzw(this.f179276e));
                }
                this.f179272a.mo137574A5(new i1s0(this.f179277f, this.f179274c));
                this.f179272a.mo137591f2(this.f179279h.m106615a(this.f179273b, this.f179275d));
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }
}
