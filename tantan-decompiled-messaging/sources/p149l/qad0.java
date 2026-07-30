package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qad0 implements csl {

    /* JADX INFO: renamed from: a */
    public List<Integer> f153533a;

    /* JADX INFO: renamed from: a */
    public final void m173726a(int i) {
        if (this.f153533a == null) {
            this.f153533a = new ArrayList();
        }
        this.f153533a.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m173727b() {
        List<Integer> list = this.f153533a;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m173728c(int i) {
        List<Integer> list = this.f153533a;
        if (list != null) {
            return list.contains(Integer.valueOf(i));
        }
        return false;
    }

    @Override // p149l.csl
    /* JADX INFO: renamed from: n */
    public void mo108513n() {
        m173727b();
    }

    @Override // p149l.csl
    /* JADX INFO: renamed from: o */
    public boolean mo108514o(int i) {
        return m173728c(i);
    }

    @Override // p149l.csl
    /* JADX INFO: renamed from: p */
    public void mo108515p(int i) {
        m173726a(i);
    }
}
