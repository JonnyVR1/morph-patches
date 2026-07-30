package p007l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gyg implements cyg<j760<List<TopicCategorie>, List<TopicMoment>>> {

    /* JADX INFO: renamed from: a */
    public FeedPostSelectedCategoryTopicsView f8539a;

    /* JADX INFO: renamed from: c */
    private View m10501c(lyg.C2422a c2422a) {
        FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView = new FeedPostSelectedCategoryTopicsView(c2422a.f10161f);
        this.f8539a = feedPostSelectedCategoryTopicsView;
        return feedPostSelectedCategoryTopicsView;
    }

    @Override // p007l.cyg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9254a(j760<List<TopicCategorie>, List<TopicMoment>> j760Var, lyg.C2422a c2422a, Dialog dialog) {
        dialog.addContentView(m10501c(c2422a), new ViewGroup.LayoutParams(-1, c2422a.f10158c));
        m10503d(j760Var, c2422a, dialog);
    }

    /* JADX INFO: renamed from: d */
    public final void m10503d(j760<List<TopicCategorie>, List<TopicMoment>> j760Var, lyg.C2422a c2422a, Dialog dialog) {
        this.f8539a.m2925E(j760Var, dialog, c2422a.f10160e);
    }
}
