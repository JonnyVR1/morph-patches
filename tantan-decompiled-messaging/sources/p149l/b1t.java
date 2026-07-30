package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMagic;

/* JADX INFO: loaded from: classes4.dex */
public class b1t extends fgf0<BLiveMagic> {
    public b1t() {
        super("live_magic_gesture", new qiq(new qnd("live_magic_gesture", "_v3", null), -1, BLiveMagic.JSON_ADAPTER, new v9j() { // from class: l.w0t
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return b1t.m99869B();
            }
        }), new v9j() { // from class: l.x0t
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110247a(new v9j() { // from class: l.z0t
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(xh5.m208761i("/live_magic_gesture")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.a1t
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((BLiveEnvelope) obj).liveMagics;
                    }
                });
            }
        });
        e51.m114742G(new Runnable() { // from class: l.y0t
            @Override // java.lang.Runnable
            public final void run() {
                this.f195327a.m121236q();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ BLiveMagic m99869B() {
        return null;
    }
}
