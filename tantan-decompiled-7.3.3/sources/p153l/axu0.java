package p153l;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzflg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class axu0 implements mcw0 {

    /* JADX INFO: renamed from: b */
    public final swu0 f73916b;

    /* JADX INFO: renamed from: c */
    public final Clock f73917c;

    /* JADX INFO: renamed from: a */
    public final Map f73915a = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f73918d = new HashMap();

    public axu0(swu0 swu0Var, Set set, Clock clock) {
        this.f73916b = swu0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zwu0 zwu0Var = (zwu0) it.next();
            this.f73918d.put(zwu0Var.f206386c, zwu0Var);
        }
        this.f73917c = clock;
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: D */
    public final void mo100841D(zzflg zzflgVar, String str, Throwable th) {
        if (this.f73915a.containsKey(zzflgVar)) {
            long jElapsedRealtime = this.f73917c.elapsedRealtime() - ((Long) this.f73915a.get(zzflgVar)).longValue();
            swu0 swu0Var = this.f73916b;
            String strValueOf = String.valueOf(str);
            swu0Var.m188363a().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f73918d.containsKey(zzflgVar)) {
            m100842a(zzflgVar, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m100842a(zzflg zzflgVar, boolean z) {
        zzflg zzflgVar2 = ((zwu0) this.f73918d.get(zzflgVar)).f206385b;
        if (this.f73915a.containsKey(zzflgVar2)) {
            String str = true != z ? "f." : "s.";
            long jElapsedRealtime = this.f73917c.elapsedRealtime() - ((Long) this.f73915a.get(zzflgVar2)).longValue();
            this.f73916b.m188363a().put("label.".concat(((zwu0) this.f73918d.get(zzflgVar)).f206384a), str.concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: b */
    public final void mo100843b(zzflg zzflgVar, String str) {
        this.f73915a.put(zzflgVar, Long.valueOf(this.f73917c.elapsedRealtime()));
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: k */
    public final void mo100844k(zzflg zzflgVar, String str) {
        if (this.f73915a.containsKey(zzflgVar)) {
            long jElapsedRealtime = this.f73917c.elapsedRealtime() - ((Long) this.f73915a.get(zzflgVar)).longValue();
            swu0 swu0Var = this.f73916b;
            String strValueOf = String.valueOf(str);
            swu0Var.m188363a().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f73918d.containsKey(zzflgVar)) {
            m100842a(zzflgVar, true);
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: z */
    public final void mo100845z(zzflg zzflgVar, String str) {
    }
}
