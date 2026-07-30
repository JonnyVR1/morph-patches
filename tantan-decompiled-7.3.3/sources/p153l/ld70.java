package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.helper.exception.FeedOnRefreshException;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: classes13.dex */
public class ld70 extends y670<kd70> implements jn50 {

    /* JADX INFO: renamed from: n */
    public VFrame f131418n;

    /* JADX INFO: renamed from: o */
    public VPullDownRefreshLayout f131419o;

    /* JADX INFO: renamed from: p */
    public FeedMaxHeightRecyclerView f131420p;

    /* JADX INFO: renamed from: q */
    public y20<String> f131421q;

    public ld70(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag) {
        super(photoAlbumFeedBaseFrag);
    }

    @Override // p153l.y670
    /* JADX INFO: renamed from: I */
    public void mo153727I() {
        this.f197638b = this.f131420p;
    }

    @Override // p153l.y670
    /* JADX INFO: renamed from: L */
    public void mo153728L(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f131419o;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(z);
    }

    /* JADX INFO: renamed from: M */
    public View m153729M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return md70.m157961b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N */
    public void m153730N() {
        md70.m157962c(this);
    }

    @Override // p153l.y670, p153l.iam
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kd70 kd70Var) {
        this.f197640d = kd70Var;
    }

    /* JADX INFO: renamed from: P */
    public void m153732P(y20<String> y20Var) {
        this.f131421q = y20Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m153733Q() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f131419o;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(true);
    }

    @Override // p153l.y670
    /* JADX INFO: renamed from: n */
    public View mo153734n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM153729M = m153729M(layoutInflater, viewGroup);
        viewM153729M.setBackgroundColor(this.f197639c.getResources().getColor(k9c0.f124526p0));
        if (FeedModule.m61406H().mo31695I4()) {
            TextUtils.equals(this.f197640d.f182607d, "from_live_square_tab");
        }
        return viewM153729M;
    }

    @Override // p153l.y670
    /* JADX INFO: renamed from: v */
    public void mo153735v(Bundle bundle) {
        super.mo153735v(bundle);
        this.f131419o.mo224405O(this);
        if (this.f197640d.f182612i) {
            this.f131419o.m225013l();
        }
    }

    @Override // p153l.y670
    /* JADX INFO: renamed from: w */
    public boolean mo153736w() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f131419o;
        if (vPullDownRefreshLayout == null) {
            return false;
        }
        return vPullDownRefreshLayout.m224996B();
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull @NotNull mvc0 mvc0Var) {
        if (this.f197640d.f182605b == null) {
            m153733Q();
            FeedOnRefreshException.reportFeedOnRefreshException();
            return;
        }
        if (cmg.m111183K()) {
            FriendsFeedViewPagerFrag.f42346K0.onNext(Boolean.TRUE);
        }
        if (NullChecker.m82486a(this.f131421q)) {
            this.f131421q.call("");
        }
        m214403y();
    }

    @Override // p153l.y670
    /* JADX INFO: renamed from: z */
    public void mo153737z() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f131419o;
        if (vPullDownRefreshLayout == null || vPullDownRefreshLayout.m224996B()) {
            return;
        }
        this.f131419o.m225013l();
        super.mo153737z();
    }
}
