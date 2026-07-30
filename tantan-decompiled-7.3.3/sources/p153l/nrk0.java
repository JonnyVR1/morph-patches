package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class nrk0 extends i6t<oo2, kuk0> {

    /* JADX INFO: renamed from: i */
    public itm0 f143416i;

    public nrk0(dum dumVar) {
        super(dumVar);
        mo52715C(new kuk0());
        this.f143416i = new itm0(dumVar.f90815a, this.lifecycleProviderImpl);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m164491J3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ Boolean m164496R3(String str) {
        return Boolean.valueOf(!((kuk0) this.viewModel).isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m164497U3(String str) {
        m164501T3(str);
        ((kuk0) this.viewModel).m151557n();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m164498O3() {
        ((kuk0) this.viewModel).m151555l();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m164499P3(BLiveVoiceCallSummary bLiveVoiceCallSummary) {
        ((kuk0) this.viewModel).m151556m(bLiveVoiceCallSummary);
    }

    /* JADX INFO: renamed from: S3 */
    public void m164500S3(String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        this.f143416i.m142066n0(((kuk0) this.viewModel).f128883h, str, bLiveVoiceBonusGifts, new x20() { // from class: l.mrk0
            @Override // p153l.x20
            public final void call() {
                this.f138390a.m164498O3();
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m164501T3(String str) {
        duringCreated(VCallApiProvider.callSummary(str)).subscribe(dhw.m115826e(new y20() { // from class: l.krk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128482a.m164499P3((BLiveVoiceCallSummary) obj);
            }
        }, new y20() { // from class: l.lrk0
            @Override // p153l.y20
            public final void call(Object obj) {
                nrk0.m164491J3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceCallEvent.openCallSummaryEvent().m199270g()).filter(new qcj() { // from class: l.irk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116581a.m164496R3((String) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.jrk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122392a.m164497U3((String) obj);
            }
        }));
    }
}
