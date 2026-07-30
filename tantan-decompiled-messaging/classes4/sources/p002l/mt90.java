package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l.dac0;
import l.vwb;
import l.w9j;
import l.zyp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mt90 extends dac0<hn2<?>> {

    /* JADX INFO: renamed from: c */
    public final List<hn2<?>> f15623c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, hn2<?>> f15624d = new HashMap<>();

    public mt90() {
        setHasStableIds(true);
    }

    /* JADX INFO: renamed from: C */
    public int m18152C() {
        return this.f15623c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18153D(ViewGroup viewGroup, int i) {
        hn2<?> hn2Var = this.f15624d.get(Integer.valueOf(i));
        if (hn2Var != null) {
            return hn2Var.m14456g(viewGroup);
        }
        zyp.a("itemType : ", i, " has no holder !!!");
        return null;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m18151A(View view, hn2<?> hn2Var, int i, int i2) {
        hn2Var.m14466x(this, i2, view);
    }

    /* JADX INFO: renamed from: H */
    public int m18155H() {
        return vwb.G(this.f15623c, new w9j() { // from class: l.jt90
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public int m18156I(final Class<?> cls) {
        List<hn2<?>> list = this.f15623c;
        Objects.requireNonNull(cls);
        return vwb.G(list, new w9j() { // from class: l.lt90
            public final Object call(Object obj) {
                return Boolean.valueOf(cls.isInstance((hn2) obj));
            }
        });
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public hn2<?> getItem(int i) {
        return this.f15623c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public int m18158K() {
        return vwb.G(this.f15623c, new w9j() { // from class: l.kt90
            public final Object call(Object obj) {
                return Boolean.valueOf(((hn2) obj) instanceof ioe);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public boolean m18159L(int i) {
        if (vwb.J(this.f15623c)) {
            return false;
        }
        return this.f15623c.get(i).m14459n();
    }

    /* JADX INFO: renamed from: M */
    public void m18160M(List<hn2<?>> list) {
        this.f15623c.clear();
        this.f15624d.clear();
        for (hn2<?> hn2Var : list) {
            this.f15624d.put(Integer.valueOf(hn2Var.m14460o()), hn2Var);
            this.f15623c.add(hn2Var);
            hn2Var.m14462q();
        }
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return getItemViewType(i);
    }

    public int getItemViewType(int i) {
        return this.f15623c.get(i).m14460o();
    }

    public void onViewRecycled(RecyclerView.d0 d0Var) {
        super.onViewRecycled(d0Var);
    }
}
