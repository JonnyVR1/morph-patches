package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.recommend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.b8h;
import p153l.bnl0;
import p153l.f8h;
import p153l.hdc0;
import p153l.l51;
import p153l.n2m;
import p153l.n570;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.s2m;
import p153l.s8h;
import p153l.uxj0;
import p153l.v0q;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupRecommendMomentFrag extends PutongFrag implements s2m, n2m, v0q {

    /* JADX INFO: renamed from: A */
    public FrameLayout f40957A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f40958B;

    /* JADX INFO: renamed from: C */
    public String f40959C;

    /* JADX INFO: renamed from: D */
    public String f40960D;

    /* JADX INFO: renamed from: E */
    public String f40961E;

    /* JADX INFO: renamed from: F */
    public boolean f40962F;

    /* JADX INFO: renamed from: G */
    public C11443a f40963G;

    /* JADX INFO: renamed from: H */
    public s8h f40964H;

    /* JADX INFO: renamed from: I */
    public b8h f40965I;

    /* JADX INFO: renamed from: J */
    public FeedMaxHeightRecyclerView f40966J;

    /* JADX INFO: renamed from: z */
    public LinearLayout f40967z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m63223P4() {
        this.f40965I.mo65689A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m63224Q4(uxj0 uxj0Var) {
        l51.m152888H(act(), new Runnable() { // from class: l.e8h
            @Override // java.lang.Runnable
            public final void run() {
                this.f92544a.m63223P4();
            }
        }, 1000L);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        b8h b8hVar = new b8h(this.f40958B, this.f40960D);
        this.f40965I = b8hVar;
        b8hVar.m102998W(this.f40961E);
        return this.f40965I;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: N0 */
    public void mo63212N0() {
        this.f40962F = true;
    }

    /* JADX INFO: renamed from: O4 */
    public View m63225O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f8h.m124537b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo63214Q0() {
        return this.f40958B;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        return this.f40964H;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(FeedModule.m61406H().mo31827u8()).subscribe(psd0.m173596G(new y20() { // from class: l.d8h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85598a.m63224Q4((uxj0) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f40958B = (PhotoAlbumFeedBaseFrag) getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f40959C = getArguments().getString("user_id");
        this.f40960D = getArguments().getString("groupId");
        this.f40961E = getArguments().getString("first_append_moment_id");
        if (NullChecker.m82486a(this.f40958B)) {
            this.f40958B.m65213k5(true);
            this.f40958B.m65212j5(true);
            this.f40958B.m65210h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM65216n5 = PhotoAlbumFeedBaseFrag.m65216n5(this.f40959C, "from_group_detail_recommend", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 7);
        this.f40958B = photoAlbumFeedBaseFragM65216n5;
        photoAlbumFeedBaseFragM65216n5.m65213k5(true);
        this.f40958B.m65212j5(true);
        this.f40958B.m65210h5(this);
        AbstractC0428k abstractC0428kM2568m = getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f40958B, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63225O4(layoutInflater, viewGroup);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: o */
    public void mo63217o() {
        act().lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f40958B;
        this.f40963G = new C11443a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f42302z.f197638b, this.f40959C, "from_group_detail_recommend", 7, false);
        this.f40958B.f42302z.f197638b.setTag("SECOND_RECYCLER_TAG");
        this.f40958B.f42302z.f197638b.setMaxHeight(bnl0.m105588w0());
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f40958B.f42302z.f197638b;
        this.f40966J = feedMaxHeightRecyclerView;
        feedMaxHeightRecyclerView.setClipToPadding(false);
        bnl0.m105548c0(this.f40966J, qa00.m175859d(156.0f));
        return this.f40963G;
    }

    @Override // p153l.v0q
    /* JADX INFO: renamed from: w1 */
    public boolean mo63220w1() {
        return this.f40962F;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: B3 */
    public void mo63210B3(pf60<User, Boolean> pf60Var, boolean z) {
    }
}
