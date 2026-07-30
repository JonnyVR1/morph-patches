package p002l;

import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.tantan.live.eventbus.LiveEventBus;
import l.k4t;
import l.mcr;
import l.s7m;
import l.xuy;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wxs<T extends ho2, V extends s7m> extends k4t<V> {

    /* JADX INFO: renamed from: e */
    public bsm<? extends T> f22036e;

    /* JADX INFO: renamed from: f */
    public final Act f22037f;

    public wxs(bsm<? extends T> bsmVar) {
        this(bsmVar.f8332a, bsmVar.f8338g);
        m25555P2(bsmVar);
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m25546D2() {
        return act() == null || act().isDestroyed() || act().isFinishing();
    }

    /* JADX INFO: renamed from: E2 */
    public T m25547E2() {
        return (T) this.f22036e.f8339h;
    }

    /* JADX INFO: renamed from: F2 */
    public LiveEventBus m25548F2() {
        return this.f22036e.f8343l;
    }

    /* JADX INFO: renamed from: H2 */
    public Frag m25549H2() {
        return this.f22036e.f8337f;
    }

    /* JADX INFO: renamed from: I2 */
    public iqv m25550I2() {
        return this.f22036e.f8339h.m17237m();
    }

    /* JADX INFO: renamed from: K2 */
    public s6s m25551K2() {
        return this.f22036e.f8342k;
    }

    /* JADX INFO: renamed from: L2 */
    public boolean m25552L2() {
        return this.f22036e.f8335d;
    }

    /* JADX INFO: renamed from: M2 */
    public xuy m25553M2() {
        return this.f22036e.f8340i;
    }

    /* JADX INFO: renamed from: N2 */
    public MotionType m25554N2() {
        return this.f22036e.f8341j.m24320M3();
    }

    /* JADX INFO: renamed from: P2 */
    public void m25555P2(bsm<? extends T> bsmVar) {
        this.f22036e = bsmVar;
    }

    /* JADX INFO: renamed from: Q2 */
    public ViewGroup m25556Q2() {
        return this.f22036e.f8334c;
    }

    /* JADX INFO: renamed from: R2 */
    public String mo21430R2() {
        return this.f22036e.f8336e;
    }

    public Act act() {
        return this.f22037f;
    }

    public wxs(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f22037f = act;
    }
}
