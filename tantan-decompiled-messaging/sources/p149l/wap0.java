package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class wap0 extends h4t<nnn0, qap0> {
    public wap0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new qap0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m202454O3(String str) {
        final BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        bLiveVoiceRoom.title = str;
        bLiveVoiceRoom.addField("title,topic");
        if (((nnn0) m206027E2()).mo149817n() != null && !((nnn0) m206027E2()).mo149817n().topics.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((nnn0) m206027E2()).mo149817n().topics.get(0).f44514id);
            bLiveVoiceRoom.topicIds = arrayList;
        }
        act().progress("");
        AntiSpamHelper.m80268c(this.f188513f, str, DetectCategoryType.get(DetectCategoryType.voice_room_name), AuthenticationTokenClaims.JSON_KEY_NAME, mo77274R2(), new d30() { // from class: l.sap0
            @Override // p149l.d30
            public final void call() {
                this.f163426a.m202458T3(bLiveVoiceRoom);
            }
        }, new d30() { // from class: l.tap0
            @Override // p149l.d30
            public final void call() {
                this.f169175a.m202459U3();
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m202455P3(ifo0 ifo0Var) {
        ((qap0) this.viewModel).m173769z(ifo0Var);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m202456R3(BLiveVoiceRoom bLiveVoiceRoom) {
        act().progressDismiss();
        m202460V3(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m202457S3(Throwable th) {
        act().progressDismiss();
        s25.m182058c(th);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceTopicEvent.showVoiceVirtualEditTitleDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.rap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158547a.m202455P3((ifo0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m202458T3(BLiveVoiceRoom bLiveVoiceRoom) {
        duringCreated(hrv.m132726I(((nnn0) m206027E2()).m149818o(), bLiveVoiceRoom)).subscribe(ffw.m121194e(new e30() { // from class: l.uap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175625a.m202456R3((BLiveVoiceRoom) obj);
            }
        }, new e30() { // from class: l.vap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180775a.m202457S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m202459U3() {
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final void m202460V3(BLiveVoiceRoom bLiveVoiceRoom) {
        ((nnn0) m206027E2()).m160247O2().mo165472o(bLiveVoiceRoom);
        m206028F2().VirtualRoomInfoEvent.updateRoomInfoDialogTitle().mo172463j(bLiveVoiceRoom.title);
        ((qap0) this.viewModel).m173768y();
    }
}
