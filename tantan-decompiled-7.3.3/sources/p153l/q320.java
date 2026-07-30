package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileRecentlyNewItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class q320 extends jic0<Literatures> {

    /* JADX INFO: renamed from: c */
    public List<Literatures> f155407c;

    /* JADX INFO: renamed from: d */
    public List<Literatures> f155408d;

    /* JADX INFO: renamed from: e */
    public List<LiteraturesComments> f155409e;

    /* JADX INFO: renamed from: f */
    public boolean f155410f;

    /* JADX INFO: renamed from: g */
    public Act f155411g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f155412h;

    /* JADX INFO: renamed from: i */
    public t3m f155413i;

    /* JADX INFO: renamed from: j */
    public Map<String, Integer> f155414j = new HashMap();

    public q320(RecyclerView recyclerView, t3m t3mVar) {
        this.f155412h = recyclerView;
        this.f155413i = t3mVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f155407c)) {
            return 0;
        }
        return this.f155407c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(kec0.f125683Wa, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Literatures literatures, int i, int i2) {
        ((ProfileRecentlyNewItem) view).m54213g(this.f155413i, literatures, (LiteraturesComments) jyb.m147529r(this.f155409e, new qcj() { // from class: l.p320
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(literatures.f21175id, ((LiteraturesComments) obj).literatureID));
            }
        }), i2, this, this.f155410f, this.f155414j);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Literatures getItem(int i) {
        if (jyb.m147479J(this.f155407c)) {
            return null;
        }
        return this.f155407c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public boolean m175106H() {
        return !jyb.m147479J(this.f155409e);
    }

    /* JADX INFO: renamed from: I */
    public void m175107I(View view) {
        RecyclerView.AbstractC0569e0 abstractC0569e0FindContainingViewHolder = this.f155412h.findContainingViewHolder(view);
        if (NullChecker.m82486a(abstractC0569e0FindContainingViewHolder) && this.f155413i.mo52302m0()) {
            this.f155407c.remove(abstractC0569e0FindContainingViewHolder.getAdapterPosition());
            if (jyb.m147479J(this.f155407c)) {
                this.f155413i.mo52291h3();
            } else {
                notifyItemRemoved(abstractC0569e0FindContainingViewHolder.getAdapterPosition());
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m175108J(List<Literatures> list) {
        this.f155408d = list;
    }

    /* JADX INFO: renamed from: K */
    public void m175109K(Act act, List<Literatures> list, List<LiteraturesComments> list2, Map<String, Integer> map) {
        this.f155411g = act;
        this.f155407c = list;
        this.f155409e = list2;
        this.f155414j = map;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m175110L(boolean z) {
        this.f155410f = z;
        notifyDataSetChanged();
    }
}
