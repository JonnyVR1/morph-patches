package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.helper.exception.FeedOnRefreshException;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import l.df50;
import l.e30;
import l.hnc0;
import org.jetbrains.annotations.NotNull;
import v.VFrame;
import v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f570 extends sy60<e570> implements df50 {

    /* JADX INFO: renamed from: n */
    public VFrame f7988n;

    /* JADX INFO: renamed from: o */
    public VPullDownRefreshLayout f7989o;

    /* JADX INFO: renamed from: p */
    public FeedMaxHeightRecyclerView f7990p;

    /* JADX INFO: renamed from: q */
    public e30<String> f7991q;

    public f570(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag) {
        super(photoAlbumFeedBaseFrag);
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: I */
    public void mo10050I() {
        this.f13114b = this.f7990p;
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: L */
    public void mo10051L(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f7989o;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(z);
    }

    /* JADX INFO: renamed from: M */
    public View m10052M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g570.m10417b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N */
    public void m10053N() {
        g570.m10418c(this);
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo10057i1(e570 e570Var) {
        this.f13116d = e570Var;
    }

    /* JADX INFO: renamed from: P */
    public void m10055P(e30<String> e30Var) {
        this.f7991q = e30Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m10056Q() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f7989o;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(true);
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: n */
    public View mo10058n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM10052M = m10052M(layoutInflater, viewGroup);
        viewM10052M.setBackgroundColor(this.f13115c.getResources().getColor(e1c0.f7159p0));
        if (FeedModule.m1140H().I4()) {
            TextUtils.equals(this.f13116d.f12013d, "from_live_square_tab");
        }
        return viewM10052M;
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: v */
    public void mo10059v(Bundle bundle) {
        super.mo10059v(bundle);
        this.f7989o.O(this);
        if (this.f13116d.f12018i) {
            this.f7989o.l();
        }
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: w */
    public boolean mo10060w() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f7989o;
        if (vPullDownRefreshLayout == null) {
            return false;
        }
        return vPullDownRefreshLayout.B();
    }

    /* JADX INFO: renamed from: w2 */
    public void m10061w2(@NonNull @NotNull hnc0 hnc0Var) {
        if (this.f13116d.f12011b == null) {
            m10056Q();
            FeedOnRefreshException.reportFeedOnRefreshException();
            return;
        }
        if (nkg.m12213K()) {
            FriendsFeedViewPagerFrag.f2959K0.onNext(Boolean.TRUE);
        }
        if (NullChecker.a(this.f7991q)) {
            this.f7991q.call("");
        }
        m14405y();
    }

    @Override // p007l.sy60
    /* JADX INFO: renamed from: z */
    public void mo10062z() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f7989o;
        if (vPullDownRefreshLayout == null || vPullDownRefreshLayout.B()) {
            return;
        }
        this.f7989o.l();
        super.mo10062z();
    }
}
