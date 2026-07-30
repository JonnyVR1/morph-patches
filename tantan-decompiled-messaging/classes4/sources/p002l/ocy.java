package p002l;

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
import l.soj0;
import l.vwb;
import l.zvf0;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ocy<D extends ho2> extends e8y<D, p8y> {

    /* JADX INFO: renamed from: j */
    public int f16532j;

    public ocy(bsm<D> bsmVar) {
        super(bsmVar);
        C(new p8y(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m19398W3(int i, gul gulVar) {
        if (gulVar instanceof e8y) {
            e8y e8yVar = (e8y) gulVar;
            if (e8yVar.mo12295T3() == i) {
                e8yVar.mo12296V3();
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m19401Z3(List list, gul gulVar) {
        if (gulVar instanceof e8y) {
            list.add(((e8y) gulVar).mo12294S3());
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ int m19402a4(hcy hcyVar, hcy hcyVar2) {
        return hcyVar.m14335a() - hcyVar2.m14335a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m19403c4(soj0 soj0Var) {
        ((p8y) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m19404d4(soj0 soj0Var) {
        m19407e4(this.f16532j);
    }

    /* JADX INFO: renamed from: T */
    public void m19405T() {
        super.T();
        duringCreated((c) m25548F2().MemberEvent.dismiss().g()).subscribe(ffw.d(new e30() { // from class: l.kcy
            public final void call(Object obj) {
                this.f14283a.m19403c4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().MemberEvent.refresh().g()).subscribe(ffw.d(new e30() { // from class: l.lcy
            public final void call(Object obj) {
                this.f14771a.m19404d4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().MemberEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.mcy
            public final void call(Object obj) {
                this.f15343a.m19408f4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<hcy> m19406b4() {
        final ArrayList arrayList = new ArrayList();
        vwb.z(((k4t) this).b.values(), new e30() { // from class: l.icy
            public final void call(Object obj) {
                ocy.m19401Z3(arrayList, (gul) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.jcy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ocy.m19402a4((hcy) obj, (hcy) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m19407e4(final int i) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.ncy
            public final void call(Object obj) {
                ocy.m19398W3(i, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m19408f4(int i) {
        ((p8y) ((bwr) this).viewModel).m20141N(i);
        m19409g4(i);
    }

    /* JADX INFO: renamed from: g4 */
    public void m19409g4(int i) {
        this.f16532j = i;
        m19407e4(i);
        zvf0.x(e8y.m12293U3(i), mo21430R2());
    }
}
