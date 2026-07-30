package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class rnt0 extends ont0 {

    /* JADX INFO: renamed from: j */
    public final Context f160315j;

    /* JADX INFO: renamed from: k */
    public final View f160316k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final q9t0 f160317l;

    /* JADX INFO: renamed from: m */
    public final lxv0 f160318m;

    /* JADX INFO: renamed from: n */
    public final cqt0 f160319n;

    /* JADX INFO: renamed from: o */
    public final zcu0 f160320o;

    /* JADX INFO: renamed from: p */
    public final c7u0 f160321p;

    /* JADX INFO: renamed from: q */
    public final egx0 f160322q;

    /* JADX INFO: renamed from: r */
    public final Executor f160323r;

    /* JADX INFO: renamed from: s */
    public zzq f160324s;

    public rnt0(dqt0 dqt0Var, Context context, lxv0 lxv0Var, View view, @Nullable q9t0 q9t0Var, cqt0 cqt0Var, zcu0 zcu0Var, c7u0 c7u0Var, egx0 egx0Var, Executor executor) {
        super(dqt0Var);
        this.f160315j = context;
        this.f160316k = view;
        this.f160317l = q9t0Var;
        this.f160318m = lxv0Var;
        this.f160319n = cqt0Var;
        this.f160320o = zcu0Var;
        this.f160321p = c7u0Var;
        this.f160322q = egx0Var;
        this.f160323r = executor;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m180159p(rnt0 rnt0Var) {
        zcu0 zcu0Var = rnt0Var.f160320o;
        if (zcu0Var.m218106e() == null) {
            return;
        }
        try {
            zcu0Var.m218106e().mo145680F4((ips0) rnt0Var.f160322q.zzb(), s050.m181848Y2(rnt0Var.f160315j));
        } catch (RemoteException e) {
            x2t0.m206867e("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // p149l.eqt0
    /* JADX INFO: renamed from: c */
    public final void mo106179c() {
        this.f160323r.execute(new Runnable() { // from class: l.qnt0
            @Override // java.lang.Runnable
            public final void run() {
                rnt0.m180159p(this.f155493a);
            }
        });
        super.mo106179c();
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: i */
    public final int mo117677i() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131948I7)).booleanValue() && this.f92845b.f125198h0) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131960J7)).booleanValue()) {
                return 0;
            }
        }
        return this.f92844a.f183478b.f178773b.f141056c;
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: j */
    public final View mo117678j() {
        return this.f160316k;
    }

    @Override // p149l.ont0
    @Nullable
    /* JADX INFO: renamed from: k */
    public final fgu0 mo117679k() {
        try {
            return this.f160319n.zza();
        } catch (zzfho unused) {
            return null;
        }
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: l */
    public final lxv0 mo117680l() {
        zzq zzqVar = this.f160324s;
        if (zzqVar != null) {
            return oyv0.m166724b(zzqVar);
        }
        kxv0 kxv0Var = this.f92845b;
        if (kxv0Var.f125190d0) {
            for (String str : kxv0Var.f125183a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f160316k;
            return new lxv0(view.getWidth(), view.getHeight(), false);
        }
        return (lxv0) this.f92845b.f125219s.get(0);
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: m */
    public final lxv0 mo117681m() {
        return this.f160318m;
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: n */
    public final void mo117682n() {
        this.f160321p.zza();
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: o */
    public final void mo117683o(ViewGroup viewGroup, zzq zzqVar) {
        q9t0 q9t0Var;
        if (viewGroup == null || (q9t0Var = this.f160317l) == null) {
            return;
        }
        q9t0Var.mo13656G(rbt0.m178694c(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.f160324s = zzqVar;
    }
}
