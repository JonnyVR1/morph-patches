package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class lgl {

    /* JADX INFO: renamed from: a */
    private List<jgl> f131976a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m154074a(jgl jglVar) {
        this.f131976a.add(jglVar);
    }

    /* JADX INFO: renamed from: b */
    public void m154075b(float f) {
        Iterator<jgl> it = this.f131976a.iterator();
        while (it.hasNext()) {
            it.next().m144790d(f);
        }
    }
}
