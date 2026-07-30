package p009l;

import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import java.util.ArrayList;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.h4t;
import l.hrv;
import l.nnn0;
import l.s25;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wdn0 extends h4t<nnn0, gfo0> {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceTopic f22023i;

    public wdn0(bsm bsmVar) {
        super(bsmVar);
        C(new gfo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m24073P3(Boolean bool) {
        if (this.f22023i != null) {
            this.f22023i = null;
        }
        ((gfo0) ((bwr) this).viewModel).m14990F(bool.booleanValue());
        m24081V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void m24074R3(BLiveVoiceRoom bLiveVoiceRoom) {
        E2().O2().o(bLiveVoiceRoom);
        ((gfo0) ((bwr) this).viewModel).m14990F(false);
    }

    /* JADX INFO: renamed from: O3 */
    public void m24076O3(String str) {
        BLiveVoiceRoom bLiveVoiceRoom = new BLiveVoiceRoom();
        ((BLiveAbsRoom) bLiveVoiceRoom).title = str;
        ArrayList arrayList = new ArrayList();
        bLiveVoiceRoom.topicIds = arrayList;
        bLiveVoiceRoom.fields = "topic,title";
        BLiveVoiceTopic bLiveVoiceTopic = this.f22023i;
        if (bLiveVoiceTopic != null) {
            arrayList.add(bLiveVoiceTopic.id);
        }
        duringCreated(hrv.I(E2().o(), bLiveVoiceRoom)).subscribe(ffw.e(new e30() { // from class: l.udn0
            public final void call(Object obj) {
                this.f21089a.m24074R3((BLiveVoiceRoom) obj);
            }
        }, new e30() { // from class: l.vdn0
            public final void call(Object obj) {
                s25.c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m24077S3(BLiveData bLiveData) {
        ((gfo0) ((bwr) this).viewModel).m14989E(bLiveData.topics, E2().O2().e(), bLiveData.needTitle);
    }

    /* JADX INFO: renamed from: T */
    public void m24078T() {
        super/*l.k4t*/.T();
        duringCreated((c) F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().g()).subscribe(ffw.d(new e30() { // from class: l.rdn0
            public final void call(Object obj) {
                this.f19770a.m24073P3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m24079T3(Throwable th) {
        ((gfo0) ((bwr) this).viewModel).m14989E(null, E2().O2().e(), true);
    }

    /* JADX INFO: renamed from: U3 */
    public void m24080U3(BLiveVoiceTopic bLiveVoiceTopic) {
        this.f22023i = bLiveVoiceTopic;
    }

    /* JADX INFO: renamed from: V3 */
    public final void m24081V3() {
        duringCreated(hrv.C()).subscribe(ffw.e(new e30() { // from class: l.sdn0
            public final void call(Object obj) {
                this.f20190a.m24077S3((BLiveData) obj);
            }
        }, new e30() { // from class: l.tdn0
            public final void call(Object obj) {
                this.f20625a.m24079T3((Throwable) obj);
            }
        }));
    }
}
