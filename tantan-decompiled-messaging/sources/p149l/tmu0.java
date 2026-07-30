package p149l;

import com.google.android.gms.internal.ads.zzflg;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tmu0 implements g3w0 {

    /* JADX INFO: renamed from: a */
    public final Map f171176a;

    /* JADX INFO: renamed from: b */
    public final z2s0 f171177b;

    public tmu0(z2s0 z2s0Var, Map map) {
        this.f171176a = map;
        this.f171177b = z2s0Var;
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: D */
    public final void mo94578D(zzflg zzflgVar, String str, Throwable th) {
        if (this.f171176a.containsKey(zzflgVar)) {
            this.f171177b.m216994c(((smu0) this.f171176a.get(zzflgVar)).f165383c);
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: b */
    public final void mo94579b(zzflg zzflgVar, String str) {
        if (this.f171176a.containsKey(zzflgVar)) {
            this.f171177b.m216994c(((smu0) this.f171176a.get(zzflgVar)).f165381a);
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: k */
    public final void mo94580k(zzflg zzflgVar, String str) {
        if (this.f171176a.containsKey(zzflgVar)) {
            this.f171177b.m216994c(((smu0) this.f171176a.get(zzflgVar)).f165382b);
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: z */
    public final void mo94581z(zzflg zzflgVar, String str) {
    }
}
