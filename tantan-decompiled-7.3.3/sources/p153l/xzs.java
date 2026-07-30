package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.tantan.live.eventbus.LiveEventBus;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class xzs<T extends oo2, V extends iam> extends l6t<V> {

    /* JADX INFO: renamed from: e */
    public dum<? extends T> f196918e;

    /* JADX INFO: renamed from: f */
    public final Act f196919f;

    public xzs(dum<? extends T> dumVar) {
        this(dumVar.f90815a, dumVar.f90821g);
        m213818P2(dumVar);
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m213809D2() {
        return act() == null || act().isDestroyed() || act().isFinishing();
    }

    /* JADX INFO: renamed from: E2 */
    public T m213810E2() {
        return (T) this.f196918e.f90822h;
    }

    /* JADX INFO: renamed from: F2 */
    public LiveEventBus m213811F2() {
        return this.f196918e.f90826l;
    }

    /* JADX INFO: renamed from: H2 */
    public Frag m213812H2() {
        return this.f196918e.f90820f;
    }

    /* JADX INFO: renamed from: I2 */
    public jsv m213813I2() {
        return this.f196918e.f90822h.m202193m();
    }

    /* JADX INFO: renamed from: K2 */
    public t8s m213814K2() {
        return this.f196918e.f90825k;
    }

    /* JADX INFO: renamed from: L2 */
    public boolean m213815L2() {
        return this.f196918e.f90818d;
    }

    /* JADX INFO: renamed from: M2 */
    public u3z m213816M2() {
        return this.f196918e.f90823i;
    }

    /* JADX INFO: renamed from: N2 */
    public MotionType m213817N2() {
        return this.f196918e.f90824j.m209549M3();
    }

    /* JADX INFO: renamed from: P2 */
    public void m213818P2(dum<? extends T> dumVar) {
        this.f196918e = dumVar;
    }

    /* JADX INFO: renamed from: Q2 */
    public ViewGroup m213819Q2() {
        return this.f196918e.f90817c;
    }

    /* JADX INFO: renamed from: R2 */
    public String mo78457R2() {
        return this.f196918e.f90819e;
    }

    public Act act() {
        return this.f196919f;
    }

    public xzs(Act act, ner nerVar) {
        super(nerVar);
        this.f196919f = act;
    }
}
