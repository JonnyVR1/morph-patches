package p149l;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ziw0 extends fjw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f203357a;

    public ziw0(Comparator comparator) {
        this.f203357a = comparator;
    }

    @Override // p149l.fjw0
    /* JADX INFO: renamed from: a */
    public final Map mo12508a() {
        return new TreeMap(this.f203357a);
    }
}
