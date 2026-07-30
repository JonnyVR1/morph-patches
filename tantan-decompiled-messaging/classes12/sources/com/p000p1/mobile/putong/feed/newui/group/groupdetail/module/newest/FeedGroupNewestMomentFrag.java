package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.newest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.roj0;
import l.t100;
import l.xdl0;
import p007l.b5c0;
import p007l.d6h;
import p007l.d7h;
import p007l.hx60;
import p007l.qih;
import p007l.tzl;
import p007l.vyp;
import p007l.yzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupNewestMomentFrag extends PutongFrag implements yzl, tzl, vyp {

    /* JADX INFO: renamed from: A */
    public FrameLayout f1560A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f1561B;

    /* JADX INFO: renamed from: C */
    public String f1562C;

    /* JADX INFO: renamed from: D */
    public String f1563D;

    /* JADX INFO: renamed from: E */
    public boolean f1564E;

    /* JADX INFO: renamed from: F */
    public C2124a f1565F;

    /* JADX INFO: renamed from: G */
    public d7h f1566G;

    /* JADX INFO: renamed from: H */
    public qih f1567H;

    /* JADX INFO: renamed from: I */
    public FeedMaxHeightRecyclerView f1568I;

    /* JADX INFO: renamed from: z */
    public LinearLayout f1569z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m3000P4() {
        this.f1567H.mo5597A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m3001Q4(roj0 roj0Var) {
        e51.H(act(), new Runnable() { // from class: l.c6h
            @Override // java.lang.Runnable
            public final void run() {
                this.f6549a.m3000P4();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m3003B4() {
        return false;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        qih qihVar = new qih(this.f1561B, this.f1563D);
        this.f1567H = qihVar;
        return qihVar;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo3005N0() {
        this.f1564E = true;
    }

    /* JADX INFO: renamed from: O4 */
    public View m3006O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d6h.m9351b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo3007Q0() {
        return this.f1561B;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        return this.f1566G;
    }

    /* JADX INFO: renamed from: f4 */
    public void m3009f4() {
        super.f4();
        duringCreated(FeedModule.m1140H().u8()).subscribe(mkd0.G(new e30() { // from class: l.b6h
            public final void call(Object obj) {
                this.f6118a.m3001Q4((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m3010g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1561B = getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f1562C = getArguments().getString("user_id");
        this.f1563D = getArguments().getString("groupId");
        if (NullChecker.a(this.f1561B)) {
            this.f1561B.m5075k5(true);
            this.f1561B.m5074j5(true);
            this.f1561B.m5072h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM5080n5 = PhotoAlbumFeedBaseFrag.m5080n5(this.f1562C, "from_group_detail_new", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 7);
        this.f1561B = photoAlbumFeedBaseFragM5080n5;
        photoAlbumFeedBaseFragM5080n5.m5075k5(true);
        this.f1561B.m5074j5(true);
        this.f1561B.m5072h5(this);
        k kVarM = getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f1561B, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3006O4(layoutInflater, viewGroup);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: o */
    public void mo3012o() {
        act().finish();
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView] */
    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f1561B;
        this.f1565F = new C2124a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f2915z.f13114b, this.f1562C, "from_group_detail_new", 7, false);
        this.f1561B.f2915z.f13114b.setTag("SECOND_RECYCLER_TAG");
        this.f1561B.f2915z.f13114b.setMaxHeight(xdl0.w0());
        ?? r0 = this.f1561B.f2915z.f13114b;
        this.f1568I = r0;
        xdl0.c0((View) r0, t100.d(156.0f));
        this.f1568I.setClipToPadding(false);
        return this.f1565F;
    }

    @Override // p007l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo3015w1() {
        return this.f1564E;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo3002B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
