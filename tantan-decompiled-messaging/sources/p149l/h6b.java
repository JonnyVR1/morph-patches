package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class h6b extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f106013R;

    public h6b(C4732c c4732c) {
        super(c4732c);
        this.f106013R = new hpd0("showTantanVerificationRedDot", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ roj0 m129478b3(Envelope envelope) {
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ C22306c m129479c3(final String str) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, "");
        return new la20(new v9j() { // from class: l.f6b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31350s2(CoreModule.m29931H().userId(), str)).m185893l(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.g6b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h6b.m129478b3((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<roj0> m129480d3(final String str) {
        return this.f72126Q.scheduled("cancel_tantan_id_card_info", -1, new v9j() { // from class: l.e6b
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h6b.m129479c3(str);
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public C22306c<Boolean> m129481e3() {
        return this.f106013R.obs();
    }

    /* JADX INFO: renamed from: f3 */
    public void m129482f3(boolean z) {
        this.f106013R.put(Boolean.valueOf(z));
    }
}
