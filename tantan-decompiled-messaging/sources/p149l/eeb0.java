package p149l;

import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class eeb0 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final h1m f90730i;

    /* JADX INFO: renamed from: j */
    public final k1m f90731j;

    public eeb0(bsm bsmVar, h1m h1mVar, k1m k1mVar) {
        super(bsmVar);
        this.f90730i = h1mVar;
        this.f90731j = k1mVar;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m115959J3(int i) {
        int i2 = !ConnectivityReceiver.m81284g() ? R$string.f46676F9 : 0;
        if (ConnectivityReceiver.m81288k()) {
            i2 = R$string.f46632D9;
        }
        if (i2 == 0) {
            return false;
        }
        m115963r0("retry no connection", i2, i);
        return true;
    }

    /* JADX INFO: renamed from: K3 */
    public void m115960K3() {
        this.f90731j.mo71974b();
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m115961L3() {
        return this.f90731j.getErrorCode() != 0;
    }

    /* JADX INFO: renamed from: M3 */
    public void m115962M3(String str, int i) {
        this.f90730i.mo100519d(false);
        if (((Boolean) m129297F3(new k480(2600))).booleanValue() || ((Boolean) m129297F3(new fd50(2600))).booleanValue() || this.f188512e.f77104j.m201577L3(MotionType.multi_call)) {
            return;
        }
        this.f90731j.mo71973a(str, i);
    }

    /* JADX INFO: renamed from: r0 */
    public void m115963r0(String str, int i, int i2) {
        String string = ypv.f199497e.getString(i);
        m115962M3(string, i2);
        gkh0.m126627j(u0t.f172943b, "error reason: " + str + " code: " + i2 + " str: " + string);
    }
}
