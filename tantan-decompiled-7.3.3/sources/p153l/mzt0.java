package p153l;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mzt0 implements nzt0 {

    /* JADX INFO: renamed from: a */
    public final Map f139554a;

    public mzt0(Map map) {
        this.f139554a = map;
    }

    @Override // p153l.nzt0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final pcv0 mo145142d(int i, String str) {
        return (pcv0) this.f139554a.get(str);
    }
}
