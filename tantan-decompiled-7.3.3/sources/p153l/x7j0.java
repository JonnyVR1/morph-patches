package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.data.CategoryTopic;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.view.FeedTopicBannerItemItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class x7j0 extends jic0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f192724c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f192725d;

    /* JADX INFO: renamed from: e */
    public int f192726e;

    /* JADX INFO: renamed from: f */
    public CategoryTopic f192727f;

    /* JADX INFO: renamed from: g */
    public int f192728g;

    /* JADX INFO: renamed from: h */
    public h80 f192729h;

    public x7j0(Act act, int i, int i2, h80 h80Var) {
        this.f192725d = act;
        this.f192726e = i;
        this.f192728g = i2;
        this.f192729h = h80Var;
    }

    /* JADX INFO: renamed from: I */
    private String m209636I() {
        if (!cmg.m111233s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f192726e;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: K */
    private void m209637K(View view, final TopicMoment topicMoment) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.w7j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f187765a.m209638L(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m209638L(TopicMoment topicMoment, View view) {
        m209640G(topicMoment);
        ksg.m151231t0(topicMoment, this.f192725d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f192724c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f192725d.inflater().inflate(tec0.f173467A3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedTopicBannerItemItemView feedTopicBannerItemItemView = (FeedTopicBannerItemItemView) view;
        feedTopicBannerItemItemView.m67547b(topicMoment);
        m209637K(feedTopicBannerItemItemView, topicMoment);
    }

    /* JADX INFO: renamed from: G */
    public final void m209640G(TopicMoment topicMoment) {
        tfj0.m190940c("e_discover_topic_item", m209636I(), (pf60[]) m209642J(topicMoment).toArray(new pf60[0]));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f192724c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final List<pf60<String, String>> m209642J(TopicMoment topicMoment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("topic_page_seq", String.valueOf(this.f192728g)));
        arrayList.add(pf60.m172085a("topic_id", topicMoment.f40095id));
        arrayList.add(pf60.m172085a("topic_colume_name", this.f192727f.name));
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public void m209643M(CategoryTopic categoryTopic, List<TopicMoment> list) {
        this.f192727f = categoryTopic;
        this.f192724c = list;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f192729h.m133881h(abstractC0569e0.itemView, this.f192724c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f192729h.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f192729h.m133882i(abstractC0569e0.itemView);
    }
}
