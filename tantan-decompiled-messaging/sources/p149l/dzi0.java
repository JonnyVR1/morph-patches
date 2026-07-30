package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;

/* JADX INFO: loaded from: classes12.dex */
public class dzi0 extends AbstractC18153l6<TopicMoment> {

    /* JADX INFO: renamed from: j */
    public ozi0 f88486j;

    public dzi0(PutongAct putongAct, ozi0 ozi0Var) {
        super(putongAct);
        this.f88486j = ozi0Var;
    }

    @Override // p149l.AbstractC18153l6, p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return i != 2 ? super.mo28825D(viewGroup, i) : new TopicListItemView(this.f126222g);
    }

    @Override // p149l.AbstractC18153l6, p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicMoment topicMoment, int i, int i2) {
        super.mo28823A(view, topicMoment, i, i2);
        if (getItemViewType(i2) != 2) {
            return;
        }
        zi60.m218961w().m218971c(topicMoment, "p_pick_topic");
        TopicListItemView topicListItemView = (TopicListItemView) view;
        if (getItem(i2).selected) {
            topicListItemView.setContentTextColor(Color.parseColor("#d46814"));
            topicListItemView.setContentBackgroundResource(f3c0.f94335G6);
        } else {
            topicListItemView.setContentTextColor(Color.parseColor("#4a4a4a"));
            topicListItemView.setContentBackgroundResource(f3c0.f94327F6);
        }
    }

    @Override // p149l.AbstractC18153l6
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo114120F(View view, final TopicMoment topicMoment) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m66121S(topicMoment);
        topicListItemView.setAnonymousTextViewVisible(topicMoment.isTopicAnonymousType());
        xdl0.m208329E0(topicListItemView, new View.OnClickListener() { // from class: l.czi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f83089a.m114123L(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m114123L(TopicMoment topicMoment, View view) {
        zi60.m218961w().m218969a(topicMoment, "p_pick_topic");
        this.f88486j.m166862x0(topicMoment);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (!m148683G() || this.f126221f.size() <= 0 || this.f126221f.size() - i >= 10) {
            return;
        }
        this.f88486j.m166857p0();
    }
}
