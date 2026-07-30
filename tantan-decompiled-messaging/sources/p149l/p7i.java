package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class p7i implements s7m<o7i>, yzl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f147509a;

    /* JADX INFO: renamed from: b */
    public FeedTopicMomentFragment f147510b;

    /* JADX INFO: renamed from: c */
    public o7i f147511c;

    /* JADX INFO: renamed from: d */
    public C11280a f147512d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedBaseFrag f147513e;

    public p7i(FeedTopicMomentFragment feedTopicMomentFragment) {
        this.f147510b = feedTopicMomentFragment;
    }

    /* JADX INFO: renamed from: e */
    private f570 m167750e() {
        return (f570) this.f147513e.f41454z;
    }

    /* JADX INFO: renamed from: f */
    private void m167751f() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f147510b.getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f147513e = photoAlbumFeedBaseFrag;
        if (NullChecker.m81303a(photoAlbumFeedBaseFrag)) {
            this.f147513e.m64030k5(true);
            this.f147513e.m64029j5(true);
            m167752l();
            return;
        }
        o7i o7iVar = this.f147511c;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM64036q5 = PhotoAlbumFeedBaseFrag.m64036q5(o7iVar.f142498g, o7iVar.f142496e, o7iVar.f142492a, o7iVar.f142493b);
        this.f147513e = photoAlbumFeedBaseFragM64036q5;
        photoAlbumFeedBaseFragM64036q5.m64030k5(true);
        this.f147513e.m64029j5(true);
        m167752l();
        AbstractC0427k abstractC0427kM2567m = this.f147510b.getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f147513e, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: l */
    private void m167752l() {
        this.f147513e.m64027h5(this);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        return this.f147511c.m162989k0();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m167753a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q7i.m173261b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m167754b() {
        q7i.m173262c(this);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(o7i o7iVar) {
        this.f147511c = o7iVar;
    }

    /* JADX INFO: renamed from: d */
    public VRecyclerView m167756d() {
        return m167750e().f94967p;
    }

    /* JADX INFO: renamed from: i */
    public void m167757i(Bundle bundle) {
        m167751f();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM167753a = m167753a(layoutInflater, viewGroup);
        viewM167753a.setBackgroundColor(-1);
        return viewM167753a;
    }

    /* JADX INFO: renamed from: j */
    public void m167758j() {
        m167750e().mo119485z();
    }

    /* JADX INFO: renamed from: k */
    public void m167759k(boolean z) {
        this.f147511c.f142501j.onNext(Boolean.valueOf(z));
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        o7i o7iVar = this.f147511c;
        boolean z = o7iVar.f142502k;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f147513e;
        if (z) {
            VRecyclerView vRecyclerViewM167756d = m167756d();
            o7i o7iVar2 = this.f147511c;
            pkb0 pkb0Var = new pkb0(photoAlbumFeedBaseFrag, o7iVar, vRecyclerViewM167756d, o7iVar2.f142498g, o7iVar2.f142492a, o7iVar2.f142493b);
            this.f147512d = pkb0Var;
            return pkb0Var;
        }
        VRecyclerView vRecyclerViewM167756d2 = m167756d();
        o7i o7iVar3 = this.f147511c;
        ayi0 ayi0Var = new ayi0(photoAlbumFeedBaseFrag, o7iVar, vRecyclerViewM167756d2, o7iVar3.f142498g, o7iVar3.f142492a, o7iVar3.f142493b);
        this.f147512d = ayi0Var;
        return ayi0Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }
}
