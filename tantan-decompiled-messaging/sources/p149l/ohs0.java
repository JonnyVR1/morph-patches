package p149l;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ohs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final dru0 f144046a;

    public ohs0(dru0 dru0Var) {
        Preconditions.checkNotNull(dru0Var, "The Inspector Manager must not be null");
        this.f144046a = dru0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f144046a.m113347i((String) map.get("extras"), j);
    }
}
