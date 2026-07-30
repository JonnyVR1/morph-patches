package p002l;

import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.TantanListView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t5e0 {

    /* JADX INFO: renamed from: d */
    public static int f19422d = 3;

    /* JADX INFO: renamed from: a */
    public List<hjc0> f19423a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public ja80 f19424b;

    /* JADX INFO: renamed from: c */
    public TantanListView f19425c;

    public t5e0(ja80 ja80Var) {
        this.f19424b = ja80Var;
    }

    /* JADX INFO: renamed from: a */
    public void m22793a(hjc0 hjc0Var, coi0 coi0Var) {
        this.f19423a.add(0, hjc0Var);
        if (this.f19423a.size() <= f19422d) {
            return;
        }
        int size = this.f19423a.size();
        while (true) {
            size--;
            if (size < f19422d) {
                return;
            }
            hjc0 hjc0VarRemove = this.f19423a.remove(size);
            coi0Var.mo11205w(hjc0VarRemove.f12076g);
            this.f19424b.m15780a(hjc0VarRemove.f12076g);
            this.f19425c.m52y(hjc0VarRemove.f12076g.f22421a);
            hjc0VarRemove.m14415b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22794b(coi0 coi0Var) {
        if (this.f19423a.isEmpty()) {
            return;
        }
        ListIterator<hjc0> listIterator = this.f19423a.listIterator();
        while (listIterator.hasNext()) {
            hjc0 next = listIterator.next();
            listIterator.remove();
            coi0Var.mo11205w(next.f12076g);
            this.f19424b.m15780a(next.f12076g);
            this.f19425c.m52y(next.f12076g.f22421a);
            next.m14415b();
        }
    }

    /* JADX INFO: renamed from: c */
    public hjc0 m22795c() {
        if (this.f19423a.isEmpty()) {
            return null;
        }
        return this.f19423a.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public void m22796d(hjc0 hjc0Var, coi0 coi0Var) {
        coi0Var.mo11205w(hjc0Var.f12076g);
        this.f19424b.m15780a(hjc0Var.f12076g);
        int i = hjc0Var.f12077h;
        if (i == 3) {
            this.f19425c.removeView(hjc0Var.f12076g.f22421a);
        } else if (i == 2) {
            this.f19425c.m52y(hjc0Var.f12076g.f22421a);
        } else if (i == 4) {
            this.f19425c.removeView(hjc0Var.f12076g.f22421a);
        }
        hjc0Var.m14415b();
    }

    /* JADX INFO: renamed from: e */
    public void m22797e(TantanListView tantanListView) {
        this.f19425c = tantanListView;
    }
}
