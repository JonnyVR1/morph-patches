package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a0j0 extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f5542c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f5543d;

    /* JADX INFO: renamed from: e */
    public l80 f5544e;

    /* JADX INFO: renamed from: f */
    public e30<TopicMoment> f5545f;

    public a0j0(Act act, l80 l80Var) {
        this.f5543d = act;
        this.f5544e = l80Var;
    }

    /* JADX INFO: renamed from: H */
    private void m8388H(View view, final TopicMoment topicMoment) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.zzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15974a.m8389I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m8389I(TopicMoment topicMoment, View view) {
        if (NullChecker.a(this.f5545f) && NullChecker.a(topicMoment)) {
            this.f5545f.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m8391C() {
        return this.f5542c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m8392D(ViewGroup viewGroup, int i) {
        return this.f5543d.inflater().inflate(o6c0.f11084L2, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m8390A(View view, TopicMoment topicMoment, int i, int i2) {
        FeedPostTopicItemView feedPostTopicItemView = (FeedPostTopicItemView) view;
        feedPostTopicItemView.m2955d(topicMoment);
        m8388H(feedPostTopicItemView, topicMoment);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f5542c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m8395J(List<TopicMoment> list) {
        this.f5542c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m8396K(e30<TopicMoment> e30Var) {
        this.f5545f = e30Var;
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f5544e.m11594h(d0Var.itemView, this.f5542c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f5544e.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f5544e.m11595i(d0Var.itemView);
    }
}
