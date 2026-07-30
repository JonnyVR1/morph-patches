package p009l;

import java.util.ArrayList;
import java.util.List;
import l.dac0;
import p009l.gf3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class dr2<D extends gf3> extends dac0<D> {

    /* JADX INFO: renamed from: c */
    public final List<D> f11957c = new ArrayList();

    /* JADX INFO: renamed from: C */
    public int m13442C() {
        return this.f11957c.size();
    }

    /* JADX INFO: renamed from: E */
    public void m13443E(List<D> list) {
        this.f11957c.addAll(list);
        if (list.size() > 1) {
            notifyDataSetChanged();
        } else {
            notifyItemInserted(this.f11957c.size() - 1);
        }
    }

    /* JADX INFO: renamed from: F */
    public List<D> m13444F() {
        return this.f11957c;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public D getItem(int i) {
        return this.f11957c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public int m13446H(D d) {
        int iIndexOf = this.f11957c.indexOf(d);
        if (iIndexOf < 0) {
            return -1;
        }
        this.f11957c.remove(iIndexOf);
        notifyDataSetChanged();
        return iIndexOf;
    }

    /* JADX INFO: renamed from: I */
    public void m13447I(List<D> list) {
        this.f11957c.clear();
        this.f11957c.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return i;
    }
}
