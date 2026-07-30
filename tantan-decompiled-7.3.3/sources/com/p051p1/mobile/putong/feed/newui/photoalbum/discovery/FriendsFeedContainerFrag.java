package com.p051p1.mobile.putong.feed.newui.photoalbum.discovery;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import p153l.hdc0;
import p153l.t8c;
import p153l.tec0;

/* JADX INFO: loaded from: classes13.dex */
public class FriendsFeedContainerFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public boolean f42331A;

    /* JADX INFO: renamed from: B */
    public boolean f42332B;

    /* JADX INFO: renamed from: C */
    public boolean f42333C;

    /* JADX INFO: renamed from: D */
    public boolean f42334D;

    /* JADX INFO: renamed from: E */
    public PhotoAlbumFeedFrag f42335E;

    /* JADX INFO: renamed from: F */
    public PhotoAlbumFeedFrag f42336F;

    /* JADX INFO: renamed from: G */
    public PhotoAlbumFeedFrag f42337G;

    /* JADX INFO: renamed from: H */
    public int f42338H = -1;

    /* JADX INFO: renamed from: I */
    public int f42339I = -1;

    /* JADX INFO: renamed from: z */
    public FrameLayout f42340z;

    /* JADX INFO: renamed from: M4 */
    public static FriendsFeedContainerFrag m65251M4(String str) {
        FriendsFeedContainerFrag friendsFeedContainerFrag = new FriendsFeedContainerFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        friendsFeedContainerFrag.setArguments(bundle);
        return friendsFeedContainerFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m65252N4(int i) {
        PhotoAlbumFeedFrag photoAlbumFeedFrag;
        boolean z;
        if (getActivity() == null) {
            this.f42339I = i;
            return false;
        }
        if (this.f42338H == i) {
            return false;
        }
        if (NullChecker.m82486a(this.f42337G)) {
            m65264Y4();
            m65267b5();
            photoAlbumFeedFrag = this.f42337G;
        } else {
            photoAlbumFeedFrag = null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC0428k abstractC0428kM2568m = childFragmentManager.m2568m();
        if (i == 2 && childFragmentManager.m2558i0("FriendsFeedContainerFrag_Dating") == null) {
            abstractC0428kM2568m.m2805c(hdc0.f108864Q, this.f42336F, "FriendsFeedContainerFrag_Dating");
        }
        if (i == 1 && childFragmentManager.m2558i0("FriendsFeedContainerFrag_Following") == null) {
            abstractC0428kM2568m.m2805c(hdc0.f108864Q, this.f42335E, "FriendsFeedContainerFrag_Following");
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            this.f42337G = this.f42335E;
        } else if (i == 2) {
            this.f42337G = this.f42336F;
        }
        this.f42338H = i;
        abstractC0428kM2568m.mo2718y(this.f42337G);
        if (NullChecker.m82486a(photoAlbumFeedFrag) && photoAlbumFeedFrag != this.f42337G) {
            photoAlbumFeedFrag.m65567h5(false);
            photoAlbumFeedFrag.m65566g5(false);
            abstractC0428kM2568m.mo2714p(photoAlbumFeedFrag);
        }
        this.f42337G.m65567h5(this.f42332B);
        this.f42337G.m65566g5(this.f42333C);
        abstractC0428kM2568m.mo2709j();
        boolean zM2546e0 = childFragmentManager.m2546e0();
        if (this.f42335E == this.f42337G && !z && t8c.m189652e().f172520a) {
            this.f42337G.m65563c5();
            this.f42337G.m65559Y4();
        }
        if (NullChecker.m82486a(photoAlbumFeedFrag) && photoAlbumFeedFrag != this.f42337G) {
            photoAlbumFeedFrag.setUserVisibleHint(false);
            this.f42337G.setUserVisibleHint(this.f42331A);
        }
        return zM2546e0;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m65253O4() {
        if (NullChecker.m82486a(this.f42335E) && NullChecker.m82486a(this.f42336F)) {
            return;
        }
        this.f42335E = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0);
        this.f42336F = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_discover_dating", -1, User.ID_TEAM_ACCOUNT, 14);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m65254P0() {
        return m65256Q4().m65549P0();
    }

    /* JADX INFO: renamed from: P4 */
    public void m65255P4() {
        m65256Q4().m65550P4();
    }

    /* JADX INFO: renamed from: Q4 */
    public PhotoAlbumFeedFrag m65256Q4() {
        if (this.f42337G == null) {
            if (this.f42336F == null) {
                m65253O4();
            }
            this.f42337G = this.f42336F;
        }
        return this.f42337G;
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m65257R4() {
        return m65256Q4().m65551Q4();
    }

    /* JADX INFO: renamed from: S4 */
    public void m65258S4() {
        m65256Q4().m65556V4();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m65259T4() {
        m65253O4();
        if (this.f42334D) {
            this.f42336F.m65555U4().m134768j0();
        }
    }

    /* JADX INFO: renamed from: U4 */
    public void m65260U4() {
        this.f42334D = true;
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f42336F;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.m65555U4().m134768j0();
    }

    /* JADX INFO: renamed from: V4 */
    public void m65261V4() {
        m65256Q4().m65559Y4();
    }

    /* JADX INFO: renamed from: W4 */
    public void m65262W4() {
        m65256Q4().m65560Z4();
    }

    /* JADX INFO: renamed from: X4 */
    public void m65263X4() {
        m65256Q4().m65561a5();
    }

    /* JADX INFO: renamed from: Y4 */
    public void m65264Y4() {
        m65256Q4().m65562b5();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m65265Z4(boolean z) {
        this.f42333C = z;
        m65256Q4().m65566g5(z);
    }

    /* JADX INFO: renamed from: a5 */
    public void m65266a5(boolean z) {
        this.f42332B = z;
        m65256Q4().m65567h5(z);
    }

    /* JADX INFO: renamed from: b5 */
    public void m65267b5() {
        m65256Q4().m65570m5();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        m65259T4();
        if (this.f42338H < 0) {
            m65252N4(this.f42339I != 1 ? 2 : 1);
            this.f42339I = -1;
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173776w0, viewGroup, false);
        this.f42340z = (FrameLayout) viewInflate.findViewById(hdc0.f108864Q);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m65264Y4();
        m65267b5();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            this.f42331A = true;
        } else {
            this.f42331A = false;
        }
        m65256Q4().setUserVisibleHint(z);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
    }
}
