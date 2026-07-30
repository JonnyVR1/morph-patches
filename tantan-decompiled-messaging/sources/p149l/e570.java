package p149l;

import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e570 extends py60 {
    public e570(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.py60
    /* JADX INFO: renamed from: E1 */
    public void mo114781E1() {
        ((f570) this.viewModel).mo119476L(false);
        super.mo114781E1();
    }

    @Override // p149l.py60
    /* JADX INFO: renamed from: L1 */
    public void mo114782L1(j760<Links, List<Moment>> j760Var) {
        ((f570) this.viewModel).m119481Q();
        super.mo114782L1(j760Var);
    }

    @Override // p149l.py60
    /* JADX INFO: renamed from: e1 */
    public void mo114783e1() {
        if ("original_moments".equals(this.f151805d)) {
            this.f151803b = new ym00((PhotoAlbumFeedBaseFrag) this.f151802a);
        }
        super.mo114783e1();
    }
}
