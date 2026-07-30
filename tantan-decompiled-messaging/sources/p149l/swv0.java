package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcab;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class swv0 implements gdv0 {

    /* JADX INFO: renamed from: a */
    public final Context f166748a;

    /* JADX INFO: renamed from: b */
    public final Executor f166749b;

    /* JADX INFO: renamed from: c */
    public final xbt0 f166750c;

    /* JADX INFO: renamed from: d */
    public final iwv0 f166751d;

    /* JADX INFO: renamed from: e */
    public final suv0 f166752e;

    /* JADX INFO: renamed from: f */
    public final wxv0 f166753f;

    /* JADX INFO: renamed from: g */
    public final b5w0 f166754g;

    /* JADX INFO: renamed from: h */
    public final gyv0 f166755h;

    /* JADX INFO: renamed from: i */
    public gnr f166756i;

    public swv0(Context context, Executor executor, xbt0 xbt0Var, suv0 suv0Var, iwv0 iwv0Var, gyv0 gyv0Var, wxv0 wxv0Var) {
        this.f166748a = context;
        this.f166749b = executor;
        this.f166750c = xbt0Var;
        this.f166752e = suv0Var;
        this.f166751d = iwv0Var;
        this.f166755h = gyv0Var;
        this.f166753f = wxv0Var;
        this.f166754g = xbt0Var.mo135792D();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    @Override // p149l.gdv0
    /* JADX INFO: renamed from: a */
    public final boolean mo113608a(zzl zzlVar, String str, edv0 edv0Var, fdv0 fdv0Var) throws RemoteException {
        w4w0 w4w0Var;
        zzcab zzcabVar = new zzcab(zzlVar, str);
        if (zzcabVar.zzb == null) {
            x2t0.m206866d("Ad unit ID should not be null for rewarded video ad.");
            this.f166749b.execute(new Runnable() { // from class: l.lwv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130312a.m186384h();
                }
            });
            return false;
        }
        gnr gnrVar = this.f166756i;
        if (gnrVar != null && !gnrVar.isDone()) {
            return false;
        }
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            suv0 suv0Var = this.f166752e;
            if (suv0Var.zzd() != null) {
                w4w0 w4w0VarZzh = ((jju0) suv0Var.zzd()).zzh();
                w4w0VarZzh.m201590h(5);
                w4w0VarZzh.m201584b(zzcabVar.zza.zzp);
                w4w0Var = w4w0VarZzh;
            } else {
                w4w0Var = null;
            }
        } else {
            w4w0Var = null;
        }
        kzv0.m147956a(this.f166748a, zzcabVar.zza.zzf);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && zzcabVar.zza.zzf) {
            this.f166750c.mo135805p().m113352n(true);
        }
        gyv0 gyv0Var = this.f166755h;
        gyv0Var.m128758J(zzcabVar.zzb);
        gyv0Var.m128757I(zzq.m12254I());
        gyv0Var.m128770e(zzcabVar.zza);
        Context context = this.f166748a;
        iyv0 iyv0VarM128772g = gyv0Var.m128772g();
        l4w0 l4w0VarM144515b = k4w0.m144515b(context, v4w0.m197070f(iyv0VarM128772g), 5, zzcabVar.zza);
        rwv0 rwv0Var = new rwv0(null);
        rwv0Var.f161381a = iyv0VarM128772g;
        gnr gnrVarMo104000a = this.f166752e.mo104000a(new tuv0(rwv0Var, null), new ruv0() { // from class: l.mwv0
            @Override // p149l.ruv0
            /* JADX INFO: renamed from: a */
            public final iwt0 mo156774a(quv0 quv0Var) {
                return this.f136094a.m186386j(quv0Var);
            }
        }, null);
        this.f166756i = gnrVarMo104000a;
        jmw0.m142245r(gnrVarMo104000a, new pwv0(this, fdv0Var, w4w0Var, l4w0VarM144515b, rwv0Var), this.f166749b);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m186384h() {
        this.f166751d.mo97693u(pzv0.m172256d(6, null, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m186385i(int i) {
        this.f166755h.m128754F().m171957a(i);
    }

    /* JADX INFO: renamed from: j */
    public final iju0 m186386j(quv0 quv0Var) {
        iju0 iju0VarMo135803n = this.f166750c.mo135803n();
        kwt0 kwt0Var = new kwt0();
        kwt0Var.m147644e(this.f166748a);
        kwt0Var.m147648i(((rwv0) quv0Var).f161381a);
        kwt0Var.m147647h(this.f166753f);
        iju0VarMo135803n.mo136751d(kwt0Var.m147649j());
        iju0VarMo135803n.mo136750a(new f4u0().m119454q());
        return iju0VarMo135803n;
    }

    @Override // p149l.gdv0
    public final boolean zza() {
        throw null;
    }
}
