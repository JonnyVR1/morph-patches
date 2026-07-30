package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l9j0 extends kic0<TopicMoment> {

    /* JADX INFO: renamed from: e */
    public static List<TopicMoment> f130610e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f130611d;

    public l9j0(Act act) {
        this.f130611d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m153431I(TopicMoment topicMoment, View view) {
        if (topicMoment.isTopicLinkType()) {
            Act act = this.f130611d;
            act.startActivity(orb0.m168893j(act, topicMoment.getTopicNameWithPrefix(), topicMoment.landingPage));
        } else if (topicMoment.isTopicVoteType()) {
            Act act2 = this.f130611d;
            act2.startActivity(TopicVoteAggregationAct.m67354X1(act2, topicMoment.f40095id, topicMoment.owner.f39607id, User.ID_TEAM_ACCOUNT));
        } else if (topicMoment.isQATopicType()) {
            Act act3 = this.f130611d;
            act3.startActivity(QATopicAggregationActivity.m67158X1(act3, topicMoment.f40095id, "from_topic_nearby_header"));
        } else {
            String strM122107E = er60.m122104w().m122107E(topicMoment);
            Act act4 = this.f130611d;
            act4.startActivity(TopicAggregationAct.m67264X1(act4, topicMoment.f40095id, "from_topic_nearby_header", true, strM122107E));
        }
        if (this.f130611d instanceof FeedGroupDetailAct) {
            tfj0.m190940c("e_topic", "p_circle_detail", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("is_create", Boolean.valueOf(topicMoment.owner.f39607id.equals(FeedModule.m61405F().userId()))), pf60.m172085a("topic_type", er60.m122104w().m122107E(topicMoment)), pf60.m172085a("topic_source", "circle_hot_topic"));
        } else {
            er60.m122104w().m122112a(topicMoment, OMSDialogPositon.p_nearby);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return f130610e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        TopicListItemView topicListItemView = new TopicListItemView(this.f130611d);
        topicListItemView.setContentLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return topicListItemView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final TopicMoment topicMoment, int i, int i2) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m67304S(topicMoment);
        bnl0.m105509E0(topicListItemView, new View.OnClickListener() { // from class: l.k9j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124552a.m153431I(topicMoment, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return f130610e.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m153434J(List<TopicMoment> list) {
        f130610e = list;
        notifyDataSetChanged();
    }
}
