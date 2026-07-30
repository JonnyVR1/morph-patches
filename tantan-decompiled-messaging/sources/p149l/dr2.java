package p149l;

import java.util.ArrayList;
import java.util.List;
import p149l.gf3;

/* JADX INFO: loaded from: classes11.dex */
public abstract class dr2<D extends gf3> extends dac0<D> {

    /* JADX INFO: renamed from: c */
    public final List<D> f87568c = new ArrayList();

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f87568c.size();
    }

    /* JADX INFO: renamed from: E */
    public void m113264E(List<D> list) {
        this.f87568c.addAll(list);
        if (list.size() > 1) {
            notifyDataSetChanged();
        } else {
            notifyItemInserted(this.f87568c.size() - 1);
        }
    }

    /* JADX INFO: renamed from: F */
    public List<D> m113265F() {
        return this.f87568c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public D getItem(int i) {
        return this.f87568c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public int m113267H(D d) {
        int iIndexOf = this.f87568c.indexOf(d);
        if (iIndexOf < 0) {
            return -1;
        }
        this.f87568c.remove(iIndexOf);
        notifyDataSetChanged();
        return iIndexOf;
    }

    /* JADX INFO: renamed from: I */
    public void m113268I(List<D> list) {
        this.f87568c.clear();
        this.f87568c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
