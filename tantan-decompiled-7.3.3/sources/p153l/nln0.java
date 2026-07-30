package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class nln0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceGrabHatGame f142574i;

    public nln0(dum<? extends rwn0> dumVar, VoiceGrabHatFloatViewMode voiceGrabHatFloatViewMode) {
        super(dumVar);
        m153103z2(new a9k(dumVar));
        m153103z2(new l8k(dumVar, this));
        m153103z2(new w8k(dumVar, voiceGrabHatFloatViewMode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final C22421c<BLiveVoiceGrabHatGame> m163760L3() {
        return eln0.m121250h(((rwn0) m213810E2()).m202191k());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ BLiveVoiceGrabHatGame m163761M3(x8k x8kVar) {
        return this.f142574i;
    }

    /* JADX INFO: renamed from: N3 */
    public void m163762N3(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        if (bLiveVoiceGrabHatGame != null && !TextUtils.isEmpty(bLiveVoiceGrabHatGame.toast)) {
            o1j0.m165651y(bLiveVoiceGrabHatGame.toast);
        }
        m163763O3(bLiveVoiceGrabHatGame);
        if (this.f142574i == null && bLiveVoiceGrabHatGame == null) {
            return;
        }
        m213811F2().VoiceGrabHatEvent.gameInfo().mo199273j(bLiveVoiceGrabHatGame);
        this.f142574i = bLiveVoiceGrabHatGame;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m163763O3(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame2 = this.f142574i;
        if (bLiveVoiceGrabHatGame2 == null || bLiveVoiceGrabHatGame == null || !TextUtils.equals(bLiveVoiceGrabHatGame.f45348id, bLiveVoiceGrabHatGame2.f45348id) || !TextUtils.equals(this.f142574i.status, bLiveVoiceGrabHatGame.status)) {
            if (bLiveVoiceGrabHatGame == null && this.f142574i == null) {
                return;
            }
            boolean zM126164c = fln0.m126164c(bLiveVoiceGrabHatGame);
            StringBuilder sb = new StringBuilder("postGameState:");
            sb.append(bLiveVoiceGrabHatGame == null ? "null" : bLiveVoiceGrabHatGame.status);
            fhw.m125605a("grabHat", sb.toString());
            m213811F2().VoiceGrabHatEvent.openGrabHatGame().mo199273j(Boolean.valueOf(zM126164c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m163760L3()).subscribe(dhw.m115829h(new y20() { // from class: l.kln0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127399a.m163762N3((BLiveVoiceGrabHatGame) obj);
            }
        }));
        m138853C3(new pcj() { // from class: l.lln0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f132580a.m163760L3();
            }
        }, new y20() { // from class: l.kln0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127399a.m163762N3((BLiveVoiceGrabHatGame) obj);
            }
        });
        m138854D3(10, new pcj() { // from class: l.lln0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f132580a.m163760L3();
            }
        }, new y20() { // from class: l.kln0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127399a.m163762N3((BLiveVoiceGrabHatGame) obj);
            }
        });
        m138860d3(x8k.class, new qcj() { // from class: l.mln0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f137429a.m163761M3((x8k) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m168545q1().m98304m()).subscribe(dhw.m115829h(new y20() { // from class: l.kln0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127399a.m163762N3((BLiveVoiceGrabHatGame) obj);
            }
        }));
    }
}
