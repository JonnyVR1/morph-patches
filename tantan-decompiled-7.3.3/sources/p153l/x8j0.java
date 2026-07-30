package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class x8j0 extends r4h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public FeedPostSelectedCategoryTopicsView f192853f;

    public x8j0(@NonNull List<TopicMoment> list, FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView) {
        super(list);
        this.f192853f = feedPostSelectedCategoryTopicsView;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        GroupTopicListCombineItemView groupTopicListCombineItemView = (GroupTopicListCombineItemView) view;
        groupTopicListCombineItemView.m67274R(topicMoment);
        m209734D(groupTopicListCombineItemView, topicMoment);
    }

    /* JADX INFO: renamed from: D */
    public final void m209734D(View view, final TopicMoment topicMoment) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.w8j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f187860a.m209735E(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m209735E(TopicMoment topicMoment, View view) {
        topicMoment.selected = false;
        this.f192853f.m63147s(topicMoment);
    }

    /* JADX INFO: renamed from: F */
    public void m209736F(List<TopicMoment> list) {
        super.m179766z(list);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        GroupTopicListCombineItemView groupTopicListCombineItemView = new GroupTopicListCombineItemView(this.f192853f.getContext());
        groupTopicListCombineItemView.m67276T();
        return groupTopicListCombineItemView;
    }
}
