package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicItem;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s6h extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f12808c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f12809d;

    /* JADX INFO: renamed from: e */
    public l80<TopicMoment> f12810e;

    public s6h(Act act, l80<TopicMoment> l80Var) {
        this.f12809d = act;
        this.f12810e = l80Var;
    }

    /* JADX INFO: renamed from: H */
    private void m14025H(View view, final TopicMoment topicMoment) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.r6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12496a.m14026I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m14026I(TopicMoment topicMoment, View view) {
        vqg.m15542t0(topicMoment, this.f12809d);
        p6j0.m12913c("e_topic", "p_circle_detail", j760.a("topic_id", topicMoment.f708id), j760.a("is_create", Boolean.valueOf(topicMoment.owner.f220id.equals(FeedModule.m1139F().userId()))), j760.a("topic_type", zi60.m17436w().m17439E(topicMoment)), j760.a("topic_source", "circle_relate_topic"));
    }

    /* JADX INFO: renamed from: C */
    public int m14028C() {
        return this.f12808c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14029D(ViewGroup viewGroup, int i) {
        return new FeedGroupTopicItem(this.f12809d);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m14027A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedGroupTopicItem feedGroupTopicItem = (FeedGroupTopicItem) view;
        feedGroupTopicItem.m3030c(topicMoment);
        m14025H(feedGroupTopicItem, topicMoment);
        this.f12810e.m11594h(feedGroupTopicItem, this.f12808c.get(i2), i2);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f12808c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m14032J(List<TopicMoment> list) {
        this.f12808c = list;
        notifyDataSetChanged();
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f12810e.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f12810e.m11595i(d0Var.itemView);
    }
}
