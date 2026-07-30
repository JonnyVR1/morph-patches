package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class or90 implements j5q {

    /* JADX INFO: renamed from: a */
    public final b1m f145242a;

    /* JADX INFO: renamed from: b */
    public mcr f145243b;

    /* JADX INFO: renamed from: c */
    public List<hn2<a1m>> f145244c = new ArrayList();

    public or90(b1m b1mVar, mcr mcrVar) {
        this.f145242a = b1mVar;
        this.f145243b = mcrVar;
    }

    /* JADX INFO: renamed from: c */
    public List<hn2<a1m>> m165526c() {
        if (vwb.m200296J(this.f145244c)) {
            mo137133a(this.f145244c);
        }
        return this.f145244c;
    }

    /* JADX INFO: renamed from: d */
    public hn2 m165527d(final Class<? extends hn2<a1m>> cls) {
        return (hn2) vwb.m200346r(this.f145244c, new w9j() { // from class: l.nr90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((hn2) obj).getClass().isAssignableFrom(cls));
            }
        });
    }
}
