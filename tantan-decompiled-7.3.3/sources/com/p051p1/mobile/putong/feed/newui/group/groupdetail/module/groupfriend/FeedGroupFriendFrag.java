package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import java.util.ArrayList;
import java.util.List;
import p151v.VPullDownRefreshLayout;
import p153l.at0;
import p153l.bnl0;
import p153l.h80;
import p153l.jn50;
import p153l.l6c;
import p153l.mvc0;
import p153l.n6h;
import p153l.pf60;
import p153l.qa00;
import p153l.t6h;
import p153l.tfj0;
import p153l.w6h;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupFriendFrag extends PutongFrag implements l6c<List<User>>, jn50 {

    /* JADX INFO: renamed from: A */
    public FeedMaxHeightRecyclerView f40932A;

    /* JADX INFO: renamed from: B */
    public n6h f40933B;

    /* JADX INFO: renamed from: C */
    public List<User> f40934C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public t6h f40935D;

    /* JADX INFO: renamed from: E */
    public String f40936E;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f40937z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag$a */
    public class C11364a extends h80<User> {
        public C11364a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(User user, int i) {
            super.mo56878j(user, i);
            tfj0.m190942e("e_circle_friends", "p_circle_detail", pf60.m172085a("user_id", user.f56859id));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(User user, int i, long j) {
            super.mo59141l(user, i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m63177P4() {
        this.f40935D.next();
    }

    /* JADX INFO: renamed from: O4 */
    public View m63178O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w6h.m205102b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m63179Q4(User user) {
        act().startActivity(at0.m100008b(act(), user.f56859id, "photo_album_feed_from_recommend"));
    }

    @Override // p153l.l6c
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public void mo63169z0(List<User> list, Links links) {
        this.f40934C.clear();
        this.f40934C.addAll(list);
        this.f40933B.m161792M(this.f40934C);
        m63181S4();
    }

    /* JADX INFO: renamed from: S4 */
    public void m63181S4() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f40937z;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(true);
    }

    @Override // p153l.l6c
    /* JADX INFO: renamed from: a */
    public void mo63168a(Throwable th) {
        m63181S4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM63178O4 = m63178O4(layoutInflater, viewGroup);
        if (getArguments() != null) {
            this.f40936E = getArguments().getString("groupId");
        }
        t6h t6hVar = new t6h(act(), this.f40936E);
        this.f40935D = t6hVar;
        t6hVar.m96352a(this);
        n6h n6hVar = new n6h(act(), new C11364a(), "p_circle_detail");
        this.f40933B = n6hVar;
        this.f40932A.setAdapter(n6hVar);
        bnl0.m105548c0(this.f40932A, qa00.m175859d(156.0f));
        this.f40932A.setClipToPadding(false);
        this.f40933B.m161794O(new x20() { // from class: l.u6h
            @Override // p153l.x20
            public final void call() {
                this.f177776a.m63177P4();
            }
        });
        this.f40933B.m161793N(new y20() { // from class: l.v6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182641a.m63179Q4((User) obj);
            }
        });
        this.f40935D.previous();
        this.f40937z.mo224405O(this);
        return viewM63178O4;
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        t6h t6hVar = this.f40935D;
        if (t6hVar != null) {
            t6hVar.previous();
        }
    }
}
