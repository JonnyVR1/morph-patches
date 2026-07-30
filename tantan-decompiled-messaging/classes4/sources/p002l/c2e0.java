package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.gkh0;
import l.gwr;
import l.lsi0;
import l.vwb;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c2e0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public Map<String, kud0> f8467i;

    public c2e0(bsm bsmVar) {
        super(bsmVar);
        this.f8467i = new HashMap();
        vwb.A(SchemeActionType.values(), new e30() { // from class: l.y1e0
            public final void call(Object obj) {
                this.f22607a.m10742S3((SchemeActionType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public void m10738N3(String str, x1e0.C0892b c0892b) {
        ygt ygtVar = new ygt(str);
        kud0 kud0Var = this.f8467i.get(((gwr) ygtVar).a);
        gkh0.j("[live][schema]", "liveRoomScheme action:" + ((gwr) ygtVar).a + ", str=" + str);
        if (kud0Var == null) {
            lsi0.w(R$string.f2833Ke);
            return;
        }
        gkh0.j("[live][schema]", "liveRoomScheme:" + ((gwr) ygtVar).b);
        kud0Var.mo9496a(ygtVar, this, c0892b);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m10739O3(x1e0 x1e0Var) {
        m10738N3(x1e0Var.f22077d, x1e0Var.f22078e);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m10740P3(LiveSchemePopupMessage liveSchemePopupMessage) {
        m10738N3(liveSchemePopupMessage.getScheme(), null);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m10741R3(final LiveSchemePopupMessage liveSchemePopupMessage) {
        if (liveSchemePopupMessage.getDelay() <= 0) {
            m10738N3(liveSchemePopupMessage.getScheme(), null);
            return;
        }
        m14180B3(liveSchemePopupMessage.getDelay(), TimeUnit.SECONDS, new Runnable() { // from class: l.b2e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7968a.m10740P3(liveSchemePopupMessage);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m10742S3(SchemeActionType schemeActionType) {
        this.f8467i.put(schemeActionType.getAction(), schemeActionType.getSchemaAction());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m10743T() {
        super.T();
        m14191h3(m25548F2().SchemeHandleEvent.handleScheme(), new e30() { // from class: l.z1e0
            public final void call(Object obj) {
                this.f23180a.m10739O3((x1e0) obj);
            }
        });
        duringCreated(m25547E2().m14596q1().a0()).subscribe(ffw.d(new e30() { // from class: l.a2e0
            public final void call(Object obj) {
                this.f7353a.m10741R3((LiveSchemePopupMessage) obj);
            }
        }));
    }
}
