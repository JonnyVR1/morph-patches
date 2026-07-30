package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.newest;

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
import p153l.bnl0;
import p153l.fkh;
import p153l.hdc0;
import p153l.l51;
import p153l.n2m;
import p153l.n570;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.s2m;
import p153l.s7h;
import p153l.s8h;
import p153l.uxj0;
import p153l.v0q;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupNewestMomentFrag extends PutongFrag implements s2m, n2m, v0q {

    /* JADX INFO: renamed from: A */
    public FrameLayout f40947A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f40948B;

    /* JADX INFO: renamed from: C */
    public String f40949C;

    /* JADX INFO: renamed from: D */
    public String f40950D;

    /* JADX INFO: renamed from: E */
    public boolean f40951E;

    /* JADX INFO: renamed from: F */
    public C11443a f40952F;

    /* JADX INFO: renamed from: G */
    public s8h f40953G;

    /* JADX INFO: renamed from: H */
    public fkh f40954H;

    /* JADX INFO: renamed from: I */
    public FeedMaxHeightRecyclerView f40955I;

    /* JADX INFO: renamed from: z */
    public LinearLayout f40956z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m63208P4() {
        this.f40954H.mo65689A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m63209Q4(uxj0 uxj0Var) {
        l51.m152888H(act(), new Runnable() { // from class: l.r7h
            @Override // java.lang.Runnable
            public final void run() {
                this.f161617a.m63208P4();
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
        fkh fkhVar = new fkh(this.f40948B, this.f40950D);
        this.f40954H = fkhVar;
        return fkhVar;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: N0 */
    public void mo63212N0() {
        this.f40951E = true;
    }

    /* JADX INFO: renamed from: O4 */
    public View m63213O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s7h.m185007b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo63214Q0() {
        return this.f40948B;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        return this.f40953G;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(FeedModule.m61406H().mo31827u8()).subscribe(psd0.m173596G(new y20() { // from class: l.q7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155961a.m63209Q4((uxj0) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f40948B = (PhotoAlbumFeedBaseFrag) getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f40949C = getArguments().getString("user_id");
        this.f40950D = getArguments().getString("groupId");
        if (NullChecker.m82486a(this.f40948B)) {
            this.f40948B.m65213k5(true);
            this.f40948B.m65212j5(true);
            this.f40948B.m65210h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM65216n5 = PhotoAlbumFeedBaseFrag.m65216n5(this.f40949C, "from_group_detail_new", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 7);
        this.f40948B = photoAlbumFeedBaseFragM65216n5;
        photoAlbumFeedBaseFragM65216n5.m65213k5(true);
        this.f40948B.m65212j5(true);
        this.f40948B.m65210h5(this);
        AbstractC0428k abstractC0428kM2568m = getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f40948B, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63213O4(layoutInflater, viewGroup);
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
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f40948B;
        this.f40952F = new C11443a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f42302z.f197638b, this.f40949C, "from_group_detail_new", 7, false);
        this.f40948B.f42302z.f197638b.setTag("SECOND_RECYCLER_TAG");
        this.f40948B.f42302z.f197638b.setMaxHeight(bnl0.m105588w0());
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f40948B.f42302z.f197638b;
        this.f40955I = feedMaxHeightRecyclerView;
        bnl0.m105548c0(feedMaxHeightRecyclerView, qa00.m175859d(156.0f));
        this.f40955I.setClipToPadding(false);
        return this.f40952F;
    }

    @Override // p153l.v0q
    /* JADX INFO: renamed from: w1 */
    public boolean mo63220w1() {
        return this.f40951E;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: B3 */
    public void mo63210B3(pf60<User, Boolean> pf60Var, boolean z) {
    }
}
