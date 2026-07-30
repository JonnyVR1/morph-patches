package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupItemView;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class sng extends jic0<Group> {

    /* JADX INFO: renamed from: c */
    public List<Group> f169687c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f169688d;

    /* JADX INFO: renamed from: e */
    public int f169689e;

    public sng(Act act, int i) {
        this.f169688d = act;
        this.f169689e = i;
    }

    /* JADX INFO: renamed from: H */
    private void m186917H(View view, final Group group) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.rng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f164037a.m186918I(group, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m186918I(Group group, View view) {
        Act act = this.f169688d;
        act.startActivity(new FeedGroupDetailAct.C11363a(act, group.f56859id).m63170a());
        tfj0.m190940c("e_circle_card", "p_circle_list", new pf60("circle_id", group.f56859id), new pf60("circle_source", this.f169689e == 0 ? "joined" : SuperlikeReason.popular));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f169687c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f169688d.inflater().inflate(tec0.f173470B, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Group group, int i, int i2) {
        FeedAllGroupItemView feedAllGroupItemView = (FeedAllGroupItemView) view;
        feedAllGroupItemView.m63093z(group, this.f169689e);
        m186917H(feedAllGroupItemView, group);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Group getItem(int i) {
        return this.f169687c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m186921J(List<Group> list) {
        this.f169687c = list;
        notifyDataSetChanged();
    }
}
