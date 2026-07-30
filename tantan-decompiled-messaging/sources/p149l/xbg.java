package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;

/* JADX INFO: loaded from: classes4.dex */
public class xbg extends lk2<vbg> {

    /* JADX INFO: renamed from: j */
    public c5g f191948j;

    public xbg(bsm<? extends ho2> bsmVar, FansClubSweetCompanyView fansClubSweetCompanyView) {
        super(bsmVar);
        mo51532C(new vbg(fansClubSweetCompanyView));
        this.f191948j = (c5g) m144512z2(new c5g(bsmVar, fansClubSweetCompanyView.f49037g, fansClubSweetCompanyView.f49039i, fansClubSweetCompanyView.f49040j, fansClubSweetCompanyView.f49041k, false));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f191948j.mo94471O3();
        ((vbg) this.viewModel).m197709b();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        this.f191948j.mo99576P3();
        m207199N3(m150132Z3().m140020T()).subscribe(ffw.m121193d(new e30() { // from class: l.wbg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185574a.m207728j4((mcg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m207728j4(mcg mcgVar) {
        ((vbg) this.viewModel).m197710c(mcgVar);
        this.f191948j.mo105325g4(mcgVar);
    }
}
