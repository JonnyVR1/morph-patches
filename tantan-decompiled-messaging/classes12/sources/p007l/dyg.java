package p007l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dyg implements cyg<List<TopicMoment>> {

    /* JADX INFO: renamed from: a */
    public FeedPostSelectedTopicsView f7085a;

    @Override // p007l.cyg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9254a(List<TopicMoment> list, lyg.C2422a c2422a, Dialog dialog) {
        dialog.addContentView(m9585c(c2422a), new ViewGroup.LayoutParams(-1, c2422a.f10158c));
        m9586d(list, c2422a, dialog);
    }

    /* JADX INFO: renamed from: c */
    public final View m9585c(lyg.C2422a c2422a) {
        FeedPostSelectedTopicsView feedPostSelectedTopicsView = new FeedPostSelectedTopicsView(c2422a.f10161f);
        this.f7085a = feedPostSelectedTopicsView;
        return feedPostSelectedTopicsView;
    }

    /* JADX INFO: renamed from: d */
    public final void m9586d(List<TopicMoment> list, lyg.C2422a c2422a, Dialog dialog) {
        this.f7085a.m2899m(list, dialog, c2422a.f10160e);
    }
}
