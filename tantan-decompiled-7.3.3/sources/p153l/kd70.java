package p153l;

import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class kd70 extends v670 {
    public kd70(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.v670
    /* JADX INFO: renamed from: E1 */
    public void mo149176E1() {
        ((ld70) this.viewModel).mo153728L(false);
        super.mo149176E1();
    }

    @Override // p153l.v670
    /* JADX INFO: renamed from: L1 */
    public void mo149177L1(pf60<Links, List<Moment>> pf60Var) {
        ((ld70) this.viewModel).m153733Q();
        super.mo149177L1(pf60Var);
    }

    @Override // p153l.v670
    /* JADX INFO: renamed from: e1 */
    public void mo149178e1() {
        if ("original_moments".equals(this.f182607d)) {
            this.f182605b = new hv00((PhotoAlbumFeedBaseFrag) this.f182604a);
        }
        super.mo149178e1();
    }
}
