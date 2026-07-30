package p007l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.s7m;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p7i implements s7m<o7i>, yzl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f11717a;

    /* JADX INFO: renamed from: b */
    public FeedTopicMomentFragment f11718b;

    /* JADX INFO: renamed from: c */
    public o7i f11719c;

    /* JADX INFO: renamed from: d */
    public C2124a f11720d;

    /* JADX INFO: renamed from: e */
    public PhotoAlbumFeedBaseFrag f11721e;

    public p7i(FeedTopicMomentFragment feedTopicMomentFragment) {
        this.f11718b = feedTopicMomentFragment;
    }

    /* JADX INFO: renamed from: e */
    private f570 m12928e() {
        return (f570) this.f11721e.f2915z;
    }

    /* JADX INFO: renamed from: f */
    private void m12929f() {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragI0 = this.f11718b.getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f11721e = photoAlbumFeedBaseFragI0;
        if (NullChecker.a(photoAlbumFeedBaseFragI0)) {
            this.f11721e.m5075k5(true);
            this.f11721e.m5074j5(true);
            m12930l();
            return;
        }
        o7i o7iVar = this.f11719c;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM5083q5 = PhotoAlbumFeedBaseFrag.m5083q5(o7iVar.f11370g, o7iVar.f11368e, o7iVar.f11364a, o7iVar.f11365b);
        this.f11721e = photoAlbumFeedBaseFragM5083q5;
        photoAlbumFeedBaseFragM5083q5.m5075k5(true);
        this.f11721e.m5074j5(true);
        m12930l();
        k kVarM = this.f11718b.getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f11721e, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    /* JADX INFO: renamed from: l */
    private void m12930l() {
        this.f11721e.m5072h5(this);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12931C0() {
        return null;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        return this.f11719c.m12455k0();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m12932a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q7i.m13488b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m12933b() {
        q7i.m13489c(this);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m12937i1(o7i o7iVar) {
        this.f11719c = o7iVar;
    }

    /* JADX INFO: renamed from: d */
    public VRecyclerView m12935d() {
        return m12928e().f7990p;
    }

    /* JADX INFO: renamed from: i */
    public void m12936i(Bundle bundle) {
        m12929f();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12932a = m12932a(layoutInflater, viewGroup);
        viewM12932a.setBackgroundColor(-1);
        return viewM12932a;
    }

    /* JADX INFO: renamed from: j */
    public void m12938j() {
        m12928e().mo10062z();
    }

    /* JADX INFO: renamed from: k */
    public void m12939k(boolean z) {
        this.f11719c.f11373j.onNext(Boolean.valueOf(z));
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        o7i o7iVar = this.f11719c;
        boolean z = o7iVar.f11374k;
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = this.f11721e;
        if (z) {
            VRecyclerView vRecyclerViewM12935d = m12935d();
            o7i o7iVar2 = this.f11719c;
            pkb0 pkb0Var = new pkb0(photoAlbumFeedBaseFrag, o7iVar, vRecyclerViewM12935d, o7iVar2.f11370g, o7iVar2.f11364a, o7iVar2.f11365b);
            this.f11720d = pkb0Var;
            return pkb0Var;
        }
        VRecyclerView vRecyclerViewM12935d2 = m12935d();
        o7i o7iVar3 = this.f11719c;
        ayi0 ayi0Var = new ayi0(photoAlbumFeedBaseFrag, o7iVar, vRecyclerViewM12935d2, o7iVar3.f11370g, o7iVar3.f11364a, o7iVar3.f11365b);
        this.f11720d = ayi0Var;
        return ayi0Var;
    }

    public void destroy() {
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }
}
