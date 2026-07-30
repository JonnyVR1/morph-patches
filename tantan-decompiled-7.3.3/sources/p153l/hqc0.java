package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class hqc0 extends jic0<RecommendUsers> {

    /* JADX INFO: renamed from: c */
    public List<RecommendUsers> f111106c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f111107d;

    /* JADX INFO: renamed from: e */
    public int f111108e;

    /* JADX INFO: renamed from: f */
    public String f111109f;

    /* JADX INFO: renamed from: g */
    public List<Moment> f111110g;

    /* JADX INFO: renamed from: h */
    public h80 f111111h;

    public hqc0(Act act, int i, String str, h80 h80Var) {
        this.f111107d = act;
        this.f111108e = i;
        this.f111109f = str;
        this.f111111h = h80Var;
    }

    /* JADX INFO: renamed from: K */
    private String m136611K() {
        if (!cmg.m111233s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f111108e;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f111106c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f111107d.inflater().inflate(tec0.f173499F3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, RecommendUsers recommendUsers, int i, int i2) {
        TopicRecommendUserItemView topicRecommendUserItemView = (TopicRecommendUserItemView) view;
        topicRecommendUserItemView.m66468o(this.f111107d, recommendUsers, m136615J(recommendUsers), m136611K());
        m136616L(topicRecommendUserItemView, recommendUsers);
        if (i2 == 0) {
            bnl0.m105538V(topicRecommendUserItemView, qa00.m175859d(12.0f));
        } else if (i2 == getPageCount() - 1) {
            bnl0.m105539W(topicRecommendUserItemView, qa00.m175859d(12.0f));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m136613H(RecommendUsers recommendUsers) {
        tfj0.m190940c("e_user_suggest_card", m136611K(), new pf60("card_user_id", recommendUsers.userId));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public RecommendUsers getItem(int i) {
        return this.f111106c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final List<Moment> m136615J(RecommendUsers recommendUsers) {
        if (jyb.m147479J(this.f111110g) || jyb.m147479J(recommendUsers.momentIds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (final String str : recommendUsers.momentIds) {
            Moment moment = (Moment) jyb.m147529r(this.f111110g, new qcj() { // from class: l.fqc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).f56859id.equals(str));
                }
            });
            if (NullChecker.m82486a(moment)) {
                arrayList.add(moment);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final void m136616L(View view, final RecommendUsers recommendUsers) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.gqc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f105672a.m136617M(recommendUsers, view2);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m136617M(RecommendUsers recommendUsers, View view) {
        m136613H(recommendUsers);
        Act act = this.f111107d;
        act.startActivity(at0.m100009c(act, recommendUsers.userId, this.f111109f));
    }

    /* JADX INFO: renamed from: N */
    public void m136618N(pf60<List<RecommendUsers>, List<Moment>> pf60Var) {
        this.f111110g = pf60Var.f152157b;
        this.f111106c = pf60Var.f152156a;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f111111h.m133881h(abstractC0569e0.itemView, this.f111106c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f111111h.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f111111h.m133882i(abstractC0569e0.itemView);
    }
}
