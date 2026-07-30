package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h0j0 extends eac0<TopicMoment> {

    /* JADX INFO: renamed from: e */
    public static List<TopicMoment> f8546e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f8547d;

    public h0j0(Act act) {
        this.f8547d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m10507I(TopicMoment topicMoment, View view) {
        if (topicMoment.isTopicLinkType()) {
            Act act = this.f8547d;
            act.startActivity(kjb0.m11458j(act, topicMoment.getTopicNameWithPrefix(), topicMoment.landingPage));
        } else if (topicMoment.isTopicVoteType()) {
            Act act2 = this.f8547d;
            act2.startActivity(TopicVoteAggregationAct.m7327V1(act2, topicMoment.f708id, topicMoment.owner.f220id, User.ID_TEAM_ACCOUNT));
        } else if (topicMoment.isQATopicType()) {
            Act act3 = this.f8547d;
            act3.startActivity(QATopicAggregationActivity.m7127V1(act3, topicMoment.f708id, "from_topic_nearby_header"));
        } else {
            String strM17439E = zi60.m17436w().m17439E(topicMoment);
            Act act4 = this.f8547d;
            act4.startActivity(TopicAggregationAct.m7233V1(act4, topicMoment.f708id, "from_topic_nearby_header", true, strM17439E));
        }
        if (this.f8547d instanceof FeedGroupDetailAct) {
            p6j0.m12913c("e_topic", "p_circle_detail", j760.a("topic_id", topicMoment.f708id), j760.a("is_create", Boolean.valueOf(topicMoment.owner.f220id.equals(FeedModule.m1139F().userId()))), j760.a("topic_type", zi60.m17436w().m17439E(topicMoment)), j760.a("topic_source", "circle_hot_topic"));
        } else {
            zi60.m17436w().m17444a(topicMoment, OMSDialogPositon.p_nearby);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m10509C() {
        return f8546e.size();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView] */
    /* JADX INFO: renamed from: D */
    public View m10510D(ViewGroup viewGroup, int i) {
        ?? topicListItemView = new TopicListItemView(this.f8547d);
        topicListItemView.setContentLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return topicListItemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView] */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m10508A(View view, final TopicMoment topicMoment, int i, int i2) {
        ?? r1 = (TopicListItemView) view;
        r1.m7273S(topicMoment);
        xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.g0j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8293a.m10507I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return f8546e.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m10513J(List<TopicMoment> list) {
        f8546e = list;
        notifyDataSetChanged();
    }
}
