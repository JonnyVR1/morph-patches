package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicCategoryItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class a8j0 extends jic0<TopicCategorie> {

    /* JADX INFO: renamed from: c */
    public List<TopicCategorie> f68925c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f68926d;

    /* JADX INFO: renamed from: e */
    public h80 f68927e;

    /* JADX INFO: renamed from: f */
    public y20<TopicCategorie> f68928f;

    public a8j0(Act act, h80 h80Var) {
        this.f68926d = act;
        this.f68927e = h80Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f68925c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f68926d.inflater().inflate(tec0.f173522J2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicCategorie topicCategorie, int i, int i2) {
        FeedPostTopicCategoryItemView feedPostTopicCategoryItemView = (FeedPostTopicCategoryItemView) view;
        feedPostTopicCategoryItemView.m63160b(topicCategorie);
        bnl0.m105538V(feedPostTopicCategoryItemView, i2 == 0 ? qa00.m175859d(16.0f) : 0);
        m96476H(feedPostTopicCategoryItemView, topicCategorie);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicCategorie getItem(int i) {
        return this.f68925c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m96476H(View view, final TopicCategorie topicCategorie) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.z7j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f203250a.m96477I(topicCategorie, view2);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m96477I(TopicCategorie topicCategorie, View view) {
        tfj0.m190940c("e_topic_category", "p_pick_topic", pf60.m172085a("topic_category_name", topicCategorie.name));
        if (NullChecker.m82486a(this.f68928f)) {
            this.f68928f.call(topicCategorie);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m96478J(List<TopicCategorie> list) {
        this.f68925c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m96479K(y20<TopicCategorie> y20Var) {
        this.f68928f = y20Var;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f68927e.m133881h(abstractC0569e0.itemView, this.f68925c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f68927e.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f68927e.m133882i(abstractC0569e0.itemView);
    }
}
