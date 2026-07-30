package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileRecentlyNewItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.dac0;
import l.f6c0;
import l.o7r;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iv10 extends dac0<Literatures> {

    /* JADX INFO: renamed from: c */
    public List<Literatures> f13421c;

    /* JADX INFO: renamed from: d */
    public List<Literatures> f13422d;

    /* JADX INFO: renamed from: e */
    public List<LiteraturesComments> f13423e;

    /* JADX INFO: renamed from: f */
    public boolean f13424f;

    /* JADX INFO: renamed from: g */
    public Act f13425g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f13426h;

    /* JADX INFO: renamed from: i */
    public a1m f13427i;

    /* JADX INFO: renamed from: j */
    public Map<String, Integer> f13428j = new HashMap();

    public iv10(RecyclerView recyclerView, a1m a1mVar) {
        this.f13426h = recyclerView;
        this.f13427i = a1mVar;
    }

    /* JADX INFO: renamed from: C */
    public int m15418C() {
        if (vwb.J(this.f13421c)) {
            return 0;
        }
        return this.f13421c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15419D(ViewGroup viewGroup, int i) {
        return o7r.a(viewGroup.getContext()).inflate(f6c0.Pa, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m15417A(View view, final Literatures literatures, int i, int i2) {
        ((ProfileRecentlyNewItem) view).m3588g(this.f13427i, literatures, (LiteraturesComments) vwb.r(this.f13423e, new w9j() { // from class: l.hv10
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(literatures.id, ((LiteraturesComments) obj).literatureID));
            }
        }), i2, this, this.f13424f, this.f13428j);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Literatures getItem(int i) {
        if (vwb.J(this.f13421c)) {
            return null;
        }
        return this.f13421c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public boolean m15422H() {
        return !vwb.J(this.f13423e);
    }

    /* JADX INFO: renamed from: I */
    public void m15423I(View view) {
        RecyclerView.d0 d0VarFindContainingViewHolder = this.f13426h.findContainingViewHolder(view);
        if (NullChecker.a(d0VarFindContainingViewHolder) && this.f13427i.mo1570m0()) {
            this.f13421c.remove(d0VarFindContainingViewHolder.getAdapterPosition());
            if (vwb.J(this.f13421c)) {
                this.f13427i.mo1559h3();
            } else {
                notifyItemRemoved(d0VarFindContainingViewHolder.getAdapterPosition());
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m15424J(List<Literatures> list) {
        this.f13422d = list;
    }

    /* JADX INFO: renamed from: K */
    public void m15425K(Act act, List<Literatures> list, List<LiteraturesComments> list2, Map<String, Integer> map) {
        this.f13425g = act;
        this.f13421c = list;
        this.f13423e = list2;
        this.f13428j = map;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m15426L(boolean z) {
        this.f13424f = z;
        notifyDataSetChanged();
    }
}
