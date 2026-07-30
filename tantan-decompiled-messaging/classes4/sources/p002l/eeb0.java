package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.fd50;
import l.gkh0;
import l.k480;
import l.u0t;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eeb0 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final h1m f9723i;

    /* JADX INFO: renamed from: j */
    public final k1m f9724j;

    public eeb0(bsm bsmVar, h1m h1mVar, k1m k1mVar) {
        super(bsmVar);
        this.f9723i = h1mVar;
        this.f9724j = k1mVar;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m12428J3(int i) {
        int i2 = !ConnectivityReceiver.g() ? R$string.f2718F9 : 0;
        if (ConnectivityReceiver.k()) {
            i2 = R$string.f2674D9;
        }
        if (i2 == 0) {
            return false;
        }
        m12432r0("retry no connection", i2, i);
        return true;
    }

    /* JADX INFO: renamed from: K3 */
    public void m12429K3() {
        this.f9724j.mo5362b();
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m12430L3() {
        return this.f9724j.getErrorCode() != 0;
    }

    /* JADX INFO: renamed from: M3 */
    public void m12431M3(String str, int i) {
        this.f9723i.mo10196d(false);
        if (((Boolean) m14184F3(new k480(2600))).booleanValue() || ((Boolean) m14184F3(new fd50(2600))).booleanValue() || this.f22036e.f8341j.m24319L3(MotionType.multi_call)) {
            return;
        }
        this.f9724j.mo5361a(str, i);
    }

    /* JADX INFO: renamed from: r0 */
    public void m12432r0(String str, int i, int i2) {
        String string = ypv.e.getString(i);
        m12431M3(string, i2);
        gkh0.j(u0t.b, "error reason: " + str + " code: " + i2 + " str: " + string);
    }
}
