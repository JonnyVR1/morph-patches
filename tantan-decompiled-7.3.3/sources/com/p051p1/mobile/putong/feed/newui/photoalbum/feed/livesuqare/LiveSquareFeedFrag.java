package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare;

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
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.e2u;
import p153l.f2u;
import p153l.hdc0;
import p153l.n570;
import p153l.s2m;
import p153l.s8h;
import p153l.y670;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareFeedFrag extends PutongFrag implements s2m {

    /* JADX INFO: renamed from: A */
    public FrameLayout f42509A;

    /* JADX INFO: renamed from: B */
    public PhotoAlbumFeedBaseFrag f42510B;

    /* JADX INFO: renamed from: C */
    public String f42511C = "PhotoAlbumFeedBaseFrag";

    /* JADX INFO: renamed from: D */
    public String f42512D;

    /* JADX INFO: renamed from: E */
    public e2u f42513E;

    /* JADX INFO: renamed from: F */
    public C11443a f42514F;

    /* JADX INFO: renamed from: z */
    public LinearLayout f42515z;

    /* JADX INFO: renamed from: N4 */
    public static LiveSquareFeedFrag m65590N4(String str) {
        LiveSquareFeedFrag liveSquareFeedFrag = new LiveSquareFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        liveSquareFeedFrag.setArguments(bundle);
        return liveSquareFeedFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: I4 */
    public void mo30635I4() {
        y670 y670Var;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f42510B;
        if (photoAlbumFeedBaseFrag == null || (y670Var = photoAlbumFeedBaseFrag.f42302z) == null) {
            return;
        }
        y670Var.mo153737z();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        e2u e2uVar = new e2u(this.f42510B);
        this.f42513E = e2uVar;
        return e2uVar;
    }

    /* JADX INFO: renamed from: M4 */
    public View m65591M4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2u.m123680b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42512D = getArguments().getString("user_id");
        FeedModule.m61406H().mo31695I4();
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) getChildFragmentManager().m2558i0(this.f42511C);
        this.f42510B = photoAlbumFeedBaseFrag;
        if (NullChecker.m82486a(photoAlbumFeedBaseFrag)) {
            this.f42510B.m65213k5(true);
            this.f42510B.m65212j5(true);
            this.f42510B.m65210h5(this);
            return;
        }
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM65218p5 = PhotoAlbumFeedBaseFrag.m65218p5(this.f42512D, "from_live_square_tab", 0, "", 19, true);
        this.f42510B = photoAlbumFeedBaseFragM65218p5;
        photoAlbumFeedBaseFragM65218p5.m65213k5(true);
        this.f42510B.m65212j5(true);
        this.f42510B.m65210h5(this);
        AbstractC0428k abstractC0428kM2568m = getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f42510B, this.f42511C);
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m65591M4(layoutInflater, viewGroup);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f42510B;
        C11443a c11443a = new C11443a(photoAlbumFeedBaseFrag, photoAlbumFeedBaseFrag.f42302z.f197638b, this.f42512D, "from_live_square_tab", 19, true);
        this.f42514F = c11443a;
        return c11443a;
    }
}
