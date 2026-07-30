package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.TantanListView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public class t5e0 {

    /* JADX INFO: renamed from: d */
    public static int f167819d = 3;

    /* JADX INFO: renamed from: a */
    public List<hjc0> f167820a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public ja80 f167821b;

    /* JADX INFO: renamed from: c */
    public TantanListView f167822c;

    public t5e0(ja80 ja80Var) {
        this.f167821b = ja80Var;
    }

    /* JADX INFO: renamed from: a */
    public void m187296a(hjc0 hjc0Var, coi0 coi0Var) {
        this.f167820a.add(0, hjc0Var);
        if (this.f167820a.size() <= f167819d) {
            return;
        }
        int size = this.f167820a.size();
        while (true) {
            size--;
            if (size < f167819d) {
                return;
            }
            hjc0 hjc0VarRemove = this.f167820a.remove(size);
            coi0Var.mo108016w(hjc0VarRemove.f108066g);
            this.f167821b.m140690a(hjc0VarRemove.f108066g);
            this.f167822c.m49638y(hjc0VarRemove.f108066g.f194078a);
            hjc0VarRemove.m131367b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m187297b(coi0 coi0Var) {
        if (this.f167820a.isEmpty()) {
            return;
        }
        ListIterator<hjc0> listIterator = this.f167820a.listIterator();
        while (listIterator.hasNext()) {
            hjc0 next = listIterator.next();
            listIterator.remove();
            coi0Var.mo108016w(next.f108066g);
            this.f167821b.m140690a(next.f108066g);
            this.f167822c.m49638y(next.f108066g.f194078a);
            next.m131367b();
        }
    }

    /* JADX INFO: renamed from: c */
    public hjc0 m187298c() {
        if (this.f167820a.isEmpty()) {
            return null;
        }
        return this.f167820a.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public void m187299d(hjc0 hjc0Var, coi0 coi0Var) {
        coi0Var.mo108016w(hjc0Var.f108066g);
        this.f167821b.m140690a(hjc0Var.f108066g);
        int i = hjc0Var.f108067h;
        if (i == 3) {
            this.f167822c.removeView(hjc0Var.f108066g.f194078a);
        } else if (i == 2) {
            this.f167822c.m49638y(hjc0Var.f108066g.f194078a);
        } else if (i == 4) {
            this.f167822c.removeView(hjc0Var.f108066g.f194078a);
        }
        hjc0Var.m131367b();
    }

    /* JADX INFO: renamed from: e */
    public void m187300e(TantanListView tantanListView) {
        this.f167822c = tantanListView;
    }
}
