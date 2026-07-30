package p153l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xyx0 extends uzx0 {
    public xyx0() {
        super(null);
    }

    @Override // p153l.uzx0
    /* JADX INFO: renamed from: a */
    public final void mo198868a() {
        if (!m198873j()) {
            for (int i = 0; i < m198869c(); i++) {
                Map.Entry entryM198872g = m198872g(i);
                if (((zix0) ((czx0) entryM198872g).m113352a()).zze()) {
                    entryM198872g.setValue(Collections.unmodifiableList((List) entryM198872g.getValue()));
                }
            }
            for (Map.Entry entry : m198870d()) {
                if (((zix0) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo198868a();
    }
}
