package p153l;

import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RecyclerViewPoolType;
import com.p051p1.mobile.putong.live.livingroom.common.fans.FansView;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class pig<T extends oo2> extends nhg<T> {
    public pig(dum<T> dumVar, FansView fansView) {
        super(dumVar, fansView);
    }

    @Override // p153l.nhg
    /* JADX INFO: renamed from: a4 */
    public void mo163089a4(RecyclerView recyclerView) {
        if (m213810E2() instanceof v91) {
            ((v91) m213810E2()).mo146608b().m104770b(RecyclerViewPoolType.FANS, recyclerView, new y20() { // from class: l.oig
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((RecyclerView.C0585u) obj).m3440m(1, 1);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m172361g4(jsv jsvVar) {
        reset();
        m213810E2().m168466M1(m213810E2().m202191k(), m213810E2().m202194o());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m172362h4(Throwable th) {
        reset();
        m213810E2().m168466M1(m213810E2().m202191k(), m213810E2().m202194o());
    }

    @Override // p153l.nhg
    public void init() {
        super.init();
        duringCreated((C22421c<T>) m213810E2().mo183449u()).subscribe(dhw.m115826e(new y20() { // from class: l.mig
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136967a.m172361g4((jsv) obj);
            }
        }, new y20() { // from class: l.nig
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142120a.m172362h4((Throwable) obj);
            }
        }));
    }
}
