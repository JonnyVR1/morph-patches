package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare;

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
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p007l.b5c0;
import p007l.d0u;
import p007l.d7h;
import p007l.e0u;
import p007l.hx60;
import p007l.sy60;
import p007l.yzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveSquareFeedFrag extends PutongFrag implements yzl {

    /* JADX INFO: renamed from: A */
    public FrameLayout f3122A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f3123B;

    /* JADX INFO: renamed from: C */
    public String f3124C = "PhotoAlbumFeedBaseFrag";

    /* JADX INFO: renamed from: D */
    public String f3125D;

    /* JADX INFO: renamed from: E */
    public d0u f3126E;

    /* JADX INFO: renamed from: F */
    public C2124a f3127F;

    /* JADX INFO: renamed from: z */
    public LinearLayout f3128z;

    /* JADX INFO: renamed from: N4 */
    public static LiveSquareFeedFrag m5485N4(String str) {
        LiveSquareFeedFrag liveSquareFeedFrag = new LiveSquareFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        liveSquareFeedFrag.setArguments(bundle);
        return liveSquareFeedFrag;
    }

    /* JADX INFO: renamed from: I4 */
    public void m5486I4() {
        sy60 sy60Var;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f3123B;
        if (photoAlbumFeedBaseFrag == null || (sy60Var = photoAlbumFeedBaseFrag.f2915z) == null) {
            return;
        }
        sy60Var.mo10062z();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        d0u d0uVar = new d0u(this.f3123B);
        this.f3126E = d0uVar;
        return d0uVar;
    }

    /* JADX INFO: renamed from: M4 */
    public View m5487M4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e0u.m9598b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        return null;
    }

    /* JADX INFO: renamed from: g4 */
    public void m5488g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3125D = getArguments().getString("user_id");
        FeedModule.m1140H().I4();
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragI0 = getChildFragmentManager().i0(this.f3124C);
        this.f3123B = photoAlbumFeedBaseFragI0;
        if (NullChecker.a(photoAlbumFeedBaseFragI0)) {
            this.f3123B.m5075k5(true);
            this.f3123B.m5074j5(true);
            this.f3123B.m5072h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM5082p5 = PhotoAlbumFeedBaseFrag.m5082p5(this.f3125D, "from_live_square_tab", 0, "", 19, true);
        this.f3123B = photoAlbumFeedBaseFragM5082p5;
        photoAlbumFeedBaseFragM5082p5.m5075k5(true);
        this.f3123B.m5074j5(true);
        this.f3123B.m5072h5(this);
        k kVarM = getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f3123B, this.f3124C);
        kVarM.j();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5487M4(layoutInflater, viewGroup);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f3123B;
        C2124a c2124a = new C2124a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f2915z.f13114b, this.f3125D, "from_live_square_tab", 19, true);
        this.f3127F = c2124a;
        return c2124a;
    }
}
