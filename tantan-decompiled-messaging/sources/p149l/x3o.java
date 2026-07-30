package p149l;

import android.util.Pair;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFrameData;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveFramesCDN;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes13.dex */
public class x3o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveFrameData m206935a(BLiveFrameData bLiveFrameData) {
        afn.m96259a().f69198b = false;
        ((gl3) s9s.m182763m(gld0.f103315e)).f103287h.put(bLiveFrameData);
        return bLiveFrameData;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22306c m206936b(BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN) {
        gld0<gl3> gld0Var = gld0.f103315e;
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN2 = ((gl3) s9s.m182763m(gld0Var)).f103286g.get();
        if (bLiveIntlLiveFramesCDN2 == null || !bLiveIntlLiveFramesCDN2.version.equals(bLiveIntlLiveFramesCDN.version)) {
            return m206943i(bLiveIntlLiveFramesCDN);
        }
        BLiveFrameData bLiveFrameData = ((gl3) s9s.m182763m(gld0Var)).f103287h.get();
        return bLiveFrameData == null ? m206943i(bLiveIntlLiveFramesCDN) : C22306c.just(new Pair(bLiveFrameData, bLiveIntlLiveFramesCDN));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m206937c(Pair pair) {
        afn.m96259a().f69198b = false;
        m206942h(pair);
        h5j0.INSTANCE.m129402a("intl_frame_cdn", "intl_pull_cdn_frame_end");
    }

    /* JADX INFO: renamed from: h */
    public static void m206942h(Pair<BLiveFrameData, BLiveIntlLiveFramesCDN> pair) {
        afn.m96259a().m96262d(((BLiveFrameData) pair.first).intlLiveFrameData);
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<Pair<BLiveFrameData, BLiveIntlLiveFramesCDN>> m206943i(final BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN) {
        ((gl3) s9s.m182763m(gld0.f103315e)).f103286g.put(bLiveIntlLiveFramesCDN);
        h5j0.INSTANCE.m129405d("intl_frame_cdn");
        return ia20.m135119c(new v9j() { // from class: l.t3o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upv.f177677c.auth().m185898q(bLiveIntlLiveFramesCDN.url).m185887f().m185883b();
            }
        }, BLiveFrameData.JSON_ADAPTER).filter(new w9j() { // from class: l.u3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveFrameData) obj));
            }
        }).map(new w9j() { // from class: l.v3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x3o.m206935a((BLiveFrameData) obj);
            }
        }).flatMap(new w9j() { // from class: l.w3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(new Pair((BLiveFrameData) obj, bLiveIntlLiveFramesCDN));
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m206944j() {
        afn.m96259a().f69198b = true;
        upv.m194920h(cll.m107499l(ytr.m216073b("/intlLiveFramesMetadata")).m107524p().m107537d(), "intlLiveFramesMetadata").observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.o3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.intlLiveFramesMetadata;
            }
        }).filter(new w9j() { // from class: l.p3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveIntlLiveFramesCDN) obj));
            }
        }).flatMap(new w9j() { // from class: l.q3o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x3o.m206936b((BLiveIntlLiveFramesCDN) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.r3o
            @Override // p149l.e30
            public final void call(Object obj) {
                x3o.m206937c((Pair) obj);
            }
        }, new e30() { // from class: l.s3o
            @Override // p149l.e30
            public final void call(Object obj) {
                afn.m96259a().f69198b = false;
            }
        }));
    }
}
