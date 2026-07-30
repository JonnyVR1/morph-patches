package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class hik0 extends h4t<ho2, elk0> {

    /* JADX INFO: renamed from: i */
    public ekm0 f107933i;

    public hik0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new elk0());
        this.f107933i = new ekm0(bsmVar.f77095a, this.lifecycleProviderImpl);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m131261J3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ Boolean m131266R3(String str) {
        return Boolean.valueOf(!((elk0) this.viewModel).isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m131267U3(String str) {
        m131271T3(str);
        ((elk0) this.viewModel).m117137n();
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m131268O3() {
        ((elk0) this.viewModel).m117135l();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m131269P3(BLiveVoiceCallSummary bLiveVoiceCallSummary) {
        ((elk0) this.viewModel).m117136m(bLiveVoiceCallSummary);
    }

    /* JADX INFO: renamed from: S3 */
    public void m131270S3(String str, BLiveVoiceBonusGifts bLiveVoiceBonusGifts) {
        this.f107933i.m116986n0(((elk0) this.viewModel).f92113h, str, bLiveVoiceBonusGifts, new d30() { // from class: l.gik0
            @Override // p149l.d30
            public final void call() {
                this.f102934a.m131268O3();
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public void m131271T3(String str) {
        duringCreated(VCallApiProvider.callSummary(str)).subscribe(ffw.m121194e(new e30() { // from class: l.eik0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91612a.m131269P3((BLiveVoiceCallSummary) obj);
            }
        }, new e30() { // from class: l.fik0
            @Override // p149l.e30
            public final void call(Object obj) {
                hik0.m131261J3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceCallEvent.openCallSummaryEvent().m172460g()).filter(new w9j() { // from class: l.cik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81098a.m131266R3((String) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.dik0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86395a.m131267U3((String) obj);
            }
        }));
    }
}
