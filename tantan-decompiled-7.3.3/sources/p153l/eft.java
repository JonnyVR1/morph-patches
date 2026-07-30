package p153l;

import com.immomo.momomediaext.utils.MMLiveRoomParams;

/* JADX INFO: loaded from: classes4.dex */
public class eft extends eas {

    /* JADX INFO: renamed from: a */
    public rwl f93821a;

    public eft(rwl rwlVar) {
        this.f93821a = rwlVar;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: I0 */
    public void mo120102I0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo120102I0(mMLivePushType);
        fhw.m125605a(v2t.f182112b, xau.m209903m("onEnginePushStarting，rtcType:" + mMLivePushType));
        this.f93821a.mo171889l();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: K0 */
    public void mo120104K0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo120104K0(mMLivePushType);
        fhw.m125605a(v2t.f182112b, xau.m209903m("onEngineBufferStopped，rtcType:" + mMLivePushType));
        this.f93821a.mo171888V();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        if (i == -5801 && i2 == 2) {
            this.f93821a.mo171885J();
            return;
        }
        if (i == t3f.m189084b()) {
            this.f93821a.mo171886N0(i2);
        } else if (i == t3f.m189085c()) {
            this.f93821a.mo171891y(i2);
        } else if (i == t3f.m189083a()) {
            this.f93821a.mo171890s0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m120716S0(rwl rwlVar) {
        this.f93821a = rwlVar;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: w0 */
    public void mo120115w0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo120115w0(mMLivePushType);
        fhw.m125605a(v2t.f182112b, xau.m209903m("onEngineBufferStart，rtcType:" + mMLivePushType));
        this.f93821a.mo171887O();
    }
}
