package p153l;

import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class gae0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public Map<String, o2e0> f102978i;

    public gae0(dum dumVar) {
        super(dumVar);
        this.f102978i = new HashMap();
        jyb.m147470A(SchemeActionType.values(), new y20() { // from class: l.cae0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80583a.m129705S3((SchemeActionType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public void m129701N3(String str, bae0.C15954b c15954b) {
        zit zitVar = new zit(str);
        o2e0 o2e0Var = this.f102978i.get(zitVar.f112154a);
        nsh0.m164608j("[live][schema]", "liveRoomScheme action:" + zitVar.f112154a + ", str=" + str);
        if (o2e0Var == null) {
            o1j0.m165649w(R$string.f47639Ke);
            return;
        }
        nsh0.m164608j("[live][schema]", "liveRoomScheme:" + zitVar.f112155b);
        o2e0Var.mo97254a(zitVar, this, c15954b);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m129702O3(bae0 bae0Var) {
        m129701N3(bae0Var.f75679d, bae0Var.f75680e);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m129703P3(LiveSchemePopupMessage liveSchemePopupMessage) {
        m129701N3(liveSchemePopupMessage.getScheme(), null);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m129704R3(final LiveSchemePopupMessage liveSchemePopupMessage) {
        if (liveSchemePopupMessage.getDelay() <= 0) {
            m129701N3(liveSchemePopupMessage.getScheme(), null);
            return;
        }
        m138852B3(liveSchemePopupMessage.getDelay(), TimeUnit.SECONDS, new Runnable() { // from class: l.fae0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97977a.m129703P3(liveSchemePopupMessage);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m129705S3(SchemeActionType schemeActionType) {
        this.f102978i.put(schemeActionType.getAction(), schemeActionType.getSchemaAction());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().SchemeHandleEvent.handleScheme(), new y20() { // from class: l.dae0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85868a.m129702O3((bae0) obj);
            }
        });
        duringCreated(m213810E2().m168545q1().m98269a0()).subscribe(dhw.m115825d(new y20() { // from class: l.eae0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92778a.m129704R3((LiveSchemePopupMessage) obj);
            }
        }));
    }
}
