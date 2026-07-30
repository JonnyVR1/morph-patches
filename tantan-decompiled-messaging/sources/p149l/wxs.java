package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.tantan.live.eventbus.LiveEventBus;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public class wxs<T extends ho2, V extends s7m> extends k4t<V> {

    /* JADX INFO: renamed from: e */
    public bsm<? extends T> f188512e;

    /* JADX INFO: renamed from: f */
    public final Act f188513f;

    public wxs(bsm<? extends T> bsmVar) {
        this(bsmVar.f77095a, bsmVar.f77101g);
        m206035P2(bsmVar);
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m206026D2() {
        return act() == null || act().isDestroyed() || act().isFinishing();
    }

    /* JADX INFO: renamed from: E2 */
    public T m206027E2() {
        return (T) this.f188512e.f77102h;
    }

    /* JADX INFO: renamed from: F2 */
    public LiveEventBus m206028F2() {
        return this.f188512e.f77106l;
    }

    /* JADX INFO: renamed from: H2 */
    public Frag m206029H2() {
        return this.f188512e.f77100f;
    }

    /* JADX INFO: renamed from: I2 */
    public iqv m206030I2() {
        return this.f188512e.f77102h.m149816m();
    }

    /* JADX INFO: renamed from: K2 */
    public s6s m206031K2() {
        return this.f188512e.f77105k;
    }

    /* JADX INFO: renamed from: L2 */
    public boolean m206032L2() {
        return this.f188512e.f77098d;
    }

    /* JADX INFO: renamed from: M2 */
    public xuy m206033M2() {
        return this.f188512e.f77103i;
    }

    /* JADX INFO: renamed from: N2 */
    public MotionType m206034N2() {
        return this.f188512e.f77104j.m201578M3();
    }

    /* JADX INFO: renamed from: P2 */
    public void m206035P2(bsm<? extends T> bsmVar) {
        this.f188512e = bsmVar;
    }

    /* JADX INFO: renamed from: Q2 */
    public ViewGroup m206036Q2() {
        return this.f188512e.f77097c;
    }

    /* JADX INFO: renamed from: R2 */
    public String mo77274R2() {
        return this.f188512e.f77099e;
    }

    public Act act() {
        return this.f188513f;
    }

    public wxs(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f188513f = act;
    }
}
