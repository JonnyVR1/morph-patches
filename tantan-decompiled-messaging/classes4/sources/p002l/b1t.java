package p002l;

import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveMagic;
import l.d7t;
import l.e51;
import l.fgf0;
import l.qib0;
import l.qiq;
import l.qnd;
import l.v9j;
import l.w9j;
import l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b1t extends fgf0<BLiveMagic> {
    public b1t() {
        super("live_magic_gesture", new qiq(new qnd("live_magic_gesture", "_v3", (String) null), -1, BLiveMagic.JSON_ADAPTER, new v9j() { // from class: l.w0t
            public final Object call() {
                return b1t.m10153B();
            }
        }), new v9j() { // from class: l.x0t
            public final Object call() {
                return d7t.a(new v9j() { // from class: l.z0t
                    public final Object call() {
                        return qib0.H.auth().q(xh5.i("/live_magic_gesture")).f().b();
                    }
                }).map(new w9j() { // from class: l.a1t
                    public final Object call(Object obj) {
                        return ((BLiveEnvelope) obj).liveMagics;
                    }
                });
            }
        });
        e51.G(new Runnable() { // from class: l.y0t
            @Override // java.lang.Runnable
            public final void run() {
                this.f22566a.z();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ BLiveMagic m10153B() {
        return null;
    }
}
