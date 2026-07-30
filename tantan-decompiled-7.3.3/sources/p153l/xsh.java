package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.FeedPostAtDialogItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class xsh extends jic0<NotifyUsers> {

    /* JADX INFO: renamed from: c */
    public List<NotifyUsers> f196106c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f196107d;

    /* JADX INFO: renamed from: e */
    public y20<NotifyUsers> f196108e;

    public xsh(Act act) {
        this.f196107d = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f196106c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new FeedPostAtDialogItem(this.f196107d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, NotifyUsers notifyUsers, int i, int i2) {
        FeedPostAtDialogItem feedPostAtDialogItem = (FeedPostAtDialogItem) view;
        feedPostAtDialogItem.m63858d(notifyUsers);
        if (!dth.m117871b()) {
            feedPostAtDialogItem.m63856b();
        }
        m212981H(feedPostAtDialogItem, notifyUsers);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NotifyUsers getItem(int i) {
        return this.f196106c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m212981H(FeedPostAtDialogItem feedPostAtDialogItem, final NotifyUsers notifyUsers) {
        bnl0.m105509E0(feedPostAtDialogItem, new View.OnClickListener() { // from class: l.wsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190650a.m212982I(notifyUsers, view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m212982I(NotifyUsers notifyUsers, View view) {
        if (dth.m117871b() && NullChecker.m82486a(this.f196108e)) {
            this.f196108e.call(notifyUsers);
            tfj0.m190940c("e_at_robot", "p_at_list", pf60.m172085a("robotname", dth.m117876g()));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m212983J(List<NotifyUsers> list) {
        this.f196106c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m212984K(y20<NotifyUsers> y20Var) {
        this.f196108e = y20Var;
    }
}
