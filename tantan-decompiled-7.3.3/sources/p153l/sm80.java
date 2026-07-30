package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes4.dex */
public class sm80 extends i6t<oo2, sm80> implements iam, c6m {

    /* JADX INFO: renamed from: i */
    public final kcg0 f169528i;

    /* JADX INFO: renamed from: j */
    public String f169529j;

    /* JADX INFO: renamed from: k */
    public Boolean f169530k;

    public sm80(dum dumVar) {
        super(dumVar);
        this.f169528i = pcg0.m171650c(m213811F2().PreLoadEvent.cleanPreLoad().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.qm80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158306a.m186778M3((vxj0) obj);
            }
        })), m213811F2().PreLoadEvent.preLoad().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.rm80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163833a.m186779N3((om80) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: L3 */
    public void m186777L3() {
        this.f169529j = null;
        this.f169530k = null;
        m213811F2().PlayerEvent.restorePlayerView().m199277p();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m186778M3(vxj0 vxj0Var) {
        m186777L3();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m186779N3(om80 om80Var) {
        m186780O3(om80Var.f147905a, om80Var.f147906b);
    }

    /* JADX INFO: renamed from: O3 */
    public void m186780O3(boolean z, BLiveAbsData bLiveAbsData) {
        if (TextUtils.equals(this.f169529j, bLiveAbsData.f45171id) && this.f169530k.booleanValue() == z) {
            return;
        }
        m213811F2().PlayerEvent.restorePlayerView().m199277p();
        this.f169529j = bLiveAbsData.f45171id;
        this.f169530k = Boolean.valueOf(z);
        m213811F2().PlayerEvent.prePlay().mo199273j(bLiveAbsData);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
        psd0.m173633z(this.f169528i);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m186777L3();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(k3m k3mVar) {
    }
}
