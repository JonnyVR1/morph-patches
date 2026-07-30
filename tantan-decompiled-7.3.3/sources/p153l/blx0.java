package p153l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class blx0 extends llx0 {
    public blx0(int i) {
        super(i, null);
    }

    @Override // p153l.llx0
    /* JADX INFO: renamed from: a */
    public final void mo104934a() {
        if (!m154808j()) {
            for (int i = 0; i < m154804b(); i++) {
                Map.Entry entryM154807g = m154807g(i);
                if (((nhx0) entryM154807g.getKey()).zzc()) {
                    entryM154807g.setValue(Collections.unmodifiableList((List) entryM154807g.getValue()));
                }
            }
            for (Map.Entry entry : m154805c()) {
                if (((nhx0) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo104934a();
    }
}
