package p002l;

import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.gul;
import l.k4t;
import l.vwb;
import l.zvf0;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ajl<D extends ho2> extends zel<D, fil> {
    public ajl(bsm<D> bsmVar) {
        super(bsmVar);
        C(new fil(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ int m9816W3(cjl cjlVar, cjl cjlVar2) {
        return cjlVar.m11060a() - cjlVar2.m11060a();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m9817X3(int i, gul gulVar) {
        if (gulVar instanceof zel) {
            zel zelVar = (zel) gulVar;
            if (zelVar.mo15252T3() == i) {
                zelVar.mo15253V3();
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m9818Y3(List list, gul gulVar) {
        if (gulVar instanceof zel) {
            list.add(((zel) gulVar).mo15251S3());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m9821c4(Boolean bool) {
        if (bool.booleanValue()) {
            ((fil) ((bwr) this).viewModel).m13259M();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private void m9822e4(final int i) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.zil
            public final void call(Object obj) {
                ajl.m9817X3(i, (gul) obj);
            }
        });
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        super.mo9823R3();
        z2(new nil(this.f22036e));
        z2(new q0c(this.f22036e));
        z2(new inp0(this.f22036e));
    }

    /* JADX INFO: renamed from: T */
    public void m9824T() {
        super.T();
        duringCreated((c) m25548F2().HourLeaderBoardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.yil
            public final void call(Object obj) {
                this.f22908a.m9821c4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<cjl> m9825b4() {
        final ArrayList arrayList = new ArrayList();
        if (NullChecker.a(((k4t) this).b)) {
            vwb.z(((k4t) this).b.values(), new e30() { // from class: l.vil
                public final void call(Object obj) {
                    ajl.m9818Y3(arrayList, (gul) obj);
                }
            });
            Collections.sort(arrayList, new Comparator() { // from class: l.wil
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ajl.m9816W3((cjl) obj, (cjl) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m9826d4(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((fil) ((bwr) this).viewModel).m13257K(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: f4 */
    public void m9827f4(int i) {
        m9822e4(i);
        zvf0.x(zel.m27175U3(i), mo21430R2());
    }

    /* JADX INFO: renamed from: t */
    public void m9828t() {
        super.t();
        m25547E2().m14611y1(((DbObject) m25547E2().m14582l0()).id);
        duringCreated(m25547E2().m14566g0()).subscribe(ffw.h(new e30() { // from class: l.xil
            public final void call(Object obj) {
                this.f22308a.m9826d4((BLiveHourLeaderBoard) obj);
            }
        }));
    }
}
