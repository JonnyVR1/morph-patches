package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class y4h extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public List<User> f196283c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f196284d;

    /* JADX INFO: renamed from: e */
    public l80<User> f196285e;

    /* JADX INFO: renamed from: f */
    public e30<User> f196286f;

    /* JADX INFO: renamed from: g */
    public d30 f196287g;

    /* JADX INFO: renamed from: h */
    public String f196288h;

    public y4h(Act act, l80<User> l80Var, String str) {
        this.f196284d = act;
        this.f196285e = l80Var;
        this.f196288h = str;
        m212903H();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f196283c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new FeedGroupFriendItem(this.f196284d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, User user, int i, int i2) {
        FeedGroupFriendItem feedGroupFriendItem = (FeedGroupFriendItem) view;
        feedGroupFriendItem.setPageId(this.f196288h);
        feedGroupFriendItem.m62016p(user);
        m212905J(feedGroupFriendItem, user);
    }

    /* JADX INFO: renamed from: H */
    public void m212903H() {
        this.f196284d.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.w4h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184563a.m212906K((j760) obj);
            }
        }));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f196283c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final void m212905J(View view, final User user) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.x4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f191023a.m212907L(user, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m212906K(j760 j760Var) {
        User userM209447e8 = FeedModule.f38855d.m209447e8(((User) j760Var.f116564a).f56011id);
        if (userM209447e8 != null) {
            for (User user : this.f196283c) {
                if (user.f56011id.equals(((User) j760Var.f116564a).f56011id)) {
                    int iIndexOf = this.f196283c.indexOf(user);
                    this.f196283c.remove(user);
                    this.f196283c.add(iIndexOf, userM209447e8);
                    m212908M(this.f196283c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m212907L(User user, View view) {
        if (NullChecker.m81303a(this.f196286f)) {
            this.f196286f.call(user);
            p6j0.m167669c("e_circle_friends", this.f196288h, j760.m140076a("user_id", user.f56011id));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m212908M(List<User> list) {
        this.f196283c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public void m212909N(e30<User> e30Var) {
        this.f196286f = e30Var;
    }

    /* JADX INFO: renamed from: O */
    public void m212910O(d30 d30Var) {
        this.f196287g = d30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        d30 d30Var;
        super.mo47327e(i);
        if (i < this.f196283c.size() - 4 || (d30Var = this.f196287g) == null) {
            return;
        }
        d30Var.call();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f196285e.m148839h(abstractC0566d0.itemView, this.f196283c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f196285e.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f196285e.m148840i(abstractC0566d0.itemView);
    }
}
