package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.Envelope;
import l.hpd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wp8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f25275R;

    public wp8(C0158c c0158c) {
        super(c0158c);
        this.f25275R = new hpd0("is_fake_avatar_query_" + CoreModule.m1850H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ roj0 m26578d3(Envelope envelope) {
        this.f25275R.put(Boolean.TRUE);
        return roj0.a;
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ c m26579e3() {
        return ia20.m16567a(new v9j() { // from class: l.up8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/monetization/strategy/configuration?method=showChangeAvatar")).l(utc0.create(Network.JSON, "")).b();
            }
        }).map(new w9j() { // from class: l.vp8
            public final Object call(Object obj) {
                return this.f24407a.m26578d3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public void m26580f3() {
        if (((Boolean) this.f25275R.get()).booleanValue()) {
            return;
        }
        this.f8580Q.scheduled("tryStartFakeAvatar", -1, new v9j() { // from class: l.tp8
            public final Object call() {
                return this.f22227a.m26579e3();
            }
        });
    }
}
