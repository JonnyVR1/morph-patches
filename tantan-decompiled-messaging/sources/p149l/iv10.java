package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileRecentlyNewItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class iv10 extends dac0<Literatures> {

    /* JADX INFO: renamed from: c */
    public List<Literatures> f115074c;

    /* JADX INFO: renamed from: d */
    public List<Literatures> f115075d;

    /* JADX INFO: renamed from: e */
    public List<LiteraturesComments> f115076e;

    /* JADX INFO: renamed from: f */
    public boolean f115077f;

    /* JADX INFO: renamed from: g */
    public Act f115078g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f115079h;

    /* JADX INFO: renamed from: i */
    public a1m f115080i;

    /* JADX INFO: renamed from: j */
    public Map<String, Integer> f115081j = new HashMap();

    public iv10(RecyclerView recyclerView, a1m a1mVar) {
        this.f115079h = recyclerView;
        this.f115080i = a1mVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f115074c)) {
            return 0;
        }
        return this.f115074c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(f6c0.f95517Pa, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Literatures literatures, int i, int i2) {
        ((ProfileRecentlyNewItem) view).m53030g(this.f115080i, literatures, (LiteraturesComments) vwb.m200346r(this.f115076e, new w9j() { // from class: l.hv10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(literatures.f20433id, ((LiteraturesComments) obj).literatureID));
            }
        }), i2, this, this.f115077f, this.f115081j);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Literatures getItem(int i) {
        if (vwb.m200296J(this.f115074c)) {
            return null;
        }
        return this.f115074c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public boolean m138503H() {
        return !vwb.m200296J(this.f115076e);
    }

    /* JADX INFO: renamed from: I */
    public void m138504I(View view) {
        RecyclerView.AbstractC0566d0 abstractC0566d0FindContainingViewHolder = this.f115079h.findContainingViewHolder(view);
        if (NullChecker.m81303a(abstractC0566d0FindContainingViewHolder) && this.f115080i.mo51119m0()) {
            this.f115074c.remove(abstractC0566d0FindContainingViewHolder.getAdapterPosition());
            if (vwb.m200296J(this.f115074c)) {
                this.f115080i.mo51108h3();
            } else {
                notifyItemRemoved(abstractC0566d0FindContainingViewHolder.getAdapterPosition());
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m138505J(List<Literatures> list) {
        this.f115075d = list;
    }

    /* JADX INFO: renamed from: K */
    public void m138506K(Act act, List<Literatures> list, List<LiteraturesComments> list2, Map<String, Integer> map) {
        this.f115078g = act;
        this.f115074c = list;
        this.f115076e = list2;
        this.f115081j = map;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m138507L(boolean z) {
        this.f115077f = z;
        notifyDataSetChanged();
    }
}
