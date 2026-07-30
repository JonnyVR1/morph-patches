package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class iqf {

    /* JADX INFO: renamed from: a */
    private List<hqf> f116409a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m141669a(hqf hqfVar) {
        this.f116409a.add(hqfVar);
    }

    /* JADX INFO: renamed from: b */
    public void m141670b(long j) {
        Iterator<hqf> it = this.f116409a.iterator();
        while (it.hasNext()) {
            it.next().m136619a(j);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m141671c() {
        Iterator<hqf> it = this.f116409a.iterator();
        while (it.hasNext()) {
            it.next().m136624j();
        }
    }
}
