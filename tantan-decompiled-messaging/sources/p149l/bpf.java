package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class bpf {

    /* JADX INFO: renamed from: a */
    private List<apf> f76622a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m103054a(apf apfVar) {
        this.f76622a.add(apfVar);
    }

    /* JADX INFO: renamed from: b */
    public void m103055b(long j) {
        Iterator<apf> it = this.f76622a.iterator();
        while (it.hasNext()) {
            it.next().m98109a(j);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m103056c() {
        Iterator<apf> it = this.f76622a.iterator();
        while (it.hasNext()) {
            it.next().m98115j();
        }
    }
}
