package p149l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dyg implements cyg<List<TopicMoment>> {

    /* JADX INFO: renamed from: a */
    public FeedPostSelectedTopicsView f88391a;

    @Override // p149l.cyg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo109309a(List<TopicMoment> list, lyg.C18354a c18354a, Dialog dialog) {
        dialog.addContentView(m114070c(c18354a), new ViewGroup.LayoutParams(-1, c18354a.f130566c));
        m114071d(list, c18354a, dialog);
    }

    /* JADX INFO: renamed from: c */
    public final View m114070c(lyg.C18354a c18354a) {
        FeedPostSelectedTopicsView feedPostSelectedTopicsView = new FeedPostSelectedTopicsView(c18354a.f130569f);
        this.f88391a = feedPostSelectedTopicsView;
        return feedPostSelectedTopicsView;
    }

    /* JADX INFO: renamed from: d */
    public final void m114071d(List<TopicMoment> list, lyg.C18354a c18354a, Dialog dialog) {
        this.f88391a.m61925m(list, dialog, c18354a.f130568e);
    }
}
