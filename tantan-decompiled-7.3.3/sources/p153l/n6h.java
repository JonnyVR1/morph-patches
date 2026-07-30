package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class n6h extends jic0<User> {

    /* JADX INFO: renamed from: c */
    public List<User> f140463c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f140464d;

    /* JADX INFO: renamed from: e */
    public h80<User> f140465e;

    /* JADX INFO: renamed from: f */
    public y20<User> f140466f;

    /* JADX INFO: renamed from: g */
    public x20 f140467g;

    /* JADX INFO: renamed from: h */
    public String f140468h;

    public n6h(Act act, h80<User> h80Var, String str) {
        this.f140464d = act;
        this.f140465e = h80Var;
        this.f140468h = str;
        m161787H();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f140463c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new FeedGroupFriendItem(this.f140464d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, User user, int i, int i2) {
        FeedGroupFriendItem feedGroupFriendItem = (FeedGroupFriendItem) view;
        feedGroupFriendItem.setPageId(this.f140468h);
        feedGroupFriendItem.m63199p(user);
        m161789J(feedGroupFriendItem, user);
    }

    /* JADX INFO: renamed from: H */
    public void m161787H() {
        this.f140464d.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.l6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130257a.m161790K((pf60) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f140463c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final void m161789J(View view, final User user) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.m6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f134996a.m161791L(user, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m161790K(pf60 pf60Var) {
        User userM145688e8 = FeedModule.f39703d.m145688e8(((User) pf60Var.f152156a).f56859id);
        if (userM145688e8 != null) {
            for (User user : this.f140463c) {
                if (user.f56859id.equals(((User) pf60Var.f152156a).f56859id)) {
                    int iIndexOf = this.f140463c.indexOf(user);
                    this.f140463c.remove(user);
                    this.f140463c.add(iIndexOf, userM145688e8);
                    m161792M(this.f140463c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m161791L(User user, View view) {
        if (NullChecker.m82486a(this.f140466f)) {
            this.f140466f.call(user);
            tfj0.m190940c("e_circle_friends", this.f140468h, pf60.m172085a("user_id", user.f56859id));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m161792M(List<User> list) {
        this.f140463c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public void m161793N(y20<User> y20Var) {
        this.f140466f = y20Var;
    }

    /* JADX INFO: renamed from: O */
    public void m161794O(x20 x20Var) {
        this.f140467g = x20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        x20 x20Var;
        super.mo48510e(i);
        if (i < this.f140463c.size() - 4 || (x20Var = this.f140467g) == null) {
            return;
        }
        x20Var.call();
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f140465e.m133881h(abstractC0569e0.itemView, this.f140463c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f140465e.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f140465e.m133882i(abstractC0569e0.itemView);
    }
}
