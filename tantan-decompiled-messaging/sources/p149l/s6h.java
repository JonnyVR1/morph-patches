package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class s6h extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f162822c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f162823d;

    /* JADX INFO: renamed from: e */
    public l80<TopicMoment> f162824e;

    public s6h(Act act, l80<TopicMoment> l80Var) {
        this.f162823d = act;
        this.f162824e = l80Var;
    }

    /* JADX INFO: renamed from: H */
    private void m182448H(View view, final TopicMoment topicMoment) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.r6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f157938a.m182449I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m182449I(TopicMoment topicMoment, View view) {
        vqg.m199572t0(topicMoment, this.f162823d);
        p6j0.m167669c("e_topic", "p_circle_detail", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("is_create", Boolean.valueOf(topicMoment.owner.f38759id.equals(FeedModule.m60221F().userId()))), j760.m140076a("topic_type", zi60.m218961w().m218964E(topicMoment)), j760.m140076a("topic_source", "circle_relate_topic"));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f162822c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new FeedGroupTopicItem(this.f162823d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedGroupTopicItem feedGroupTopicItem = (FeedGroupTopicItem) view;
        feedGroupTopicItem.m62049c(topicMoment);
        m182448H(feedGroupTopicItem, topicMoment);
        this.f162824e.m148839h(feedGroupTopicItem, this.f162822c.get(i2), i2);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f162822c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m182452J(List<TopicMoment> list) {
        this.f162822c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f162824e.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f162824e.m148840i(abstractC0566d0.itemView);
    }
}
