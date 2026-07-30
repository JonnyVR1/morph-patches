package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aic0 extends dac0<RecommendUsers> {

    /* JADX INFO: renamed from: c */
    public List<RecommendUsers> f5752c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f5753d;

    /* JADX INFO: renamed from: e */
    public int f5754e;

    /* JADX INFO: renamed from: f */
    public String f5755f;

    /* JADX INFO: renamed from: g */
    public List<Moment> f5756g;

    /* JADX INFO: renamed from: h */
    public l80 f5757h;

    public aic0(Act act, int i, String str, l80 l80Var) {
        this.f5753d = act;
        this.f5754e = i;
        this.f5755f = str;
        this.f5757h = l80Var;
    }

    /* JADX INFO: renamed from: K */
    private String m8564K() {
        if (!nkg.m12263s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f5754e;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: C */
    public int m8566C() {
        return this.f5752c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m8567D(ViewGroup viewGroup, int i) {
        return this.f5753d.inflater().inflate(o6c0.f11049F3, viewGroup, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m8565A(View view, RecommendUsers recommendUsers, int i, int i2) {
        TopicRecommendUserItemView topicRecommendUserItemView = (TopicRecommendUserItemView) view;
        topicRecommendUserItemView.m6386o(this.f5753d, recommendUsers, m8571J(recommendUsers), m8564K());
        m8572L(topicRecommendUserItemView, recommendUsers);
        if (i2 == 0) {
            xdl0.V(topicRecommendUserItemView, t100.d(12.0f));
        } else if (i2 == m8566C() - 1) {
            xdl0.W(topicRecommendUserItemView, t100.d(12.0f));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m8569H(RecommendUsers recommendUsers) {
        p6j0.m12913c("e_user_suggest_card", m8564K(), new j760("card_user_id", recommendUsers.userId));
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public RecommendUsers getItem(int i) {
        return this.f5752c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final List<Moment> m8571J(RecommendUsers recommendUsers) {
        if (vwb.J(this.f5756g) || vwb.J(recommendUsers.momentIds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (final String str : recommendUsers.momentIds) {
            Moment moment = (Moment) vwb.r(this.f5756g, new w9j() { // from class: l.yhc0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((Moment) obj)).id.equals(str));
                }
            });
            if (NullChecker.a(moment)) {
                arrayList.add(moment);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final void m8572L(View view, final RecommendUsers recommendUsers) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.zhc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15739a.m8573M(recommendUsers, view2);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m8573M(RecommendUsers recommendUsers, View view) {
        m8569H(recommendUsers);
        Act act = this.f5753d;
        act.startActivity(vs0.m15565c(act, recommendUsers.userId, this.f5755f));
    }

    /* JADX INFO: renamed from: N */
    public void m8574N(j760<List<RecommendUsers>, List<Moment>> j760Var) {
        this.f5756g = (List) j760Var.b;
        this.f5752c = (List) j760Var.a;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f5757h.m11594h(d0Var.itemView, this.f5752c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f5757h.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f5757h.m11595i(d0Var.itemView);
    }
}
