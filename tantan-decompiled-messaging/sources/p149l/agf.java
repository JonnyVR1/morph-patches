package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class agf extends dac0<AbstractC8639c> {

    /* JADX INFO: renamed from: c */
    public final List<AbstractC8639c> f69356c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, AbstractC8639c> f69357d = new HashMap<>();

    public agf() {
        setHasStableIds(true);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f69356c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        AbstractC8639c abstractC8639c = this.f69357d.get(Integer.valueOf(i));
        if (abstractC8639c != null) {
            return abstractC8639c.mo51153e() ? abstractC8639c.m51158j(viewGroup) : abstractC8639c.m51159k(viewGroup);
        }
        zyp.m220936a("itemType : ", i, " has no holder !!!");
        return null;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, AbstractC8639c abstractC8639c, int i, int i2) {
        abstractC8639c.m51149F(this, i2, view);
    }

    /* JADX INFO: renamed from: H */
    public int m96298H() {
        return vwb.m200293G(this.f69356c, new w9j() { // from class: l.zff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC8639c) obj) instanceof w9f);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC8639c getItem(int i) {
        return this.f69356c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public int m96300J() {
        return vwb.m200293G(this.f69356c, new w9j() { // from class: l.yff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC8639c) obj) instanceof idf);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public int m96301K(AbstractC8639c abstractC8639c) {
        return this.f69356c.indexOf(abstractC8639c);
    }

    /* JADX INFO: renamed from: L */
    public void m96302L(List<AbstractC8639c> list) {
        this.f69356c.clear();
        this.f69357d.clear();
        for (AbstractC8639c abstractC8639c : list) {
            this.f69357d.put(Integer.valueOf(abstractC8639c.m51167s()), abstractC8639c);
            this.f69356c.add(abstractC8639c);
            abstractC8639c.m51169u();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f69356c.get(i).m51167s();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewRecycled(abstractC0566d0);
    }
}
