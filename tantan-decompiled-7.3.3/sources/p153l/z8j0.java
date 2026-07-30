package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class z8j0 extends r4h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public FeedPostSelectedTopicsView f203393f;

    /* JADX INFO: renamed from: g */
    public boolean f203394g;

    /* JADX INFO: renamed from: h */
    public y20<TopicMoment> f203395h;

    public z8j0(@NonNull List<TopicMoment> list, FeedPostSelectedTopicsView feedPostSelectedTopicsView, boolean z) {
        super(list);
        this.f203393f = feedPostSelectedTopicsView;
        this.f203394g = z;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        GroupTopicListCombineItemView groupTopicListCombineItemView = (GroupTopicListCombineItemView) view;
        if (i == 1) {
            groupTopicListCombineItemView.m67274R(topicMoment);
            groupTopicListCombineItemView.setViewSelectedNoDelete(topicMoment.selected);
        } else {
            groupTopicListCombineItemView.m67274R(topicMoment);
            groupTopicListCombineItemView.setViewSelected(true);
        }
        m219000D(groupTopicListCombineItemView, topicMoment, i);
    }

    /* JADX INFO: renamed from: D */
    public final void m219000D(View view, final TopicMoment topicMoment, final int i) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.y8j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f198008a.m219001E(i, topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m219001E(int i, TopicMoment topicMoment, View view) {
        if (i == 0) {
            topicMoment.selected = false;
            this.f203393f.m63102g(topicMoment);
        } else if (NullChecker.m82486a(this.f203395h)) {
            this.f203395h.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m219002F(List<TopicMoment> list) {
        super.m179766z(list);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.f203394g ? 0 : 1;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        GroupTopicListCombineItemView groupTopicListCombineItemView = new GroupTopicListCombineItemView(this.f203393f.getContext());
        groupTopicListCombineItemView.m67275S();
        return groupTopicListCombineItemView;
    }
}
