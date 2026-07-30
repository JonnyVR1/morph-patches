package p153l;

import com.google.android.gms.internal.ads.zzflg;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zvu0 implements mcw0 {

    /* JADX INFO: renamed from: a */
    public final Map f206288a;

    /* JADX INFO: renamed from: b */
    public final fcs0 f206289b;

    public zvu0(fcs0 fcs0Var, Map map) {
        this.f206288a = map;
        this.f206289b = fcs0Var;
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: D */
    public final void mo100841D(zzflg zzflgVar, String str, Throwable th) {
        if (this.f206288a.containsKey(zzflgVar)) {
            this.f206289b.m125047c(((yvu0) this.f206288a.get(zzflgVar)).f201763c);
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: b */
    public final void mo100843b(zzflg zzflgVar, String str) {
        if (this.f206288a.containsKey(zzflgVar)) {
            this.f206289b.m125047c(((yvu0) this.f206288a.get(zzflgVar)).f201761a);
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: k */
    public final void mo100844k(zzflg zzflgVar, String str) {
        if (this.f206288a.containsKey(zzflgVar)) {
            this.f206289b.m125047c(((yvu0) this.f206288a.get(zzflgVar)).f201762b);
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: z */
    public final void mo100845z(zzflg zzflgVar, String str) {
    }
}
