package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e9j0 extends jic0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f92644c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f92645d;

    /* JADX INFO: renamed from: e */
    public h80 f92646e;

    /* JADX INFO: renamed from: f */
    public y20<TopicMoment> f92647f;

    public e9j0(Act act, h80 h80Var) {
        this.f92645d = act;
        this.f92646e = h80Var;
    }

    /* JADX INFO: renamed from: H */
    private void m119923H(View view, final TopicMoment topicMoment) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.d9j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f85790a.m119924I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m119924I(TopicMoment topicMoment, View view) {
        if (NullChecker.m82486a(this.f92647f) && NullChecker.m82486a(topicMoment)) {
            this.f92647f.call(topicMoment);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f92644c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f92645d.inflater().inflate(tec0.f173534L2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedPostTopicItemView feedPostTopicItemView = (FeedPostTopicItemView) view;
        feedPostTopicItemView.m63164d(topicMoment);
        m119923H(feedPostTopicItemView, topicMoment);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f92644c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m119927J(List<TopicMoment> list) {
        this.f92644c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m119928K(y20<TopicMoment> y20Var) {
        this.f92647f = y20Var;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f92646e.m133881h(abstractC0569e0.itemView, this.f92644c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f92646e.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f92646e.m133882i(abstractC0569e0.itemView);
    }
}
