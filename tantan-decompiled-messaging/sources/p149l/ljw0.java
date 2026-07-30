package p149l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ljw0 extends igw0 {

    /* JADX INFO: renamed from: c */
    public final Iterator f128410c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mjw0 f128411d;

    public ljw0(mjw0 mjw0Var) {
        this.f128411d = mjw0Var;
        this.f128410c = mjw0Var.f134259a.iterator();
    }

    @Override // p149l.igw0
    public final Object zza() {
        while (this.f128410c.hasNext()) {
            Iterator it = this.f128410c;
            Set set = this.f128411d.f134260b;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        m136179a();
        return null;
    }
}
