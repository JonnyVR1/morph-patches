package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.FeedPostAtDialogItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class irh extends dac0<NotifyUsers> {

    /* JADX INFO: renamed from: c */
    public List<NotifyUsers> f9121c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f9122d;

    /* JADX INFO: renamed from: e */
    public e30<NotifyUsers> f9123e;

    public irh(Act act) {
        this.f9122d = act;
    }

    /* JADX INFO: renamed from: C */
    public int m11026C() {
        return this.f9121c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m11027D(ViewGroup viewGroup, int i) {
        return new FeedPostAtDialogItem(this.f9122d);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m11025A(View view, NotifyUsers notifyUsers, int i, int i2) {
        FeedPostAtDialogItem feedPostAtDialogItem = (FeedPostAtDialogItem) view;
        feedPostAtDialogItem.m3680d(notifyUsers);
        if (!orh.m12746b()) {
            feedPostAtDialogItem.m3678b();
        }
        m11030H(feedPostAtDialogItem, notifyUsers);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NotifyUsers getItem(int i) {
        return this.f9121c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m11030H(FeedPostAtDialogItem feedPostAtDialogItem, final NotifyUsers notifyUsers) {
        xdl0.E0(feedPostAtDialogItem, new View.OnClickListener() { // from class: l.hrh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8809a.m11031I(notifyUsers, view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m11031I(NotifyUsers notifyUsers, View view) {
        if (orh.m12746b() && NullChecker.a(this.f9123e)) {
            this.f9123e.call(notifyUsers);
            p6j0.m12913c("e_at_robot", "p_at_list", j760.a("robotname", orh.m12751g()));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m11032J(List<NotifyUsers> list) {
        this.f9121c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m11033K(e30<NotifyUsers> e30Var) {
        this.f9123e = e30Var;
    }
}
