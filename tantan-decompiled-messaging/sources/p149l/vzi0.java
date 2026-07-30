package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class vzi0 extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public FeedPostSelectedTopicsView f183639f;

    /* JADX INFO: renamed from: g */
    public boolean f183640g;

    /* JADX INFO: renamed from: h */
    public e30<TopicMoment> f183641h;

    public vzi0(@NonNull List<TopicMoment> list, FeedPostSelectedTopicsView feedPostSelectedTopicsView, boolean z) {
        super(list);
        this.f183639f = feedPostSelectedTopicsView;
        this.f183640g = z;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        GroupTopicListCombineItemView groupTopicListCombineItemView = (GroupTopicListCombineItemView) view;
        if (i == 1) {
            groupTopicListCombineItemView.m66091R(topicMoment);
            groupTopicListCombineItemView.setViewSelectedNoDelete(topicMoment.selected);
        } else {
            groupTopicListCombineItemView.m66091R(topicMoment);
            groupTopicListCombineItemView.setViewSelected(true);
        }
        m200761D(groupTopicListCombineItemView, topicMoment, i);
    }

    /* JADX INFO: renamed from: D */
    public final void m200761D(View view, final TopicMoment topicMoment, final int i) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.uzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f178998a.m200762E(i, topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m200762E(int i, TopicMoment topicMoment, View view) {
        if (i == 0) {
            topicMoment.selected = false;
            this.f183639f.m61919g(topicMoment);
        } else if (NullChecker.m81303a(this.f183641h)) {
            this.f183641h.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m200763F(List<TopicMoment> list) {
        super.m105025z(list);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return this.f183640g ? 0 : 1;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        GroupTopicListCombineItemView groupTopicListCombineItemView = new GroupTopicListCombineItemView(this.f183639f.getContext());
        groupTopicListCombineItemView.m66092S();
        return groupTopicListCombineItemView;
    }
}
