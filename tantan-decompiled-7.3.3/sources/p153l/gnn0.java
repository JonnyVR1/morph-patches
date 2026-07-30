package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class gnn0 extends qct<rwn0> {
    public gnn0(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m130904O3(ugd0 ugd0Var) {
        ((rwn0) m213810E2()).mo168476S(ugd0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m130905P3(Object obj) {
        m130907S3();
    }

    /* JADX INFO: renamed from: R3 */
    public final C22421c<Object> m130906R3() {
        return C22421c.merge(m138865k3(), lifecycle().filter(new qcj() { // from class: l.fnn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m130907S3() {
        duringCreated(VoiceRoomApiProvider.getLiveInfo(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.dnn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89817a.m130904O3((ugd0) obj);
            }
        }, new y20() { // from class: l.enn0
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("[voiceInfoRefresh]", "change data error " + ((Throwable) obj).getMessage());
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(new pcj() { // from class: l.bnn0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f77565a.m130906R3();
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.cnn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82737a.m130905P3(obj);
            }
        }));
    }
}
