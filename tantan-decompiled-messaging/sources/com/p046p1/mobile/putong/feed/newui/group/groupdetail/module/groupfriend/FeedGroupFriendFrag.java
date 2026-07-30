package com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import java.util.ArrayList;
import java.util.List;
import p147v.VPullDownRefreshLayout;
import p149l.d30;
import p149l.df50;
import p149l.e30;
import p149l.e5h;
import p149l.f5c;
import p149l.h5h;
import p149l.hnc0;
import p149l.j760;
import p149l.l80;
import p149l.p6j0;
import p149l.t100;
import p149l.vs0;
import p149l.xdl0;
import p149l.y4h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupFriendFrag extends PutongFrag implements f5c<List<User>>, df50 {

    /* JADX INFO: renamed from: A */
    public FeedMaxHeightRecyclerView f40084A;

    /* JADX INFO: renamed from: B */
    public y4h f40085B;

    /* JADX INFO: renamed from: C */
    public List<User> f40086C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public e5h f40087D;

    /* JADX INFO: renamed from: E */
    public String f40088E;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f40089z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag$a */
    public class C11201a extends l80<User> {
        public C11201a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(User user, int i) {
            super.mo55695j(user, i);
            p6j0.m167671e("e_circle_friends", "p_circle_detail", j760.m140076a("user_id", user.f56011id));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(User user, int i, long j) {
            super.mo57958l(user, i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m61994P4() {
        this.f40087D.next();
    }

    /* JADX INFO: renamed from: O4 */
    public View m61995O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h5h.m129401b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m61996Q4(User user) {
        act().startActivity(vs0.m199796b(act(), user.f56011id, "photo_album_feed_from_recommend"));
    }

    @Override // p149l.f5c
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public void mo61986z0(List<User> list, Links links) {
        this.f40086C.clear();
        this.f40086C.addAll(list);
        this.f40085B.m212908M(this.f40086C);
        m61998S4();
    }

    /* JADX INFO: renamed from: S4 */
    public void m61998S4() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f40089z;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(true);
    }

    @Override // p149l.f5c
    /* JADX INFO: renamed from: a */
    public void mo61985a(Throwable th) {
        m61998S4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM61995O4 = m61995O4(layoutInflater, viewGroup);
        if (getArguments() != null) {
            this.f40088E = getArguments().getString("groupId");
        }
        e5h e5hVar = new e5h(act(), this.f40088E);
        this.f40087D = e5hVar;
        e5hVar.m119701a(this);
        y4h y4hVar = new y4h(act(), new C11201a(), "p_circle_detail");
        this.f40085B = y4hVar;
        this.f40084A.setAdapter(y4hVar);
        xdl0.m208368c0(this.f40084A, t100.m186890d(156.0f));
        this.f40084A.setClipToPadding(false);
        this.f40085B.m212910O(new d30() { // from class: l.f5h
            @Override // p149l.d30
            public final void call() {
                this.f95182a.m61994P4();
            }
        });
        this.f40085B.m212909N(new e30() { // from class: l.g5h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101151a.m61996Q4((User) obj);
            }
        });
        this.f40087D.previous();
        this.f40089z.mo223159O(this);
        return viewM61995O4;
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        e5h e5hVar = this.f40087D;
        if (e5hVar != null) {
            e5hVar.previous();
        }
    }
}
