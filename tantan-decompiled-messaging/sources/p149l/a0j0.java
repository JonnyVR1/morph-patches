package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a0j0 extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f67042c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f67043d;

    /* JADX INFO: renamed from: e */
    public l80 f67044e;

    /* JADX INFO: renamed from: f */
    public e30<TopicMoment> f67045f;

    public a0j0(Act act, l80 l80Var) {
        this.f67043d = act;
        this.f67044e = l80Var;
    }

    /* JADX INFO: renamed from: H */
    private void m94427H(View view, final TopicMoment topicMoment) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.zzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f205802a.m94428I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m94428I(TopicMoment topicMoment, View view) {
        if (NullChecker.m81303a(this.f67045f) && NullChecker.m81303a(topicMoment)) {
            this.f67045f.call(topicMoment);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f67042c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f67043d.inflater().inflate(o6c0.f142065L2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedPostTopicItemView feedPostTopicItemView = (FeedPostTopicItemView) view;
        feedPostTopicItemView.m61981d(topicMoment);
        m94427H(feedPostTopicItemView, topicMoment);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f67042c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m94431J(List<TopicMoment> list) {
        this.f67042c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m94432K(e30<TopicMoment> e30Var) {
        this.f67045f = e30Var;
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f67044e.m148839h(abstractC0566d0.itemView, this.f67042c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f67044e.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f67044e.m148840i(abstractC0566d0.itemView);
    }
}
