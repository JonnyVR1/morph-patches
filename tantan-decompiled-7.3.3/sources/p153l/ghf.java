package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ghf extends jic0<AbstractC8802c> {

    /* JADX INFO: renamed from: c */
    public final List<AbstractC8802c> f104119c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, AbstractC8802c> f104120d = new HashMap<>();

    public ghf() {
        setHasStableIds(true);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f104119c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        AbstractC8802c abstractC8802c = this.f104120d.get(Integer.valueOf(i));
        if (abstractC8802c != null) {
            return abstractC8802c.mo52336e() ? abstractC8802c.m52341j(viewGroup) : abstractC8802c.m52342k(viewGroup);
        }
        z0q.m218147a("itemType : ", i, " has no holder !!!");
        return null;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, AbstractC8802c abstractC8802c, int i, int i2) {
        abstractC8802c.m52332F(this, i2, view);
    }

    /* JADX INFO: renamed from: H */
    public int m130246H() {
        return jyb.m147476G(this.f104119c, new qcj() { // from class: l.fhf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC8802c) obj) instanceof cbf);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC8802c getItem(int i) {
        return this.f104119c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public int m130248J() {
        return jyb.m147476G(this.f104119c, new qcj() { // from class: l.ehf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC8802c) obj) instanceof oef);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public int m130249K(AbstractC8802c abstractC8802c) {
        return this.f104119c.indexOf(abstractC8802c);
    }

    /* JADX INFO: renamed from: L */
    public void m130250L(List<AbstractC8802c> list) {
        this.f104119c.clear();
        this.f104120d.clear();
        for (AbstractC8802c abstractC8802c : list) {
            this.f104120d.put(Integer.valueOf(abstractC8802c.m52350s()), abstractC8802c);
            this.f104119c.add(abstractC8802c);
            abstractC8802c.m52352u();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f104119c.get(i).m52350s();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewRecycled(abstractC0569e0);
    }
}
