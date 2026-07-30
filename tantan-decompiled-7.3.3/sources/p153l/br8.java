package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class br8 extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f77990R;

    public br8(C4883c c4883c) {
        super(c4883c);
        this.f77990R = new jxd0("is_fake_avatar_query_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ uxj0 m106087d3(Envelope envelope) {
        this.f77990R.put(Boolean.TRUE);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ C22421c m106088e3() {
        return qi20.m176654a(new pcj() { // from class: l.zq8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/monetization/strategy/configuration?method=showChangeAvatar")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
            }
        }).map(new qcj() { // from class: l.ar8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72918a.m106087d3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public void m106089f3() {
        if (this.f77990R.get().booleanValue()) {
            return;
        }
        this.f91137Q.scheduled("tryStartFakeAvatar", -1, new pcj() { // from class: l.yq8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201157a.m106088e3();
            }
        });
    }
}
