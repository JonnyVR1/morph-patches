package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class xhc0 extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f192872c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f192873d;

    /* JADX INFO: renamed from: e */
    public String f192874e;

    /* JADX INFO: renamed from: f */
    public l80 f192875f;

    public xhc0(Act act, String str, l80 l80Var) {
        this.f192873d = act;
        this.f192874e = str;
        this.f192875f = l80Var;
    }

    /* JADX INFO: renamed from: I */
    private String m208780I() {
        return ("qa_latest".equals(this.f192874e) || "topic_latest".equals(this.f192874e)) ? "p_topic_latest" : "p_topic_recommend";
    }

    /* JADX INFO: renamed from: J */
    private void m208781J(View view, final TopicMoment topicMoment) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.whc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f186381a.m208782K(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m208782K(TopicMoment topicMoment, View view) {
        m208784G(topicMoment);
        vqg.m199572t0(topicMoment, this.f192873d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f192872c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f192873d.inflater().inflate(o6c0.f142024E3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicMoment topicMoment, int i, int i2) {
        TopicRecommendTopicItemView topicRecommendTopicItemView = (TopicRecommendTopicItemView) view;
        topicRecommendTopicItemView.m65260Q(topicMoment);
        m208781J(topicRecommendTopicItemView, topicMoment);
        if (i2 == getPageCount() - 1) {
            xdl0.m208359W(topicRecommendTopicItemView, t100.m186890d(12.0f));
        } else {
            xdl0.m208359W(topicRecommendTopicItemView, 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m208784G(TopicMoment topicMoment) {
        p6j0.m167669c("e_related_topic_suggest", m208780I(), new j760("topic_id", topicMoment.f39247id));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f192872c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m208786L(List<TopicMoment> list) {
        this.f192872c = list;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f192875f.m148839h(abstractC0566d0.itemView, this.f192872c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f192875f.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f192875f.m148840i(abstractC0566d0.itemView);
    }
}
