package p153l;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class uqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final j0v0 f180504a;

    public uqs0(j0v0 j0v0Var) {
        Preconditions.checkNotNull(j0v0Var, "The Inspector Manager must not be null");
        this.f180504a = j0v0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
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
        this.f180504a.m143044i((String) map.get("extras"), j);
    }
}
