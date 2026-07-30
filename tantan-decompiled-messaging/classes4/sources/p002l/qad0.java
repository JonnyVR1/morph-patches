package p002l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qad0 implements csl {

    /* JADX INFO: renamed from: a */
    public List<Integer> f17882a;

    /* JADX INFO: renamed from: a */
    public final void m21147a(int i) {
        if (this.f17882a == null) {
            this.f17882a = new ArrayList();
        }
        this.f17882a.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m21148b() {
        List<Integer> list = this.f17882a;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21149c(int i) {
        List<Integer> list = this.f17882a;
        if (list != null) {
            return list.contains(Integer.valueOf(i));
        }
        return false;
    }

    @Override // p002l.csl
    /* JADX INFO: renamed from: n */
    public void mo11346n() {
        m21148b();
    }

    @Override // p002l.csl
    /* JADX INFO: renamed from: o */
    public boolean mo11347o(int i) {
        return m21149c(i);
    }

    @Override // p002l.csl
    /* JADX INFO: renamed from: p */
    public void mo11348p(int i) {
        m21147a(i);
    }
}
