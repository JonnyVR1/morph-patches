package p002l;

import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;
import l.e30;
import l.ffw;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bhg<T extends ho2> extends zfg<T> {
    public bhg(bsm<T> bsmVar, FansView fansView) {
        super(bsmVar, fansView);
    }

    @Override // p002l.zfg
    /* JADX INFO: renamed from: a4 */
    public void mo10340a4(RecyclerView recyclerView) {
        if (m25547E2() instanceof o91) {
            ((o91) m25547E2()).mo9890b().m9781b(RecyclerViewPoolType.FANS, recyclerView, new e30() { // from class: l.ahg
                public final void call(Object obj) {
                    ((RecyclerView.u) obj).m(1, 1);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m10341g4(iqv iqvVar) {
        reset();
        m25547E2().m14514M1(m25547E2().m17235k(), m25547E2().m17239o());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m10342h4(Throwable th) {
        reset();
        m25547E2().m14514M1(m25547E2().m17235k(), m25547E2().m17239o());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p002l.zfg
    public void init() {
        super.init();
        duringCreated(m25547E2().m17244u()).subscribe(ffw.e(new e30() { // from class: l.ygg
            public final void call(Object obj) {
                this.f22877a.m10341g4((iqv) obj);
            }
        }, new e30() { // from class: l.zgg
            public final void call(Object obj) {
                this.f23401a.m10342h4((Throwable) obj);
            }
        }));
    }
}
