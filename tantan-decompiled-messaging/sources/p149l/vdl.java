package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class vdl {

    /* JADX INFO: renamed from: a */
    private List<tdl> f181093a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m198004a(tdl tdlVar) {
        this.f181093a.add(tdlVar);
    }

    /* JADX INFO: renamed from: b */
    public void m198005b(float f) {
        Iterator<tdl> it = this.f181093a.iterator();
        while (it.hasNext()) {
            it.next().m188139d(f);
        }
    }
}
