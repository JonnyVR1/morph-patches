package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class mxq0 implements pd50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jsd f136200a;

    public mxq0(jsd jsdVar) {
        this.f136200a = jsdVar;
    }

    @Override // p149l.pd50
    /* JADX INFO: renamed from: a */
    public final void mo156920a(gcr gcrVar) {
        this.f136200a.f119488a = gcrVar;
        Iterator it = this.f136200a.f119490c.iterator();
        while (it.hasNext()) {
            ((tyq0) it.next()).mo104507a(this.f136200a.f119488a);
        }
        this.f136200a.f119490c.clear();
        this.f136200a.f119489b = null;
    }
}
