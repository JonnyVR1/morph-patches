package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMagic;

/* JADX INFO: loaded from: classes4.dex */
public class c3t extends mof0<BLiveMagic> {
    public c3t() {
        super("live_magic_gesture", new pkq(new vod("live_magic_gesture", "_v3", null), -1, BLiveMagic.JSON_ADAPTER, new pcj() { // from class: l.x2t
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return c3t.m107807B();
            }
        }), new pcj() { // from class: l.y2t
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119951a(new pcj() { // from class: l.a3t
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(xi5.m211107i("/live_magic_gesture")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.b3t
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((BLiveEnvelope) obj).liveMagics;
                    }
                });
            }
        });
        l51.m152887G(new Runnable() { // from class: l.z2t
            @Override // java.lang.Runnable
            public final void run() {
                this.f202736a.m159280q();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ BLiveMagic m107807B() {
        return null;
    }
}
