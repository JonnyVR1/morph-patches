package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.c4g0;
import l.e30;
import l.ffw;
import l.h4g0;
import l.l3m;
import l.mkd0;
import l.q0m;
import l.s7m;
import l.soj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class me80 extends h4t<ho2, me80> implements s7m, l3m {

    /* JADX INFO: renamed from: i */
    public final c4g0 f15354i;

    /* JADX INFO: renamed from: j */
    public String f15355j;

    /* JADX INFO: renamed from: k */
    public Boolean f15356k;

    public me80(bsm bsmVar) {
        super(bsmVar);
        this.f15354i = h4g0.c(new c4g0[]{((c) m25548F2().PreLoadEvent.cleanPreLoad().g()).subscribe(ffw.d(new e30() { // from class: l.ke80
            public final void call(Object obj) {
                this.f14292a.m17836M3((soj0) obj);
            }
        })), ((c) m25548F2().PreLoadEvent.preLoad().g()).subscribe(ffw.d(new e30() { // from class: l.le80
            public final void call(Object obj) {
                this.f14790a.m17837N3((ie80) obj);
            }
        }))});
    }

    /* JADX INFO: renamed from: L3 */
    public void m17835L3() {
        this.f15355j = null;
        this.f15356k = null;
        m25548F2().PlayerEvent.restorePlayerView().p();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m17836M3(soj0 soj0Var) {
        m17835L3();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m17837N3(ie80 ie80Var) {
        m17838O3(ie80Var.f13160a, ie80Var.f13161b);
    }

    /* JADX INFO: renamed from: O3 */
    public void m17838O3(boolean z, BLiveAbsData bLiveAbsData) {
        if (TextUtils.equals(this.f15355j, bLiveAbsData.id) && this.f15356k.booleanValue() == z) {
            return;
        }
        m25548F2().PlayerEvent.restorePlayerView().p();
        this.f15355j = bLiveAbsData.id;
        this.f15356k = Boolean.valueOf(z);
        m25548F2().PlayerEvent.prePlay().j(bLiveAbsData);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public void m17840m1() {
        mkd0.z(this.f15354i);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m17835L3();
    }

    /* JADX INFO: renamed from: i1 */
    public void m17839i1(q0m q0mVar) {
    }
}
