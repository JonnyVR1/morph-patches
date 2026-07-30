package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class ajl<D extends ho2> extends zel<D, fil> {
    public ajl(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new fil(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ int m96978W3(cjl cjlVar, cjl cjlVar2) {
        return cjlVar.m107175a() - cjlVar2.m107175a();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m96979X3(int i, gul gulVar) {
        if (gulVar instanceof zel) {
            zel zelVar = (zel) gulVar;
            if (zelVar.mo137154T3() == i) {
                zelVar.mo137155V3();
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m96980Y3(List list, gul gulVar) {
        if (gulVar instanceof zel) {
            list.add(((zel) gulVar).mo137153S3());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m96983c4(Boolean bool) {
        if (bool.booleanValue()) {
            ((fil) this.viewModel).m121527M();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private void m96984e4(final int i) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.zil
            @Override // p149l.e30
            public final void call(Object obj) {
                ajl.m96979X3(i, (gul) obj);
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        m144512z2(new nil(this.f188512e));
        m144512z2(new q0c(this.f188512e));
        m144512z2(new inp0(this.f188512e));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().HourLeaderBoardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198517a.m96983c4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<cjl> m96986b4() {
        final ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f121122b)) {
            vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.vil
                @Override // p149l.e30
                public final void call(Object obj) {
                    ajl.m96980Y3(arrayList, (gul) obj);
                }
            });
            Collections.sort(arrayList, new Comparator() { // from class: l.wil
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ajl.m96978W3((cjl) obj, (cjl) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m96987d4(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((fil) this.viewModel).m121525K(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: f4 */
    public void m96988f4(int i) {
        m96984e4(i);
        zvf0.m220402x(zel.m218354U3(i), mo77274R2());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m206027E2().m132175y1(m206027E2().m132146l0().f56011id);
        duringCreated(m206027E2().m132130g0()).subscribe(ffw.m121197h(new e30() { // from class: l.xil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193136a.m96987d4((BLiveHourLeaderBoard) obj);
            }
        }));
    }
}
