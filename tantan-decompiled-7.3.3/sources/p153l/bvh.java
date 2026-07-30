package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bvh extends jic0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f78593c;

    /* JADX INFO: renamed from: d */
    public y20<TopicMoment> f78594d;

    /* JADX INFO: renamed from: e */
    public h80 f78595e;

    /* JADX INFO: renamed from: f */
    public Context f78596f;

    public bvh(Context context, List<TopicMoment> list, h80 h80Var) {
        this.f78596f = context;
        this.f78593c = list;
        this.f78595e = h80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m106568I(TopicMoment topicMoment, View view) {
        y20<TopicMoment> y20Var = this.f78594d;
        if (y20Var != null) {
            y20Var.call(topicMoment);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f78593c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new FeedSelectTopicItem(viewGroup.getContext());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final TopicMoment topicMoment, int i, int i2) {
        FeedSelectTopicItem feedSelectTopicItem = (FeedSelectTopicItem) view;
        feedSelectTopicItem.f40860b.setText(String.format("#%s", topicMoment.name));
        feedSelectTopicItem.f40859a.m66316h().m66322n(topicMoment, qa00.m175859d(8.0f));
        m106570G(topicMoment, feedSelectTopicItem);
        feedSelectTopicItem.setOnClickListener(new View.OnClickListener() { // from class: l.avh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f73620a.m106568I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m106570G(TopicMoment topicMoment, FeedSelectTopicItem feedSelectTopicItem) {
        if (topicMoment.selected) {
            feedSelectTopicItem.f40860b.setTextColor(this.f78596f.getResources().getColor(k9c0.f124521n));
            feedSelectTopicItem.f40861c.setVisibility(0);
        } else {
            feedSelectTopicItem.f40860b.setTextColor(this.f78596f.getResources().getColor(k9c0.f124501d));
            feedSelectTopicItem.f40861c.setVisibility(8);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f78593c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m106572J(y20<TopicMoment> y20Var) {
        this.f78594d = y20Var;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f78595e.m133881h(abstractC0569e0.itemView, this.f78593c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f78595e.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f78595e.m133882i(abstractC0569e0.itemView);
    }
}
