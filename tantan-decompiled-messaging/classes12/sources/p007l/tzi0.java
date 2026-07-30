package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import java.util.List;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tzi0 extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public FeedPostSelectedCategoryTopicsView f13481f;

    public tzi0(@NonNull List<TopicMoment> list, FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView) {
        super(list);
        this.f13481f = feedPostSelectedCategoryTopicsView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView] */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m14704j(View view, TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        ?? r1 = (GroupTopicListCombineItemView) view;
        r1.m7243R(topicMoment);
        m14701D(r1, topicMoment);
    }

    /* JADX INFO: renamed from: D */
    public final void m14701D(View view, final TopicMoment topicMoment) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.szi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13138a.m14702E(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m14702E(TopicMoment topicMoment, View view) {
        topicMoment.selected = false;
        this.f13481f.m2938s(topicMoment);
    }

    /* JADX INFO: renamed from: F */
    public void m14703F(List<TopicMoment> list) {
        super.m9090z(list);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView] */
    /* JADX INFO: renamed from: m */
    public View m14705m(ViewGroup viewGroup, int i) {
        ?? groupTopicListCombineItemView = new GroupTopicListCombineItemView(this.f13481f.getContext());
        groupTopicListCombineItemView.m7245T();
        return groupTopicListCombineItemView;
    }
}
