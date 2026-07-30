package p153l;

import java.util.ArrayList;
import java.util.List;
import p153l.uf3;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tr2<D extends uf3> extends jic0<D> {

    /* JADX INFO: renamed from: c */
    public final List<D> f175798c = new ArrayList();

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f175798c.size();
    }

    /* JADX INFO: renamed from: E */
    public void m192399E(List<D> list) {
        this.f175798c.addAll(list);
        if (list.size() > 1) {
            notifyDataSetChanged();
        } else {
            notifyItemInserted(this.f175798c.size() - 1);
        }
    }

    /* JADX INFO: renamed from: F */
    public List<D> m192400F() {
        return this.f175798c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public D getItem(int i) {
        return this.f175798c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public int m192402H(D d) {
        int iIndexOf = this.f175798c.indexOf(d);
        if (iIndexOf < 0) {
            return -1;
        }
        this.f175798c.remove(iIndexOf);
        notifyDataSetChanged();
        return iIndexOf;
    }

    /* JADX INFO: renamed from: I */
    public void m192403I(List<D> list) {
        this.f175798c.clear();
        this.f175798c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
