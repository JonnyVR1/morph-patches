package p007l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import java.util.List;
import l.dac0;
import l.e30;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mth extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f10569c;

    /* JADX INFO: renamed from: d */
    public e30<TopicMoment> f10570d;

    /* JADX INFO: renamed from: e */
    public l80 f10571e;

    /* JADX INFO: renamed from: f */
    public Context f10572f;

    public mth(Context context, List<TopicMoment> list, l80 l80Var) {
        this.f10572f = context;
        this.f10569c = list;
        this.f10571e = l80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m12027I(TopicMoment topicMoment, View view) {
        e30<TopicMoment> e30Var = this.f10570d;
        if (e30Var != null) {
            e30Var.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m12029C() {
        return this.f10569c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m12030D(ViewGroup viewGroup, int i) {
        return new FeedSelectTopicItem(viewGroup.getContext());
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m12028A(View view, final TopicMoment topicMoment, int i, int i2) {
        FeedSelectTopicItem feedSelectTopicItem = (FeedSelectTopicItem) view;
        feedSelectTopicItem.f1473b.setText(String.format("#%s", topicMoment.name));
        feedSelectTopicItem.f1472a.m6234h().m6240n(topicMoment, t100.d(8.0f));
        m12032G(topicMoment, feedSelectTopicItem);
        feedSelectTopicItem.setOnClickListener(new View.OnClickListener() { // from class: l.lth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10131a.m12027I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m12032G(TopicMoment topicMoment, FeedSelectTopicItem feedSelectTopicItem) {
        if (topicMoment.selected) {
            feedSelectTopicItem.f1473b.setTextColor(this.f10572f.getResources().getColor(e1c0.f7154n));
            feedSelectTopicItem.f1474c.setVisibility(0);
        } else {
            feedSelectTopicItem.f1473b.setTextColor(this.f10572f.getResources().getColor(e1c0.f7134d));
            feedSelectTopicItem.f1474c.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f10569c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m12034J(e30<TopicMoment> e30Var) {
        this.f10570d = e30Var;
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f10571e.m11594h(d0Var.itemView, this.f10569c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f10571e.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f10571e.m11595i(d0Var.itemView);
    }
}
