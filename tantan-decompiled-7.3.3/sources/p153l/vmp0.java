package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class vmp0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public boolean f184748i;

    public vmp0(dum dumVar) {
        super(dumVar);
        this.f184748i = true;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m201765K3(BLiveVoiceCall bLiveVoiceCall) {
        m201766L3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m201766L3() {
        this.f184748i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m201767M3(BLiveCallVolume bLiveCallVolume) {
        ConcurrentHashMap<String, Float> concurrentHashMap = bLiveCallVolume.volumes;
        if (this.f184748i && guk0.m132327f(((rwn0) m213810E2()).m183423Y2()) && concurrentHashMap.containsKey(zrv.f205799a.m207631D0()) && ((rwn0) m213810E2()).m168532l0() != null) {
            this.f184748i = false;
            afu.m97553b(((rwn0) m213810E2()).m168532l0().f56859id, ((rwn0) m213810E2()).m202191k());
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m201766L3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183424Z2()).filter(new esn0()).subscribe(dhw.m115825d(new y20() { // from class: l.ump0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179664a.m201765K3((BLiveVoiceCall) obj);
            }
        }));
    }
}
