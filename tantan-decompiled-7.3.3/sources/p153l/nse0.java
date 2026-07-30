package p153l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class nse0 extends nml {

    /* JADX INFO: renamed from: e */
    public Collection<anl> f143496e = new HashSet();

    /* JADX INFO: renamed from: d */
    public Collection<String> f143495d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public Collection<anl> m164593d() {
        return Collections.unmodifiableCollection(this.f143496e);
    }
}
