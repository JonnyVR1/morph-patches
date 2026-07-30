package p153l;

import android.util.Pair;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFrameData;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveFramesCDN;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class x5o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveFrameData m209405a(BLiveFrameData bLiveFrameData) {
        ahn.m97854a().f71382b = false;
        ((fm3) tbs.m190077m(itd0.f116823e)).f99718h.put(bLiveFrameData);
        return bLiveFrameData;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22421c m209406b(BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN) {
        itd0<fm3> itd0Var = itd0.f116823e;
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN2 = ((fm3) tbs.m190077m(itd0Var)).f99717g.get();
        if (bLiveIntlLiveFramesCDN2 == null || !bLiveIntlLiveFramesCDN2.version.equals(bLiveIntlLiveFramesCDN.version)) {
            return m209413i(bLiveIntlLiveFramesCDN);
        }
        BLiveFrameData bLiveFrameData = ((fm3) tbs.m190077m(itd0Var)).f99718h.get();
        return bLiveFrameData == null ? m209413i(bLiveIntlLiveFramesCDN) : C22421c.just(new Pair(bLiveFrameData, bLiveIntlLiveFramesCDN));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m209407c(Pair pair) {
        ahn.m97854a().f71382b = false;
        m209412h(pair);
        lej0.INSTANCE.m153907a("intl_frame_cdn", "intl_pull_cdn_frame_end");
    }

    /* JADX INFO: renamed from: h */
    public static void m209412h(Pair<BLiveFrameData, BLiveIntlLiveFramesCDN> pair) {
        ahn.m97854a().m97857d(((BLiveFrameData) pair.first).intlLiveFrameData);
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<Pair<BLiveFrameData, BLiveIntlLiveFramesCDN>> m209413i(final BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN) {
        ((fm3) tbs.m190077m(itd0.f116823e)).f99717g.put(bLiveIntlLiveFramesCDN);
        lej0.INSTANCE.m153910d("intl_frame_cdn");
        return qi20.m176656c(new pcj() { // from class: l.t5o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vrv.f185526c.auth().m209043q(bLiveIntlLiveFramesCDN.url).m209032f().m209028b();
            }
        }, BLiveFrameData.JSON_ADAPTER).filter(new qcj() { // from class: l.u5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveFrameData) obj));
            }
        }).map(new qcj() { // from class: l.v5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x5o.m209405a((BLiveFrameData) obj);
            }
        }).flatMap(new qcj() { // from class: l.w5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(new Pair((BLiveFrameData) obj, bLiveIntlLiveFramesCDN));
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m209414j() {
        ahn.m97854a().f71382b = true;
        vrv.m202547h(rnl.m182263l(zvr.m221802b("/intlLiveFramesMetadata")).m182288p().m182301d(), "intlLiveFramesMetadata").observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.o5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.intlLiveFramesMetadata;
            }
        }).filter(new qcj() { // from class: l.p5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveIntlLiveFramesCDN) obj));
            }
        }).flatMap(new qcj() { // from class: l.q5o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x5o.m209406b((BLiveIntlLiveFramesCDN) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.r5o
            @Override // p153l.y20
            public final void call(Object obj) {
                x5o.m209407c((Pair) obj);
            }
        }, new y20() { // from class: l.s5o
            @Override // p153l.y20
            public final void call(Object obj) {
                ahn.m97854a().f71382b = false;
            }
        }));
    }
}
