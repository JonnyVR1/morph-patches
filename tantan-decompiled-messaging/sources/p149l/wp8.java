package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class wp8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f187494R;

    public wp8(C4732c c4732c) {
        super(c4732c);
        this.f187494R = new hpd0("is_fake_avatar_query_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ roj0 m204900d3(Envelope envelope) {
        this.f187494R.put(Boolean.TRUE);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ C22306c m204901e3() {
        return ia20.m135117a(new v9j() { // from class: l.up8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/monetization/strategy/configuration?method=showChangeAvatar")).m185893l(utc0.create(Network.JSON, "")).m185883b();
            }
        }).map(new w9j() { // from class: l.vp8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182458a.m204900d3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public void m204902f3() {
        if (this.f187494R.get().booleanValue()) {
            return;
        }
        this.f72126Q.scheduled("tryStartFakeAvatar", -1, new v9j() { // from class: l.tp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171450a.m204901e3();
            }
        });
    }
}
