package p153l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class rsw0 extends opw0 {

    /* JADX INFO: renamed from: c */
    public final Iterator f164740c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ssw0 f164741d;

    public rsw0(ssw0 ssw0Var) {
        this.f164741d = ssw0Var;
        this.f164740c = ssw0Var.f170525a.iterator();
    }

    @Override // p153l.opw0
    public final Object zza() {
        while (this.f164740c.hasNext()) {
            Iterator it = this.f164740c;
            Set set = this.f164741d.f170526b;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        m168775a();
        return null;
    }
}
