package com.p046p1.mobile.putong.feed.newui.photoalbum.discovery;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.b5c0;
import p149l.n7c;
import p149l.o6c0;

/* JADX INFO: loaded from: classes12.dex */
public class FriendsFeedContainerFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public boolean f41483A;

    /* JADX INFO: renamed from: B */
    public boolean f41484B;

    /* JADX INFO: renamed from: C */
    public boolean f41485C;

    /* JADX INFO: renamed from: D */
    public boolean f41486D;

    /* JADX INFO: renamed from: E */
    public PhotoAlbumFeedFrag f41487E;

    /* JADX INFO: renamed from: F */
    public PhotoAlbumFeedFrag f41488F;

    /* JADX INFO: renamed from: G */
    public PhotoAlbumFeedFrag f41489G;

    /* JADX INFO: renamed from: H */
    public int f41490H = -1;

    /* JADX INFO: renamed from: I */
    public int f41491I = -1;

    /* JADX INFO: renamed from: z */
    public FrameLayout f41492z;

    /* JADX INFO: renamed from: M4 */
    public static FriendsFeedContainerFrag m64068M4(String str) {
        FriendsFeedContainerFrag friendsFeedContainerFrag = new FriendsFeedContainerFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        friendsFeedContainerFrag.setArguments(bundle);
        return friendsFeedContainerFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m64069N4(int i) {
        PhotoAlbumFeedFrag photoAlbumFeedFrag;
        boolean z;
        if (getActivity() == null) {
            this.f41491I = i;
            return false;
        }
        if (this.f41490H == i) {
            return false;
        }
        if (NullChecker.m81303a(this.f41489G)) {
            m64081Y4();
            m64084b5();
            photoAlbumFeedFrag = this.f41489G;
        } else {
            photoAlbumFeedFrag = null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC0427k abstractC0427kM2567m = childFragmentManager.m2567m();
        if (i == 2 && childFragmentManager.m2557i0("FriendsFeedContainerFrag_Dating") == null) {
            abstractC0427kM2567m.m2804c(b5c0.f73511Q, this.f41488F, "FriendsFeedContainerFrag_Dating");
        }
        if (i == 1 && childFragmentManager.m2557i0("FriendsFeedContainerFrag_Following") == null) {
            abstractC0427kM2567m.m2804c(b5c0.f73511Q, this.f41487E, "FriendsFeedContainerFrag_Following");
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            this.f41489G = this.f41487E;
        } else if (i == 2) {
            this.f41489G = this.f41488F;
        }
        this.f41490H = i;
        abstractC0427kM2567m.mo2717y(this.f41489G);
        if (NullChecker.m81303a(photoAlbumFeedFrag) && photoAlbumFeedFrag != this.f41489G) {
            photoAlbumFeedFrag.m64384h5(false);
            photoAlbumFeedFrag.m64383g5(false);
            abstractC0427kM2567m.mo2713p(photoAlbumFeedFrag);
        }
        this.f41489G.m64384h5(this.f41484B);
        this.f41489G.m64383g5(this.f41485C);
        abstractC0427kM2567m.mo2708j();
        boolean zM2545e0 = childFragmentManager.m2545e0();
        if (this.f41487E == this.f41489G && !z && n7c.m158118e().f137494a) {
            this.f41489G.m64380c5();
            this.f41489G.m64376Y4();
        }
        if (NullChecker.m81303a(photoAlbumFeedFrag) && photoAlbumFeedFrag != this.f41489G) {
            photoAlbumFeedFrag.setUserVisibleHint(false);
            this.f41489G.setUserVisibleHint(this.f41483A);
        }
        return zM2545e0;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m64070O4() {
        if (NullChecker.m81303a(this.f41487E) && NullChecker.m81303a(this.f41488F)) {
            return;
        }
        this.f41487E = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0);
        this.f41488F = PhotoAlbumFeedFrag.m64360M4(FeedModule.m60221F().userId(), "from_discover_dating", -1, User.ID_TEAM_ACCOUNT, 14);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m64071P0() {
        return m64073Q4().m64366P0();
    }

    /* JADX INFO: renamed from: P4 */
    public void m64072P4() {
        m64073Q4().m64367P4();
    }

    /* JADX INFO: renamed from: Q4 */
    public PhotoAlbumFeedFrag m64073Q4() {
        if (this.f41489G == null) {
            if (this.f41488F == null) {
                m64070O4();
            }
            this.f41489G = this.f41488F;
        }
        return this.f41489G;
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m64074R4() {
        return m64073Q4().m64368Q4();
    }

    /* JADX INFO: renamed from: S4 */
    public void m64075S4() {
        m64073Q4().m64373V4();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m64076T4() {
        m64070O4();
        if (this.f41486D) {
            this.f41488F.m64372U4().m100605j0();
        }
    }

    /* JADX INFO: renamed from: U4 */
    public void m64077U4() {
        this.f41486D = true;
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f41488F;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.m64372U4().m100605j0();
    }

    /* JADX INFO: renamed from: V4 */
    public void m64078V4() {
        m64073Q4().m64376Y4();
    }

    /* JADX INFO: renamed from: W4 */
    public void m64079W4() {
        m64073Q4().m64377Z4();
    }

    /* JADX INFO: renamed from: X4 */
    public void m64080X4() {
        m64073Q4().m64378a5();
    }

    /* JADX INFO: renamed from: Y4 */
    public void m64081Y4() {
        m64073Q4().m64379b5();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m64082Z4(boolean z) {
        this.f41485C = z;
        m64073Q4().m64383g5(z);
    }

    /* JADX INFO: renamed from: a5 */
    public void m64083a5(boolean z) {
        this.f41484B = z;
        m64073Q4().m64384h5(z);
    }

    /* JADX INFO: renamed from: b5 */
    public void m64084b5() {
        m64073Q4().m64387m5();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        m64076T4();
        if (this.f41490H < 0) {
            m64069N4(this.f41491I != 1 ? 2 : 1);
            this.f41491I = -1;
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142307w0, viewGroup, false);
        this.f41492z = (FrameLayout) viewInflate.findViewById(b5c0.f73511Q);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m64081Y4();
        m64084b5();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            this.f41483A = true;
        } else {
            this.f41483A = false;
        }
        m64073Q4().setUserVisibleHint(z);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
    }
}
