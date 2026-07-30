package p153l;

import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class imb0 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public final a4m f115751i;

    /* JADX INFO: renamed from: j */
    public final d4m f115752j;

    public imb0(dum dumVar, a4m a4mVar, d4m d4mVar) {
        super(dumVar);
        this.f115751i = a4mVar;
        this.f115752j = d4mVar;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m140898J3(int i) {
        int i2 = !ConnectivityReceiver.m82467g() ? R$string.f47524F9 : 0;
        if (ConnectivityReceiver.m82471k()) {
            i2 = R$string.f47480D9;
        }
        if (i2 == 0) {
            return false;
        }
        m140902r0("retry no connection", i2, i);
        return true;
    }

    /* JADX INFO: renamed from: K3 */
    public void m140899K3() {
        this.f115752j.mo73157b();
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m140900L3() {
        return this.f115752j.getErrorCode() != 0;
    }

    /* JADX INFO: renamed from: M3 */
    public void m140901M3(String str, int i) {
        this.f115751i.mo95983d(false);
        if (((Boolean) m138856F3(new qc80(2600))).booleanValue() || ((Boolean) m138856F3(new ml50(2600))).booleanValue() || this.f196918e.f90824j.m209548L3(MotionType.multi_call)) {
            return;
        }
        this.f115752j.mo73156a(str, i);
    }

    /* JADX INFO: renamed from: r0 */
    public void m140902r0(String str, int i, int i2) {
        String string = zrv.f205803e.getString(i);
        m140901M3(string, i2);
        nsh0.m164608j(v2t.f182112b, "error reason: " + str + " code: " + i2 + " str: " + string);
    }
}
