package p002l;

import java.util.ArrayList;
import java.util.List;
import l.mcr;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class or90 implements j5q {

    /* JADX INFO: renamed from: a */
    public final b1m f16756a;

    /* JADX INFO: renamed from: b */
    public mcr f16757b;

    /* JADX INFO: renamed from: c */
    public List<hn2<a1m>> f16758c = new ArrayList();

    public or90(b1m b1mVar, mcr mcrVar) {
        this.f16756a = b1mVar;
        this.f16757b = mcrVar;
    }

    /* JADX INFO: renamed from: c */
    public List<hn2<a1m>> m19694c() {
        if (vwb.J(this.f16758c)) {
            mo15243a(this.f16758c);
        }
        return this.f16758c;
    }

    /* JADX INFO: renamed from: d */
    public hn2 m19695d(final Class<? extends hn2<a1m>> cls) {
        return (hn2) vwb.r(this.f16758c, new w9j() { // from class: l.nr90
            public final Object call(Object obj) {
                return Boolean.valueOf(((hn2) obj).getClass().isAssignableFrom(cls));
            }
        });
    }
}
