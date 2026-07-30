package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.dac0;
import l.vwb;
import l.w9j;
import l.zyp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class agf extends dac0<AbstractC0064c> {

    /* JADX INFO: renamed from: c */
    public final List<AbstractC0064c> f7594c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, AbstractC0064c> f7595d = new HashMap<>();

    public agf() {
        setHasStableIds(true);
    }

    /* JADX INFO: renamed from: C */
    public int m9618C() {
        return this.f7594c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m9619D(ViewGroup viewGroup, int i) {
        AbstractC0064c abstractC0064c = this.f7595d.get(Integer.valueOf(i));
        if (abstractC0064c != null) {
            return abstractC0064c.mo1605e() ? abstractC0064c.m1610j(viewGroup) : abstractC0064c.m1611k(viewGroup);
        }
        zyp.a("itemType : ", i, " has no holder !!!");
        return null;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m9617A(View view, AbstractC0064c abstractC0064c, int i, int i2) {
        abstractC0064c.m1601F(this, i2, view);
    }

    /* JADX INFO: renamed from: H */
    public int m9621H() {
        return vwb.G(this.f7594c, new w9j() { // from class: l.zff
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC0064c) obj) instanceof w9f);
            }
        });
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC0064c getItem(int i) {
        return this.f7594c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public int m9623J() {
        return vwb.G(this.f7594c, new w9j() { // from class: l.yff
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC0064c) obj) instanceof idf);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public int m9624K(AbstractC0064c abstractC0064c) {
        return this.f7594c.indexOf(abstractC0064c);
    }

    /* JADX INFO: renamed from: L */
    public void m9625L(List<AbstractC0064c> list) {
        this.f7594c.clear();
        this.f7595d.clear();
        for (AbstractC0064c abstractC0064c : list) {
            this.f7595d.put(Integer.valueOf(abstractC0064c.m1619s()), abstractC0064c);
            this.f7594c.add(abstractC0064c);
            abstractC0064c.m1621u();
        }
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return getItemViewType(i);
    }

    public int getItemViewType(int i) {
        return this.f7594c.get(i).m1619s();
    }

    public void onViewRecycled(RecyclerView.d0 d0Var) {
        super.onViewRecycled(d0Var);
    }
}
