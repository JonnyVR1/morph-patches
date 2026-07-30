package p149l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class ike0 extends zjl {

    /* JADX INFO: renamed from: e */
    public Collection<mkl> f113659e = new HashSet();

    /* JADX INFO: renamed from: d */
    public Collection<String> f113658d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public Collection<mkl> m136786d() {
        return Collections.unmodifiableCollection(this.f113659e);
    }
}
