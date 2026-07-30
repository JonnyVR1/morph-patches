package p002l;

import com.immomo.momomediaext.utils.MMLiveRoomParams;
import l.d8s;
import l.hfw;
import l.o2f;
import l.u0t;
import l.w8u;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ddt extends d8s {

    /* JADX INFO: renamed from: a */
    public dul f9180a;

    public ddt(dul dulVar) {
        this.f9180a = dulVar;
    }

    /* JADX INFO: renamed from: I0 */
    public void m11761I0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.I0(mMLivePushType);
        hfw.a(u0t.b, w8u.m("onEnginePushStarting，rtcType:" + mMLivePushType));
        this.f9180a.mo12056l();
    }

    /* JADX INFO: renamed from: K0 */
    public void m11762K0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.K0(mMLivePushType);
        hfw.a(u0t.b, w8u.m("onEngineBufferStopped，rtcType:" + mMLivePushType));
        this.f9180a.mo12055V();
    }

    /* JADX INFO: renamed from: S */
    public void m11763S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.S(mMLivePushType, i, i2);
        if (i == -5801 && i2 == 2) {
            this.f9180a.mo12052J();
            return;
        }
        if (i == o2f.b()) {
            this.f9180a.mo12053N0(i2);
        } else if (i == o2f.c()) {
            this.f9180a.mo12058y(i2);
        } else if (i == o2f.a()) {
            this.f9180a.mo12057s0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m11764S0(dul dulVar) {
        this.f9180a = dulVar;
    }

    /* JADX INFO: renamed from: w0 */
    public void m11765w0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.w0(mMLivePushType);
        hfw.a(u0t.b, w8u.m("onEngineBufferStart，rtcType:" + mMLivePushType));
        this.f9180a.mo12054O();
    }
}
