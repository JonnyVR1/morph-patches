package p149l;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzflg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class unu0 implements g3w0 {

    /* JADX INFO: renamed from: b */
    public final mnu0 f177461b;

    /* JADX INFO: renamed from: c */
    public final Clock f177462c;

    /* JADX INFO: renamed from: a */
    public final Map f177460a = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f177463d = new HashMap();

    public unu0(mnu0 mnu0Var, Set set, Clock clock) {
        this.f177461b = mnu0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tnu0 tnu0Var = (tnu0) it.next();
            this.f177463d.put(tnu0Var.f171286c, tnu0Var);
        }
        this.f177462c = clock;
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: D */
    public final void mo94578D(zzflg zzflgVar, String str, Throwable th) {
        if (this.f177460a.containsKey(zzflgVar)) {
            long jElapsedRealtime = this.f177462c.elapsedRealtime() - ((Long) this.f177460a.get(zzflgVar)).longValue();
            mnu0 mnu0Var = this.f177461b;
            String strValueOf = String.valueOf(str);
            mnu0Var.m155566a().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f177463d.containsKey(zzflgVar)) {
            m194525a(zzflgVar, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m194525a(zzflg zzflgVar, boolean z) {
        zzflg zzflgVar2 = ((tnu0) this.f177463d.get(zzflgVar)).f171285b;
        if (this.f177460a.containsKey(zzflgVar2)) {
            String str = true != z ? "f." : "s.";
            long jElapsedRealtime = this.f177462c.elapsedRealtime() - ((Long) this.f177460a.get(zzflgVar2)).longValue();
            this.f177461b.m155566a().put("label.".concat(((tnu0) this.f177463d.get(zzflgVar)).f171284a), str.concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: b */
    public final void mo94579b(zzflg zzflgVar, String str) {
        this.f177460a.put(zzflgVar, Long.valueOf(this.f177462c.elapsedRealtime()));
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: k */
    public final void mo94580k(zzflg zzflgVar, String str) {
        if (this.f177460a.containsKey(zzflgVar)) {
            long jElapsedRealtime = this.f177462c.elapsedRealtime() - ((Long) this.f177460a.get(zzflgVar)).longValue();
            mnu0 mnu0Var = this.f177461b;
            String strValueOf = String.valueOf(str);
            mnu0Var.m155566a().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f177463d.containsKey(zzflgVar)) {
            m194525a(zzflgVar, true);
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: z */
    public final void mo94581z(zzflg zzflgVar, String str) {
    }
}
