package p153l;

import com.p051p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class zsu extends xgu<zsu> {

    /* JADX INFO: renamed from: f */
    public Map<String, p2e0> f205897f;

    public zsu(knu knuVar) {
        super(knuVar);
        this.f205897f = new HashMap();
        jyb.m147470A(SchemeActionType.values(), new y20() { // from class: l.ysu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201461a.m221366U2((SchemeActionType) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97927I2(m97928K2().SchemeHandleEvent.m70385a(), new y20() { // from class: l.xsu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196141a.m221365T2((aae0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m221365T2(aae0 aae0Var) {
        zit zitVar = new zit(aae0Var.f69125d);
        p2e0 p2e0Var = this.f205897f.get(zitVar.f112154a);
        if (p2e0Var == null) {
            o1j0.m165649w(R$string.f47639Ke);
            return;
        }
        nsh0.m164608j("[live][schema]", "liveRoomScheme:" + zitVar.f112155b);
        p2e0Var.mo131279a(zitVar, this, aae0Var.f69126e);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m221366U2(SchemeActionType schemeActionType) {
        this.f205897f.put(schemeActionType.getAction(), schemeActionType.getSchemaAction());
    }
}
