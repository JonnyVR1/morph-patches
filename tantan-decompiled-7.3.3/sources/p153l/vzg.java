package p153l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostSelectedCategoryTopicsView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class vzg implements rzg<pf60<List<TopicCategorie>, List<TopicMoment>>> {

    /* JADX INFO: renamed from: a */
    public FeedPostSelectedCategoryTopicsView f186485a;

    /* JADX INFO: renamed from: c */
    private View m204089c(a0h.C15613a c15613a) {
        FeedPostSelectedCategoryTopicsView feedPostSelectedCategoryTopicsView = new FeedPostSelectedCategoryTopicsView(c15613a.f67718f);
        this.f186485a = feedPostSelectedCategoryTopicsView;
        return feedPostSelectedCategoryTopicsView;
    }

    @Override // p153l.rzg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo183746a(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var, a0h.C15613a c15613a, Dialog dialog) {
        dialog.addContentView(m204089c(c15613a), new ViewGroup.LayoutParams(-1, c15613a.f67715c));
        m204091d(pf60Var, c15613a, dialog);
    }

    /* JADX INFO: renamed from: d */
    public final void m204091d(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var, a0h.C15613a c15613a, Dialog dialog) {
        this.f186485a.m63134E(pf60Var, dialog, c15613a.f67717e);
    }
}
