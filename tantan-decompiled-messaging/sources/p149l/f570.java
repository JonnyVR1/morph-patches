package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.helper.exception.FeedOnRefreshException;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class f570 extends sy60<e570> implements df50 {

    /* JADX INFO: renamed from: n */
    public VFrame f94965n;

    /* JADX INFO: renamed from: o */
    public VPullDownRefreshLayout f94966o;

    /* JADX INFO: renamed from: p */
    public FeedMaxHeightRecyclerView f94967p;

    /* JADX INFO: renamed from: q */
    public e30<String> f94968q;

    public f570(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag) {
        super(photoAlbumFeedBaseFrag);
    }

    @Override // p149l.sy60
    /* JADX INFO: renamed from: I */
    public void mo119475I() {
        this.f166899b = this.f94967p;
    }

    @Override // p149l.sy60
    /* JADX INFO: renamed from: L */
    public void mo119476L(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f94966o;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(z);
    }

    /* JADX INFO: renamed from: M */
    public View m119477M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g570.m124474b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N */
    public void m119478N() {
        g570.m124475c(this);
    }

    @Override // p149l.sy60, p149l.s7m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e570 e570Var) {
        this.f166901d = e570Var;
    }

    /* JADX INFO: renamed from: P */
    public void m119480P(e30<String> e30Var) {
        this.f94968q = e30Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m119481Q() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f94966o;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(true);
    }

    @Override // p149l.sy60
    /* JADX INFO: renamed from: n */
    public View mo119482n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM119477M = m119477M(layoutInflater, viewGroup);
        viewM119477M.setBackgroundColor(this.f166900c.getResources().getColor(e1c0.f88803p0));
        if (FeedModule.m60222H().mo30692I4()) {
            TextUtils.equals(this.f166901d.f151805d, "from_live_square_tab");
        }
        return viewM119477M;
    }

    @Override // p149l.sy60
    /* JADX INFO: renamed from: v */
    public void mo119483v(Bundle bundle) {
        super.mo119483v(bundle);
        this.f94966o.mo223159O(this);
        if (this.f166901d.f151810i) {
            this.f94966o.m223767l();
        }
    }

    @Override // p149l.sy60
    /* JADX INFO: renamed from: w */
    public boolean mo119484w() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f94966o;
        if (vPullDownRefreshLayout == null) {
            return false;
        }
        return vPullDownRefreshLayout.m223750B();
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull @NotNull hnc0 hnc0Var) {
        if (this.f166901d.f151803b == null) {
            m119481Q();
            FeedOnRefreshException.reportFeedOnRefreshException();
            return;
        }
        if (nkg.m159854K()) {
            FriendsFeedViewPagerFrag.f41498K0.onNext(Boolean.TRUE);
        }
        if (NullChecker.m81303a(this.f94968q)) {
            this.f94968q.call("");
        }
        m186633y();
    }

    @Override // p149l.sy60
    /* JADX INFO: renamed from: z */
    public void mo119485z() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f94966o;
        if (vPullDownRefreshLayout == null || vPullDownRefreshLayout.m223750B()) {
            return;
        }
        this.f94966o.m223767l();
        super.mo119485z();
    }
}
