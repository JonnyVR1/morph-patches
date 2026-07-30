package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class ocy<D extends ho2> extends e8y<D, p8y> {

    /* JADX INFO: renamed from: j */
    public int f143132j;

    public ocy(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new p8y(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m163631W3(int i, gul gulVar) {
        if (gulVar instanceof e8y) {
            e8y e8yVar = (e8y) gulVar;
            if (e8yVar.mo115317T3() == i) {
                e8yVar.mo115318V3();
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m163634Z3(List list, gul gulVar) {
        if (gulVar instanceof e8y) {
            list.add(((e8y) gulVar).mo115316S3());
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ int m163635a4(hcy hcyVar, hcy hcyVar2) {
        return hcyVar.m130524a() - hcyVar2.m130524a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m163636c4(soj0 soj0Var) {
        ((p8y) this.viewModel).mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m163637d4(soj0 soj0Var) {
        m163639e4(this.f143132j);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().MemberEvent.dismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.kcy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122520a.m163636c4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MemberEvent.refresh().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lcy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127481a.m163637d4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MemberEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mcy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133193a.m163640f4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<hcy> m163638b4() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.icy
            @Override // p149l.e30
            public final void call(Object obj) {
                ocy.m163634Z3(arrayList, (gul) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.jcy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ocy.m163635a4((hcy) obj, (hcy) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m163639e4(final int i) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.ncy
            @Override // p149l.e30
            public final void call(Object obj) {
                ocy.m163631W3(i, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m163640f4(int i) {
        ((p8y) this.viewModel).m167841N(i);
        m163641g4(i);
    }

    /* JADX INFO: renamed from: g4 */
    public void m163641g4(int i) {
        this.f143132j = i;
        m163639e4(i);
        zvf0.m220402x(e8y.m115315U3(i), mo77274R2());
    }
}
