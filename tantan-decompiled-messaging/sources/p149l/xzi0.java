package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class xzi0 extends c3h<TopicMoment> {

    /* JADX INFO: renamed from: f */
    public Act f195204f;

    /* JADX INFO: renamed from: g */
    public C11245a f195205g;

    public xzi0(@NonNull List<TopicMoment> list, Act act, C11245a c11245a) {
        super(list);
        this.f195204f = act;
        this.f195205g = c11245a;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final TopicMoment topicMoment, int i, int i2) {
        if (topicMoment == null) {
            return;
        }
        NewPostSelectedTopicItemView newPostSelectedTopicItemView = (NewPostSelectedTopicItemView) view;
        newPostSelectedTopicItemView.m66097S(topicMoment);
        newPostSelectedTopicItemView.setOnClickListener(new View.OnClickListener() { // from class: l.wzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f188735a.m211994D(topicMoment, view2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m211994D(TopicMoment topicMoment, View view) {
        this.f195205g.m62766W0(topicMoment);
    }

    /* JADX INFO: renamed from: E */
    public void m211995E(List<TopicMoment> list) {
        super.m105025z(list);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return new NewPostSelectedTopicItemView(this.f195204f);
    }
}
