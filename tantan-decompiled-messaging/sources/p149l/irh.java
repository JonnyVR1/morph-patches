package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.FeedPostAtDialogItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class irh extends dac0<NotifyUsers> {

    /* JADX INFO: renamed from: c */
    public List<NotifyUsers> f114639c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f114640d;

    /* JADX INFO: renamed from: e */
    public e30<NotifyUsers> f114641e;

    public irh(Act act) {
        this.f114640d = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f114639c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new FeedPostAtDialogItem(this.f114640d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, NotifyUsers notifyUsers, int i, int i2) {
        FeedPostAtDialogItem feedPostAtDialogItem = (FeedPostAtDialogItem) view;
        feedPostAtDialogItem.m62675d(notifyUsers);
        if (!orh.m165569b()) {
            feedPostAtDialogItem.m62673b();
        }
        m137894H(feedPostAtDialogItem, notifyUsers);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NotifyUsers getItem(int i) {
        return this.f114639c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m137894H(FeedPostAtDialogItem feedPostAtDialogItem, final NotifyUsers notifyUsers) {
        xdl0.m208329E0(feedPostAtDialogItem, new View.OnClickListener() { // from class: l.hrh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109221a.m137895I(notifyUsers, view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m137895I(NotifyUsers notifyUsers, View view) {
        if (orh.m165569b() && NullChecker.m81303a(this.f114641e)) {
            this.f114641e.call(notifyUsers);
            p6j0.m167669c("e_at_robot", "p_at_list", j760.m140076a("robotname", orh.m165574g()));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m137896J(List<NotifyUsers> list) {
        this.f114639c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m137897K(e30<NotifyUsers> e30Var) {
        this.f114641e = e30Var;
    }
}
