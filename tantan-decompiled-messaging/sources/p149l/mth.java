package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class mth extends dac0<TopicMoment> {

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> f135597c;

    /* JADX INFO: renamed from: d */
    public e30<TopicMoment> f135598d;

    /* JADX INFO: renamed from: e */
    public l80 f135599e;

    /* JADX INFO: renamed from: f */
    public Context f135600f;

    public mth(Context context, List<TopicMoment> list, l80 l80Var) {
        this.f135600f = context;
        this.f135597c = list;
        this.f135599e = l80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m156220I(TopicMoment topicMoment, View view) {
        e30<TopicMoment> e30Var = this.f135598d;
        if (e30Var != null) {
            e30Var.call(topicMoment);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f135597c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new FeedSelectTopicItem(viewGroup.getContext());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final TopicMoment topicMoment, int i, int i2) {
        FeedSelectTopicItem feedSelectTopicItem = (FeedSelectTopicItem) view;
        feedSelectTopicItem.f40012b.setText(String.format("#%s", topicMoment.name));
        feedSelectTopicItem.f40011a.m65133h().m65139n(topicMoment, t100.m186890d(8.0f));
        m156222G(topicMoment, feedSelectTopicItem);
        feedSelectTopicItem.setOnClickListener(new View.OnClickListener() { // from class: l.lth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f129965a.m156220I(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m156222G(TopicMoment topicMoment, FeedSelectTopicItem feedSelectTopicItem) {
        if (topicMoment.selected) {
            feedSelectTopicItem.f40012b.setTextColor(this.f135600f.getResources().getColor(e1c0.f88798n));
            feedSelectTopicItem.f40013c.setVisibility(0);
        } else {
            feedSelectTopicItem.f40012b.setTextColor(this.f135600f.getResources().getColor(e1c0.f88778d));
            feedSelectTopicItem.f40013c.setVisibility(8);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f135597c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m156224J(e30<TopicMoment> e30Var) {
        this.f135598d = e30Var;
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f135599e.m148839h(abstractC0566d0.itemView, this.f135597c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f135599e.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f135599e.m148840i(abstractC0566d0.itemView);
    }
}
