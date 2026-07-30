package p149l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class vbx0 extends fcx0 {
    public vbx0(int i) {
        super(i, null);
    }

    @Override // p149l.fcx0
    /* JADX INFO: renamed from: a */
    public final void mo120493a() {
        if (!m120498j()) {
            for (int i = 0; i < m120494b(); i++) {
                Map.Entry entryM120497g = m120497g(i);
                if (((h8x0) entryM120497g.getKey()).zzc()) {
                    entryM120497g.setValue(Collections.unmodifiableList((List) entryM120497g.getValue()));
                }
            }
            for (Map.Entry entry : m120495c()) {
                if (((h8x0) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo120493a();
    }
}
