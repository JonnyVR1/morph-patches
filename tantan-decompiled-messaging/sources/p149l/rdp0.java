package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class rdp0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public boolean f158962i;

    public rdp0(bsm bsmVar) {
        super(bsmVar);
        this.f158962i = true;
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m178997K3(BLiveVoiceCall bLiveVoiceCall) {
        m178998L3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m178998L3() {
        this.f158962i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m178999M3(BLiveCallVolume bLiveCallVolume) {
        ConcurrentHashMap<String, Float> concurrentHashMap = bLiveCallVolume.volumes;
        if (this.f158962i && alk0.m97307f(((nnn0) m206027E2()).m160261Y2()) && concurrentHashMap.containsKey(ypv.f199493a.m199309D0()) && ((nnn0) m206027E2()).m132146l0() != null) {
            this.f158962i = false;
            zcu.m218087b(((nnn0) m206027E2()).m132146l0().f56011id, ((nnn0) m206027E2()).m149814k());
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m178998L3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160262Z2()).filter(new ajn0()).subscribe(ffw.m121193d(new e30() { // from class: l.qdp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153948a.m178997K3((BLiveVoiceCall) obj);
            }
        }));
    }
}
