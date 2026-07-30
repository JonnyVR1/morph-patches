package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class xwt0 extends uwt0 {

    /* JADX INFO: renamed from: j */
    public final Context f196546j;

    /* JADX INFO: renamed from: k */
    public final View f196547k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final wit0 f196548l;

    /* JADX INFO: renamed from: m */
    public final r6w0 f196549m;

    /* JADX INFO: renamed from: n */
    public final izt0 f196550n;

    /* JADX INFO: renamed from: o */
    public final fmu0 f196551o;

    /* JADX INFO: renamed from: p */
    public final igu0 f196552p;

    /* JADX INFO: renamed from: q */
    public final kpx0 f196553q;

    /* JADX INFO: renamed from: r */
    public final Executor f196554r;

    /* JADX INFO: renamed from: s */
    public zzq f196555s;

    public xwt0(jzt0 jzt0Var, Context context, r6w0 r6w0Var, View view, @Nullable wit0 wit0Var, izt0 izt0Var, fmu0 fmu0Var, igu0 igu0Var, kpx0 kpx0Var, Executor executor) {
        super(jzt0Var);
        this.f196546j = context;
        this.f196547k = view;
        this.f196548l = wit0Var;
        this.f196549m = r6w0Var;
        this.f196550n = izt0Var;
        this.f196551o = fmu0Var;
        this.f196552p = igu0Var;
        this.f196553q = kpx0Var;
        this.f196554r = executor;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m213439p(xwt0 xwt0Var) {
        fmu0 fmu0Var = xwt0Var.f196551o;
        if (fmu0Var.m126329e() == null) {
            return;
        }
        try {
            fmu0Var.m126329e().mo177143F4((oys0) xwt0Var.f196553q.zzb(), h950.m134038Y2(xwt0Var.f196546j));
        } catch (RemoteException e) {
            dct0.m115296e("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // p153l.kzt0
    /* JADX INFO: renamed from: c */
    public final void mo140700c() {
        this.f196554r.execute(new Runnable() { // from class: l.wwt0
            @Override // java.lang.Runnable
            public final void run() {
                xwt0.m213439p(this.f191329a);
            }
        });
        super.mo140700c();
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: i */
    public final int mo152133i() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168019I7)).booleanValue() && this.f129454b.f155888h0) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168031J7)).booleanValue()) {
                return 0;
            }
        }
        return this.f129453a.f75343b.f68854b.f172369c;
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: j */
    public final View mo152134j() {
        return this.f196547k;
    }

    @Override // p153l.uwt0
    @Nullable
    /* JADX INFO: renamed from: k */
    public final lpu0 mo152135k() {
        try {
            return this.f196550n.zza();
        } catch (zzfho unused) {
            return null;
        }
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: l */
    public final r6w0 mo152136l() {
        zzq zzqVar = this.f196555s;
        if (zzqVar != null) {
            return u7w0.m194893b(zzqVar);
        }
        q6w0 q6w0Var = this.f129454b;
        if (q6w0Var.f155880d0) {
            for (String str : q6w0Var.f155873a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f196547k;
            return new r6w0(view.getWidth(), view.getHeight(), false);
        }
        return (r6w0) this.f129454b.f155909s.get(0);
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: m */
    public final r6w0 mo152137m() {
        return this.f196549m;
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: n */
    public final void mo152138n() {
        this.f196552p.zza();
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: o */
    public final void mo152139o(ViewGroup viewGroup, zzq zzqVar) {
        wit0 wit0Var;
        if (viewGroup == null || (wit0Var = this.f196548l) == null) {
            return;
        }
        wit0Var.mo13710G(xkt0.m211417c(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.f196555s = zzqVar;
    }
}
