package p149l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class w3y0 extends m3y0 {
    public w3y0() {
        super();
    }

    @Override // p149l.m3y0
    /* JADX INFO: renamed from: l */
    public final void mo152976l() {
        if (!m152977n()) {
            for (int i = 0; i < m152969a(); i++) {
                Map.Entry entryM152972f = m152972f(i);
                if (((yrx0) entryM152972f.getKey()).zze()) {
                    entryM152972f.setValue(Collections.unmodifiableList((List) entryM152972f.getValue()));
                }
            }
            for (Map.Entry entry : m152973g()) {
                if (((yrx0) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo152976l();
    }
}
