package com.p000p1.mobile.putong.feed.newui.photoalbum.discovery;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import p007l.b5c0;
import p007l.n7c;
import p007l.o6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FriendsFeedContainerFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public boolean f2944A;

    /* JADX INFO: renamed from: B */
    public boolean f2945B;

    /* JADX INFO: renamed from: C */
    public boolean f2946C;

    /* JADX INFO: renamed from: D */
    public boolean f2947D;

    /* JADX INFO: renamed from: E */
    public PhotoAlbumFeedFrag f2948E;

    /* JADX INFO: renamed from: F */
    public PhotoAlbumFeedFrag f2949F;

    /* JADX INFO: renamed from: G */
    public PhotoAlbumFeedFrag f2950G;

    /* JADX INFO: renamed from: H */
    public int f2951H = -1;

    /* JADX INFO: renamed from: I */
    public int f2952I = -1;

    /* JADX INFO: renamed from: z */
    public FrameLayout f2953z;

    /* JADX INFO: renamed from: M4 */
    public static FriendsFeedContainerFrag m5115M4(String str) {
        FriendsFeedContainerFrag friendsFeedContainerFrag = new FriendsFeedContainerFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        friendsFeedContainerFrag.setArguments(bundle);
        return friendsFeedContainerFrag;
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m5116B4() {
        return false;
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m5117N4(int i) {
        PhotoAlbumFeedFrag photoAlbumFeedFrag;
        boolean z;
        if (getActivity() == null) {
            this.f2952I = i;
            return false;
        }
        if (this.f2951H == i) {
            return false;
        }
        if (NullChecker.a(this.f2950G)) {
            m5129Y4();
            m5132b5();
            photoAlbumFeedFrag = this.f2950G;
        } else {
            photoAlbumFeedFrag = null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        k kVarM = childFragmentManager.m();
        if (i == 2 && childFragmentManager.i0("FriendsFeedContainerFrag_Dating") == null) {
            kVarM.c(b5c0.f5992Q, this.f2949F, "FriendsFeedContainerFrag_Dating");
        }
        if (i == 1 && childFragmentManager.i0("FriendsFeedContainerFrag_Following") == null) {
            kVarM.c(b5c0.f5992Q, this.f2948E, "FriendsFeedContainerFrag_Following");
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            this.f2950G = this.f2948E;
        } else if (i == 2) {
            this.f2950G = this.f2949F;
        }
        this.f2951H = i;
        kVarM.y(this.f2950G);
        if (NullChecker.a(photoAlbumFeedFrag) && photoAlbumFeedFrag != this.f2950G) {
            photoAlbumFeedFrag.m5460h5(false);
            photoAlbumFeedFrag.m5459g5(false);
            kVarM.p(photoAlbumFeedFrag);
        }
        this.f2950G.m5460h5(this.f2945B);
        this.f2950G.m5459g5(this.f2946C);
        kVarM.j();
        boolean zE0 = childFragmentManager.e0();
        if (this.f2948E == this.f2950G && !z && n7c.m12098e().f10689a) {
            this.f2950G.m5454c5();
            this.f2950G.m5450Y4();
        }
        if (NullChecker.a(photoAlbumFeedFrag) && photoAlbumFeedFrag != this.f2950G) {
            photoAlbumFeedFrag.setUserVisibleHint(false);
            this.f2950G.setUserVisibleHint(this.f2944A);
        }
        return zE0;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m5118O4() {
        if (NullChecker.a(this.f2948E) && NullChecker.a(this.f2949F)) {
            return;
        }
        this.f2948E = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0);
        this.f2949F = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_discover_dating", -1, User.ID_TEAM_ACCOUNT, 14);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m5119P0() {
        return m5121Q4().m5440P0();
    }

    /* JADX INFO: renamed from: P4 */
    public void m5120P4() {
        m5121Q4().m5441P4();
    }

    /* JADX INFO: renamed from: Q4 */
    public PhotoAlbumFeedFrag m5121Q4() {
        if (this.f2950G == null) {
            if (this.f2949F == null) {
                m5118O4();
            }
            this.f2950G = this.f2949F;
        }
        return this.f2950G;
    }

    /* JADX INFO: renamed from: R4 */
    public boolean m5122R4() {
        return m5121Q4().m5442Q4();
    }

    /* JADX INFO: renamed from: S4 */
    public void m5123S4() {
        m5121Q4().m5447V4();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m5124T4() {
        m5118O4();
        if (this.f2947D) {
            this.f2949F.m5446U4().m8725j0();
        }
    }

    /* JADX INFO: renamed from: U4 */
    public void m5125U4() {
        this.f2947D = true;
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f2949F;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.m5446U4().m8725j0();
    }

    /* JADX INFO: renamed from: V4 */
    public void m5126V4() {
        m5121Q4().m5450Y4();
    }

    /* JADX INFO: renamed from: W4 */
    public void m5127W4() {
        m5121Q4().m5451Z4();
    }

    /* JADX INFO: renamed from: X4 */
    public void m5128X4() {
        m5121Q4().m5452a5();
    }

    /* JADX INFO: renamed from: Y4 */
    public void m5129Y4() {
        m5121Q4().m5453b5();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m5130Z4(boolean z) {
        this.f2946C = z;
        m5121Q4().m5459g5(z);
    }

    /* JADX INFO: renamed from: a5 */
    public void m5131a5(boolean z) {
        this.f2945B = z;
        m5121Q4().m5460h5(z);
    }

    /* JADX INFO: renamed from: b5 */
    public void m5132b5() {
        m5121Q4().m5463m5();
    }

    /* JADX INFO: renamed from: f4 */
    public void m5133f4() {
        super.f4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m5134g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m5124T4();
        if (this.f2951H < 0) {
            m5117N4(this.f2952I != 1 ? 2 : 1);
            this.f2952I = -1;
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11326w0, viewGroup, false);
        this.f2953z = (FrameLayout) viewInflate.findViewById(b5c0.f5992Q);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n4 */
    public void m5135n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
        m5129Y4();
        m5132b5();
    }

    public void setUserVisibleHint(boolean z) {
        super/*androidx.fragment.app.Fragment*/.setUserVisibleHint(z);
        if (z) {
            this.f2944A = true;
        } else {
            this.f2944A = false;
        }
        m5121Q4().setUserVisibleHint(z);
    }

    /* JADX INFO: renamed from: y4 */
    public void m5136y4() {
    }
}
