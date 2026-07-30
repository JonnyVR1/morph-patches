package p007l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView;
import com.p1.mobile.putong.app.PutongAct;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dzi0 extends AbstractC2412l6<TopicMoment> {

    /* JADX INFO: renamed from: j */
    public ozi0 f7093j;

    public dzi0(PutongAct putongAct, ozi0 ozi0Var) {
        super(putongAct);
        this.f7093j = ozi0Var;
    }

    @Override // p007l.AbstractC2412l6
    /* JADX INFO: renamed from: D */
    public View mo9591D(ViewGroup viewGroup, int i) {
        return i != 2 ? super.mo9591D(viewGroup, i) : new TopicListItemView(this.f9899g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.AbstractC2412l6
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo9590A(View view, TopicMoment topicMoment, int i, int i2) {
        super.mo9590A(view, topicMoment, i, i2);
        if (getItemViewType(i2) != 2) {
            return;
        }
        zi60.m17436w().m17446c(topicMoment, "p_pick_topic");
        TopicListItemView topicListItemView = (TopicListItemView) view;
        if (getItem(i2).selected) {
            topicListItemView.setContentTextColor(Color.parseColor("#d46814"));
            topicListItemView.setContentBackgroundResource(f3c0.f7618G6);
        } else {
            topicListItemView.setContentTextColor(Color.parseColor("#4a4a4a"));
            topicListItemView.setContentBackgroundResource(f3c0.f7610F6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.topic.topiclist.TopicListItemView] */
    @Override // p007l.AbstractC2412l6
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo9592F(View view, final TopicMoment topicMoment) {
        ?? r2 = (TopicListItemView) view;
        r2.m7273S(topicMoment);
        r2.setAnonymousTextViewVisible(topicMoment.isTopicAnonymousType());
        xdl0.E0((View) r2, new View.OnClickListener() { // from class: l.czi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6760a.m9595L(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m9595L(TopicMoment topicMoment, View view) {
        zi60.m17436w().m17444a(topicMoment, "p_pick_topic");
        this.f7093j.m12897x0(topicMoment);
    }

    /* JADX INFO: renamed from: e */
    public void m9596e(int i) {
        if (!m11559G() || this.f9898f.size() <= 0 || this.f9898f.size() - i >= 10) {
            return;
        }
        this.f7093j.m12892p0();
    }
}
