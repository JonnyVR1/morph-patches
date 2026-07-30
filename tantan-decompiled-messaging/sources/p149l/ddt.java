package p149l;

import com.immomo.momomediaext.utils.MMLiveRoomParams;

/* JADX INFO: loaded from: classes4.dex */
public class ddt extends d8s {

    /* JADX INFO: renamed from: a */
    public dul f85628a;

    public ddt(dul dulVar) {
        this.f85628a = dulVar;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: I0 */
    public void mo110344I0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110344I0(mMLivePushType);
        hfw.m130790a(u0t.f172943b, w8u.m202210m("onEnginePushStarting，rtcType:" + mMLivePushType));
        this.f85628a.mo113734l();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: K0 */
    public void mo110346K0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110346K0(mMLivePushType);
        hfw.m130790a(u0t.f172943b, w8u.m202210m("onEngineBufferStopped，rtcType:" + mMLivePushType));
        this.f85628a.mo113733V();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        if (i == -5801 && i2 == 2) {
            this.f85628a.mo113730J();
            return;
        }
        if (i == o2f.m162294b()) {
            this.f85628a.mo113731N0(i2);
        } else if (i == o2f.m162295c()) {
            this.f85628a.mo113736y(i2);
        } else if (i == o2f.m162293a()) {
            this.f85628a.mo113735s0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m111060S0(dul dulVar) {
        this.f85628a = dulVar;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: w0 */
    public void mo110364w0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110364w0(mMLivePushType);
        hfw.m130790a(u0t.f172943b, w8u.m202210m("onEngineBufferStart，rtcType:" + mMLivePushType));
        this.f85628a.mo113732O();
    }
}
