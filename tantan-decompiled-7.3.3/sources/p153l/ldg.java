package p153l;

import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;

/* JADX INFO: loaded from: classes4.dex */
public class ldg extends tk2<jdg> {

    /* JADX INFO: renamed from: j */
    public q6g f131631j;

    public ldg(dum<? extends oo2> dumVar, FansClubSweetCompanyView fansClubSweetCompanyView) {
        super(dumVar);
        mo52715C(new jdg(fansClubSweetCompanyView));
        this.f131631j = (q6g) m153103z2(new q6g(dumVar, fansClubSweetCompanyView.f49885g, fansClubSweetCompanyView.f49887i, fansClubSweetCompanyView.f49888j, fansClubSweetCompanyView.f49889k, false));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f131631j.mo96836O3();
        ((jdg) this.viewModel).m144424b();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        this.f131631j.mo96837P3();
        m214779N3(m191481Z3().m209625T()).subscribe(dhw.m115825d(new y20() { // from class: l.kdg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125242a.m153748j4((aeg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m153748j4(aeg aegVar) {
        ((jdg) this.viewModel).m144425c(aegVar);
        this.f131631j.mo175592g4(aegVar);
    }
}
