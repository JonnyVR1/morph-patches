package p149l;

import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c2e0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public Map<String, kud0> f78353i;

    public c2e0(bsm bsmVar) {
        super(bsmVar);
        this.f78353i = new HashMap();
        vwb.m200287A(SchemeActionType.values(), new e30() { // from class: l.y1e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195404a.m104915S3((SchemeActionType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public void m104911N3(String str, x1e0.C21019b c21019b) {
        ygt ygtVar = new ygt(str);
        kud0 kud0Var = this.f78353i.get(ygtVar.f104769a);
        gkh0.m126627j("[live][schema]", "liveRoomScheme action:" + ygtVar.f104769a + ", str=" + str);
        if (kud0Var == null) {
            lsi0.m151593w(R$string.f46791Ke);
            return;
        }
        gkh0.m126627j("[live][schema]", "liveRoomScheme:" + ygtVar.f104770b);
        kud0Var.mo95830a(ygtVar, this, c21019b);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m104912O3(x1e0 x1e0Var) {
        m104911N3(x1e0Var.f189062d, x1e0Var.f189063e);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m104913P3(LiveSchemePopupMessage liveSchemePopupMessage) {
        m104911N3(liveSchemePopupMessage.getScheme(), null);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m104914R3(final LiveSchemePopupMessage liveSchemePopupMessage) {
        if (liveSchemePopupMessage.getDelay() <= 0) {
            m104911N3(liveSchemePopupMessage.getScheme(), null);
            return;
        }
        m129293B3(liveSchemePopupMessage.getDelay(), TimeUnit.SECONDS, new Runnable() { // from class: l.b2e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72689a.m104913P3(liveSchemePopupMessage);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m104915S3(SchemeActionType schemeActionType) {
        this.f78353i.put(schemeActionType.getAction(), schemeActionType.getSchemaAction());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().SchemeHandleEvent.handleScheme(), new e30() { // from class: l.z1e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201070a.m104912O3((x1e0) obj);
            }
        });
        duringCreated(m206027E2().m132160q1().m189087a0()).subscribe(ffw.m121193d(new e30() { // from class: l.a2e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67253a.m104914R3((LiveSchemePopupMessage) obj);
            }
        }));
    }
}
