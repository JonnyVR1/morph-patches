package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveUserRightResource;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class wtm0 extends eom0<fhm0> {

    /* JADX INFO: renamed from: l */
    public long f188030l;

    public wtm0(bsm bsmVar, c8m c8mVar) {
        super(bsmVar, c8mVar);
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ List m205545M4(List list, bik0.C15867a c15867a) {
        return list;
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m205546N4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            s25.m182058c(th);
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m205547O4(BLiveVoiceCall bLiveVoiceCall) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public void m205549S4(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        V v2 = this.viewModel;
        if (iM137794a == 4) {
            ((c8m) v2).setVisible(false);
        } else {
            ((c8m) v2).setVisible(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.eom0
    /* JADX INFO: renamed from: A4 */
    public void mo117393A4(Integer num) {
        if (!m205550Q4()) {
            lsi0.m151595y(w8u.m202217t(R$string.f47638xj));
            return;
        }
        this.f188030l = mqi0.m155944o();
        rsm0.m180696d();
        BLiveVoiceCall bLiveVoiceCallM102063l = ((fhm0) m206027E2()).m160249P2().m102063l(ypv.f199493a.m199309D0());
        if (bLiveVoiceCallM102063l != null) {
            m205551R4(bLiveVoiceCallM102063l.f44485id, num.intValue());
            return;
        }
        xpm0 xpm0Var = new xpm0();
        xpm0Var.m210513g(num.intValue());
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(xpm0Var);
    }

    /* JADX INFO: renamed from: Q4 */
    public final boolean m205550Q4() {
        return mqi0.m155944o() - this.f188030l >= 500;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m205551R4(String str, int i) {
        duringCreated(VCallApiProvider.requestChangeCallPosition(str, i)).subscribe(ffw.m121194e(new e30() { // from class: l.utm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wtm0.m205547O4((BLiveVoiceCall) obj);
            }
        }, new e30() { // from class: l.vtm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wtm0.m205546N4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m205552T4(BLiveUserRightResource bLiveUserRightResource) {
        m117396D4(bLiveUserRightResource.userId, bLiveUserRightResource.avatarConfig.connectorImage);
    }

    /* JADX INFO: renamed from: U4 */
    public final void m205553U4(List<BLiveUserRightResource> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.ttm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172036a.m205552T4((BLiveUserRightResource) obj);
            }
        });
    }

    @Override // p149l.eom0
    /* JADX INFO: renamed from: m4 */
    public void mo117406m4(bik0.C15867a c15867a) {
        super.mo117406m4(c15867a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.eom0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.ptm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151184a.m205549S4((iqv) obj);
            }
        }));
        duringCreated(C22306c.zip(VCallApiProvider.getEnterRoomEffect(((fhm0) m206027E2()).m149818o(), ((fhm0) m206027E2()).m149814k()), ((fhm0) m206027E2()).m160251Q2().filter(new w9j() { // from class: l.qtm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((bik0.C15867a) obj).f75773b == 1);
            }
        }), new x9j() { // from class: l.rtm0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return wtm0.m205545M4((List) obj, (bik0.C15867a) obj2);
            }
        })).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.stm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166375a.m205553U4((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.eom0
    /* JADX INFO: renamed from: z4 */
    public void mo117418z4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        String str = ((fhm0) m206027E2()).m132146l0().f56011id;
        i54 i54Var = mqvVar.f135304a;
        if (NullChecker.m81303a(i54Var)) {
            u4n0.m191752k(this, str, i54Var.f111520a);
        }
    }
}
