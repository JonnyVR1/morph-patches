package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h0j0 extends eac0<TopicMoment> {

    /* JADX INFO: renamed from: e */
    public static List<TopicMoment> f105223e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f105224d;

    public h0j0(Act act) {
        this.f105224d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m128960I(TopicMoment topicMoment, View view) {
        if (topicMoment.isTopicLinkType()) {
            Act act = this.f105224d;
            act.startActivity(kjb0.m146199j(act, topicMoment.getTopicNameWithPrefix(), topicMoment.landingPage));
        } else if (topicMoment.isTopicVoteType()) {
            Act act2 = this.f105224d;
            act2.startActivity(TopicVoteAggregationAct.m66171V1(act2, topicMoment.f39247id, topicMoment.owner.f38759id, User.ID_TEAM_ACCOUNT));
        } else if (topicMoment.isQATopicType()) {
            Act act3 = this.f105224d;
            act3.startActivity(QATopicAggregationActivity.m65975V1(act3, topicMoment.f39247id, "from_topic_nearby_header"));
        } else {
            String strM218964E = zi60.m218961w().m218964E(topicMoment);
            Act act4 = this.f105224d;
            act4.startActivity(TopicAggregationAct.m66081V1(act4, topicMoment.f39247id, "from_topic_nearby_header", true, strM218964E));
        }
        if (this.f105224d instanceof FeedGroupDetailAct) {
            p6j0.m167669c("e_topic", "p_circle_detail", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("is_create", Boolean.valueOf(topicMoment.owner.f38759id.equals(FeedModule.m60221F().userId()))), j760.m140076a("topic_type", zi60.m218961w().m218964E(topicMoment)), j760.m140076a("topic_source", "circle_hot_topic"));
        } else {
            zi60.m218961w().m218969a(topicMoment, OMSDialogPositon.p_nearby);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return f105223e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        TopicListItemView topicListItemView = new TopicListItemView(this.f105224d);
        topicListItemView.setContentLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return topicListItemView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final TopicMoment topicMoment, int i, int i2) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m66121S(topicMoment);
        xdl0.m208329E0(topicListItemView, new View.OnClickListener() { // from class: l.g0j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f100047a.m128960I(topicMoment, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return f105223e.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m128963J(List<TopicMoment> list) {
        f105223e = list;
        notifyDataSetChanged();
    }
}
