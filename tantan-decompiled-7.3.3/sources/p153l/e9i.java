package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class e9i implements iam<d9i>, s2m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f92636a;

    /* JADX INFO: renamed from: b */
    public FeedTopicMomentFragment f92637b;

    /* JADX INFO: renamed from: c */
    public d9i f92638c;

    /* JADX INFO: renamed from: d */
    public C11443a f92639d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedBaseFrag f92640e;

    public e9i(FeedTopicMomentFragment feedTopicMomentFragment) {
        this.f92637b = feedTopicMomentFragment;
    }

    /* JADX INFO: renamed from: e */
    private ld70 m119885e() {
        return (ld70) this.f92640e.f42302z;
    }

    /* JADX INFO: renamed from: f */
    private void m119886f() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) this.f92637b.getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f92640e = photoAlbumFeedBaseFrag;
        if (NullChecker.m82486a(photoAlbumFeedBaseFrag)) {
            this.f92640e.m65213k5(true);
            this.f92640e.m65212j5(true);
            m119887l();
            return;
        }
        d9i d9iVar = this.f92638c;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM65219q5 = PhotoAlbumFeedBaseFrag.m65219q5(d9iVar.f85783g, d9iVar.f85781e, d9iVar.f85777a, d9iVar.f85778b);
        this.f92640e = photoAlbumFeedBaseFragM65219q5;
        photoAlbumFeedBaseFragM65219q5.m65213k5(true);
        this.f92640e.m65212j5(true);
        m119887l();
        AbstractC0428k abstractC0428kM2568m = this.f92637b.getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f92640e, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: l */
    private void m119887l() {
        this.f92640e.m65210h5(this);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        return this.f92638c.m115072k0();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m119888a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f9i.m124657b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m119889b() {
        f9i.m124658c(this);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d9i d9iVar) {
        this.f92638c = d9iVar;
    }

    /* JADX INFO: renamed from: d */
    public VRecyclerView m119891d() {
        return m119885e().f131420p;
    }

    /* JADX INFO: renamed from: i */
    public void m119892i(Bundle bundle) {
        m119886f();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM119888a = m119888a(layoutInflater, viewGroup);
        viewM119888a.setBackgroundColor(-1);
        return viewM119888a;
    }

    /* JADX INFO: renamed from: j */
    public void m119893j() {
        m119885e().mo153737z();
    }

    /* JADX INFO: renamed from: k */
    public void m119894k(boolean z) {
        this.f92638c.f85786j.onNext(Boolean.valueOf(z));
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        d9i d9iVar = this.f92638c;
        boolean z = d9iVar.f85787k;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f92640e;
        if (z) {
            VRecyclerView vRecyclerViewM119891d = m119891d();
            d9i d9iVar2 = this.f92638c;
            tsb0 tsb0Var = new tsb0(photoAlbumFeedBaseFrag, d9iVar, vRecyclerViewM119891d, d9iVar2.f85783g, d9iVar2.f85777a, d9iVar2.f85778b);
            this.f92639d = tsb0Var;
            return tsb0Var;
        }
        VRecyclerView vRecyclerViewM119891d2 = m119891d();
        d9i d9iVar3 = this.f92638c;
        e7j0 e7j0Var = new e7j0(photoAlbumFeedBaseFrag, d9iVar, vRecyclerViewM119891d2, d9iVar3.f85783g, d9iVar3.f85777a, d9iVar3.f85778b);
        this.f92639d = e7j0Var;
        return e7j0Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }
}
