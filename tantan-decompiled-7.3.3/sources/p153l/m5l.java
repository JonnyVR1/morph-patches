package p153l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class m5l implements lni<m5l> {

    /* JADX INFO: renamed from: a */
    public final String f134910a;

    /* JADX INFO: renamed from: b */
    public final List<String> f134911b;

    /* JADX INFO: renamed from: c */
    public final boolean f134912c;

    public m5l(String str, List<String> list, boolean z) {
        this.f134910a = str;
        this.f134911b = Collections.unmodifiableList(list);
        this.f134912c = z;
    }
}
