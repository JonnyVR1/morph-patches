package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import l.bwr;
import l.e30;
import l.ffw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xbg extends lk2<vbg> {

    /* JADX INFO: renamed from: j */
    public c5g f22210j;

    public xbg(bsm<? extends ho2> bsmVar, FansClubSweetCompanyView fansClubSweetCompanyView) {
        super(bsmVar);
        C(new vbg(fansClubSweetCompanyView));
        this.f22210j = (c5g) z2(new c5g(bsmVar, fansClubSweetCompanyView.f5079g, fansClubSweetCompanyView.f5081i, fansClubSweetCompanyView.f5082j, fansClubSweetCompanyView.f5083k, false));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f22210j.mo9256O3();
        ((vbg) ((bwr) this).viewModel).m23814b();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        this.f22210j.mo10254P3();
        m25707N3(m17286Z3().m15711T()).subscribe(ffw.d(new e30() { // from class: l.wbg
            public final void call(Object obj) {
                this.f21605a.m25824j4((mcg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m25824j4(mcg mcgVar) {
        ((vbg) ((bwr) this).viewModel).m23815c(mcgVar);
        this.f22210j.mo10746g4(mcgVar);
    }
}
