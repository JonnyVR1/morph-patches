package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class mt90 extends dac0<hn2<?>> {

    /* JADX INFO: renamed from: c */
    public final List<hn2<?>> f135559c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, hn2<?>> f135560d = new HashMap<>();

    public mt90() {
        setHasStableIds(true);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f135559c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        hn2<?> hn2Var = this.f135560d.get(Integer.valueOf(i));
        if (hn2Var != null) {
            return hn2Var.m131816g(viewGroup);
        }
        zyp.m220936a("itemType : ", i, " has no holder !!!");
        return null;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, hn2<?> hn2Var, int i, int i2) {
        hn2Var.m131826x(this, i2, view);
    }

    /* JADX INFO: renamed from: H */
    public int m156185H() {
        return vwb.m200293G(this.f135559c, new w9j() { // from class: l.jt90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public int m156186I(final Class<?> cls) {
        List<hn2<?>> list = this.f135559c;
        Objects.requireNonNull(cls);
        return vwb.m200293G(list, new w9j() { // from class: l.lt90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cls.isInstance((hn2) obj));
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public hn2<?> getItem(int i) {
        return this.f135559c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public int m156188K() {
        return vwb.m200293G(this.f135559c, new w9j() { // from class: l.kt90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((hn2) obj) instanceof ioe);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public boolean m156189L(int i) {
        if (vwb.m200296J(this.f135559c)) {
            return false;
        }
        return this.f135559c.get(i).m131819n();
    }

    /* JADX INFO: renamed from: M */
    public void m156190M(List<hn2<?>> list) {
        this.f135559c.clear();
        this.f135560d.clear();
        for (hn2<?> hn2Var : list) {
            this.f135560d.put(Integer.valueOf(hn2Var.m131820o()), hn2Var);
            this.f135559c.add(hn2Var);
            hn2Var.m131822q();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f135559c.get(i).m131820o();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewRecycled(abstractC0566d0);
    }
}
