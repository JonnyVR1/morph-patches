package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare;

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
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.b5c0;
import p149l.d0u;
import p149l.d7h;
import p149l.e0u;
import p149l.hx60;
import p149l.sy60;
import p149l.yzl;

/* JADX INFO: loaded from: classes12.dex */
public class LiveSquareFeedFrag extends PutongFrag implements yzl {

    /* JADX INFO: renamed from: A */
    public FrameLayout f41661A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f41662B;

    /* JADX INFO: renamed from: C */
    public String f41663C = "PhotoAlbumFeedBaseFrag";

    /* JADX INFO: renamed from: D */
    public String f41664D;

    /* JADX INFO: renamed from: E */
    public d0u f41665E;

    /* JADX INFO: renamed from: F */
    public C11280a f41666F;

    /* JADX INFO: renamed from: z */
    public LinearLayout f41667z;

    /* JADX INFO: renamed from: N4 */
    public static LiveSquareFeedFrag m64407N4(String str) {
        LiveSquareFeedFrag liveSquareFeedFrag = new LiveSquareFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        liveSquareFeedFrag.setArguments(bundle);
        return liveSquareFeedFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: I4 */
    public void mo29637I4() {
        sy60 sy60Var;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f41662B;
        if (photoAlbumFeedBaseFrag == null || (sy60Var = photoAlbumFeedBaseFrag.f41454z) == null) {
            return;
        }
        sy60Var.mo119485z();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        d0u d0uVar = new d0u(this.f41662B);
        this.f41665E = d0uVar;
        return d0uVar;
    }

    /* JADX INFO: renamed from: M4 */
    public View m64408M4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e0u.m114343b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41664D = getArguments().getString("user_id");
        FeedModule.m60222H().mo30692I4();
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) getChildFragmentManager().m2557i0(this.f41663C);
        this.f41662B = photoAlbumFeedBaseFrag;
        if (NullChecker.m81303a(photoAlbumFeedBaseFrag)) {
            this.f41662B.m64030k5(true);
            this.f41662B.m64029j5(true);
            this.f41662B.m64027h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM64035p5 = PhotoAlbumFeedBaseFrag.m64035p5(this.f41664D, "from_live_square_tab", 0, "", 19, true);
        this.f41662B = photoAlbumFeedBaseFragM64035p5;
        photoAlbumFeedBaseFragM64035p5.m64030k5(true);
        this.f41662B.m64029j5(true);
        this.f41662B.m64027h5(this);
        AbstractC0427k abstractC0427kM2567m = getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f41662B, this.f41663C);
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m64408M4(layoutInflater, viewGroup);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f41662B;
        C11280a c11280a = new C11280a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f41454z.f166899b, this.f41664D, "from_live_square_tab", 19, true);
        this.f41666F = c11280a;
        return c11280a;
    }
}
