package p007l;

import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.List;
import l.j760;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e570 extends py60 {
    public e570(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p007l.py60
    /* JADX INFO: renamed from: E1 */
    public void mo9612E1() {
        ((f570) ((jq2) this).viewModel).mo10051L(false);
        super.mo9612E1();
    }

    @Override // p007l.py60
    /* JADX INFO: renamed from: L1 */
    public void mo9613L1(j760<Links, List<Moment>> j760Var) {
        ((f570) ((jq2) this).viewModel).m10056Q();
        super.mo9613L1(j760Var);
    }

    @Override // p007l.py60
    /* JADX INFO: renamed from: e1 */
    public void mo9614e1() {
        if ("original_moments".equals(this.f12013d)) {
            this.f12011b = new ym00((PhotoAlbumFeedBaseFrag) this.f12010a);
        }
        super.mo9614e1();
    }
}
