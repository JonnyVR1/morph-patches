package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vzi0 extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public FeedPostSelectedTopicsView f14346f;

    /* JADX INFO: renamed from: g */
    public boolean f14347g;

    /* JADX INFO: renamed from: h */
    public e30<TopicMoment> f14348h;

    public vzi0(@NonNull List<TopicMoment> list, FeedPostSelectedTopicsView feedPostSelectedTopicsView, boolean z) {
        super(list);
        this.f14346f = feedPostSelectedTopicsView;
        this.f14347g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView] */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m15640j(View view, TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        ?? r1 = (GroupTopicListCombineItemView) view;
        if (i == 1) {
            r1.m7243R(topicMoment);
            r1.setViewSelectedNoDelete(topicMoment.selected);
        } else {
            r1.m7243R(topicMoment);
            r1.setViewSelected(true);
        }
        m15637D(r1, topicMoment, i);
    }

    /* JADX INFO: renamed from: D */
    public final void m15637D(View view, final TopicMoment topicMoment, final int i) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.uzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14001a.m15638E(i, topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m15638E(int i, TopicMoment topicMoment, View view) {
        if (i == 0) {
            topicMoment.selected = false;
            this.f14346f.m2893g(topicMoment);
        } else if (NullChecker.a(this.f14348h)) {
            this.f14348h.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m15639F(List<TopicMoment> list) {
        super.m9090z(list);
    }

    public int getItemViewType(int i) {
        return this.f14347g ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView] */
    /* JADX INFO: renamed from: m */
    public View m15641m(ViewGroup viewGroup, int i) {
        ?? groupTopicListCombineItemView = new GroupTopicListCombineItemView(this.f14346f.getContext());
        groupTopicListCombineItemView.m7244S();
        return groupTopicListCombineItemView;
    }
}
