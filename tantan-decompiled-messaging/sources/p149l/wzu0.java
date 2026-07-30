package p149l;

import com.google.android.gms.internal.ads.zzflg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class wzu0 implements g3w0 {

    /* JADX INFO: renamed from: a */
    public final Map f188764a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f188765b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final o3w0 f188766c;

    public wzu0(Set set, o3w0 o3w0Var) {
        this.f188766c = o3w0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            vzu0 vzu0Var = (vzu0) it.next();
            this.f188764a.put(vzu0Var.f183672b, vzu0Var.f183671a);
            this.f188765b.put(vzu0Var.f183673c, vzu0Var.f183671a);
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: D */
    public final void mo94578D(zzflg zzflgVar, String str, Throwable th) {
        this.f188766c.m162493e("task.".concat(String.valueOf(str)), "f.");
        if (this.f188765b.containsKey(zzflgVar)) {
            this.f188766c.m162493e("label.".concat(String.valueOf((String) this.f188765b.get(zzflgVar))), "f.");
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: b */
    public final void mo94579b(zzflg zzflgVar, String str) {
        this.f188766c.m162492d("task.".concat(String.valueOf(str)));
        if (this.f188764a.containsKey(zzflgVar)) {
            this.f188766c.m162492d("label.".concat(String.valueOf((String) this.f188764a.get(zzflgVar))));
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: k */
    public final void mo94580k(zzflg zzflgVar, String str) {
        this.f188766c.m162493e("task.".concat(String.valueOf(str)), "s.");
        if (this.f188765b.containsKey(zzflgVar)) {
            this.f188766c.m162493e("label.".concat(String.valueOf((String) this.f188765b.get(zzflgVar))), "s.");
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: z */
    public final void mo94581z(zzflg zzflgVar, String str) {
    }
}
