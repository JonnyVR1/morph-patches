package com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.newest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.b5c0;
import p149l.d6h;
import p149l.d7h;
import p149l.e30;
import p149l.e51;
import p149l.hx60;
import p149l.j760;
import p149l.mkd0;
import p149l.qih;
import p149l.roj0;
import p149l.t100;
import p149l.tzl;
import p149l.vyp;
import p149l.xdl0;
import p149l.yzl;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupNewestMomentFrag extends PutongFrag implements yzl, tzl, vyp {

    /* JADX INFO: renamed from: A */
    public FrameLayout f40099A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f40100B;

    /* JADX INFO: renamed from: C */
    public String f40101C;

    /* JADX INFO: renamed from: D */
    public String f40102D;

    /* JADX INFO: renamed from: E */
    public boolean f40103E;

    /* JADX INFO: renamed from: F */
    public C11280a f40104F;

    /* JADX INFO: renamed from: G */
    public d7h f40105G;

    /* JADX INFO: renamed from: H */
    public qih f40106H;

    /* JADX INFO: renamed from: I */
    public FeedMaxHeightRecyclerView f40107I;

    /* JADX INFO: renamed from: z */
    public LinearLayout f40108z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m62025P4() {
        this.f40106H.mo64506A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m62026Q4(roj0 roj0Var) {
        e51.m114743H(act(), new Runnable() { // from class: l.c6h
            @Override // java.lang.Runnable
            public final void run() {
                this.f79543a.m62025P4();
            }
        }, 1000L);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        qih qihVar = new qih(this.f40100B, this.f40102D);
        this.f40106H = qihVar;
        return qihVar;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo62029N0() {
        this.f40103E = true;
    }

    /* JADX INFO: renamed from: O4 */
    public View m62030O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d6h.m110166b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo62031Q0() {
        return this.f40100B;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        return this.f40105G;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(FeedModule.m60222H().mo30824u8()).subscribe(mkd0.m154955G(new e30() { // from class: l.b6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73819a.m62026Q4((roj0) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f40100B = (PhotoAlbumFeedBaseFrag) getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f40101C = getArguments().getString("user_id");
        this.f40102D = getArguments().getString("groupId");
        if (NullChecker.m81303a(this.f40100B)) {
            this.f40100B.m64030k5(true);
            this.f40100B.m64029j5(true);
            this.f40100B.m64027h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM64033n5 = PhotoAlbumFeedBaseFrag.m64033n5(this.f40101C, "from_group_detail_new", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 7);
        this.f40100B = photoAlbumFeedBaseFragM64033n5;
        photoAlbumFeedBaseFragM64033n5.m64030k5(true);
        this.f40100B.m64029j5(true);
        this.f40100B.m64027h5(this);
        AbstractC0427k abstractC0427kM2567m = getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f40100B, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62030O4(layoutInflater, viewGroup);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: o */
    public void mo62034o() {
        act().lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f40100B;
        this.f40104F = new C11280a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f41454z.f166899b, this.f40101C, "from_group_detail_new", 7, false);
        this.f40100B.f41454z.f166899b.setTag("SECOND_RECYCLER_TAG");
        this.f40100B.f41454z.f166899b.setMaxHeight(xdl0.m208408w0());
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f40100B.f41454z.f166899b;
        this.f40107I = feedMaxHeightRecyclerView;
        xdl0.m208368c0(feedMaxHeightRecyclerView, t100.m186890d(156.0f));
        this.f40107I.setClipToPadding(false);
        return this.f40104F;
    }

    @Override // p149l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo62037w1() {
        return this.f40103E;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo62027B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
