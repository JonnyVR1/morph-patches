package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class vzi extends i6t<oo2, vzi> implements iam<vzi> {
    public vzi(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final pf60<Boolean, Boolean> m204100M3(String str) {
        pf60<Boolean, String> pf60VarM188649b = szi.m188648a().m188649b();
        int iM188650c = szi.m188648a().m188650c();
        if (pf60VarM188649b == null || !str.equals(pf60VarM188649b.f152157b) || iM188650c <= 0) {
            szi.m188648a().m188651d(null);
            Boolean bool = Boolean.FALSE;
            return jyb.m147494Y(bool, bool);
        }
        szi.m188648a().m188652e(iM188650c - 1);
        szi.m188648a().m188651d(null);
        return jyb.m147494Y(Boolean.TRUE, pf60VarM188649b.f152156a);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ pf60 m204101N3(nwi nwiVar) {
        return m204100M3(nwiVar.m164990e());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(nwi.class, new qcj() { // from class: l.tzi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176763a.m204101N3((nwi) obj);
            }
        });
        duringCreated(m213811F2().AvatarEvent.onScrollNext().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.uzi
            @Override // p153l.y20
            public final void call(Object obj) {
                szi.m188648a().m188651d((pf60) obj);
            }
        }));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: L3, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vzi vziVar) {
    }
}
