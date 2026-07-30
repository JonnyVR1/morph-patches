package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.recommend;

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
import p007l.d7h;
import p007l.hx60;
import p007l.m6h;
import p007l.q6h;
import p007l.tzl;
import p007l.vyp;
import p007l.yzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupRecommendMomentFrag extends PutongFrag implements yzl, tzl, vyp {

    /* JADX INFO: renamed from: A */
    public FrameLayout f1570A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f1571B;

    /* JADX INFO: renamed from: C */
    public String f1572C;

    /* JADX INFO: renamed from: D */
    public String f1573D;

    /* JADX INFO: renamed from: E */
    public String f1574E;

    /* JADX INFO: renamed from: F */
    public boolean f1575F;

    /* JADX INFO: renamed from: G */
    public C2124a f1576G;

    /* JADX INFO: renamed from: H */
    public d7h f1577H;

    /* JADX INFO: renamed from: I */
    public m6h f1578I;

    /* JADX INFO: renamed from: J */
    public FeedMaxHeightRecyclerView f1579J;

    /* JADX INFO: renamed from: z */
    public LinearLayout f1580z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m3018P4() {
        this.f1578I.mo5597A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m3019Q4(roj0 roj0Var) {
        e51.H(act(), new Runnable() { // from class: l.p6h
            @Override // java.lang.Runnable
            public final void run() {
                this.f11704a.m3018P4();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m3020B4() {
        return false;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        m6h m6hVar = new m6h(this.f1571B, this.f1573D);
        this.f1578I = m6hVar;
        m6hVar.m11834W(this.f1574E);
        return this.f1578I;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo3005N0() {
        this.f1575F = true;
    }

    /* JADX INFO: renamed from: O4 */
    public View m3021O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q6h.m13414b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo3007Q0() {
        return this.f1571B;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        return this.f1577H;
    }

    /* JADX INFO: renamed from: f4 */
    public void m3022f4() {
        super.f4();
        duringCreated(FeedModule.m1140H().u8()).subscribe(mkd0.G(new e30() { // from class: l.o6h
            public final void call(Object obj) {
                this.f11356a.m3019Q4((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m3023g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1571B = getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f1572C = getArguments().getString("user_id");
        this.f1573D = getArguments().getString("groupId");
        this.f1574E = getArguments().getString("first_append_moment_id");
        if (NullChecker.a(this.f1571B)) {
            this.f1571B.m5075k5(true);
            this.f1571B.m5074j5(true);
            this.f1571B.m5072h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM5080n5 = PhotoAlbumFeedBaseFrag.m5080n5(this.f1572C, "from_group_detail_recommend", getArguments().getInt("selected_item_position"), getArguments().getString("target_moment_id"), 7);
        this.f1571B = photoAlbumFeedBaseFragM5080n5;
        photoAlbumFeedBaseFragM5080n5.m5075k5(true);
        this.f1571B.m5074j5(true);
        this.f1571B.m5072h5(this);
        k kVarM = getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f1571B, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3021O4(layoutInflater, viewGroup);
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

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f1571B;
        this.f1576G = new C2124a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f2915z.f13114b, this.f1572C, "from_group_detail_recommend", 7, false);
        this.f1571B.f2915z.f13114b.setTag("SECOND_RECYCLER_TAG");
        this.f1571B.f2915z.f13114b.setMaxHeight(xdl0.w0());
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f1571B.f2915z.f13114b;
        this.f1579J = feedMaxHeightRecyclerView;
        feedMaxHeightRecyclerView.setClipToPadding(false);
        xdl0.c0(this.f1579J, t100.d(156.0f));
        return this.f1576G;
    }

    @Override // p007l.vyp
    /* JADX INFO: renamed from: w1 */
    public boolean mo3015w1() {
        return this.f1575F;
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo3002B3(j760<User, Boolean> j760Var, boolean z) {
    }
}
