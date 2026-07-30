package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import com.p1.mobile.android.app.Act;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xzi0 extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public Act f15191f;

    /* JADX INFO: renamed from: g */
    public C2089a f15192g;

    public xzi0(@NonNull List<TopicMoment> list, Act act, C2089a c2089a) {
        super(list);
        this.f15191f = act;
        this.f15192g = c2089a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m16882j(View view, final TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        NewPostSelectedTopicItemView newPostSelectedTopicItemView = (NewPostSelectedTopicItemView) view;
        newPostSelectedTopicItemView.m7249S(topicMoment);
        newPostSelectedTopicItemView.setOnClickListener(new View.OnClickListener() { // from class: l.wzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14720a.m16880D(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m16880D(TopicMoment topicMoment, View view) {
        this.f15192g.m3772W0(topicMoment);
    }

    /* JADX INFO: renamed from: E */
    public void m16881E(List<TopicMoment> list) {
        super.m9090z(list);
    }

    /* JADX INFO: renamed from: m */
    public View m16883m(ViewGroup viewGroup, int i) {
        return new NewPostSelectedTopicItemView(this.f15191f);
    }
}
