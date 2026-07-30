package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b9j0 extends r4h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public Act f75587f;

    /* JADX INFO: renamed from: g */
    public C11408a f75588g;

    public b9j0(@NonNull List<TopicMoment> list, Act act, C11408a c11408a) {
        super(list);
        this.f75587f = act;
        this.f75588g = c11408a;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        NewPostSelectedTopicItemView newPostSelectedTopicItemView = (NewPostSelectedTopicItemView) view;
        newPostSelectedTopicItemView.m67280S(topicMoment);
        newPostSelectedTopicItemView.setOnClickListener(new View.OnClickListener() { // from class: l.a9j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f69051a.m103106D(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m103106D(TopicMoment topicMoment, View view) {
        this.f75588g.m63949W0(topicMoment);
    }

    /* JADX INFO: renamed from: E */
    public void m103107E(List<TopicMoment> list) {
        super.m179766z(list);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return new NewPostSelectedTopicItemView(this.f75587f);
    }
}
