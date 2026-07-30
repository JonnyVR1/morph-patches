package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class h8h extends jic0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f108240c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f108241d;

    /* JADX INFO: renamed from: e */
    public h80<TopicMoment> f108242e;

    public h8h(Act act, h80<TopicMoment> h80Var) {
        this.f108241d = act;
        this.f108242e = h80Var;
    }

    /* JADX INFO: renamed from: H */
    private void m133933H(View view, final TopicMoment topicMoment) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.g8h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f102686a.m133934I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m133934I(TopicMoment topicMoment, View view) {
        ksg.m151231t0(topicMoment, this.f108241d);
        tfj0.m190940c("e_topic", "p_circle_detail", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("is_create", Boolean.valueOf(topicMoment.owner.f39607id.equals(FeedModule.m61405F().userId()))), pf60.m172085a("topic_type", er60.m122104w().m122107E(topicMoment)), pf60.m172085a("topic_source", "circle_relate_topic"));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f108240c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new FeedGroupTopicItem(this.f108241d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedGroupTopicItem feedGroupTopicItem = (FeedGroupTopicItem) view;
        feedGroupTopicItem.m63232c(topicMoment);
        m133933H(feedGroupTopicItem, topicMoment);
        this.f108242e.m133881h(feedGroupTopicItem, this.f108240c.get(i2), i2);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f108240c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m133937J(List<TopicMoment> list) {
        this.f108240c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f108242e.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f108242e.m133882i(abstractC0569e0.itemView);
    }
}
