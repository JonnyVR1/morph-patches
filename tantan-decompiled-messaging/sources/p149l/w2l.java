package p149l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class w2l implements pki<w2l> {

    /* JADX INFO: renamed from: a */
    public final String f184248a;

    /* JADX INFO: renamed from: b */
    public final List<String> f184249b;

    /* JADX INFO: renamed from: c */
    public final boolean f184250c;

    public w2l(String str, List<String> list, boolean z) {
        this.f184248a = str;
        this.f184249b = Collections.unmodifiableList(list);
        this.f184250c = z;
    }
}
