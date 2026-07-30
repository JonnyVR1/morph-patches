package p149l;

import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import com.p046p1.mobile.putong.live.livingroom.common.fans.FansView;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class bhg<T extends ho2> extends zfg<T> {
    public bhg(bsm<T> bsmVar, FansView fansView) {
        super(bsmVar, fansView);
    }

    @Override // p149l.zfg
    /* JADX INFO: renamed from: a4 */
    public void mo101831a4(RecyclerView recyclerView) {
        if (m206027E2() instanceof o91) {
            ((o91) m206027E2()).mo97487b().m96683b(RecyclerViewPoolType.FANS, recyclerView, new e30() { // from class: l.ahg
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((RecyclerView.C0583u) obj).m3431m(1, 1);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m101832g4(iqv iqvVar) {
        reset();
        m206027E2().m132078M1(m206027E2().m149814k(), m206027E2().m149818o());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m101833h4(Throwable th) {
        reset();
        m206027E2().m132078M1(m206027E2().m149814k(), m206027E2().m149818o());
    }

    @Override // p149l.zfg
    public void init() {
        super.init();
        duringCreated((C22306c<T>) m206027E2().mo149823u()).subscribe(ffw.m121194e(new e30() { // from class: l.ygg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198163a.m101832g4((iqv) obj);
            }
        }, new e30() { // from class: l.zgg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203042a.m101833h4((Throwable) obj);
            }
        }));
    }
}
