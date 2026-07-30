package com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.recommend;

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
import p149l.d7h;
import p149l.e30;
import p149l.e51;
import p149l.hx60;
import p149l.j760;
import p149l.m6h;
import p149l.mkd0;
import p149l.q6h;
import p149l.roj0;
import p149l.t100;
import p149l.tzl;
import p149l.vyp;
import p149l.xdl0;
import p149l.yzl;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupRecommendMomentFrag extends PutongFrag implements yzl, tzl, vyp {

    /* JADX INFO: renamed from: A */
    public FrameLayout f40109A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f40110B;

    /* JADX INFO: renamed from: C */
    public String f40111C;

    /* JADX INFO: renamed from: D */
    public String f40112D;

    /* JADX INFO: renamed from: E */
    public String f40113E;

    /* JADX INFO: renamed from: F */
    public boolean f40114F;

    /* JADX INFO: renamed from: G */
    public C11280a f40115G;

    /* JADX INFO: renamed from: H */
    public d7h f40116H;

    /* JADX INFO: renamed from: I */
    public m6h f40117I;

    /* JADX INFO: renamed from: J */
    public FeedMaxHeightRecyclerView f40118J;

    /* JADX INFO: renamed from: z */
    public LinearLayout f40119z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m62040P4() {
        this.f40117I.mo64506A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m62041Q4(roj0 roj0Var) {
        e51.m114743H(act(), new Runnable() { // from class: l.p6h
            @Override // java.lang.Runnable
            public final void run() {
                this.f147405a.m62040P4();
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
        m6h m6hVar = new m6h(this.f40110B, this.f40112D);
        this.f40117I = m6hVar;
        m6hVar.m153215W(this.f40113E);
        return this.f40117I;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo62029N0() {
        this.f40114F = true;
    }

    /* JADX INFO: renamed from: O4 */
    public View m62042O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q6h.m173131b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo62031Q0() {
        return this.f40110B;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        return this.f40116H;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(FeedModule.m60222H().mo30824u8()).subscribe(mkd0.m154955G(new e30() { // from class: l.o6h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142346a.m62041Q4((roj0) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f40110B = (PhotoAlbumFeedBaseFrag) getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f40111C = getArguments().getString("user_id");
        this.f40112D = getArguments().getString("groupId");
        this.f40113E = getArguments().getString("first_append_moment_id");
        if (NullChecker.m81303a(this.f40110B)) {
            this.f40110B.m64030k5(true);
            this.f40110B.m64029j5(true);
            this.f40110B.m64027h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM64033n5 = PhotoAlbumFeedBaseFrag.m64033n5(this.f40111C, "from_group_detail_recommend", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 7);
        this.f40110B = photoAlbumFeedBaseFragM64033n5;
        photoAlbumFeedBaseFragM64033n5.m64030k5(true);
        this.f40110B.m64029j5(true);
        this.f40110B.m64027h5(this);
        AbstractC0427k abstractC0427kM2567m = getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f40110B, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62042O4(layoutInflater, viewGroup);
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
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f40110B;
        this.f40115G = new C11280a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f41454z.f166899b, this.f40111C, "from_group_detail_recommend", 7, false);
        this.f40110B.f41454z.f166899b.setTag("SECOND_RECYCLER_TAG");
        this.f40110B.f41454z.f166899b.setMaxHeight(xdl0.m208408w0());
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f40110B.f41454z.f166899b;
        this.f40118J = feedMaxHeightRecyclerView;
        feedMaxHeightRecyclerView.setClipToPadding(false);
        xdl0.m208368c0(this.f40118J, t100.m186890d(156.0f));
        return this.f40115G;
    }

    @Override // p149l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo62037w1() {
        return this.f40114F;
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo62027B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
