package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ann0 extends i6t<rwn0, koo0> {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceTopic f72368i;

    public ann0(dum dumVar) {
        super(dumVar);
        mo52715C(new koo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m99010P3(Boolean bool) {
        if (this.f72368i != null) {
            this.f72368i = null;
        }
        ((koo0) this.viewModel).m150666F(bool.booleanValue());
        m99017V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void m99011R3(BLiveVoiceRoom bLiveVoiceRoom) {
        ((rwn0) m213810E2()).m183409O2().mo122894o(bLiveVoiceRoom);
        ((koo0) this.viewModel).m150666F(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public void m99013O3(String str) {
        BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        bLiveVoiceRoom.title = str;
        ArrayList arrayList = new ArrayList();
        bLiveVoiceRoom.topicIds = arrayList;
        bLiveVoiceRoom.fields = "topic,title";
        BLiveVoiceTopic bLiveVoiceTopic = this.f72368i;
        if (bLiveVoiceTopic != null) {
            arrayList.add(bLiveVoiceTopic.f45362id);
        }
        duringCreated(itv.m142085I(((rwn0) m213810E2()).m202194o(), bLiveVoiceRoom)).subscribe(dhw.m115826e(new y20() { // from class: l.ymn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200684a.m99011R3((BLiveVoiceRoom) obj);
            }
        }, new y20() { // from class: l.zmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                r35.m179578c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m99014S3(BLiveData bLiveData) {
        ((koo0) this.viewModel).m150665E(bLiveData.topics, ((rwn0) m213810E2()).m183409O2().mo122891j(), bLiveData.needTitle);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184742a.m99010P3((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m99015T3(Throwable th) {
        ((koo0) this.viewModel).m150665E(null, ((rwn0) m213810E2()).m183409O2().mo122891j(), true);
    }

    /* JADX INFO: renamed from: U3 */
    public void m99016U3(BLiveVoiceTopic bLiveVoiceTopic) {
        this.f72368i = bLiveVoiceTopic;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m99017V3() {
        duringCreated(itv.m142079C()).subscribe(dhw.m115826e(new y20() { // from class: l.wmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189812a.m99014S3((BLiveData) obj);
            }
        }, new y20() { // from class: l.xmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195107a.m99015T3((Throwable) obj);
            }
        }));
    }
}
