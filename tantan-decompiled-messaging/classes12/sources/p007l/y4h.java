package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.j760;
import l.mkd0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y4h extends dac0<User> {

    /* JADX INFO: renamed from: c */
    public List<User> f15253c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f15254d;

    /* JADX INFO: renamed from: e */
    public l80<User> f15255e;

    /* JADX INFO: renamed from: f */
    public e30<User> f15256f;

    /* JADX INFO: renamed from: g */
    public d30 f15257g;

    /* JADX INFO: renamed from: h */
    public String f15258h;

    public y4h(Act act, l80<User> l80Var, String str) {
        this.f15254d = act;
        this.f15255e = l80Var;
        this.f15258h = str;
        m16927H();
    }

    /* JADX INFO: renamed from: C */
    public int m16924C() {
        return this.f15253c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16925D(ViewGroup viewGroup, int i) {
        return new FeedGroupFriendItem(this.f15254d);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m16923A(View view, User user, int i, int i2) {
        FeedGroupFriendItem feedGroupFriendItem = (FeedGroupFriendItem) view;
        feedGroupFriendItem.setPageId(this.f15258h);
        feedGroupFriendItem.m2991p(user);
        m16929J(feedGroupFriendItem, user);
    }

    /* JADX INFO: renamed from: H */
    public void m16927H() {
        this.f15254d.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.w4h
            public final void call(Object obj) {
                this.f14403a.m16930K((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f15253c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final void m16929J(View view, final User user) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.x4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14766a.m16931L(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m16930K(j760 j760Var) {
        User userM16628e8 = FeedModule.f316d.m16628e8(((DbObject) ((User) j760Var.a)).id);
        if (userM16628e8 != null) {
            for (User user : this.f15253c) {
                if (((DbObject) user).id.equals(((DbObject) ((User) j760Var.a)).id)) {
                    int iIndexOf = this.f15253c.indexOf(user);
                    this.f15253c.remove(user);
                    this.f15253c.add(iIndexOf, userM16628e8);
                    m16932M(this.f15253c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m16931L(User user, View view) {
        if (NullChecker.a(this.f15256f)) {
            this.f15256f.call(user);
            p6j0.m12913c("e_circle_friends", this.f15258h, j760.a("user_id", ((DbObject) user).id));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m16932M(List<User> list) {
        this.f15253c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public void m16933N(e30<User> e30Var) {
        this.f15256f = e30Var;
    }

    /* JADX INFO: renamed from: O */
    public void m16934O(d30 d30Var) {
        this.f15257g = d30Var;
    }

    /* JADX INFO: renamed from: e */
    public void m16935e(int i) {
        d30 d30Var;
        super.e(i);
        if (i < this.f15253c.size() - 4 || (d30Var = this.f15257g) == null) {
            return;
        }
        d30Var.call();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f15255e.m11594h(d0Var.itemView, this.f15253c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f15255e.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f15255e.m11595i(d0Var.itemView);
    }
}
