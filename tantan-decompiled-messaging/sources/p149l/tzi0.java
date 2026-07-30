package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class tzi0 extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public FeedPostSelectedCategoryTopicsView f172737f;

    public tzi0(@NonNull List<TopicMoment> list, FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView) {
        super(list);
        this.f172737f = feedPostSelectedCategoryTopicsView;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        GroupTopicListCombineItemView groupTopicListCombineItemView = (GroupTopicListCombineItemView) view;
        groupTopicListCombineItemView.m66091R(topicMoment);
        m191197D(groupTopicListCombineItemView, topicMoment);
    }

    /* JADX INFO: renamed from: D */
    public final void m191197D(View view, final TopicMoment topicMoment) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.szi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f167061a.m191198E(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m191198E(TopicMoment topicMoment, View view) {
        topicMoment.selected = false;
        this.f172737f.m61964s(topicMoment);
    }

    /* JADX INFO: renamed from: F */
    public void m191199F(List<TopicMoment> list) {
        super.m105025z(list);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        GroupTopicListCombineItemView groupTopicListCombineItemView = new GroupTopicListCombineItemView(this.f172737f.getContext());
        groupTopicListCombineItemView.m66093T();
        return groupTopicListCombineItemView;
    }
}
