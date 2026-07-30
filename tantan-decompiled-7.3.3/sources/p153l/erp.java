package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class erp extends i6t<rwn0, hrp> {
    public erp(dum<? extends rwn0> dumVar, hrp hrpVar) {
        super(dumVar);
        mo52715C(hrpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m122236M3(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        duringCreated(qbo.m176065i(((rwn0) m213810E2()).m202194o(), bLiveVoiceBackGroundPics.f45331id)).subscribe(dhw.m115826e(new y20() { // from class: l.crp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83348a.m122237N3(bLiveVoiceBackGroundPics, (BLiveVoiceRoom) obj);
            }
        }, new y20() { // from class: l.drp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90407a.m122238O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m122237N3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, BLiveVoiceRoom bLiveVoiceRoom) {
        ((hrp) this.viewModel).m136918i(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m122238O3(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43140) {
            m122240R3();
        }
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m122239P3(List list) {
        ((hrp) this.viewModel).m136917f(list);
    }

    /* JADX INFO: renamed from: R3 */
    public void m122240R3() {
        duringCreated(qbo.m176063g()).subscribe(dhw.m115826e(new y20() { // from class: l.brp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78042a.m122239P3((List) obj);
            }
        }, new r5k()));
    }
}
