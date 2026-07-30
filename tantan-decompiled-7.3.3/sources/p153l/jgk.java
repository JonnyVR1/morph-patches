package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class jgk extends jic0<Group> {

    /* JADX INFO: renamed from: c */
    public List<Group> f120736c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f120737d;

    /* JADX INFO: renamed from: e */
    public h80 f120738e;

    public jgk(Act act, h80 h80Var) {
        this.f120737d = act;
        this.f120738e = h80Var;
    }

    /* JADX INFO: renamed from: K */
    private String m144778K() {
        return cmg.m111233s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f120736c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f120737d.inflater().inflate(tec0.f173484D0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Group group, int i, int i2) {
        FeedGroupEntranceItemView feedGroupEntranceItemView = (FeedGroupEntranceItemView) view;
        feedGroupEntranceItemView.m63066s(group);
        m144784L(feedGroupEntranceItemView, group);
        if (i2 == getPageCount() - 1) {
            bnl0.m105539W(feedGroupEntranceItemView, m144783J(group));
        } else {
            bnl0.m105539W(feedGroupEntranceItemView, 0);
        }
        if (i2 == 0) {
            bnl0.m105538V(feedGroupEntranceItemView, m144783J(group));
        } else {
            bnl0.m105538V(feedGroupEntranceItemView, qa00.m175859d(12.0f));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m144780G(Group group) {
        tfj0.m190940c("e_circle", m144778K(), new pf60("circle_id", group.f56859id), new pf60("circle_source", m144781H()));
    }

    /* JADX INFO: renamed from: H */
    public final String m144781H() {
        if (cmg.m111233s()) {
            return "dating";
        }
        User userMe_ = FeedModule.m61406H().me_();
        return (NullChecker.m82486a(userMe_) && userMe_.isFemale()) ? "recommend" : "nearby";
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Group getItem(int i) {
        return this.f120736c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final int m144783J(Group group) {
        return group.unReadMomentCounter > 0 ? qa00.m175859d(17.0f) / 2 : qa00.m175859d(12.0f);
    }

    /* JADX INFO: renamed from: L */
    public final void m144784L(View view, final Group group) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.igk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114794a.m144785M(group, view2);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m144785M(Group group, View view) {
        m144780G(group);
        Act act = this.f120737d;
        act.startActivity(new FeedGroupDetailAct.C11363a(act, group.f56859id).m63170a());
    }

    /* JADX INFO: renamed from: N */
    public void m144786N(List<Group> list) {
        this.f120736c = list;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f120738e.m133881h(abstractC0569e0.itemView, this.f120736c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f120738e.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f120738e.m133882i(abstractC0569e0.itemView);
    }
}
