package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class q1a0 extends jic0<on2<?>> {

    /* JADX INFO: renamed from: c */
    public final List<on2<?>> f155163c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, on2<?>> f155164d = new HashMap<>();

    public q1a0() {
        setHasStableIds(true);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f155163c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        on2<?> on2Var = this.f155164d.get(Integer.valueOf(i));
        if (on2Var != null) {
            return on2Var.m168316g(viewGroup);
        }
        z0q.m218147a("itemType : ", i, " has no holder !!!");
        return null;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, on2<?> on2Var, int i, int i2) {
        on2Var.m168326x(this, i2, view);
    }

    /* JADX INFO: renamed from: H */
    public int m174846H() {
        return jyb.m147476G(this.f155163c, new qcj() { // from class: l.n1a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public int m174847I(final Class<?> cls) {
        List<on2<?>> list = this.f155163c;
        Objects.requireNonNull(cls);
        return jyb.m147476G(list, new qcj() { // from class: l.p1a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(cls.isInstance((on2) obj));
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public on2<?> getItem(int i) {
        return this.f155163c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public int m174849K() {
        return jyb.m147476G(this.f155163c, new qcj() { // from class: l.o1a0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((on2) obj) instanceof mpe);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public boolean m174850L(int i) {
        if (jyb.m147479J(this.f155163c)) {
            return false;
        }
        return this.f155163c.get(i).m168319n();
    }

    /* JADX INFO: renamed from: M */
    public void m174851M(List<on2<?>> list) {
        this.f155163c.clear();
        this.f155164d.clear();
        for (on2<?> on2Var : list) {
            this.f155164d.put(Integer.valueOf(on2Var.m168320o()), on2Var);
            this.f155163c.add(on2Var);
            on2Var.m168322q();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f155163c.get(i).m168320o();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewRecycled(abstractC0569e0);
    }
}
