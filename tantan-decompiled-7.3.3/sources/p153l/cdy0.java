package p153l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cdy0 extends scy0 {
    public cdy0() {
        super();
    }

    @Override // p153l.scy0
    /* JADX INFO: renamed from: l */
    public final void mo109265l() {
        if (!m185408n()) {
            for (int i = 0; i < m185401a(); i++) {
                Map.Entry entryM185404f = m185404f(i);
                if (((e1y0) entryM185404f.getKey()).zze()) {
                    entryM185404f.setValue(Collections.unmodifiableList((List) entryM185404f.getValue()));
                }
            }
            for (Map.Entry entry : m185405g()) {
                if (((e1y0) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo109265l();
    }
}
