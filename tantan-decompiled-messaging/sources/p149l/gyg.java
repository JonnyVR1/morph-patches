package p149l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class gyg implements cyg<j760<List<TopicCategorie>, List<TopicMoment>>> {

    /* JADX INFO: renamed from: a */
    public FeedPostSelectedCategoryTopicsView f105016a;

    /* JADX INFO: renamed from: c */
    private View m128706c(lyg.C18354a c18354a) {
        FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView = new FeedPostSelectedCategoryTopicsView(c18354a.f130569f);
        this.f105016a = feedPostSelectedCategoryTopicsView;
        return feedPostSelectedCategoryTopicsView;
    }

    @Override // p149l.cyg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo109309a(j760<List<TopicCategorie>, List<TopicMoment>> j760Var, lyg.C18354a c18354a, Dialog dialog) {
        dialog.addContentView(m128706c(c18354a), new ViewGroup.LayoutParams(-1, c18354a.f130566c));
        m128708d(j760Var, c18354a, dialog);
    }

    /* JADX INFO: renamed from: d */
    public final void m128708d(j760<List<TopicCategorie>, List<TopicMoment>> j760Var, lyg.C18354a c18354a, Dialog dialog) {
        this.f105016a.m61951E(j760Var, dialog, c18354a.f130568e);
    }
}
