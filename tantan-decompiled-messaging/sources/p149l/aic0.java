package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RecommendUsers;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class aic0 extends dac0<RecommendUsers> {

    /* JADX INFO: renamed from: c */
    public List<RecommendUsers> f69968c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f69969d;

    /* JADX INFO: renamed from: e */
    public int f69970e;

    /* JADX INFO: renamed from: f */
    public String f69971f;

    /* JADX INFO: renamed from: g */
    public List<Moment> f69972g;

    /* JADX INFO: renamed from: h */
    public l80 f69973h;

    public aic0(Act act, int i, String str, l80 l80Var) {
        this.f69969d = act;
        this.f69970e = i;
        this.f69971f = str;
        this.f69973h = l80Var;
    }

    /* JADX INFO: renamed from: K */
    private String m96796K() {
        if (!nkg.m159904s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f69970e;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f69968c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f69969d.inflater().inflate(o6c0.f142030F3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, RecommendUsers recommendUsers, int i, int i2) {
        TopicRecommendUserItemView topicRecommendUserItemView = (TopicRecommendUserItemView) view;
        topicRecommendUserItemView.m65285o(this.f69969d, recommendUsers, m96800J(recommendUsers), m96796K());
        m96801L(topicRecommendUserItemView, recommendUsers);
        if (i2 == 0) {
            xdl0.m208358V(topicRecommendUserItemView, t100.m186890d(12.0f));
        } else if (i2 == getPageCount() - 1) {
            xdl0.m208359W(topicRecommendUserItemView, t100.m186890d(12.0f));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m96798H(RecommendUsers recommendUsers) {
        p6j0.m167669c("e_user_suggest_card", m96796K(), new j760("card_user_id", recommendUsers.userId));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public RecommendUsers getItem(int i) {
        return this.f69968c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final List<Moment> m96800J(RecommendUsers recommendUsers) {
        if (vwb.m200296J(this.f69972g) || vwb.m200296J(recommendUsers.momentIds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (final String str : recommendUsers.momentIds) {
            Moment moment = (Moment) vwb.m200346r(this.f69972g, new w9j() { // from class: l.yhc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Moment) obj).f56011id.equals(str));
                }
            });
            if (NullChecker.m81303a(moment)) {
                arrayList.add(moment);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public final void m96801L(View view, final RecommendUsers recommendUsers) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.zhc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f203159a.m96802M(recommendUsers, view2);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m96802M(RecommendUsers recommendUsers, View view) {
        m96798H(recommendUsers);
        Act act = this.f69969d;
        act.startActivity(vs0.m199797c(act, recommendUsers.userId, this.f69971f));
    }

    /* JADX INFO: renamed from: N */
    public void m96803N(j760<List<RecommendUsers>, List<Moment>> j760Var) {
        this.f69972g = j760Var.f116565b;
        this.f69968c = j760Var.f116564a;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f69973h.m148839h(abstractC0566d0.itemView, this.f69968c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f69973h.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f69973h.m148840i(abstractC0566d0.itemView);
    }
}
