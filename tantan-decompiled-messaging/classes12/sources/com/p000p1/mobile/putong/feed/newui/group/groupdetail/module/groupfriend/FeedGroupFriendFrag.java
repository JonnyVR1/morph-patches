package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.df50;
import l.e30;
import l.hnc0;
import l.j760;
import l.t100;
import l.xdl0;
import p007l.e5h;
import p007l.f5c;
import p007l.h5h;
import p007l.l80;
import p007l.p6j0;
import p007l.vs0;
import p007l.y4h;
import v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupFriendFrag extends PutongFrag implements f5c<List<User>>, df50 {

    /* JADX INFO: renamed from: A */
    public FeedMaxHeightRecyclerView f1545A;

    /* JADX INFO: renamed from: B */
    public y4h f1546B;

    /* JADX INFO: renamed from: C */
    public List<User> f1547C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public e5h f1548D;

    /* JADX INFO: renamed from: E */
    public String f1549E;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f1550z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag$a */
    public class C2045a extends l80<User> {
        public C2045a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(User user, int i) {
            super.mo2866j(user, i);
            p6j0.m12915e("e_circle_friends", "p_circle_detail", j760.a("user_id", ((DbObject) user).id));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(User user, int i, long j) {
            super.mo2867l(user, i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m2968P4() {
        this.f1548D.next();
    }

    /* JADX INFO: renamed from: O4 */
    public View m2969O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h5h.m10552b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m2970Q4(User user) {
        act().startActivity(vs0.m15564b(act(), ((DbObject) user).id, "photo_album_feed_from_recommend"));
    }

    @Override // p007l.f5c
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public void mo2960z0(List<User> list, Links links) {
        this.f1547C.clear();
        this.f1547C.addAll(list);
        this.f1546B.m16932M(this.f1547C);
        m2972S4();
    }

    /* JADX INFO: renamed from: S4 */
    public void m2972S4() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f1550z;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(true);
    }

    @Override // p007l.f5c
    /* JADX INFO: renamed from: a */
    public void mo2959a(Throwable th) {
        m2972S4();
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2969O4 = m2969O4(layoutInflater, viewGroup);
        if (getArguments() != null) {
            this.f1549E = getArguments().getString("groupId");
        }
        e5h e5hVar = new e5h(act(), this.f1549E);
        this.f1548D = e5hVar;
        e5hVar.m10069a(this);
        y4h y4hVar = new y4h(act(), new C2045a(), "p_circle_detail");
        this.f1546B = y4hVar;
        this.f1545A.setAdapter(y4hVar);
        xdl0.c0(this.f1545A, t100.d(156.0f));
        this.f1545A.setClipToPadding(false);
        this.f1546B.m16934O(new d30() { // from class: l.f5h
            public final void call() {
                this.f7992a.m2968P4();
            }
        });
        this.f1546B.m16933N(new e30() { // from class: l.g5h
            public final void call(Object obj) {
                this.f8355a.m2970Q4((User) obj);
            }
        });
        this.f1548D.previous();
        this.f1550z.O(this);
        return viewM2969O4;
    }

    /* JADX INFO: renamed from: w2 */
    public void m2973w2(@NonNull hnc0 hnc0Var) {
        e5h e5hVar = this.f1548D;
        if (e5hVar != null) {
            e5hVar.previous();
        }
    }
}
