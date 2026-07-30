package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.data.CategoryTopic;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.view.FeedTopicBannerItemItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class tyi0 extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f172602c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f172603d;

    /* JADX INFO: renamed from: e */
    public int f172604e;

    /* JADX INFO: renamed from: f */
    public CategoryTopic f172605f;

    /* JADX INFO: renamed from: g */
    public int f172606g;

    /* JADX INFO: renamed from: h */
    public l80 f172607h;

    public tyi0(Act act, int i, int i2, l80 l80Var) {
        this.f172603d = act;
        this.f172604e = i;
        this.f172606g = i2;
        this.f172607h = l80Var;
    }

    /* JADX INFO: renamed from: I */
    private String m191040I() {
        if (!nkg.m159904s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f172604e;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: K */
    private void m191041K(View view, final TopicMoment topicMoment) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.syi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f166961a.m191042L(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m191042L(TopicMoment topicMoment, View view) {
        m191044G(topicMoment);
        vqg.m199572t0(topicMoment, this.f172603d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f172602c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f172603d.inflater().inflate(o6c0.f141998A3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedTopicBannerItemItemView feedTopicBannerItemItemView = (FeedTopicBannerItemItemView) view;
        feedTopicBannerItemItemView.m66364b(topicMoment);
        m191041K(feedTopicBannerItemItemView, topicMoment);
    }

    /* JADX INFO: renamed from: G */
    public final void m191044G(TopicMoment topicMoment) {
        p6j0.m167669c("e_discover_topic_item", m191040I(), (j760[]) m191046J(topicMoment).toArray(new j760[0]));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f172602c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final List<j760<String, String>> m191046J(TopicMoment topicMoment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("topic_page_seq", String.valueOf(this.f172606g)));
        arrayList.add(j760.m140076a("topic_id", topicMoment.f39247id));
        arrayList.add(j760.m140076a("topic_colume_name", this.f172605f.name));
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public void m191047M(CategoryTopic categoryTopic, List<TopicMoment> list) {
        this.f172605f = categoryTopic;
        this.f172602c = list;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f172607h.m148839h(abstractC0566d0.itemView, this.f172602c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f172607h.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f172607h.m148840i(abstractC0566d0.itemView);
    }
}
