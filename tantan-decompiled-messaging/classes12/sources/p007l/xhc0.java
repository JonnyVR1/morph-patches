package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xhc0 extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f14901c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f14902d;

    /* JADX INFO: renamed from: e */
    public String f14903e;

    /* JADX INFO: renamed from: f */
    public l80 f14904f;

    public xhc0(Act act, String str, l80 l80Var) {
        this.f14902d = act;
        this.f14903e = str;
        this.f14904f = l80Var;
    }

    /* JADX INFO: renamed from: I */
    private String m16087I() {
        return ("qa_latest".equals(this.f14903e) || "topic_latest".equals(this.f14903e)) ? "p_topic_latest" : "p_topic_recommend";
    }

    /* JADX INFO: renamed from: J */
    private void m16088J(View view, final TopicMoment topicMoment) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.whc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14546a.m16089K(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m16089K(TopicMoment topicMoment, View view) {
        m16094G(topicMoment);
        vqg.m15542t0(topicMoment, this.f14902d);
    }

    /* JADX INFO: renamed from: C */
    public int m16091C() {
        return this.f14901c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16092D(ViewGroup viewGroup, int i) {
        return this.f14902d.inflater().inflate(o6c0.f11043E3, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendTopicItemView] */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m16090A(View view, TopicMoment topicMoment, int i, int i2) {
        ?? r1 = (TopicRecommendTopicItemView) view;
        r1.m6361Q(topicMoment);
        m16088J(r1, topicMoment);
        if (i2 == m16091C() - 1) {
            xdl0.W((View) r1, t100.d(12.0f));
        } else {
            xdl0.W((View) r1, 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m16094G(TopicMoment topicMoment) {
        p6j0.m12913c("e_related_topic_suggest", m16087I(), new j760("topic_id", topicMoment.f708id));
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f14901c.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m16096L(List<TopicMoment> list) {
        this.f14901c = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f14904f.m11594h(d0Var.itemView, this.f14901c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f14904f.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f14904f.m11595i(d0Var.itemView);
    }
}
