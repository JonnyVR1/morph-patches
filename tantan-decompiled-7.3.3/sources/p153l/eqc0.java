package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class eqc0 extends jic0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f95320c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f95321d;

    /* JADX INFO: renamed from: e */
    public String f95322e;

    /* JADX INFO: renamed from: f */
    public h80 f95323f;

    public eqc0(Act act, String str, h80 h80Var) {
        this.f95321d = act;
        this.f95322e = str;
        this.f95323f = h80Var;
    }

    /* JADX INFO: renamed from: I */
    private String m121907I() {
        return ("qa_latest".equals(this.f95322e) || "topic_latest".equals(this.f95322e)) ? "p_topic_latest" : "p_topic_recommend";
    }

    /* JADX INFO: renamed from: J */
    private void m121908J(View view, final TopicMoment topicMoment) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.dqc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f90194a.m121909K(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m121909K(TopicMoment topicMoment, View view) {
        m121911G(topicMoment);
        ksg.m151231t0(topicMoment, this.f95321d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f95320c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f95321d.inflater().inflate(tec0.f173493E3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicMoment topicMoment, int i, int i2) {
        TopicRecommendTopicItemView topicRecommendTopicItemView = (TopicRecommendTopicItemView) view;
        topicRecommendTopicItemView.m66443Q(topicMoment);
        m121908J(topicRecommendTopicItemView, topicMoment);
        if (i2 == getPageCount() - 1) {
            bnl0.m105539W(topicRecommendTopicItemView, qa00.m175859d(12.0f));
        } else {
            bnl0.m105539W(topicRecommendTopicItemView, 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m121911G(TopicMoment topicMoment) {
        tfj0.m190940c("e_related_topic_suggest", m121907I(), new pf60("topic_id", topicMoment.f40095id));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f95320c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m121913L(List<TopicMoment> list) {
        this.f95320c = list;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f95323f.m133881h(abstractC0569e0.itemView, this.f95320c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f95323f.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f95323f.m133882i(abstractC0569e0.itemView);
    }
}
