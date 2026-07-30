package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;

/* JADX INFO: loaded from: classes13.dex */
public class h8j0 extends AbstractC17656i6<TopicMoment> {

    /* JADX INFO: renamed from: j */
    public s8j0 f108245j;

    public h8j0(PutongAct putongAct, s8j0 s8j0Var) {
        super(putongAct);
        this.f108245j = s8j0Var;
    }

    @Override // p153l.AbstractC17656i6, p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return i != 2 ? super.mo29824D(viewGroup, i) : new TopicListItemView(this.f113124g);
    }

    @Override // p153l.AbstractC17656i6, p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicMoment topicMoment, int i, int i2) {
        super.mo29822A(view, topicMoment, i, i2);
        if (getItemViewType(i2) != 2) {
            return;
        }
        er60.m122104w().m122114c(topicMoment, "p_pick_topic");
        TopicListItemView topicListItemView = (TopicListItemView) view;
        if (getItem(i2).selected) {
            topicListItemView.setContentTextColor(Color.parseColor("#d46814"));
            topicListItemView.setContentBackgroundResource(lbc0.f130853G6);
        } else {
            topicListItemView.setContentTextColor(Color.parseColor("#4a4a4a"));
            topicListItemView.setContentBackgroundResource(lbc0.f130845F6);
        }
    }

    @Override // p153l.AbstractC17656i6
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo133940F(View view, final TopicMoment topicMoment) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m67304S(topicMoment);
        topicListItemView.setAnonymousTextViewVisible(topicMoment.isTopicAnonymousType());
        bnl0.m105509E0(topicListItemView, new View.OnClickListener() { // from class: l.g8j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f102689a.m133943L(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m133943L(TopicMoment topicMoment, View view) {
        er60.m122104w().m122112a(topicMoment, "p_pick_topic");
        this.f108245j.m185097x0(topicMoment);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (!m138792G() || this.f113123f.size() <= 0 || this.f113123f.size() - i >= 10) {
            return;
        }
        this.f108245j.m185092p0();
    }
}
