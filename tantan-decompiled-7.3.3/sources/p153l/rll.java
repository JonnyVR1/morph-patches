package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class rll<D extends oo2> extends qhl<D, wkl> {
    public rll(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new wkl(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ int m182005W3(tll tllVar, tll tllVar2) {
        return tllVar.m191642a() - tllVar2.m191642a();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m182006X3(int i, uwl uwlVar) {
        if (uwlVar instanceof qhl) {
            qhl qhlVar = (qhl) uwlVar;
            if (qhlVar.mo113681T3() == i) {
                qhlVar.mo113682V3();
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m182007Y3(List list, uwl uwlVar) {
        if (uwlVar instanceof qhl) {
            list.add(((qhl) uwlVar).mo113680S3());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m182010c4(Boolean bool) {
        if (bool.booleanValue()) {
            ((wkl) this.viewModel).m206842M();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private void m182011e4(final int i) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.qll
            @Override // p153l.y20
            public final void call(Object obj) {
                rll.m182006X3(i, (uwl) obj);
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        m153103z2(new ell(this.f196918e));
        m153103z2(new d2c(this.f196918e));
        m153103z2(new mwp0(this.f196918e));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().HourLeaderBoardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.pll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153039a.m182010c4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<tll> m182012b4() {
        final ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f130285b)) {
            jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.mll
                @Override // p153l.y20
                public final void call(Object obj) {
                    rll.m182007Y3(arrayList, (uwl) obj);
                }
            });
            Collections.sort(arrayList, new Comparator() { // from class: l.nll
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return rll.m182005W3((tll) obj, (tll) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m182013d4(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((wkl) this.viewModel).m206840K(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: f4 */
    public void m182014f4(int i) {
        m182011e4(i);
        i4g0.m138526x(qhl.m176594U3(i), mo78457R2());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m213810E2().m168559y1(m213810E2().m168532l0().f56859id);
        duringCreated(m213810E2().m168516g0()).subscribe(dhw.m115829h(new y20() { // from class: l.oll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147846a.m182013d4((BLiveHourLeaderBoard) obj);
            }
        }));
    }
}
