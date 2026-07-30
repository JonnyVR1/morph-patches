package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.view.FeedTopicBannerItemItemView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tyi0 extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f13472c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f13473d;

    /* JADX INFO: renamed from: e */
    public int f13474e;

    /* JADX INFO: renamed from: f */
    public CategoryTopic f13475f;

    /* JADX INFO: renamed from: g */
    public int f13476g;

    /* JADX INFO: renamed from: h */
    public l80 f13477h;

    public tyi0(Act act, int i, int i2, l80 l80Var) {
        this.f13473d = act;
        this.f13474e = i;
        this.f13476g = i2;
        this.f13477h = l80Var;
    }

    /* JADX INFO: renamed from: I */
    private String m14688I() {
        if (!nkg.m12263s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f13474e;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: K */
    private void m14689K(View view, final TopicMoment topicMoment) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.syi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13132a.m14690L(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m14690L(TopicMoment topicMoment, View view) {
        m14695G(topicMoment);
        vqg.m15542t0(topicMoment, this.f13473d);
    }

    /* JADX INFO: renamed from: C */
    public int m14692C() {
        return this.f13472c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14693D(ViewGroup viewGroup, int i) {
        return this.f13473d.inflater().inflate(o6c0.f11017A3, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m14691A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedTopicBannerItemItemView feedTopicBannerItemItemView = (FeedTopicBannerItemItemView) view;
        feedTopicBannerItemItemView.m7529b(topicMoment);
        m14689K(feedTopicBannerItemItemView, topicMoment);
    }

    /* JADX INFO: renamed from: G */
    public final void m14695G(TopicMoment topicMoment) {
        p6j0.m12913c("e_discover_topic_item", m14688I(), (j760[]) m14697J(topicMoment).toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f13472c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final List<j760<String, String>> m14697J(TopicMoment topicMoment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("topic_page_seq", String.valueOf(this.f13476g)));
        arrayList.add(j760.a("topic_id", topicMoment.f708id));
        arrayList.add(j760.a("topic_colume_name", this.f13475f.name));
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public void m14698M(CategoryTopic categoryTopic, List<TopicMoment> list) {
        this.f13475f = categoryTopic;
        this.f13472c = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f13477h.m11594h(d0Var.itemView, this.f13472c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f13477h.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f13477h.m11595i(d0Var.itemView);
    }
}
