package p153l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class szg implements rzg<List<TopicMoment>> {

    /* JADX INFO: renamed from: a */
    public FeedPostSelectedTopicsView f171389a;

    @Override // p153l.rzg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo183746a(List<TopicMoment> list, a0h.C15613a c15613a, Dialog dialog) {
        dialog.addContentView(m188644c(c15613a), new ViewGroup.LayoutParams(-1, c15613a.f67715c));
        m188645d(list, c15613a, dialog);
    }

    /* JADX INFO: renamed from: c */
    public final View m188644c(a0h.C15613a c15613a) {
        FeedPostSelectedTopicsView feedPostSelectedTopicsView = new FeedPostSelectedTopicsView(c15613a.f67718f);
        this.f171389a = feedPostSelectedTopicsView;
        return feedPostSelectedTopicsView;
    }

    /* JADX INFO: renamed from: d */
    public final void m188645d(List<TopicMoment> list, a0h.C15613a c15613a, Dialog dialog) {
        this.f171389a.m63108m(list, dialog, c15613a.f67717e);
    }
}
