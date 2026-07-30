package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class wdn0 extends h4t<nnn0, gfo0> {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceTopic f185813i;

    public wdn0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new gfo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m202752P3(Boolean bool) {
        if (this.f185813i != null) {
            this.f185813i = null;
        }
        ((gfo0) this.viewModel).m125917F(bool.booleanValue());
        m202759V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void m202753R3(BLiveVoiceRoom bLiveVoiceRoom) {
        ((nnn0) m206027E2()).m160247O2().mo165472o(bLiveVoiceRoom);
        ((gfo0) this.viewModel).m125917F(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m202755O3(String str) {
        BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        bLiveVoiceRoom.title = str;
        ArrayList arrayList = new ArrayList();
        bLiveVoiceRoom.topicIds = arrayList;
        bLiveVoiceRoom.fields = "topic,title";
        BLiveVoiceTopic bLiveVoiceTopic = this.f185813i;
        if (bLiveVoiceTopic != null) {
            arrayList.add(bLiveVoiceTopic.f44514id);
        }
        duringCreated(hrv.m132726I(((nnn0) m206027E2()).m149818o(), bLiveVoiceRoom)).subscribe(ffw.m121194e(new e30() { // from class: l.udn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175936a.m202753R3((BLiveVoiceRoom) obj);
            }
        }, new e30() { // from class: l.vdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                s25.m182058c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m202756S3(BLiveData bLiveData) {
        ((gfo0) this.viewModel).m125916E(bLiveData.topics, ((nnn0) m206027E2()).m160247O2().mo165469j(), bLiveData.needTitle);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158952a.m202752P3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m202757T3(Throwable th) {
        ((gfo0) this.viewModel).m125916E(null, ((nnn0) m206027E2()).m160247O2().mo165469j(), true);
    }

    /* JADX INFO: renamed from: U3 */
    public void m202758U3(BLiveVoiceTopic bLiveVoiceTopic) {
        this.f185813i = bLiveVoiceTopic;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m202759V3() {
        duringCreated(hrv.m132720C()).subscribe(ffw.m121194e(new e30() { // from class: l.sdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163862a.m202756S3((BLiveData) obj);
            }
        }, new e30() { // from class: l.tdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169575a.m202757T3((Throwable) obj);
            }
        }));
    }
}
