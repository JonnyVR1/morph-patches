package p149l;

import com.p046p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class yqu extends weu<yqu> {

    /* JADX INFO: renamed from: f */
    public Map<String, lud0> f199616f;

    public yqu(jlu jluVar) {
        super(jluVar);
        this.f199616f = new HashMap();
        vwb.m200287A(SchemeActionType.values(), new e30() { // from class: l.xqu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194047a.m215764U2((SchemeActionType) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218410I2(m218411K2().SchemeHandleEvent.m69202a(), new e30() { // from class: l.wqu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187731a.m215763T2((w1e0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public void m215763T2(w1e0 w1e0Var) {
        ygt ygtVar = new ygt(w1e0Var.f183993d);
        lud0 lud0Var = this.f199616f.get(ygtVar.f104769a);
        if (lud0Var == null) {
            lsi0.m151593w(R$string.f46791Ke);
            return;
        }
        gkh0.m126627j("[live][schema]", "liveRoomScheme:" + ygtVar.f104770b);
        lud0Var.mo113728a(ygtVar, this, w1e0Var.f183994e);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m215764U2(SchemeActionType schemeActionType) {
        this.f199616f.put(schemeActionType.getAction(), schemeActionType.getSchemaAction());
    }
}
