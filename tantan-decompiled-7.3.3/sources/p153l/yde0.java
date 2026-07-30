package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.TantanListView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public class yde0 {

    /* JADX INFO: renamed from: d */
    public static int f198592d = 3;

    /* JADX INFO: renamed from: a */
    public List<orc0> f198593a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public pi80 f198594b;

    /* JADX INFO: renamed from: c */
    public TantanListView f198595c;

    public yde0(pi80 pi80Var) {
        this.f198594b = pi80Var;
    }

    /* JADX INFO: renamed from: a */
    public void m215213a(orc0 orc0Var, dxi0 dxi0Var) {
        this.f198593a.add(0, orc0Var);
        if (this.f198593a.size() <= f198592d) {
            return;
        }
        int size = this.f198593a.size();
        while (true) {
            size--;
            if (size < f198592d) {
                return;
            }
            orc0 orc0VarRemove = this.f198593a.remove(size);
            dxi0Var.mo118500w(orc0VarRemove.f148694g);
            this.f198594b.m172356a(orc0VarRemove.f148694g);
            this.f198595c.m50821y(orc0VarRemove.f148694g.f143454a);
            orc0VarRemove.m168911b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m215214b(dxi0 dxi0Var) {
        if (this.f198593a.isEmpty()) {
            return;
        }
        ListIterator<orc0> listIterator = this.f198593a.listIterator();
        while (listIterator.hasNext()) {
            orc0 next = listIterator.next();
            listIterator.remove();
            dxi0Var.mo118500w(next.f148694g);
            this.f198594b.m172356a(next.f148694g);
            this.f198595c.m50821y(next.f148694g.f143454a);
            next.m168911b();
        }
    }

    /* JADX INFO: renamed from: c */
    public orc0 m215215c() {
        if (this.f198593a.isEmpty()) {
            return null;
        }
        return this.f198593a.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public void m215216d(orc0 orc0Var, dxi0 dxi0Var) {
        dxi0Var.mo118500w(orc0Var.f148694g);
        this.f198594b.m172356a(orc0Var.f148694g);
        int i = orc0Var.f148695h;
        if (i == 3) {
            this.f198595c.removeView(orc0Var.f148694g.f143454a);
        } else if (i == 2) {
            this.f198595c.m50821y(orc0Var.f148694g.f143454a);
        } else if (i == 4) {
            this.f198595c.removeView(orc0Var.f148694g.f143454a);
        }
        orc0Var.m168911b();
    }

    /* JADX INFO: renamed from: e */
    public void m215217e(TantanListView tantanListView) {
        this.f198595c = tantanListView;
    }
}
