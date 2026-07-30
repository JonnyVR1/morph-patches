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
public class h6b extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f13682R;

    public h6b(C0158c c0158c) {
        super(c0158c);
        this.f13682R = new hpd0("showTantanVerificationRedDot", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ roj0 m16057b3(Envelope envelope) {
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
        CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
        return roj0.a;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ c m16058c3(final String str) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, "");
        return new la20(new v9j() { // from class: l.f6b
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3280s2(CoreModule.m1850H().userId(), str)).l(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.g6b
            public final Object call(Object obj) {
                return h6b.m16057b3((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: d3 */
    public c<roj0> m16059d3(final String str) {
        return this.f8580Q.scheduled("cancel_tantan_id_card_info", -1, new v9j() { // from class: l.e6b
            public final Object call() {
                return h6b.m16058c3(str);
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public c<Boolean> m16060e3() {
        return this.f13682R.obs();
    }

    /* JADX INFO: renamed from: f3 */
    public void m16061f3(boolean z) {
        this.f13682R.put(Boolean.valueOf(z));
    }
}
