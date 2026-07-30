package p153l;

import com.google.android.gms.internal.ads.zzflg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c9v0 implements mcw0 {

    /* JADX INFO: renamed from: a */
    public final Map f80527a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f80528b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ucw0 f80529c;

    public c9v0(Set set, ucw0 ucw0Var) {
        this.f80529c = ucw0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b9v0 b9v0Var = (b9v0) it.next();
            this.f80527a.put(b9v0Var.f75625b, b9v0Var.f75624a);
            this.f80528b.put(b9v0Var.f75626c, b9v0Var.f75624a);
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: D */
    public final void mo100841D(zzflg zzflgVar, String str, Throwable th) {
        this.f80529c.m195447e("task.".concat(String.valueOf(str)), "f.");
        if (this.f80528b.containsKey(zzflgVar)) {
            this.f80529c.m195447e("label.".concat(String.valueOf((String) this.f80528b.get(zzflgVar))), "f.");
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: b */
    public final void mo100843b(zzflg zzflgVar, String str) {
        this.f80529c.m195446d("task.".concat(String.valueOf(str)));
        if (this.f80527a.containsKey(zzflgVar)) {
            this.f80529c.m195446d("label.".concat(String.valueOf((String) this.f80527a.get(zzflgVar))));
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: k */
    public final void mo100844k(zzflg zzflgVar, String str) {
        this.f80529c.m195447e("task.".concat(String.valueOf(str)), "s.");
        if (this.f80528b.containsKey(zzflgVar)) {
            this.f80529c.m195447e("label.".concat(String.valueOf((String) this.f80528b.get(zzflgVar))), "s.");
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: z */
    public final void mo100845z(zzflg zzflgVar, String str) {
    }
}
