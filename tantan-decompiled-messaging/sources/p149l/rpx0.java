package p149l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rpx0 extends oqx0 {
    public rpx0() {
        super(null);
    }

    @Override // p149l.oqx0
    /* JADX INFO: renamed from: a */
    public final void mo165499a() {
        if (!m165504j()) {
            for (int i = 0; i < m165500c(); i++) {
                Map.Entry entryM165503g = m165503g(i);
                if (((t9x0) ((wpx0) entryM165503g).m204951a()).zze()) {
                    entryM165503g.setValue(Collections.unmodifiableList((List) entryM165503g.getValue()));
                }
            }
            for (Map.Entry entry : m165501d()) {
                if (((t9x0) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo165499a();
    }
}
