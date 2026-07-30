package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tid0 implements qul {

    /* JADX INFO: renamed from: a */
    public List<Integer> f174454a;

    /* JADX INFO: renamed from: a */
    public final void m191326a(int i) {
        if (this.f174454a == null) {
            this.f174454a = new ArrayList();
        }
        this.f174454a.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m191327b() {
        List<Integer> list = this.f174454a;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m191328c(int i) {
        List<Integer> list = this.f174454a;
        if (list != null) {
            return list.contains(Integer.valueOf(i));
        }
        return false;
    }

    @Override // p153l.qul
    /* JADX INFO: renamed from: n */
    public void mo178157n() {
        m191327b();
    }

    @Override // p153l.qul
    /* JADX INFO: renamed from: o */
    public boolean mo178158o(int i) {
        return m191328c(i);
    }

    @Override // p153l.qul
    /* JADX INFO: renamed from: p */
    public void mo178159p(int i) {
        m191326a(i);
    }
}
